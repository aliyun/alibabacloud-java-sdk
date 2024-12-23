// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>Specifies the marker after which the returned list begins.</p>
     * 
     * <strong>example:</strong>
     * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxItem")
    public Integer maxItem;

    /**
     * <p>The name of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>res</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the schema.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("schemaName")
    public String schemaName;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListResourcesRequest setMaxItem(Integer maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Integer getMaxItem() {
        return this.maxItem;
    }

    public ListResourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourcesRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
