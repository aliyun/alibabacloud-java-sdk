// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class Address extends TeaModel {
    @NameInMap("Codes")
    public java.util.List<String> codes;

    @NameInMap("Id")
    public String id;

    @NameInMap("Map")
    public java.util.Map<String, String> map;

    @NameInMap("UserName")
    public String userName;

    public static Address build(java.util.Map<String, ?> map) throws Exception {
        Address self = new Address();
        return TeaModel.build(map, self);
    }

    public Address setCodes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<String> getCodes() {
        return this.codes;
    }

    public Address setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Address setMap(java.util.Map<String, String> map) {
        this.map = map;
        return this;
    }
    public java.util.Map<String, String> getMap() {
        return this.map;
    }

    public Address setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
