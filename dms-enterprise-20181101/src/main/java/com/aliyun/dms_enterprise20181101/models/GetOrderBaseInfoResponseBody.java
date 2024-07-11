// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOrderBaseInfoResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The basic information about the ticket.</p>
     */
    @NameInMap("OrderBaseInfo")
    public GetOrderBaseInfoResponseBodyOrderBaseInfo orderBaseInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7133DF67-5B25-460F-8285-C4CC93472C2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The Key of the ticket attachment. This information is returned only when an attachment is uploaded when a ticket is created.</p>
         * 
         * <strong>example:</strong>
         * <p>upload_order_info_856887_f356366f-f0f8-42fc-ba57-4a509303e814_18072d8a9bce876e3073bc655c2865f.png</p>
         */
        @NameInMap("AttachmentKey")
        public String attachmentKey;

        /**
         * <p>The remarks of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Committer")
        public String committer;

        /**
         * <p>The ID of the applicant. Note: The ID is different from the Alibaba Cloud account ID of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CommitterId")
        public Long committerId;

        /**
         * <p>The time when the ticket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-10 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the ticket was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-10 00:00:00</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <p>The ID of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The original file name of the ticket attachment. This information is returned only when an attachment is uploaded when a ticket is created.</p>
         * 
         * <strong>example:</strong>
         * <p>18072d8a9bce876e3073bc655c2865f.png</p>
         */
        @NameInMap("OriginAttachmentName")
        public String originAttachmentName;

        /**
         * <p>The type of the ticket. For more information about the value of this parameter, see the request parameters of the <a href="https://help.aliyun.com/document_detail/465865.html">CreateOrder</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>DC_COMMON</p>
         */
        @NameInMap("PluginType")
        public String pluginType;

        /**
         * <p>The IDs of the operators that are related to the ticket.</p>
         */
        @NameInMap("RelatedUserList")
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserList relatedUserList;

        /**
         * <p>The nicknames of the operators that are related to the ticket.</p>
         */
        @NameInMap("RelatedUserNickList")
        public GetOrderBaseInfoResponseBodyOrderBaseInfoRelatedUserNickList relatedUserNickList;

        /**
         * <p>The status code of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>new</strong>: The ticket is created.</li>
         * <li><strong>toaudit</strong>: The ticket is being reviewed.</li>
         * <li><strong>Approved</strong>: The ticket is approved.</li>
         * <li><strong>reject</strong>: The ticket is rejected.</li>
         * <li><strong>processing</strong>: The ticket is being executed.</li>
         * <li><strong>success</strong>: The ticket is executed.</li>
         * <li><strong>closed</strong>: The ticket is closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The ID of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        /**
         * <p>The description of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approved</p>
         */
        @NameInMap("WorkflowStatusDesc")
        public String workflowStatusDesc;

        public static GetOrderBaseInfoResponseBodyOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetOrderBaseInfoResponseBodyOrderBaseInfo self = new GetOrderBaseInfoResponseBodyOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setAttachmentKey(String attachmentKey) {
            this.attachmentKey = attachmentKey;
            return this;
        }
        public String getAttachmentKey() {
            return this.attachmentKey;
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

        public GetOrderBaseInfoResponseBodyOrderBaseInfo setOriginAttachmentName(String originAttachmentName) {
            this.originAttachmentName = originAttachmentName;
            return this;
        }
        public String getOriginAttachmentName() {
            return this.originAttachmentName;
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
