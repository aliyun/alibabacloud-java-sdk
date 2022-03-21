// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunvnos20220314.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CheckServiceLinkedRoleForDeletingResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CheckServiceLinkedRoleForDeletingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingResponseBody self = new CheckServiceLinkedRoleForDeletingResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setData(CheckServiceLinkedRoleForDeletingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckServiceLinkedRoleForDeletingResponseBodyData getData() {
        return this.data;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceLinkedRoleForDeletingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceList")
        public java.util.List<String> resourceList;

        public static CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList self = new CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList setResourceList(java.util.List<String> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<String> getResourceList() {
            return this.resourceList;
        }

    }

    public static class CheckServiceLinkedRoleForDeletingResponseBodyData extends TeaModel {
        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("RoleUsageList")
        public java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList> roleUsageList;

        public static CheckServiceLinkedRoleForDeletingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceLinkedRoleForDeletingResponseBodyData self = new CheckServiceLinkedRoleForDeletingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyData setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public CheckServiceLinkedRoleForDeletingResponseBodyData setRoleUsageList(java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList> roleUsageList) {
            this.roleUsageList = roleUsageList;
            return this;
        }
        public java.util.List<CheckServiceLinkedRoleForDeletingResponseBodyDataRoleUsageList> getRoleUsageList() {
            return this.roleUsageList;
        }

    }

}
