// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskShrinkRequest extends TeaModel {
    /**
     * <p>Concurrent call rate for automated outbound calls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    /**
     * <p>Job description. Length: 0 to 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>房产销售</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Job execution time, in JSON format.</p>
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
     * <p>Fixed outbound ratio for predictive dialing. Valid values: <strong>≥1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.5</p>
     */
    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    /**
     * <p>The skill group ID (for predictive outbound calls) or IVR ID (for automated outbound calls). You can obtain this information in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("HandlerId")
    public Long handlerId;

    /**
     * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Job name. Length: 1 to 15 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Called number deduplication policy. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Remove duplicates within the job.</li>
     * <li><strong>1</strong>: Do not remove duplicates.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    /**
     * <p>Outbound caller numbers.  </p>
     * <blockquote>
     * <p>Must be purchased numbers. Separate multiple numbers with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutboundNums")
    public String outboundNumsShrink;

    /**
     * <p>Failed call retry policy.  </p>
     * <blockquote>
     * <p>If empty, no retries are performed.</p>
     * </blockquote>
     */
    @NameInMap("RecallRule")
    public String recallRuleShrink;

    /**
     * <p>Task Type. Valid values:  </p>
     * <ul>
     * <li><strong>2</strong>: Predictive outbound call.  </li>
     * <li><strong>3</strong>: Automated outbound call.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateAiOutboundTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskShrinkRequest self = new CreateAiOutboundTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskShrinkRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public CreateAiOutboundTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAiOutboundTaskShrinkRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public CreateAiOutboundTaskShrinkRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public CreateAiOutboundTaskShrinkRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public CreateAiOutboundTaskShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAiOutboundTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAiOutboundTaskShrinkRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public CreateAiOutboundTaskShrinkRequest setOutboundNumsShrink(String outboundNumsShrink) {
        this.outboundNumsShrink = outboundNumsShrink;
        return this;
    }
    public String getOutboundNumsShrink() {
        return this.outboundNumsShrink;
    }

    public CreateAiOutboundTaskShrinkRequest setRecallRuleShrink(String recallRuleShrink) {
        this.recallRuleShrink = recallRuleShrink;
        return this;
    }
    public String getRecallRuleShrink() {
        return this.recallRuleShrink;
    }

    public CreateAiOutboundTaskShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
