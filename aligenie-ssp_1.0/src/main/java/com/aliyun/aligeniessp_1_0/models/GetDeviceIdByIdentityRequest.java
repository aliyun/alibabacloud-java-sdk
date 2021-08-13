// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityRequest extends TeaModel {
    // 认证类型，MAC/SN
    @NameInMap("IdentityType")
    public String identityType;

    // 编码类型
    @NameInMap("EncodeType")
    public String encodeType;

    // 认证标识，具体的MAC地址或者SN号
    @NameInMap("IdentityId")
    public String identityId;

    // 产品productKey
    @NameInMap("ProductKey")
    public String productKey;

    // 编码Key
    @NameInMap("EncodeKey")
    public String encodeKey;

    public static GetDeviceIdByIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityRequest self = new GetDeviceIdByIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
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

    public GetDeviceIdByIdentityRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GetDeviceIdByIdentityRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

}
