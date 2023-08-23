// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusIntegrationResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public UpdatePrometheusIntegrationResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePrometheusIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusIntegrationResponseBody self = new UpdatePrometheusIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePrometheusIntegrationResponseBody setData(UpdatePrometheusIntegrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePrometheusIntegrationResponseBodyData getData() {
        return this.data;
    }

    public UpdatePrometheusIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePrometheusIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePrometheusIntegrationResponseBodyData extends TeaModel {
        /**
         * <p>The exporter ID.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The exporter name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static UpdatePrometheusIntegrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusIntegrationResponseBodyData self = new UpdatePrometheusIntegrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusIntegrationResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public UpdatePrometheusIntegrationResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
