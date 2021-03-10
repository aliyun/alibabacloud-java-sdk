// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataAPIServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateDataAPIServiceResponseData data;

    public static CreateDataAPIServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAPIServiceResponse self = new CreateDataAPIServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataAPIServiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAPIServiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDataAPIServiceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataAPIServiceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAPIServiceResponse setData(CreateDataAPIServiceResponseData data) {
        this.data = data;
        return this;
    }
    public CreateDataAPIServiceResponseData getData() {
        return this.data;
    }

    public static class CreateDataAPIServiceResponseData extends TeaModel {
        @NameInMap("ApiSrn")
        @Validation(required = true)
        public String apiSrn;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("LastUpdateTime")
        @Validation(required = true)
        public Long lastUpdateTime;

        public static CreateDataAPIServiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceResponseData self = new CreateDataAPIServiceResponseData();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceResponseData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public CreateDataAPIServiceResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateDataAPIServiceResponseData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

    }

}
