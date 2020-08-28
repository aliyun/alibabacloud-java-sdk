// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetAIActionConfigResponseData data;

    public static GetAIActionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionConfigResponse self = new GetAIActionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAIActionConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIActionConfigResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIActionConfigResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIActionConfigResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIActionConfigResponse setData(GetAIActionConfigResponseData data) {
        this.data = data;
        return this;
    }
    public GetAIActionConfigResponseData getData() {
        return this.data;
    }

    public static class GetAIActionConfigResponseDataInParamList extends TeaModel {
        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("NeedConfig")
        @Validation(required = true)
        public Boolean needConfig;

        @NameInMap("ConfigItems")
        @Validation(required = true)
        public java.util.List<String> configItems;

        public static GetAIActionConfigResponseDataInParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseDataInParamList self = new GetAIActionConfigResponseDataInParamList();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseDataInParamList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIActionConfigResponseDataInParamList setNeedConfig(Boolean needConfig) {
            this.needConfig = needConfig;
            return this;
        }
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public GetAIActionConfigResponseDataInParamList setConfigItems(java.util.List<String> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<String> getConfigItems() {
            return this.configItems;
        }

    }

    public static class GetAIActionConfigResponseDataOutParamList extends TeaModel {
        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("NeedConfig")
        @Validation(required = true)
        public Boolean needConfig;

        @NameInMap("ConfigItems")
        @Validation(required = true)
        public java.util.List<String> configItems;

        public static GetAIActionConfigResponseDataOutParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseDataOutParamList self = new GetAIActionConfigResponseDataOutParamList();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseDataOutParamList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIActionConfigResponseDataOutParamList setNeedConfig(Boolean needConfig) {
            this.needConfig = needConfig;
            return this;
        }
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public GetAIActionConfigResponseDataOutParamList setConfigItems(java.util.List<String> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<String> getConfigItems() {
            return this.configItems;
        }

    }

    public static class GetAIActionConfigResponseData extends TeaModel {
        @NameInMap("AlgoAction")
        @Validation(required = true)
        public String algoAction;

        @NameInMap("Des")
        @Validation(required = true)
        public String des;

        @NameInMap("NeedDevice")
        @Validation(required = true)
        public Boolean needDevice;

        @NameInMap("Sync")
        @Validation(required = true)
        public String sync;

        @NameInMap("AlgoConfigItems")
        @Validation(required = true)
        public String algoConfigItems;

        @NameInMap("InParamList")
        @Validation(required = true)
        public java.util.List<GetAIActionConfigResponseDataInParamList> inParamList;

        @NameInMap("OutParamList")
        @Validation(required = true)
        public java.util.List<GetAIActionConfigResponseDataOutParamList> outParamList;

        public static GetAIActionConfigResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseData self = new GetAIActionConfigResponseData();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseData setAlgoAction(String algoAction) {
            this.algoAction = algoAction;
            return this;
        }
        public String getAlgoAction() {
            return this.algoAction;
        }

        public GetAIActionConfigResponseData setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public GetAIActionConfigResponseData setNeedDevice(Boolean needDevice) {
            this.needDevice = needDevice;
            return this;
        }
        public Boolean getNeedDevice() {
            return this.needDevice;
        }

        public GetAIActionConfigResponseData setSync(String sync) {
            this.sync = sync;
            return this;
        }
        public String getSync() {
            return this.sync;
        }

        public GetAIActionConfigResponseData setAlgoConfigItems(String algoConfigItems) {
            this.algoConfigItems = algoConfigItems;
            return this;
        }
        public String getAlgoConfigItems() {
            return this.algoConfigItems;
        }

        public GetAIActionConfigResponseData setInParamList(java.util.List<GetAIActionConfigResponseDataInParamList> inParamList) {
            this.inParamList = inParamList;
            return this;
        }
        public java.util.List<GetAIActionConfigResponseDataInParamList> getInParamList() {
            return this.inParamList;
        }

        public GetAIActionConfigResponseData setOutParamList(java.util.List<GetAIActionConfigResponseDataOutParamList> outParamList) {
            this.outParamList = outParamList;
            return this;
        }
        public java.util.List<GetAIActionConfigResponseDataOutParamList> getOutParamList() {
            return this.outParamList;
        }

    }

}
