// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskShrinkRequest extends TeaModel {
    /**
     * <p>The concurrent rate for automated outbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    /**
     * <p>The job description. It can contain 0 to 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>房产销售</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The job execution time.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TUESDAY&quot;:[{&quot;start&quot;:&quot;06:00&quot;,&quot;end&quot;:&quot;06:05&quot;}],&quot;MONDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;},{&quot;start&quot;:&quot;20:30&quot;,&quot;end&quot;:&quot;21:45&quot;},{&quot;start&quot;:&quot;22:30&quot;,&quot;end&quot;:&quot;22:50&quot;}],&quot;WEDNESDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;THURSDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;FRIDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SATURDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SUNDAY&quot;:[{&quot;start&quot;:&quot;17:00&quot;,&quot;end&quot;:&quot;23:45&quot;}]}</p>
     */
    @NameInMap("ExecutionTime")
    public String executionTime;

    /**
     * <p>Fixed dialing ratio for predictive outbound calls. Valid values: <strong>≥1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    /**
     * <p>The skill group ID (for predictive outbound calls) or IVR ID (for automated outbound calls).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("HandlerId")
    public Long handlerId;

    /**
     * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Job name. Length: 1 to 15 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx外呼</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The policy for handling duplicate callee numbers.</p>
     * <ul>
     * <li><strong>0</strong>: Remove duplicates within the job.</li>
     * <li><strong>1</strong>: Do not remove duplicates within the job.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    /**
     * <p>Outbound caller numbers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutboundNums")
    public String outboundNumsShrink;

    /**
     * <p>Failed-call retry policy.</p>
     * <blockquote>
     * <p>If empty, no retry is performed when an outbound call fails.</p>
     * </blockquote>
     */
    @NameInMap("RecallRule")
    public String recallRuleShrink;

    /**
     * <p>The job ID.</p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateAiOutboundTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskShrinkRequest self = new UpdateAiOutboundTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskShrinkRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public UpdateAiOutboundTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAiOutboundTaskShrinkRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public UpdateAiOutboundTaskShrinkRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public UpdateAiOutboundTaskShrinkRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public UpdateAiOutboundTaskShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAiOutboundTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAiOutboundTaskShrinkRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public UpdateAiOutboundTaskShrinkRequest setOutboundNumsShrink(String outboundNumsShrink) {
        this.outboundNumsShrink = outboundNumsShrink;
        return this;
    }
    public String getOutboundNumsShrink() {
        return this.outboundNumsShrink;
    }

    public UpdateAiOutboundTaskShrinkRequest setRecallRuleShrink(String recallRuleShrink) {
        this.recallRuleShrink = recallRuleShrink;
        return this;
    }
    public String getRecallRuleShrink() {
        return this.recallRuleShrink;
    }

    public UpdateAiOutboundTaskShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
