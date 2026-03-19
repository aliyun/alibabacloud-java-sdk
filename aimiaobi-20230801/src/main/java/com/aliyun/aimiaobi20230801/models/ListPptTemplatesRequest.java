// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CareerId")
    public Integer careerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ColourId")
    public Integer colourId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>+CBOXvu2YLxC6DOua8Qupg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("SceneId")
    public Integer sceneId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StyleId")
    public Integer styleId;

    /**
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListPptTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPptTemplatesRequest self = new ListPptTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPptTemplatesRequest setCareerId(Integer careerId) {
        this.careerId = careerId;
        return this;
    }
    public Integer getCareerId() {
        return this.careerId;
    }

    public ListPptTemplatesRequest setColourId(Integer colourId) {
        this.colourId = colourId;
        return this;
    }
    public Integer getColourId() {
        return this.colourId;
    }

    public ListPptTemplatesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPptTemplatesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPptTemplatesRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

    public ListPptTemplatesRequest setStyleId(Integer styleId) {
        this.styleId = styleId;
        return this;
    }
    public Integer getStyleId() {
        return this.styleId;
    }

    public ListPptTemplatesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
