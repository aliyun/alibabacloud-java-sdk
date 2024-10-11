// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeCustomAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ITEM_CUSTOM</p>
     */
    @NameInMap("type")
    public String type;

    public static DescribeCustomAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAnalysisTaskRequest self = new DescribeCustomAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAnalysisTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
