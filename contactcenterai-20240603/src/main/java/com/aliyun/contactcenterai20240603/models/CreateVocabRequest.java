// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class CreateVocabRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nls</p>
     */
    @NameInMap("audioModelCode")
    public String audioModelCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("wordWeightList")
    public java.util.List<CreateVocabRequestWordWeightList> wordWeightList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-9****me1</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabRequest self = new CreateVocabRequest();
        return TeaModel.build(map, self);
    }

    public CreateVocabRequest setAudioModelCode(String audioModelCode) {
        this.audioModelCode = audioModelCode;
        return this;
    }
    public String getAudioModelCode() {
        return this.audioModelCode;
    }

    public CreateVocabRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVocabRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVocabRequest setWordWeightList(java.util.List<CreateVocabRequestWordWeightList> wordWeightList) {
        this.wordWeightList = wordWeightList;
        return this;
    }
    public java.util.List<CreateVocabRequestWordWeightList> getWordWeightList() {
        return this.wordWeightList;
    }

    public CreateVocabRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateVocabRequestWordWeightList extends TeaModel {
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

        public static CreateVocabRequestWordWeightList build(java.util.Map<String, ?> map) throws Exception {
            CreateVocabRequestWordWeightList self = new CreateVocabRequestWordWeightList();
            return TeaModel.build(map, self);
        }

        public CreateVocabRequestWordWeightList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateVocabRequestWordWeightList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

}
