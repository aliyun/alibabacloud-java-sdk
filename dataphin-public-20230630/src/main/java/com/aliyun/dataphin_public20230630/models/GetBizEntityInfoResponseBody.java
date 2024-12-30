// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBizEntityInfoResponseBody extends TeaModel {
    @NameInMap("BizEntityInfo")
    public GetBizEntityInfoResponseBodyBizEntityInfo bizEntityInfo;

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

    public static GetBizEntityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizEntityInfoResponseBody self = new GetBizEntityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizEntityInfoResponseBody setBizEntityInfo(GetBizEntityInfoResponseBodyBizEntityInfo bizEntityInfo) {
        this.bizEntityInfo = bizEntityInfo;
        return this;
    }
    public GetBizEntityInfoResponseBodyBizEntityInfo getBizEntityInfo() {
        return this.bizEntityInfo;
    }

    public GetBizEntityInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBizEntityInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBizEntityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBizEntityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBizEntityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBizEntityInfoResponseBodyBizEntityInfoBizObject extends TeaModel {
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
         * <p>SUBMITTED</p>
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
         * <p>SUBMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBizEntityInfoResponseBodyBizEntityInfoBizObject build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoResponseBodyBizEntityInfoBizObject self = new GetBizEntityInfoResponseBodyBizEntityInfoBizObject();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setChildBizEntityIdList(java.util.List<Long> childBizEntityIdList) {
            this.childBizEntityIdList = childBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getChildBizEntityIdList() {
            return this.childBizEntityIdList;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setRefDimTableCount(Integer refDimTableCount) {
            this.refDimTableCount = refDimTableCount;
            return this;
        }
        public Integer getRefDimTableCount() {
            return this.refDimTableCount;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setRefSummaryTableCount(Integer refSummaryTableCount) {
            this.refSummaryTableCount = refSummaryTableCount;
            return this;
        }
        public Integer getRefSummaryTableCount() {
            return this.refSummaryTableCount;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBizEntityInfoResponseBodyBizEntityInfoBizProcess extends TeaModel {
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
         * <p>SUBMITTED</p>
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
         * <p>SUBMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>BIZ_EVENT</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetBizEntityInfoResponseBodyBizEntityInfoBizProcess build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoResponseBodyBizEntityInfoBizProcess self = new GetBizEntityInfoResponseBodyBizEntityInfoBizProcess();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setBizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
            this.bizEventEntityIdList = bizEventEntityIdList;
            return this;
        }
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setHasDependent(Boolean hasDependent) {
            this.hasDependent = hasDependent;
            return this;
        }
        public Boolean getHasDependent() {
            return this.hasDependent;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setLastModifier(String lastModifier) {
            this.lastModifier = lastModifier;
            return this;
        }
        public String getLastModifier() {
            return this.lastModifier;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setLastModifierName(String lastModifierName) {
            this.lastModifierName = lastModifierName;
            return this;
        }
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setPreBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
            this.preBizProcessIdList = preBizProcessIdList;
            return this;
        }
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setRefBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
            this.refBizEntityIdList = refBizEntityIdList;
            return this;
        }
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setRefFactTableCount(Integer refFactTableCount) {
            this.refFactTableCount = refFactTableCount;
            return this;
        }
        public Integer getRefFactTableCount() {
            return this.refFactTableCount;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetBizEntityInfoResponseBodyBizEntityInfo extends TeaModel {
        @NameInMap("BizObject")
        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject bizObject;

        @NameInMap("BizProcess")
        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess bizProcess;

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

        public static GetBizEntityInfoResponseBodyBizEntityInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBizEntityInfoResponseBodyBizEntityInfo self = new GetBizEntityInfoResponseBodyBizEntityInfo();
            return TeaModel.build(map, self);
        }

        public GetBizEntityInfoResponseBodyBizEntityInfo setBizObject(GetBizEntityInfoResponseBodyBizEntityInfoBizObject bizObject) {
            this.bizObject = bizObject;
            return this;
        }
        public GetBizEntityInfoResponseBodyBizEntityInfoBizObject getBizObject() {
            return this.bizObject;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfo setBizProcess(GetBizEntityInfoResponseBodyBizEntityInfoBizProcess bizProcess) {
            this.bizProcess = bizProcess;
            return this;
        }
        public GetBizEntityInfoResponseBodyBizEntityInfoBizProcess getBizProcess() {
            return this.bizProcess;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfo setBizUnitId(Long bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfo setDataDomainId(Long dataDomainId) {
            this.dataDomainId = dataDomainId;
            return this;
        }
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        public GetBizEntityInfoResponseBodyBizEntityInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
