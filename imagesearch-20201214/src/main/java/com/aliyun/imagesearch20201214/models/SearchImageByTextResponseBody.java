// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class SearchImageByTextResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public SearchImageByTextResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Auctions")
    public java.util.List<SearchImageByTextResponseBodyAuctions> auctions;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Head")
    public SearchImageByTextResponseBodyHead head;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    @NameInMap("PicInfo")
    public SearchImageByTextResponseBodyPicInfo picInfo;

    /**
     * <strong>example:</strong>
     * <p>B3137727-7D6E-488C-BA21-0E034C38A879</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchImageByTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchImageByTextResponseBody self = new SearchImageByTextResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchImageByTextResponseBody setAccessDeniedDetail(SearchImageByTextResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public SearchImageByTextResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SearchImageByTextResponseBody setAuctions(java.util.List<SearchImageByTextResponseBodyAuctions> auctions) {
        this.auctions = auctions;
        return this;
    }
    public java.util.List<SearchImageByTextResponseBodyAuctions> getAuctions() {
        return this.auctions;
    }

    public SearchImageByTextResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchImageByTextResponseBody setHead(SearchImageByTextResponseBodyHead head) {
        this.head = head;
        return this;
    }
    public SearchImageByTextResponseBodyHead getHead() {
        return this.head;
    }

    public SearchImageByTextResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SearchImageByTextResponseBody setPicInfo(SearchImageByTextResponseBodyPicInfo picInfo) {
        this.picInfo = picInfo;
        return this;
    }
    public SearchImageByTextResponseBodyPicInfo getPicInfo() {
        return this.picInfo;
    }

    public SearchImageByTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchImageByTextResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchImageByTextResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>PauseNotify</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static SearchImageByTextResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByTextResponseBodyAccessDeniedDetail self = new SearchImageByTextResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public SearchImageByTextResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class SearchImageByTextResponseBodyAuctions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8888888</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <strong>example:</strong>
         * <p>zidingyi</p>
         */
        @NameInMap("CustomContent")
        public String customContent;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr")
        public Integer intAttr;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr2")
        public Integer intAttr2;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr3")
        public Integer intAttr3;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IntAttr4")
        public Integer intAttr4;

        /**
         * <strong>example:</strong>
         * <p>2092061_1.jpg</p>
         */
        @NameInMap("PicName")
        public String picName;

        /**
         * <strong>example:</strong>
         * <p>2092061_1</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("StrAttr")
        public String strAttr;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("StrAttr2")
        public String strAttr2;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("StrAttr3")
        public String strAttr3;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("StrAttr4")
        public String strAttr4;

        public static SearchImageByTextResponseBodyAuctions build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByTextResponseBodyAuctions self = new SearchImageByTextResponseBodyAuctions();
            return TeaModel.build(map, self);
        }

        public SearchImageByTextResponseBodyAuctions setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public SearchImageByTextResponseBodyAuctions setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public SearchImageByTextResponseBodyAuctions setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public SearchImageByTextResponseBodyAuctions setIntAttr2(Integer intAttr2) {
            this.intAttr2 = intAttr2;
            return this;
        }
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        public SearchImageByTextResponseBodyAuctions setIntAttr3(Integer intAttr3) {
            this.intAttr3 = intAttr3;
            return this;
        }
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        public SearchImageByTextResponseBodyAuctions setIntAttr4(Integer intAttr4) {
            this.intAttr4 = intAttr4;
            return this;
        }
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        public SearchImageByTextResponseBodyAuctions setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public SearchImageByTextResponseBodyAuctions setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SearchImageByTextResponseBodyAuctions setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public SearchImageByTextResponseBodyAuctions setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

        public SearchImageByTextResponseBodyAuctions setStrAttr2(String strAttr2) {
            this.strAttr2 = strAttr2;
            return this;
        }
        public String getStrAttr2() {
            return this.strAttr2;
        }

        public SearchImageByTextResponseBodyAuctions setStrAttr3(String strAttr3) {
            this.strAttr3 = strAttr3;
            return this;
        }
        public String getStrAttr3() {
            return this.strAttr3;
        }

        public SearchImageByTextResponseBodyAuctions setStrAttr4(String strAttr4) {
            this.strAttr4 = strAttr4;
            return this;
        }
        public String getStrAttr4() {
            return this.strAttr4;
        }

    }

    public static class SearchImageByTextResponseBodyHead extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DocsFound")
        public Integer docsFound;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("DocsReturn")
        public Integer docsReturn;

        /**
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("SearchTime")
        public Integer searchTime;

        public static SearchImageByTextResponseBodyHead build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByTextResponseBodyHead self = new SearchImageByTextResponseBodyHead();
            return TeaModel.build(map, self);
        }

        public SearchImageByTextResponseBodyHead setDocsFound(Integer docsFound) {
            this.docsFound = docsFound;
            return this;
        }
        public Integer getDocsFound() {
            return this.docsFound;
        }

        public SearchImageByTextResponseBodyHead setDocsReturn(Integer docsReturn) {
            this.docsReturn = docsReturn;
            return this;
        }
        public Integer getDocsReturn() {
            return this.docsReturn;
        }

        public SearchImageByTextResponseBodyHead setSearchTime(Integer searchTime) {
            this.searchTime = searchTime;
            return this;
        }
        public Integer getSearchTime() {
            return this.searchTime;
        }

    }

    public static class SearchImageByTextResponseBodyPicInfoAllCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>88888888</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("Name")
        public String name;

        public static SearchImageByTextResponseBodyPicInfoAllCategories build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByTextResponseBodyPicInfoAllCategories self = new SearchImageByTextResponseBodyPicInfoAllCategories();
            return TeaModel.build(map, self);
        }

        public SearchImageByTextResponseBodyPicInfoAllCategories setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public SearchImageByTextResponseBodyPicInfoAllCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class SearchImageByTextResponseBodyPicInfo extends TeaModel {
        @NameInMap("AllCategories")
        public java.util.List<SearchImageByTextResponseBodyPicInfoAllCategories> allCategories;

        public static SearchImageByTextResponseBodyPicInfo build(java.util.Map<String, ?> map) throws Exception {
            SearchImageByTextResponseBodyPicInfo self = new SearchImageByTextResponseBodyPicInfo();
            return TeaModel.build(map, self);
        }

        public SearchImageByTextResponseBodyPicInfo setAllCategories(java.util.List<SearchImageByTextResponseBodyPicInfoAllCategories> allCategories) {
            this.allCategories = allCategories;
            return this;
        }
        public java.util.List<SearchImageByTextResponseBodyPicInfoAllCategories> getAllCategories() {
            return this.allCategories;
        }

    }

}
