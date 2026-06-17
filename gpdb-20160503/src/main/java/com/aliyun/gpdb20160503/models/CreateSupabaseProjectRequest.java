// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectRequest extends TeaModel {
    /**
     * <p>The password of the initial account.</p>
     * <ul>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>The following special characters are supported: <code>!@#$%^&amp;*()_+-=</code></li>
     * <li>The password must be 8 to 32 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pw123456</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    @NameInMap("AutoScale")
    public Boolean autoScale;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88888888****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The performance level (PL) of the cloud disk. Default value: PL0. Valid values:</p>
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

    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you do not specify this parameter, an instance of the Free type is created by default.</li>
     * <li>If you select the subscription billing method, you can receive discounts when you purchase a one-year or longer subscription. We recommend that you select a billing method based on your business requirements.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: month.</li>
     * <li><strong>Year</strong>: year.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The project name. The naming rules are as follows:</p>
     * <ul>
     * <li><p>The name must be 1 to 128 characters in length.</p>
     * </li>
     * <li><p>The name can contain only letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>The name must start with a letter or an underscore (_).</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>saas_iot_x86_modbustcp_lqt01</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The Supabase instance specification. The default specification for the Free type is 1C1G. The specifications for paid types are consistent with those available on the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1C1G</p>
     */
    @NameInMap("ProjectSpec")
    public String projectSpec;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> to view the available region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address whitelist.</p>
     * <p>The value 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. After the instance is created, you can call <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> to modify the IP address whitelist.</p>
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

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values are 1 to 11.</li>
     * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values are 1 to 3.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when you create a subscription instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <ul>
     * <li>The <strong>vSwitchId</strong> parameter is required.</li>
     * <li>The zone of the <strong>vSwitch</strong> must be the same as the value of <strong>ZoneId</strong>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1cpq8mr64paltkb****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * <ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/208327.html">DescribeRdsVpcs</a> to view the available VPC IDs.</li>
     * <li>This parameter is required.</li>
     * </ul>
     * </blockquote>
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
     * <p>You can call <a href="https://help.aliyun.com/document_detail/86912.html">DescribeRegions</a> to view the available zone IDs.</p>
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

    public CreateSupabaseProjectRequest setAutoScale(Boolean autoScale) {
        this.autoScale = autoScale;
        return this;
    }
    public Boolean getAutoScale() {
        return this.autoScale;
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

    public CreateSupabaseProjectRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
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
