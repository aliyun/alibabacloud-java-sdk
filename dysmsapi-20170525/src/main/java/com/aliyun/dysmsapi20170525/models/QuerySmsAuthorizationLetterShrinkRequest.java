// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAuthorizationLetterShrinkRequest extends TeaModel {
    /**
     * <p>委托授权书id列表</p>
     */
    @NameInMap("AuthorizationLetterIdList")
    public String authorizationLetterIdListShrink;

    /**
     * <p>授权方社会统一信用代码</p>
     * 
     * <strong>example:</strong>
     * <p>9****************A</p>
     */
    @NameInMap("OrganizationCode")
    public String organizationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>签名名称（支持命中签名范围查询）</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>授权书审核状态，INT:审核中，PASSED:审核通过</p>
     * 
     * <strong>example:</strong>
     * <p>PASSED</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>授权书可用状态，VALID可用，INVALID不可用</p>
     * 
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    public static QuerySmsAuthorizationLetterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAuthorizationLetterShrinkRequest self = new QuerySmsAuthorizationLetterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsAuthorizationLetterShrinkRequest setAuthorizationLetterIdListShrink(String authorizationLetterIdListShrink) {
        this.authorizationLetterIdListShrink = authorizationLetterIdListShrink;
        return this;
    }
    public String getAuthorizationLetterIdListShrink() {
        return this.authorizationLetterIdListShrink;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySmsAuthorizationLetterShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
