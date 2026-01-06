// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkMeetingListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<GetDingtalkMeetingListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
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

    public static GetDingtalkMeetingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkMeetingListResponseBody self = new GetDingtalkMeetingListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDingtalkMeetingListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDingtalkMeetingListResponseBody setData(java.util.List<GetDingtalkMeetingListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDingtalkMeetingListResponseBodyData> getData() {
        return this.data;
    }

    public GetDingtalkMeetingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDingtalkMeetingListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetDingtalkMeetingListResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetDingtalkMeetingListResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class GetDingtalkMeetingListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cluster-1</p>
         */
        @NameInMap("clusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>61289fxxx</p>
         */
        @NameInMap("conferenceId")
        public String conferenceId;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("creatorNick")
        public String creatorNick;

        /**
         * <strong>example:</strong>
         * <p>3423423</p>
         */
        @NameInMap("creatorWorkNo")
        public String creatorWorkNo;

        /**
         * <strong>example:</strong>
         * <p>技术部</p>
         */
        @NameInMap("deptName")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableQualityMonitor")
        public Boolean enableQualityMonitor;

        /**
         * <strong>example:</strong>
         * <p>1638363600000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("freeType")
        public String freeType;

        /**
         * <strong>example:</strong>
         * <p>meeting</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <strong>example:</strong>
         * <p>1638360000000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("timeLength")
        public Long timeLength;

        /**
         * <strong>example:</strong>
         * <p>技术分享会</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("userCount")
        public Integer userCount;

        public static GetDingtalkMeetingListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkMeetingListResponseBodyData self = new GetDingtalkMeetingListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDingtalkMeetingListResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetDingtalkMeetingListResponseBodyData setConferenceId(String conferenceId) {
            this.conferenceId = conferenceId;
            return this;
        }
        public String getConferenceId() {
            return this.conferenceId;
        }

        public GetDingtalkMeetingListResponseBodyData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDingtalkMeetingListResponseBodyData setCreatorNick(String creatorNick) {
            this.creatorNick = creatorNick;
            return this;
        }
        public String getCreatorNick() {
            return this.creatorNick;
        }

        public GetDingtalkMeetingListResponseBodyData setCreatorWorkNo(String creatorWorkNo) {
            this.creatorWorkNo = creatorWorkNo;
            return this;
        }
        public String getCreatorWorkNo() {
            return this.creatorWorkNo;
        }

        public GetDingtalkMeetingListResponseBodyData setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public GetDingtalkMeetingListResponseBodyData setEnableQualityMonitor(Boolean enableQualityMonitor) {
            this.enableQualityMonitor = enableQualityMonitor;
            return this;
        }
        public Boolean getEnableQualityMonitor() {
            return this.enableQualityMonitor;
        }

        public GetDingtalkMeetingListResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetDingtalkMeetingListResponseBodyData setFreeType(String freeType) {
            this.freeType = freeType;
            return this;
        }
        public String getFreeType() {
            return this.freeType;
        }

        public GetDingtalkMeetingListResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetDingtalkMeetingListResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetDingtalkMeetingListResponseBodyData setTimeLength(Long timeLength) {
            this.timeLength = timeLength;
            return this;
        }
        public Long getTimeLength() {
            return this.timeLength;
        }

        public GetDingtalkMeetingListResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetDingtalkMeetingListResponseBodyData setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

}
