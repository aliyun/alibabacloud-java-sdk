// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetVocabularyRequest extends TeaModel {
    /**
     * <p>The ID of the Model Studio business space.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-zop7ukgtksltamo4</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The hot word vocabulary ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4061</p>
     */
    @NameInMap("VocabularyId")
    public String vocabularyId;

    public static GetVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVocabularyRequest self = new GetVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public GetVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public GetVocabularyRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

}
