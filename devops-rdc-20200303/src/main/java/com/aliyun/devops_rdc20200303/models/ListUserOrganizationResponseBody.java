// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListUserOrganizationResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<ListUserOrganizationResponseBodyObject> object;

    public static ListUserOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserOrganizationResponseBody self = new ListUserOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserOrganizationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserOrganizationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserOrganizationResponseBody setObject(java.util.List<ListUserOrganizationResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListUserOrganizationResponseBodyObject> getObject() {
        return this.object;
    }

    public static class ListUserOrganizationResponseBodyObject extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListUserOrganizationResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListUserOrganizationResponseBodyObject self = new ListUserOrganizationResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListUserOrganizationResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserOrganizationResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
