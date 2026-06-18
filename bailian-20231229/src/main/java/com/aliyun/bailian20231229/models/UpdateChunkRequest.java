// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateChunkRequest extends TeaModel {
    /**
     * <p>The ID of the text chunk to modify. You can obtain this value by calling the <strong>ListChunks</strong> operation. The value is in the Node.Metadata._id field of the response.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-5ip55o1zrzxx_09fe52x_xxxxx_033b551e10024029992e79767b151fxx_10024xx_0</p>
     */
    @NameInMap("ChunkId")
    public String chunkId;

    /**
     * <p>The file ID. This is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. You can also obtain it from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab in the Model Studio console by clicking the ID icon next to the corresponding file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>doc_c134aa2073204a5d936d870bf960f56axxxxxxxx</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>Specifies whether this text chunk participates in knowledge base retrieval. Valid values:</p>
     * <ul>
     * <li>true: Participates.</li>
     * <li>false: Does not participate.</li>
     * </ul>
     * <p>Default value: true.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDisplayedChunkContent")
    public Boolean isDisplayedChunkContent;

    /**
     * <p>The knowledge base ID. This is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation, or you can obtain it from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/knowledge-base">Knowledge Base</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/knowledge-base">Knowledge Base</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The new content of the text chunk. The content length must be between 10 and 6000 characters and cannot exceed the maximum segment length specified when the knowledge base was created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>在哲学中所获得的确定性类型不是科学的确定性(即对每个人的理智来说都一样的确定性)，而是一种要在人类的整体本质中才能获得的亲证。哲学的每一形态都不同于科学，因为所有的哲学都没有得到一致的认可...</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The new title of the text chunk. The length is limited to 0 to 50 characters. An empty string is allowed. If you pass an empty string, the existing title is cleared. If you do not pass this parameter, the original title is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>什么是哲学</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateChunkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChunkRequest self = new UpdateChunkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChunkRequest setChunkId(String chunkId) {
        this.chunkId = chunkId;
        return this;
    }
    public String getChunkId() {
        return this.chunkId;
    }

    public UpdateChunkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateChunkRequest setIsDisplayedChunkContent(Boolean isDisplayedChunkContent) {
        this.isDisplayedChunkContent = isDisplayedChunkContent;
        return this;
    }
    public Boolean getIsDisplayedChunkContent() {
        return this.isDisplayedChunkContent;
    }

    public UpdateChunkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public UpdateChunkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateChunkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
