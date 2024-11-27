// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetWorkflowExtraInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenderAddApprovalNode")
    public Boolean renderAddApprovalNode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderAgree")
    public Boolean renderAgree;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderCancel")
    public Boolean renderCancel;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenderReject")
    public Boolean renderReject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderTransfer")
    public Boolean renderTransfer;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ThirdpartyWorkflowComment")
    public String thirdpartyWorkflowComment;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("ThirdpartyWorkflowUrl")
    public String thirdpartyWorkflowUrl;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <strong>example:</strong>
     * <p>184****</p>
     */
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    public static SetWorkflowExtraInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetWorkflowExtraInfoRequest self = new SetWorkflowExtraInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetWorkflowExtraInfoRequest setRenderAddApprovalNode(Boolean renderAddApprovalNode) {
        this.renderAddApprovalNode = renderAddApprovalNode;
        return this;
    }
    public Boolean getRenderAddApprovalNode() {
        return this.renderAddApprovalNode;
    }

    public SetWorkflowExtraInfoRequest setRenderAgree(Boolean renderAgree) {
        this.renderAgree = renderAgree;
        return this;
    }
    public Boolean getRenderAgree() {
        return this.renderAgree;
    }

    public SetWorkflowExtraInfoRequest setRenderCancel(Boolean renderCancel) {
        this.renderCancel = renderCancel;
        return this;
    }
    public Boolean getRenderCancel() {
        return this.renderCancel;
    }

    public SetWorkflowExtraInfoRequest setRenderReject(Boolean renderReject) {
        this.renderReject = renderReject;
        return this;
    }
    public Boolean getRenderReject() {
        return this.renderReject;
    }

    public SetWorkflowExtraInfoRequest setRenderTransfer(Boolean renderTransfer) {
        this.renderTransfer = renderTransfer;
        return this;
    }
    public Boolean getRenderTransfer() {
        return this.renderTransfer;
    }

    public SetWorkflowExtraInfoRequest setThirdpartyWorkflowComment(String thirdpartyWorkflowComment) {
        this.thirdpartyWorkflowComment = thirdpartyWorkflowComment;
        return this;
    }
    public String getThirdpartyWorkflowComment() {
        return this.thirdpartyWorkflowComment;
    }

    public SetWorkflowExtraInfoRequest setThirdpartyWorkflowUrl(String thirdpartyWorkflowUrl) {
        this.thirdpartyWorkflowUrl = thirdpartyWorkflowUrl;
        return this;
    }
    public String getThirdpartyWorkflowUrl() {
        return this.thirdpartyWorkflowUrl;
    }

    public SetWorkflowExtraInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public SetWorkflowExtraInfoRequest setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

}
