// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class APIKeyAuthParameter extends TeaModel {
    @NameInMap("encrypted")
    public Boolean encrypted;

    /**
     * <strong>example:</strong>
     * <p>header</p>
     */
    @NameInMap("in")
    public String in;

    /**
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>mock_value</p>
     */
    @NameInMap("value")
    public String value;

    public static APIKeyAuthParameter build(java.util.Map<String, ?> map) throws Exception {
        APIKeyAuthParameter self = new APIKeyAuthParameter();
        return TeaModel.build(map, self);
    }

    public APIKeyAuthParameter setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public APIKeyAuthParameter setIn(String in) {
        this.in = in;
        return this;
    }
    public String getIn() {
        return this.in;
    }

    public APIKeyAuthParameter setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public APIKeyAuthParameter setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
