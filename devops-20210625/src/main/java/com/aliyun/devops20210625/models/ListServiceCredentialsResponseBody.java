// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceCredentialsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceCredentials")
    public java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> serviceCredentials;

    @NameInMap("success")
    public Boolean success;

    public static ListServiceCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCredentialsResponseBody self = new ListServiceCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceCredentialsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServiceCredentialsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServiceCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceCredentialsResponseBody setServiceCredentials(java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> serviceCredentials) {
        this.serviceCredentials = serviceCredentials;
        return this;
    }
    public java.util.List<ListServiceCredentialsResponseBodyServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    public ListServiceCredentialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceCredentialsResponseBodyServiceCredentials extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("ownerName")
        public String ownerName;

        @NameInMap("ownerStaffId")
        public String ownerStaffId;

        @NameInMap("type")
        public String type;

        public static ListServiceCredentialsResponseBodyServiceCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListServiceCredentialsResponseBodyServiceCredentials self = new ListServiceCredentialsResponseBodyServiceCredentials();
            return TeaModel.build(map, self);
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setOwnerStaffId(String ownerStaffId) {
            this.ownerStaffId = ownerStaffId;
            return this;
        }
        public String getOwnerStaffId() {
            return this.ownerStaffId;
        }

        public ListServiceCredentialsResponseBodyServiceCredentials setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
