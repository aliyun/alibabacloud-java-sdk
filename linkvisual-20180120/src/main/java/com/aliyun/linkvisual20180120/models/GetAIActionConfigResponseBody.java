// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAIActionConfigResponseBodyData data;

    public static GetAIActionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionConfigResponseBody self = new GetAIActionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIActionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIActionConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIActionConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIActionConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIActionConfigResponseBody setData(GetAIActionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAIActionConfigResponseBodyData getData() {
        return this.data;
    }

    public static class GetAIActionConfigResponseBodyDataInParamList extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("NeedConfig")
        public Boolean needConfig;

        @NameInMap("ConfigItems")
        public java.util.List<String> configItems;

        public static GetAIActionConfigResponseBodyDataInParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseBodyDataInParamList self = new GetAIActionConfigResponseBodyDataInParamList();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseBodyDataInParamList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIActionConfigResponseBodyDataInParamList setNeedConfig(Boolean needConfig) {
            this.needConfig = needConfig;
            return this;
        }
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public GetAIActionConfigResponseBodyDataInParamList setConfigItems(java.util.List<String> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<String> getConfigItems() {
            return this.configItems;
        }

    }

    public static class GetAIActionConfigResponseBodyDataOutParamList extends TeaModel {
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("NeedConfig")
        public Boolean needConfig;

        @NameInMap("ConfigItems")
        public java.util.List<String> configItems;

        public static GetAIActionConfigResponseBodyDataOutParamList build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseBodyDataOutParamList self = new GetAIActionConfigResponseBodyDataOutParamList();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseBodyDataOutParamList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetAIActionConfigResponseBodyDataOutParamList setNeedConfig(Boolean needConfig) {
            this.needConfig = needConfig;
            return this;
        }
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public GetAIActionConfigResponseBodyDataOutParamList setConfigItems(java.util.List<String> configItems) {
            this.configItems = configItems;
            return this;
        }
        public java.util.List<String> getConfigItems() {
            return this.configItems;
        }

    }

    public static class GetAIActionConfigResponseBodyData extends TeaModel {
        @NameInMap("AlgoAction")
        public String algoAction;

        @NameInMap("Des")
        public String des;

        @NameInMap("NeedDevice")
        public Boolean needDevice;

        @NameInMap("Sync")
        public String sync;

        @NameInMap("AlgoConfigItems")
        public String algoConfigItems;

        @NameInMap("InParamList")
        public java.util.List<GetAIActionConfigResponseBodyDataInParamList> inParamList;

        @NameInMap("OutParamList")
        public java.util.List<GetAIActionConfigResponseBodyDataOutParamList> outParamList;

        public static GetAIActionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionConfigResponseBodyData self = new GetAIActionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAIActionConfigResponseBodyData setAlgoAction(String algoAction) {
            this.algoAction = algoAction;
            return this;
        }
        public String getAlgoAction() {
            return this.algoAction;
        }

        public GetAIActionConfigResponseBodyData setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public GetAIActionConfigResponseBodyData setNeedDevice(Boolean needDevice) {
            this.needDevice = needDevice;
            return this;
        }
        public Boolean getNeedDevice() {
            return this.needDevice;
        }

        public GetAIActionConfigResponseBodyData setSync(String sync) {
            this.sync = sync;
            return this;
        }
        public String getSync() {
            return this.sync;
        }

        public GetAIActionConfigResponseBodyData setAlgoConfigItems(String algoConfigItems) {
            this.algoConfigItems = algoConfigItems;
            return this;
        }
        public String getAlgoConfigItems() {
            return this.algoConfigItems;
        }

        public GetAIActionConfigResponseBodyData setInParamList(java.util.List<GetAIActionConfigResponseBodyDataInParamList> inParamList) {
            this.inParamList = inParamList;
            return this;
        }
        public java.util.List<GetAIActionConfigResponseBodyDataInParamList> getInParamList() {
            return this.inParamList;
        }

        public GetAIActionConfigResponseBodyData setOutParamList(java.util.List<GetAIActionConfigResponseBodyDataOutParamList> outParamList) {
            this.outParamList = outParamList;
            return this;
        }
        public java.util.List<GetAIActionConfigResponseBodyDataOutParamList> getOutParamList() {
            return this.outParamList;
        }

    }

}
