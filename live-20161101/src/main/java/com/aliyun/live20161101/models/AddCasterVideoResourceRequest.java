// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterVideoResourceRequest extends TeaModel {
    /**
     * <p>The start offset of the video file. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect only when the video source type is file video.</p>
     * </blockquote>
     * <blockquote>
     * <p>A value greater than <strong>0</strong> indicates that reading starts from the offset time relative to the first frame.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BeginOffset")
    public Integer beginOffset;

    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter value returned by the CreateCaster operation.</p>
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
     * <p>The end offset of the video file. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect only when the video source type is file video.</p>
     * </blockquote>
     * <ul>
     * <li>A value greater than <strong>0</strong>: reading ends at the offset time relative to the first frame.</li>
     * <li>A value less than <strong>0</strong>: reading ends at the offset time relative to the last frame.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("EndOffset")
    public Integer endOffset;

    /**
     * <p>The fixed delay for the video, which can be used for subtitle synchronization. Unit: ms. Default value: 0. Value range: <code>[0-5000]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FixedDelayDuration")
    public Integer fixedDelayDuration;

    /**
     * <p>The media asset library image material ID.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the video source type is image.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a089175eb5f4427684fc0715159a****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The image material URL.</p>
     * <blockquote>
     * <p>This parameter is available only when the video source type is image and the image file has not been imported to the media asset library. JPG and PNG formats are supported. The maximum file size is 10 MB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ApsaraVideo Live streaming URL.</p>
     * <blockquote>
     * <p>Notice:  </p>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when the video source type is live stream.</p>
     * </li>
     * <li><p>Do not include this parameter in the request when the video source type is not live stream.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****</p>
     */
    @NameInMap("LiveStreamUrl")
    public String liveStreamUrl;

    /**
     * <p>The location identifier of the video source. This parameter is required. </p>
     * <p>Defines the reference number of a scene in the layout. Each location can be associated with at most one resource. The format must match &quot;RV01<del>RV12&quot;, which is RV + a number in the range of `[01</del>99]`.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("LocationId")
    public String locationId;

    /**
     * <p>The media asset library material ID.</p>
     * <blockquote>
     * <p>Notice: This parameter is available and required only when the video source type is material.</p>
     * </blockquote>
     * <p>If you call the <a href="https://help.aliyun.com/document_detail/2848011.html">DescribeCasterConfig</a> operation to query the production studio configuration, check the UrgentMaterialId parameter value returned by the DescribeCasterConfig operation.</p>
     * <blockquote>
     * <p>The UrgentMaterialId value is the media asset library material ID.</p>
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
     * <p>The PTS callback interval. Unit: milliseconds.</p>
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
     * <p>The number of times the video repeats after playback completes. Valid values:</p>
     * <blockquote>
     * <p>Notice: This parameter takes effect only when the video source type is file video.</p>
     * </blockquote>
     * <ul>
     * <li><strong>0</strong> (default): no repeat.</li>
     * <li><strong>-1</strong>: loops indefinitely.</li>
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
     * <p>The video-on-demand file URL.</p>
     * <blockquote>
     * <p>Notice: This parameter is available only when the video source type is file video and the video file has not been imported to the media asset library.</p>
     * </blockquote>
     * <blockquote>
     * <p>Video-on-demand files are limited to MP4, FLV, and TS formats.</p>
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
