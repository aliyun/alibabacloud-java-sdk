// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SaveMaterialDocumentResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description</p>
     * 
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Is successful: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveMaterialDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveMaterialDocumentResponseBody self = new SaveMaterialDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveMaterialDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveMaterialDocumentResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public SaveMaterialDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveMaterialDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveMaterialDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveMaterialDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
