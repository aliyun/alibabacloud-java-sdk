// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("DeviceChannelList")
    @Validation(required = true)
    public java.util.List<BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList> deviceChannelList;

    public static BatchGetEdgeInstanceDeviceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceChannelResponse self = new BatchGetEdgeInstanceDeviceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setDeviceChannelList(java.util.List<BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList> deviceChannelList) {
        this.deviceChannelList = deviceChannelList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList> getDeviceChannelList() {
        return this.deviceChannelList;
    }

    public static class BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList extends TeaModel {
        @NameInMap("ChannelId")
        @Validation(required = true)
        public String channelId;

        @NameInMap("ChannelName")
        @Validation(required = true)
        public String channelName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList self = new BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public BatchGetEdgeInstanceDeviceChannelResponseDeviceChannelList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
