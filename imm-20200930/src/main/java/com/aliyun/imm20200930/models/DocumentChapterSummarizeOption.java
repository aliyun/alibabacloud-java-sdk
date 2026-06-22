// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentChapterSummarizeOption extends TeaModel {
    /**
     * <p>The maximum number of results to return per request. If you do not specify this parameter, the default value is used.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The pagination token. It specifies the starting point for the query. To retrieve the next page of results, set this parameter to the marker value from the previous response.</p>
     */
    @NameInMap("Marker")
    public Integer marker;

    /**
     * <p>The summarization model version. If you do not specify this parameter, the default model version is used.</p>
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
