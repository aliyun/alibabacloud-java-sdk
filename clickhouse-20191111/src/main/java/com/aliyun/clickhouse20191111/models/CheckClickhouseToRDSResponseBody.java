// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponseBody extends TeaModel {
    /**
     * <ul>
     * <li><p>This parameter is returned only if the connection fails (<strong>Status</strong> is <strong>false</strong>).</p>
     * </li>
     * <li><p>It indicates the reason for the connection failure.</p>
     * </li>
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
     * <p>Indicates whether a connection can be established. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: A connection can be established.</p>
     * </li>
     * <li><p><strong>false</strong>: A connection cannot be established.</p>
     * </li>
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
