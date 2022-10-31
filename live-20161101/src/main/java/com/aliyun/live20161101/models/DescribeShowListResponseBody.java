// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowList")
    public String showList;

    @NameInMap("ShowListInfo")
    public DescribeShowListResponseBodyShowListInfo showListInfo;

    public static DescribeShowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShowListResponseBody self = new DescribeShowListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShowListResponseBody setShowList(String showList) {
        this.showList = showList;
        return this;
    }
    public String getShowList() {
        return this.showList;
    }

    public DescribeShowListResponseBody setShowListInfo(DescribeShowListResponseBodyShowListInfo showListInfo) {
        this.showListInfo = showListInfo;
        return this;
    }
    public DescribeShowListResponseBodyShowListInfo getShowListInfo() {
        return this.showListInfo;
    }

    public static class DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo extends TeaModel {
        @NameInMap("LiveInputType")
        public Integer liveInputType;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceUrl")
        public String resourceUrl;

        public static DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo self = new DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo setLiveInputType(Integer liveInputType) {
            this.liveInputType = liveInputType;
            return this;
        }
        public Integer getLiveInputType() {
            return this.liveInputType;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public String getResourceUrl() {
            return this.resourceUrl;
        }

    }

    public static class DescribeShowListResponseBodyShowListInfoShowListShow extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        @NameInMap("ResourceInfo")
        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo resourceInfo;

        @NameInMap("ShowId")
        public String showId;

        @NameInMap("ShowName")
        public String showName;

        public static DescribeShowListResponseBodyShowListInfoShowListShow build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowListResponseBodyShowListInfoShowListShow self = new DescribeShowListResponseBodyShowListInfoShowListShow();
            return TeaModel.build(map, self);
        }

        public DescribeShowListResponseBodyShowListInfoShowListShow setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShow setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShow setResourceInfo(DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public DescribeShowListResponseBodyShowListInfoShowListShowResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShow setShowId(String showId) {
            this.showId = showId;
            return this;
        }
        public String getShowId() {
            return this.showId;
        }

        public DescribeShowListResponseBodyShowListInfoShowListShow setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

    public static class DescribeShowListResponseBodyShowListInfoShowList extends TeaModel {
        @NameInMap("Show")
        public java.util.List<DescribeShowListResponseBodyShowListInfoShowListShow> show;

        public static DescribeShowListResponseBodyShowListInfoShowList build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowListResponseBodyShowListInfoShowList self = new DescribeShowListResponseBodyShowListInfoShowList();
            return TeaModel.build(map, self);
        }

        public DescribeShowListResponseBodyShowListInfoShowList setShow(java.util.List<DescribeShowListResponseBodyShowListInfoShowListShow> show) {
            this.show = show;
            return this;
        }
        public java.util.List<DescribeShowListResponseBodyShowListInfoShowListShow> getShow() {
            return this.show;
        }

    }

    public static class DescribeShowListResponseBodyShowListInfo extends TeaModel {
        @NameInMap("CurrentShowId")
        public String currentShowId;

        @NameInMap("HighPriorityShowId")
        public String highPriorityShowId;

        @NameInMap("HighPriorityShowStartTime")
        public String highPriorityShowStartTime;

        @NameInMap("ShowList")
        public DescribeShowListResponseBodyShowListInfoShowList showList;

        @NameInMap("ShowListRepeatTimes")
        public Integer showListRepeatTimes;

        @NameInMap("TotalShowListRepeatTimes")
        public Integer totalShowListRepeatTimes;

        public static DescribeShowListResponseBodyShowListInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeShowListResponseBodyShowListInfo self = new DescribeShowListResponseBodyShowListInfo();
            return TeaModel.build(map, self);
        }

        public DescribeShowListResponseBodyShowListInfo setCurrentShowId(String currentShowId) {
            this.currentShowId = currentShowId;
            return this;
        }
        public String getCurrentShowId() {
            return this.currentShowId;
        }

        public DescribeShowListResponseBodyShowListInfo setHighPriorityShowId(String highPriorityShowId) {
            this.highPriorityShowId = highPriorityShowId;
            return this;
        }
        public String getHighPriorityShowId() {
            return this.highPriorityShowId;
        }

        public DescribeShowListResponseBodyShowListInfo setHighPriorityShowStartTime(String highPriorityShowStartTime) {
            this.highPriorityShowStartTime = highPriorityShowStartTime;
            return this;
        }
        public String getHighPriorityShowStartTime() {
            return this.highPriorityShowStartTime;
        }

        public DescribeShowListResponseBodyShowListInfo setShowList(DescribeShowListResponseBodyShowListInfoShowList showList) {
            this.showList = showList;
            return this;
        }
        public DescribeShowListResponseBodyShowListInfoShowList getShowList() {
            return this.showList;
        }

        public DescribeShowListResponseBodyShowListInfo setShowListRepeatTimes(Integer showListRepeatTimes) {
            this.showListRepeatTimes = showListRepeatTimes;
            return this;
        }
        public Integer getShowListRepeatTimes() {
            return this.showListRepeatTimes;
        }

        public DescribeShowListResponseBodyShowListInfo setTotalShowListRepeatTimes(Integer totalShowListRepeatTimes) {
            this.totalShowListRepeatTimes = totalShowListRepeatTimes;
            return this;
        }
        public Integer getTotalShowListRepeatTimes() {
            return this.totalShowListRepeatTimes;
        }

    }

}
