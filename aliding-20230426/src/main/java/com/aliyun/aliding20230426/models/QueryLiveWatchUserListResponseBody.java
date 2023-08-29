// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchUserListResponseBody extends TeaModel {
    @NameInMap("orgUsesList")
    public java.util.List<QueryLiveWatchUserListResponseBodyOrgUsesList> orgUsesList;

    @NameInMap("outOrgUserList")
    public java.util.List<QueryLiveWatchUserListResponseBodyOutOrgUserList> outOrgUserList;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryLiveWatchUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchUserListResponseBody self = new QueryLiveWatchUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchUserListResponseBody setOrgUsesList(java.util.List<QueryLiveWatchUserListResponseBodyOrgUsesList> orgUsesList) {
        this.orgUsesList = orgUsesList;
        return this;
    }
    public java.util.List<QueryLiveWatchUserListResponseBodyOrgUsesList> getOrgUsesList() {
        return this.orgUsesList;
    }

    public QueryLiveWatchUserListResponseBody setOutOrgUserList(java.util.List<QueryLiveWatchUserListResponseBodyOutOrgUserList> outOrgUserList) {
        this.outOrgUserList = outOrgUserList;
        return this;
    }
    public java.util.List<QueryLiveWatchUserListResponseBodyOutOrgUserList> getOutOrgUserList() {
        return this.outOrgUserList;
    }

    public QueryLiveWatchUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryLiveWatchUserListResponseBodyOrgUsesList extends TeaModel {
        @NameInMap("DeptName")
        public String deptName;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WatchLiveTime")
        public Long watchLiveTime;

        @NameInMap("WatchPlaybackTime")
        public Long watchPlaybackTime;

        @NameInMap("WatchProgressMs")
        public Long watchProgressMs;

        public static QueryLiveWatchUserListResponseBodyOrgUsesList build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchUserListResponseBodyOrgUsesList self = new QueryLiveWatchUserListResponseBodyOrgUsesList();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setWatchLiveTime(Long watchLiveTime) {
            this.watchLiveTime = watchLiveTime;
            return this;
        }
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setWatchPlaybackTime(Long watchPlaybackTime) {
            this.watchPlaybackTime = watchPlaybackTime;
            return this;
        }
        public Long getWatchPlaybackTime() {
            return this.watchPlaybackTime;
        }

        public QueryLiveWatchUserListResponseBodyOrgUsesList setWatchProgressMs(Long watchProgressMs) {
            this.watchProgressMs = watchProgressMs;
            return this;
        }
        public Long getWatchProgressMs() {
            return this.watchProgressMs;
        }

    }

    public static class QueryLiveWatchUserListResponseBodyOutOrgUserList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("WatchLiveTime")
        public Long watchLiveTime;

        @NameInMap("WatchPlaybackTime")
        public Long watchPlaybackTime;

        @NameInMap("WatchProgressMs")
        public Long watchProgressMs;

        public static QueryLiveWatchUserListResponseBodyOutOrgUserList build(java.util.Map<String, ?> map) throws Exception {
            QueryLiveWatchUserListResponseBodyOutOrgUserList self = new QueryLiveWatchUserListResponseBodyOutOrgUserList();
            return TeaModel.build(map, self);
        }

        public QueryLiveWatchUserListResponseBodyOutOrgUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLiveWatchUserListResponseBodyOutOrgUserList setWatchLiveTime(Long watchLiveTime) {
            this.watchLiveTime = watchLiveTime;
            return this;
        }
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

        public QueryLiveWatchUserListResponseBodyOutOrgUserList setWatchPlaybackTime(Long watchPlaybackTime) {
            this.watchPlaybackTime = watchPlaybackTime;
            return this;
        }
        public Long getWatchPlaybackTime() {
            return this.watchPlaybackTime;
        }

        public QueryLiveWatchUserListResponseBodyOutOrgUserList setWatchProgressMs(Long watchProgressMs) {
            this.watchProgressMs = watchProgressMs;
            return this;
        }
        public Long getWatchProgressMs() {
            return this.watchProgressMs;
        }

    }

}
