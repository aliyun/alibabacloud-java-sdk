// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStreamTranscodeDataResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TranscodeDataList")
    public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList transcodeDataList;

    public static DescribeLiveDomainStreamTranscodeDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStreamTranscodeDataResponseBody self = new DescribeLiveDomainStreamTranscodeDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStreamTranscodeDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainStreamTranscodeDataResponseBody setTranscodeDataList(DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList transcodeDataList) {
        this.transcodeDataList = transcodeDataList;
        return this;
    }
    public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList getTranscodeDataList() {
        return this.transcodeDataList;
    }

    public static class DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Region")
        public String region;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("TanscodeType")
        public String tanscodeType;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData self = new DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setTanscodeType(String tanscodeType) {
            this.tanscodeType = tanscodeType;
            return this;
        }
        public String getTanscodeType() {
            return this.tanscodeType;
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList extends TeaModel {
        @NameInMap("TranscodeData")
        public java.util.List<DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData> transcodeData;

        public static DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList self = new DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataList setTranscodeData(java.util.List<DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData> transcodeData) {
            this.transcodeData = transcodeData;
            return this;
        }
        public java.util.List<DescribeLiveDomainStreamTranscodeDataResponseBodyTranscodeDataListTranscodeData> getTranscodeData() {
            return this.transcodeData;
        }

    }

}
