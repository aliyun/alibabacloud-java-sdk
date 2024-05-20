// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    /**
     * <p>If -1 is returned for the **Status** parameter, the cause of the creation failure is returned.</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Duplicate tables in the synchronization task.</p>
     */
    @NameInMap("RepeatedDbs")
    public java.util.List<String> repeatedDbs;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the synchronization task was created. Valid values:</p>
     * <br>
     * <p>*   **1**: Created.</p>
     * <p>*   **0**: Creation failed. The tables in the synchronization task are duplicate. The duplicate tables are returned for the **RepeatedDbs** parameter.</p>
     * <p>*   **-1**: Creation failed. The cause why the creation failed is returned for the **ErrorMsg** parameter.</p>
     */
    @NameInMap("Status")
    public Long status;

    public static CreateRDSToClickhouseDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRDSToClickhouseDbResponseBody self = new CreateRDSToClickhouseDbResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRDSToClickhouseDbResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateRDSToClickhouseDbResponseBody setRepeatedDbs(java.util.List<String> repeatedDbs) {
        this.repeatedDbs = repeatedDbs;
        return this;
    }
    public java.util.List<String> getRepeatedDbs() {
        return this.repeatedDbs;
    }

    public CreateRDSToClickhouseDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRDSToClickhouseDbResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
