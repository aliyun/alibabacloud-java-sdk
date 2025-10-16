// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskSecurityGroupDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sg-2vc0p803vgxumn6r****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>test-instance-name</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3b1adf8d-1949-4c8e-809b-fb92ee11****</p>
     */
    @NameInMap("RuleUuid")
    public String ruleUuid;

    /**
     * <strong>example:</strong>
     * <p>220.189.117.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeRiskSecurityGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskSecurityGroupDetailRequest self = new DescribeRiskSecurityGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskSecurityGroupDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRiskSecurityGroupDetailRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRiskSecurityGroupDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskSecurityGroupDetailRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeRiskSecurityGroupDetailRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskSecurityGroupDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRiskSecurityGroupDetailRequest setRuleUuid(String ruleUuid) {
        this.ruleUuid = ruleUuid;
        return this;
    }
    public String getRuleUuid() {
        return this.ruleUuid;
    }

    public DescribeRiskSecurityGroupDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
