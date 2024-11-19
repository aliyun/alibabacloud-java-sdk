// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgLiveListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetOrgLiveListResponseBodyResult result;

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

    public static GetOrgLiveListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrgLiveListResponseBody self = new GetOrgLiveListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrgLiveListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrgLiveListResponseBody setResult(GetOrgLiveListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetOrgLiveListResponseBodyResult getResult() {
        return this.result;
    }

    public GetOrgLiveListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetOrgLiveListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetOrgLiveListResponseBodyResultNewLiveLiveList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nickName</p>
         */
        @NameInMap("AnchorNickname")
        public String anchorNickname;

        /**
         * <strong>example:</strong>
         * <p>ersqqdddf</p>
         */
        @NameInMap("AnchorUserId")
        public String anchorUserId;

        /**
         * <strong>example:</strong>
         * <p>1398324600000</p>
         */
        @NameInMap("LiveEndTime")
        public Long liveEndTime;

        /**
         * <strong>example:</strong>
         * <p>1398321600000</p>
         */
        @NameInMap("LiveStartTime")
        public Long liveStartTime;

        /**
         * <strong>example:</strong>
         * <p>4d38xxxxx</p>
         */
        @NameInMap("LiveUuid")
        public String liveUuid;

        /**
         * <strong>example:</strong>
         * <p>群OpenConversationId</p>
         */
        @NameInMap("ShareOpenConversationIds")
        public java.util.List<String> shareOpenConversationIds;

        /**
         * <strong>example:</strong>
         * <p>直播标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetOrgLiveListResponseBodyResultNewLiveLiveList build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListResponseBodyResultNewLiveLiveList self = new GetOrgLiveListResponseBodyResultNewLiveLiveList();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setAnchorNickname(String anchorNickname) {
            this.anchorNickname = anchorNickname;
            return this;
        }
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setAnchorUserId(String anchorUserId) {
            this.anchorUserId = anchorUserId;
            return this;
        }
        public String getAnchorUserId() {
            return this.anchorUserId;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setLiveEndTime(Long liveEndTime) {
            this.liveEndTime = liveEndTime;
            return this;
        }
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setLiveStartTime(Long liveStartTime) {
            this.liveStartTime = liveStartTime;
            return this;
        }
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setLiveUuid(String liveUuid) {
            this.liveUuid = liveUuid;
            return this;
        }
        public String getLiveUuid() {
            return this.liveUuid;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setShareOpenConversationIds(java.util.List<String> shareOpenConversationIds) {
            this.shareOpenConversationIds = shareOpenConversationIds;
            return this;
        }
        public java.util.List<String> getShareOpenConversationIds() {
            return this.shareOpenConversationIds;
        }

        public GetOrgLiveListResponseBodyResultNewLiveLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetOrgLiveListResponseBodyResultNewLive extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("LiveList")
        public java.util.List<GetOrgLiveListResponseBodyResultNewLiveLiveList> liveList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetOrgLiveListResponseBodyResultNewLive build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListResponseBodyResultNewLive self = new GetOrgLiveListResponseBodyResultNewLive();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListResponseBodyResultNewLive setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetOrgLiveListResponseBodyResultNewLive setLiveList(java.util.List<GetOrgLiveListResponseBodyResultNewLiveLiveList> liveList) {
            this.liveList = liveList;
            return this;
        }
        public java.util.List<GetOrgLiveListResponseBodyResultNewLiveLiveList> getLiveList() {
            return this.liveList;
        }

        public GetOrgLiveListResponseBodyResultNewLive setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetOrgLiveListResponseBodyResultNewLive setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetOrgLiveListResponseBodyResultNewLive setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetOrgLiveListResponseBodyResultUpdateLiveLiveList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nickName</p>
         */
        @NameInMap("AnchorNickname")
        public String anchorNickname;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("AnchorUserId")
        public String anchorUserId;

        /**
         * <strong>example:</strong>
         * <p>1398324600000</p>
         */
        @NameInMap("LiveEndTime")
        public Long liveEndTime;

        /**
         * <strong>example:</strong>
         * <p>1398321600000</p>
         */
        @NameInMap("LiveStartTime")
        public Long liveStartTime;

        /**
         * <strong>example:</strong>
         * <p>4d38xxxxx</p>
         */
        @NameInMap("LiveUuid")
        public String liveUuid;

        /**
         * <strong>example:</strong>
         * <p>直播标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetOrgLiveListResponseBodyResultUpdateLiveLiveList build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListResponseBodyResultUpdateLiveLiveList self = new GetOrgLiveListResponseBodyResultUpdateLiveLiveList();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setAnchorNickname(String anchorNickname) {
            this.anchorNickname = anchorNickname;
            return this;
        }
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setAnchorUserId(String anchorUserId) {
            this.anchorUserId = anchorUserId;
            return this;
        }
        public String getAnchorUserId() {
            return this.anchorUserId;
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setLiveEndTime(Long liveEndTime) {
            this.liveEndTime = liveEndTime;
            return this;
        }
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setLiveStartTime(Long liveStartTime) {
            this.liveStartTime = liveStartTime;
            return this;
        }
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setLiveUuid(String liveUuid) {
            this.liveUuid = liveUuid;
            return this;
        }
        public String getLiveUuid() {
            return this.liveUuid;
        }

        public GetOrgLiveListResponseBodyResultUpdateLiveLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetOrgLiveListResponseBodyResultUpdateLive extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("LiveList")
        public java.util.List<GetOrgLiveListResponseBodyResultUpdateLiveLiveList> liveList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetOrgLiveListResponseBodyResultUpdateLive build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListResponseBodyResultUpdateLive self = new GetOrgLiveListResponseBodyResultUpdateLive();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListResponseBodyResultUpdateLive setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public GetOrgLiveListResponseBodyResultUpdateLive setLiveList(java.util.List<GetOrgLiveListResponseBodyResultUpdateLiveLiveList> liveList) {
            this.liveList = liveList;
            return this;
        }
        public java.util.List<GetOrgLiveListResponseBodyResultUpdateLiveLiveList> getLiveList() {
            return this.liveList;
        }

        public GetOrgLiveListResponseBodyResultUpdateLive setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public GetOrgLiveListResponseBodyResultUpdateLive setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetOrgLiveListResponseBodyResultUpdateLive setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetOrgLiveListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>新建的直播列表</p>
         */
        @NameInMap("NewLive")
        public GetOrgLiveListResponseBodyResultNewLive newLive;

        /**
         * <strong>example:</strong>
         * <p>修改的直播列表</p>
         */
        @NameInMap("UpdateLive")
        public GetOrgLiveListResponseBodyResultUpdateLive updateLive;

        public static GetOrgLiveListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListResponseBodyResult self = new GetOrgLiveListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListResponseBodyResult setNewLive(GetOrgLiveListResponseBodyResultNewLive newLive) {
            this.newLive = newLive;
            return this;
        }
        public GetOrgLiveListResponseBodyResultNewLive getNewLive() {
            return this.newLive;
        }

        public GetOrgLiveListResponseBodyResult setUpdateLive(GetOrgLiveListResponseBodyResultUpdateLive updateLive) {
            this.updateLive = updateLive;
            return this;
        }
        public GetOrgLiveListResponseBodyResultUpdateLive getUpdateLive() {
            return this.updateLive;
        }

    }

}
