// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetTableColumnStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("ColumnStatisticsObjList")
    public java.util.List<ColumnStatisticsObj> columnStatisticsObjList;

    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B7F4B621-E41E-4C84-B97F-42B5380A32BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
