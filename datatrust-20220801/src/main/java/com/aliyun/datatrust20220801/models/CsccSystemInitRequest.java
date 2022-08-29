// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CsccSystemInitRequest extends TeaModel {
    @NameInMap("ExtendId")
    public String extendId;

    public static CsccSystemInitRequest build(java.util.Map<String, ?> map) throws Exception {
        CsccSystemInitRequest self = new CsccSystemInitRequest();
        return TeaModel.build(map, self);
    }

    public CsccSystemInitRequest setExtendId(String extendId) {
        this.extendId = extendId;
        return this;
    }
    public String getExtendId() {
        return this.extendId;
    }

}
