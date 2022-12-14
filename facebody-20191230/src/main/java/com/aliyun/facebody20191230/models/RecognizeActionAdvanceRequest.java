// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizeActionAdvanceRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("URLList")
    public java.util.List<RecognizeActionAdvanceRequestURLList> URLList;

    @NameInMap("VideoData")
    public String videoData;

    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

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

    public RecognizeActionAdvanceRequest setVideoData(String videoData) {
        this.videoData = videoData;
        return this;
    }
    public String getVideoData() {
        return this.videoData;
    }

    public RecognizeActionAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public static class RecognizeActionAdvanceRequestURLList extends TeaModel {
        @NameInMap("URL")
        public java.io.InputStream URLObject;

        @NameInMap("imageData")
        public String imageData;

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

        public RecognizeActionAdvanceRequestURLList setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

    }

}
