// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Namespace extends TeaModel {
    /**
     * <p>The creation time, represented as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1741266704867</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The user who created the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:1234567:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <p>The namespace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace_id</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The storage path of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://example-bucket/example-namespace/</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The extension options for the namespace.</p>
     */
    @NameInMap("options")
    public java.util.Map<String, String> options;

    /**
     * <p>The namespace owner.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:1234567:root</p>
     */
    @NameInMap("owner")
    public String owner;

    /**
     * <p>The update time, represented as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1741266704867</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <p>The user who updated the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram:1045689747920334:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Namespace build(java.util.Map<String, ?> map) throws Exception {
        Namespace self = new Namespace();
        return TeaModel.build(map, self);
    }

    public Namespace setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Namespace setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Namespace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Namespace setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public Namespace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Namespace setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public Namespace setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public Namespace setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Namespace setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
