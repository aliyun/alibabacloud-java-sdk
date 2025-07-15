// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCenterStreamRateDataResponseBody extends TeaModel {
    /**
     * <p>The list of frame rates and bitrates.</p>
     */
    @NameInMap("RateDatas")
    public java.util.List<DescribeLiveCenterStreamRateDataResponseBodyRateDatas> rateDatas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6E125BE-E9B8-1103-8684-A3585CB632F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveCenterStreamRateDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCenterStreamRateDataResponseBody self = new DescribeLiveCenterStreamRateDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCenterStreamRateDataResponseBody setRateDatas(java.util.List<DescribeLiveCenterStreamRateDataResponseBodyRateDatas> rateDatas) {
        this.rateDatas = rateDatas;
        return this;
    }
    public java.util.List<DescribeLiveCenterStreamRateDataResponseBodyRateDatas> getRateDatas() {
        return this.rateDatas;
    }

    public DescribeLiveCenterStreamRateDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveCenterStreamRateDataResponseBodyRateDatas extends TeaModel {
        /**
         * <p>The audio frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("AudioFps")
        public String audioFps;

        /**
         * <p>The audio bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("AudioRate")
        public String audioRate;

        /**
         * <p>The time when the data was collected. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05T18:00:53Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>The video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VideoFps")
        public String videoFps;

        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1953584</p>
         */
        @NameInMap("VideoRate")
        public String videoRate;

        public static DescribeLiveCenterStreamRateDataResponseBodyRateDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCenterStreamRateDataResponseBodyRateDatas self = new DescribeLiveCenterStreamRateDataResponseBodyRateDatas();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCenterStreamRateDataResponseBodyRateDatas setAudioFps(String audioFps) {
            this.audioFps = audioFps;
            return this;
        }
        public String getAudioFps() {
            return this.audioFps;
        }

        public DescribeLiveCenterStreamRateDataResponseBodyRateDatas setAudioRate(String audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public String getAudioRate() {
            return this.audioRate;
        }

        public DescribeLiveCenterStreamRateDataResponseBodyRateDatas setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeLiveCenterStreamRateDataResponseBodyRateDatas setVideoFps(String videoFps) {
            this.videoFps = videoFps;
            return this;
        }
        public String getVideoFps() {
            return this.videoFps;
        }

        public DescribeLiveCenterStreamRateDataResponseBodyRateDatas setVideoRate(String videoRate) {
            this.videoRate = videoRate;
            return this;
        }
        public String getVideoRate() {
            return this.videoRate;
        }

    }

}
