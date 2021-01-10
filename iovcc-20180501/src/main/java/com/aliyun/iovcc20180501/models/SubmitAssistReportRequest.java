// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class SubmitAssistReportRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AssistId")
    public String assistId;

    @NameInMap("AssistDescription")
    public String assistDescription;

    @NameInMap("AssistResult")
    public String assistResult;

    @NameInMap("AssistTag")
    public String assistTag;

    @NameInMap("AssistReason")
    public String assistReason;

    @NameInMap("DeviceModel")
    public String deviceModel;

    public static SubmitAssistReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAssistReportRequest self = new SubmitAssistReportRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAssistReportRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitAssistReportRequest setAssistId(String assistId) {
        this.assistId = assistId;
        return this;
    }
    public String getAssistId() {
        return this.assistId;
    }

    public SubmitAssistReportRequest setAssistDescription(String assistDescription) {
        this.assistDescription = assistDescription;
        return this;
    }
    public String getAssistDescription() {
        return this.assistDescription;
    }

    public SubmitAssistReportRequest setAssistResult(String assistResult) {
        this.assistResult = assistResult;
        return this;
    }
    public String getAssistResult() {
        return this.assistResult;
    }

    public SubmitAssistReportRequest setAssistTag(String assistTag) {
        this.assistTag = assistTag;
        return this;
    }
    public String getAssistTag() {
        return this.assistTag;
    }

    public SubmitAssistReportRequest setAssistReason(String assistReason) {
        this.assistReason = assistReason;
        return this;
    }
    public String getAssistReason() {
        return this.assistReason;
    }

    public SubmitAssistReportRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

}
