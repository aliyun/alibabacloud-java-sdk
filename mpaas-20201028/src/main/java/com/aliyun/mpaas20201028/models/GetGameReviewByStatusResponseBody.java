// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetGameReviewByStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public GetGameReviewByStatusResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetGameReviewByStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameReviewByStatusResponseBody self = new GetGameReviewByStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameReviewByStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameReviewByStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetGameReviewByStatusResponseBody setResultContent(GetGameReviewByStatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetGameReviewByStatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public GetGameReviewByStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetGameReviewByStatusResponseBodyResultContentContentReviewProgress extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("FlowNodeId")
        public Long flowNodeId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("NodeIndex")
        public Integer nodeIndex;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("NodeStatusId")
        public Integer nodeStatusId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RoleId")
        public Long roleId;

        public static GetGameReviewByStatusResponseBodyResultContentContentReviewProgress build(java.util.Map<String, ?> map) throws Exception {
            GetGameReviewByStatusResponseBodyResultContentContentReviewProgress self = new GetGameReviewByStatusResponseBodyResultContentContentReviewProgress();
            return TeaModel.build(map, self);
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setFlowNodeId(Long flowNodeId) {
            this.flowNodeId = flowNodeId;
            return this;
        }
        public Long getFlowNodeId() {
            return this.flowNodeId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setNodeIndex(Integer nodeIndex) {
            this.nodeIndex = nodeIndex;
            return this;
        }
        public Integer getNodeIndex() {
            return this.nodeIndex;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setNodeStatusId(Integer nodeStatusId) {
            this.nodeStatusId = nodeStatusId;
            return this;
        }
        public Integer getNodeStatusId() {
            return this.nodeStatusId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentReviewProgress setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }
        public Long getRoleId() {
            return this.roleId;
        }

    }

    public static class GetGameReviewByStatusResponseBodyResultContentContentTargetDetail extends TeaModel {
        @NameInMap("AutoOnline")
        public Boolean autoOnline;

        @NameInMap("Category")
        public String category;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("GameMaker")
        public String gameMaker;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Introduction")
        public String introduction;

        @NameInMap("MiniProgramCode")
        public String miniProgramCode;

        @NameInMap("MiniProgramInfoId")
        public Long miniProgramInfoId;

        @NameInMap("MiniProgramName")
        public String miniProgramName;

        @NameInMap("MiniResourceId")
        public Long miniResourceId;

        @NameInMap("PublishStatus")
        public Integer publishStatus;

        @NameInMap("QrCodeUrl")
        public String qrCodeUrl;

        @NameInMap("ReviewTargetType")
        public String reviewTargetType;

        @NameInMap("SubType")
        public Integer subType;

        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("Version")
        public String version;

        public static GetGameReviewByStatusResponseBodyResultContentContentTargetDetail build(java.util.Map<String, ?> map) throws Exception {
            GetGameReviewByStatusResponseBodyResultContentContentTargetDetail self = new GetGameReviewByStatusResponseBodyResultContentContentTargetDetail();
            return TeaModel.build(map, self);
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setAutoOnline(Boolean autoOnline) {
            this.autoOnline = autoOnline;
            return this;
        }
        public Boolean getAutoOnline() {
            return this.autoOnline;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setGameMaker(String gameMaker) {
            this.gameMaker = gameMaker;
            return this;
        }
        public String getGameMaker() {
            return this.gameMaker;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setMiniProgramCode(String miniProgramCode) {
            this.miniProgramCode = miniProgramCode;
            return this;
        }
        public String getMiniProgramCode() {
            return this.miniProgramCode;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setMiniProgramInfoId(Long miniProgramInfoId) {
            this.miniProgramInfoId = miniProgramInfoId;
            return this;
        }
        public Long getMiniProgramInfoId() {
            return this.miniProgramInfoId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setMiniProgramName(String miniProgramName) {
            this.miniProgramName = miniProgramName;
            return this;
        }
        public String getMiniProgramName() {
            return this.miniProgramName;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setMiniResourceId(Long miniResourceId) {
            this.miniResourceId = miniResourceId;
            return this;
        }
        public Long getMiniResourceId() {
            return this.miniResourceId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setQrCodeUrl(String qrCodeUrl) {
            this.qrCodeUrl = qrCodeUrl;
            return this;
        }
        public String getQrCodeUrl() {
            return this.qrCodeUrl;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setReviewTargetType(String reviewTargetType) {
            this.reviewTargetType = reviewTargetType;
            return this;
        }
        public String getReviewTargetType() {
            return this.reviewTargetType;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setSubType(Integer subType) {
            this.subType = subType;
            return this;
        }
        public Integer getSubType() {
            return this.subType;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetGameReviewByStatusResponseBodyResultContentContent extends TeaModel {
        @NameInMap("Appendix")
        public String appendix;

        @NameInMap("AutoOnline")
        public Boolean autoOnline;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("FlowId")
        public Long flowId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Icons")
        public java.util.List<String> icons;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ReviewChannel")
        public String reviewChannel;

        @NameInMap("ReviewIntegerStatus")
        public Integer reviewIntegerStatus;

        @NameInMap("ReviewProgress")
        public java.util.List<GetGameReviewByStatusResponseBodyResultContentContentReviewProgress> reviewProgress;

        @NameInMap("ReviewStatus")
        public String reviewStatus;

        @NameInMap("ReviewTarget")
        public Long reviewTarget;

        @NameInMap("TargetDetail")
        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail targetDetail;

        @NameInMap("TargetType")
        public String targetType;

        public static GetGameReviewByStatusResponseBodyResultContentContent build(java.util.Map<String, ?> map) throws Exception {
            GetGameReviewByStatusResponseBodyResultContentContent self = new GetGameReviewByStatusResponseBodyResultContentContent();
            return TeaModel.build(map, self);
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setAppendix(String appendix) {
            this.appendix = appendix;
            return this;
        }
        public String getAppendix() {
            return this.appendix;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setAutoOnline(Boolean autoOnline) {
            this.autoOnline = autoOnline;
            return this;
        }
        public Boolean getAutoOnline() {
            return this.autoOnline;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setIcons(java.util.List<String> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<String> getIcons() {
            return this.icons;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setReviewChannel(String reviewChannel) {
            this.reviewChannel = reviewChannel;
            return this;
        }
        public String getReviewChannel() {
            return this.reviewChannel;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setReviewIntegerStatus(Integer reviewIntegerStatus) {
            this.reviewIntegerStatus = reviewIntegerStatus;
            return this;
        }
        public Integer getReviewIntegerStatus() {
            return this.reviewIntegerStatus;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setReviewProgress(java.util.List<GetGameReviewByStatusResponseBodyResultContentContentReviewProgress> reviewProgress) {
            this.reviewProgress = reviewProgress;
            return this;
        }
        public java.util.List<GetGameReviewByStatusResponseBodyResultContentContentReviewProgress> getReviewProgress() {
            return this.reviewProgress;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setReviewStatus(String reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }
        public String getReviewStatus() {
            return this.reviewStatus;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setReviewTarget(Long reviewTarget) {
            this.reviewTarget = reviewTarget;
            return this;
        }
        public Long getReviewTarget() {
            return this.reviewTarget;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setTargetDetail(GetGameReviewByStatusResponseBodyResultContentContentTargetDetail targetDetail) {
            this.targetDetail = targetDetail;
            return this;
        }
        public GetGameReviewByStatusResponseBodyResultContentContentTargetDetail getTargetDetail() {
            return this.targetDetail;
        }

        public GetGameReviewByStatusResponseBodyResultContentContent setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class GetGameReviewByStatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Content")
        public java.util.List<GetGameReviewByStatusResponseBodyResultContentContent> content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetGameReviewByStatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetGameReviewByStatusResponseBodyResultContent self = new GetGameReviewByStatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetGameReviewByStatusResponseBodyResultContent setContent(java.util.List<GetGameReviewByStatusResponseBodyResultContentContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetGameReviewByStatusResponseBodyResultContentContent> getContent() {
            return this.content;
        }

        public GetGameReviewByStatusResponseBodyResultContent setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetGameReviewByStatusResponseBodyResultContent setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetGameReviewByStatusResponseBodyResultContent setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetGameReviewByStatusResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetGameReviewByStatusResponseBodyResultContent setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public GetGameReviewByStatusResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetGameReviewByStatusResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
