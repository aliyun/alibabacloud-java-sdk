// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UploadDocumentResponseBody extends TeaModel {
    /**
     * <p>The processing time, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1782981430906818562</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ff3fef67-48d9-4379-a237-9ba8143fe739</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static UploadDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentResponseBody self = new UploadDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDocumentResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public UploadDocumentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UploadDocumentResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UploadDocumentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UploadDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UploadDocumentResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
