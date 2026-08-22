// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertTypeRequest extends TeaModel {
    /**
     * <p>The region of the data management center for threat analysis. Specify the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: assets in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: assets outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator switches to for viewing as another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li>predefine: predefined.</li>
     * <li>customize: custom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static DescribeAlertTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertTypeRequest self = new DescribeAlertTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertTypeRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAlertTypeRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeAlertTypeRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
