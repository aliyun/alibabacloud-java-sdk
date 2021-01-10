// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamCountInfos")
    public DescribeLiveStreamCountResponseBodyStreamCountInfos streamCountInfos;

    public static DescribeLiveStreamCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamCountResponseBody self = new DescribeLiveStreamCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamCountResponseBody setStreamCountInfos(DescribeLiveStreamCountResponseBodyStreamCountInfos streamCountInfos) {
        this.streamCountInfos = streamCountInfos;
        return this;
    }
    public DescribeLiveStreamCountResponseBodyStreamCountInfos getStreamCountInfos() {
        return this.streamCountInfos;
    }

    public static class DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail extends TeaModel {
        @NameInMap("VideoDataRate")
        public Long videoDataRate;

        @NameInMap("Format")
        public String format;

        @NameInMap("Count")
        public Long count;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail self = new DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setVideoDataRate(Long videoDataRate) {
            this.videoDataRate = videoDataRate;
            return this;
        }
        public Long getVideoDataRate() {
            return this.videoDataRate;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails extends TeaModel {
        @NameInMap("StreamCountDetail")
        public java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> streamCountDetail;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails self = new DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails setStreamCountDetail(java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> streamCountDetail) {
            this.streamCountDetail = streamCountDetail;
            return this;
        }
        public java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> getStreamCountDetail() {
            return this.streamCountDetail;
        }

    }

    public static class DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("StreamCountDetails")
        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails;

        @NameInMap("Limit")
        public Long limit;

        @NameInMap("Count")
        public Long count;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo self = new DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setStreamCountDetails(DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails) {
            this.streamCountDetails = streamCountDetails;
            return this;
        }
        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails getStreamCountDetails() {
            return this.streamCountDetails;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveStreamCountResponseBodyStreamCountInfos extends TeaModel {
        @NameInMap("StreamCountInfo")
        public java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo> streamCountInfo;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfos self = new DescribeLiveStreamCountResponseBodyStreamCountInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfos setStreamCountInfo(java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo> streamCountInfo) {
            this.streamCountInfo = streamCountInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo> getStreamCountInfo() {
            return this.streamCountInfo;
        }

    }

}
