// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsAuthorizationLetterRequest extends TeaModel {
    /**
     * <p>授权方，授权方命名长度不超过1000个字符，暂不支持包含除中点（·）、空格、中文括号【】、英文括号()外的任何符号或纯数字输入</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云有限公司</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    /**
     * <p>委托授权书有效期</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01~2026-01-01</p>
     */
    @NameInMap("AuthorizationLetterExpDate")
    public String authorizationLetterExpDate;

    /**
     * <p>委托授权书命名非空，不超过100个字符，支持中文、英文或与数字组合进行命名，暂不支持任何符号或纯数字输入</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx公司授权书</p>
     */
    @NameInMap("AuthorizationLetterName")
    public String authorizationLetterName;

    /**
     * <p>上传oss的委托授权书图片标识</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthorizationLetterPic")
    public String authorizationLetterPic;

    /**
     * <p>授权方社会统一信用代码，长度不超过150个字符</p>
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
     * <p>被授权方，被授权方命名长度不超过1000个字符，暂不支持包含除中点（·）、空格、中文括号【】、英文括号()外的任何符号或纯数字输入</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx公司</p>
     */
    @NameInMap("ProxyAuthorization")
    public String proxyAuthorization;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>委托授权签名列表，签名数量限制100个以内</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignList")
    public java.util.List<String> signList;

    public static CreateSmsAuthorizationLetterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsAuthorizationLetterRequest self = new CreateSmsAuthorizationLetterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsAuthorizationLetterRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public CreateSmsAuthorizationLetterRequest setAuthorizationLetterExpDate(String authorizationLetterExpDate) {
        this.authorizationLetterExpDate = authorizationLetterExpDate;
        return this;
    }
    public String getAuthorizationLetterExpDate() {
        return this.authorizationLetterExpDate;
    }

    public CreateSmsAuthorizationLetterRequest setAuthorizationLetterName(String authorizationLetterName) {
        this.authorizationLetterName = authorizationLetterName;
        return this;
    }
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    public CreateSmsAuthorizationLetterRequest setAuthorizationLetterPic(String authorizationLetterPic) {
        this.authorizationLetterPic = authorizationLetterPic;
        return this;
    }
    public String getAuthorizationLetterPic() {
        return this.authorizationLetterPic;
    }

    public CreateSmsAuthorizationLetterRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public CreateSmsAuthorizationLetterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmsAuthorizationLetterRequest setProxyAuthorization(String proxyAuthorization) {
        this.proxyAuthorization = proxyAuthorization;
        return this;
    }
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    public CreateSmsAuthorizationLetterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmsAuthorizationLetterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmsAuthorizationLetterRequest setSignList(java.util.List<String> signList) {
        this.signList = signList;
        return this;
    }
    public java.util.List<String> getSignList() {
        return this.signList;
    }

}
