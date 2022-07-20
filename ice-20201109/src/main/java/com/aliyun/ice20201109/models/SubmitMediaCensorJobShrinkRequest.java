// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobShrinkRequest extends TeaModel {
    @NameInMap("Barrages")
    public String barrages;

    @NameInMap("CoverImages")
    public String coverImages;

    @NameInMap("Description")
    public String description;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("Output")
    public String output;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaCensorJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobShrinkRequest self = new SubmitMediaCensorJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobShrinkRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobShrinkRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitMediaCensorJobShrinkRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitMediaCensorJobShrinkRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitMediaCensorJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitMediaCensorJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitMediaCensorJobShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
