// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDataQualityRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>19715</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>17302</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteDataQualityRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataQualityRuleRequest self = new DeleteDataQualityRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataQualityRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteDataQualityRuleRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
