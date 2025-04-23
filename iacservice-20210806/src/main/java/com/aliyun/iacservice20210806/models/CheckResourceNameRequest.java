// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CheckResourceNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mod-433af53ab7cc71afa</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>p-663a72b75245e3</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static CheckResourceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceNameRequest self = new CheckResourceNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckResourceNameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CheckResourceNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CheckResourceNameRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CheckResourceNameRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
