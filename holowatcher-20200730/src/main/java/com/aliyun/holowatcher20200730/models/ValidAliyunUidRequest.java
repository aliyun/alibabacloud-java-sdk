// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ValidAliyunUidRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("AliyunUid")
    public String aliyunUid;

    public static ValidAliyunUidRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidAliyunUidRequest self = new ValidAliyunUidRequest();
        return TeaModel.build(map, self);
    }

    public ValidAliyunUidRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ValidAliyunUidRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
