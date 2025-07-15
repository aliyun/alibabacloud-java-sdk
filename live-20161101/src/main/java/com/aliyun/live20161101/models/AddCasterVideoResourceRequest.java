// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceRequest extends TeaModel {
    /**
     * <p>The offset of the position where the system starts to read the video source. Unit: milliseconds.</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
     * <blockquote>
     * <p>A value greater than <strong>0</strong> specifies an offset from the first frame.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BeginOffset")
    public Integer beginOffset;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/69338.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p>You can find the ID of the production studio in the Instance Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The offset of the position where the system stops reading the video source. Unit: milliseconds.</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
     * <ul>
     * <li>A value greater than <strong>0</strong> specifies an offset from the first frame.</li>
     * <li>A value less than <strong>0</strong> specifies an offset from the last frame.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("EndOffset")
    public Integer endOffset;

    /**
     * <p>The fixed delay of the video layer. This parameter is used to synchronize the video with subtitles. Unit: milliseconds. Default value: 0. Valid values: <code>0 to 5000</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FixedDelayDuration")
    public Integer fixedDelayDuration;

    /**
     * <p>ID of the media library image material. </p>
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
     * <p>This parameter is available only when the video source type is an image and the image file has not been imported into the material library. Supports uploading images in jpg, png formats, with a maximum file size of 10MB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The streaming URL.</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter is required if the video source is a live stream.</p>
     * <blockquote>
     * <p>Do not specify this parameter in the request if the video source is not a live stream.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    /**
     * <p>The ID that is used to identify the position of the video source.</p>
     * <p>Define the reference numbers in the layout. Each reference number is associated with only one resource. The value of this parameter must be in the RV[Number] format, where Number is <code>01 to 99</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("LocationId")
    public String locationId;

    /**
     * <p>The ID of the material from the media library.</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter takes effect and is required only if the video source is a material.</p>
     * <p>If you query the configurations of the production studio by calling the <a href="https://help.aliyun.com/document_detail/60259.html">DescribeCasterConfig</a> operation, obtain the value of the response parameter UrgentMaterialId.</p>
     * <blockquote>
     * <p>The value of the UrgentMaterialId parameter is the ID of the material from the media library.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f080575eb5f4427684fc0715159a****</p>
     */
    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The interval between presentation timestamp (PTS) callbacks. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("PtsCallbackInterval")
    public Integer ptsCallbackInterval;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of playbacks after the first playback is complete. Valid values:</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter takes effect only if the video source is a file.</p>
     * <ul>
     * <li><strong>0</strong>: specifies that the video source is played only once. This is the default value.</li>
     * <li><strong>-1</strong>: specifies that the video source is played in loop mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RepeatNum")
    public Integer repeatNum;

    /**
     * <p>The name of the video source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test001</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The URL of the VOD file.</p>
     * <p>**</p>
     * <p><strong>Important</strong> This parameter takes effect only if the video source is a file that is not from the media library.</p>
     * <blockquote>
     * <p>The VOD file must be in the MP4, FLV, or TS format.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/StreamName.flv">http://learn.aliyundoc.com/AppName/StreamName.flv</a></p>
     */
    @NameInMap("VodUrl")
    public String vodUrl;

    public static AddCasterVideoResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterVideoResourceRequest self = new AddCasterVideoResourceRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterVideoResourceRequest setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
        return this;
    }
    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    public AddCasterVideoResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterVideoResourceRequest setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
        return this;
    }
    public Integer getEndOffset() {
        return this.endOffset;
    }

    public AddCasterVideoResourceRequest setFixedDelayDuration(Integer fixedDelayDuration) {
        this.fixedDelayDuration = fixedDelayDuration;
        return this;
    }
    public Integer getFixedDelayDuration() {
        return this.fixedDelayDuration;
    }

    public AddCasterVideoResourceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddCasterVideoResourceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddCasterVideoResourceRequest setLiveStreamUrl(String liveStreamUrl) {
        this.liveStreamUrl = liveStreamUrl;
        return this;
    }
    public String getLiveStreamUrl() {
        return this.liveStreamUrl;
    }

    public AddCasterVideoResourceRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AddCasterVideoResourceRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public AddCasterVideoResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterVideoResourceRequest setPtsCallbackInterval(Integer ptsCallbackInterval) {
        this.ptsCallbackInterval = ptsCallbackInterval;
        return this;
    }
    public Integer getPtsCallbackInterval() {
        return this.ptsCallbackInterval;
    }

    public AddCasterVideoResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCasterVideoResourceRequest setRepeatNum(Integer repeatNum) {
        this.repeatNum = repeatNum;
        return this;
    }
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    public AddCasterVideoResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public AddCasterVideoResourceRequest setVodUrl(String vodUrl) {
        this.vodUrl = vodUrl;
        return this;
    }
    public String getVodUrl() {
        return this.vodUrl;
    }

}
