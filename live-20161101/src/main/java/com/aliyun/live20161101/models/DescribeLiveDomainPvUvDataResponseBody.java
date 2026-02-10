// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainPvUvDataResponseBody extends TeaModel {
    /**
     * <p>The time interval between the entries returned. Unit: seconds. Default value: 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("DataInterval")
    public String dataInterval;

    /**
     * <p>The streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-20T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PvUvDataInfos")
    public DescribeLiveDomainPvUvDataResponseBodyPvUvDataInfos pvUvDataInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range during which the data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZ</em> format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-17T16:00:00Z</p>
     */
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
