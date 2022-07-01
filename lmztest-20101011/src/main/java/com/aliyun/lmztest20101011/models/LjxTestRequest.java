// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class LjxTestRequest extends TeaModel {
    @NameInMap("code")
    public java.util.Map<String, java.io.InputStream> code;

    @NameInMap("id")
    public String id;

    @NameInMap("new-param-1")
    public java.util.List<java.io.InputStream> newParam1;

    @NameInMap("new-param-2")
    public String newParam2;

    public static LjxTestRequest build(java.util.Map<String, ?> map) throws Exception {
        LjxTestRequest self = new LjxTestRequest();
        return TeaModel.build(map, self);
    }

    public LjxTestRequest setCode(java.util.Map<String, java.io.InputStream> code) {
        this.code = code;
        return this;
    }
    public java.util.Map<String, java.io.InputStream> getCode() {
        return this.code;
    }

    public LjxTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LjxTestRequest setNewParam1(java.util.List<java.io.InputStream> newParam1) {
        this.newParam1 = newParam1;
        return this;
    }
    public java.util.List<java.io.InputStream> getNewParam1() {
        return this.newParam1;
    }

    public LjxTestRequest setNewParam2(String newParam2) {
        this.newParam2 = newParam2;
        return this;
    }
    public String getNewParam2() {
        return this.newParam2;
    }

}
