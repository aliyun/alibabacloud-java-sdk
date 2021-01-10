// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterChannelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Channels")
    public DescribeCasterChannelsResponseBodyChannels channels;

    public static DescribeCasterChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterChannelsResponseBody self = new DescribeCasterChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterChannelsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterChannelsResponseBody setChannels(DescribeCasterChannelsResponseBodyChannels channels) {
        this.channels = channels;
        return this;
    }
    public DescribeCasterChannelsResponseBodyChannels getChannels() {
        return this.channels;
    }

    public static class DescribeCasterChannelsResponseBodyChannelsChannel extends TeaModel {
        @NameInMap("RtmpUrl")
        public String rtmpUrl;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("StreamUrl")
        public String streamUrl;

        public static DescribeCasterChannelsResponseBodyChannelsChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterChannelsResponseBodyChannelsChannel self = new DescribeCasterChannelsResponseBodyChannelsChannel();
            return TeaModel.build(map, self);
        }

        public DescribeCasterChannelsResponseBodyChannelsChannel setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

        public DescribeCasterChannelsResponseBodyChannelsChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCasterChannelsResponseBodyChannelsChannel setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterChannelsResponseBodyChannelsChannel setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

    }

    public static class DescribeCasterChannelsResponseBodyChannels extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<DescribeCasterChannelsResponseBodyChannelsChannel> channel;

        public static DescribeCasterChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterChannelsResponseBodyChannels self = new DescribeCasterChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public DescribeCasterChannelsResponseBodyChannels setChannel(java.util.List<DescribeCasterChannelsResponseBodyChannelsChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<DescribeCasterChannelsResponseBodyChannelsChannel> getChannel() {
            return this.channel;
        }

    }

}
