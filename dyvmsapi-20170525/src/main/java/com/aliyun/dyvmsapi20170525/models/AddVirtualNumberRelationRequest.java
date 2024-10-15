// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class AddVirtualNumberRelationRequest extends TeaModel {
    /**
     * <p>The company names. Separate multiple company names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>Company 1</p>
     */
    @NameInMap("CorpNameList")
    public String corpNameList;

    /**
     * <p>The real numbers. Separate multiple real numbers with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1321111****,1322222****</p>
     */
    @NameInMap("NumberList")
    public String numberList;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The virtual number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05516214****</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    /**
     * <p>The service name. Default value: <strong>dyvms</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>dyvms</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The route type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: number location first.</li>
     * <li><strong>1</strong>: random.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RouteType")
    public Integer routeType;

    public static AddVirtualNumberRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVirtualNumberRelationRequest self = new AddVirtualNumberRelationRequest();
        return TeaModel.build(map, self);
    }

    public AddVirtualNumberRelationRequest setCorpNameList(String corpNameList) {
        this.corpNameList = corpNameList;
        return this;
    }
    public String getCorpNameList() {
        return this.corpNameList;
    }

    public AddVirtualNumberRelationRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

    public AddVirtualNumberRelationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddVirtualNumberRelationRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public AddVirtualNumberRelationRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AddVirtualNumberRelationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddVirtualNumberRelationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddVirtualNumberRelationRequest setRouteType(Integer routeType) {
        this.routeType = routeType;
        return this;
    }
    public Integer getRouteType() {
        return this.routeType;
    }

}
