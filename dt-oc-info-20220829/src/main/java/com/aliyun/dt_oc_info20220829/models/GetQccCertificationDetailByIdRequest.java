// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetQccCertificationDetailByIdRequest extends TeaModel {
    @NameInMap("CertId")
    public String certId;

    public static GetQccCertificationDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQccCertificationDetailByIdRequest self = new GetQccCertificationDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetQccCertificationDetailByIdRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

}
