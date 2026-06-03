// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyRecordListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryDate")
    public String queryDate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryGateVerifyRecordListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyRecordListRequest self = new QueryGateVerifyRecordListRequest();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyRecordListRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public QueryGateVerifyRecordListRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public QueryGateVerifyRecordListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryGateVerifyRecordListRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public QueryGateVerifyRecordListRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryGateVerifyRecordListRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

    public QueryGateVerifyRecordListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryGateVerifyRecordListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
