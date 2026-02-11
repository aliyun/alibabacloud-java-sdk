// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerRequest extends TeaModel {
    @NameInMap("AddVirtualNodePoolStatusList")
    public java.util.List<String> addVirtualNodePoolStatusList;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The billing method of the Internet access package.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The office network IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-172301****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>Workstation specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.proworkstation_flagship_elite.32c64g.48g1x</p>
     */
    @NameInMap("ServerInstanceType")
    public String serverInstanceType;

    /**
     * <p>The status of the workstation.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Users")
    public java.util.List<String> users;

    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    /**
     * <p>The list of workstation IDs.</p>
     */
    @NameInMap("WuyingServerIdList")
    public java.util.List<String> wuyingServerIdList;

    /**
     * <p>The workstation name or workstation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleServerName</p>
     */
    @NameInMap("WuyingServerNameOrId")
    public String wuyingServerNameOrId;

    public static ListWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerRequest self = new ListWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerRequest setAddVirtualNodePoolStatusList(java.util.List<String> addVirtualNodePoolStatusList) {
        this.addVirtualNodePoolStatusList = addVirtualNodePoolStatusList;
        return this;
    }
    public java.util.List<String> getAddVirtualNodePoolStatusList() {
        return this.addVirtualNodePoolStatusList;
    }

    public ListWuyingServerRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListWuyingServerRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListWuyingServerRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ListWuyingServerRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ListWuyingServerRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListWuyingServerRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWuyingServerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWuyingServerRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListWuyingServerRequest setServerInstanceType(String serverInstanceType) {
        this.serverInstanceType = serverInstanceType;
        return this;
    }
    public String getServerInstanceType() {
        return this.serverInstanceType;
    }

    public ListWuyingServerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWuyingServerRequest setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public ListWuyingServerRequest setVirtualNodePoolId(String virtualNodePoolId) {
        this.virtualNodePoolId = virtualNodePoolId;
        return this;
    }
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

    public ListWuyingServerRequest setWuyingServerIdList(java.util.List<String> wuyingServerIdList) {
        this.wuyingServerIdList = wuyingServerIdList;
        return this;
    }
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

    public ListWuyingServerRequest setWuyingServerNameOrId(String wuyingServerNameOrId) {
        this.wuyingServerNameOrId = wuyingServerNameOrId;
        return this;
    }
    public String getWuyingServerNameOrId() {
        return this.wuyingServerNameOrId;
    }

}
