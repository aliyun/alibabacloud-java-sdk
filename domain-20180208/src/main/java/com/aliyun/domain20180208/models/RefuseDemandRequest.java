// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RefuseDemandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SE20183A0Q7C5556</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>some message</p>
     */
    @NameInMap("Message")
    public String message;

    public static RefuseDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseDemandRequest self = new RefuseDemandRequest();
        return TeaModel.build(map, self);
    }

    public RefuseDemandRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RefuseDemandRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
