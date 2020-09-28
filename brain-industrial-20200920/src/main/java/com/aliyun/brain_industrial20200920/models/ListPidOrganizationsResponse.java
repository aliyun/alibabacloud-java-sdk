// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ListPidOrganizationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("OrganizationList")
    @Validation(required = true)
    public java.util.List<ListPidOrganizationsResponseOrganizationList> organizationList;

    public static ListPidOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPidOrganizationsResponse self = new ListPidOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPidOrganizationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPidOrganizationsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPidOrganizationsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPidOrganizationsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPidOrganizationsResponse setOrganizationList(java.util.List<ListPidOrganizationsResponseOrganizationList> organizationList) {
        this.organizationList = organizationList;
        return this;
    }
    public java.util.List<ListPidOrganizationsResponseOrganizationList> getOrganizationList() {
        return this.organizationList;
    }

    public static class ListPidOrganizationsResponseOrganizationList extends TeaModel {
        @NameInMap("OrganizationId")
        @Validation(required = true)
        public String organizationId;

        @NameInMap("OrganizationName")
        @Validation(required = true)
        public String organizationName;

        @NameInMap("OrganizationLevel")
        @Validation(required = true)
        public Integer organizationLevel;

        @NameInMap("ParentOrganizationId")
        @Validation(required = true)
        public String parentOrganizationId;

        @NameInMap("LevelName")
        @Validation(required = true)
        public String levelName;

        public static ListPidOrganizationsResponseOrganizationList build(java.util.Map<String, ?> map) throws Exception {
            ListPidOrganizationsResponseOrganizationList self = new ListPidOrganizationsResponseOrganizationList();
            return TeaModel.build(map, self);
        }

        public ListPidOrganizationsResponseOrganizationList setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public ListPidOrganizationsResponseOrganizationList setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public ListPidOrganizationsResponseOrganizationList setOrganizationLevel(Integer organizationLevel) {
            this.organizationLevel = organizationLevel;
            return this;
        }
        public Integer getOrganizationLevel() {
            return this.organizationLevel;
        }

        public ListPidOrganizationsResponseOrganizationList setParentOrganizationId(String parentOrganizationId) {
            this.parentOrganizationId = parentOrganizationId;
            return this;
        }
        public String getParentOrganizationId() {
            return this.parentOrganizationId;
        }

        public ListPidOrganizationsResponseOrganizationList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

}
