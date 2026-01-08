// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindInstagramPageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BindInstagramPageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>fdsfdsf-22fk***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindInstagramPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindInstagramPageResponseBody self = new BindInstagramPageResponseBody();
        return TeaModel.build(map, self);
    }

    public BindInstagramPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindInstagramPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindInstagramPageResponseBody setData(java.util.List<BindInstagramPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BindInstagramPageResponseBodyData> getData() {
        return this.data;
    }

    public BindInstagramPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindInstagramPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindInstagramPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindInstagramPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13243543543</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>1234322333</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>iwhalecloud</p>
         */
        @NameInMap("PageName")
        public String pageName;

        public static BindInstagramPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindInstagramPageResponseBodyData self = new BindInstagramPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindInstagramPageResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public BindInstagramPageResponseBodyData setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public BindInstagramPageResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public BindInstagramPageResponseBodyData setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

    }

}
