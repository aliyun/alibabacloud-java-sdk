// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class KeyFilterItem extends TeaModel {
    @NameInMap("Regex")
    public java.util.List<String> regex;

    public static KeyFilterItem build(java.util.Map<String, ?> map) throws Exception {
        KeyFilterItem self = new KeyFilterItem();
        return TeaModel.build(map, self);
    }

    public KeyFilterItem setRegex(java.util.List<String> regex) {
        this.regex = regex;
        return this;
    }
    public java.util.List<String> getRegex() {
        return this.regex;
    }

}
