// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceRequest extends TeaModel {
    @NameInMap("ApiSrn")
    public String apiSrn;

    @NameInMap("Param")
    public java.util.List<InvokeDataAPIServiceRequestParam> param;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static InvokeDataAPIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceRequest self = new InvokeDataAPIServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceRequest setApiSrn(String apiSrn) {
        this.apiSrn = apiSrn;
        return this;
    }
    public String getApiSrn() {
        return this.apiSrn;
    }

    public InvokeDataAPIServiceRequest setParam(java.util.List<InvokeDataAPIServiceRequestParam> param) {
        this.param = param;
        return this;
    }
    public java.util.List<InvokeDataAPIServiceRequestParam> getParam() {
        return this.param;
    }

    public InvokeDataAPIServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static class InvokeDataAPIServiceRequestParam extends TeaModel {
        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("ListParamValue")
        public java.util.List<String> listParamValue;

        @NameInMap("ListParamType")
        public String listParamType;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamValue")
        public String paramValue;

        public static InvokeDataAPIServiceRequestParam build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceRequestParam self = new InvokeDataAPIServiceRequestParam();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceRequestParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public InvokeDataAPIServiceRequestParam setListParamValue(java.util.List<String> listParamValue) {
            this.listParamValue = listParamValue;
            return this;
        }
        public java.util.List<String> getListParamValue() {
            return this.listParamValue;
        }

        public InvokeDataAPIServiceRequestParam setListParamType(String listParamType) {
            this.listParamType = listParamType;
            return this;
        }
        public String getListParamType() {
            return this.listParamType;
        }

        public InvokeDataAPIServiceRequestParam setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public InvokeDataAPIServiceRequestParam setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

}
