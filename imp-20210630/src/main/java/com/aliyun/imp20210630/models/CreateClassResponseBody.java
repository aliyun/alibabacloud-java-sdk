// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateClassResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateClassResponseBodyResult result;

    public static CreateClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClassResponseBody self = new CreateClassResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClassResponseBody setResult(CreateClassResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateClassResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateClassResponseBodyResult extends TeaModel {
        @NameInMap("ClassId")
        public String classId;

        @NameInMap("ConfId")
        public String confId;

        @NameInMap("CreateNickname")
        public String createNickname;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("LiveId")
        public String liveId;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        @NameInMap("WhiteboardId")
        public String whiteboardId;

        @NameInMap("WhiteboardRecordId")
        public String whiteboardRecordId;

        public static CreateClassResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateClassResponseBodyResult self = new CreateClassResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateClassResponseBodyResult setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

        public CreateClassResponseBodyResult setConfId(String confId) {
            this.confId = confId;
            return this;
        }
        public String getConfId() {
            return this.confId;
        }

        public CreateClassResponseBodyResult setCreateNickname(String createNickname) {
            this.createNickname = createNickname;
            return this;
        }
        public String getCreateNickname() {
            return this.createNickname;
        }

        public CreateClassResponseBodyResult setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public CreateClassResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public CreateClassResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public CreateClassResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateClassResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateClassResponseBodyResult setWhiteboardId(String whiteboardId) {
            this.whiteboardId = whiteboardId;
            return this;
        }
        public String getWhiteboardId() {
            return this.whiteboardId;
        }

        public CreateClassResponseBodyResult setWhiteboardRecordId(String whiteboardRecordId) {
            this.whiteboardRecordId = whiteboardRecordId;
            return this;
        }
        public String getWhiteboardRecordId() {
            return this.whiteboardRecordId;
        }

    }

}
