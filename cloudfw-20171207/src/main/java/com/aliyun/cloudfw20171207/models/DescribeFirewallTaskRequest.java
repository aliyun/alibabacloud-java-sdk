// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeFirewallTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vfw-tr-cd6000c588214403****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>199431783</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
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
