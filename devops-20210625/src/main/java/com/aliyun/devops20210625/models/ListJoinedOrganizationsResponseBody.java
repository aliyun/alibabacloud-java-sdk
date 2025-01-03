// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListJoinedOrganizationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("organizations")
    public java.util.List<ListJoinedOrganizationsResponseBodyOrganizations> organizations;

    /**
     * <strong>example:</strong>
     * <p>11D0EE6E-5803-5D4C-A652-E672BE1F3D8E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListJoinedOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJoinedOrganizationsResponseBody self = new ListJoinedOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJoinedOrganizationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListJoinedOrganizationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListJoinedOrganizationsResponseBody setOrganizations(java.util.List<ListJoinedOrganizationsResponseBodyOrganizations> organizations) {
        this.organizations = organizations;
        return this;
    }
    public java.util.List<ListJoinedOrganizationsResponseBodyOrganizations> getOrganizations() {
        return this.organizations;
    }

    public ListJoinedOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJoinedOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJoinedOrganizationsResponseBodyOrganizations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>65f25d0fa54c216dcf6b1dbd</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("isOrgAdmin")
        public Boolean isOrgAdmin;

        @NameInMap("name")
        public String name;

        public static ListJoinedOrganizationsResponseBodyOrganizations build(java.util.Map<String, ?> map) throws Exception {
            ListJoinedOrganizationsResponseBodyOrganizations self = new ListJoinedOrganizationsResponseBodyOrganizations();
            return TeaModel.build(map, self);
        }

        public ListJoinedOrganizationsResponseBodyOrganizations setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJoinedOrganizationsResponseBodyOrganizations setIsOrgAdmin(Boolean isOrgAdmin) {
            this.isOrgAdmin = isOrgAdmin;
            return this;
        }
        public Boolean getIsOrgAdmin() {
            return this.isOrgAdmin;
        }

        public ListJoinedOrganizationsResponseBodyOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
