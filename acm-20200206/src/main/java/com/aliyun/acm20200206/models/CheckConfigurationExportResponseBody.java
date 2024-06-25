// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class CheckConfigurationExportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CheckConfigurationExportResponseBodyResult result;

    public static CheckConfigurationExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckConfigurationExportResponseBody self = new CheckConfigurationExportResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckConfigurationExportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckConfigurationExportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckConfigurationExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckConfigurationExportResponseBody setResult(CheckConfigurationExportResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CheckConfigurationExportResponseBodyResult getResult() {
        return this.result;
    }

    public static class CheckConfigurationExportResponseBodyResult extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static CheckConfigurationExportResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckConfigurationExportResponseBodyResult self = new CheckConfigurationExportResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckConfigurationExportResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
