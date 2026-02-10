// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectRequest extends TeaModel {
    /**
     * <p>The password of the initial account.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88888888****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The performance level of Enterprise SSDs (ESSDs). Default value: PL0. Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("DiskPerformanceLevel")
    public String diskPerformanceLevel;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    /**
     * <p>The name of the Supabase project. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 1 to 128 characters in length.</li>
     * <li>The name can contain only letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saas_iot_x86_modbustcp_lqt01</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The specifications of the Supabase project. Default value: 1C1G.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1C1G</p>
     */
    @NameInMap("ProjectSpec")
    public String projectSpec;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address whitelist.</p>
     * <p>A value of 127.0.0.1 denies access from any external IP address. You can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP address whitelist after you create a project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The storage size. Unit: GB. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p><strong>This parameter</strong> must be specified.</p>
     * </li>
     * <li><p>The zone where the <strong>vSwitch</strong> resides must be the same as the zone that is specified by <strong>ZoneId</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/208327.html">DescribeRdsVpcs</a> operation to query the available VPC IDs.</p>
     * </li>
     * <li><p>This parameter must be specified.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp*******************</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateSupabaseProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseProjectRequest self = new CreateSupabaseProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseProjectRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateSupabaseProjectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSupabaseProjectRequest setDiskPerformanceLevel(String diskPerformanceLevel) {
        this.diskPerformanceLevel = diskPerformanceLevel;
        return this;
    }
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    public CreateSupabaseProjectRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateSupabaseProjectRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSupabaseProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateSupabaseProjectRequest setProjectSpec(String projectSpec) {
        this.projectSpec = projectSpec;
        return this;
    }
    public String getProjectSpec() {
        return this.projectSpec;
    }

    public CreateSupabaseProjectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSupabaseProjectRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateSupabaseProjectRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

    public CreateSupabaseProjectRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateSupabaseProjectRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateSupabaseProjectRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateSupabaseProjectRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
