// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The duration of the episode. Unit: seconds.</p>
     * <blockquote>
     * <p>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Duration")
    public Long duration;

    /**
     * <p>The custom type label.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LiveInputType")
    public Integer liveInputType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of times the episode repeats after the first playback is complete. The default value is 0.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters. - The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to -1, the episode is to be played for infinite times. If you set the value to 0, the episode is to be played once. If you set the value to 1, the episode is to be played twice.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatTimes")
    public Integer repeatTimes;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>live: live stream</li>
     * <li>vod: on-demand video</li>
     * <li>pic: image</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets. - You can add a live stream from ApsaraVideo Live or by using a third-party URL. - You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL, or add an on-demand image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vod</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The URL of the resource.</p>
     */
    @NameInMap("ResourceUrl")
    public String resourceUrl;

    /**
     * <p>The name of the episode.</p>
     * 
     * <strong>example:</strong>
     * <p>liveShow****</p>
     */
    @NameInMap("ShowName")
    public String showName;

    /**
     * <p>The position of the episode in the episode list. Position indexes start from 0. By default, the episode is added to the end of the episode list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Spot")
    public Integer spot;

    /**
     * <p>Specifies whether to add multiple episodes to the episode list at a time. Valid values:</p>
     * <ul>
     * <li>true: adds multiple episodes to the episode list at a time.</li>
     * <li>false: adds a single episode to the episode list.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter or this parameter is left empty, a single episode is to be added to the episode list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isBatchMode")
    public Boolean isBatchMode;

    /**
     * <p>The episodes that you want to add to the episode list. Each episode has a unique name and resource URL.</p>
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
         * <p>The duration of the episode. Unit: seconds.</p>
         * <blockquote>
         * <p> You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The custom type label.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("liveInputType")
        public Integer liveInputType;

        /**
         * <p>The number of times the episode repeats after the first playback is complete. Default value: 0.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can specify only one of the <strong>RepeatTimes</strong> and <strong>Duration</strong> parameters.</p>
         * </li>
         * <li><p>The RepeatTimes parameter specifies the number of repetitions. For example, if you set the value to 0, the episode is to be played once. If you set the value to 1, the episode is to be played twice.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("repeatTimes")
        public Integer repeatTimes;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>live: live stream</li>
         * <li>vod: on-demand video</li>
         * <li>pic: image</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>When you select media resources from ApsaraVideo VOD, we recommend that you select resources that are stored in hosted OSS buckets. Resources stored in non-hosted OSS buckets have a validity period. Pay attention to the validity if you select resources that are stored in non-hosted OSS buckets.</p>
         * </li>
         * <li><p>You can add a live stream from ApsaraVideo Live or by using a third-party URL.</p>
         * </li>
         * <li><p>You can add an on-demand video from ApsaraVideo VOD or by using a third-party URL, or add an on-demand image.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vod</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The URL of the resource.</p>
         */
        @NameInMap("resourceUrl")
        public String resourceUrl;

        /**
         * <p>The name of the episode.</p>
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
