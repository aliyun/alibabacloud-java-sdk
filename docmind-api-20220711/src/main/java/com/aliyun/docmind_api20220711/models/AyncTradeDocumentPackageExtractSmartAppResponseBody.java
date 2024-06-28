// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class AyncTradeDocumentPackageExtractSmartAppResponseBody extends TeaModel {
    @NameInMap("Completed")
    public Boolean completed;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static AyncTradeDocumentPackageExtractSmartAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AyncTradeDocumentPackageExtractSmartAppResponseBody self = new AyncTradeDocumentPackageExtractSmartAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AyncTradeDocumentPackageExtractSmartAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
