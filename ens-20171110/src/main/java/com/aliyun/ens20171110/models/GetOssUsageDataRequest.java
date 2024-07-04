// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssUsageDataRequest extends TeaModel {
    /**
     * <p>The name of the logical Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>ens-sink-bucketzyp1656903494</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The end of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-12T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The aggregation granularity. Unit: minutes.</p>
     * <p>Default value: 5. Valid values: 5 to 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-11T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetOssUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssUsageDataRequest self = new GetOssUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOssUsageDataRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public GetOssUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetOssUsageDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetOssUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
