// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceAdvanceRequest extends TeaModel {
    @NameInMap("Task")
    public java.util.List<RecognizePublicFaceAdvanceRequestTask> task;

    public static RecognizePublicFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceAdvanceRequest self = new RecognizePublicFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceAdvanceRequest setTask(java.util.List<RecognizePublicFaceAdvanceRequestTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<RecognizePublicFaceAdvanceRequestTask> getTask() {
        return this.task;
    }

    public static class RecognizePublicFaceAdvanceRequestTask extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static RecognizePublicFaceAdvanceRequestTask build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceAdvanceRequestTask self = new RecognizePublicFaceAdvanceRequestTask();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceAdvanceRequestTask setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public RecognizePublicFaceAdvanceRequestTask setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
