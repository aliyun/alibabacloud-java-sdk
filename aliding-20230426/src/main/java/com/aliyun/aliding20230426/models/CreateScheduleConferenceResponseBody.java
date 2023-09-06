// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceResponseBody extends TeaModel {
    @NameInMap("phones")
    public java.util.List<String> phones;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("roomCode")
    public String roomCode;

    @NameInMap("scheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("url")
    public String url;

    public static CreateScheduleConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleConferenceResponseBody self = new CreateScheduleConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleConferenceResponseBody setPhones(java.util.List<String> phones) {
        this.phones = phones;
        return this;
    }
    public java.util.List<String> getPhones() {
        return this.phones;
    }

    public CreateScheduleConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleConferenceResponseBody setRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }
    public String getRoomCode() {
        return this.roomCode;
    }

    public CreateScheduleConferenceResponseBody setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public CreateScheduleConferenceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
