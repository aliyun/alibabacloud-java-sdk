// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateEdgeMobileAgentPackageResponseBody extends TeaModel {
    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22326560487****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The list of package IDs.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEdgeMobileAgentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeMobileAgentPackageResponseBody self = new CreateEdgeMobileAgentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeMobileAgentPackageResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateEdgeMobileAgentPackageResponseBody setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    public CreateEdgeMobileAgentPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
