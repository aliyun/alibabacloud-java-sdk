// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The virtual number.</p>
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

    /**
     * <p>The qualification ID.</p>
     * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Qualifications\&amp;Communication Scripts &gt; Qualification Management</strong>, and then click <strong>Details</strong> in the Actions column to view the qualification ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000542****</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>The city to which the virtual number belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("RegionNameCity")
    public String regionNameCity;

    /**
     * <p>The real number.</p>
     * 
     * <strong>example:</strong>
     * <p>1705559****</p>
     */
    @NameInMap("RelatedNum")
    public String relatedNum;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The route type. Valid values:</p>
     * <p><strong>0</strong>: number location first. <strong>1</strong>: random.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RouteType")
    public Integer routeType;

    /**
     * <p>The number type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: the number provided by a virtual network operator, in the 05710000\<em>\</em>\<em>\</em> format.</li>
     * <li><strong>2</strong>: the number provided by an Internet service provider (ISP).</li>
     * <li><strong>3</strong>: a 5-digit phone number that starts with 95.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
