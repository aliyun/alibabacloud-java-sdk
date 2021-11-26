// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class CreateOXSDeliveryTaskRequest extends TeaModel {
    @NameInMap("AzoneId")
    public String azoneId;

    @NameInMap("DeliveryApp")
    public String deliveryApp;

    @NameInMap("DeliveryProduct")
    public String deliveryProduct;

    @NameInMap("Domestic")
    public Boolean domestic;

    @NameInMap("EmpIds")
    public java.util.List<String> empIds;

    @NameInMap("IdcName")
    public String idcName;

    @NameInMap("IdcNameForExpansion")
    public String idcNameForExpansion;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IpCidrBlocks")
    public java.util.List<String> ipCidrBlocks;

    @NameInMap("IsDisabled")
    public Boolean isDisabled;

    @NameInMap("Latitude")
    public Float latitude;

    @NameInMap("Longitude")
    public Float longitude;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("SecurityGroupType")
    public String securityGroupType;

    @NameInMap("SkipCreateEcs")
    public Boolean skipCreateEcs;

    @NameInMap("SkipQuotaApply")
    public Boolean skipQuotaApply;

    @NameInMap("SupportVpc")
    public Boolean supportVpc;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateOXSDeliveryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOXSDeliveryTaskRequest self = new CreateOXSDeliveryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOXSDeliveryTaskRequest setAzoneId(String azoneId) {
        this.azoneId = azoneId;
        return this;
    }
    public String getAzoneId() {
        return this.azoneId;
    }

    public CreateOXSDeliveryTaskRequest setDeliveryApp(String deliveryApp) {
        this.deliveryApp = deliveryApp;
        return this;
    }
    public String getDeliveryApp() {
        return this.deliveryApp;
    }

    public CreateOXSDeliveryTaskRequest setDeliveryProduct(String deliveryProduct) {
        this.deliveryProduct = deliveryProduct;
        return this;
    }
    public String getDeliveryProduct() {
        return this.deliveryProduct;
    }

    public CreateOXSDeliveryTaskRequest setDomestic(Boolean domestic) {
        this.domestic = domestic;
        return this;
    }
    public Boolean getDomestic() {
        return this.domestic;
    }

    public CreateOXSDeliveryTaskRequest setEmpIds(java.util.List<String> empIds) {
        this.empIds = empIds;
        return this;
    }
    public java.util.List<String> getEmpIds() {
        return this.empIds;
    }

    public CreateOXSDeliveryTaskRequest setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public CreateOXSDeliveryTaskRequest setIdcNameForExpansion(String idcNameForExpansion) {
        this.idcNameForExpansion = idcNameForExpansion;
        return this;
    }
    public String getIdcNameForExpansion() {
        return this.idcNameForExpansion;
    }

    public CreateOXSDeliveryTaskRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateOXSDeliveryTaskRequest setIpCidrBlocks(java.util.List<String> ipCidrBlocks) {
        this.ipCidrBlocks = ipCidrBlocks;
        return this;
    }
    public java.util.List<String> getIpCidrBlocks() {
        return this.ipCidrBlocks;
    }

    public CreateOXSDeliveryTaskRequest setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }
    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public CreateOXSDeliveryTaskRequest setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
    public Float getLatitude() {
        return this.latitude;
    }

    public CreateOXSDeliveryTaskRequest setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }
    public Float getLongitude() {
        return this.longitude;
    }

    public CreateOXSDeliveryTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOXSDeliveryTaskRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public CreateOXSDeliveryTaskRequest setSecurityGroupType(String securityGroupType) {
        this.securityGroupType = securityGroupType;
        return this;
    }
    public String getSecurityGroupType() {
        return this.securityGroupType;
    }

    public CreateOXSDeliveryTaskRequest setSkipCreateEcs(Boolean skipCreateEcs) {
        this.skipCreateEcs = skipCreateEcs;
        return this;
    }
    public Boolean getSkipCreateEcs() {
        return this.skipCreateEcs;
    }

    public CreateOXSDeliveryTaskRequest setSkipQuotaApply(Boolean skipQuotaApply) {
        this.skipQuotaApply = skipQuotaApply;
        return this;
    }
    public Boolean getSkipQuotaApply() {
        return this.skipQuotaApply;
    }

    public CreateOXSDeliveryTaskRequest setSupportVpc(Boolean supportVpc) {
        this.supportVpc = supportVpc;
        return this;
    }
    public Boolean getSupportVpc() {
        return this.supportVpc;
    }

    public CreateOXSDeliveryTaskRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public CreateOXSDeliveryTaskRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
