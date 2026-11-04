// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateEventRecordPlanRequest extends TeaModel {
    /**
     * <p>The types of intelligent alert events. Valid values:</p>
     * <ul>
     * <li>0: all intelligent alert events.</li>
     * <li>Multiple intelligent alert events: enter the sequence numbers of the intelligent alert events and separate them with commas (,). Example: <code>10001,10002</code>.<blockquote>
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
     * <p>The name of the recording plan.</p>
     * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pre-recording duration in seconds. Default value: 0. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    /**
     * <p>The recording duration in seconds, including the pre-recording duration. Valid values: 10 to 60.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RecordDuration")
    public Integer recordDuration;

    /**
     * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fc82774fa749485bad7d719f9670****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRecordPlanRequest self = new CreateEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRecordPlanRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public CreateEventRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEventRecordPlanRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public CreateEventRecordPlanRequest setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    public CreateEventRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
