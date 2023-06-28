// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PublishFunctionVersionRequest extends TeaModel {
    @NameInMap("request")
    public PublishVersionInput request;

    public static PublishFunctionVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFunctionVersionRequest self = new PublishFunctionVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishFunctionVersionRequest setRequest(PublishVersionInput request) {
        this.request = request;
        return this;
    }
    public PublishVersionInput getRequest() {
        return this.request;
    }

}
