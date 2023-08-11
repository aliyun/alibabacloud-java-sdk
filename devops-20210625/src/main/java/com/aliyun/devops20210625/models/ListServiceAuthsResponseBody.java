// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceAuthsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceAuths")
    public java.util.List<ListServiceAuthsResponseBodyServiceAuths> serviceAuths;

    @NameInMap("success")
    public Boolean success;

    public static ListServiceAuthsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceAuthsResponseBody self = new ListServiceAuthsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceAuthsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServiceAuthsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServiceAuthsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceAuthsResponseBody setServiceAuths(java.util.List<ListServiceAuthsResponseBodyServiceAuths> serviceAuths) {
        this.serviceAuths = serviceAuths;
        return this;
    }
    public java.util.List<ListServiceAuthsResponseBodyServiceAuths> getServiceAuths() {
        return this.serviceAuths;
    }

    public ListServiceAuthsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServiceAuthsResponseBodyServiceAuths extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("ownerName")
        public String ownerName;

        @NameInMap("ownerStaffId")
        public String ownerStaffId;

        @NameInMap("type")
        public String type;

        public static ListServiceAuthsResponseBodyServiceAuths build(java.util.Map<String, ?> map) throws Exception {
            ListServiceAuthsResponseBodyServiceAuths self = new ListServiceAuthsResponseBodyServiceAuths();
            return TeaModel.build(map, self);
        }

        public ListServiceAuthsResponseBodyServiceAuths setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListServiceAuthsResponseBodyServiceAuths setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListServiceAuthsResponseBodyServiceAuths setOwnerStaffId(String ownerStaffId) {
            this.ownerStaffId = ownerStaffId;
            return this;
        }
        public String getOwnerStaffId() {
            return this.ownerStaffId;
        }

        public ListServiceAuthsResponseBodyServiceAuths setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
