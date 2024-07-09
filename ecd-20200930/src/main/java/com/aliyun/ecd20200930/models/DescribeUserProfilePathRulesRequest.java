// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserProfilePathRulesRequest extends TeaModel {
    /**
     * <p>The desktop group ID. This parameter is required when you set RuleType parameter to DesktopGroup.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rule type that you want to configure for the directory.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>DesktopGroup</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Default</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DesktopGroup</p>
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
