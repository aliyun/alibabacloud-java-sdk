// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoAdvanceRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<RecognizeLogoAdvanceRequestTasks> tasks;

    public static RecognizeLogoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoAdvanceRequest self = new RecognizeLogoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeLogoAdvanceRequest setTasks(java.util.List<RecognizeLogoAdvanceRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<RecognizeLogoAdvanceRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class RecognizeLogoAdvanceRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        public java.io.InputStream imageURLObject;

        public static RecognizeLogoAdvanceRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoAdvanceRequestTasks self = new RecognizeLogoAdvanceRequestTasks();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoAdvanceRequestTasks setImageURLObject(java.io.InputStream imageURLObject) {
            this.imageURLObject = imageURLObject;
            return this;
        }
        public java.io.InputStream getImageURLObject() {
            return this.imageURLObject;
        }

    }

}
