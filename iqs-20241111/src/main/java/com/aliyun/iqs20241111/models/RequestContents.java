// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class RequestContents extends TeaModel {
    @NameInMap("mainText")
    public Boolean mainText;

    @NameInMap("markdownText")
    public Boolean markdownText;

    @NameInMap("rerankScore")
    public Boolean rerankScore;

    @NameInMap("summary")
    public Boolean summary;

    public static RequestContents build(java.util.Map<String, ?> map) throws Exception {
        RequestContents self = new RequestContents();
        return TeaModel.build(map, self);
    }

    public RequestContents setMainText(Boolean mainText) {
        this.mainText = mainText;
        return this;
    }
    public Boolean getMainText() {
        return this.mainText;
    }

    public RequestContents setMarkdownText(Boolean markdownText) {
        this.markdownText = markdownText;
        return this;
    }
    public Boolean getMarkdownText() {
        return this.markdownText;
    }

    public RequestContents setRerankScore(Boolean rerankScore) {
        this.rerankScore = rerankScore;
        return this;
    }
    public Boolean getRerankScore() {
        return this.rerankScore;
    }

    public RequestContents setSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    public Boolean getSummary() {
        return this.summary;
    }

}
