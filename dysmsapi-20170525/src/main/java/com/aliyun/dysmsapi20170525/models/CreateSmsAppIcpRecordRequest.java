// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAppIcpRecordRequest extends TeaModel {
    /**
     * <p>The ICP filing approval date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-22</p>
     */
    @NameInMap("AppApprovalDate")
    public String appApprovalDate;

    /**
     * <p>The ICP record/license number. The number must not exceed 15 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>浙B2-20080101</p>
     */
    @NameInMap("AppIcpLicenseNumber")
    public String appIcpLicenseNumber;

    /**
     * <p>The fileKey for the screenshot of your app\&quot;s ICP filing details.</p>
     * <ol>
     * <li><p>To look up your ICP filing, go to the <a href="https://beian.miit.gov.cn/#/Integrated/recordQuery">MIIT service platform</a>, search for your filing, and open its details page.</p>
     * </li>
     * <li><p>The ICP filing screenshot must be uploaded to OSS and meet the following requirements:</p>
     * </li>
     * </ol>
     * <ul>
     * <li><p>The filename cannot contain Chinese characters or special characters.</p>
     * </li>
     * <li><p>The file must be an image in <code>jpg</code>, <code>png</code>, <code>gif</code>, or <code>jpeg</code> format. The file size cannot exceed 5 MB.</p>
     * </li>
     * <li><p>The screenshot must show the full URL.</p>
     * </li>
     * <li><p>For <strong>Record Type</strong>, select &quot;APP&quot;.</p>
     * </li>
     * <li><p>The <strong>principal unit name</strong> must be identical to the company or institution name on the qualification documents associated with the signature.</p>
     * </li>
     * <li><p>The screenshot must clearly show the complete ICP record/license number.</p>
     * </li>
     * <li><p>The <strong>service name</strong> must be identical to the <strong>signature name</strong>.</p>
     * </li>
     * </ul>
     * <ol start="3">
     * <li>To obtain the fileKey, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("AppIcpRecordPic")
    public String appIcpRecordPic;

    /**
     * <p>The principal unit name from your ICP filing. The name must not exceed 50 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云计算有限公司</p>
     */
    @NameInMap("AppPrincipalUnitName")
    public String appPrincipalUnitName;

    /**
     * <p>APP实际运行截图osskey</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AppRuntimePic")
    public String appRuntimePic;

    /**
     * <p>The service name from your ICP filing. The name must not exceed 15 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云</p>
     */
    @NameInMap("AppServiceName")
    public String appServiceName;

    /**
     * <p>APP应用商店下载截图osskey</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AppStoreDownloadPic")
    public String appStoreDownloadPic;

    /**
     * <p>The app store link.</p>
     * <blockquote>
     * <ul>
     * <li>The link must start with <code>http://</code> or <code>https://</code>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://apps.apple.com/cn/app/%E9%98%BF%E9%87%8C%E4%BA%91/id981011420">https://apps.apple.com/cn/app/阿里云/id981011420</a></p>
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

    public CreateSmsAppIcpRecordRequest setAppRuntimePic(String appRuntimePic) {
        this.appRuntimePic = appRuntimePic;
        return this;
    }
    public String getAppRuntimePic() {
        return this.appRuntimePic;
    }

    public CreateSmsAppIcpRecordRequest setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public CreateSmsAppIcpRecordRequest setAppStoreDownloadPic(String appStoreDownloadPic) {
        this.appStoreDownloadPic = appStoreDownloadPic;
        return this;
    }
    public String getAppStoreDownloadPic() {
        return this.appStoreDownloadPic;
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
