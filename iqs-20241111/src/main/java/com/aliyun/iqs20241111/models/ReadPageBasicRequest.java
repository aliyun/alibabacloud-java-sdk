// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBasicRequest extends TeaModel {
    /**
     * <p>post body</p>
     */
    @NameInMap("body")
    public ReadPageBody body;

    public static ReadPageBasicRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadPageBasicRequest self = new ReadPageBasicRequest();
        return TeaModel.build(map, self);
    }

    public ReadPageBasicRequest setBody(ReadPageBody body) {
        this.body = body;
        return this;
    }
    public ReadPageBody getBody() {
        return this.body;
    }

}
