// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidDataSourceRequest extends TeaModel {
    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("OssPath")
    @Validation(required = true)
    public String ossPath;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("OpenUpload")
    public Integer openUpload;

    @NameInMap("NeedCreateTime")
    @Validation(required = true)
    public Integer needCreateTime;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("SampleTime")
    public Integer sampleTime;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CreatePidDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidDataSourceRequest self = new CreatePidDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidDataSourceRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public CreatePidDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePidDataSourceRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreatePidDataSourceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePidDataSourceRequest setOpenUpload(Integer openUpload) {
        this.openUpload = openUpload;
        return this;
    }
    public Integer getOpenUpload() {
        return this.openUpload;
    }

    public CreatePidDataSourceRequest setNeedCreateTime(Integer needCreateTime) {
        this.needCreateTime = needCreateTime;
        return this;
    }
    public Integer getNeedCreateTime() {
        return this.needCreateTime;
    }

    public CreatePidDataSourceRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreatePidDataSourceRequest setSampleTime(Integer sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }
    public Integer getSampleTime() {
        return this.sampleTime;
    }

    public CreatePidDataSourceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
