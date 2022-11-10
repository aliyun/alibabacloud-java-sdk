// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionAdvanceRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("URLList")
    public java.util.List<RecognizeActionAdvanceRequestURLList> URLList;

    @NameInMap("VideoData")
    public byte[] videoData;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static RecognizeActionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionAdvanceRequest self = new RecognizeActionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeActionAdvanceRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public RecognizeActionAdvanceRequest setURLList(java.util.List<RecognizeActionAdvanceRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<RecognizeActionAdvanceRequestURLList> getURLList() {
        return this.URLList;
    }

    public RecognizeActionAdvanceRequest setVideoData(byte[] videoData) {
        this.videoData = videoData;
        return this;
    }
    public byte[] getVideoData() {
        return this.videoData;
    }

    public RecognizeActionAdvanceRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class RecognizeActionAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        @NameInMap("imageData")
        public byte[] imageData;

        public static RecognizeActionAdvanceRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionAdvanceRequestURLList self = new RecognizeActionAdvanceRequestURLList();
            return TeaModel.build(map, self);
        }

        public RecognizeActionAdvanceRequestURLList setURLObject(java.io.InputStream URLObject) {
            this.URLObject = URLObject;
            return this;
        }
        public java.io.InputStream getURLObject() {
            return this.URLObject;
        }

        public RecognizeActionAdvanceRequestURLList setImageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }
        public byte[] getImageData() {
            return this.imageData;
        }

    }

}
