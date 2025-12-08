// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeepfakeFaceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DeepfakeFaceAdvanceRequestTasks> tasks;

    public static DeepfakeFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeFaceAdvanceRequest self = new DeepfakeFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DeepfakeFaceAdvanceRequest setTasks(java.util.List<DeepfakeFaceAdvanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DeepfakeFaceAdvanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DeepfakeFaceAdvanceRequestTasks extends TeaModel {
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
        public java.io.InputStream imageURLObject;

        public static DeepfakeFaceAdvanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DeepfakeFaceAdvanceRequestTasks self = new DeepfakeFaceAdvanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DeepfakeFaceAdvanceRequestTasks setImageData(String imageData) {
            this.imageData = imageData;
            return this;
        }
        public String getImageData() {
            return this.imageData;
        }

        public DeepfakeFaceAdvanceRequestTasks setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
