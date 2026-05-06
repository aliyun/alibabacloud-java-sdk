// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ExportVocabularyShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("VocabularyIds")
    public String vocabularyIdsShrink;

    public static ExportVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVocabularyShrinkRequest self = new ExportVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportVocabularyShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public ExportVocabularyShrinkRequest setVocabularyIdsShrink(String vocabularyIdsShrink) {
        this.vocabularyIdsShrink = vocabularyIdsShrink;
        return this;
    }
    public String getVocabularyIdsShrink() {
        return this.vocabularyIdsShrink;
    }

}
