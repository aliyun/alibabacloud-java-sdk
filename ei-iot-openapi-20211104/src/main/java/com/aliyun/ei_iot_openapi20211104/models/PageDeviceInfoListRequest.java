// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class PageDeviceInfoListRequest extends TeaModel {
    @NameInMap("App")
    public App app;

    @NameInMap("BizRequest")
    public PageDeviceInfoListRequestBizRequest bizRequest;

    @NameInMap("Tenant")
    public Tenant tenant;

    public static PageDeviceInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        PageDeviceInfoListRequest self = new PageDeviceInfoListRequest();
        return TeaModel.build(map, self);
    }

    public PageDeviceInfoListRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public PageDeviceInfoListRequest setBizRequest(PageDeviceInfoListRequestBizRequest bizRequest) {
        this.bizRequest = bizRequest;
        return this;
    }
    public PageDeviceInfoListRequestBizRequest getBizRequest() {
        return this.bizRequest;
    }

    public PageDeviceInfoListRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class PageDeviceInfoListRequestBizRequest extends TeaModel {
        @NameInMap("ActiveStatus")
        public Long activeStatus;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("DeviceIp")
        public String deviceIp;

        @NameInMap("DeviceMac")
        public String deviceMac;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("LastUpdateEnd")
        public Long lastUpdateEnd;

        @NameInMap("LastUpdateStart")
        public Long lastUpdateStart;

        @NameInMap("ModelCode")
        public String modelCode;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("RunStatus")
        public String runStatus;

        @NameInMap("SeriesNum")
        public String seriesNum;

        @NameInMap("SpaceCode")
        public String spaceCode;

        @NameInMap("SpaceId")
        public Long spaceId;

        public static PageDeviceInfoListRequestBizRequest build(java.util.Map<String, ?> map) throws Exception {
            PageDeviceInfoListRequestBizRequest self = new PageDeviceInfoListRequestBizRequest();
            return TeaModel.build(map, self);
        }

        public PageDeviceInfoListRequestBizRequest setActiveStatus(Long activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }
        public Long getActiveStatus() {
            return this.activeStatus;
        }

        public PageDeviceInfoListRequestBizRequest setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public PageDeviceInfoListRequestBizRequest setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public PageDeviceInfoListRequestBizRequest setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public PageDeviceInfoListRequestBizRequest setDeviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }
        public String getDeviceMac() {
            return this.deviceMac;
        }

        public PageDeviceInfoListRequestBizRequest setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public PageDeviceInfoListRequestBizRequest setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public PageDeviceInfoListRequestBizRequest setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public PageDeviceInfoListRequestBizRequest setLastUpdateEnd(Long lastUpdateEnd) {
            this.lastUpdateEnd = lastUpdateEnd;
            return this;
        }
        public Long getLastUpdateEnd() {
            return this.lastUpdateEnd;
        }

        public PageDeviceInfoListRequestBizRequest setLastUpdateStart(Long lastUpdateStart) {
            this.lastUpdateStart = lastUpdateStart;
            return this;
        }
        public Long getLastUpdateStart() {
            return this.lastUpdateStart;
        }

        public PageDeviceInfoListRequestBizRequest setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public PageDeviceInfoListRequestBizRequest setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public PageDeviceInfoListRequestBizRequest setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

        public PageDeviceInfoListRequestBizRequest setSeriesNum(String seriesNum) {
            this.seriesNum = seriesNum;
            return this;
        }
        public String getSeriesNum() {
            return this.seriesNum;
        }

        public PageDeviceInfoListRequestBizRequest setSpaceCode(String spaceCode) {
            this.spaceCode = spaceCode;
            return this;
        }
        public String getSpaceCode() {
            return this.spaceCode;
        }

        public PageDeviceInfoListRequestBizRequest setSpaceId(Long spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public Long getSpaceId() {
            return this.spaceId;
        }

    }

}
