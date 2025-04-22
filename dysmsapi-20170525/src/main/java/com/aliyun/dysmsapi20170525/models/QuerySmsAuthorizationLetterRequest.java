// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySmsAuthorizationLetterRequest extends TeaModel {
    /**
     * <p>委托授权书id列表</p>
     */
    @NameInMap("AuthorizationLetterIdList")
    public java.util.List<Long> authorizationLetterIdList;

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

    public static QuerySmsAuthorizationLetterRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsAuthorizationLetterRequest self = new QuerySmsAuthorizationLetterRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsAuthorizationLetterRequest setAuthorizationLetterIdList(java.util.List<Long> authorizationLetterIdList) {
        this.authorizationLetterIdList = authorizationLetterIdList;
        return this;
    }
    public java.util.List<Long> getAuthorizationLetterIdList() {
        return this.authorizationLetterIdList;
    }

    public QuerySmsAuthorizationLetterRequest setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
        return this;
    }
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    public QuerySmsAuthorizationLetterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsAuthorizationLetterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsAuthorizationLetterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsAuthorizationLetterRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public QuerySmsAuthorizationLetterRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QuerySmsAuthorizationLetterRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
