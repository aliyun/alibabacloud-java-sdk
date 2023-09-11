// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecResponseBody extends TeaModel {
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Boolean status;

    public static ModifyMasterSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecResponseBody self = new ModifyMasterSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecResponseBody setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyMasterSpecResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ModifyMasterSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyMasterSpecResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
