// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("DownloadDataType")
    public String downloadDataType;

    /**
     * <strong>example:</strong>
     * <p>1658406464534</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;fileName&quot;:&quot;fileName01&quot;}</p>
     */
    @NameInMap("FileConfig")
    public java.util.Map<String, ?> fileConfig;

    /**
     * <strong>example:</strong>
     * <p>iot-cn-npk1u******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1658332800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>product_info</p>
     */
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
