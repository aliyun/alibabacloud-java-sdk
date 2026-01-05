// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAppIcpRecordRequest extends TeaModel {
    /**
     * <p>审核通过日期，示例2025-09-01</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-22</p>
     */
    @NameInMap("AppApprovalDate")
    public String appApprovalDate;

    /**
     * <p>ICP备案/许可证号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("AppIcpLicenseNumber")
    public String appIcpLicenseNumber;

    /**
     * <p>app-icp备案详情截图osskey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("AppIcpRecordPic")
    public String appIcpRecordPic;

    /**
     * <p>主办单位名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AppPrincipalUnitName")
    public String appPrincipalUnitName;

    /**
     * <p>app服务名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AppServiceName")
    public String appServiceName;

    /**
     * <p>APP应用商店链接</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://alicom-ops.alibaba-inc.com/dyorder/audit-domain/rule_manage">https://alicom-ops.alibaba-inc.com/dyorder/audit-domain/rule_manage</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSmsAppIcpRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAppIcpRecordRequest self = new CreateSmsAppIcpRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsAppIcpRecordRequest setAppApprovalDate(String appApprovalDate) {
        this.appApprovalDate = appApprovalDate;
        return this;
    }
    public String getAppApprovalDate() {
        return this.appApprovalDate;
    }

    public CreateSmsAppIcpRecordRequest setAppIcpLicenseNumber(String appIcpLicenseNumber) {
        this.appIcpLicenseNumber = appIcpLicenseNumber;
        return this;
    }
    public String getAppIcpLicenseNumber() {
        return this.appIcpLicenseNumber;
    }

    public CreateSmsAppIcpRecordRequest setAppIcpRecordPic(String appIcpRecordPic) {
        this.appIcpRecordPic = appIcpRecordPic;
        return this;
    }
    public String getAppIcpRecordPic() {
        return this.appIcpRecordPic;
    }

    public CreateSmsAppIcpRecordRequest setAppPrincipalUnitName(String appPrincipalUnitName) {
        this.appPrincipalUnitName = appPrincipalUnitName;
        return this;
    }
    public String getAppPrincipalUnitName() {
        return this.appPrincipalUnitName;
    }

    public CreateSmsAppIcpRecordRequest setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public CreateSmsAppIcpRecordRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateSmsAppIcpRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsAppIcpRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsAppIcpRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
