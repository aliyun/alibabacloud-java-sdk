// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetInstanceJobResponseBody extends TeaModel {
    /**
     * <p>The creation time. The time is in UTC and follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Instance ID of the task instance. For example, in a task that creates a custom role, this is instance ID of the generated role.</p>
     * 
     * <strong>example:</strong>
     * <p><em><strong><strong>12qb3</strong></strong></em></p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateWorkspaceCustomRole-role-<em><strong>abc</strong></em>****</p>
     */
    @NameInMap("InstanceJobId")
    public String instanceJobId;

    /**
     * <p>The detailed description of the task.</p>
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
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Creating: The task is being created.</li>
     * <li>Updating: The task is being updated.</li>
     * <li>Deleting: The task is being deleted.</li>
     * <li>Successful: The task succeeded. This is a desired state.</li>
     * <li>Failed: The task failed. This is a desired state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>CreateWorkspaceCustomRole</li>
     * <li>UpdateWorkspaceCustomRole</li>
     * <li>DeleteWorkspaceCustomRole</li>
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
