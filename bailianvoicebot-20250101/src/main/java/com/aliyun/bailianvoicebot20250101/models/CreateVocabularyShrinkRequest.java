// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVocabularyShrinkRequest extends TeaModel {
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
    public String wordsShrink;

    public static CreateVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabularyShrinkRequest self = new CreateVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVocabularyShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateVocabularyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVocabularyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVocabularyShrinkRequest setWordsShrink(String wordsShrink) {
        this.wordsShrink = wordsShrink;
        return this;
    }
    public String getWordsShrink() {
        return this.wordsShrink;
    }

}
