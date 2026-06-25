// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateConfigResponseBody extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The dynamic parameter name.</p>
     * 
     * <strong>example:</strong>
     * <p>model-config</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    /**
     * <p>The dynamic parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;: &quot;gpt-4&quot;}</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigResponseBody self = new CreateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateConfigResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateConfigResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateConfigResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
