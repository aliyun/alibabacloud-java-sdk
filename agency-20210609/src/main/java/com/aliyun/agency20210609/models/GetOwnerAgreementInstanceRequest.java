// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class GetOwnerAgreementInstanceRequest extends TeaModel {
    // AliyunUid
    @NameInMap("AliyunUid")
    public String aliyunUid;

    public static GetOwnerAgreementInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOwnerAgreementInstanceRequest self = new GetOwnerAgreementInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetOwnerAgreementInstanceRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
