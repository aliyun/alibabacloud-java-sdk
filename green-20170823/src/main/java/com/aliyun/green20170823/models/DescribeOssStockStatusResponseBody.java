// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssStockStatusResponseBody extends TeaModel {
    @NameInMap("AudioAntispamCount")
    public Integer audioAntispamCount;

    @NameInMap("AudioTotalCount")
    public Integer audioTotalCount;

    @NameInMap("BucketList")
    public java.util.List<DescribeOssStockStatusResponseBodyBucketList> bucketList;

    @NameInMap("FinishedTime")
    public String finishedTime;

    @NameInMap("ImageAdCount")
    public Integer imageAdCount;

    @NameInMap("ImageLiveCount")
    public Integer imageLiveCount;

    @NameInMap("ImagePornCount")
    public Integer imagePornCount;

    @NameInMap("ImageTerrorismCount")
    public Integer imageTerrorismCount;

    @NameInMap("ImageTotalCount")
    public Integer imageTotalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResouceTypeList")
    public java.util.List<String> resouceTypeList;

    @NameInMap("SceneList")
    public java.util.List<String> sceneList;

    @NameInMap("StockStatus")
    public Integer stockStatus;

    @NameInMap("VideoAdCount")
    public Integer videoAdCount;

    @NameInMap("VideoLiveCount")
    public Integer videoLiveCount;

    @NameInMap("VideoPornCount")
    public Integer videoPornCount;

    @NameInMap("VideoTerrorismCount")
    public Integer videoTerrorismCount;

    @NameInMap("VideoTotalCount")
    public Integer videoTotalCount;

    @NameInMap("VideoVoiceAntispamCount")
    public Integer videoVoiceAntispamCount;

    public static DescribeOssStockStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStockStatusResponseBody self = new DescribeOssStockStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssStockStatusResponseBody setAudioAntispamCount(Integer audioAntispamCount) {
        this.audioAntispamCount = audioAntispamCount;
        return this;
    }
    public Integer getAudioAntispamCount() {
        return this.audioAntispamCount;
    }

    public DescribeOssStockStatusResponseBody setAudioTotalCount(Integer audioTotalCount) {
        this.audioTotalCount = audioTotalCount;
        return this;
    }
    public Integer getAudioTotalCount() {
        return this.audioTotalCount;
    }

    public DescribeOssStockStatusResponseBody setBucketList(java.util.List<DescribeOssStockStatusResponseBodyBucketList> bucketList) {
        this.bucketList = bucketList;
        return this;
    }
    public java.util.List<DescribeOssStockStatusResponseBodyBucketList> getBucketList() {
        return this.bucketList;
    }

    public DescribeOssStockStatusResponseBody setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public DescribeOssStockStatusResponseBody setImageAdCount(Integer imageAdCount) {
        this.imageAdCount = imageAdCount;
        return this;
    }
    public Integer getImageAdCount() {
        return this.imageAdCount;
    }

    public DescribeOssStockStatusResponseBody setImageLiveCount(Integer imageLiveCount) {
        this.imageLiveCount = imageLiveCount;
        return this;
    }
    public Integer getImageLiveCount() {
        return this.imageLiveCount;
    }

    public DescribeOssStockStatusResponseBody setImagePornCount(Integer imagePornCount) {
        this.imagePornCount = imagePornCount;
        return this;
    }
    public Integer getImagePornCount() {
        return this.imagePornCount;
    }

    public DescribeOssStockStatusResponseBody setImageTerrorismCount(Integer imageTerrorismCount) {
        this.imageTerrorismCount = imageTerrorismCount;
        return this;
    }
    public Integer getImageTerrorismCount() {
        return this.imageTerrorismCount;
    }

    public DescribeOssStockStatusResponseBody setImageTotalCount(Integer imageTotalCount) {
        this.imageTotalCount = imageTotalCount;
        return this;
    }
    public Integer getImageTotalCount() {
        return this.imageTotalCount;
    }

    public DescribeOssStockStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssStockStatusResponseBody setResouceTypeList(java.util.List<String> resouceTypeList) {
        this.resouceTypeList = resouceTypeList;
        return this;
    }
    public java.util.List<String> getResouceTypeList() {
        return this.resouceTypeList;
    }

    public DescribeOssStockStatusResponseBody setSceneList(java.util.List<String> sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public java.util.List<String> getSceneList() {
        return this.sceneList;
    }

    public DescribeOssStockStatusResponseBody setStockStatus(Integer stockStatus) {
        this.stockStatus = stockStatus;
        return this;
    }
    public Integer getStockStatus() {
        return this.stockStatus;
    }

    public DescribeOssStockStatusResponseBody setVideoAdCount(Integer videoAdCount) {
        this.videoAdCount = videoAdCount;
        return this;
    }
    public Integer getVideoAdCount() {
        return this.videoAdCount;
    }

    public DescribeOssStockStatusResponseBody setVideoLiveCount(Integer videoLiveCount) {
        this.videoLiveCount = videoLiveCount;
        return this;
    }
    public Integer getVideoLiveCount() {
        return this.videoLiveCount;
    }

    public DescribeOssStockStatusResponseBody setVideoPornCount(Integer videoPornCount) {
        this.videoPornCount = videoPornCount;
        return this;
    }
    public Integer getVideoPornCount() {
        return this.videoPornCount;
    }

    public DescribeOssStockStatusResponseBody setVideoTerrorismCount(Integer videoTerrorismCount) {
        this.videoTerrorismCount = videoTerrorismCount;
        return this;
    }
    public Integer getVideoTerrorismCount() {
        return this.videoTerrorismCount;
    }

    public DescribeOssStockStatusResponseBody setVideoTotalCount(Integer videoTotalCount) {
        this.videoTotalCount = videoTotalCount;
        return this;
    }
    public Integer getVideoTotalCount() {
        return this.videoTotalCount;
    }

    public DescribeOssStockStatusResponseBody setVideoVoiceAntispamCount(Integer videoVoiceAntispamCount) {
        this.videoVoiceAntispamCount = videoVoiceAntispamCount;
        return this;
    }
    public Integer getVideoVoiceAntispamCount() {
        return this.videoVoiceAntispamCount;
    }

    public static class DescribeOssStockStatusResponseBodyBucketList extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Prefixes")
        public java.util.List<String> prefixes;

        @NameInMap("Selected")
        public Boolean selected;

        public static DescribeOssStockStatusResponseBodyBucketList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssStockStatusResponseBodyBucketList self = new DescribeOssStockStatusResponseBodyBucketList();
            return TeaModel.build(map, self);
        }

        public DescribeOssStockStatusResponseBodyBucketList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssStockStatusResponseBodyBucketList setPrefixes(java.util.List<String> prefixes) {
            this.prefixes = prefixes;
            return this;
        }
        public java.util.List<String> getPrefixes() {
            return this.prefixes;
        }

        public DescribeOssStockStatusResponseBodyBucketList setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

}
