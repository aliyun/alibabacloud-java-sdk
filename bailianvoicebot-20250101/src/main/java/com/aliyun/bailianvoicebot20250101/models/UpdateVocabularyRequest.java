// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4061</p>
     */
    @NameInMap("VocabularyId")
    public String vocabularyId;

    @NameInMap("Words")
    public java.util.Map<String, String> words;

    public static UpdateVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabularyRequest self = new UpdateVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateVocabularyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVocabularyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVocabularyRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public UpdateVocabularyRequest setWords(java.util.Map<String, String> words) {
        this.words = words;
        return this;
    }
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

}
