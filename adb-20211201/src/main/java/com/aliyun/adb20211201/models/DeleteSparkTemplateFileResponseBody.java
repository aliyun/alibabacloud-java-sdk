// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSparkTemplateFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteSparkTemplateFileResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSparkTemplateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSparkTemplateFileResponseBody self = new DeleteSparkTemplateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSparkTemplateFileResponseBody setData(DeleteSparkTemplateFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSparkTemplateFileResponseBodyData getData() {
        return this.data;
    }

    public DeleteSparkTemplateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteSparkTemplateFileResponseBodyData extends TeaModel {
        @NameInMap("Succeeded")
        public Boolean succeeded;

        public static DeleteSparkTemplateFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSparkTemplateFileResponseBodyData self = new DeleteSparkTemplateFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSparkTemplateFileResponseBodyData setSucceeded(Boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Boolean getSucceeded() {
            return this.succeeded;
        }

    }

}
