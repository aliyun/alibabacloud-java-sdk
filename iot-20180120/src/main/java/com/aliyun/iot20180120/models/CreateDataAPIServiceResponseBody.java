// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataAPIServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDataAPIServiceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>57b144cf-09fc-4916-a272-a62902d5b207</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDataAPIServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAPIServiceResponseBody self = new CreateDataAPIServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataAPIServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDataAPIServiceResponseBody setData(CreateDataAPIServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDataAPIServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateDataAPIServiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataAPIServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataAPIServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDataAPIServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acs:iot:<em>:127103983461</em>***:serveapi/device/getDeviceCountByStatus2</p>
         */
        @NameInMap("ApiSrn")
        public String apiSrn;

        /**
         * <strong>example:</strong>
         * <p>1557839468865</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1557839468865</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        public static CreateDataAPIServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceResponseBodyData self = new CreateDataAPIServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceResponseBodyData setApiSrn(String apiSrn) {
            this.apiSrn = apiSrn;
            return this;
        }
        public String getApiSrn() {
            return this.apiSrn;
        }

        public CreateDataAPIServiceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateDataAPIServiceResponseBodyData setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

    }

}
