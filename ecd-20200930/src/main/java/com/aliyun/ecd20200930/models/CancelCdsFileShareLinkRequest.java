// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelCdsFileShareLinkRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("ShareId")
    public String shareId;

    public static CancelCdsFileShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCdsFileShareLinkRequest self = new CancelCdsFileShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelCdsFileShareLinkRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CancelCdsFileShareLinkRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
