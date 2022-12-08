// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectLivingFaceAdvanceRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<DetectLivingFaceAdvanceRequestTasks> tasks;

    public static DetectLivingFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectLivingFaceAdvanceRequest self = new DetectLivingFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectLivingFaceAdvanceRequest setTasks(java.util.List<DetectLivingFaceAdvanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DetectLivingFaceAdvanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DetectLivingFaceAdvanceRequestTasks extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static DetectLivingFaceAdvanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DetectLivingFaceAdvanceRequestTasks self = new DetectLivingFaceAdvanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DetectLivingFaceAdvanceRequestTasks setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public DetectLivingFaceAdvanceRequestTasks setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
