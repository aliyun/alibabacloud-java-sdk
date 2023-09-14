// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorApplicationRequest extends TeaModel {
    /**
     * <p>app id</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorApplicationRequest self = new GetDoctorApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDoctorApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorApplicationRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
