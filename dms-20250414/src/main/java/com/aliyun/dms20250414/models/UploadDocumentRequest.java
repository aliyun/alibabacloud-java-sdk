// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UploadDocumentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ChunkOverlap")
    public Long chunkOverlap;

    /**
     * <strong>example:</strong>
     * <p>250</p>
     */
    @NameInMap("ChunkSize")
    public Long chunkSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>ADBPGLoader</p>
     */
    @NameInMap("DocumentLoaderName")
    public String documentLoaderName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("Separators")
    public java.util.List<String> separators;

    /**
     * <strong>example:</strong>
     * <p>qwen3-8b</p>
     */
    @NameInMap("SplitterModel")
    public String splitterModel;

    /**
     * <strong>example:</strong>
     * <p>ChineseRecursiveTextSplitter</p>
     */
    @NameInMap("TextSplitterName")
    public String textSplitterName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VlEnhance")
    public Boolean vlEnhance;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZhTitleEnhance")
    public Boolean zhTitleEnhance;

    public static UploadDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentRequest self = new UploadDocumentRequest();
        return TeaModel.build(map, self);
    }

    public UploadDocumentRequest setChunkOverlap(Long chunkOverlap) {
        this.chunkOverlap = chunkOverlap;
        return this;
    }
    public Long getChunkOverlap() {
        return this.chunkOverlap;
    }

    public UploadDocumentRequest setChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }
    public Long getChunkSize() {
        return this.chunkSize;
    }

    public UploadDocumentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UploadDocumentRequest setDocumentLoaderName(String documentLoaderName) {
        this.documentLoaderName = documentLoaderName;
        return this;
    }
    public String getDocumentLoaderName() {
        return this.documentLoaderName;
    }

    public UploadDocumentRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadDocumentRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

    public UploadDocumentRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public UploadDocumentRequest setSeparators(java.util.List<String> separators) {
        this.separators = separators;
        return this;
    }
    public java.util.List<String> getSeparators() {
        return this.separators;
    }

    public UploadDocumentRequest setSplitterModel(String splitterModel) {
        this.splitterModel = splitterModel;
        return this;
    }
    public String getSplitterModel() {
        return this.splitterModel;
    }

    public UploadDocumentRequest setTextSplitterName(String textSplitterName) {
        this.textSplitterName = textSplitterName;
        return this;
    }
    public String getTextSplitterName() {
        return this.textSplitterName;
    }

    public UploadDocumentRequest setVlEnhance(Boolean vlEnhance) {
        this.vlEnhance = vlEnhance;
        return this;
    }
    public Boolean getVlEnhance() {
        return this.vlEnhance;
    }

    public UploadDocumentRequest setZhTitleEnhance(Boolean zhTitleEnhance) {
        this.zhTitleEnhance = zhTitleEnhance;
        return this;
    }
    public Boolean getZhTitleEnhance() {
        return this.zhTitleEnhance;
    }

}
