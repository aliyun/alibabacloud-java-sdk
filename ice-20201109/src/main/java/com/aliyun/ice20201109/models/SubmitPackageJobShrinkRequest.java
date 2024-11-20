// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPackageJobShrinkRequest extends TeaModel {
    /**
     * <p>The input of the job.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Inputs")
    public String inputsShrink;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>job-name</p>
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
     * <p>The user-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;param&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitPackageJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPackageJobShrinkRequest self = new SubmitPackageJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPackageJobShrinkRequest setInputsShrink(String inputsShrink) {
        this.inputsShrink = inputsShrink;
        return this;
    }
    public String getInputsShrink() {
        return this.inputsShrink;
    }

    public SubmitPackageJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitPackageJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitPackageJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitPackageJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
