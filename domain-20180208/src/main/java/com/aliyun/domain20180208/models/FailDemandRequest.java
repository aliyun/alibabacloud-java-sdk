// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class FailDemandRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("Message")
    public String message;

    public static FailDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        FailDemandRequest self = new FailDemandRequest();
        return TeaModel.build(map, self);
    }

    public FailDemandRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public FailDemandRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
