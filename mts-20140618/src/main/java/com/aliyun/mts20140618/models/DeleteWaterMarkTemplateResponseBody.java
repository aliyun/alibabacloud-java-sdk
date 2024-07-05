// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeleteWaterMarkTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>030E2671-806A-52AF-A93C-DA8E308603A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the deleted watermark template.</p>
     * 
     * <strong>example:</strong>
     * <p>3780bd69b2b74540bc7b1096f564****</p>
     */
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
