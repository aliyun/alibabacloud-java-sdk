// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetLiveRoomUserStatisticsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 创建场景化直播返回的结果。
    @NameInMap("Result")
    public GetLiveRoomUserStatisticsResponseBodyResult result;

    public static GetLiveRoomUserStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRoomUserStatisticsResponseBody self = new GetLiveRoomUserStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRoomUserStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveRoomUserStatisticsResponseBody setResult(GetLiveRoomUserStatisticsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLiveRoomUserStatisticsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList extends TeaModel {
        @NameInMap("CommentCount")
        public Integer commentCount;

        @NameInMap("LikeCount")
        public Integer likeCount;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 观看时长，单位：毫秒。
        @NameInMap("WatchLiveTime")
        public Long watchLiveTime;

        public static GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList self = new GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
            return this;
        }
        public Integer getCommentCount() {
            return this.commentCount;
        }

        public GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
            return this;
        }
        public Integer getLikeCount() {
            return this.likeCount;
        }

        public GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList setWatchLiveTime(Long watchLiveTime) {
            this.watchLiveTime = watchLiveTime;
            return this;
        }
        public Long getWatchLiveTime() {
            return this.watchLiveTime;
        }

    }

    public static class GetLiveRoomUserStatisticsResponseBodyResult extends TeaModel {
        // 是否还有下一页。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 直播ID。
        @NameInMap("LiveId")
        public String liveId;

        // 用户总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 用户总数
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 用户观看数据列表。
        @NameInMap("UserStatisticsList")
        public java.util.List<GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList> userStatisticsList;

        public static GetLiveRoomUserStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRoomUserStatisticsResponseBodyResult self = new GetLiveRoomUserStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLiveRoomUserStatisticsResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetLiveRoomUserStatisticsResponseBodyResult setLiveId(String liveId) {
            this.liveId = liveId;
            return this;
        }
        public String getLiveId() {
            return this.liveId;
        }

        public GetLiveRoomUserStatisticsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public GetLiveRoomUserStatisticsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetLiveRoomUserStatisticsResponseBodyResult setUserStatisticsList(java.util.List<GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList> userStatisticsList) {
            this.userStatisticsList = userStatisticsList;
            return this;
        }
        public java.util.List<GetLiveRoomUserStatisticsResponseBodyResultUserStatisticsList> getUserStatisticsList() {
            return this.userStatisticsList;
        }

    }

}
