// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeepfakeFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>/9j/4AAQSkZJRgABAQAAAQABAAD/2****</p>
         */
        @NameInMap("ImageData")
        public String imageData;

        /**
         * <strong>example:</strong>
         * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DeepfakeFace/DeepfakeFace1.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DeepfakeFace/DeepfakeFace1.jpg</a></p>
         */
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
