// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiRegistrantsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public ListAtiRegistrantsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>4698691</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Registrants")
    public ListAtiRegistrantsResponseBodyRegistrants registrants;

    /**
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>224</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static ListAtiRegistrantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAtiRegistrantsResponseBody self = new ListAtiRegistrantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAtiRegistrantsResponseBody setAccessDeniedDetail(ListAtiRegistrantsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ListAtiRegistrantsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAtiRegistrantsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAtiRegistrantsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAtiRegistrantsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiRegistrantsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiRegistrantsResponseBody setRegistrants(ListAtiRegistrantsResponseBodyRegistrants registrants) {
        this.registrants = registrants;
        return this;
    }
    public ListAtiRegistrantsResponseBodyRegistrants getRegistrants() {
        return this.registrants;
    }

    public ListAtiRegistrantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAtiRegistrantsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public ListAtiRegistrantsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class ListAtiRegistrantsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AddRspDomainServerHoldStatusForGatewayOte</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
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
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
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
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ListAtiRegistrantsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAtiRegistrantsResponseBodyAccessDeniedDetail self = new ListAtiRegistrantsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ListAtiRegistrantsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ListAtiRegistrantsResponseBodyRegistrantsRegistrant extends TeaModel {
        @NameInMap("Cc")
        public String cc;

        @NameInMap("City")
        public String city;

        @NameInMap("CreateTimestamp")
        public String createTimestamp;

        @NameInMap("DocumentCode")
        public String documentCode;

        @NameInMap("DocumentType")
        public String documentType;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegistrantId")
        public String registrantId;

        @NameInMap("State")
        public String state;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTimestamp")
        public String updateTimestamp;

        public static ListAtiRegistrantsResponseBodyRegistrantsRegistrant build(java.util.Map<String, ?> map) throws Exception {
            ListAtiRegistrantsResponseBodyRegistrantsRegistrant self = new ListAtiRegistrantsResponseBodyRegistrantsRegistrant();
            return TeaModel.build(map, self);
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setCc(String cc) {
            this.cc = cc;
            return this;
        }
        public String getCc() {
            return this.cc;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setCreateTimestamp(String createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setDocumentCode(String documentCode) {
            this.documentCode = documentCode;
            return this;
        }
        public String getDocumentCode() {
            return this.documentCode;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setRegistrantId(String registrantId) {
            this.registrantId = registrantId;
            return this;
        }
        public String getRegistrantId() {
            return this.registrantId;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAtiRegistrantsResponseBodyRegistrantsRegistrant setUpdateTimestamp(String updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListAtiRegistrantsResponseBodyRegistrants extends TeaModel {
        @NameInMap("Registrant")
        public java.util.List<ListAtiRegistrantsResponseBodyRegistrantsRegistrant> registrant;

        public static ListAtiRegistrantsResponseBodyRegistrants build(java.util.Map<String, ?> map) throws Exception {
            ListAtiRegistrantsResponseBodyRegistrants self = new ListAtiRegistrantsResponseBodyRegistrants();
            return TeaModel.build(map, self);
        }

        public ListAtiRegistrantsResponseBodyRegistrants setRegistrant(java.util.List<ListAtiRegistrantsResponseBodyRegistrantsRegistrant> registrant) {
            this.registrant = registrant;
            return this;
        }
        public java.util.List<ListAtiRegistrantsResponseBodyRegistrantsRegistrant> getRegistrant() {
            return this.registrant;
        }

    }

}
