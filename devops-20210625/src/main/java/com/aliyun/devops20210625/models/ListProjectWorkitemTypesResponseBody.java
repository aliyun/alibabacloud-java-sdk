// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectWorkitemTypesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>例：Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>errormessage</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true或者false</p>
     */
    @NameInMap("success")
    public Boolean success;

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
        /**
         * <strong>example:</strong>
         * <p>用户阿里云pk，例如19xxxx31947xxxx</p>
         */
        @NameInMap("addUser")
        public String addUser;

        /**
         * <strong>example:</strong>
         * <p>Req</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        /**
         * <strong>example:</strong>
         * <p>用户阿里云pk，例如19xxxx31947xxxx</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>true或者false</p>
         */
        @NameInMap("defaultType")
        public Boolean defaultType;

        /**
         * <strong>example:</strong>
         * <p>该类型的具体信息</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true或者false</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>1641870287000</p>
         */
        @NameInMap("gmtAdd")
        public Long gmtAdd;

        /**
         * <strong>example:</strong>
         * <p>1620455467000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>dfexxxxxf4fee18xxxxx36</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>例：业务类需求</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>例：Business Requirement</p>
         */
        @NameInMap("nameEn")
        public String nameEn;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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
