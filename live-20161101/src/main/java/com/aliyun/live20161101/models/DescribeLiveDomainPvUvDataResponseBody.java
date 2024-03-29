// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPvUvDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PvUvDataInfos")
    public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos pvUvDataInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainPvUvDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainPvUvDataResponseBody self = new DescribeLiveDomainPvUvDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainPvUvDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeLiveDomainPvUvDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainPvUvDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainPvUvDataResponseBody setPvUvDataInfos(DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos pvUvDataInfos) {
        this.pvUvDataInfos = pvUvDataInfos;
        return this;
    }
    public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos getPvUvDataInfos() {
        return this.pvUvDataInfos;
    }

    public DescribeLiveDomainPvUvDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainPvUvDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo extends TeaModel {
        @NameInMap("PV")
        public String PV;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("UV")
        public String UV;

        public static DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo self = new DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setPV(String PV) {
            this.PV = PV;
            return this;
        }
        public String getPV() {
            return this.PV;
        }

        public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo setUV(String UV) {
            this.UV = UV;
            return this;
        }
        public String getUV() {
            return this.UV;
        }

    }

    public static class DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos extends TeaModel {
        @NameInMap("PvUvDataInfo")
        public java.util.List<DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> pvUvDataInfo;

        public static DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos self = new DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos setPvUvDataInfo(java.util.List<DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> pvUvDataInfo) {
            this.pvUvDataInfo = pvUvDataInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfosPvUvDataInfo> getPvUvDataInfo() {
            return this.pvUvDataInfo;
        }

    }

}
