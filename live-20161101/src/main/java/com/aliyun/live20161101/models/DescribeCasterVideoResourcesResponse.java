// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("VideoResources")
    @Validation(required = true)
    public DescribeCasterVideoResourcesResponseVideoResources videoResources;

    public static DescribeCasterVideoResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterVideoResourcesResponse self = new DescribeCasterVideoResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterVideoResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterVideoResourcesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterVideoResourcesResponse setVideoResources(DescribeCasterVideoResourcesResponseVideoResources videoResources) {
        this.videoResources = videoResources;
        return this;
    }
    public DescribeCasterVideoResourcesResponseVideoResources getVideoResources() {
        return this.videoResources;
    }

    public static class DescribeCasterVideoResourcesResponseVideoResourcesVideoResource extends TeaModel {
        @NameInMap("MaterialId")
        @Validation(required = true)
        public String materialId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("ResourceName")
        @Validation(required = true)
        public String resourceName;

        @NameInMap("LocationId")
        @Validation(required = true)
        public String locationId;

        @NameInMap("LiveStreamUrl")
        @Validation(required = true)
        public String liveStreamUrl;

        @NameInMap("RepeatNum")
        @Validation(required = true)
        public Integer repeatNum;

        @NameInMap("VodUrl")
        @Validation(required = true)
        public String vodUrl;

        @NameInMap("BeginOffset")
        @Validation(required = true)
        public Integer beginOffset;

        @NameInMap("EndOffset")
        @Validation(required = true)
        public Integer endOffset;

        @NameInMap("PtsCallbackInterval")
        @Validation(required = true)
        public Integer ptsCallbackInterval;

        public static DescribeCasterVideoResourcesResponseVideoResourcesVideoResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterVideoResourcesResponseVideoResourcesVideoResource self = new DescribeCasterVideoResourcesResponseVideoResourcesVideoResource();
            return TeaModel.build(map, self);
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setLiveStreamUrl(String liveStreamUrl) {
            this.liveStreamUrl = liveStreamUrl;
            return this;
        }
        public String getLiveStreamUrl() {
            return this.liveStreamUrl;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setRepeatNum(Integer repeatNum) {
            this.repeatNum = repeatNum;
            return this;
        }
        public Integer getRepeatNum() {
            return this.repeatNum;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setBeginOffset(Integer beginOffset) {
            this.beginOffset = beginOffset;
            return this;
        }
        public Integer getBeginOffset() {
            return this.beginOffset;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setEndOffset(Integer endOffset) {
            this.endOffset = endOffset;
            return this;
        }
        public Integer getEndOffset() {
            return this.endOffset;
        }

        public DescribeCasterVideoResourcesResponseVideoResourcesVideoResource setPtsCallbackInterval(Integer ptsCallbackInterval) {
            this.ptsCallbackInterval = ptsCallbackInterval;
            return this;
        }
        public Integer getPtsCallbackInterval() {
            return this.ptsCallbackInterval;
        }

    }

    public static class DescribeCasterVideoResourcesResponseVideoResources extends TeaModel {
        @NameInMap("VideoResource")
        @Validation(required = true)
        public java.util.List<DescribeCasterVideoResourcesResponseVideoResourcesVideoResource> videoResource;

        public static DescribeCasterVideoResourcesResponseVideoResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterVideoResourcesResponseVideoResources self = new DescribeCasterVideoResourcesResponseVideoResources();
            return TeaModel.build(map, self);
        }

        public DescribeCasterVideoResourcesResponseVideoResources setVideoResource(java.util.List<DescribeCasterVideoResourcesResponseVideoResourcesVideoResource> videoResource) {
            this.videoResource = videoResource;
            return this;
        }
        public java.util.List<DescribeCasterVideoResourcesResponseVideoResourcesVideoResource> getVideoResource() {
            return this.videoResource;
        }

    }

}
