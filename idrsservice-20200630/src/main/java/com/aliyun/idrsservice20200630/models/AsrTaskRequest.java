// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrTaskRequest extends TeaModel {
    @NameInMap("Request")
    public AsrTaskRequestRequest request;

    public static AsrTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AsrTaskRequest self = new AsrTaskRequest();
        return TeaModel.build(map, self);
    }

    public AsrTaskRequest setRequest(AsrTaskRequestRequest request) {
        this.request = request;
        return this;
    }
    public AsrTaskRequestRequest getRequest() {
        return this.request;
    }

    public static class AsrTaskRequestRequest extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AsrTaskId")
        public String asrTaskId;

        @NameInMap("Event")
        public String event;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static AsrTaskRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            AsrTaskRequestRequest self = new AsrTaskRequestRequest();
            return TeaModel.build(map, self);
        }

        public AsrTaskRequestRequest setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AsrTaskRequestRequest setAsrTaskId(String asrTaskId) {
            this.asrTaskId = asrTaskId;
            return this;
        }
        public String getAsrTaskId() {
            return this.asrTaskId;
        }

        public AsrTaskRequestRequest setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public AsrTaskRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public AsrTaskRequestRequest setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
