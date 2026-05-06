// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ExportVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("VocabularyIds")
    public java.util.List<String> vocabularyIds;

    public static ExportVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVocabularyRequest self = new ExportVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public ExportVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public ExportVocabularyRequest setVocabularyIds(java.util.List<String> vocabularyIds) {
        this.vocabularyIds = vocabularyIds;
        return this;
    }
    public java.util.List<String> getVocabularyIds() {
        return this.vocabularyIds;
    }

}
