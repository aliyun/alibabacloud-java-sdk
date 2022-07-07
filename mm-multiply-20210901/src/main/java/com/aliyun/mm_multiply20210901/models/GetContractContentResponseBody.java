// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractContentResponseBody extends TeaModel {
    // 类型
    @NameInMap("BaseType")
    public String baseType;

    @NameInMap("Code")
    public Long code;

    // 下载URL
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 状态
    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    public static GetContractContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContractContentResponseBody self = new GetContractContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContractContentResponseBody setBaseType(String baseType) {
        this.baseType = baseType;
        return this;
    }
    public String getBaseType() {
        return this.baseType;
    }

    public GetContractContentResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetContractContentResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public GetContractContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContractContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContractContentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetContractContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
