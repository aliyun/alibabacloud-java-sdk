// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class Field extends TeaModel {
    @NameInMap("BlobValue")
    public String blobValue;

    @NameInMap("BooleanValue")
    public Boolean booleanValue;

    @NameInMap("DoubleValue")
    public Double doubleValue;

    @NameInMap("IsNull")
    public Boolean isNull;

    @NameInMap("LongValue")
    public Long longValue;

    @NameInMap("StringValue")
    public String stringValue;

    public static Field build(java.util.Map<String, ?> map) throws Exception {
        Field self = new Field();
        return TeaModel.build(map, self);
    }

    public Field setBlobValue(String blobValue) {
        this.blobValue = blobValue;
        return this;
    }
    public String getBlobValue() {
        return this.blobValue;
    }

    public Field setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
        return this;
    }
    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public Field setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }
    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public Field setIsNull(Boolean isNull) {
        this.isNull = isNull;
        return this;
    }
    public Boolean getIsNull() {
        return this.isNull;
    }

    public Field setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }
    public Long getLongValue() {
        return this.longValue;
    }

    public Field setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

}
