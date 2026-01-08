// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListDmAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListDmAccountResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>xis-sx***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListDmAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDmAccountResponseBody self = new ListDmAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDmAccountResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListDmAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDmAccountResponseBody setData(java.util.List<ListDmAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDmAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListDmAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDmAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDmAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDmAccountResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDmAccountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:send1@xx.xx.asia">send1@xx.xx.asia</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>1743579634000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:a@b.com">a@b.com</a></p>
         */
        @NameInMap("MailAddressId")
        public String mailAddressId;

        /**
         * <strong>example:</strong>
         * <p>trigger</p>
         */
        @NameInMap("Sendtype")
        public String sendtype;

        public static ListDmAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDmAccountResponseBodyData self = new ListDmAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDmAccountResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListDmAccountResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDmAccountResponseBodyData setMailAddressId(String mailAddressId) {
            this.mailAddressId = mailAddressId;
            return this;
        }
        public String getMailAddressId() {
            return this.mailAddressId;
        }

        public ListDmAccountResponseBodyData setSendtype(String sendtype) {
            this.sendtype = sendtype;
            return this;
        }
        public String getSendtype() {
            return this.sendtype;
        }

    }

}
