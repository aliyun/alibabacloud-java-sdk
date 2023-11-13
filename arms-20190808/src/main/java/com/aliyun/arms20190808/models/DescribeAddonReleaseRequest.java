// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonReleaseRequest extends TeaModel {
    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Name of Release.</p>
     */
    @NameInMap("ReleaseName")
    public String releaseName;

    public static DescribeAddonReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonReleaseRequest self = new DescribeAddonReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonReleaseRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DescribeAddonReleaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAddonReleaseRequest setReleaseName(String releaseName) {
        this.releaseName = releaseName;
        return this;
    }
    public String getReleaseName() {
        return this.releaseName;
    }

}
