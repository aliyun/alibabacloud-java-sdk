// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceEndCfServiceRequest extends TeaModel {
    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static XspaceEndCfServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceEndCfServiceRequest self = new XspaceEndCfServiceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceEndCfServiceRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
