// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ImitatePhotoStyleResponseData data;

    public static ImitatePhotoStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleResponse self = new ImitatePhotoStyleResponse();
        return TeaModel.build(map, self);
    }

    public static class ImitatePhotoStyleResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static ImitatePhotoStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImitatePhotoStyleResponseData self = new ImitatePhotoStyleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
