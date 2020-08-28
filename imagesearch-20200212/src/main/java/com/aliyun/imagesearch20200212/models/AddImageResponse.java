// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20200212.models;

import com.aliyun.tea.*;

public class AddImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("PicInfo")
    @Validation(required = true)
    public AddImageResponsePicInfo picInfo;

    public static AddImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponse self = new AddImageResponse();
        return TeaModel.build(map, self);
    }

    public static class AddImageResponsePicInfo extends TeaModel {
        @NameInMap("CategoryId")
        @Validation(required = true)
        public Integer categoryId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        public static AddImageResponsePicInfo build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponsePicInfo self = new AddImageResponsePicInfo();
            return TeaModel.build(map, self);
        }

    }

}
