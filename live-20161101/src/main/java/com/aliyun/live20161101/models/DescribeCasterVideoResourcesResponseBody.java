// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF60DB6A-7FD6-426E-9288-122CC1A52FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The input sources.</p>
     */
    @NameInMap("VideoResources")
    public DescribeCasterVideoResourcesResponseBodyVideoResources videoResources;

    public static DescribeCasterVideoResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterVideoResourcesResponseBody self = new DescribeCasterVideoResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterVideoResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterVideoResourcesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterVideoResourcesResponseBody setVideoResources(DescribeCasterVideoResourcesResponseBodyVideoResources videoResources) {
        this.videoResources = videoResources;
        return this;
    }
    public DescribeCasterVideoResourcesResponseBodyVideoResources getVideoResources() {
        return this.videoResources;
    }

    public static class DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource extends TeaModel {
        /**
         * <p>The offset of the position where the system starts to read the video resource. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
         * <p>A value <strong>greater than 0</strong> indicates an offset from the first frame.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BeginOffset")
        public Integer beginOffset;

        /**
         * <p>The offset of the position where the system stops reading the video file. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
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
         * <p>The source URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://guide.aliyundoc.com/example.org">http://guide.aliyundoc.com/example.org</a></p>
         */
        @NameInMap("FlvUrl")
        public String flvUrl;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a089175eb5f4427684fc0715159a****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://learn.aliyundoc.com/AppName/image.jpg">http://learn.aliyundoc.com/AppName/image.jpg</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The URL of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://abcLive/appName/b5447c21fcfe444c9e9b6f7ba208****</p>
         */
        @NameInMap("LiveStreamUrl")
        public String liveStreamUrl;

        /**
         * <p>The position of the video resource.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        /**
         * <p>The material ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d2c429cd907742ee8f6e76465ad3****</p>
         */
        @NameInMap("MaterialId")
        public String materialId;

        /**
         * <p>The interval between presentation timestamp (PTS) callbacks. If you set the value to 0, the PTS callback is disabled. This parameter is returned only when the video resource is a video-on-demand (VOD) file.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PtsCallbackInterval")
        public Integer ptsCallbackInterval;

        /**
         * <p>The number of playback times after the first playback is complete. This parameter takes effect only when the input source is a video file. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): The video file is played only once.</li>
         * <li><strong>-1</strong>: The video file is played in loop mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RepeatNum")
        public Integer repeatNum;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b5f8c837-ceeb-424f-b30b-68e94e86****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>resource-Name1</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The URL of the VOD file.</p>
         * <p>This parameter is returned only when the video resource is an MP4, FLV, or TS file that is not from the media library.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://developer.aliyundoc.com/caster1.flv">http://developer.aliyundoc.com/caster1.flv</a></p>
         */
        @NameInMap("VodUrl")
        public String vodUrl;

        public static DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource self = new DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource();
            return TeaModel.build(map, self);
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setBeginOffset(Integer beginOffset) {
            this.beginOffset = beginOffset;
            return this;
        }
        public Integer getBeginOffset() {
            return this.beginOffset;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setEndOffset(Integer endOffset) {
            this.endOffset = endOffset;
            return this;
        }
        public Integer getEndOffset() {
            return this.endOffset;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setFlvUrl(String flvUrl) {
            this.flvUrl = flvUrl;
            return this;
        }
        public String getFlvUrl() {
            return this.flvUrl;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setLiveStreamUrl(String liveStreamUrl) {
            this.liveStreamUrl = liveStreamUrl;
            return this;
        }
        public String getLiveStreamUrl() {
            return this.liveStreamUrl;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setPtsCallbackInterval(Integer ptsCallbackInterval) {
            this.ptsCallbackInterval = ptsCallbackInterval;
            return this;
        }
        public Integer getPtsCallbackInterval() {
            return this.ptsCallbackInterval;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setRepeatNum(Integer repeatNum) {
            this.repeatNum = repeatNum;
            return this;
        }
        public Integer getRepeatNum() {
            return this.repeatNum;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

    public static class DescribeCasterVideoResourcesResponseBodyVideoResources extends TeaModel {
        @NameInMap("VideoResource")
        public java.util.List<DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource> videoResource;

        public static DescribeCasterVideoResourcesResponseBodyVideoResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterVideoResourcesResponseBodyVideoResources self = new DescribeCasterVideoResourcesResponseBodyVideoResources();
            return TeaModel.build(map, self);
        }

        public DescribeCasterVideoResourcesResponseBodyVideoResources setVideoResource(java.util.List<DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource> videoResource) {
            this.videoResource = videoResource;
            return this;
        }
        public java.util.List<DescribeCasterVideoResourcesResponseBodyVideoResourcesVideoResource> getVideoResource() {
            return this.videoResource;
        }

    }

}
