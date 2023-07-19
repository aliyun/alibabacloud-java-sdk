// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteDtsJobRequest extends TeaModel {
    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>>  If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The dynamic error code. This parameter will be removed in the future.</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static DeleteDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDtsJobRequest self = new DeleteDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DeleteDtsJobRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DeleteDtsJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public DeleteDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
