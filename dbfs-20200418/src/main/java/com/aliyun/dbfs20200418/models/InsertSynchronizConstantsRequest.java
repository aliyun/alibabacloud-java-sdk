// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class InsertSynchronizConstantsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AccessData")
    public String accessData;

    @NameInMap("EndpointData")
    public String endpointData;

    @NameInMap("MasterData")
    public String masterData;

    @NameInMap("ProductCodeData")
    public String productCodeData;

    @NameInMap("OsversionData")
    public String osversionData;

    @NameInMap("ZoneData")
    public String zoneData;

    @NameInMap("RegionData")
    public String regionData;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static InsertSynchronizConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSynchronizConstantsRequest self = new InsertSynchronizConstantsRequest();
        return TeaModel.build(map, self);
    }

    public InsertSynchronizConstantsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InsertSynchronizConstantsRequest setAccessData(String accessData) {
        this.accessData = accessData;
        return this;
    }
    public String getAccessData() {
        return this.accessData;
    }

    public InsertSynchronizConstantsRequest setEndpointData(String endpointData) {
        this.endpointData = endpointData;
        return this;
    }
    public String getEndpointData() {
        return this.endpointData;
    }

    public InsertSynchronizConstantsRequest setMasterData(String masterData) {
        this.masterData = masterData;
        return this;
    }
    public String getMasterData() {
        return this.masterData;
    }

    public InsertSynchronizConstantsRequest setProductCodeData(String productCodeData) {
        this.productCodeData = productCodeData;
        return this;
    }
    public String getProductCodeData() {
        return this.productCodeData;
    }

    public InsertSynchronizConstantsRequest setOsversionData(String osversionData) {
        this.osversionData = osversionData;
        return this;
    }
    public String getOsversionData() {
        return this.osversionData;
    }

    public InsertSynchronizConstantsRequest setZoneData(String zoneData) {
        this.zoneData = zoneData;
        return this;
    }
    public String getZoneData() {
        return this.zoneData;
    }

    public InsertSynchronizConstantsRequest setRegionData(String regionData) {
        this.regionData = regionData;
        return this;
    }
    public String getRegionData() {
        return this.regionData;
    }

    public InsertSynchronizConstantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public InsertSynchronizConstantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
