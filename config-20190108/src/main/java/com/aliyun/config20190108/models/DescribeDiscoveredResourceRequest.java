// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceRequest extends TeaModel {
    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MemberId")
    public Long memberId;

    /**
     * <p>This parameter is scheduled to be removed before 00:00:00, June 30, 2021. Account group-related APIs will be provided as an alternative before 00:00:00, May 30, 2021. If you are using this parameter, we recommend that you switch to account group-related APIs after 00:00:00, May 30, 2021. For more information, see [Account groups](~~211534~~).</p>
     */
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>>  You can call the GetSupportedResourceTypes operation to query the resource types supported by Cloud Config. For more information, see [GetSupportedResourceTypes](~~169618~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceRequest self = new DescribeDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public DescribeDiscoveredResourceRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public DescribeDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
