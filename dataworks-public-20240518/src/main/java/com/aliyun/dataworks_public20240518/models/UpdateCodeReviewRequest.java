// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCodeReviewRequest extends TeaModel {
    /**
     * <p>The unique identifier of the review.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>review-id</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23620</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The final decision. Valid values: Accepted, Rejected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Accepted</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateCodeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeReviewRequest self = new UpdateCodeReviewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCodeReviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCodeReviewRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateCodeReviewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
