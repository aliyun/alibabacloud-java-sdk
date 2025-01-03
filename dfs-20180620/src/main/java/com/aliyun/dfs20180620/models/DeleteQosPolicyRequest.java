// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteQosPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QosPolicyId")
    public String qosPolicyId;

    public static DeleteQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosPolicyRequest self = new DeleteQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQosPolicyRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DeleteQosPolicyRequest setQosPolicyId(String qosPolicyId) {
        this.qosPolicyId = qosPolicyId;
        return this;
    }
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

}
