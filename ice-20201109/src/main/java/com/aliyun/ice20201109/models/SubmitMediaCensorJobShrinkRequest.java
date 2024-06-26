// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hello world</p>
     */
    @NameInMap("Barrages")
    public String barrages;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.jpeg&quot;,&quot;RoleArn&quot;:&quot;acs:ram::1997018457688683:role/AliyunICEDefaultRole&quot;}]</p>
     */
    @NameInMap("CoverImages")
    public String coverImages;

    /**
     * <strong>example:</strong>
     * <p>example description</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>mns://125340688170****.oss-cn-shanghai.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <strong>example:</strong>
     * <p>oss://sashimi-cn-shanghai/censor/snapshot-{Count}.jpg</p>
     */
    @NameInMap("Output")
    public String output;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>S00000001-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>Hello World</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>UserDatatestid-001-****</p>
     */
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
