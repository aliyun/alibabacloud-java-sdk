// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorJobRequest extends TeaModel {
    /**
     * <p>The ID of the job that is submitted to YARN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>application_1542620905989_****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorJobRequest self = new GetDoctorJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDoctorJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
