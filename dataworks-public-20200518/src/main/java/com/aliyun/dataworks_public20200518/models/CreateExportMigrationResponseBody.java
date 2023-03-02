// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateExportMigrationResponseBody extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot errors.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call succeeded.</p>
     * <p>*   false: The call failed. You can locate errors based on the request ID.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateExportMigrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExportMigrationResponseBody self = new CreateExportMigrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExportMigrationResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateExportMigrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExportMigrationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
