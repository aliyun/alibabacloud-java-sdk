// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("LiveInputType")
    public Integer liveInputType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ResourceUrl")
    public String resourceUrl;

    @NameInMap("ShowName")
    public String showName;

    @NameInMap("Spot")
    public Integer spot;

    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    @NameInMap("showList")
    public java.util.List<AddShowIntoShowListRequestShowList> showList;

    public static AddShowIntoShowListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShowIntoShowListRequest self = new AddShowIntoShowListRequest();
        return TeaModel.build(map, self);
    }

    public AddShowIntoShowListRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddShowIntoShowListRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AddShowIntoShowListRequest setLiveInputType(Integer liveInputType) {
        this.liveInputType = liveInputType;
        return this;
    }
    public Integer getLiveInputType() {
        return this.liveInputType;
    }

    public AddShowIntoShowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddShowIntoShowListRequest setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
        return this;
    }
    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }

    public AddShowIntoShowListRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddShowIntoShowListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddShowIntoShowListRequest setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public AddShowIntoShowListRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public AddShowIntoShowListRequest setSpot(Integer spot) {
        this.spot = spot;
        return this;
    }
    public Integer getSpot() {
        return this.spot;
    }

    public AddShowIntoShowListRequest setIsBatchMode(Boolean isBatchMode) {
        this.isBatchMode = isBatchMode;
        return this;
    }
    public Boolean getIsBatchMode() {
        return this.isBatchMode;
    }

    public AddShowIntoShowListRequest setShowList(java.util.List<AddShowIntoShowListRequestShowList> showList) {
        this.showList = showList;
        return this;
    }
    public java.util.List<AddShowIntoShowListRequestShowList> getShowList() {
        return this.showList;
    }

    public static class AddShowIntoShowListRequestShowList extends TeaModel {
        @NameInMap("duration")
        public Long duration;

        @NameInMap("liveInputType")
        public Integer liveInputType;

        @NameInMap("repeatTimes")
        public Integer repeatTimes;

        @NameInMap("resourceId")
        public String resourceId;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("resourceUrl")
        public String resourceUrl;

        @NameInMap("showName")
        public String showName;

        public static AddShowIntoShowListRequestShowList build(java.util.Map<String, ?> map) throws Exception {
            AddShowIntoShowListRequestShowList self = new AddShowIntoShowListRequestShowList();
            return TeaModel.build(map, self);
        }

        public AddShowIntoShowListRequestShowList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public AddShowIntoShowListRequestShowList setLiveInputType(Integer liveInputType) {
            this.liveInputType = liveInputType;
            return this;
        }
        public Integer getLiveInputType() {
            return this.liveInputType;
        }

        public AddShowIntoShowListRequestShowList setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public AddShowIntoShowListRequestShowList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AddShowIntoShowListRequestShowList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public AddShowIntoShowListRequestShowList setResourceUrl(String resourceUrl) {
            this.resourceUrl = resourceUrl;
            return this;
        }
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        public AddShowIntoShowListRequestShowList setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
