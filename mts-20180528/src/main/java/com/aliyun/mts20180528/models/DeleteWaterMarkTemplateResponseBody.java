// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class DeleteWaterMarkTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaterMarkTemplateId")
    public String waterMarkTemplateId;

    public static DeleteWaterMarkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWaterMarkTemplateResponseBody self = new DeleteWaterMarkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWaterMarkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteWaterMarkTemplateResponseBody setWaterMarkTemplateId(String waterMarkTemplateId) {
        this.waterMarkTemplateId = waterMarkTemplateId;
        return this;
    }
    public String getWaterMarkTemplateId() {
        return this.waterMarkTemplateId;
    }

}
