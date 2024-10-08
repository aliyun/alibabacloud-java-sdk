// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorTaskRequest extends TeaModel {
    /**
     * <p>The name of the namespace.</p>
     * <p>The name can contain uppercase letters, lowercase letters, digits, and hyphens (-).</p>
     * <blockquote>
     * <p>This parameter is required only if you call this operation to delete metric import tasks for Alibaba Cloud services. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account.</p>
     * <blockquote>
     * <p>This parameter is required only if you use a management account to call this operation to query metric import tasks that belong to a member in a resource directory. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    /**
     * <p>The ID of the metric import task.</p>
     * <p>For information about how to obtain the ID of a metric import task, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
     * <blockquote>
     * <p>This parameter is required only if you call this operation to delete metrics for the logs that are imported from Log Service. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_sls</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>36****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteHybridMonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorTaskRequest self = new DeleteHybridMonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorTaskRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteHybridMonitorTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteHybridMonitorTaskRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public DeleteHybridMonitorTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
