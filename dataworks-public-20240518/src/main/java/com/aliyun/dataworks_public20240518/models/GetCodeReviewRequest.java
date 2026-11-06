// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCodeReviewRequest extends TeaModel {
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

    public static GetCodeReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeReviewRequest self = new GetCodeReviewRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeReviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCodeReviewRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
