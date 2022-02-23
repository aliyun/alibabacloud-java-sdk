// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GetAliyunAccountWithBindTaobaoHidResponseBody extends TeaModel {
    @NameInMap("PK")
    public String PK;

    @NameInMap("PartnerPk")
    public String partnerPk;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAliyunAccountWithBindTaobaoHidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunAccountWithBindTaobaoHidResponseBody self = new GetAliyunAccountWithBindTaobaoHidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliyunAccountWithBindTaobaoHidResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public GetAliyunAccountWithBindTaobaoHidResponseBody setPartnerPk(String partnerPk) {
        this.partnerPk = partnerPk;
        return this;
    }
    public String getPartnerPk() {
        return this.partnerPk;
    }

    public GetAliyunAccountWithBindTaobaoHidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
