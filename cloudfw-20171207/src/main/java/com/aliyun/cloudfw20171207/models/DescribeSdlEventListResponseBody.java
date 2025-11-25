// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F06DE24D-6EB9-5F55-B588-7BB946DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdlEventDetailList")
    public java.util.List<DescribeSdlEventListResponseBodySdlEventDetailList> sdlEventDetailList;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSdlEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventListResponseBody self = new DescribeSdlEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlEventListResponseBody setSdlEventDetailList(java.util.List<DescribeSdlEventListResponseBodySdlEventDetailList> sdlEventDetailList) {
        this.sdlEventDetailList = sdlEventDetailList;
        return this;
    }
    public java.util.List<DescribeSdlEventListResponseBodySdlEventDetailList> getSdlEventDetailList() {
        return this.sdlEventDetailList;
    }

    public DescribeSdlEventListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSdlEventListResponseBodySdlEventDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <strong>example:</strong>
         * <p>47.100.102.XXX</p>
         */
        @NameInMap("AssetPrivateIp")
        public String assetPrivateIp;

        /**
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("CategoryClassId")
        public String categoryClassId;

        /**
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>000</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <strong>example:</strong>
         * <p>106.14.74.XXX</p>
         */
        @NameInMap("DstIp")
        public String dstIp;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("DstPortList")
        public String dstPortList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventCnt")
        public Long eventCnt;

        /**
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("EventLevel")
        public String eventLevel;

        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>1735697768</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        /**
         * <strong>example:</strong>
         * <p>1738636157</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("LocationName")
        public String locationName;

        /**
         * <strong>example:</strong>
         * <p>3082002f02010004067075626c6963a082002002044c33a756020100020100308200103082000c06082b060102010105000500</p>
         */
        @NameInMap("Payload")
        public String payload;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("ProtoList")
        public String protoList;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ce347a98f41e849188aa51c56b02a****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResourceIdType")
        public Integer resourceIdType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SensitiveDataCnt")
        public Long sensitiveDataCnt;

        @NameInMap("SensitiveDataList")
        public java.util.List<String> sensitiveDataList;

        /**
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        @NameInMap("SensitiveType")
        public String sensitiveType;

        /**
         * <strong>example:</strong>
         * <p>104.28.226.XX</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("SrcPortList")
        public String srcPortList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TrafficBytes")
        public Long trafficBytes;

        /**
         * <strong>example:</strong>
         * <p>b91035dc-8be4-411d-bec5-e6320af9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSdlEventListResponseBodySdlEventDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlEventListResponseBodySdlEventDetailList self = new DescribeSdlEventListResponseBodySdlEventDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setAssetPrivateIp(String assetPrivateIp) {
            this.assetPrivateIp = assetPrivateIp;
            return this;
        }
        public String getAssetPrivateIp() {
            return this.assetPrivateIp;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setCategoryClassId(String categoryClassId) {
            this.categoryClassId = categoryClassId;
            return this;
        }
        public String getCategoryClassId() {
            return this.categoryClassId;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setDstIp(String dstIp) {
            this.dstIp = dstIp;
            return this;
        }
        public String getDstIp() {
            return this.dstIp;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setDstPortList(String dstPortList) {
            this.dstPortList = dstPortList;
            return this;
        }
        public String getDstPortList() {
            return this.dstPortList;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setEventCnt(Long eventCnt) {
            this.eventCnt = eventCnt;
            return this;
        }
        public Long getEventCnt() {
            return this.eventCnt;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setEventLevel(String eventLevel) {
            this.eventLevel = eventLevel;
            return this;
        }
        public String getEventLevel() {
            return this.eventLevel;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setProtoList(String protoList) {
            this.protoList = protoList;
            return this;
        }
        public String getProtoList() {
            return this.protoList;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setResourceIdType(Integer resourceIdType) {
            this.resourceIdType = resourceIdType;
            return this;
        }
        public Integer getResourceIdType() {
            return this.resourceIdType;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSensitiveDataCnt(Long sensitiveDataCnt) {
            this.sensitiveDataCnt = sensitiveDataCnt;
            return this;
        }
        public Long getSensitiveDataCnt() {
            return this.sensitiveDataCnt;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSensitiveDataList(java.util.List<String> sensitiveDataList) {
            this.sensitiveDataList = sensitiveDataList;
            return this;
        }
        public java.util.List<String> getSensitiveDataList() {
            return this.sensitiveDataList;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSensitiveType(String sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setSrcPortList(String srcPortList) {
            this.srcPortList = srcPortList;
            return this;
        }
        public String getSrcPortList() {
            return this.srcPortList;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setTrafficBytes(Long trafficBytes) {
            this.trafficBytes = trafficBytes;
            return this;
        }
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

        public DescribeSdlEventListResponseBodySdlEventDetailList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
