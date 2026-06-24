// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the resource relationship list. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    @Deprecated
    public Integer page;

    /**
     * <p>The list of instance IDs to query. The value is in JSON array format and can contain up to 20 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;es-cn-aaa&quot;,&quot;es-cn-bbb&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The number of entries per page in Settings for paged query and paging. This field is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    @Deprecated
    public Integer size;

    /**
     * <p>The list of tags to query. The value is in JSON string format and can contain up to 20 items.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;, &quot;value&quot;:&quot;dev&quot;},{&quot;key&quot;:&quot;dev&quot;, &quot;value&quot;:&quot;IT&quot;}]</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    @Deprecated
    public ListTagResourcesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListTagResourcesRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    @Deprecated
    public ListTagResourcesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListTagResourcesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
