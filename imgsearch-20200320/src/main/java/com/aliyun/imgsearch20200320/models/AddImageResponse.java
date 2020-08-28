// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class AddImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AddImageResponseData data;

    public static AddImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponse self = new AddImageResponse();
        return TeaModel.build(map, self);
    }

    public static class AddImageResponseData extends TeaModel {
        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        public static AddImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddImageResponseData self = new AddImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
