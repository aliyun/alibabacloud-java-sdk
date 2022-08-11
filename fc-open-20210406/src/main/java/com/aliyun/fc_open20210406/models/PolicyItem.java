// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PolicyItem extends TeaModel {
    @NameInMap("key")
    public byte[] key;

    @NameInMap("operator")
    public byte[] operator;

    @NameInMap("type")
    public byte[] type;

    @NameInMap("value")
    public byte[] value;

    public static PolicyItem build(java.util.Map<String, ?> map) throws Exception {
        PolicyItem self = new PolicyItem();
        return TeaModel.build(map, self);
    }

    public PolicyItem setKey(byte[] key) {
        this.key = key;
        return this;
    }
    public byte[] getKey() {
        return this.key;
    }

    public PolicyItem setOperator(byte[] operator) {
        this.operator = operator;
        return this;
    }
    public byte[] getOperator() {
        return this.operator;
    }

    public PolicyItem setType(byte[] type) {
        this.type = type;
        return this;
    }
    public byte[] getType() {
        return this.type;
    }

    public PolicyItem setValue(byte[] value) {
        this.value = value;
        return this;
    }
    public byte[] getValue() {
        return this.value;
    }

}
