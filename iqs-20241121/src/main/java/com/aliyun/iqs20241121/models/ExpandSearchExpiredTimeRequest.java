// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ExpandSearchExpiredTimeRequest extends TeaModel {
    @NameInMap("body")
    public ExpendExpiredTimeRequest body;

    public static ExpandSearchExpiredTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExpandSearchExpiredTimeRequest self = new ExpandSearchExpiredTimeRequest();
        return TeaModel.build(map, self);
    }

    public ExpandSearchExpiredTimeRequest setBody(ExpendExpiredTimeRequest body) {
        this.body = body;
        return this;
    }
    public ExpendExpiredTimeRequest getBody() {
        return this.body;
    }

}
