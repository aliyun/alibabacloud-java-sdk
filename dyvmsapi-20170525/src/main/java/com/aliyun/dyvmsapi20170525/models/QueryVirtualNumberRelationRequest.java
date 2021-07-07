// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RouteType")
    public Integer routeType;

    @NameInMap("QualificationId")
    public Long qualificationId;

    @NameInMap("RegionNameCity")
    public String regionNameCity;

    @NameInMap("SpecId")
    public Long specId;

    @NameInMap("RelatedNum")
    public String relatedNum;

    @NameInMap("PhoneNum")
    public String phoneNum;

    public static QueryVirtualNumberRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberRelationRequest self = new QueryVirtualNumberRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberRelationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryVirtualNumberRelationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryVirtualNumberRelationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryVirtualNumberRelationRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryVirtualNumberRelationRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryVirtualNumberRelationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryVirtualNumberRelationRequest setRouteType(Integer routeType) {
        this.routeType = routeType;
        return this;
    }
    public Integer getRouteType() {
        return this.routeType;
    }

    public QueryVirtualNumberRelationRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public QueryVirtualNumberRelationRequest setRegionNameCity(String regionNameCity) {
        this.regionNameCity = regionNameCity;
        return this;
    }
    public String getRegionNameCity() {
        return this.regionNameCity;
    }

    public QueryVirtualNumberRelationRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

    public QueryVirtualNumberRelationRequest setRelatedNum(String relatedNum) {
        this.relatedNum = relatedNum;
        return this;
    }
    public String getRelatedNum() {
        return this.relatedNum;
    }

    public QueryVirtualNumberRelationRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

}
