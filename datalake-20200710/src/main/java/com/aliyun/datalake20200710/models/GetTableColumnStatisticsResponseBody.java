// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableColumnStatisticsResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // ColumnStatisticsObjList
    @NameInMap("ColumnStatisticsObjList")
    public java.util.List<ColumnStatisticsObj> columnStatisticsObjList;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static GetTableColumnStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnStatisticsResponseBody self = new GetTableColumnStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableColumnStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTableColumnStatisticsResponseBody setColumnStatisticsObjList(java.util.List<ColumnStatisticsObj> columnStatisticsObjList) {
        this.columnStatisticsObjList = columnStatisticsObjList;
        return this;
    }
    public java.util.List<ColumnStatisticsObj> getColumnStatisticsObjList() {
        return this.columnStatisticsObjList;
    }

    public GetTableColumnStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTableColumnStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableColumnStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
