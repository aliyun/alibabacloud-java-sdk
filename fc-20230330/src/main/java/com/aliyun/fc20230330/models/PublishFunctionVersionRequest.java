// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PublishFunctionVersionRequest extends TeaModel {
    /**
     * <p>The information about the function version.</p>
     */
    @NameInMap("body")
    public PublishVersionInput body;

    public static PublishFunctionVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFunctionVersionRequest self = new PublishFunctionVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishFunctionVersionRequest setBody(PublishVersionInput body) {
        this.body = body;
        return this;
    }
    public PublishVersionInput getBody() {
        return this.body;
    }

}
