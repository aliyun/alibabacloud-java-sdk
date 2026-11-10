// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRegistryNamespacesRequest extends TeaModel {
    /**
     * <p>The search keyword. Fuzzy match is supported for workspace names.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The number of entries per page for a paging query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>hg7nXVngyM6tQtvCagmtY=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The workspace type. Valid values:</p>
     * <ul>
     * <li>system: public workspace</li>
     * <li>self: custom workspace</li>
     * <li>shared: shared workspace</li>
     * <li>community: community workspace
     * By default, all types are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>self</p>
     */
    @NameInMap("type")
    public String type;

    public static ListRegistryNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistryNamespacesRequest self = new ListRegistryNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistryNamespacesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRegistryNamespacesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRegistryNamespacesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRegistryNamespacesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
