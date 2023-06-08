// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The domain names. If you do not specify the Group parameter, resource usage details of these domain names are exported.</p>
     * <br>
     * <p>If you do not specify this parameter, resource usage details are exported based on accounts.</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The domain name group. If you specify this parameter, the **DomainNames** parameter is ignored.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The language in which you want to export the file. Valid values:</p>
     * <br>
     * <p>*   **zh-cn**: Chinese. This is the default value.</p>
     * <p>*   **en-us**: English</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of resource usage data to query. Valid values:</p>
     * <br>
     * <p>*   **flow**: traffic and bandwidth</p>
     * <p>*   **vas**: requests</p>
     */
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
