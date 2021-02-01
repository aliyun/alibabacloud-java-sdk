// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoRequest extends TeaModel {
    @NameInMap("Tasks")
    public java.util.List<RecognizeLogoRequestTasks> tasks;

    public static RecognizeLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoRequest self = new RecognizeLogoRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeLogoRequest setTasks(java.util.List<RecognizeLogoRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<RecognizeLogoRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class RecognizeLogoRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static RecognizeLogoRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoRequestTasks self = new RecognizeLogoRequestTasks();
            return TeaModel.build(map, self);
        }

        public RecognizeLogoRequestTasks setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
