// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ACB5258F-25AF-4D7C-8FAA-B6FE60******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the table recycle bin. Valid values:</p>
     * <ul>
     * <li>disable: The table recycle bin is enabled.</li>
     * <li>enable: The table recycle bin is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
