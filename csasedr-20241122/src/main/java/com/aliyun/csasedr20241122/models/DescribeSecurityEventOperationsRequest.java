// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The ID of the security alert event to be handled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61352054</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    public static DescribeSecurityEventOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsRequest self = new DescribeSecurityEventOperationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

}
