// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDIJobRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11588</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>Specifies whether to return detailed configuration information, including TransformationRules, TableMappings, and JobSettings. Valid values: true and false. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithDetails")
    public Boolean withDetails;

    public static GetDIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobRequest self = new GetDIJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDIJobRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public GetDIJobRequest setWithDetails(Boolean withDetails) {
        this.withDetails = withDetails;
        return this;
    }
    public Boolean getWithDetails() {
        return this.withDetails;
    }

}
