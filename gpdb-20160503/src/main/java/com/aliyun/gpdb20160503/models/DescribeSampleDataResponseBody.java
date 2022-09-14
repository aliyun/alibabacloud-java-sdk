// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSampleDataResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HasSampleData")
    public Boolean hasSampleData;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSampleDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataResponseBody self = new DescribeSampleDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSampleDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSampleDataResponseBody setHasSampleData(Boolean hasSampleData) {
        this.hasSampleData = hasSampleData;
        return this;
    }
    public Boolean getHasSampleData() {
        return this.hasSampleData;
    }

    public DescribeSampleDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
