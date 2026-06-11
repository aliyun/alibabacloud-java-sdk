// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UploadDocumentShrinkRequest extends TeaModel {
    /**
     * <p>The number of overlapping characters between adjacent chunks. This value cannot exceed <code>ChunkSize</code>. The default is 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChunkOverlap")
    public Long chunkOverlap;

    /**
     * <p>The size of each document chunk. The default is 250, and the maximum is 2,048.</p>
     * 
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("ChunkSize")
    public Long chunkSize;

    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the document loader. The default is <code>ADBPGLoader</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ADBPGLoader</p>
     */
    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    /**
     * <p>The name of the document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The ID of the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>The OSS location of the input file. Construct this path by appending the file name to the <code>UploadDir</code> value returned by the <code>DescribeKnowledgeBaseUploadSignature</code> operation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>An array of strings used to split text.</p>
     * <blockquote>
     * <ul>
     * <li><p>This critical parameter affects data chunking results and is related to the splitter specified by <code>TextSplitterName</code>.</p>
     * </li>
     * <li><p>In most cases, you can omit this parameter. The service automatically assigns default separators based on <code>TextSplitterName</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("Separators")
    public String separatorsShrink;

    /**
     * <p>The splitter model to use. The default is <code>qwen3-8b</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-8b</p>
     */
    @NameInMap("SplitterModel")
    public String splitterModel;

    /**
     * <p>The name of the text splitter.</p>
     * 
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitterName")
    public String textSplitterName;

    /**
     * <p>Specifies whether to enable visual-linguistic (VL) enhanced content recognition for complex documents. The default is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlEnhance")
    public Boolean vlEnhance;

    /**
     * <p>Specifies whether to enable title enhancement.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZhTitleEnhance")
    public Boolean zhTitleEnhance;

    public static UploadDocumentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentShrinkRequest self = new UploadDocumentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentShrinkRequest setChunkOverlap(Long chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Long getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentShrinkRequest setChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Long getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadDocumentShrinkRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentShrinkRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public UploadDocumentShrinkRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UploadDocumentShrinkRequest setSeparatorsShrink(String separatorsShrink) {
        this.separatorsShrink = separatorsShrink;
        return this;
    }
    public String getSeparatorsShrink() {
        return this.separatorsShrink;
    }

    public UploadDocumentShrinkRequest setSplitterModel(String splitterModel) {
        this.splitterModel = splitterModel;
        return this;
    }
    public String getSplitterModel() {
        return this.splitterModel;
    }

    public UploadDocumentShrinkRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentShrinkRequest setVlEnhance(Boolean vlEnhance) {
        this.vlEnhance = vlEnhance;
        return this;
    }
    public Boolean getVlEnhance() {
        return this.vlEnhance;
    }

    public UploadDocumentShrinkRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
