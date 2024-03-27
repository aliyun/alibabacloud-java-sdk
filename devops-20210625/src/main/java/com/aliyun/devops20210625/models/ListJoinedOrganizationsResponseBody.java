// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListJoinedOrganizationsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("organizations")
    public java.util.List<ListJoinedOrganizationsResponseBodyOrganizations> organizations;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("id")
        public String id;

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

        public ListJoinedOrganizationsResponseBodyOrganizations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
