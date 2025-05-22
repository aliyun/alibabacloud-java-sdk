// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class PutMeasureReadyFlagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.bookkeeping</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634784240000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadyFlag")
    public String readyFlag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1634969692175</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static PutMeasureReadyFlagRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureReadyFlagRequest self = new PutMeasureReadyFlagRequest();
        return TeaModel.build(map, self);
    }

    public PutMeasureReadyFlagRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PutMeasureReadyFlagRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PutMeasureReadyFlagRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PutMeasureReadyFlagRequest setReadyFlag(String readyFlag) {
        this.readyFlag = readyFlag;
        return this;
    }
    public String getReadyFlag() {
        return this.readyFlag;
    }

    public PutMeasureReadyFlagRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
