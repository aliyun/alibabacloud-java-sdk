// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortSubmissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sub-13BeXWnGvrOl3MC124tazcJVKaV</p>
     */
    @NameInMap("SubmissionId")
    public String submissionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static AbortSubmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AbortSubmissionRequest self = new AbortSubmissionRequest();
        return TeaModel.build(map, self);
    }

    public AbortSubmissionRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public AbortSubmissionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
