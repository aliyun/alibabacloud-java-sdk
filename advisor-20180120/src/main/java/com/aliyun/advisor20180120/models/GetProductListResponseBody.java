// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class GetProductListResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetProductListResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetProductListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>566331F9-****-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("UserMessage")
    public String userMessage;

    public static GetProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductListResponseBody self = new GetProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductListResponseBody setAccessDeniedDetail(GetProductListResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetProductListResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetProductListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductListResponseBody setData(java.util.List<GetProductListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProductListResponseBodyData> getData() {
        return this.data;
    }

    public GetProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProductListResponseBody setUserMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }
    public String getUserMessage() {
        return this.userMessage;
    }

    public static class GetProductListResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static GetProductListResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyAccessDeniedDetail self = new GetProductListResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetProductListResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetProductListResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetProductListResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetProductListResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetProductListResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetProductListResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetProductListResponseBodyDataProductList extends TeaModel {
        @NameInMap("NewLabel")
        public String newLabel;

        /**
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        @NameInMap("Product")
        public String product;

        public static GetProductListResponseBodyDataProductList build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyDataProductList self = new GetProductListResponseBodyDataProductList();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyDataProductList setNewLabel(String newLabel) {
            this.newLabel = newLabel;
            return this;
        }
        public String getNewLabel() {
            return this.newLabel;
        }

        public GetProductListResponseBodyDataProductList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class GetProductListResponseBodyData extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("ProductList")
        public java.util.List<GetProductListResponseBodyDataProductList> productList;

        public static GetProductListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductListResponseBodyData self = new GetProductListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductListResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetProductListResponseBodyData setProductList(java.util.List<GetProductListResponseBodyDataProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<GetProductListResponseBodyDataProductList> getProductList() {
            return this.productList;
        }

    }

}
