// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitPackageJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Inputs")
    public String inputsShrink;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

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
