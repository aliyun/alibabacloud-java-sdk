// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UserEntityTag extends TeaModel {
    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("TagValue")
    public String tagValue;

    public static UserEntityTag build(java.util.Map<String, ?> map) throws Exception {
        UserEntityTag self = new UserEntityTag();
        return TeaModel.build(map, self);
    }

    public UserEntityTag setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public UserEntityTag setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
