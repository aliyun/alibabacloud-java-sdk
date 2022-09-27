// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class Tag extends TeaModel {
    @NameInMap("tagKey")
    public String tagKey;

    @NameInMap("tagValue")
    public String tagValue;

    public static Tag build(java.util.Map<String, ?> map) throws Exception {
        Tag self = new Tag();
        return TeaModel.build(map, self);
    }

    public Tag setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public Tag setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

}
