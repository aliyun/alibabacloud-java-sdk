// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCreditInfoRequest extends TeaModel {
    /**
     * <p>Sub Account UID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1792155717328010</p>
     */
    @NameInMap("Uid")
    public Long uid;

    public static GetCreditInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreditInfoRequest self = new GetCreditInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetCreditInfoRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
