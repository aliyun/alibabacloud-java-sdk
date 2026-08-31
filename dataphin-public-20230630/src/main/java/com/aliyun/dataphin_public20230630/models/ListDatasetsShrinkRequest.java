// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDatasetsShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("DatasetQuery")
    public String datasetQueryShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListDatasetsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsShrinkRequest self = new ListDatasetsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsShrinkRequest setDatasetQueryShrink(String datasetQueryShrink) {
        this.datasetQueryShrink = datasetQueryShrink;
        return this;
    }
    public String getDatasetQueryShrink() {
        return this.datasetQueryShrink;
    }

    public ListDatasetsShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDatasetsShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
