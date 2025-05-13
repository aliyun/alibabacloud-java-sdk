// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigRequest extends TeaModel {
    /**
     * <p>The maximum number of on-demand instances. For more information, see <a href="https://help.aliyun.com/document_detail/185038.html">Configure provisioned instances and auto scaling rules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maximumInstanceCount")
    public Long maximumInstanceCount;

    /**
     * <p>The service alias or latest version. Other versions are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static PutFunctionOnDemandConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionOnDemandConfigRequest self = new PutFunctionOnDemandConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutFunctionOnDemandConfigRequest setMaximumInstanceCount(Long maximumInstanceCount) {
        this.maximumInstanceCount = maximumInstanceCount;
        return this;
    }
    public Long getMaximumInstanceCount() {
        return this.maximumInstanceCount;
    }

    public PutFunctionOnDemandConfigRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
