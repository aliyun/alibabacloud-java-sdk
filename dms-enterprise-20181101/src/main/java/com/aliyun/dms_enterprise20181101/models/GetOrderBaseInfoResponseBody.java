// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOrderBaseInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("OrderBaseInfo")
    public GetOrderBaseInfoResponseBodyOrderBaseInfo orderBaseInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOrderBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderBaseInfoResponseBody self = new GetOrderBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderBaseInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOrderBaseInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOrderBaseInfoResponseBody setOrderBaseInfo(GetOrderBaseInfoResponseBodyOrderBaseInfo orderBaseInfo) {
        this.orderBaseInfo = orderBaseInfo;
        return this;
    }
    public GetOrderBaseInfoResponseBodyOrderBaseInfo getOrderBaseInfo() {
        return this.orderBaseInfo;
    }

    public GetOrderBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList extends TeaModel {
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList build(java.util.Map<String, ?> map) throws Exception {
            GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList self = new GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList();
            return TeaModel.build(map, self);
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList extends TeaModel {
        @NameInMap("UserNicks")
        public java.util.List<String> userNicks;

        public static GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList build(java.util.Map<String, ?> map) throws Exception {
            GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList self = new GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList();
            return TeaModel.build(map, self);
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList setUserNicks(java.util.List<String> userNicks) {
            this.userNicks = userNicks;
            return this;
        }
        public java.util.List<String> getUserNicks() {
            return this.userNicks;
        }

    }

    public static class GetOrderBaseInfoResponseBodyOrderBaseInfo extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CommitterId")
        public Long committerId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("RelatedUserList")
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList relatedUserList;

        @NameInMap("RelatedUserNickList")
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList relatedUserNickList;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        @NameInMap("WorkflowStatusDesc")
        public String workflowStatusDesc;

        public static GetOrderBaseInfoResponseBodyOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOrderBaseInfoResponseBodyOrderBaseInfo self = new GetOrderBaseInfoResponseBodyOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setCommitterId(Long committerId) {
            this.committerId = committerId;
            return this;
        }
        public Long getCommitterId() {
            return this.committerId;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setRelatedUserList(GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList relatedUserList) {
            this.relatedUserList = relatedUserList;
            return this;
        }
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList getRelatedUserList() {
            return this.relatedUserList;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setRelatedUserNickList(GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList relatedUserNickList) {
            this.relatedUserNickList = relatedUserNickList;
            return this;
        }
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList getRelatedUserNickList() {
            return this.relatedUserNickList;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setWorkflowStatusDesc(String workflowStatusDesc) {
            this.workflowStatusDesc = workflowStatusDesc;
            return this;
        }
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

    }

}
