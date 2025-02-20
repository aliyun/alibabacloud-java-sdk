// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class ListVocabRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-jhfr****8v</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVocabRequest self = new ListVocabRequest();
        return TeaModel.build(map, self);
    }

    public ListVocabRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
