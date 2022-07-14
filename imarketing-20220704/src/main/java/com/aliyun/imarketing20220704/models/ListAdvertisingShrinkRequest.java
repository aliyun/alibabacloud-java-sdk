// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListAdvertisingShrinkRequest extends TeaModel {
    // app
    @NameInMap("App")
    public String appShrink;

    @NameInMap("Dealtype")
    public Integer dealtype;

    @NameInMap("Device")
    public String deviceShrink;

    @NameInMap("Ext")
    public String extShrink;

    // id
    @NameInMap("Id")
    public String id;

    // imp
    @NameInMap("Imp")
    public String impShrink;

    // test
    @NameInMap("Test")
    public Integer test;

    // user
    @NameInMap("User")
    public String userShrink;

    public static ListAdvertisingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAdvertisingShrinkRequest self = new ListAdvertisingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAdvertisingShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public ListAdvertisingShrinkRequest setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
        return this;
    }
    public Integer getDealtype() {
        return this.dealtype;
    }

    public ListAdvertisingShrinkRequest setDeviceShrink(String deviceShrink) {
        this.deviceShrink = deviceShrink;
        return this;
    }
    public String getDeviceShrink() {
        return this.deviceShrink;
    }

    public ListAdvertisingShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public ListAdvertisingShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListAdvertisingShrinkRequest setImpShrink(String impShrink) {
        this.impShrink = impShrink;
        return this;
    }
    public String getImpShrink() {
        return this.impShrink;
    }

    public ListAdvertisingShrinkRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public ListAdvertisingShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
