// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListSubResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSubResponseBodyResult result;

    public static ListSubResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubResponseBody self = new ListSubResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubResponseBody setResult(ListSubResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSubResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSubResponseBodyResultDataListScheduleInfo extends TeaModel {
        @NameInMap("DaysOfWeek")
        public java.util.List<Integer> daysOfWeek;

        @NameInMap("Hour")
        public Integer hour;

        @NameInMap("Minute")
        public Integer minute;

        public static ListSubResponseBodyResultDataListScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSubResponseBodyResultDataListScheduleInfo self = new ListSubResponseBodyResultDataListScheduleInfo();
            return TeaModel.build(map, self);
        }

        public ListSubResponseBodyResultDataListScheduleInfo setDaysOfWeek(java.util.List<Integer> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public java.util.List<Integer> getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public ListSubResponseBodyResultDataListScheduleInfo setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public ListSubResponseBodyResultDataListScheduleInfo setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

    }

    public static class ListSubResponseBodyResultDataList extends TeaModel {
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("DailyStudyCnt")
        public Integer dailyStudyCnt;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PlayMode")
        public String playMode;

        @NameInMap("ScheduleInfo")
        public ListSubResponseBodyResultDataListScheduleInfo scheduleInfo;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserId")
        public Long userId;

        public static ListSubResponseBodyResultDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSubResponseBodyResultDataList self = new ListSubResponseBodyResultDataList();
            return TeaModel.build(map, self);
        }

        public ListSubResponseBodyResultDataList setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public ListSubResponseBodyResultDataList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListSubResponseBodyResultDataList setDailyStudyCnt(Integer dailyStudyCnt) {
            this.dailyStudyCnt = dailyStudyCnt;
            return this;
        }
        public Integer getDailyStudyCnt() {
            return this.dailyStudyCnt;
        }

        public ListSubResponseBodyResultDataList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListSubResponseBodyResultDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSubResponseBodyResultDataList setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public ListSubResponseBodyResultDataList setScheduleInfo(ListSubResponseBodyResultDataListScheduleInfo scheduleInfo) {
            this.scheduleInfo = scheduleInfo;
            return this;
        }
        public ListSubResponseBodyResultDataListScheduleInfo getScheduleInfo() {
            return this.scheduleInfo;
        }

        public ListSubResponseBodyResultDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSubResponseBodyResultDataList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class ListSubResponseBodyResult extends TeaModel {
        @NameInMap("DataList")
        public java.util.List<ListSubResponseBodyResultDataList> dataList;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPageCount")
        public Integer totalPageCount;

        public static ListSubResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSubResponseBodyResult self = new ListSubResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSubResponseBodyResult setDataList(java.util.List<ListSubResponseBodyResultDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ListSubResponseBodyResultDataList> getDataList() {
            return this.dataList;
        }

        public ListSubResponseBodyResult setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListSubResponseBodyResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListSubResponseBodyResult setTotalPageCount(Integer totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public Integer getTotalPageCount() {
            return this.totalPageCount;
        }

    }

}
