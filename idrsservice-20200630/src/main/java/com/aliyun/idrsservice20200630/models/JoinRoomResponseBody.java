// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class JoinRoomResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public JoinRoomResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static JoinRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinRoomResponseBody self = new JoinRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinRoomResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public JoinRoomResponseBody setData(JoinRoomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public JoinRoomResponseBodyData getData() {
        return this.data;
    }

    public JoinRoomResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public JoinRoomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public JoinRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinRoomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class JoinRoomResponseBodyData extends TeaModel {
        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("StreamId")
        public String streamId;

        public static JoinRoomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            JoinRoomResponseBodyData self = new JoinRoomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public JoinRoomResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public JoinRoomResponseBodyData setStreamId(String streamId) {
            this.streamId = streamId;
            return this;
        }
        public String getStreamId() {
            return this.streamId;
        }

    }

}
