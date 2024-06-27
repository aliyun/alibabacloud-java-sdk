// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The error message returned if the operation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;error message\&quot;</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34B32A0A-08EF-4A87-B6BE-CDD9F56FC3AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The operation failed.</li>
     * <li><strong>1</strong>: The operation is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConfigResponseBody self = new ModifyDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConfigResponseBody setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyDBInstanceConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ModifyDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBInstanceConfigResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
