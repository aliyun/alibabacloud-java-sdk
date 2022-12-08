// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<DetectLivingFaceRequestTasks> tasks;

    public static DetectLivingFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLivingFaceRequest self = new DetectLivingFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectLivingFaceRequest setTasks(java.util.List<DetectLivingFaceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DetectLivingFaceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DetectLivingFaceRequestTasks extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        @NameInMap("ImageURL")
        public String imageURL;

        public static DetectLivingFaceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceRequestTasks self = new DetectLivingFaceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceRequestTasks setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public DetectLivingFaceRequestTasks setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
