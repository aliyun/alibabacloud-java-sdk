// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1687928400000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>[ &quot;+86123xxxx&quot; ]</p>
     */
    @NameInMap("phones")
    public java.util.List<String> phones;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>838 722 xxxxx</p>
     */
    @NameInMap("roomCode")
    public String roomCode;

    /**
     * <strong>example:</strong>
     * <p>2a489c68-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("scheduleConferenceId")
    public String scheduleConferenceId;

    /**
     * <strong>example:</strong>
     * <p>1687924800000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>预约会议标题</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p><a href="https://meeting.dingtalk.com/j/Bsbp3ixxxxxUyJJ9">https://meeting.dingtalk.com/j/Bsbp3ixxxxxUyJJ9</a></p>
     */
    @NameInMap("url")
    public String url;

    public static QueryScheduleConferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceResponseBody self = new QueryScheduleConferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryScheduleConferenceResponseBody setPhones(java.util.List<String> phones) {
        this.phones = phones;
        return this;
    }
    public java.util.List<String> getPhones() {
        return this.phones;
    }

    public QueryScheduleConferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScheduleConferenceResponseBody setRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }
    public String getRoomCode() {
        return this.roomCode;
    }

    public QueryScheduleConferenceResponseBody setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public QueryScheduleConferenceResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryScheduleConferenceResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryScheduleConferenceResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
