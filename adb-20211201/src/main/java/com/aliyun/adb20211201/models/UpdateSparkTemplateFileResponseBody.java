// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateSparkTemplateFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateSparkTemplateFileResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSparkTemplateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSparkTemplateFileResponseBody self = new UpdateSparkTemplateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSparkTemplateFileResponseBody setData(UpdateSparkTemplateFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSparkTemplateFileResponseBodyData getData() {
        return this.data;
    }

    public UpdateSparkTemplateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSparkTemplateFileResponseBodyData extends TeaModel {
        @NameInMap("Succeeded")
        public Boolean succeeded;

        public static UpdateSparkTemplateFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSparkTemplateFileResponseBodyData self = new UpdateSparkTemplateFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSparkTemplateFileResponseBodyData setSucceeded(Boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Boolean getSucceeded() {
            return this.succeeded;
        }

    }

}
