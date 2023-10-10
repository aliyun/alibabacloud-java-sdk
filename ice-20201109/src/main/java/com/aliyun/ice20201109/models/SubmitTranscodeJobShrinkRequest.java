// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InputGroup")
    public String inputGroupShrink;

    @NameInMap("Name")
    public String name;

    @NameInMap("OutputGroup")
    public String outputGroupShrink;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobShrinkRequest self = new SubmitTranscodeJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranscodeJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitTranscodeJobShrinkRequest setInputGroupShrink(String inputGroupShrink) {
        this.inputGroupShrink = inputGroupShrink;
        return this;
    }
    public String getInputGroupShrink() {
        return this.inputGroupShrink;
    }

    public SubmitTranscodeJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitTranscodeJobShrinkRequest setOutputGroupShrink(String outputGroupShrink) {
        this.outputGroupShrink = outputGroupShrink;
        return this;
    }
    public String getOutputGroupShrink() {
        return this.outputGroupShrink;
    }

    public SubmitTranscodeJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitTranscodeJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
