// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    /**
     * <p>标签键。必填参数，不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或https://。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>标签值。非必填，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。</p>
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
