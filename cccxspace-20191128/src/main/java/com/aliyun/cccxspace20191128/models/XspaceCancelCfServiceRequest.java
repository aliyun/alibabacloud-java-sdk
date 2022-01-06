// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class XspaceCancelCfServiceRequest extends TeaModel {
    // A short description of struct
    @NameInMap("SourceOrderId")
    public String sourceOrderId;

    public static XspaceCancelCfServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceCancelCfServiceRequest self = new XspaceCancelCfServiceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceCancelCfServiceRequest setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

}
