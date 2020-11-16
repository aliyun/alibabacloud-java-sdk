// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StreamCountInfos")
    @Validation(required = true)
    public DescribeLiveStreamCountResponseStreamCountInfos streamCountInfos;

    public static DescribeLiveStreamCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamCountResponse self = new DescribeLiveStreamCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamCountResponse setStreamCountInfos(DescribeLiveStreamCountResponseStreamCountInfos streamCountInfos) {
        this.streamCountInfos = streamCountInfos;
        return this;
    }
    public DescribeLiveStreamCountResponseStreamCountInfos getStreamCountInfos() {
        return this.streamCountInfos;
    }

    public static class DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail extends TeaModel {
        @NameInMap("Format")
        @Validation(required = true)
        public String format;

        @NameInMap("VideoDataRate")
        @Validation(required = true)
        public Long videoDataRate;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        public static DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail self = new DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setVideoDataRate(Long videoDataRate) {
            this.videoDataRate = videoDataRate;
            return this;
        }
        public Long getVideoDataRate() {
            return this.videoDataRate;
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails extends TeaModel {
        @NameInMap("StreamCountDetail")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> streamCountDetail;

        public static DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails self = new DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails setStreamCountDetail(java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> streamCountDetail) {
            this.streamCountDetail = streamCountDetail;
            return this;
        }
        public java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail> getStreamCountDetail() {
            return this.streamCountDetail;
        }

    }

    public static class DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("StreamCountDetails")
        @Validation(required = true)
        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails;

        public static DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo self = new DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo setStreamCountDetails(DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails) {
            this.streamCountDetails = streamCountDetails;
            return this;
        }
        public DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfoStreamCountDetails getStreamCountDetails() {
            return this.streamCountDetails;
        }

    }

    public static class DescribeLiveStreamCountResponseStreamCountInfos extends TeaModel {
        @NameInMap("StreamCountInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo> streamCountInfo;

        public static DescribeLiveStreamCountResponseStreamCountInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseStreamCountInfos self = new DescribeLiveStreamCountResponseStreamCountInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseStreamCountInfos setStreamCountInfo(java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo> streamCountInfo) {
            this.streamCountInfo = streamCountInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamCountResponseStreamCountInfosStreamCountInfo> getStreamCountInfo() {
            return this.streamCountInfo;
        }

    }

}
