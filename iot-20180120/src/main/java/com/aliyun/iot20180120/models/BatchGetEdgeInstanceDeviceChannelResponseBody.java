// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceChannelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceChannelList")
    public java.util.List<BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList> deviceChannelList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeInstanceDeviceChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceChannelResponseBody self = new BatchGetEdgeInstanceDeviceChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceChannelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceChannelResponseBody setDeviceChannelList(java.util.List<BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList> deviceChannelList) {
        this.deviceChannelList = deviceChannelList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList> getDeviceChannelList() {
        return this.deviceChannelList;
    }

    public BatchGetEdgeInstanceDeviceChannelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("IotId")
        public String iotId;

        public static BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList self = new BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public BatchGetEdgeInstanceDeviceChannelResponseBodyDeviceChannelList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
