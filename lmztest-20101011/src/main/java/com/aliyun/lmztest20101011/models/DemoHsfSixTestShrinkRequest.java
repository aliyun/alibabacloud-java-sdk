// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String dataShrink;

    @NameInMap("Map")
    public String mapShrink;

    @NameInMap("StrListMap")
    public String strListMapShrink;

    @NameInMap("codeMap")
    public String codeMapShrink;

    public static DemoHsfSixTestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestShrinkRequest self = new DemoHsfSixTestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public DemoHsfSixTestShrinkRequest setMapShrink(String mapShrink) {
        this.mapShrink = mapShrink;
        return this;
    }
    public String getMapShrink() {
        return this.mapShrink;
    }

    public DemoHsfSixTestShrinkRequest setStrListMapShrink(String strListMapShrink) {
        this.strListMapShrink = strListMapShrink;
        return this;
    }
    public String getStrListMapShrink() {
        return this.strListMapShrink;
    }

    public DemoHsfSixTestShrinkRequest setCodeMapShrink(String codeMapShrink) {
        this.codeMapShrink = codeMapShrink;
        return this;
    }
    public String getCodeMapShrink() {
        return this.codeMapShrink;
    }

}
