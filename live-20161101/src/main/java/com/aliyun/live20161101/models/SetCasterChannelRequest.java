// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelRequest extends TeaModel {
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
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The ID of the channel.</p>
     * <p>When channels are enabled, the layout references the channel IDs. You can specify up to one resource for a channel. The number of resources is limited by the number of the channels of the production studio. The value must be in the RV[Number] format, such as RV01 and RV12.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The face retouching effect. Valid values: 0 (all effects), 1 (skin smoothing), 2 (skin whitening), 3 (dark circles removal), and 4 (nasolabial folds removal).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaceBeauty")
    public String faceBeauty;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The playback status. This parameter take effects for video files, but not for live streams. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: specifies that the video source is playing. This is the default value.</li>
     * <li><strong>0</strong>: specifies that the playback of the video source is paused.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlayStatus")
    public Integer playStatus;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the video source.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The offset of the position where the production studio starts reading the video source. The value must be greater than or equal to 0, indicating an offset from the first frame. This parameter take effects for video files, but not for live streams. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SeekOffset")
    public Integer seekOffset;

    public static SetCasterChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterChannelRequest self = new SetCasterChannelRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterChannelRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public SetCasterChannelRequest setFaceBeauty(String faceBeauty) {
        this.faceBeauty = faceBeauty;
        return this;
    }
    public String getFaceBeauty() {
        return this.faceBeauty;
    }

    public SetCasterChannelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterChannelRequest setPlayStatus(Integer playStatus) {
        this.playStatus = playStatus;
        return this;
    }
    public Integer getPlayStatus() {
        return this.playStatus;
    }

    public SetCasterChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetCasterChannelRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SetCasterChannelRequest setSeekOffset(Integer seekOffset) {
        this.seekOffset = seekOffset;
        return this;
    }
    public Integer getSeekOffset() {
        return this.seekOffset;
    }

}
