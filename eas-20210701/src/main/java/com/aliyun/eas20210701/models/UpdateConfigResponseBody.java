// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateConfigResponseBody extends TeaModel {
    /**
     * <p>The time when the dynamic parameter was created. The time is displayed in UTC and follows the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T10:30:00Z</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The name of the dynamic parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_gateway.route_policy</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The time when the dynamic parameter was updated. The time is displayed in UTC and follows the RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15T11:00:00Z</p>
     */
    @NameInMap("UpdatedAt")
    public String updatedAt;

    /**
     * <p>The value of the dynamic parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;model&quot;: &quot;gpt-4-turbo&quot;}</p>
     */
    @NameInMap("Value")
    public String value;

    public static UpdateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigResponseBody self = new UpdateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateConfigResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateConfigResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateConfigResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
