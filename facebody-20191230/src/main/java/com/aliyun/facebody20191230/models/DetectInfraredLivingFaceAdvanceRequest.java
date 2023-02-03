// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectInfraredLivingFaceAdvanceRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<DetectInfraredLivingFaceAdvanceRequestTasks> tasks;

    public static DetectInfraredLivingFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectInfraredLivingFaceAdvanceRequest self = new DetectInfraredLivingFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectInfraredLivingFaceAdvanceRequest setTasks(java.util.List<DetectInfraredLivingFaceAdvanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DetectInfraredLivingFaceAdvanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class DetectInfraredLivingFaceAdvanceRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static DetectInfraredLivingFaceAdvanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            DetectInfraredLivingFaceAdvanceRequestTasks self = new DetectInfraredLivingFaceAdvanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public DetectInfraredLivingFaceAdvanceRequestTasks setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
