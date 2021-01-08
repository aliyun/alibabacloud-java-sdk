// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public GetDevopsProjectInfoResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static GetDevopsProjectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectInfoResponseBody self = new GetDevopsProjectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevopsProjectInfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetDevopsProjectInfoResponseBody setObject(GetDevopsProjectInfoResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetDevopsProjectInfoResponseBodyObject getObject() {
        return this.object;
    }

    public GetDevopsProjectInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDevopsProjectInfoResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class GetDevopsProjectInfoResponseBodyObject extends TeaModel {
        @NameInMap("SortMethod")
        public String sortMethod;

        @NameInMap("UniqueIdPrefix")
        public String uniqueIdPrefix;

        @NameInMap("NormalType")
        public String normalType;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("IsTemplate")
        public Boolean isTemplate;

        @NameInMap("Description")
        public String description;

        @NameInMap("DefaultRoleId")
        public String defaultRoleId;

        @NameInMap("RootCollectionId")
        public String rootCollectionId;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("IsArchived")
        public Boolean isArchived;

        @NameInMap("Name")
        public String name;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Logo")
        public String logo;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("IsSuspended")
        public Boolean isSuspended;

        @NameInMap("DefaultCollectionId")
        public String defaultCollectionId;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("Py")
        public String py;

        @NameInMap("Category")
        public String category;

        @NameInMap("NextTaskUniqueId")
        public Integer nextTaskUniqueId;

        @NameInMap("Customfields")
        public String customfields;

        @NameInMap("Created")
        public String created;

        @NameInMap("Id")
        public String id;

        public static GetDevopsProjectInfoResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetDevopsProjectInfoResponseBodyObject self = new GetDevopsProjectInfoResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetDevopsProjectInfoResponseBodyObject setSortMethod(String sortMethod) {
            this.sortMethod = sortMethod;
            return this;
        }
        public String getSortMethod() {
            return this.sortMethod;
        }

        public GetDevopsProjectInfoResponseBodyObject setUniqueIdPrefix(String uniqueIdPrefix) {
            this.uniqueIdPrefix = uniqueIdPrefix;
            return this;
        }
        public String getUniqueIdPrefix() {
            return this.uniqueIdPrefix;
        }

        public GetDevopsProjectInfoResponseBodyObject setNormalType(String normalType) {
            this.normalType = normalType;
            return this;
        }
        public String getNormalType() {
            return this.normalType;
        }

        public GetDevopsProjectInfoResponseBodyObject setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetDevopsProjectInfoResponseBodyObject setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetDevopsProjectInfoResponseBodyObject setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetDevopsProjectInfoResponseBodyObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDevopsProjectInfoResponseBodyObject setDefaultRoleId(String defaultRoleId) {
            this.defaultRoleId = defaultRoleId;
            return this;
        }
        public String getDefaultRoleId() {
            return this.defaultRoleId;
        }

        public GetDevopsProjectInfoResponseBodyObject setRootCollectionId(String rootCollectionId) {
            this.rootCollectionId = rootCollectionId;
            return this;
        }
        public String getRootCollectionId() {
            return this.rootCollectionId;
        }

        public GetDevopsProjectInfoResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetDevopsProjectInfoResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public GetDevopsProjectInfoResponseBodyObject setIsArchived(Boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        public GetDevopsProjectInfoResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDevopsProjectInfoResponseBodyObject setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetDevopsProjectInfoResponseBodyObject setLogo(String logo) {
            this.logo = logo;
            return this;
        }
        public String getLogo() {
            return this.logo;
        }

        public GetDevopsProjectInfoResponseBodyObject setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetDevopsProjectInfoResponseBodyObject setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public GetDevopsProjectInfoResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDevopsProjectInfoResponseBodyObject setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetDevopsProjectInfoResponseBodyObject setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetDevopsProjectInfoResponseBodyObject setIsSuspended(Boolean isSuspended) {
            this.isSuspended = isSuspended;
            return this;
        }
        public Boolean getIsSuspended() {
            return this.isSuspended;
        }

        public GetDevopsProjectInfoResponseBodyObject setDefaultCollectionId(String defaultCollectionId) {
            this.defaultCollectionId = defaultCollectionId;
            return this;
        }
        public String getDefaultCollectionId() {
            return this.defaultCollectionId;
        }

        public GetDevopsProjectInfoResponseBodyObject setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public GetDevopsProjectInfoResponseBodyObject setPy(String py) {
            this.py = py;
            return this;
        }
        public String getPy() {
            return this.py;
        }

        public GetDevopsProjectInfoResponseBodyObject setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetDevopsProjectInfoResponseBodyObject setNextTaskUniqueId(Integer nextTaskUniqueId) {
            this.nextTaskUniqueId = nextTaskUniqueId;
            return this;
        }
        public Integer getNextTaskUniqueId() {
            return this.nextTaskUniqueId;
        }

        public GetDevopsProjectInfoResponseBodyObject setCustomfields(String customfields) {
            this.customfields = customfields;
            return this;
        }
        public String getCustomfields() {
            return this.customfields;
        }

        public GetDevopsProjectInfoResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetDevopsProjectInfoResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
