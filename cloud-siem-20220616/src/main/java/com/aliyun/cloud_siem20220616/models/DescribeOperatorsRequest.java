// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeOperatorsRequest extends TeaModel {
    /**
     * <p>The region of the Data Management center for threat analysis. Select a region based on your asset location. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets in the Chinese mainland and China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Assets outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. An administrator can use this parameter to switch to the perspective of this member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li><p>0: The view of the current Alibaba Cloud account.</p>
     * </li>
     * <li><p>1: The view of all accounts that are managed by your enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    /**
     * <p>The scenario for the operator. Valid values:</p>
     * <ul>
     * <li><p>If you leave this parameter empty, the default scenario is used.</p>
     * </li>
     * <li><p>AGGREGATE: The aggregate function scenario.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AGGREGATE</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    public static DescribeOperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorsRequest self = new DescribeOperatorsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOperatorsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeOperatorsRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

    public DescribeOperatorsRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
