// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The language in which the regions and zones are named. This parameter corresponds to the `LocalName` response parameter. Valid values:</p>
     * <br>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   en-US: English</p>
     * <p>*   ja: Japanese</p>
     * <br>
     * <p>Default value: zh-CN.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of resource. Valid values:</p>
     * <br>
     * <p>*   ear: async replication</p>
     * <p>*   lens: CloudLens for EBS</p>
     * <p>*   dbsc: Dedicated Block Storage Cluster</p>
     * <br>
     * <p>Default value: ear.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRegionsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
