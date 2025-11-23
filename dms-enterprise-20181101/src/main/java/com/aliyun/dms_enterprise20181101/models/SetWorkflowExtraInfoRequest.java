// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetWorkflowExtraInfoRequest extends TeaModel {
    /**
     * <p>Specifies whether the Sign button is displayed in the ticket approval section of the DMS console for a third-party approval workflow. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): The Sign button is displayed.</li>
     * <li><strong>false</strong>: The Sign button is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenderAddApprovalNode")
    public Boolean renderAddApprovalNode;

    /**
     * <p>Specifies whether the Agree button is displayed in the ticket approval section of the DMS console for a third-party approval workflow. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): The Agree button is displayed.</li>
     * <li><strong>false</strong>: The Agree button is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderAgree")
    public Boolean renderAgree;

    /**
     * <p>Specifies whether the Revoke button is displayed in the ticket approval section of the DMS console for a third-party approval workflow. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): The Revoke button is displayed.</li>
     * <li><strong>false</strong>: The Revoke button is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderCancel")
    public Boolean renderCancel;

    /**
     * <p>Specifies whether the Reject button is displayed in the ticket approval section of the DMS console for a third-party approval workflow. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): The Reject button is displayed.</li>
     * <li><strong>false</strong>: The Reject button is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RenderReject")
    public Boolean renderReject;

    /**
     * <p>Specifies whether the Forward button is displayed in the ticket approval section of the DMS console for a third-party approval workflow. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): The Forward button is displayed.</li>
     * <li><strong>false</strong>: The Forward button is not displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RenderTransfer")
    public Boolean renderTransfer;

    /**
     * <p>The remarks of approval workflow for third parties.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ThirdpartyWorkflowComment")
    public String thirdpartyWorkflowComment;

    /**
     * <p>The link of approval workflow for third parties.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx">https://xxx</a></p>
     */
    @NameInMap("ThirdpartyWorkflowUrl")
    public String thirdpartyWorkflowUrl;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, go to the DMS console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the approval workflow. You can call the <a href="https://help.aliyun.com/document_detail/144642.html">GetOrderBaseInfo</a> operation to query the ID of the approval workflow.</p>
     * <p>This parameter is required.</p>
     * 
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
