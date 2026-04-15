// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>+861234567</p>
     */
    @NameInMap("phones")
    public java.util.List<String> phones;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>83150xxxxxx</p>
     */
    @NameInMap("roomCode")
    public String roomCode;

    /**
     * <strong>example:</strong>
     * <p>5c7c9bb1-b256-4dc5-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("scheduleConferenceId")
    public String scheduleConferenceId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://meeting.dingtalk.com/j/knvMq1ixxxx">https://meeting.dingtalk.com/j/knvMq1ixxxx</a></p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

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

    public CreateScheduleConferenceResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public CreateScheduleConferenceResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
