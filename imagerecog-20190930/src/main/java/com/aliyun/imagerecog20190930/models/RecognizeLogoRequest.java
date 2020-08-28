// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeLogoRequest extends TeaModel {
    @NameInMap("Tasks")
    @Validation(required = true)
    public java.util.List<RecognizeLogoRequestTasks> tasks;

    public static RecognizeLogoRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLogoRequest self = new RecognizeLogoRequest();
        return TeaModel.build(map, self);
    }

    public static class RecognizeLogoRequestTasks extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static RecognizeLogoRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLogoRequestTasks self = new RecognizeLogoRequestTasks();
            return TeaModel.build(map, self);
        }

    }

}
