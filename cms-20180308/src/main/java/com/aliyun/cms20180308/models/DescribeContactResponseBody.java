// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeContactResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Datapoints")
    public DescribeContactResponseBodyDatapoints datapoints;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactResponseBody self = new DescribeContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeContactResponseBody setDatapoints(DescribeContactResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public DescribeContactResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public DescribeContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeContactResponseBodyDatapointsChannelsChannel extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeContactResponseBodyDatapointsChannelsChannel build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactResponseBodyDatapointsChannelsChannel self = new DescribeContactResponseBodyDatapointsChannelsChannel();
            return TeaModel.build(map, self);
        }

        public DescribeContactResponseBodyDatapointsChannelsChannel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeContactResponseBodyDatapointsChannelsChannel setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeContactResponseBodyDatapointsChannels extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<DescribeContactResponseBodyDatapointsChannelsChannel> channel;

        public static DescribeContactResponseBodyDatapointsChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactResponseBodyDatapointsChannels self = new DescribeContactResponseBodyDatapointsChannels();
            return TeaModel.build(map, self);
        }

        public DescribeContactResponseBodyDatapointsChannels setChannel(java.util.List<DescribeContactResponseBodyDatapointsChannelsChannel> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<DescribeContactResponseBodyDatapointsChannelsChannel> getChannel() {
            return this.channel;
        }

    }

    public static class DescribeContactResponseBodyDatapoints extends TeaModel {
        @NameInMap("Channels")
        public DescribeContactResponseBodyDatapointsChannels channels;

        @NameInMap("Name")
        public String name;

        public static DescribeContactResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactResponseBodyDatapoints self = new DescribeContactResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public DescribeContactResponseBodyDatapoints setChannels(DescribeContactResponseBodyDatapointsChannels channels) {
            this.channels = channels;
            return this;
        }
        public DescribeContactResponseBodyDatapointsChannels getChannels() {
            return this.channels;
        }

        public DescribeContactResponseBodyDatapoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
