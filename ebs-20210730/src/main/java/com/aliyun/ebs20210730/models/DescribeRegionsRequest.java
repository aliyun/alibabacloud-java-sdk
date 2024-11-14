// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The language in which the regions and zones are named. This parameter corresponds to the <code>LocalName</code> response parameter. Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * <li>ja: Japanese</li>
     * </ul>
     * <p>Default value: zh-CN.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of resource. Valid values:</p>
     * <ul>
     * <li>ear: async replication</li>
     * <li>lens: CloudLens for EBS</li>
     * <li>dbsc: Dedicated Block Storage Cluster</li>
     * </ul>
     * <p>Default value: ear.</p>
     * 
     * <strong>example:</strong>
     * <p>ear</p>
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
