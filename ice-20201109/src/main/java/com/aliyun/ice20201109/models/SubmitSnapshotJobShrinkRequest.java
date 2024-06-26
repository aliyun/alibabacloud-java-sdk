// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test parameter&quot;: &quot;test value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSnapshotJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobShrinkRequest self = new SubmitSnapshotJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitSnapshotJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSnapshotJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitSnapshotJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitSnapshotJobShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public SubmitSnapshotJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
