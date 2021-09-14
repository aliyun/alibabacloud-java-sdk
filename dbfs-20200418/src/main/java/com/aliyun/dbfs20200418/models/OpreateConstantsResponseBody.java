// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class OpreateConstantsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    @NameInMap("RegionData")
    public String regionData;

    @NameInMap("ZoneData")
    public String zoneData;

    @NameInMap("OsversionData")
    public String osversionData;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ProductCodeData")
    public String productCodeData;

    @NameInMap("MasterData")
    public String masterData;

    @NameInMap("EndpointData")
    public String endpointData;

    @NameInMap("AccessData")
    public String accessData;

    public static OpreateConstantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpreateConstantsResponseBody self = new OpreateConstantsResponseBody();
        return TeaModel.build(map, self);
    }

    public OpreateConstantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpreateConstantsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpreateConstantsResponseBody setRegionData(String regionData) {
        this.regionData = regionData;
        return this;
    }
    public String getRegionData() {
        return this.regionData;
    }

    public OpreateConstantsResponseBody setZoneData(String zoneData) {
        this.zoneData = zoneData;
        return this;
    }
    public String getZoneData() {
        return this.zoneData;
    }

    public OpreateConstantsResponseBody setOsversionData(String osversionData) {
        this.osversionData = osversionData;
        return this;
    }
    public String getOsversionData() {
        return this.osversionData;
    }

    public OpreateConstantsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public OpreateConstantsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public OpreateConstantsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public OpreateConstantsResponseBody setProductCodeData(String productCodeData) {
        this.productCodeData = productCodeData;
        return this;
    }
    public String getProductCodeData() {
        return this.productCodeData;
    }

    public OpreateConstantsResponseBody setMasterData(String masterData) {
        this.masterData = masterData;
        return this;
    }
    public String getMasterData() {
        return this.masterData;
    }

    public OpreateConstantsResponseBody setEndpointData(String endpointData) {
        this.endpointData = endpointData;
        return this;
    }
    public String getEndpointData() {
        return this.endpointData;
    }

    public OpreateConstantsResponseBody setAccessData(String accessData) {
        this.accessData = accessData;
        return this;
    }
    public String getAccessData() {
        return this.accessData;
    }

}
