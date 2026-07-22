// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTaskRequest extends TeaModel {
    /**
     * <p>The VPC-connected instance ID. You must specify at least one of TaskId and ChildInstanceId. If neither is specified, the API returns ErrorParameters(400).</p>
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
     * <p>The task ID. You must specify at least one of TaskId and ChildInstanceId. If neither is specified, the API returns ErrorParameters(400).</p>
     * 
     * <strong>example:</strong>
     * <p>199431783</p>
     */
    @NameInMap("TaskId")
    public String taskId;

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

    public DescribeFirewallTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
