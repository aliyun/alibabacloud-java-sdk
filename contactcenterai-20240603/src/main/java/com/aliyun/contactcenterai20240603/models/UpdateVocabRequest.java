// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class UpdateVocabRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsvsv***dsvv</p>
     */
    @NameInMap("vocabularyId")
    public String vocabularyId;

    @NameInMap("wordWeightList")
    public java.util.List<UpdateVocabRequestWordWeightList> wordWeightList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jhfr****w8v</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabRequest self = new UpdateVocabRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVocabRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVocabRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVocabRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public UpdateVocabRequest setWordWeightList(java.util.List<UpdateVocabRequestWordWeightList> wordWeightList) {
        this.wordWeightList = wordWeightList;
        return this;
    }
    public java.util.List<UpdateVocabRequestWordWeightList> getWordWeightList() {
        return this.wordWeightList;
    }

    public UpdateVocabRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateVocabRequestWordWeightList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("weight")
        public Integer weight;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("word")
        public String word;

        public static UpdateVocabRequestWordWeightList build(java.util.Map<String, ?> map) throws Exception {
            UpdateVocabRequestWordWeightList self = new UpdateVocabRequestWordWeightList();
            return TeaModel.build(map, self);
        }

        public UpdateVocabRequestWordWeightList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public UpdateVocabRequestWordWeightList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

}
