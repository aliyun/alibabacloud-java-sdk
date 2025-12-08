// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectInfraredLivingFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DetectInfraredLivingFaceRequestTasks> tasks;

    public static DetectInfraredLivingFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectInfraredLivingFaceRequest self = new DetectInfraredLivingFaceRequest();
        return TeaModel.build(map, self);
    }

    public DetectInfraredLivingFaceRequest setTasks(java.util.List<DetectInfraredLivingFaceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DetectInfraredLivingFaceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DetectInfraredLivingFaceRequestTasks extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectInfraredLivingFace/DetectInfraredLivingFace.jpeg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/DetectInfraredLivingFace/DetectInfraredLivingFace.jpeg</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static DetectInfraredLivingFaceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceRequestTasks self = new DetectInfraredLivingFaceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceRequestTasks setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
