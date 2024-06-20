// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a Logstore is created for Anti-DDoS Pro or Anti-DDoS Premium. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExistStatus")
    public Boolean existStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogStoreExistStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusResponseBody self = new DescribeLogStoreExistStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusResponseBody setExistStatus(Boolean existStatus) {
        this.existStatus = existStatus;
        return this;
    }
    public Boolean getExistStatus() {
        return this.existStatus;
    }

    public DescribeLogStoreExistStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
