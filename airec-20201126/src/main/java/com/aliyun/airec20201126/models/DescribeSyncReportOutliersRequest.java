// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSyncReportOutliersRequest extends TeaModel {
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
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>This parameter is required.</p>
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
     */
    @NameInMap("type")
    public String type;

    public static DescribeSyncReportOutliersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportOutliersRequest self = new DescribeSyncReportOutliersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportOutliersRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSyncReportOutliersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeSyncReportOutliersRequest setLevelType(String levelType) {
        this.levelType = levelType;
        return this;
    }
    public String getLevelType() {
        return this.levelType;
    }

    public DescribeSyncReportOutliersRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeSyncReportOutliersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
