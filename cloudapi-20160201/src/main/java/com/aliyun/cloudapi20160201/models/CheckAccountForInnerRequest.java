// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAccountForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    public static CheckAccountForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountForInnerRequest self = new CheckAccountForInnerRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

}
