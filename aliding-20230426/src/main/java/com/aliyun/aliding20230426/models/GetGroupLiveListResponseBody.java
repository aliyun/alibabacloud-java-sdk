// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetGroupLiveListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetGroupLiveListResponseBodyResult result;

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

    public static GetGroupLiveListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupLiveListResponseBody self = new GetGroupLiveListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupLiveListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGroupLiveListResponseBody setResult(GetGroupLiveListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetGroupLiveListResponseBodyResult getResult() {
        return this.result;
    }

    public GetGroupLiveListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetGroupLiveListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetGroupLiveListResponseBodyResultGroupLiveList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nickName</p>
         */
        @NameInMap("AnchorNickname")
        public String anchorNickname;

        /**
         * <strong>example:</strong>
         * <p>Eijxx</p>
         */
        @NameInMap("AnchorUnionId")
        public String anchorUnionId;

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

        public static GetGroupLiveListResponseBodyResultGroupLiveList build(java.util.Map<String, ?> map) throws Exception {
            GetGroupLiveListResponseBodyResultGroupLiveList self = new GetGroupLiveListResponseBodyResultGroupLiveList();
            return TeaModel.build(map, self);
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setAnchorNickname(String anchorNickname) {
            this.anchorNickname = anchorNickname;
            return this;
        }
        public String getAnchorNickname() {
            return this.anchorNickname;
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setAnchorUnionId(String anchorUnionId) {
            this.anchorUnionId = anchorUnionId;
            return this;
        }
        public String getAnchorUnionId() {
            return this.anchorUnionId;
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setLiveEndTime(Long liveEndTime) {
            this.liveEndTime = liveEndTime;
            return this;
        }
        public Long getLiveEndTime() {
            return this.liveEndTime;
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setLiveStartTime(Long liveStartTime) {
            this.liveStartTime = liveStartTime;
            return this;
        }
        public Long getLiveStartTime() {
            return this.liveStartTime;
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setLiveUuid(String liveUuid) {
            this.liveUuid = liveUuid;
            return this;
        }
        public String getLiveUuid() {
            return this.liveUuid;
        }

        public GetGroupLiveListResponseBodyResultGroupLiveList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetGroupLiveListResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>直播列表</p>
         */
        @NameInMap("GroupLiveList")
        public java.util.List<GetGroupLiveListResponseBodyResultGroupLiveList> groupLiveList;

        public static GetGroupLiveListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetGroupLiveListResponseBodyResult self = new GetGroupLiveListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetGroupLiveListResponseBodyResult setGroupLiveList(java.util.List<GetGroupLiveListResponseBodyResultGroupLiveList> groupLiveList) {
            this.groupLiveList = groupLiveList;
            return this;
        }
        public java.util.List<GetGroupLiveListResponseBodyResultGroupLiveList> getGroupLiveList() {
            return this.groupLiveList;
        }

    }

}
