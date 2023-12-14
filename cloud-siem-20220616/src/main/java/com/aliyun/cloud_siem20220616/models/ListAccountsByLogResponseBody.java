// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAccountsByLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAccountsByLogResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountsByLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsByLogResponseBody self = new ListAccountsByLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsByLogResponseBody setData(java.util.List<ListAccountsByLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccountsByLogResponseBodyData> getData() {
        return this.data;
    }

    public ListAccountsByLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccountsByLogResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("Imported")
        public Integer imported;

        @NameInMap("LogCode")
        public String logCode;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("SubUserId")
        public Long subUserId;

        public static ListAccountsByLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsByLogResponseBodyData self = new ListAccountsByLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccountsByLogResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountsByLogResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAccountsByLogResponseBodyData setImported(Integer imported) {
            this.imported = imported;
            return this;
        }
        public Integer getImported() {
            return this.imported;
        }

        public ListAccountsByLogResponseBodyData setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public ListAccountsByLogResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListAccountsByLogResponseBodyData setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public ListAccountsByLogResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

}
