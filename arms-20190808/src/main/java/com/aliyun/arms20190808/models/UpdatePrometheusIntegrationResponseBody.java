// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusIntegrationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public UpdatePrometheusIntegrationResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("InstanceId")
        public Long instanceId;

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
