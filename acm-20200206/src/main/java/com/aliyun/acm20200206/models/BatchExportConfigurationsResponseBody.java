// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class BatchExportConfigurationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchExportConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchExportConfigurationsResponseBody self = new BatchExportConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchExportConfigurationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchExportConfigurationsResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public BatchExportConfigurationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchExportConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
