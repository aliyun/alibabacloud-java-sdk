// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>Call string (callee information and parameter list). Valid values:</p>
     * <ul>
     * <li><strong>LIST</strong>: <code>05715678****,05715679****</code></li>
     * <li><strong>JSON</strong>: <code>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;1810000****&quot;,&quot;Params&quot;:[&quot;Zhang San&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;1810001****&quot;,&quot;Params&quot;:[&quot;Li Si&quot;,&quot;21&quot;]}]}</code>. In this example, ParamNames represents the List of Parameter Names; Params represents the List of parameter values.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The order of the Parameter Name List and the parameter value List must correspond.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>A maximum of 1 000 callee numbers is allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ParamNames&quot;:[&quot;name&quot;,&quot;age&quot;],&quot;CalleeList&quot;:[{&quot;Callee&quot;:&quot;1810000****&quot;,&quot;Params&quot;:[&quot;张三&quot;,&quot;20&quot;]},{&quot;Callee&quot;:&quot;1810001****&quot;,&quot;Params&quot;:[&quot;李四&quot;,&quot;21&quot;]}]}</p>
     */
    @NameInMap("CallString")
    public String callString;

    /**
     * <p>Call string type. Valid values:  </p>
     * <ul>
     * <li><strong>LIST</strong>  </li>
     * <li><strong>JSON</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("CallStringType")
    public String callStringType;

    /**
     * <p>Outbound caller number.</p>
     * <blockquote>
     * <p>The number must be a purchased number. Separate multiple numbers with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571<strong><strong>5678,0571</strong></strong>5679</p>
     */
    @NameInMap("Caller")
    public String caller;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Retry Count.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RetryCount")
    public Integer retryCount;

    /**
     * <p>Whether to enable automatic retry. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Retry.</li>
     * <li><strong>0</strong>: No retry.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RetryFlag")
    public Integer retryFlag;

    /**
     * <p>Retry interval. Unit: minute. Must be greater than 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RetryInterval")
    public Integer retryInterval;

    /**
     * <p>Call statuses that require redialing. Separate multiple statuses with commas (,). Valid values:  </p>
     * <ul>
     * <li><strong>200010</strong>: Power off  </li>
     * <li><strong>200011</strong>: Service suspended  </li>
     * <li><strong>200002</strong>: Busy  </li>
     * <li><strong>200012</strong>: Call failed  </li>
     * <li><strong>200005</strong>: Unable to connect  </li>
     * <li><strong>200003</strong>: No acknowledgement</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200010,200011</p>
     */
    @NameInMap("RetryStatusCode")
    public String retryStatusCode;

    /**
     * <p>ID of the specified robot (script ID), indicating which robot script to use for initiating calls.  </p>
     * <p>You can obtain the script ID on the <a href="https://aiccs.console.aliyun.com/patter/list">Script Management</a> page in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("RobotId")
    public String robotId;

    /**
     * <p>Concurrency (number of agents).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SeatCount")
    public String seatCount;

    /**
     * <p>Indicates whether to start immediately.  </p>
     * <ul>
     * <li><strong>true</strong>: Yes.  </li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>是</p>
     */
    @NameInMap("StartNow")
    public Boolean startNow;

    /**
     * <p>Task Name. Supports Chinese and English characters. Length: 0 to 30 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Work day. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Monday.</li>
     * <li><strong>2</strong>: Tuesday.</li>
     * <li><strong>3</strong>: Wednesday.</li>
     * <li><strong>4</strong>: Thursday.</li>
     * <li><strong>5</strong>: Friday.</li>
     * <li><strong>6</strong>: Saturday.</li>
     * <li><strong>7</strong>: Sunday.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkDay")
    public String workDay;

    /**
     * <p>List of working hours (accurate to the minute).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10:00-12:00,13:00-14:00</p>
     */
    @NameInMap("WorkTimeList")
    public String workTimeList;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setCallString(String callString) {
        this.callString = callString;
        return this;
    }
    public String getCallString() {
        return this.callString;
    }

    public CreateTaskRequest setCallStringType(String callStringType) {
        this.callStringType = callStringType;
        return this;
    }
    public String getCallStringType() {
        return this.callStringType;
    }

    public CreateTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public CreateTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTaskRequest setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }
    public Integer getRetryCount() {
        return this.retryCount;
    }

    public CreateTaskRequest setRetryFlag(Integer retryFlag) {
        this.retryFlag = retryFlag;
        return this;
    }
    public Integer getRetryFlag() {
        return this.retryFlag;
    }

    public CreateTaskRequest setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    public CreateTaskRequest setRetryStatusCode(String retryStatusCode) {
        this.retryStatusCode = retryStatusCode;
        return this;
    }
    public String getRetryStatusCode() {
        return this.retryStatusCode;
    }

    public CreateTaskRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public CreateTaskRequest setSeatCount(String seatCount) {
        this.seatCount = seatCount;
        return this;
    }
    public String getSeatCount() {
        return this.seatCount;
    }

    public CreateTaskRequest setStartNow(Boolean startNow) {
        this.startNow = startNow;
        return this;
    }
    public Boolean getStartNow() {
        return this.startNow;
    }

    public CreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateTaskRequest setWorkDay(String workDay) {
        this.workDay = workDay;
        return this;
    }
    public String getWorkDay() {
        return this.workDay;
    }

    public CreateTaskRequest setWorkTimeList(String workTimeList) {
        this.workTimeList = workTimeList;
        return this;
    }
    public String getWorkTimeList() {
        return this.workTimeList;
    }

}
