// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobDetailRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DtsInstanceID")
    public String dtsInstanceID;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDtsJobDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobDetailRequest self = new DescribeDtsJobDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobDetailRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobDetailRequest setDtsInstanceID(String dtsInstanceID) {
        this.dtsInstanceID = dtsInstanceID;
        return this;
    }
    public String getDtsInstanceID() {
        return this.dtsInstanceID;
    }

    public DescribeDtsJobDetailRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeDtsJobDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
