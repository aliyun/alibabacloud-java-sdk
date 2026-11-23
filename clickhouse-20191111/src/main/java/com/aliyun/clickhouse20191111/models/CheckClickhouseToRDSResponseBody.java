// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponseBody extends TeaModel {
    /**
     * <ul>
     * <li>This parameter is not returned when <strong>Status</strong> is <strong>true</strong>.</li>
     * <li>When <strong>Status</strong> is <strong>false</strong>, this parameter indicates the cause of the connection failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NotSameVpc</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A82758F8-E793-5610-BE11-0E46664305C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the connection is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The connection is successful.</li>
     * <li><strong>false</strong>: The connection fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static CheckClickhouseToRDSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckClickhouseToRDSResponseBody self = new CheckClickhouseToRDSResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckClickhouseToRDSResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckClickhouseToRDSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckClickhouseToRDSResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
