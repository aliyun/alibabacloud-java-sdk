// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetPartnerByUidRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    public static GetPartnerByUidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerByUidRequest self = new GetPartnerByUidRequest();
        return TeaModel.build(map, self);
    }

    public GetPartnerByUidRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
