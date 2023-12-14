// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeStorageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the projects and Logstores that are created for the threat analysis feature exist in Simple Log Service. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStorageResponseBody self = new DescribeStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStorageResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
