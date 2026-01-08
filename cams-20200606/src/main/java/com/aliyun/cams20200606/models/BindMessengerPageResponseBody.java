// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindMessengerPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<BindMessengerPageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DSFDS-8FSDFS**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindMessengerPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindMessengerPageResponseBody self = new BindMessengerPageResponseBody();
        return TeaModel.build(map, self);
    }

    public BindMessengerPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindMessengerPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindMessengerPageResponseBody setData(java.util.List<BindMessengerPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BindMessengerPageResponseBodyData> getData() {
        return this.data;
    }

    public BindMessengerPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindMessengerPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindMessengerPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindMessengerPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CONNECTED</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>1654543543543</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>iwhalecloud</p>
         */
        @NameInMap("PageName")
        public String pageName;

        public static BindMessengerPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindMessengerPageResponseBodyData self = new BindMessengerPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindMessengerPageResponseBodyData setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public BindMessengerPageResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public BindMessengerPageResponseBodyData setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

    }

}
