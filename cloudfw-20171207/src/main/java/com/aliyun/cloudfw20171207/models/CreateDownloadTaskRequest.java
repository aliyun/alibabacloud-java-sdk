// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateDownloadTaskRequest extends TeaModel {
    /**
     * <p>The language of the content within the response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The query condition of the download task.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;SearchItem\&quot;:\&quot;\&quot;,\&quot;UserType\&quot;:\&quot;buy\&quot;,\&quot;IpVersion\&quot;:\&quot;4\&quot;}</p>
     */
    @NameInMap("TaskData")
    public String taskData;

    /**
     * <p>The type of the task. For more information about task types, see the descriptions in the &quot;DescribeDownloadTaskType&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewallAsset</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The time zone of the time information in the downloaded file. The value must be an identifier of a time zone in the Internet Assigned Numbers Authority (IANA) database. The default value is Asia/Shanghai, which indicates UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static CreateDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadTaskRequest self = new CreateDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDownloadTaskRequest setTaskData(String taskData) {
        this.taskData = taskData;
        return this;
    }
    public String getTaskData() {
        return this.taskData;
    }

    public CreateDownloadTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateDownloadTaskRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
