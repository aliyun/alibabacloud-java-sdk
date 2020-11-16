// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterChannelsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Channels")
    @Validation(required = true)
    public DescribeCasterChannelsResponseChannels channels;

    public static DescribeCasterChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterChannelsResponse self = new DescribeCasterChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterChannelsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterChannelsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterChannelsResponse setChannels(DescribeCasterChannelsResponseChannels channels) {
        this.channels = channels;
        return this;
    }
    public DescribeCasterChannelsResponseChannels getChannels() {
        return this.channels;
    }

    public static class DescribeCasterChannelsResponseChannelsChannel extends TeaModel {
        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("StreamUrl")
        @Validation(required = true)
        public String streamUrl;

        @NameInMap("RtmpUrl")
        @Validation(required = true)
        public String rtmpUrl;

        public static DescribeCasterChannelsResponseChannelsChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterChannelsResponseChannelsChannel self = new DescribeCasterChannelsResponseChannelsChannel();
            return TeaModel.build(map, self);
        }

        public DescribeCasterChannelsResponseChannelsChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCasterChannelsResponseChannelsChannel setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterChannelsResponseChannelsChannel setStreamUrl(String streamUrl) {
            this.streamUrl = streamUrl;
            return this;
        }
        public String getStreamUrl() {
            return this.streamUrl;
        }

        public DescribeCasterChannelsResponseChannelsChannel setRtmpUrl(String rtmpUrl) {
            this.rtmpUrl = rtmpUrl;
            return this;
        }
        public String getRtmpUrl() {
            return this.rtmpUrl;
        }

    }

    public static class DescribeCasterChannelsResponseChannels extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public java.util.List<DescribeCasterChannelsResponseChannelsChannel> channel;

        public static DescribeCasterChannelsResponseChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterChannelsResponseChannels self = new DescribeCasterChannelsResponseChannels();
            return TeaModel.build(map, self);
        }

        public DescribeCasterChannelsResponseChannels setChannel(java.util.List<DescribeCasterChannelsResponseChannelsChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<DescribeCasterChannelsResponseChannelsChannel> getChannel() {
            return this.channel;
        }

    }

}
