// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveGrtnDurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B460F8B-993C-4F48-B98A-910811DEBFEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamDetailData")
    public DescribeLiveGrtnDurationResponseBodyStreamDetailData streamDetailData;

    public static DescribeLiveGrtnDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveGrtnDurationResponseBody self = new DescribeLiveGrtnDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveGrtnDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveGrtnDurationResponseBody setStreamDetailData(DescribeLiveGrtnDurationResponseBodyStreamDetailData streamDetailData) {
        this.streamDetailData = streamDetailData;
        return this;
    }
    public DescribeLiveGrtnDurationResponseBodyStreamDetailData getStreamDetailData() {
        return this.streamDetailData;
    }

    public static class DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("MediaProfile")
        public String mediaProfile;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData self = new DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData setMediaProfile(String mediaProfile) {
            this.mediaProfile = mediaProfile;
            return this;
        }
        public String getMediaProfile() {
            return this.mediaProfile;
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeLiveGrtnDurationResponseBodyStreamDetailData extends TeaModel {
        @NameInMap("StreamData")
        public java.util.List<DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData> streamData;

        public static DescribeLiveGrtnDurationResponseBodyStreamDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveGrtnDurationResponseBodyStreamDetailData self = new DescribeLiveGrtnDurationResponseBodyStreamDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeLiveGrtnDurationResponseBodyStreamDetailData setStreamData(java.util.List<DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData> streamData) {
            this.streamData = streamData;
            return this;
        }
        public java.util.List<DescribeLiveGrtnDurationResponseBodyStreamDetailDataStreamData> getStreamData() {
            return this.streamData;
        }

    }

}
