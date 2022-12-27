// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskRequest extends TeaModel {
    // The accelerated domain names based on which the resource usage details are generated. If you do not specify a domain name group, resource usage details are exported based on this parameter.
    // 
    // If you do not set this parameter, resource usage details are exported based on user accounts.
    @NameInMap("DomainNames")
    public String domainNames;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The group of accelerated domain names based on which the resource usage details are generated. If you set this parameter, ignore the **DomainNames** parameter.
    @NameInMap("Group")
    public String group;

    // The language of the exported file. Valid values:
    // 
    // *   **zh-cn**: Chinese. This is the default value.
    // *   **en-us**: English
    @NameInMap("Language")
    public String language;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("StartTime")
    public String startTime;

    // The name of the task.
    @NameInMap("TaskName")
    public String taskName;

    // The type of content based on which the data is generated. Valid values:
    // 
    // *   **flow**: network traffic and bandwidth
    // *   **vas**: requests
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

    public CreateUsageDetailDataExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
