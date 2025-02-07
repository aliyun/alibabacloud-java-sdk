// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    /**
     * <p>If the value of the <strong>Status</strong> parameter is -1, the cause of the creation failure is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ClickHouse exception, code: 49, host: 100.100.79.102, port: 14540; Code: 49, e.displayText() = DB::Exception: Logical error: there is no global context (version 20.8.17.25)n</p>
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
     * 
     * <strong>example:</strong>
     * <p>66676F54-1994-5DCF-993F-74536649628A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the synchronization task was created. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Created.</li>
     * <li><strong>0</strong>: Creation failed. The tables in the synchronization task are duplicate. The duplicate tables are returned for the <strong>RepeatedDbs</strong> parameter.</li>
     * <li><strong>-1</strong>: Creation failed. The cause why the creation failed is returned for the <strong>ErrorMsg</strong> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
