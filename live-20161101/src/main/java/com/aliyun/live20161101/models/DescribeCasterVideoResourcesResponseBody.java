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
        @NameInMap("BeginOffset")
        public Integer beginOffset;

        @NameInMap("EndOffset")
        public Integer endOffset;

        @NameInMap("FlvUrl")
        public String flvUrl;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("LiveStreamUrl")
        public String liveStreamUrl;

        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("PtsCallbackInterval")
        public Integer ptsCallbackInterval;

        @NameInMap("RepeatNum")
        public Integer repeatNum;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

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
