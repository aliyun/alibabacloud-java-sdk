// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class GetVocabRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dhbf***rbrdb</p>
     */
    @NameInMap("vocabularyId")
    public String vocabularyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-9864***1</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static GetVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVocabRequest self = new GetVocabRequest();
        return TeaModel.build(map, self);
    }

    public GetVocabRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public GetVocabRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
