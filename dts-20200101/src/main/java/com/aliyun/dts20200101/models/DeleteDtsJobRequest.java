// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobRequest self = new DeleteDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DeleteDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DeleteDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DeleteDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
