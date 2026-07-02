// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentChapterSummarizeOption extends TeaModel {
    /**
     * <p>The number of section-by-section summaries. If neither Marker nor Index is specified, the entire article is summarized by default. Marker and Index must either both be specified or both be omitted.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The start position for section-by-section summarization.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Marker")
    public Integer marker;

    /**
     * <p>The version of section-by-section summarization.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("Version")
    public String version;

    public static DocumentChapterSummarizeOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentChapterSummarizeOption self = new DocumentChapterSummarizeOption();
        return TeaModel.build(map, self);
    }

    public DocumentChapterSummarizeOption setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DocumentChapterSummarizeOption setMarker(Integer marker) {
        this.marker = marker;
        return this;
    }
    public Integer getMarker() {
        return this.marker;
    }

    public DocumentChapterSummarizeOption setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
