// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class DeleteVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("VocabularyId")
    public String vocabularyId;

    public static DeleteVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVocabularyRequest self = new DeleteVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public DeleteVocabularyRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

}
