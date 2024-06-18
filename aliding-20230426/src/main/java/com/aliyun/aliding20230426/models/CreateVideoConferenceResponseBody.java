// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateVideoConferenceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <strong>example:</strong>
     * <p>1151302294</p>
     */
    @NameInMap("conferencePassword")
    public String conferencePassword;

    /**
     * <strong>example:</strong>
     * <p><a href="https://pre-meeting.dingtalk.com/app?roomCode=68550708396&token=1_59209c43-431c-4e57-a0f8-11bebdb3db7f">https://pre-meeting.dingtalk.com/app?roomCode=68550708396&amp;token=1_59209c43-431c-4e57-a0f8-11bebdb3db7f</a></p>
     */
    @NameInMap("externalLinkUrl")
    public String externalLinkUrl;

    /**
     * <strong>example:</strong>
     * <p>2142817614</p>
     */
    @NameInMap("hostPassword")
    public String hostPassword;

    @NameInMap("phoneNumbers")
    public java.util.List<String> phoneNumbers;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>3032809F-8C14-57E2-9B76-7AC2134FE3C8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("roomCode")
    public String roomCode;

    public static CreateVideoConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoConferenceResponseBody self = new CreateVideoConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVideoConferenceResponseBody setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public CreateVideoConferenceResponseBody setConferencePassword(String conferencePassword) {
        this.conferencePassword = conferencePassword;
        return this;
    }
    public String getConferencePassword() {
        return this.conferencePassword;
    }

    public CreateVideoConferenceResponseBody setExternalLinkUrl(String externalLinkUrl) {
        this.externalLinkUrl = externalLinkUrl;
        return this;
    }
    public String getExternalLinkUrl() {
        return this.externalLinkUrl;
    }

    public CreateVideoConferenceResponseBody setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
        return this;
    }
    public String getHostPassword() {
        return this.hostPassword;
    }

    public CreateVideoConferenceResponseBody setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CreateVideoConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVideoConferenceResponseBody setRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }
    public String getRoomCode() {
        return this.roomCode;
    }

}
