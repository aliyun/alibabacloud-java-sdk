// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLSkewedInfo extends TeaModel {
    @NameInMap("SkewedColNames")
    public java.util.List<String> skewedColNames;

    /**
     * <strong>example:</strong>
     * <p>{“col1”:&quot;val1&quot;}</p>
     */
    @NameInMap("SkewedColValueLocationMaps")
    public java.util.Map<String, ?> skewedColValueLocationMaps;

    @NameInMap("SkewedColValues")
    public java.util.List<java.util.List<String>> skewedColValues;

    public static DLSkewedInfo build(java.util.Map<String, ?> map) throws Exception {
        DLSkewedInfo self = new DLSkewedInfo();
        return TeaModel.build(map, self);
    }

    public DLSkewedInfo setSkewedColNames(java.util.List<String> skewedColNames) {
        this.skewedColNames = skewedColNames;
        return this;
    }
    public java.util.List<String> getSkewedColNames() {
        return this.skewedColNames;
    }

    public DLSkewedInfo setSkewedColValueLocationMaps(java.util.Map<String, ?> skewedColValueLocationMaps) {
        this.skewedColValueLocationMaps = skewedColValueLocationMaps;
        return this;
    }
    public java.util.Map<String, ?> getSkewedColValueLocationMaps() {
        return this.skewedColValueLocationMaps;
    }

    public DLSkewedInfo setSkewedColValues(java.util.List<java.util.List<String>> skewedColValues) {
        this.skewedColValues = skewedColValues;
        return this;
    }
    public java.util.List<java.util.List<String>> getSkewedColValues() {
        return this.skewedColValues;
    }

}
