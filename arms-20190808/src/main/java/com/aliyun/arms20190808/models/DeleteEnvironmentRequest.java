// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentRequest extends TeaModel {
    /**
     * <p>cascade delete Prometheus instance.</p>
     */
    @NameInMap("DeletePromInstance")
    public Boolean deletePromInstance;

    /**
     * <p>The ID of the environment instance.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentRequest self = new DeleteEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentRequest setDeletePromInstance(Boolean deletePromInstance) {
        this.deletePromInstance = deletePromInstance;
        return this;
    }
    public Boolean getDeletePromInstance() {
        return this.deletePromInstance;
    }

    public DeleteEnvironmentRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DeleteEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
