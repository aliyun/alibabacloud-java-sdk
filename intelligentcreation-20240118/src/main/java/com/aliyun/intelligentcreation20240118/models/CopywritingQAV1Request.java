// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class CopywritingQAV1Request extends TeaModel {
    @NameInMap("body")
    public DigitalHumanLiveBroadcastQACmd body;

    public static CopywritingQAV1Request build(java.util.Map<String, ?> map) throws Exception {
        CopywritingQAV1Request self = new CopywritingQAV1Request();
        return TeaModel.build(map, self);
    }

    public CopywritingQAV1Request setBody(DigitalHumanLiveBroadcastQACmd body) {
        this.body = body;
        return this;
    }
    public DigitalHumanLiveBroadcastQACmd getBody() {
        return this.body;
    }

}
