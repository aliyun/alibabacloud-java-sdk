// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceRequest extends TeaModel {
    /**
     * <p>The offset of the position where the system starts to read the video resource.</p>
     * <p>This parameter takes effect only when the video resource is a video file. Unit: milliseconds.</p>
     * <blockquote>
     * <p> A value greater than 0 indicates an offset from the first frame.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BeginOffset")
    public Integer beginOffset;

    /**
     * <p>The ID of the production studio.</p>
     * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~" title="Creates a production studio.">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
     * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
     * <p>Production Studios &gt; Production Studio Management</p>
     * <blockquote>
     * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>This parameter takes effect only when the video resource is a video file. Unit: milliseconds.</p>
     * <ul>
     * <li>A value greater than <strong>0</strong> indicates an offset from the first frame.</li>
     * <li>A value smaller than <strong>0</strong> indicates an offset from the last frame.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("EndOffset")
    public Integer endOffset;

    /**
     * <p>ID of the media library image material.</p>
     * <blockquote>
     * <p>This parameter is only available and must be provided when the video source type is an image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a089175eb5f4427684fc0715159a****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Image material URL. </p>
     * <blockquote>
     * <p>This parameter is only available when the video source type is an image and the image file has not been imported into the material library. Supports uploading images in jpg, png formats, with a maximum file size of 10MB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The URL of the live stream.</p>
     * <p>This parameter takes effect and is required only when the video resource is a live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    /**
     * <p>The ID of the material.</p>
     * 
     * <strong>example:</strong>
     * <p>f080575eb5f4427684fc0715159a****</p>
     */
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The interval between presentation timestamp (PTS) callbacks. Unit: milliseconds. This parameter takes effect only when the video resource is a VOD file.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("PtsCallbackInterval")
    public Integer ptsCallbackInterval;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of playback times after the first playback is complete. This parameter takes effect only when the video resource is a file. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: indicates that the video is played only once. This is the default value.</li>
     * <li><strong>-1</strong>: indicates that the video is played in loop mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNum")
    public Integer repeatNum;

    /**
     * <p>The ID of the video resource. It is reflected in the ResourceId parameter when you call the <a href="~~60250#doc-api-live-AddCasterVideoResource~~" title="Adds a video resource to a production studio.">AddCasterVideoResource</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the video resource.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The URL of the video-on-demand (VOD) file. This parameter takes effect only when the video resource is a video file that is not from the media library.</p>
     * <blockquote>
     * <p> The VOD file must be in the MP4, FLV, or TS format.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com/AppName/StreamName.flv">http://developer.aliyundoc.com/AppName/StreamName.flv</a></p>
     */
    @NameInMap("VodUrl")
    public String vodUrl;

    public static ModifyCasterVideoResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterVideoResourceRequest self = new ModifyCasterVideoResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterVideoResourceRequest setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    public ModifyCasterVideoResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterVideoResourceRequest setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }
    public Integer getEndOffset() {
        return this.endOffset;
    }

    public ModifyCasterVideoResourceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyCasterVideoResourceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ModifyCasterVideoResourceRequest setLiveStreamUrl(String liveStreamUrl) {
        this.liveStreamUrl = liveStreamUrl;
        return this;
    }
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    public ModifyCasterVideoResourceRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public ModifyCasterVideoResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterVideoResourceRequest setPtsCallbackInterval(Integer ptsCallbackInterval) {
        this.ptsCallbackInterval = ptsCallbackInterval;
        return this;
    }
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

    public ModifyCasterVideoResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCasterVideoResourceRequest setRepeatNum(Integer repeatNum) {
        this.repeatNum = repeatNum;
        return this;
    }
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    public ModifyCasterVideoResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ModifyCasterVideoResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ModifyCasterVideoResourceRequest setVodUrl(String vodUrl) {
        this.vodUrl = vodUrl;
        return this;
    }
    public String getVodUrl() {
        return this.vodUrl;
    }

}
