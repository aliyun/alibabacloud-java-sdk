// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class IgnoreJobDetailRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    public static IgnoreJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreJobDetailRequest self = new IgnoreJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreJobDetailRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public IgnoreJobDetailRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public IgnoreJobDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IgnoreJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public IgnoreJobDetailRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public IgnoreJobDetailRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

}
