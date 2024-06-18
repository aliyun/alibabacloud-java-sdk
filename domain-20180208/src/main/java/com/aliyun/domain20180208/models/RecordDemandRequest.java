// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RecordDemandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SE20183A0Q7C5556</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>some message</p>
     */
    @NameInMap("Message")
    public String message;

    public static RecordDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordDemandRequest self = new RecordDemandRequest();
        return TeaModel.build(map, self);
    }

    public RecordDemandRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RecordDemandRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
