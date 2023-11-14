// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeepfakeFaceRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<DeepfakeFaceRequestTasks> tasks;

    public static DeepfakeFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeFaceRequest self = new DeepfakeFaceRequest();
        return TeaModel.build(map, self);
    }

    public DeepfakeFaceRequest setTasks(java.util.List<DeepfakeFaceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DeepfakeFaceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DeepfakeFaceRequestTasks extends TeaModel {
        @NameInMap("ImageData")
        public String imageData;

        @NameInMap("ImageURL")
        public String imageURL;

        public static DeepfakeFaceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceRequestTasks self = new DeepfakeFaceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceRequestTasks setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public DeepfakeFaceRequestTasks setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
