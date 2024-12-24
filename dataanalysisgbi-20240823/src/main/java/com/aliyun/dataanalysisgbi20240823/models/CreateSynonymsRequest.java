// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateSynonymsRequest extends TeaModel {
    @NameInMap("columns")
    public java.util.List<String> columns;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("word")
    public String word;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("wordSynonyms")
    public java.util.List<String> wordSynonyms;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateSynonymsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSynonymsRequest self = new CreateSynonymsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSynonymsRequest setColumns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    public CreateSynonymsRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

    public CreateSynonymsRequest setWordSynonyms(java.util.List<String> wordSynonyms) {
        this.wordSynonyms = wordSynonyms;
        return this;
    }
    public java.util.List<String> getWordSynonyms() {
        return this.wordSynonyms;
    }

    public CreateSynonymsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
