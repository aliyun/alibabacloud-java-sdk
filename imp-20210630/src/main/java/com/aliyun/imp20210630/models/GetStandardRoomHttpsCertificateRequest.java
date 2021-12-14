// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomHttpsCertificateRequest extends TeaModel {
    // 证书ID
    @NameInMap("CertificateId")
    public String certificateId;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static GetStandardRoomHttpsCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomHttpsCertificateRequest self = new GetStandardRoomHttpsCertificateRequest();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomHttpsCertificateRequest setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public GetStandardRoomHttpsCertificateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
