// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SaveDataServiceApiTestResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveDataServiceApiTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveDataServiceApiTestResultResponseBody self = new SaveDataServiceApiTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveDataServiceApiTestResultResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SaveDataServiceApiTestResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveDataServiceApiTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveDataServiceApiTestResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
