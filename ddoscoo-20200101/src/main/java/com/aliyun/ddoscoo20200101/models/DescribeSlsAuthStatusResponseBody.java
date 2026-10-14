// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsAuthStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether Anti-DDoS Pro or Anti-DDoS Premium is authorized to access Log Service. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlsAuthStatus")
    public Boolean slsAuthStatus;

    public static DescribeSlsAuthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAuthStatusResponseBody self = new DescribeSlsAuthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAuthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsAuthStatusResponseBody setSlsAuthStatus(Boolean slsAuthStatus) {
        this.slsAuthStatus = slsAuthStatus;
        return this;
    }
    public Boolean getSlsAuthStatus() {
        return this.slsAuthStatus;
    }

}
