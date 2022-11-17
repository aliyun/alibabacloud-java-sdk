// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class MapFlatArratStringCopyCopyValue extends TeaModel {
    @NameInMap("Vist")
    public java.util.Map<String, MapFlatArratStringCopyCopyValueVistValue> vist;

    public static MapFlatArratStringCopyCopyValue build(java.util.Map<String, ?> map) throws Exception {
        MapFlatArratStringCopyCopyValue self = new MapFlatArratStringCopyCopyValue();
        return TeaModel.build(map, self);
    }

    public MapFlatArratStringCopyCopyValue setVist(java.util.Map<String, MapFlatArratStringCopyCopyValueVistValue> vist) {
        this.vist = vist;
        return this;
    }
    public java.util.Map<String, MapFlatArratStringCopyCopyValueVistValue> getVist() {
        return this.vist;
    }

}
