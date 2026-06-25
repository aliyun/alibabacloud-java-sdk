// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetInstanceJobResponseBody extends TeaModel {
    /**
     * <p>The creation time in UTC, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The instance ID. For example, if a job creates a custom role, this parameter returns the corresponding role ID.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>12qb3</strong></strong></em></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
     */
    @NameInMap("InstanceJobId")
    public String instanceJobId;

    /**
     * <p>A message providing details about the job.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-example</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1e195c5116124202371861018d5bde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li><p>Creating: The job is being created.</p>
     * </li>
     * <li><p>Updating: The job is being updated.</p>
     * </li>
     * <li><p>Deleting: The job is being deleted.</p>
     * </li>
     * <li><p>Successful: The job completed successfully (a final state).</p>
     * </li>
     * <li><p>Failed: The job failed (a final state).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li><p>CreateWorkspaceCustomRole</p>
     * </li>
     * <li><p>UpdateWorkspaceCustomRole</p>
     * </li>
     * <li><p>DeleteWorkspaceCustomRole</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateWorkspaceCustomRole</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetInstanceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceJobResponseBody self = new GetInstanceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceJobResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceJobResponseBody setInstanceJobId(String instanceJobId) {
        this.instanceJobId = instanceJobId;
        return this;
    }
    public String getInstanceJobId() {
        return this.instanceJobId;
    }

    public GetInstanceJobResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetInstanceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceJobResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
