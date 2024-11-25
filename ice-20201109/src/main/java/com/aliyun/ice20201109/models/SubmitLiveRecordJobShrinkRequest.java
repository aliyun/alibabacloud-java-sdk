// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveRecordJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the recording job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live stream record 1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/imsnotify">https://example.com/imsnotify</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The storage address of the recording.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordOutput")
    public String recordOutputShrink;

    /**
     * <p>The URL of the live stream.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public String streamInputShrink;

    /**
     * <p>The ID of the recording template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitLiveRecordJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveRecordJobShrinkRequest self = new SubmitLiveRecordJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveRecordJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitLiveRecordJobShrinkRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitLiveRecordJobShrinkRequest setRecordOutputShrink(String recordOutputShrink) {
        this.recordOutputShrink = recordOutputShrink;
        return this;
    }
    public String getRecordOutputShrink() {
        return this.recordOutputShrink;
    }

    public SubmitLiveRecordJobShrinkRequest setStreamInputShrink(String streamInputShrink) {
        this.streamInputShrink = streamInputShrink;
        return this;
    }
    public String getStreamInputShrink() {
        return this.streamInputShrink;
    }

    public SubmitLiveRecordJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
