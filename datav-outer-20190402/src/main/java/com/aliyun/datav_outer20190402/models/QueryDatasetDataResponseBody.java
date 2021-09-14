// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class QueryDatasetDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("RecordCount")
    public String recordCount;

    public static QueryDatasetDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDataResponseBody self = new QueryDatasetDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryDatasetDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public QueryDatasetDataResponseBody setRecordCount(String recordCount) {
        this.recordCount = recordCount;
        return this;
    }
    public String getRecordCount() {
        return this.recordCount;
    }

}
