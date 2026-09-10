// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVocabularyShrinkRequest extends TeaModel {
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
