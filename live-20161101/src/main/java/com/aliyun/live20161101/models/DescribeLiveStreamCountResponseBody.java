// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamCountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCFFE4A4-F34F-4EEF-B401-36A01689AFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of the live streams.</p>
     */
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
        /**
         * <p>The number of online streams.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The video codec. Valid values:</p>
         * <ul>
         * <li><strong>h264</strong></li>
         * <li><strong>h265</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The video bitrate. This parameter is returned only for transcoded streams.</p>
         * 
         * <strong>example:</strong>
         * <p>390</p>
         */
        @NameInMap("VideoDataRate")
        public Long videoDataRate;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail self = new DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetailsStreamCountDetail setVideoDataRate(Long videoDataRate) {
            this.videoDataRate = videoDataRate;
            return this;
        }
        public Long getVideoDataRate() {
            return this.videoDataRate;
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
        /**
         * <p>The number of online streams.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The maximum allowed number of concurrently ingested streams. This parameter is available only to users in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>The information about the live streams.</p>
         */
        @NameInMap("StreamCountDetails")
        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails;

        /**
         * <p>The type of the live stream. Valid values:</p>
         * <ul>
         * <li><strong>raw</strong>: source streams</li>
         * <li><strong>trans</strong>: transcoded streams</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>raw</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo self = new DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setStreamCountDetails(DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails streamCountDetails) {
            this.streamCountDetails = streamCountDetails;
            return this;
        }
        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfoStreamCountDetails getStreamCountDetails() {
            return this.streamCountDetails;
        }

        public DescribeLiveStreamCountResponseBodyStreamCountInfosStreamCountInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
