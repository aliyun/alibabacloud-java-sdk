// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetProjectInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("project")
    public GetProjectInfoResponseBodyProject project;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetProjectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectInfoResponseBody self = new GetProjectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProjectInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetProjectInfoResponseBody setProject(GetProjectInfoResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetProjectInfoResponseBodyProject getProject() {
        return this.project;
    }

    public GetProjectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectInfoResponseBodyProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("categoryIdentifier")
        public String categoryIdentifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>OJAY</p>
         */
        @NameInMap("customCode")
        public String customCode;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx.png">https://xxxxxx.png</a></p>
         */
        @NameInMap("icon")
        public String icon;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx.png">https://xxxxxx.png</a></p>
         */
        @NameInMap("iconBig")
        public String iconBig;

        /**
         * <strong>example:</strong>
         * <p>{&quot;small&quot;:&quot;<a href="https://xxxxxx.png%22,%22big%22:%22https://img.yyyyyy.png%22%7D">https://xxxxxx.png&quot;,&quot;big&quot;:&quot;https://img.yyyyyy.png&quot;}</a></p>
         */
        @NameInMap("iconGroup")
        public String iconGroup;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.yyyyyy.png">https://img.yyyyyy.png</a></p>
         */
        @NameInMap("iconSmall")
        public String iconSmall;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>e8b2xxxxxx2abdxxxxxxxx23</p>
         */
        @NameInMap("identifierPath")
        public String identifierPath;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("logicalStatus")
        public String logicalStatus;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>5e70xxxxxxcd000xxxxe96</p>
         */
        @NameInMap("organizationIdentifier")
        public String organizationIdentifier;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("parentIdentifier")
        public String parentIdentifier;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>8a40xxxxxxxxxxxxx64</p>
         */
        @NameInMap("statusIdentifier")
        public String statusIdentifier;

        /**
         * <strong>example:</strong>
         * <p>8a4058a71159b68254......</p>
         */
        @NameInMap("statusStageIdentifier")
        public String statusStageIdentifier;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("subType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>CustomProject</p>
         */
        @NameInMap("typeIdentifier")
        public String typeIdentifier;

        public static GetProjectInfoResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetProjectInfoResponseBodyProject self = new GetProjectInfoResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetProjectInfoResponseBodyProject setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetProjectInfoResponseBodyProject setCategoryIdentifier(String categoryIdentifier) {
            this.categoryIdentifier = categoryIdentifier;
            return this;
        }
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        public GetProjectInfoResponseBodyProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetProjectInfoResponseBodyProject setCustomCode(String customCode) {
            this.customCode = customCode;
            return this;
        }
        public String getCustomCode() {
            return this.customCode;
        }

        public GetProjectInfoResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectInfoResponseBodyProject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectInfoResponseBodyProject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectInfoResponseBodyProject setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetProjectInfoResponseBodyProject setIconBig(String iconBig) {
            this.iconBig = iconBig;
            return this;
        }
        public String getIconBig() {
            return this.iconBig;
        }

        public GetProjectInfoResponseBodyProject setIconGroup(String iconGroup) {
            this.iconGroup = iconGroup;
            return this;
        }
        public String getIconGroup() {
            return this.iconGroup;
        }

        public GetProjectInfoResponseBodyProject setIconSmall(String iconSmall) {
            this.iconSmall = iconSmall;
            return this;
        }
        public String getIconSmall() {
            return this.iconSmall;
        }

        public GetProjectInfoResponseBodyProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProjectInfoResponseBodyProject setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetProjectInfoResponseBodyProject setIdentifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            return this;
        }
        public String getIdentifierPath() {
            return this.identifierPath;
        }

        public GetProjectInfoResponseBodyProject setLogicalStatus(String logicalStatus) {
            this.logicalStatus = logicalStatus;
            return this;
        }
        public String getLogicalStatus() {
            return this.logicalStatus;
        }

        public GetProjectInfoResponseBodyProject setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetProjectInfoResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectInfoResponseBodyProject setOrganizationIdentifier(String organizationIdentifier) {
            this.organizationIdentifier = organizationIdentifier;
            return this;
        }
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

        public GetProjectInfoResponseBodyProject setParentIdentifier(String parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            return this;
        }
        public String getParentIdentifier() {
            return this.parentIdentifier;
        }

        public GetProjectInfoResponseBodyProject setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetProjectInfoResponseBodyProject setStatusIdentifier(String statusIdentifier) {
            this.statusIdentifier = statusIdentifier;
            return this;
        }
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        public GetProjectInfoResponseBodyProject setStatusStageIdentifier(String statusStageIdentifier) {
            this.statusStageIdentifier = statusStageIdentifier;
            return this;
        }
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        public GetProjectInfoResponseBodyProject setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetProjectInfoResponseBodyProject setTypeIdentifier(String typeIdentifier) {
            this.typeIdentifier = typeIdentifier;
            return this;
        }
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

    }

}
