// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectWorkitemTypesResponseBody extends TeaModel {
    // 错误返回码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误返回信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // openapi平台的request id
    @NameInMap("requestId")
    public String requestId;

    // 接口是否正常返回
    @NameInMap("success")
    public Boolean success;

    // 工作项类型
    @NameInMap("workitemTypes")
    public java.util.List<ListProjectWorkitemTypesResponseBodyWorkitemTypes> workitemTypes;

    public static ListProjectWorkitemTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectWorkitemTypesResponseBody self = new ListProjectWorkitemTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectWorkitemTypesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProjectWorkitemTypesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProjectWorkitemTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectWorkitemTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectWorkitemTypesResponseBody setWorkitemTypes(java.util.List<ListProjectWorkitemTypesResponseBodyWorkitemTypes> workitemTypes) {
        this.workitemTypes = workitemTypes;
        return this;
    }
    public java.util.List<ListProjectWorkitemTypesResponseBodyWorkitemTypes> getWorkitemTypes() {
        return this.workitemTypes;
    }

    public static class ListProjectWorkitemTypesResponseBodyWorkitemTypes extends TeaModel {
        // 添加到项目中的添加人
        @NameInMap("addUser")
        public String addUser;

        // 工作项类型
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        // 工作项类型创建人
        @NameInMap("creator")
        public String creator;

        // 在项目中是否为默认类型
        @NameInMap("defaultType")
        public Boolean defaultType;

        // 描述
        @NameInMap("description")
        public String description;

        // 是否启用
        @NameInMap("enable")
        public Boolean enable;

        // 添加到项目中的时间
        @NameInMap("gmtAdd")
        public Long gmtAdd;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 工作项类型id
        @NameInMap("identifier")
        public String identifier;

        // 工作项类型的名称
        @NameInMap("name")
        public String name;

        // 工作项类型的英文名称
        @NameInMap("nameEn")
        public String nameEn;

        // 是否系统默认
        @NameInMap("systemDefault")
        public Boolean systemDefault;

        public static ListProjectWorkitemTypesResponseBodyWorkitemTypes build(java.util.Map<String, ?> map) throws Exception {
            ListProjectWorkitemTypesResponseBodyWorkitemTypes self = new ListProjectWorkitemTypesResponseBodyWorkitemTypes();
            return TeaModel.build(map, self);
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setAddUser(String addUser) {
            this.addUser = addUser;
            return this;
        }
        public String getAddUser() {
            return this.addUser;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setDefaultType(Boolean defaultType) {
            this.defaultType = defaultType;
            return this;
        }
        public Boolean getDefaultType() {
            return this.defaultType;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setGmtAdd(Long gmtAdd) {
            this.gmtAdd = gmtAdd;
            return this;
        }
        public Long getGmtAdd() {
            return this.gmtAdd;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public ListProjectWorkitemTypesResponseBodyWorkitemTypes setSystemDefault(Boolean systemDefault) {
            this.systemDefault = systemDefault;
            return this;
        }
        public Boolean getSystemDefault() {
            return this.systemDefault;
        }

    }

}
