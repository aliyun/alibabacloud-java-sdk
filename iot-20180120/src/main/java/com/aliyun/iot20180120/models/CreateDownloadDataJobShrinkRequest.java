// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDownloadDataJobShrinkRequest extends TeaModel {
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
    public String fileConfigShrink;

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

    public static CreateDownloadDataJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDownloadDataJobShrinkRequest self = new CreateDownloadDataJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDownloadDataJobShrinkRequest setDownloadDataType(String downloadDataType) {
        this.downloadDataType = downloadDataType;
        return this;
    }
    public String getDownloadDataType() {
        return this.downloadDataType;
    }

    public CreateDownloadDataJobShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDownloadDataJobShrinkRequest setFileConfigShrink(String fileConfigShrink) {
        this.fileConfigShrink = fileConfigShrink;
        return this;
    }
    public String getFileConfigShrink() {
        return this.fileConfigShrink;
    }

    public CreateDownloadDataJobShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDownloadDataJobShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDownloadDataJobShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
