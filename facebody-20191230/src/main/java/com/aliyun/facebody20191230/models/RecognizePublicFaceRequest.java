// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RecognizePublicFaceRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("Task")
    public java.util.List<RecognizePublicFaceRequestTask> task;

    public static RecognizePublicFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePublicFaceRequest self = new RecognizePublicFaceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePublicFaceRequest setTask(java.util.List<RecognizePublicFaceRequestTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<RecognizePublicFaceRequestTask> getTask() {
        return this.task;
    }

    public static class RecognizePublicFaceRequestTask extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        @NameInMap("ImageURL")
        public String imageURL;

        public static RecognizePublicFaceRequestTask build(java.util.Map<String, ?> map) throws Exception {
            RecognizePublicFaceRequestTask self = new RecognizePublicFaceRequestTask();
            return TeaModel.build(map, self);
        }

        public RecognizePublicFaceRequestTask setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public RecognizePublicFaceRequestTask setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
