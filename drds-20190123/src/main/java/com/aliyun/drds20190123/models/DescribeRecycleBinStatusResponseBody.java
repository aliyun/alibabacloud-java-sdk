// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the table recycle bin. Valid values:</p>
     * <br>
     * <p>*   disable: The table recycle bin is enabled.</p>
     * <p>*   enable: The table recycle bin is disabled.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRecycleBinStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinStatusResponseBody self = new DescribeRecycleBinStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecycleBinStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRecycleBinStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
