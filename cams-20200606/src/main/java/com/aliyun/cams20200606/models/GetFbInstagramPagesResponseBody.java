// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetFbInstagramPagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
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
    public java.util.List<GetFbInstagramPagesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>hgfh77-gfh55***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFbInstagramPagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFbInstagramPagesResponseBody self = new GetFbInstagramPagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFbInstagramPagesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetFbInstagramPagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFbInstagramPagesResponseBody setData(java.util.List<GetFbInstagramPagesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFbInstagramPagesResponseBodyData> getData() {
        return this.data;
    }

    public GetFbInstagramPagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFbInstagramPagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFbInstagramPagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFbInstagramPagesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1245454654654</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>12534653543</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>iwhalecloud</p>
         */
        @NameInMap("PageName")
        public String pageName;

        public static GetFbInstagramPagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFbInstagramPagesResponseBodyData self = new GetFbInstagramPagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFbInstagramPagesResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetFbInstagramPagesResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetFbInstagramPagesResponseBodyData setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public GetFbInstagramPagesResponseBodyData setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public GetFbInstagramPagesResponseBodyData setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

    }

}
