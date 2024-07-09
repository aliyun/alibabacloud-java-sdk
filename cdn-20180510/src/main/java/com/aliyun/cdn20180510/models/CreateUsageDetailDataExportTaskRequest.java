// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The domain names. If you do not specify the Group parameter, resource usage details of these domain names are exported.</p>
     * <p>If you do not specify this parameter, resource usage details are exported based on accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The domain name group. If you specify this parameter, the <strong>DomainNames</strong> parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The language in which you want to export the file. Valid values:</p>
     * <ul>
     * <li><strong>zh-cn</strong>: Chinese. This is the default value.</li>
     * <li><strong>en-us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-us</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Refresh</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of resource usage data to query. Valid values:</p>
     * <ul>
     * <li><strong>flow</strong>: traffic and bandwidth</li>
     * <li><strong>vas</strong>: requests</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
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
