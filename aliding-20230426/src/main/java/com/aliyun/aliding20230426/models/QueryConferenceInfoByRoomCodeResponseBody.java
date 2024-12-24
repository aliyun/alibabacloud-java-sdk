// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoByRoomCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("conferenceList")
    public java.util.List<QueryConferenceInfoByRoomCodeResponseBodyConferenceList> conferenceList;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("dingtalkRequestId")
    public String dingtalkRequestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>1296</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

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

    public static QueryConferenceInfoByRoomCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoByRoomCodeResponseBody self = new QueryConferenceInfoByRoomCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoByRoomCodeResponseBody setConferenceList(java.util.List<QueryConferenceInfoByRoomCodeResponseBodyConferenceList> conferenceList) {
        this.conferenceList = conferenceList;
        return this;
    }
    public java.util.List<QueryConferenceInfoByRoomCodeResponseBodyConferenceList> getConferenceList() {
        return this.conferenceList;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setDingtalkRequestId(String dingtalkRequestId) {
        this.dingtalkRequestId = dingtalkRequestId;
        return this;
    }
    public String getDingtalkRequestId() {
        return this.dingtalkRequestId;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryConferenceInfoByRoomCodeResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryConferenceInfoByRoomCodeResponseBodyConferenceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ConfDuration")
        public Long confDuration;

        /**
         * <strong>example:</strong>
         * <p>636cf59f2b032f014ae32902</p>
         */
        @NameInMap("ConferenceId")
        public String conferenceId;

        /**
         * <strong>example:</strong>
         * <p>527079</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorNick")
        public String creatorNick;

        /**
         * <strong>example:</strong>
         * <p>1668087732000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>https//:xxx</p>
         */
        @NameInMap("ExternalLinkUrl")
        public String externalLinkUrl;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("RoomCode")
        public String roomCode;

        /**
         * <strong>example:</strong>
         * <p>2d79cbde-b9d8-4256-9788-78b05834944e</p>
         */
        @NameInMap("ScheduleConferenceId")
        public String scheduleConferenceId;

        /**
         * <strong>example:</strong>
         * <p>1668087731000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        public static QueryConferenceInfoByRoomCodeResponseBodyConferenceList build(java.util.Map<String, ?> map) throws Exception {
            QueryConferenceInfoByRoomCodeResponseBodyConferenceList self = new QueryConferenceInfoByRoomCodeResponseBodyConferenceList();
            return TeaModel.build(map, self);
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setConfDuration(Long confDuration) {
            this.confDuration = confDuration;
            return this;
        }
        public Long getConfDuration() {
            return this.confDuration;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setCreatorNick(String creatorNick) {
            this.creatorNick = creatorNick;
            return this;
        }
        public String getCreatorNick() {
            return this.creatorNick;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setExternalLinkUrl(String externalLinkUrl) {
            this.externalLinkUrl = externalLinkUrl;
            return this;
        }
        public String getExternalLinkUrl() {
            return this.externalLinkUrl;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setRoomCode(String roomCode) {
            this.roomCode = roomCode;
            return this;
        }
        public String getRoomCode() {
            return this.roomCode;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setScheduleConferenceId(String scheduleConferenceId) {
            this.scheduleConferenceId = scheduleConferenceId;
            return this;
        }
        public String getScheduleConferenceId() {
            return this.scheduleConferenceId;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryConferenceInfoByRoomCodeResponseBodyConferenceList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
