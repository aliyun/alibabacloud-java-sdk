// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobShrinkRequest extends TeaModel {
    /**
     * <p>The input of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleJob</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The scheduling settings.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The snapshot template configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SampleKey&quot;: &quot;SampleValue&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitDynamicImageJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobShrinkRequest self = new SubmitDynamicImageJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitDynamicImageJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitDynamicImageJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitDynamicImageJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitDynamicImageJobShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public SubmitDynamicImageJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
