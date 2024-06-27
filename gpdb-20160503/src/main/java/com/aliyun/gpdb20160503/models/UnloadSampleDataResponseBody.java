// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UnloadSampleDataResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The error message returned if an error occurs. This message does not affect the execution of the operation.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4E42ABC3-4DBD-5343-9BCA-66B7D091311F_6914</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution state of the operation. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The operation fails.</li>
     * <li><strong>true</strong>: The operation is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static UnloadSampleDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnloadSampleDataResponseBody self = new UnloadSampleDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UnloadSampleDataResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UnloadSampleDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnloadSampleDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnloadSampleDataResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
