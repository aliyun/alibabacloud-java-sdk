// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SkewedInfo extends TeaModel {
    // SkewedColNames
    @NameInMap("SkewedColNames")
    public java.util.List<String> skewedColNames;

    // SkewedColValueLocationMaps
    @NameInMap("SkewedColValueLocationMaps")
    public java.util.Map<String, String> skewedColValueLocationMaps;

    // SkewedColValueLocationMaps
    @NameInMap("SkewedColValues")
    public java.util.List<java.util.List<String>> skewedColValues;

    public static SkewedInfo build(java.util.Map<String, ?> map) throws Exception {
        SkewedInfo self = new SkewedInfo();
        return TeaModel.build(map, self);
    }

    public SkewedInfo setSkewedColNames(java.util.List<String> skewedColNames) {
        this.skewedColNames = skewedColNames;
        return this;
    }
    public java.util.List<String> getSkewedColNames() {
        return this.skewedColNames;
    }

    public SkewedInfo setSkewedColValueLocationMaps(java.util.Map<String, String> skewedColValueLocationMaps) {
        this.skewedColValueLocationMaps = skewedColValueLocationMaps;
        return this;
    }
    public java.util.Map<String, String> getSkewedColValueLocationMaps() {
        return this.skewedColValueLocationMaps;
    }

    public SkewedInfo setSkewedColValues(java.util.List<java.util.List<String>> skewedColValues) {
        this.skewedColValues = skewedColValues;
        return this;
    }
    public java.util.List<java.util.List<String>> getSkewedColValues() {
        return this.skewedColValues;
    }

}
