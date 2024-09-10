// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>3607****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether the returned result includes metric import tasks for Alibaba Cloud services. Valid values:</p>
     * <ul>
     * <li>true (default): The returned result includes metric import tasks for Alibaba Cloud services.</li>
     * <li>false: The returned result excludes metric import tasks for Alibaba Cloud services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeAliyunTask")
    public Boolean includeAliyunTask;

    /**
     * <p>The keyword that is used for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>task</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the namespace.</p>
     * <p>For information about how to obtain the name of a namespace, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Pages start from page 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account.</p>
     * <blockquote>
     * <p>This parameter is required only if you use a management account to call this operation to delete the metric import tasks that belong to a member in a resource directory. In this case, the <code>TaskType</code> parameter is set to <code>aliyun_fc</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    /**
     * <p>The ID of the metric import task.</p>
     * 
     * <strong>example:</strong>
     * <p>36****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The type of the metric import task. Valid values:</p>
     * <ul>
     * <li>aliyun_fc: metric import tasks for Alibaba Cloud services</li>
     * <li>aliyun_sls: metrics for logs imported from Log Service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun_fc</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeHybridMonitorTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorTaskListRequest self = new DescribeHybridMonitorTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorTaskListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeHybridMonitorTaskListRequest setIncludeAliyunTask(Boolean includeAliyunTask) {
        this.includeAliyunTask = includeAliyunTask;
        return this;
    }
    public Boolean getIncludeAliyunTask() {
        return this.includeAliyunTask;
    }

    public DescribeHybridMonitorTaskListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeHybridMonitorTaskListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeHybridMonitorTaskListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorTaskListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridMonitorTaskListRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public DescribeHybridMonitorTaskListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHybridMonitorTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
