// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTaskRequest extends TeaModel {
    /**
     * <p>The ID of the child instance. You must specify at least one of ChildInstanceId and TaskId. If both are empty, the MissingParameter.TaskId (-360448) error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-cd6000c588214403****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the task. You must specify at least one of TaskId and ChildInstanceId. If both are empty, the MissingParameter.TaskId (-360448, At least one of TaskId or ChildInstanceId is required.) error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>199431783</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The action of the task, which is used to filter tasks by action. Valid values: init, open, close, delete, and change_route. This parameter takes effect only when TaskType is set to NAT. If TaskId is specified, this parameter is ignored. If this parameter is not specified, the most recently started task of the instance is retrieved, regardless of the action.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>NAT</strong>: NAT firewall task</p>
     * </li>
     * <li><p><strong>VPC</strong>: VPC firewall task</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeFirewallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirewallTaskRequest self = new DescribeFirewallTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFirewallTaskRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DescribeFirewallTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFirewallTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeFirewallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeFirewallTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
