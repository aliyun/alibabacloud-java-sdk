// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LiveUpstreamQosDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<LiveUpstreamQosDataResponseBodyData> data;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static LiveUpstreamQosDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiveUpstreamQosDataResponseBody self = new LiveUpstreamQosDataResponseBody();
        return TeaModel.build(map, self);
    }

    public LiveUpstreamQosDataResponseBody setData(java.util.List<LiveUpstreamQosDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LiveUpstreamQosDataResponseBodyData> getData() {
        return this.data;
    }

    public LiveUpstreamQosDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LiveUpstreamQosDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LiveUpstreamQosDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class LiveUpstreamQosDataResponseBodyDataDetailData extends TeaModel {
        @NameInMap("ConnectDur")
        public Long connectDur;

        @NameInMap("ConnectFailedCount")
        public Long connectFailedCount;

        @NameInMap("Count")
        public Long count;

        @NameInMap("FirstDataDur")
        public Long firstDataDur;

        @NameInMap("FirstDataFailedCount")
        public Long firstDataFailedCount;

        @NameInMap("FirstFrameDur")
        public Long firstFrameDur;

        @NameInMap("FirstFrameSuccessCount")
        public Long firstFrameSuccessCount;

        @NameInMap("StatusCode2Xx")
        public Long statusCode2Xx;

        @NameInMap("StatusCode3Xx")
        public Long statusCode3Xx;

        @NameInMap("StatusCode4Xx")
        public Long statusCode4Xx;

        @NameInMap("StatusCode5Xx")
        public Long statusCode5Xx;

        @NameInMap("Timestamp")
        public String timestamp;

        public static LiveUpstreamQosDataResponseBodyDataDetailData build(java.util.Map<String, ?> map) throws Exception {
            LiveUpstreamQosDataResponseBodyDataDetailData self = new LiveUpstreamQosDataResponseBodyDataDetailData();
            return TeaModel.build(map, self);
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setConnectDur(Long connectDur) {
            this.connectDur = connectDur;
            return this;
        }
        public Long getConnectDur() {
            return this.connectDur;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setConnectFailedCount(Long connectFailedCount) {
            this.connectFailedCount = connectFailedCount;
            return this;
        }
        public Long getConnectFailedCount() {
            return this.connectFailedCount;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setFirstDataDur(Long firstDataDur) {
            this.firstDataDur = firstDataDur;
            return this;
        }
        public Long getFirstDataDur() {
            return this.firstDataDur;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setFirstDataFailedCount(Long firstDataFailedCount) {
            this.firstDataFailedCount = firstDataFailedCount;
            return this;
        }
        public Long getFirstDataFailedCount() {
            return this.firstDataFailedCount;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setFirstFrameDur(Long firstFrameDur) {
            this.firstFrameDur = firstFrameDur;
            return this;
        }
        public Long getFirstFrameDur() {
            return this.firstFrameDur;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setFirstFrameSuccessCount(Long firstFrameSuccessCount) {
            this.firstFrameSuccessCount = firstFrameSuccessCount;
            return this;
        }
        public Long getFirstFrameSuccessCount() {
            return this.firstFrameSuccessCount;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setStatusCode2Xx(Long statusCode2Xx) {
            this.statusCode2Xx = statusCode2Xx;
            return this;
        }
        public Long getStatusCode2Xx() {
            return this.statusCode2Xx;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setStatusCode3Xx(Long statusCode3Xx) {
            this.statusCode3Xx = statusCode3Xx;
            return this;
        }
        public Long getStatusCode3Xx() {
            return this.statusCode3Xx;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setStatusCode4Xx(Long statusCode4Xx) {
            this.statusCode4Xx = statusCode4Xx;
            return this;
        }
        public Long getStatusCode4Xx() {
            return this.statusCode4Xx;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setStatusCode5Xx(Long statusCode5Xx) {
            this.statusCode5Xx = statusCode5Xx;
            return this;
        }
        public Long getStatusCode5Xx() {
            return this.statusCode5Xx;
        }

        public LiveUpstreamQosDataResponseBodyDataDetailData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class LiveUpstreamQosDataResponseBodyData extends TeaModel {
        @NameInMap("CdnDomain")
        public String cdnDomain;

        @NameInMap("CdnIsp")
        public String cdnIsp;

        @NameInMap("CdnOcid")
        public String cdnOcid;

        @NameInMap("CdnProvince")
        public String cdnProvince;

        @NameInMap("DetailData")
        public java.util.List<LiveUpstreamQosDataResponseBodyDataDetailData> detailData;

        @NameInMap("KwaiSidc")
        public String kwaiSidc;

        @NameInMap("KwaiTsc")
        public Long kwaiTsc;

        @NameInMap("UpstreamDomain")
        public String upstreamDomain;

        public static LiveUpstreamQosDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LiveUpstreamQosDataResponseBodyData self = new LiveUpstreamQosDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LiveUpstreamQosDataResponseBodyData setCdnDomain(String cdnDomain) {
            this.cdnDomain = cdnDomain;
            return this;
        }
        public String getCdnDomain() {
            return this.cdnDomain;
        }

        public LiveUpstreamQosDataResponseBodyData setCdnIsp(String cdnIsp) {
            this.cdnIsp = cdnIsp;
            return this;
        }
        public String getCdnIsp() {
            return this.cdnIsp;
        }

        public LiveUpstreamQosDataResponseBodyData setCdnOcid(String cdnOcid) {
            this.cdnOcid = cdnOcid;
            return this;
        }
        public String getCdnOcid() {
            return this.cdnOcid;
        }

        public LiveUpstreamQosDataResponseBodyData setCdnProvince(String cdnProvince) {
            this.cdnProvince = cdnProvince;
            return this;
        }
        public String getCdnProvince() {
            return this.cdnProvince;
        }

        public LiveUpstreamQosDataResponseBodyData setDetailData(java.util.List<LiveUpstreamQosDataResponseBodyDataDetailData> detailData) {
            this.detailData = detailData;
            return this;
        }
        public java.util.List<LiveUpstreamQosDataResponseBodyDataDetailData> getDetailData() {
            return this.detailData;
        }

        public LiveUpstreamQosDataResponseBodyData setKwaiSidc(String kwaiSidc) {
            this.kwaiSidc = kwaiSidc;
            return this;
        }
        public String getKwaiSidc() {
            return this.kwaiSidc;
        }

        public LiveUpstreamQosDataResponseBodyData setKwaiTsc(Long kwaiTsc) {
            this.kwaiTsc = kwaiTsc;
            return this;
        }
        public Long getKwaiTsc() {
            return this.kwaiTsc;
        }

        public LiveUpstreamQosDataResponseBodyData setUpstreamDomain(String upstreamDomain) {
            this.upstreamDomain = upstreamDomain;
            return this;
        }
        public String getUpstreamDomain() {
            return this.upstreamDomain;
        }

    }

}
