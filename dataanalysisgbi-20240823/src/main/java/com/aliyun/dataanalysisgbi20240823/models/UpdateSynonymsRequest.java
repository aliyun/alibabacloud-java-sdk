// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateSynonymsRequest extends TeaModel {
    @NameInMap("columns")
    public java.util.List<String> columns;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>synonyms-AAAAAAAAAUpwTTVrwTFJwQ</p>
     */
    @NameInMap("synonymIdKey")
    public String synonymIdKey;

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

    public static UpdateSynonymsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsRequest self = new UpdateSynonymsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsRequest setColumns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    public UpdateSynonymsRequest setSynonymIdKey(String synonymIdKey) {
        this.synonymIdKey = synonymIdKey;
        return this;
    }
    public String getSynonymIdKey() {
        return this.synonymIdKey;
    }

    public UpdateSynonymsRequest setWord(String word) {
        this.word = word;
        return this;
    }
    public String getWord() {
        return this.word;
    }

    public UpdateSynonymsRequest setWordSynonyms(java.util.List<String> wordSynonyms) {
        this.wordSynonyms = wordSynonyms;
        return this;
    }
    public java.util.List<String> getWordSynonyms() {
        return this.wordSynonyms;
    }

    public UpdateSynonymsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
