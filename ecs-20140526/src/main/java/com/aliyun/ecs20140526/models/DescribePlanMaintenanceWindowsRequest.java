// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePlanMaintenanceWindowsRequest extends TeaModel {
    /**
     * <p>Specifies whether the window is enabled or disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: If the value is not specified or is less than 10, the default value is 10. If the value is greater than 100, the default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the O&amp;M window.</p>
     * 
     * <strong>example:</strong>
     * <p>pw-bp1jarob1aup7yvlrdt6</p>
     */
    @NameInMap("PlanWindowId")
    public String planWindowId;

    /**
     * <p>The name of the O&amp;M window.</p>
     * 
     * <strong>example:</strong>
     * <p>WIndowName</p>
     */
    @NameInMap("PlanWindowName")
    public String planWindowName;

    /**
     * <p>The region ID of the instance. You can call DescribeRegions to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the O&amp;M window applies.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-d85g5yocioezmdrll</p>
     */
    @NameInMap("TargetResourceGroupId")
    public String targetResourceGroupId;

    /**
     * <p>The tags to which the O&amp;M window applies.</p>
     */
    @NameInMap("TargetResourceTags")
    public DescribePlanMaintenanceWindowsRequestTargetResourceTags targetResourceTags;

    public static DescribePlanMaintenanceWindowsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlanMaintenanceWindowsRequest self = new DescribePlanMaintenanceWindowsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlanMaintenanceWindowsRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DescribePlanMaintenanceWindowsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribePlanMaintenanceWindowsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePlanMaintenanceWindowsRequest setPlanWindowId(String planWindowId) {
        this.planWindowId = planWindowId;
        return this;
    }
    public String getPlanWindowId() {
        return this.planWindowId;
    }

    public DescribePlanMaintenanceWindowsRequest setPlanWindowName(String planWindowName) {
        this.planWindowName = planWindowName;
        return this;
    }
    public String getPlanWindowName() {
        return this.planWindowName;
    }

    public DescribePlanMaintenanceWindowsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePlanMaintenanceWindowsRequest setTargetResourceGroupId(String targetResourceGroupId) {
        this.targetResourceGroupId = targetResourceGroupId;
        return this;
    }
    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    public DescribePlanMaintenanceWindowsRequest setTargetResourceTags(DescribePlanMaintenanceWindowsRequestTargetResourceTags targetResourceTags) {
        this.targetResourceTags = targetResourceTags;
        return this;
    }
    public DescribePlanMaintenanceWindowsRequestTargetResourceTags getTargetResourceTags() {
        return this.targetResourceTags;
    }

    public static class DescribePlanMaintenanceWindowsRequestTargetResourceTags extends TeaModel {
        /**
         * <p>The key of the tag to which the window applies.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag to which the window applies.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePlanMaintenanceWindowsRequestTargetResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePlanMaintenanceWindowsRequestTargetResourceTags self = new DescribePlanMaintenanceWindowsRequestTargetResourceTags();
            return TeaModel.build(map, self);
        }

        public DescribePlanMaintenanceWindowsRequestTargetResourceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePlanMaintenanceWindowsRequestTargetResourceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
