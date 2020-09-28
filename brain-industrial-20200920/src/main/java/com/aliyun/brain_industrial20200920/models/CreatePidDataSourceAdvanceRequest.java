// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class CreatePidDataSourceAdvanceRequest extends TeaModel {
    @NameInMap("OssPathObject")
    @Validation(required = true)
    public java.io.InputStream ossPathObject;

    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

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

    public static CreatePidDataSourceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePidDataSourceAdvanceRequest self = new CreatePidDataSourceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePidDataSourceAdvanceRequest setOssPathObject(java.io.InputStream ossPathObject) {
        this.ossPathObject = ossPathObject;
        return this;
    }
    public java.io.InputStream getOssPathObject() {
        return this.ossPathObject;
    }

    public CreatePidDataSourceAdvanceRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public CreatePidDataSourceAdvanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreatePidDataSourceAdvanceRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePidDataSourceAdvanceRequest setOpenUpload(Integer openUpload) {
        this.openUpload = openUpload;
        return this;
    }
    public Integer getOpenUpload() {
        return this.openUpload;
    }

    public CreatePidDataSourceAdvanceRequest setNeedCreateTime(Integer needCreateTime) {
        this.needCreateTime = needCreateTime;
        return this;
    }
    public Integer getNeedCreateTime() {
        return this.needCreateTime;
    }

    public CreatePidDataSourceAdvanceRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public CreatePidDataSourceAdvanceRequest setSampleTime(Integer sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }
    public Integer getSampleTime() {
        return this.sampleTime;
    }

    public CreatePidDataSourceAdvanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
