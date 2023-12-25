// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckClickhouseToRDSResponseBody extends TeaModel {
    /**
     * <p>*   When the value **true** is returned for the **Status** parameter, the system does not return the ErrorCode parameter.</p>
     * <p>*   When the value **false** is returned for the **Status** parameter, the system returns for the ErrorCode parameter the reason why the ApsaraDB for ClickHouse cluster cannot be connected to the ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the ApsaraDB for ClickHouse cluster can be connected to the ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>*   **true**: The ApsaraDB for ClickHouse cluster can be connected to the ApsaraDB RDS for MySQL instance.</p>
     * <p>*   **false**: The ApsaraDB for ClickHouse cluster cannot be connected to the ApsaraDB RDS for MySQL instance.</p>
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
