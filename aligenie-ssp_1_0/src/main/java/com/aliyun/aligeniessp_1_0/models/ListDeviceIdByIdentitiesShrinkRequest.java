// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitiesShrinkRequest extends TeaModel {
    // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
    @NameInMap("EncodeKey")
    public String encodeKey;

    // 编码类型，此处填写“PROJECT_ID”
    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("IdentityIds")
    public String identityIdsShrink;

    // 填写设备认证类型，“MAC”或者“SN”
    @NameInMap("IdentityType")
    public String identityType;

    // 产品唯一标志符productKey，在天猫精灵AI平台中创建产品时，平台颁发的全局唯一标识。
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
