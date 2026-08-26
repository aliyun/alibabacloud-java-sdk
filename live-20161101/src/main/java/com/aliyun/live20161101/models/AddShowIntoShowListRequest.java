// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId value returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, navigate to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the production studio name.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page of the ApsaraVideo Live console is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The playback duration of a single show. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>You can set only one of <strong>RepeatTimes</strong> and <strong>Duration</strong>.</li>
     * <li>This parameter is required when ResourceType is set to live.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The custom type tag.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LiveInputType")
    public Integer liveInputType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of times a single show is repeated. Default value: 0.</p>
     * <blockquote>
     * <ul>
     * <li>You can set only one of <strong>RepeatTimes</strong> and <strong>Duration</strong>.- RepeatTimes specifies the number of repetitions. For example, -1 means infinite repetition, 0 means the show is repeated 0 times (played once), 1 means the show is repeated 1 time (played twice), and so on.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    /**
     * <p>The VOD file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>live: live streaming resource.</li>
     * <li>vod: video-on-demand resource.</li>
     * <li>pic: image resource.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When using video-on-demand (VOD) resources, use managed Bucket resources first. Resources in your own Bucket may expire. If you use resources in your own Bucket, check the resource validity period.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Live files support live streaming resources and third-party URLs.</li>
     * <li>VOD files support video-on-demand resources, image resources, and third-party URLs.</li>
     * <li>When using live streaming resources, you must also specify the Duration parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vod</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The URL of the playback file.</p>
     */
    @NameInMap("ResourceUrl")
    public String resourceUrl;

    /**
     * <p>The show name.</p>
     * 
     * <strong>example:</strong>
     * <p>liveShow****</p>
     */
    @NameInMap("ShowName")
    public String showName;

    /**
     * <p>The position in the playlist where the show is inserted. Positions start from 0. By default, the show is added to the end of the current playlist.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spot")
    public Integer spot;

    /**
     * <p>Specifies whether to add shows to the playlist in batch. Valid values:</p>
     * <ul>
     * <li><p>true: Batch addition.</p>
     * </li>
     * <li><p>false: Single addition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified or left empty, single addition is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    /**
     * <p>The list of show resources to add. Each resource has independent parameters such as showName and resourceUrl.</p>
     */
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

    public AddShowIntoShowListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
        /**
         * <p>The playback duration of a single show. Unit: seconds.</p>
         * <blockquote>
         * <ul>
         * <li>You can set only one of <strong>repeatTimes</strong> and <strong>duration</strong>.</li>
         * <li>This parameter is required when resourceType is set to live.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The custom type tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("liveInputType")
        public Integer liveInputType;

        /**
         * <p>The number of times a single show is repeated. Default value: 0.</p>
         * <blockquote>
         * <ul>
         * <li>You can set only one of <strong>repeatTimes</strong> and <strong>duration</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>repeatTimes specifies the number of repetitions. For example, 0 means the show is repeated 0 times (played once), 1 means the show is repeated 1 time (played twice), and so on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("repeatTimes")
        public Integer repeatTimes;

        /**
         * <p>The VOD file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><p>live: live streaming resource.</p>
         * </li>
         * <li><p>vod: video-on-demand resource.</p>
         * </li>
         * <li><p>pic: image resource.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When using video-on-demand (VOD) resources, use managed Bucket resources first. Resources in your own Bucket may expire. If you use resources in your own Bucket, check the resource validity period.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Live files support live streaming resources and third-party URLs.</li>
         * <li>VOD files support video-on-demand resources, image resources, and third-party URLs.</li>
         * <li>When using live streaming resources, you must also specify the duration parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The URL of the playback file.</p>
         */
        @NameInMap("resourceUrl")
        public String resourceUrl;

        /**
         * <p>The show name.</p>
         * 
         * <strong>example:</strong>
         * <p>liveShow****</p>
         */
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
