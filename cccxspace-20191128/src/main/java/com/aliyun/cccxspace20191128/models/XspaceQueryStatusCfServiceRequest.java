// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceQueryStatusCfServiceRequest extends TeaModel {
    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static XspaceQueryStatusCfServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceQueryStatusCfServiceRequest self = new XspaceQueryStatusCfServiceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceQueryStatusCfServiceRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
