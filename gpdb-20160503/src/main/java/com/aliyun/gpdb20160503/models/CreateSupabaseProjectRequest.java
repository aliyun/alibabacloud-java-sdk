// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectRequest extends TeaModel {
    /**
     * <p>The password of the initial account.</p>
     * <p>Password rules:</p>
     * <ul>
     * <li>The password must be 8 to 32 characters in length.</li>
     * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Supported special characters include !@#$%^&amp;*()_+-=.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestPassword123!</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>Specifies whether to enable auto start/stop. If this parameter is not specified, the default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoScale")
    public Boolean autoScale;

    /**
     * <p>The idempotency token. This token ensures that duplicate requests do not trigger the same operation more than once.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The performance level (PL) of the cloud disk. If this parameter is not specified, the default value PL0 is used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PL0</li>
     * <li>PL1</li>
     * <li>PL2</li>
     * <li>PL3.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("DiskPerformanceLevel")
    public String diskPerformanceLevel;

    /**
     * <p>The DPI engine version. If this parameter is not specified, the default value PG15 is used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PG15: PostgreSQL 15.</li>
     * <li>PG17: PostgreSQL 17.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PG15</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The billing method. If this parameter is not specified, the default value Free is used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Free: free tier.</li>
     * <li>Postpaid: pay-as-you-go.</li>
     * <li>Prepaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Free</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit of the subscription duration. This parameter takes effect only when PayType is set to PrePay. If this parameter is not specified, the default value Month is used.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month: month.</li>
     * <li>Year: year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The name of the Supabase project.</p>
     * <p>Naming rules:</p>
     * <ul>
     * <li>The name must be 1 to 128 characters in length.</li>
     * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase_demo</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The specifications of the Supabase project. The Free billing type uses free-tier specifications. For paid billing types, the specifications must match those available on the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2C4G</p>
     */
    @NameInMap("ProjectSpec")
    public String projectSpec;

    /**
     * <p>The region ID. Specifies the region in which to create the project.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP address whitelist. Separate multiple IP addresses or CIDR blocks with commas (,). If this parameter is not specified, the default value 0.0.0.0/0 is used.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The storage size. Unit: GB. If this parameter is not specified for non-Free billing types, the default value is 1 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    /**
     * <p>The subscription duration of the resource. This parameter takes effect only when PayType is set to PrePay. If this parameter is not specified, the default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The vSwitch ID. This parameter is required. The zone of the vSwitch must be the same as the value of ZoneId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1234567890</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1234567890</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID. The zone of the vSwitch specified by VSwitchId must be the same as the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
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
