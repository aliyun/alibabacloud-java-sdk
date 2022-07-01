// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class RpcHttpRequest extends TeaModel {
    @NameInMap("Codes")
    public String codes;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Number")
    public String number;

    public static RpcHttpRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcHttpRequest self = new RpcHttpRequest();
        return TeaModel.build(map, self);
    }

    public RpcHttpRequest setCodes(String codes) {
        this.codes = codes;
        return this;
    }
    public String getCodes() {
        return this.codes;
    }

    public RpcHttpRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RpcHttpRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RpcHttpRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
