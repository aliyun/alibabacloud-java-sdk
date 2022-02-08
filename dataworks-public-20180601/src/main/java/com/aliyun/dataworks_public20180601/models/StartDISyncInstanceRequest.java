// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceRequest extends TeaModel {
    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("StartDateTime")
    public String startDateTime;

    @NameInMap("TimeZone")
    public String timeZone;

    public static StartDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceRequest self = new StartDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public StartDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public StartDISyncInstanceRequest setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }
    public String getStartDateTime() {
        return this.startDateTime;
    }

    public StartDISyncInstanceRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
