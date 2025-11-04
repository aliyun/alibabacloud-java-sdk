// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateChunkRequest extends TeaModel {
    /**
     * <p>The ID of the text chunk to be modified. You can find it in the Node.Metadata._id field returned by <strong>ListChunks</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-5ip55o1zrzxx_09fe52x_table_033b551e10024029992e79767b151fxx_10024xx_0</p>
     */
    @NameInMap("ChunkId")
    public String chunkId;

    /**
     * <p>The file ID, which is the <code>FileId</code> returned by <strong>AddFile</strong>. You can also go to the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page. Click the ID icon next to your file to get its ID.</p>
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
     * <li>true</li>
     * <li>false</li>
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
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by <strong>CreateIndex</strong>. You can also get it on the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/knowledge-base">Knowledge Base</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The new content of the chunk. The content must be between 10 and 6,000 characters in length and cannot exceed the maximum chunk length set when the knowledge base was created.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The new title of the chunk. The title must be 0 to 50 characters in length and can be an empty string. If you specify an empty string, the existing title is cleared. If you do not pass this parameter, the original title remains unchanged.</p>
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
