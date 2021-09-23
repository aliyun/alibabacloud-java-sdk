// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Row extends TeaModel {
    // URI
    @NameInMap("URI")
    public String URI;

    // CustomLabels
    @NameInMap("CustomLabels")
    public java.util.List<KeyValuePair> customLabels;

    public static Row build(java.util.Map<String, ?> map) throws Exception {
        Row self = new Row();
        return TeaModel.build(map, self);
    }

    public Row setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

    public Row setCustomLabels(java.util.List<KeyValuePair> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.List<KeyValuePair> getCustomLabels() {
        return this.customLabels;
    }

}
