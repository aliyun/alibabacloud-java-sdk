// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityRequest extends TeaModel {
    @NameInMap("EncodeKey")
    public String encodeKey;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("ProductKey")
    public String productKey;

    public static GetDeviceIdByIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityRequest self = new GetDeviceIdByIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public GetDeviceIdByIdentityRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public GetDeviceIdByIdentityRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public GetDeviceIdByIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public GetDeviceIdByIdentityRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
