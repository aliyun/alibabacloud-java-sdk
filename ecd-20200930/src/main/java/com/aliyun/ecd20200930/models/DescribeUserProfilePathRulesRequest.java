// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesRequest extends TeaModel {
    /**
     * <p>The desktop group ID. This parameter is required when you set RuleType parameter to DesktopGroup.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rule type that you want to configure for the directory.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   DesktopGroup</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Default</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static DescribeUserProfilePathRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProfilePathRulesRequest self = new DescribeUserProfilePathRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserProfilePathRulesRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
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
