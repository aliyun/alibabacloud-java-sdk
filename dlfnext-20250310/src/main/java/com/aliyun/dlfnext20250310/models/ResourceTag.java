// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ResourceTag extends TeaModel {
    /**
     * <p>The tag key, up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>team</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The tag value, up to 256 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>recommendation</p>
     */
    @NameInMap("value")
    public String value;

    public static ResourceTag build(java.util.Map<String, ?> map) throws Exception {
        ResourceTag self = new ResourceTag();
        return TeaModel.build(map, self);
    }

    public ResourceTag setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ResourceTag setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
