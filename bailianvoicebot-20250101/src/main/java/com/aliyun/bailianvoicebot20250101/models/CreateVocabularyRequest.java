// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVocabularyRequest extends TeaModel {
    /**
     * <p>The ID of the Bailian business workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-baployoyopf22m2r</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Contains financial industry terminology</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the hot word list.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial industry hot words</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The hot word list.</p>
     */
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
