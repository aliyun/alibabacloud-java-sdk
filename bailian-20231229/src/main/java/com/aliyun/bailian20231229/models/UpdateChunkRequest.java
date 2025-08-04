// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateChunkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-5ip55o1zrzxx_09fe52x_table_033b551e10024029992e79767b151fxx_10024xx_0</p>
     */
    @NameInMap("ChunkId")
    public String chunkId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>doc_c134aa2073204a5d936d870bf960f56axxxxxxxx</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDisplayedChunkContent")
    public Boolean isDisplayedChunkContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

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
