// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
     */
    @NameInMap("ResourceArn")
    public String resourceArn;

    public static EnableCheckResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckResourceRequest self = new EnableCheckResourceRequest();
        return TeaModel.build(map, self);
    }

    public EnableCheckResourceRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

}
