// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    /**
     * <p>The key of the tag. This parameter is required and cannot be an empty string. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>department</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The value of the tag This parameter is optional and can be an empty string. The value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>IT</p>
     */
    @NameInMap("Value")
    public String value;

    public static Tag build(java.util.Map<String, ?> map) throws Exception {
        Tag self = new Tag();
        return TeaModel.build(map, self);
    }

    public Tag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Tag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
