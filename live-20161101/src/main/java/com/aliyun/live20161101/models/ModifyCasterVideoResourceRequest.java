// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterVideoResourceRequest extends TeaModel {
    /**
     * <p>The start offset of the video file. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is valid only if the video source is a video file.</p>
     * <blockquote>
     * <p>A value greater than 0 specifies the start time to read the file. The time is an offset from the first frame.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BeginOffset")
    public Integer beginOffset;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, use the CasterId returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the console, find the ID on the <strong>Cloud Production Studio</strong> page. To go to this page, choose <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is its ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>This parameter is valid only for video files. Unit: milliseconds.</p>
     * <ul>
     * <li><p>If the value is greater than <strong>0</strong>, it specifies the end time to read the file. The time is an offset from the first frame.</p>
     * </li>
     * <li><p>If the value is less than <strong>0</strong>, it specifies the end time to read the file. The time is an offset from the last frame.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("EndOffset")
    public Integer endOffset;

    /**
     * <p>The ID of the image material in the media asset library.</p>
     * <blockquote>
     * <p>This parameter is required only if the video source is an image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a089175eb5f4427684fc0715159a****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The URL of the image material.</p>
     * <blockquote>
     * <p>This parameter is available only if the video source is an image that has not been imported to the material library. The image must be in JPG or PNG format, and its size cannot exceed 10 MB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The URL of the live stream.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is required only if the video source is a live stream.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    /**
     * <p>The material ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f080575eb5f4427684fc0715159a****</p>
     */
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The Presentation Time Stamp (PTS) callback interval. Unit: milliseconds. This parameter is valid only for VOD materials.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("PtsCallbackInterval")
    public Integer ptsCallbackInterval;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is valid only for video files. It specifies the number of times to loop the video after playback is complete.</p>
     * <ul>
     * <li><p><strong>0</strong> (default): The video does not loop.</p>
     * </li>
     * <li><p><strong>-1</strong>: The video loops indefinitely.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNum")
    public Integer repeatNum;

    /**
     * <p>The resource ID. If you add a video source to the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a> operation, use the ResourceId returned in the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the video source.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The URL of the video on demand (VOD) file.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is available only if the video source is a video file that has not been imported to the material library.</p>
     * <blockquote>
     * <p>VOD files must be in MP4, FLV, or TS format.</p>
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
