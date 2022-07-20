// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobShrinkRequest extends TeaModel {
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Input")
    public String inputShrink;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("Name")
    public String name;

    @NameInMap("Output")
    public String outputShrink;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitIProductionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobShrinkRequest self = new SubmitIProductionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobShrinkRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SubmitIProductionJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitIProductionJobShrinkRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitIProductionJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitIProductionJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitIProductionJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitIProductionJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitIProductionJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
