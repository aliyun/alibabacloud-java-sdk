// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("URLList")
    public java.util.List<RecognizeActionRequestURLList> URLList;

    @NameInMap("VideoData")
    public byte[] videoData;

    public static RecognizeActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeActionRequest self = new RecognizeActionRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeActionRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public RecognizeActionRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public RecognizeActionRequest setURLList(java.util.List<RecognizeActionRequestURLList> URLList) {
        this.URLList = URLList;
        return this;
    }
    public java.util.List<RecognizeActionRequestURLList> getURLList() {
        return this.URLList;
    }

    public RecognizeActionRequest setVideoData(byte[] videoData) {
        this.videoData = videoData;
        return this;
    }
    public byte[] getVideoData() {
        return this.videoData;
    }

    public static class RecognizeActionRequestURLList extends TeaModel {
        @NameInMap("URL")
        public String URL;

        @NameInMap("imageData")
        public byte[] imageData;

        public static RecognizeActionRequestURLList build(java.util.Map<String, ?> map) throws Exception {
            RecognizeActionRequestURLList self = new RecognizeActionRequestURLList();
            return TeaModel.build(map, self);
        }

        public RecognizeActionRequestURLList setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public RecognizeActionRequestURLList setImageData(byte[] imageData) {
            this.imageData = imageData;
            return this;
        }
        public byte[] getImageData() {
            return this.imageData;
        }

    }

}
