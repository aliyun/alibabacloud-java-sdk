// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssUsageDataRequest extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Period")
    public String period;

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
