// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListPptTemplatesRequest extends TeaModel {
    /**
     * <p>The career ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CareerId")
    public Integer careerId;

    /**
     * <p>The color ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ColourId")
    public Integer colourId;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>暂不支持修改，固定为10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>+CBOXvu2YLxC6DOua8Qupg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The template scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("SceneId")
    public Integer sceneId;

    /**
     * <p>The style ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StyleId")
    public Integer styleId;

    /**
     * <p>The workspace ID.</p>
     * 
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
