// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a Logstore is created for Anti-DDoS Pro or Anti-DDoS Premium. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("ExistStatus")
    public Boolean existStatus;

    /**
     * <p>The ID of the request.</p>
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
