// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitiesShrinkRequest extends TeaModel {
    @NameInMap("EncodeKey")
    public String encodeKey;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("IdentityIds")
    public String identityIdsShrink;

    @NameInMap("IdentityType")
    public String identityType;

    @NameInMap("ProductKey")
    public String productKey;

    public static ListDeviceIdByIdentitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceIdByIdentitiesShrinkRequest self = new ListDeviceIdByIdentitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceIdByIdentitiesShrinkRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public ListDeviceIdByIdentitiesShrinkRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public ListDeviceIdByIdentitiesShrinkRequest setIdentityIdsShrink(String identityIdsShrink) {
        this.identityIdsShrink = identityIdsShrink;
        return this;
    }
    public String getIdentityIdsShrink() {
        return this.identityIdsShrink;
    }

    public ListDeviceIdByIdentitiesShrinkRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public ListDeviceIdByIdentitiesShrinkRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
