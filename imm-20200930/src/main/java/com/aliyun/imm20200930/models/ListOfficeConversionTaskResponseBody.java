// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListOfficeConversionTaskResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeConversionTasks")
    public java.util.List<OfficeConversionTask> officeConversionTasks;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOfficeConversionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeConversionTaskResponseBody self = new ListOfficeConversionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOfficeConversionTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOfficeConversionTaskResponseBody setOfficeConversionTasks(java.util.List<OfficeConversionTask> officeConversionTasks) {
        this.officeConversionTasks = officeConversionTasks;
        return this;
    }
    public java.util.List<OfficeConversionTask> getOfficeConversionTasks() {
        return this.officeConversionTasks;
    }

    public ListOfficeConversionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
