// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AppendInstancesToPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the array object.</p>
     */
    @NameInMap("Data")
    public AppendInstancesToPrometheusGlobalViewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>27E653FA-5958-45BE-8AA9-14D884DC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AppendInstancesToPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppendInstancesToPrometheusGlobalViewResponseBody self = new AppendInstancesToPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setData(AppendInstancesToPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppendInstancesToPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppendInstancesToPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppendInstancesToPrometheusGlobalViewResponseBodyData extends TeaModel {
        /**
         * <p>The Info-level information.</p>
         * 
         * <strong>example:</strong>
         * <p>{regionId: the region where the aggregation instance resides. globalViewClusterId: the ID of the aggregation instance. failedInstances: the ID of the object that failed to be added.}</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The call was successful.</li>
         * <li><code>false</code>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AppendInstancesToPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppendInstancesToPrometheusGlobalViewResponseBodyData self = new AppendInstancesToPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AppendInstancesToPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
