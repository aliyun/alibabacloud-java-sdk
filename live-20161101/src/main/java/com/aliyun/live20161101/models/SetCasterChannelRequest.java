// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId value returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the ApsaraVideo Live console, go to the <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The channel ID.</p>
     * <p>The reference ID for the layout scene. You can set a maximum of one resource for each channel. The total number of channels is determined when you create the production studio. The format is \<code>RV01\\</code> to \<code>RV12\\</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The facial retouching settings. Valid values: 0 (whole), 1 (skin smoothing), 2 (skin whitening), 3 (dark circle removal), and 4 (nasolabial fold removal).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FaceBeauty")
    public String faceBeauty;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The playback status. This parameter applies only to video files, not live streams. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong> (default): Playback.</p>
     * </li>
     * <li><p><strong>0</strong>: Pause.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PlayStatus")
    public Integer playStatus;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
     * <p>This parameter applies only to video files, not live streams. The value must be greater than or equal to 0. It specifies the offset from the first frame at which to start reading the file. Unit: milliseconds (ms).</p>
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
