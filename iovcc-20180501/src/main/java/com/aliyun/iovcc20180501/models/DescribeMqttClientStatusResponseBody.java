// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMqttClientStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientStatus")
    public DescribeMqttClientStatusResponseBodyClientStatus clientStatus;

    public static DescribeMqttClientStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttClientStatusResponseBody self = new DescribeMqttClientStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMqttClientStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMqttClientStatusResponseBody setClientStatus(DescribeMqttClientStatusResponseBodyClientStatus clientStatus) {
        this.clientStatus = clientStatus;
        return this;
    }
    public DescribeMqttClientStatusResponseBodyClientStatus getClientStatus() {
        return this.clientStatus;
    }

    public static class DescribeMqttClientStatusResponseBodyClientStatus extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("LastUpdate")
        public Long lastUpdate;

        @NameInMap("CleanSession")
        public String cleanSession;

        public static DescribeMqttClientStatusResponseBodyClientStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeMqttClientStatusResponseBodyClientStatus self = new DescribeMqttClientStatusResponseBodyClientStatus();
            return TeaModel.build(map, self);
        }

        public DescribeMqttClientStatusResponseBodyClientStatus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeMqttClientStatusResponseBodyClientStatus setLastUpdate(Long lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }
        public Long getLastUpdate() {
            return this.lastUpdate;
        }

        public DescribeMqttClientStatusResponseBodyClientStatus setCleanSession(String cleanSession) {
            this.cleanSession = cleanSession;
            return this;
        }
        public String getCleanSession() {
            return this.cleanSession;
        }

    }

}
