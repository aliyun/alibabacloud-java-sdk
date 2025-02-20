// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class DeleteVocabRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ern*******rve</p>
     */
    @NameInMap("vocabularyId")
    public String vocabularyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-0*****jlg8s</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeleteVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVocabRequest self = new DeleteVocabRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVocabRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public DeleteVocabRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
