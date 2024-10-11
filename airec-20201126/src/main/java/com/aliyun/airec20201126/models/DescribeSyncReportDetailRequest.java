// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("levelType")
    public String levelType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>behavior</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeSyncReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailRequest self = new DescribeSyncReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncReportDetailRequest setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

    public DescribeSyncReportDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncReportDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
