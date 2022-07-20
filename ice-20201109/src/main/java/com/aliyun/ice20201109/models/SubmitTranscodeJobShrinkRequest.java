// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTranscodeJobShrinkRequest extends TeaModel {
    // 任务输入组 (目前只支持一个)
    @NameInMap("InputGroup")
    public String inputGroupShrink;

    // 任务名字
    @NameInMap("Name")
    public String name;

    // 任务输出组
    @NameInMap("OutputGroup")
    public String outputGroupShrink;

    // 任务调度信息
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    // 用户数据
    @NameInMap("UserData")
    public String userData;

    public static SubmitTranscodeJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranscodeJobShrinkRequest self = new SubmitTranscodeJobShrinkRequest();
        return TeaModel.build(map, self);
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
