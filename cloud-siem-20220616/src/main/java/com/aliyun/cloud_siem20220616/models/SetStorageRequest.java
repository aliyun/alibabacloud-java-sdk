// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SetStorageRequest extends TeaModel {
    /**
     * <p>The storage region of logs.</p>
     * <br>
     * <p>If the data management center is **cn-hangzhou**, the default value of **Region** is cn-shanghai, which specifies the China (Shanghai) region. If the data management center is **ap-southeast-1**, the default value of **Region** is ap-southeast-1, which specifies the Singapore region.</p>
     * <br>
     * <p>The region for log storage cannot be changed. To change the region, contact the technical support of threat analysis.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The storage duration of logs. Default value: 180. Minimum value: 30. Maximum value: 3000. Unit: days.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static SetStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        SetStorageRequest self = new SetStorageRequest();
        return TeaModel.build(map, self);
    }

    public SetStorageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SetStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetStorageRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

}
