// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<java.util.Map<String, String>> data;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static DemoHsfSixTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestResponseBody self = new DemoHsfSixTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DemoHsfSixTestResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public DemoHsfSixTestResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoHsfSixTestResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
