// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Group")
    public String group;

    @NameInMap("Language")
    public String language;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("Type")
    public String type;

    public static CreateUsageDetailDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUsageDetailDataExportTaskRequest self = new CreateUsageDetailDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUsageDetailDataExportTaskRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public CreateUsageDetailDataExportTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateUsageDetailDataExportTaskRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateUsageDetailDataExportTaskRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateUsageDetailDataExportTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateUsageDetailDataExportTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateUsageDetailDataExportTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
