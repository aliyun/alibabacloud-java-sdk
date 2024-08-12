// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponseBody extends TeaModel {
    /**
     * <ul>
     * <li>When the value <strong>true</strong> is returned for the <strong>Status</strong> parameter, the system does not return the ErrorCode parameter.</li>
     * <li>When the value <strong>false</strong> is returned for the <strong>Status</strong> parameter, the system returns for the ErrorCode parameter the reason why the ApsaraDB for ClickHouse cluster cannot be connected to the ApsaraDB RDS for MySQL instance.</li>
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
     * <p>Indicates whether the ApsaraDB for ClickHouse cluster can be connected to the ApsaraDB RDS for MySQL instance.</p>
     * <ul>
     * <li><strong>true</strong>: The ApsaraDB for ClickHouse cluster can be connected to the ApsaraDB RDS for MySQL instance.</li>
     * <li><strong>false</strong>: The ApsaraDB for ClickHouse cluster cannot be connected to the ApsaraDB RDS for MySQL instance.</li>
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
