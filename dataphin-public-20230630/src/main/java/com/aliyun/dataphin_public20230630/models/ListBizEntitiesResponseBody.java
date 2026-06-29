// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBizEntitiesResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paginated result.</p>
     */
    @NameInMap("PageResult")
    public ListBizEntitiesResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBizEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBizEntitiesResponseBody self = new ListBizEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBizEntitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBizEntitiesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBizEntitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBizEntitiesResponseBody setPageResult(ListBizEntitiesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListBizEntitiesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListBizEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBizEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBizEntitiesResponseBodyPageResultBizEntityList extends TeaModel {
        /**
         * <p>The list of parent business process IDs. This parameter is valid only when the entity type is business process.</p>
         */
        @NameInMap("BelongToBizEntityIdList")
        public java.util.List<Long> belongToBizEntityIdList;

        /**
         * <p>The ID of the business unit to which the business process belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <p>The list of child business object IDs. This parameter is valid only when the entity type is business object.</p>
         */
        @NameInMap("ChildBizEntityIdList")
        public java.util.List<Long> childBizEntityIdList;

        /**
         * <p>The ID of the data domain to which the business process belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>20101011</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <p>The description of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>业务活动测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the business entity was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the business entity was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the entity is a child business object.</p>
         */
        @NameInMap("HasChildBizEntity")
        public Boolean hasChildBizEntity;

        /**
         * <p>The ID of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>12121111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the user who last modified the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <p>The name of the user who last modified the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <p>Indicates whether the entity is a sublevel of a hierarchy dimension.</p>
         */
        @NameInMap("LevelSubBizObject")
        public Boolean levelSubBizObject;

        /**
         * <p>The name of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>create_process_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The online status of the business entity. Valid values: </p>
         * <ul>
         * <li>SUBMITTED: not online.</li>
         * <li>APPROVING: pending approval.</li>
         * <li>PUBLISHED: online.</li>
         * <li>REJECT: failed to go online.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("OnlineStatus")
        public String onlineStatus;

        /**
         * <p>The ID of the business entity owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The ID of the business entity owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The list of associated central business entity IDs.</p>
         */
        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        /**
         * <p>The number of associated logical tables.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefTableCount")
        public Integer refTableCount;

        /**
         * <p>The status of the business entity. Valid values:</p>
         * <ul>
         * <li>DRAFT: draft or not online.</li>
         * <li>SUBMITTING: being submitted.</li>
         * <li>SUBMITTED: submitted.</li>
         * <li>DEVELOPING: under development.</li>
         * <li>PUBLISHING: being published.</li>
         * <li>PUBLISHED: published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subtype of the business entity.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The list of subsequent business process IDs. This parameter is valid only when the entity type is business process.</p>
         */
        @NameInMap("SuffixBizEntityIdList")
        public java.util.List<Long> suffixBizEntityIdList;

        /**
         * <p>The type of the business entity. Valid values:</p>
         * <ul>
         * <li>BIZ_OBJECT: business object.</li>
         * <li>BIZ_PROCESS: business process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListBizEntitiesResponseBodyPageResultBizEntityList build(java.util.Map<String, ?> map) throws Exception {
            ListBizEntitiesResponseBodyPageResultBizEntityList self = new ListBizEntitiesResponseBodyPageResultBizEntityList();
            return TeaModel.build(map, self);
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setBelongToBizEntityIdList(java.util.List<Long> belongToBizEntityIdList) {
            this.belongToBizEntityIdList = belongToBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getBelongToBizEntityIdList() {
            return this.belongToBizEntityIdList;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setChildBizEntityIdList(java.util.List<Long> childBizEntityIdList) {
            this.childBizEntityIdList = childBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getChildBizEntityIdList() {
            return this.childBizEntityIdList;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setHasChildBizEntity(Boolean hasChildBizEntity) {
            this.hasChildBizEntity = hasChildBizEntity;
            return this;
        }
        public Boolean getHasChildBizEntity() {
            return this.hasChildBizEntity;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setLevelSubBizObject(Boolean levelSubBizObject) {
            this.levelSubBizObject = levelSubBizObject;
            return this;
        }
        public Boolean getLevelSubBizObject() {
            return this.levelSubBizObject;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setRefTableCount(Integer refTableCount) {
            this.refTableCount = refTableCount;
            return this;
        }
        public Integer getRefTableCount() {
            return this.refTableCount;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setSuffixBizEntityIdList(java.util.List<Long> suffixBizEntityIdList) {
            this.suffixBizEntityIdList = suffixBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getSuffixBizEntityIdList() {
            return this.suffixBizEntityIdList;
        }

        public ListBizEntitiesResponseBodyPageResultBizEntityList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListBizEntitiesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of business entities.</p>
         */
        @NameInMap("BizEntityList")
        public java.util.List<ListBizEntitiesResponseBodyPageResultBizEntityList> bizEntityList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBizEntitiesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListBizEntitiesResponseBodyPageResult self = new ListBizEntitiesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListBizEntitiesResponseBodyPageResult setBizEntityList(java.util.List<ListBizEntitiesResponseBodyPageResultBizEntityList> bizEntityList) {
            this.bizEntityList = bizEntityList;
            return this;
        }
        public java.util.List<ListBizEntitiesResponseBodyPageResultBizEntityList> getBizEntityList() {
            return this.bizEntityList;
        }

        public ListBizEntitiesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
