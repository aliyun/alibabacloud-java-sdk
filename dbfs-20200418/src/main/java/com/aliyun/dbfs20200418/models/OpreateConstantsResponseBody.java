// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class OpreateConstantsResponseBody extends TeaModel {
    @NameInMap("AccessData")
    public String accessData;

    @NameInMap("Data")
    public String data;

    @NameInMap("EndpointData")
    public String endpointData;

    @NameInMap("MasterData")
    public String masterData;

    @NameInMap("OsversionData")
    public String osversionData;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductCodeData")
    public String productCodeData;

    @NameInMap("RegionData")
    public String regionData;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("ZoneData")
    public String zoneData;

    public static OpreateConstantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpreateConstantsResponseBody self = new OpreateConstantsResponseBody();
        return TeaModel.build(map, self);
    }

    public OpreateConstantsResponseBody setAccessData(String accessData) {
        this.accessData = accessData;
        return this;
    }
    public String getAccessData() {
        return this.accessData;
    }

    public OpreateConstantsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpreateConstantsResponseBody setEndpointData(String endpointData) {
        this.endpointData = endpointData;
        return this;
    }
    public String getEndpointData() {
        return this.endpointData;
    }

    public OpreateConstantsResponseBody setMasterData(String masterData) {
        this.masterData = masterData;
        return this;
    }
    public String getMasterData() {
        return this.masterData;
    }

    public OpreateConstantsResponseBody setOsversionData(String osversionData) {
        this.osversionData = osversionData;
        return this;
    }
    public String getOsversionData() {
        return this.osversionData;
    }

    public OpreateConstantsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public OpreateConstantsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public OpreateConstantsResponseBody setProductCodeData(String productCodeData) {
        this.productCodeData = productCodeData;
        return this;
    }
    public String getProductCodeData() {
        return this.productCodeData;
    }

    public OpreateConstantsResponseBody setRegionData(String regionData) {
        this.regionData = regionData;
        return this;
    }
    public String getRegionData() {
        return this.regionData;
    }

    public OpreateConstantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpreateConstantsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public OpreateConstantsResponseBody setZoneData(String zoneData) {
        this.zoneData = zoneData;
        return this;
    }
    public String getZoneData() {
        return this.zoneData;
    }

}
