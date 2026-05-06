// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ImportVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-zop7ukgtksltamo4</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("FileKey")
    public String fileKey;

    public static ImportVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportVocabularyRequest self = new ImportVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public ImportVocabularyRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public ImportVocabularyRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
