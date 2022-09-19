// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSparkTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteSparkTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSparkTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSparkTemplateResponseBody self = new DeleteSparkTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSparkTemplateResponseBody setData(DeleteSparkTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSparkTemplateResponseBodyData getData() {
        return this.data;
    }

    public DeleteSparkTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteSparkTemplateResponseBodyData extends TeaModel {
        @NameInMap("Succeeded")
        public Boolean succeeded;

        public static DeleteSparkTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSparkTemplateResponseBodyData self = new DeleteSparkTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSparkTemplateResponseBodyData setSucceeded(Boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Boolean getSucceeded() {
            return this.succeeded;
        }

    }

}
