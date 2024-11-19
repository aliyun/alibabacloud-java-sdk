// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:iot:<em>:127103983461</em>***:serveapi/device/getDeviceCountByStatus2</p>
     */
    @NameInMap("ApiSrn")
    public String apiSrn;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Param")
    public java.util.List<InvokeDataAPIServiceRequestParam> param;

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

    public InvokeDataAPIServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public InvokeDataAPIServiceRequest setParam(java.util.List<InvokeDataAPIServiceRequestParam> param) {
        this.param = param;
        return this;
    }
    public java.util.List<InvokeDataAPIServiceRequestParam> getParam() {
        return this.param;
    }

    public static class InvokeDataAPIServiceRequestParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>VARCHAR</p>
         */
        @NameInMap("ListParamType")
        public String listParamType;

        /**
         * <strong>example:</strong>
         * <p>[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;]</p>
         */
        @NameInMap("ListParamValue")
        public java.util.List<String> listParamValue;

        /**
         * <strong>example:</strong>
         * <p>status</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <strong>example:</strong>
         * <p>VARCHAR</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static InvokeDataAPIServiceRequestParam build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceRequestParam self = new InvokeDataAPIServiceRequestParam();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceRequestParam setListParamType(String listParamType) {
            this.listParamType = listParamType;
            return this;
        }
        public String getListParamType() {
            return this.listParamType;
        }

        public InvokeDataAPIServiceRequestParam setListParamValue(java.util.List<String> listParamValue) {
            this.listParamValue = listParamValue;
            return this;
        }
        public java.util.List<String> getListParamValue() {
            return this.listParamValue;
        }

        public InvokeDataAPIServiceRequestParam setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public InvokeDataAPIServiceRequestParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
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
