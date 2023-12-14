// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUsersByProdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUsersByProdResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUsersByProdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByProdResponseBody self = new ListUsersByProdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersByProdResponseBody setData(java.util.List<ListUsersByProdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersByProdResponseBodyData> getData() {
        return this.data;
    }

    public ListUsersByProdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersByProdResponseBodyData extends TeaModel {
        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("LogMdsCode")
        public String logMdsCode;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        @NameInMap("SourceLogName")
        public String sourceLogName;

        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        @NameInMap("SubUserId")
        public Long subUserId;

        @NameInMap("SubUserName")
        public String subUserName;

        public static ListUsersByProdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersByProdResponseBodyData self = new ListUsersByProdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersByProdResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListUsersByProdResponseBodyData setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public ListUsersByProdResponseBodyData setLogMdsCode(String logMdsCode) {
            this.logMdsCode = logMdsCode;
            return this;
        }
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        public ListUsersByProdResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListUsersByProdResponseBodyData setSourceLogCode(String sourceLogCode) {
            this.sourceLogCode = sourceLogCode;
            return this;
        }
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        public ListUsersByProdResponseBodyData setSourceLogName(String sourceLogName) {
            this.sourceLogName = sourceLogName;
            return this;
        }
        public String getSourceLogName() {
            return this.sourceLogName;
        }

        public ListUsersByProdResponseBodyData setSourceProdCode(String sourceProdCode) {
            this.sourceProdCode = sourceProdCode;
            return this;
        }
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        public ListUsersByProdResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListUsersByProdResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
