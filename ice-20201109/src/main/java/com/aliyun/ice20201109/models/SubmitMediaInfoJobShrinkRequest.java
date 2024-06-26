// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <strong>example:</strong>
     * <p>job-name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>user-data</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaInfoJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobShrinkRequest self = new SubmitMediaInfoJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitMediaInfoJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitMediaInfoJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitMediaInfoJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
