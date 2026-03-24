// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListPublicBroadcastSceneTemplatesRequest extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <strong>example:</strong>
     * <p>AI,BROADCAST</p>
     */
    @NameInMap("tags")
    public String tags;

    public static ListPublicBroadcastSceneTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublicBroadcastSceneTemplatesRequest self = new ListPublicBroadcastSceneTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublicBroadcastSceneTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPublicBroadcastSceneTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicBroadcastSceneTemplatesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListPublicBroadcastSceneTemplatesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListPublicBroadcastSceneTemplatesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
