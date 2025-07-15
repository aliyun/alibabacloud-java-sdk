// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUpVideoAudioInfoResponseBody extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>BC858082-736F-4A25-867B-E5B67C85ACF7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("UpItems")
    public DescribeLiveUpVideoAudioInfoResponseBodyUpItems upItems;

    public static DescribeLiveUpVideoAudioInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUpVideoAudioInfoResponseBody self = new DescribeLiveUpVideoAudioInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUpVideoAudioInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveUpVideoAudioInfoResponseBody setUpItems(DescribeLiveUpVideoAudioInfoResponseBodyUpItems upItems) {
        this.upItems = upItems;
        return this;
    }
    public DescribeLiveUpVideoAudioInfoResponseBodyUpItems getUpItems() {
        return this.upItems;
    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders extends TeaModel {
        /**
         * <p>The number of AAC headers in the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders extends TeaModel {
        @NameInMap("AacHeaders")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders> aacHeaders;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders setAacHeaders(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders> aacHeaders) {
            this.aacHeaders = aacHeaders;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeadersAacHeaders> getAacHeaders() {
            return this.aacHeaders;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate extends TeaModel {
        /**
         * <p>The bitrate of the audio. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>24552</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate extends TeaModel {
        @NameInMap("AudioBitRate")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate> audioBitRate;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate setAudioBitRate(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate> audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRateAudioBitRate> getAudioBitRate() {
            return this.audioBitRate;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames extends TeaModel {
        /**
         * <p>The frame rate of the audio. Unit: frames.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames extends TeaModel {
        @NameInMap("AudioFrames")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames> audioFrames;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames setAudioFrames(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames> audioFrames) {
            this.audioFrames = audioFrames;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFramesAudioFrames> getAudioFrames() {
            return this.audioFrames;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval extends TeaModel {
        /**
         * <p>The maximum audio frame interval. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>254</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval extends TeaModel {
        @NameInMap("AudioInterval")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval> audioInterval;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval setAudioInterval(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval> audioInterval) {
            this.audioInterval = audioInterval;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioIntervalAudioInterval> getAudioInterval() {
            return this.audioInterval;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps extends TeaModel {
        /**
         * <p>The audio timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>725053422</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps extends TeaModel {
        @NameInMap("AudioStamps")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps> audioStamps;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps setAudioStamps(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps> audioStamps) {
            this.audioStamps = audioStamps;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStampsAudioStamps> getAudioStamps() {
            return this.audioStamps;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders extends TeaModel {
        /**
         * <p>The number of AVC headers in the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders extends TeaModel {
        @NameInMap("AvcHeaders")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders> avcHeaders;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders setAvcHeaders(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders> avcHeaders) {
            this.avcHeaders = avcHeaders;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeadersAvcHeaders> getAvcHeaders() {
            return this.avcHeaders;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags extends TeaModel {
        /**
         * <p>The number of times the error code that indicates interrupted stream ingest was returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags extends TeaModel {
        @NameInMap("ErrorFlags")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags> errorFlags;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags setErrorFlags(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags> errorFlags) {
            this.errorFlags = errorFlags;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlagsErrorFlags> getErrorFlags() {
            return this.errorFlags;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp extends TeaModel {
        /**
         * <p>The difference between the audio and video timestamps. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>359</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp extends TeaModel {
        @NameInMap("V_AStamp")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp> vAStamp;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp setVAStamp(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp> vAStamp) {
            this.vAStamp = vAStamp;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStampVAStamp> getVAStamp() {
            return this.vAStamp;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate extends TeaModel {
        /**
         * <p>The bitrate of the video. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3970160</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate extends TeaModel {
        @NameInMap("VideoBitRate")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate> videoBitRate;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate setVideoBitRate(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate> videoBitRate) {
            this.videoBitRate = videoBitRate;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRateVideoBitRate> getVideoBitRate() {
            return this.videoBitRate;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames extends TeaModel {
        /**
         * <p>The frame rate of the video. Unit: frames.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames extends TeaModel {
        @NameInMap("VideoFrames")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames> videoFrames;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames setVideoFrames(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames> videoFrames) {
            this.videoFrames = videoFrames;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFramesVideoFrames> getVideoFrames() {
            return this.videoFrames;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval extends TeaModel {
        /**
         * <p>The maximum video frame interval. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>278</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval extends TeaModel {
        @NameInMap("VideoInterval")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval> videoInterval;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval setVideoInterval(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval> videoInterval) {
            this.videoInterval = videoInterval;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoIntervalVideoInterval> getVideoInterval() {
            return this.videoInterval;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps extends TeaModel {
        /**
         * <p>The video timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1538134750408</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The query time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>725053781</p>
         */
        @NameInMap("Value")
        public Integer value;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps extends TeaModel {
        @NameInMap("VideoStamps")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps> videoStamps;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps setVideoStamps(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps> videoStamps) {
            this.videoStamps = videoStamps;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStampsVideoStamps> getVideoStamps() {
            return this.videoStamps;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem extends TeaModel {
        /**
         * <p>The details about the audio and video data of the stream ingest occurrences.</p>
         */
        @NameInMap("AacHeaders")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders aacHeaders;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         * 
         * <strong>example:</strong>
         * <p>AppName</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The name of the application to which the ingested stream belongs.</p>
         */
        @NameInMap("AudioBitRate")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate audioBitRate;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("AudioFrames")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames audioFrames;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("AudioInterval")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval audioInterval;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("AudioStamps")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps audioStamps;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("AvcHeaders")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders avcHeaders;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         * 
         * <strong>example:</strong>
         * <p>H264/AAC</p>
         */
        @NameInMap("CodecInfo")
        public String codecInfo;

        /**
         * <p>The audio and video encoding information.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ingest domain.</p>
         */
        @NameInMap("ErrorFlags")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags errorFlags;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PublishInterval")
        public String publishInterval;

        /**
         * <p>The stream ingest duration. Unit: seconds. A hyphen (-) indicates that the stream is being ingested and the duration cannot be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn397</p>
         */
        @NameInMap("PublishIp")
        public String publishIp;

        /**
         * <p>The IP address of the stream ingest client.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public String publishStatus;

        /**
         * <p>The stream ingest status. A value of 1 indicates that the stream is being ingested. A value of 0 indicates that the stream was ingested.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T15:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The start time of stream ingest. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-10T15:10:00Z</p>
         */
        @NameInMap("StopTime")
        public String stopTime;

        /**
         * <p>The end time of stream ingest. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamName</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        /**
         * <p>The name of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>2.-395_37261_9848098_1538080899396</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>The unique ID of each stream ingest occurrence.</p>
         */
        @NameInMap("VideoAndAudioStamp")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp videoAndAudioStamp;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("VideoBitRate")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate videoBitRate;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("VideoFrames")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames videoFrames;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("VideoInterval")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval videoInterval;

        /**
         * <p>The metric value at a granularity of seconds at the query time.</p>
         */
        @NameInMap("VideoStamps")
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps videoStamps;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAacHeaders(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders aacHeaders) {
            this.aacHeaders = aacHeaders;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAacHeaders getAacHeaders() {
            return this.aacHeaders;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAudioBitRate(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioBitRate getAudioBitRate() {
            return this.audioBitRate;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAudioFrames(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames audioFrames) {
            this.audioFrames = audioFrames;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioFrames getAudioFrames() {
            return this.audioFrames;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAudioInterval(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval audioInterval) {
            this.audioInterval = audioInterval;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioInterval getAudioInterval() {
            return this.audioInterval;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAudioStamps(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps audioStamps) {
            this.audioStamps = audioStamps;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAudioStamps getAudioStamps() {
            return this.audioStamps;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setAvcHeaders(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders avcHeaders) {
            this.avcHeaders = avcHeaders;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemAvcHeaders getAvcHeaders() {
            return this.avcHeaders;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setCodecInfo(String codecInfo) {
            this.codecInfo = codecInfo;
            return this;
        }
        public String getCodecInfo() {
            return this.codecInfo;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setErrorFlags(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags errorFlags) {
            this.errorFlags = errorFlags;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemErrorFlags getErrorFlags() {
            return this.errorFlags;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setPublishInterval(String publishInterval) {
            this.publishInterval = publishInterval;
            return this;
        }
        public String getPublishInterval() {
            return this.publishInterval;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setPublishIp(String publishIp) {
            this.publishIp = publishIp;
            return this;
        }
        public String getPublishIp() {
            return this.publishIp;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setVideoAndAudioStamp(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp videoAndAudioStamp) {
            this.videoAndAudioStamp = videoAndAudioStamp;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoAndAudioStamp getVideoAndAudioStamp() {
            return this.videoAndAudioStamp;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setVideoBitRate(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate videoBitRate) {
            this.videoBitRate = videoBitRate;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoBitRate getVideoBitRate() {
            return this.videoBitRate;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setVideoFrames(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames videoFrames) {
            this.videoFrames = videoFrames;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoFrames getVideoFrames() {
            return this.videoFrames;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setVideoInterval(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval videoInterval) {
            this.videoInterval = videoInterval;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoInterval getVideoInterval() {
            return this.videoInterval;
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem setVideoStamps(DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps videoStamps) {
            this.videoStamps = videoStamps;
            return this;
        }
        public DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItemVideoStamps getVideoStamps() {
            return this.videoStamps;
        }

    }

    public static class DescribeLiveUpVideoAudioInfoResponseBodyUpItems extends TeaModel {
        @NameInMap("PublishItem")
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem> publishItem;

        public static DescribeLiveUpVideoAudioInfoResponseBodyUpItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUpVideoAudioInfoResponseBodyUpItems self = new DescribeLiveUpVideoAudioInfoResponseBodyUpItems();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUpVideoAudioInfoResponseBodyUpItems setPublishItem(java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem> publishItem) {
            this.publishItem = publishItem;
            return this;
        }
        public java.util.List<DescribeLiveUpVideoAudioInfoResponseBodyUpItemsPublishItem> getPublishItem() {
            return this.publishItem;
        }

    }

}
