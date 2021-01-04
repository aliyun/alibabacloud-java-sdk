// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("Status")
    public String status;

    public static UpdateFlexAccStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccStatusRequest self = new UpdateFlexAccStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexAccStatusRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UpdateFlexAccStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
