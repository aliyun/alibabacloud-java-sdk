// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribePrivateRAGServiceResponseBody extends TeaModel {
    /**
     * <p>CA certificate Info. The returned OSS link, valid for 2 hours.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-xxx">https://oss-xxx</a></p>
     */
    @NameInMap("CaCert")
    public String caCert;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrivateRAGServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateRAGServiceResponseBody self = new DescribePrivateRAGServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivateRAGServiceResponseBody setCaCert(String caCert) {
        this.caCert = caCert;
        return this;
    }
    public String getCaCert() {
        return this.caCert;
    }

    public DescribePrivateRAGServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
