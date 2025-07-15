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

    /**
     * <p>The transcoding usage data returned at each interval.</p>
     */
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
        /**
         * <p>The main streaming domain. This parameter is returned only when you add the domain key to the value of the Split parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The transcoding length. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The frame rate of the transcoded stream. This parameter is returned only when you add the fps key to the value of the Split parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The region in which the domain name resides. Valid values:</p>
         * <blockquote>
         * <p> This parameter takes effect only when you set Split to region.</p>
         * </blockquote>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
         * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The resolution of the transcoded stream. This parameter is returned only when you add the resolution key to the value of the Split parameter. Valid values:</p>
         * <ul>
         * <li><strong>2K</strong></li>
         * <li><strong>4K</strong></li>
         * <li><strong>LD</strong>: low definition</li>
         * <li><strong>SD</strong>: standard definition</li>
         * <li><strong>HD</strong>: high definition</li>
         * <li><strong>def</strong>: audio</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HD</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The transcoding type. Valid values:</p>
         * <blockquote>
         * <p> This parameter takes effect only if the request parameter Split is set to transcode_type.</p>
         * </blockquote>
         * <ul>
         * <li><strong>H264NBHD</strong>: Narrowband HD™ transcoding based on H.264</li>
         * <li><strong>H265NBHD</strong>: Narrowband HD™ transcoding based on H.265</li>
         * <li><strong>AUDIO</strong>: audio transcoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H264STD</p>
         */
        @NameInMap("TanscodeType")
        public String tanscodeType;

        /**
         * <p>The timestamp of the data entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-10T20:00:00Z</p>
         */
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
