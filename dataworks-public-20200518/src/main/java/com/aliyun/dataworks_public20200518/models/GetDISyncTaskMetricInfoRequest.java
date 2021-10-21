// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskMetricInfoRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    public static GetDISyncTaskMetricInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskMetricInfoRequest self = new GetDISyncTaskMetricInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskMetricInfoRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDISyncTaskMetricInfoRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDISyncTaskMetricInfoRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetDISyncTaskMetricInfoRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

}
