// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAuthorizationLetterShrinkRequest extends TeaModel {
    /**
     * <p>The authorizing party, that is, the owner of the signature. Only the middle dot <code>·</code>, Chinese <code>【】（）</code>, English <code>()</code>, and spaces are supported. Other symbols or purely numeric input are not allowed. The length cannot exceed 150 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>菜鸟网络科技有限公司</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <p>The validity period of the authorization letter. Format: <code>YYYY-MM-DD~YYYY-MM-DD</code>.</p>
     * <blockquote>
     * <p>The recommended validity period is 1 to 3 years. Set a reasonable time period and avoid making the validity period too long or too short.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2026-01-01</p>
     */
    @NameInMap("AuthorizationLetterExpDate")
    public String authorizationLetterExpDate;

    /**
     * <p>The name of the authorization letter. The name cannot be the same as any of your other authorization letters. Only Chinese characters, English characters, or a combination with numbers are supported. Symbols or purely numeric input are not allowed. The length cannot exceed 100 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>菜鸟公司授权书</p>
     */
    @NameInMap("AuthorizationLetterName")
    public String authorizationLetterName;

    /**
     * <p>The fileKey of the authorization letter.</p>
     * <ol>
     * <li>The authorization letter file uploaded to OSS. Download the <a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250414/bvpcmo/%E6%8E%88%E6%9D%83%E5%A7%94%E6%89%98%E4%B9%A6%E6%A8%A1%E7%89%88.doc">Authorization Letter Template</a>, then fill it out and stamp it according to the <a href="https://help.aliyun.com/document_detail/56741.html">specifications</a> before uploading. File upload requirements:</li>
     * </ol>
     * <ul>
     * <li>The name of the file to be uploaded cannot contain Chinese characters or special characters.</li>
     * <li>Only images in JPG, PNG, GIF, or JPEG format are supported, and the image must not exceed 5 MB.</li>
     * </ul>
     * <ol start="2">
     * <li>To obtain the fileKey, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456/test1719383196031.jpg</p>
     */
    @NameInMap("AuthorizationLetterPic")
    public String authorizationLetterPic;

    /**
     * <p>The unified social credit code of the authorizing party. The length cannot exceed 150 characters. The credit code must be consistent with the unified social credit code field in the qualification information bound to the signature. Otherwise, the signature creation will fail.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9****************A</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The authorized party, that is, the signature applicant. Only the middle dot <code>·</code>, Chinese <code>【】（）</code>, English <code>()</code>, and spaces are supported. Other symbols or purely numeric input are not allowed. The length cannot exceed 150 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>支付宝（中国）网络技术有限公司</p>
     */
    @NameInMap("ProxyAuthorization")
    public String proxyAuthorization;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of authorized signatures. The number of signatures cannot exceed 100.</p>
     * <blockquote>
     * <p>We recommend that you authorize all signatures that may be used at once in the authorization letter. This prevents subsequent signature applications from falling outside the scope of the authorization letter, which would cause review failure and require you to supplement the authorization letter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignList")
    public String signListShrink;

    public static CreateSmsAuthorizationLetterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAuthorizationLetterShrinkRequest self = new CreateSmsAuthorizationLetterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsAuthorizationLetterShrinkRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setAuthorizationLetterExpDate(String authorizationLetterExpDate) {
        this.authorizationLetterExpDate = authorizationLetterExpDate;
        return this;
    }
    public String getAuthorizationLetterExpDate() {
        return this.authorizationLetterExpDate;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setAuthorizationLetterName(String authorizationLetterName) {
        this.authorizationLetterName = authorizationLetterName;
        return this;
    }
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setAuthorizationLetterPic(String authorizationLetterPic) {
        this.authorizationLetterPic = authorizationLetterPic;
        return this;
    }
    public String getAuthorizationLetterPic() {
        return this.authorizationLetterPic;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
        return this;
    }
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsAuthorizationLetterShrinkRequest setSignListShrink(String signListShrink) {
        this.signListShrink = signListShrink;
        return this;
    }
    public String getSignListShrink() {
        return this.signListShrink;
    }

}
