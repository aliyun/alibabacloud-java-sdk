// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class VerifyAdvertisingShrinkRequest extends TeaModel {
    /**
     * <p>app</p>
     */
    @NameInMap("App")
    public String appShrink;

    @NameInMap("Dealtype")
    public Integer dealtype;

    /**
     * <p>device</p>
     */
    @NameInMap("Device")
    public String deviceShrink;

    /**
     * <p>ext</p>
     */
    @NameInMap("Ext")
    public String extShrink;

    /**
     * <p>id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>imp</p>
     */
    @NameInMap("Imp")
    public String impShrink;

    /**
     * <p>test</p>
     */
    @NameInMap("Test")
    public Integer test;

    /**
     * <p>user</p>
     */
    @NameInMap("User")
    public String userShrink;

    @NameInMap("Verifyad")
    public String verifyadShrink;

    public static VerifyAdvertisingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAdvertisingShrinkRequest self = new VerifyAdvertisingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAdvertisingShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public VerifyAdvertisingShrinkRequest setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
        return this;
    }
    public Integer getDealtype() {
        return this.dealtype;
    }

    public VerifyAdvertisingShrinkRequest setDeviceShrink(String deviceShrink) {
        this.deviceShrink = deviceShrink;
        return this;
    }
    public String getDeviceShrink() {
        return this.deviceShrink;
    }

    public VerifyAdvertisingShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public VerifyAdvertisingShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VerifyAdvertisingShrinkRequest setImpShrink(String impShrink) {
        this.impShrink = impShrink;
        return this;
    }
    public String getImpShrink() {
        return this.impShrink;
    }

    public VerifyAdvertisingShrinkRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public VerifyAdvertisingShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

    public VerifyAdvertisingShrinkRequest setVerifyadShrink(String verifyadShrink) {
        this.verifyadShrink = verifyadShrink;
        return this;
    }
    public String getVerifyadShrink() {
        return this.verifyadShrink;
    }

}
