// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class TtsTaskRequest extends TeaModel {
    @NameInMap("Request")
    public TtsTaskRequestRequest request;

    public static TtsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TtsTaskRequest self = new TtsTaskRequest();
        return TeaModel.build(map, self);
    }

    public TtsTaskRequest setRequest(TtsTaskRequestRequest request) {
        this.request = request;
        return this;
    }
    public TtsTaskRequestRequest getRequest() {
        return this.request;
    }

    public static class TtsTaskRequestRequest extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static TtsTaskRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            TtsTaskRequestRequest self = new TtsTaskRequestRequest();
            return TeaModel.build(map, self);
        }

        public TtsTaskRequestRequest setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TtsTaskRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public TtsTaskRequestRequest setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
