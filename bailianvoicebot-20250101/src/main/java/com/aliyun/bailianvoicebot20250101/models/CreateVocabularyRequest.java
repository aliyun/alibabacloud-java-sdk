// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-baployoyopf22m2r</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Words")
    public java.util.Map<String, String> words;

    public static CreateVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabularyRequest self = new CreateVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public CreateVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateVocabularyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVocabularyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVocabularyRequest setWords(java.util.Map<String, String> words) {
        this.words = words;
        return this;
    }
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

}
