// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizEntityInfoByVersionResponseBody extends TeaModel {
    @NameInMap("BizEntityInfo")
    public GetBizEntityInfoByVersionResponseBodyBizEntityInfo bizEntityInfo;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBizEntityInfoByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizEntityInfoByVersionResponseBody self = new GetBizEntityInfoByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizEntityInfoByVersionResponseBody setBizEntityInfo(GetBizEntityInfoByVersionResponseBodyBizEntityInfo bizEntityInfo) {
        this.bizEntityInfo = bizEntityInfo;
        return this;
    }
    public GetBizEntityInfoByVersionResponseBodyBizEntityInfo getBizEntityInfo() {
        return this.bizEntityInfo;
    }

    public GetBizEntityInfoByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBizEntityInfoByVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBizEntityInfoByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBizEntityInfoByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizEntityInfoByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>221323121212</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <strong>example:</strong>
         * <p>APPROVING</p>
         */
        @NameInMap("ApprovalStatus")
        public String approvalStatus;

        @NameInMap("ChildBizEntityIdList")
        public java.util.List<Long> childBizEntityIdList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>create_object_name</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <strong>example:</strong>
         * <p>create_object_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineStatus")
        public String onlineStatus;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>116306</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefDimTableCount")
        public Integer refDimTableCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefSummaryTableCount")
        public Integer refSummaryTableCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject self = new GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setChildBizEntityIdList(java.util.List<Long> childBizEntityIdList) {
            this.childBizEntityIdList = childBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getChildBizEntityIdList() {
            return this.childBizEntityIdList;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setRefDimTableCount(Integer refDimTableCount) {
            this.refDimTableCount = refDimTableCount;
            return this;
        }
        public Integer getRefDimTableCount() {
            return this.refDimTableCount;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setRefSummaryTableCount(Integer refSummaryTableCount) {
            this.refSummaryTableCount = refSummaryTableCount;
            return this;
        }
        public Integer getRefSummaryTableCount() {
            return this.refSummaryTableCount;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>221323121212</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <strong>example:</strong>
         * <p>APPROVING</p>
         */
        @NameInMap("ApprovalStatus")
        public String approvalStatus;

        @NameInMap("BizEventEntityIdList")
        public java.util.List<Long> bizEventEntityIdList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>业务活动测试</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10 10:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HasDependent")
        public Boolean hasDependent;

        /**
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("LastModifier")
        public String lastModifier;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("LastModifierName")
        public String lastModifierName;

        /**
         * <strong>example:</strong>
         * <p>create_process_code_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OnlineStatus")
        public String onlineStatus;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>30010010</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("PreBizProcessIdList")
        public java.util.List<Long> preBizProcessIdList;

        @NameInMap("RefBizEntityIdList")
        public java.util.List<Long> refBizEntityIdList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefFactTableCount")
        public Integer refFactTableCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>BIZ_EVENT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess self = new GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setBizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
            this.bizEventEntityIdList = bizEventEntityIdList;
            return this;
        }
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setHasDependent(Boolean hasDependent) {
            this.hasDependent = hasDependent;
            return this;
        }
        public Boolean getHasDependent() {
            return this.hasDependent;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setPreBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
            this.preBizProcessIdList = preBizProcessIdList;
            return this;
        }
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setRefFactTableCount(Integer refFactTableCount) {
            this.refFactTableCount = refFactTableCount;
            return this;
        }
        public Integer getRefFactTableCount() {
            return this.refFactTableCount;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBizEntityInfoByVersionResponseBodyBizEntityInfo extends TeaModel {
        @NameInMap("BizObject")
        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject bizObject;

        @NameInMap("BizProcess")
        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess bizProcess;

        /**
         * <strong>example:</strong>
         * <p>6798087749072704</p>
         */
        @NameInMap("BizUnitId")
        public Long bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>20101011</p>
         */
        @NameInMap("DataDomainId")
        public Long dataDomainId;

        /**
         * <strong>example:</strong>
         * <p>BIZ_OBJECT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBizEntityInfoByVersionResponseBodyBizEntityInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoByVersionResponseBodyBizEntityInfo self = new GetBizEntityInfoByVersionResponseBodyBizEntityInfo();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfo setBizObject(GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject bizObject) {
            this.bizObject = bizObject;
            return this;
        }
        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizObject getBizObject() {
            return this.bizObject;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfo setBizProcess(GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess bizProcess) {
            this.bizProcess = bizProcess;
            return this;
        }
        public GetBizEntityInfoByVersionResponseBodyBizEntityInfoBizProcess getBizProcess() {
            return this.bizProcess;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfo setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public GetBizEntityInfoByVersionResponseBodyBizEntityInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
