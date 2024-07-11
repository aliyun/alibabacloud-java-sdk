// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAdaptationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5435****</p>
     */
    @NameInMap("AdaptApplyId")
    public Long adaptApplyId;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAdaptationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdaptationResponseBody self = new CreateAdaptationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdaptationResponseBody setAdaptApplyId(Long adaptApplyId) {
        this.adaptApplyId = adaptApplyId;
        return this;
    }
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    public CreateAdaptationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
