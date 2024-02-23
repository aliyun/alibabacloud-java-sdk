// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The virtual number.</p>
     */
    @NameInMap("PhoneNum")
    public String phoneNum;

    /**
     * <p>The service name. Default value: **dyvms**.</p>
     */
    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>The qualification ID.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Qualifications\&Communication Scripts > Qualification Management**, and then click **Details** in the Actions column to view the qualification ID.</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>The city to which the virtual number belongs.</p>
     */
    @NameInMap("RegionNameCity")
    public String regionNameCity;

    /**
     * <p>The real number.</p>
     */
    @NameInMap("RelatedNum")
    public String relatedNum;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The route type. Valid values:</p>
     * <br>
     * <p>**0**: number location first. **1**: random.</p>
     */
    @NameInMap("RouteType")
    public Integer routeType;

    /**
     * <p>The number type. Valid values:</p>
     * <br>
     * <p>*   **1**: the number provided by a virtual network operator, in the 05710000\*\*\*\* format.</p>
     * <p>*   **2**: the number provided by an Internet service provider (ISP).</p>
     * <p>*   **3**: a 5-digit phone number that starts with 95.</p>
     */
    @NameInMap("SpecId")
    public Long specId;

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

    public QueryVirtualNumberRelationRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public QueryVirtualNumberRelationRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
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

    public QueryVirtualNumberRelationRequest setRelatedNum(String relatedNum) {
        this.relatedNum = relatedNum;
        return this;
    }
    public String getRelatedNum() {
        return this.relatedNum;
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

    public QueryVirtualNumberRelationRequest setRouteType(Integer routeType) {
        this.routeType = routeType;
        return this;
    }
    public Integer getRouteType() {
        return this.routeType;
    }

    public QueryVirtualNumberRelationRequest setSpecId(Long specId) {
        this.specId = specId;
        return this;
    }
    public Long getSpecId() {
        return this.specId;
    }

}
