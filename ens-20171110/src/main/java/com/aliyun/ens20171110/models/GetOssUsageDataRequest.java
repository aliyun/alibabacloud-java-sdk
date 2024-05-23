// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssUsageDataRequest extends TeaModel {
    /**
     * <p>The name of the logical Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>The end of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The aggregation granularity. Unit: minutes.</p>
     * <br>
     * <p>Default value: 5. Valid values: 5 to 1440.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The beginning of the time range to query. The time must be in UTC. Format: 2010-01-21T09:50:23Z.</p>
     * <br>
     * <p>This parameter is required.</p>
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
