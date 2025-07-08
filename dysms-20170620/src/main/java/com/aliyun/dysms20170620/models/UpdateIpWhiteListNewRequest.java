// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UpdateIpWhiteListNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FeatureCode")
    public Integer featureCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpWhiteList")
    public String ipWhiteList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealNameInsId")
    public Long realNameInsId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserName")
    public String userName;

    public static UpdateIpWhiteListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpWhiteListNewRequest self = new UpdateIpWhiteListNewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIpWhiteListNewRequest setFeatureCode(Integer featureCode) {
        this.featureCode = featureCode;
        return this;
    }
    public Integer getFeatureCode() {
        return this.featureCode;
    }

    public UpdateIpWhiteListNewRequest setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public String getIpWhiteList() {
        return this.ipWhiteList;
    }

    public UpdateIpWhiteListNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateIpWhiteListNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public UpdateIpWhiteListNewRequest setRealNameInsId(Long realNameInsId) {
        this.realNameInsId = realNameInsId;
        return this;
    }
    public Long getRealNameInsId() {
        return this.realNameInsId;
    }

    public UpdateIpWhiteListNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateIpWhiteListNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateIpWhiteListNewRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
