// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterRequest extends TeaModel {
    @NameInMap("CasterName")
    @Validation(required = true)
    public String casterName;

    @NameInMap("SrcCasterId")
    @Validation(required = true)
    public String srcCasterId;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    public static CopyCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterRequest self = new CopyCasterRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public CopyCasterRequest setSrcCasterId(String srcCasterId) {
        this.srcCasterId = srcCasterId;
        return this;
    }
    public String getSrcCasterId() {
        return this.srcCasterId;
    }

    public CopyCasterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
