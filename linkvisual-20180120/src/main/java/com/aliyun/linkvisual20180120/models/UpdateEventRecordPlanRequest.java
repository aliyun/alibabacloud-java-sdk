// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateEventRecordPlanRequest extends TeaModel {
    /**
     * <p>The types of intelligent alert events. Valid values:</p>
     * <ul>
     * <li>0: All intelligent alert events.</li>
     * <li>Multiple intelligent alert events: Enter the sequence numbers of the intelligent alert events and separate them with commas (,), for example, <code>10001,10002</code>.<blockquote>
     * <p>You can specify up to 10 intelligent alert events at a time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>To view all types of intelligent alert events, log on to the IoT Platform console, go to the <strong>Product Details</strong> page, and click the <strong>Define Feature</strong> tab. For more information, see <a href="https://help.aliyun.com/document_detail/207701.html">View intelligent alert event types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EventTypes")
    public String eventTypes;

    /**
     * <p>The name of the video recording plan for intelligent alert events.</p>
     * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>record1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the video recording plan for intelligent alert events. You can call the <a href="https://help.aliyun.com/document_detail/107907.html">QueryEventRecordPlans</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b60bf0dd55944c19d7817442bc9****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The pre-recording duration. Valid values: 0 to 10. Unit: seconds.</p>
     * <blockquote>
     * <p>A pre-recording duration is generated only when the device supports the pre-recording feature. Otherwise, the pre-recording duration is 0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    /**
     * <p>The video recording duration, including the pre-recording duration. Valid values: 10 to 60. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RecordDuration")
    public Integer recordDuration;

    /**
     * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36f06322442e4e3f85a5ae8862c9****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventRecordPlanRequest self = new UpdateEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventRecordPlanRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public UpdateEventRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEventRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateEventRecordPlanRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public UpdateEventRecordPlanRequest setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    public UpdateEventRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
