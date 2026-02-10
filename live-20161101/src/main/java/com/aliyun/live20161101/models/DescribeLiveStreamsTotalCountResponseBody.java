// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsTotalCountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>String	FCFFE4A4-F34F-4EEF-B401-36A01689AFBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamCountList")
    public DescribeLiveStreamsTotalCountResponseBodyStreamCountList streamCountList;

    public static DescribeLiveStreamsTotalCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsTotalCountResponseBody self = new DescribeLiveStreamsTotalCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsTotalCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamsTotalCountResponseBody setStreamCountList(DescribeLiveStreamsTotalCountResponseBodyStreamCountList streamCountList) {
        this.streamCountList = streamCountList;
        return this;
    }
    public DescribeLiveStreamsTotalCountResponseBodyStreamCountList getStreamCountList() {
        return this.streamCountList;
    }

    public static class DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos self = new DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeLiveStreamsTotalCountResponseBodyStreamCountList extends TeaModel {
        @NameInMap("StreamCountInfos")
        public java.util.List<DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos> streamCountInfos;

        public static DescribeLiveStreamsTotalCountResponseBodyStreamCountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamsTotalCountResponseBodyStreamCountList self = new DescribeLiveStreamsTotalCountResponseBodyStreamCountList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamsTotalCountResponseBodyStreamCountList setStreamCountInfos(java.util.List<DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos> streamCountInfos) {
            this.streamCountInfos = streamCountInfos;
            return this;
        }
        public java.util.List<DescribeLiveStreamsTotalCountResponseBodyStreamCountListStreamCountInfos> getStreamCountInfos() {
            return this.streamCountInfos;
        }

    }

}
