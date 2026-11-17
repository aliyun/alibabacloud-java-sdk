// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesRequest extends TeaModel {
    /**
     * <p>The app instance group ID. Specify either this parameter or AppInstanceGroupSetId when querying app instance group rules. This parameter can be omitted when querying system default rules.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-0bi83v****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The app instance group set ID. Specify either this parameter or AppInstanceGroupId when querying app instance group set rules. This parameter can be omitted when querying system default rules.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>The region ID of the request. When querying or setting rules for a specified app instance group, use the region where the target app instance group is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The path rule type. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: Queries system default rules. Both target IDs can be omitted.</li>
     * <li><code>AppInstanceGroup</code>: Queries the rules of an app instance group or an app instance group set.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppInstanceGroup</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static DescribeUserProfilePathRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProfilePathRulesRequest self = new DescribeUserProfilePathRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserProfilePathRulesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public DescribeUserProfilePathRulesRequest setAppInstanceGroupSetId(String appInstanceGroupSetId) {
        this.appInstanceGroupSetId = appInstanceGroupSetId;
        return this;
    }
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    public DescribeUserProfilePathRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserProfilePathRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
