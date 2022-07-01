// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestRequest extends TeaModel {
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    @NameInMap("Map")
    public java.util.Map<String, ?> map;

    @NameInMap("StrListMap")
    public java.util.List<java.util.Map<String, java.util.Map<String, ?>>> strListMap;

    @NameInMap("codeMap")
    public java.util.Map<String, CodeMapValue> codeMap;

    public static DemoHsfSixTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestRequest self = new DemoHsfSixTestRequest();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestRequest setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public DemoHsfSixTestRequest setMap(java.util.Map<String, ?> map) {
        this.map = map;
        return this;
    }
    public java.util.Map<String, ?> getMap() {
        return this.map;
    }

    public DemoHsfSixTestRequest setStrListMap(java.util.List<java.util.Map<String, java.util.Map<String, ?>>> strListMap) {
        this.strListMap = strListMap;
        return this;
    }
    public java.util.List<java.util.Map<String, java.util.Map<String, ?>>> getStrListMap() {
        return this.strListMap;
    }

    public DemoHsfSixTestRequest setCodeMap(java.util.Map<String, CodeMapValue> codeMap) {
        this.codeMap = codeMap;
        return this;
    }
    public java.util.Map<String, CodeMapValue> getCodeMap() {
        return this.codeMap;
    }

}
