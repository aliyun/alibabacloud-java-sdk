// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddChunkShrinkRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>doc_xxx</p>
     */
    @NameInMap("dataId")
    public String dataId;

    /**
     * <p>The chunk content to insert, passed as key-value pairs. For document search knowledge bases, use the following fixed key list:</p>
     * <ul>
     * <li>content (<strong>String</strong>): <strong>Required</strong>. The body content of the chunk.</li>
     * <li>title (<strong>String</strong>): <strong>Optional</strong>. The title of the chunk.</li>
     * <li>image_urls (<strong>Array</strong>): <strong>Optional</strong>. Image URLs contained in the chunk. A maximum of 10 images are supported.</li>
     * </ul>
     * <p>For data query and image Q&amp;A knowledge bases, the keys are not fixed and are determined by the data source spreadsheet of the knowledge base. The key is the Excel column header, and the value is the corresponding column value.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;content&quot;: &quot;The Bailian platform supports parsing multiple document formats including PDF, Word, and PPT.&quot;,
     *   &quot;title&quot;: &quot;Document Parsing and Chunking&quot;,
     *   &quot;image_urls&quot;: [
     * &quot;<a href="https://example.com/images/chunk-flow.png">https://example.com/images/chunk-flow.png</a>&quot;,
     *   &quot;<a href="https://example.com/images/parsing-result.png">https://example.com/images/parsing-result.png</a>&quot;
     *   ]
     * }</p>
     */
    @NameInMap("field")
    public String fieldShrink;

    public static AddChunkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChunkShrinkRequest self = new AddChunkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddChunkShrinkRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public AddChunkShrinkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public AddChunkShrinkRequest setFieldShrink(String fieldShrink) {
        this.fieldShrink = fieldShrink;
        return this;
    }
    public String getFieldShrink() {
        return this.fieldShrink;
    }

}
