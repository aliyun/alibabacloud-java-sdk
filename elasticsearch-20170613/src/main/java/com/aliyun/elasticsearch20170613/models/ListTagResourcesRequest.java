// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>1d2db86sca4384811e0b5e8707e\<em>\</em>\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    @Deprecated
    public Integer page;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;es-cn-aaa&quot;,&quot;es-cn-bbb&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;,&quot;dev&quot;},{&quot;key&quot;:&quot;dev&quot;, &quot;value&quot;:&quot;IT&quot;}]</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>[&quot;es-cn-aaa&quot;,&quot;es-cn-bbb&quot;]</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    @Deprecated
    public Integer size;

    /**
     * <p>The header of the response. This parameter is empty and is for reference only. You cannot force this parameter to be relied on in the program.</p>
     * <blockquote>
     * <p> The return examples does not contain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;,&quot;dev&quot;},{&quot;key&quot;:&quot;dev&quot;,  &quot;value&quot;:&quot;IT&quot;}]</p>
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
