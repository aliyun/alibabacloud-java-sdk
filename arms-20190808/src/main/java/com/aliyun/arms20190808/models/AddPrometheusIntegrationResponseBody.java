// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusIntegrationResponseBody extends TeaModel {
    /**
     * <p>The status code or error code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public AddPrometheusIntegrationResponseBodyData data;

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

    public static AddPrometheusIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusIntegrationResponseBody self = new AddPrometheusIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusIntegrationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusIntegrationResponseBody setData(AddPrometheusIntegrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusIntegrationResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusIntegrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusIntegrationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the exporter.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The name of the exporter.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static AddPrometheusIntegrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusIntegrationResponseBodyData self = new AddPrometheusIntegrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusIntegrationResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public AddPrometheusIntegrationResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

}
