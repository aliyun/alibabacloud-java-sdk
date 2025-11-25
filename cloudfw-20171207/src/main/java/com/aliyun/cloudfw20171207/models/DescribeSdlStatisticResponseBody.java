// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>337A4DBA-8A01-5E9C-99CA-84293E13****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdlStatisticResp")
    public DescribeSdlStatisticResponseBodySdlStatisticResp sdlStatisticResp;

    public static DescribeSdlStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlStatisticResponseBody self = new DescribeSdlStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlStatisticResponseBody setSdlStatisticResp(DescribeSdlStatisticResponseBodySdlStatisticResp sdlStatisticResp) {
        this.sdlStatisticResp = sdlStatisticResp;
        return this;
    }
    public DescribeSdlStatisticResponseBodySdlStatisticResp getSdlStatisticResp() {
        return this.sdlStatisticResp;
    }

    public static class DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>116.62.66.XXX</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TrafficBytes")
        public Long trafficBytes;

        public static DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList self = new DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList setTrafficBytes(Long trafficBytes) {
            this.trafficBytes = trafficBytes;
            return this;
        }
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

    }

    public static class DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>47.101.68.XXX</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TrafficBytes")
        public Long trafficBytes;

        public static DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList self = new DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList setTrafficBytes(Long trafficBytes) {
            this.trafficBytes = trafficBytes;
            return this;
        }
        public Long getTrafficBytes() {
            return this.trafficBytes;
        }

    }

    public static class DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public String count;

        @NameInMap("EventType")
        public String eventType;

        public static DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList self = new DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

    }

    public static class DescribeSdlStatisticResponseBodySdlStatisticResp extends TeaModel {
        @NameInMap("SdlAssetTopList")
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList> sdlAssetTopList;

        @NameInMap("SdlDstTopList")
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList> sdlDstTopList;

        @NameInMap("SdlEventTypeCountList")
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList> sdlEventTypeCountList;

        public static DescribeSdlStatisticResponseBodySdlStatisticResp build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlStatisticResponseBodySdlStatisticResp self = new DescribeSdlStatisticResponseBodySdlStatisticResp();
            return TeaModel.build(map, self);
        }

        public DescribeSdlStatisticResponseBodySdlStatisticResp setSdlAssetTopList(java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList> sdlAssetTopList) {
            this.sdlAssetTopList = sdlAssetTopList;
            return this;
        }
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlAssetTopList> getSdlAssetTopList() {
            return this.sdlAssetTopList;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticResp setSdlDstTopList(java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList> sdlDstTopList) {
            this.sdlDstTopList = sdlDstTopList;
            return this;
        }
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlDstTopList> getSdlDstTopList() {
            return this.sdlDstTopList;
        }

        public DescribeSdlStatisticResponseBodySdlStatisticResp setSdlEventTypeCountList(java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList> sdlEventTypeCountList) {
            this.sdlEventTypeCountList = sdlEventTypeCountList;
            return this;
        }
        public java.util.List<DescribeSdlStatisticResponseBodySdlStatisticRespSdlEventTypeCountList> getSdlEventTypeCountList() {
            return this.sdlEventTypeCountList;
        }

    }

}
