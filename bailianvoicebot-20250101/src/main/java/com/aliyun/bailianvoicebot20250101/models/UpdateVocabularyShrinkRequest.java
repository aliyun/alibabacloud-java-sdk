// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateVocabularyShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Model Studio business unit.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The description of the vocabulary.</p>
     * 
     * <strong>example:</strong>
     * <p>包含金融场景专业术语</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the vocabulary.</p>
     * 
     * <strong>example:</strong>
     * <p>金融场景热词</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the vocabulary.</p>
     * 
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4061</p>
     */
    @NameInMap("VocabularyId")
    public String vocabularyId;

    /**
     * <p>An object containing the words in the vocabulary and their corresponding weights.</p>
     */
    @NameInMap("Words")
    public String wordsShrink;

    public static UpdateVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabularyShrinkRequest self = new UpdateVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVocabularyShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateVocabularyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVocabularyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVocabularyShrinkRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public UpdateVocabularyShrinkRequest setWordsShrink(String wordsShrink) {
        this.wordsShrink = wordsShrink;
        return this;
    }
    public String getWordsShrink() {
        return this.wordsShrink;
    }

}
