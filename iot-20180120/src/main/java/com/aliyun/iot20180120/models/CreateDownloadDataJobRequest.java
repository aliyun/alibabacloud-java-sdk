// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobRequest extends TeaModel {
    @NameInMap("DownloadDataType")
    public String downloadDataType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("FileConfig")
    public java.util.Map<String, ?> fileConfig;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TableName")
    public String tableName;

    public static CreateDownloadDataJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadDataJobRequest self = new CreateDownloadDataJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadDataJobRequest setDownloadDataType(String downloadDataType) {
        this.downloadDataType = downloadDataType;
        return this;
    }
    public String getDownloadDataType() {
        return this.downloadDataType;
    }

    public CreateDownloadDataJobRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDownloadDataJobRequest setFileConfig(java.util.Map<String, ?> fileConfig) {
        this.fileConfig = fileConfig;
        return this;
    }
    public java.util.Map<String, ?> getFileConfig() {
        return this.fileConfig;
    }

    public CreateDownloadDataJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDownloadDataJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDownloadDataJobRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
