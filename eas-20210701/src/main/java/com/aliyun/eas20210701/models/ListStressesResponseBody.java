// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListStressesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stresses")
    public java.util.List<ListStressesResponseBodyStresses> stresses;

    public static ListStressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStressesResponseBody self = new ListStressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStressesResponseBody setStresses(java.util.List<ListStressesResponseBodyStresses> stresses) {
        this.stresses = stresses;
        return this;
    }
    public java.util.List<ListStressesResponseBodyStresses> getStresses() {
        return this.stresses;
    }

    public static class ListStressesResponseBodyStresses extends TeaModel {
        @NameInMap("AvailableAgent")
        public Long availableAgent;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        @NameInMap("StressName")
        public String stressName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStressesResponseBodyStresses build(java.util.Map<String, ?> map) throws Exception {
            ListStressesResponseBodyStresses self = new ListStressesResponseBodyStresses();
            return TeaModel.build(map, self);
        }

        public ListStressesResponseBodyStresses setAvailableAgent(Long availableAgent) {
            this.availableAgent = availableAgent;
            return this;
        }
        public Long getAvailableAgent() {
            return this.availableAgent;
        }

        public ListStressesResponseBodyStresses setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStressesResponseBodyStresses setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListStressesResponseBodyStresses setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListStressesResponseBodyStresses setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListStressesResponseBodyStresses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStressesResponseBodyStresses setStressName(String stressName) {
            this.stressName = stressName;
            return this;
        }
        public String getStressName() {
            return this.stressName;
        }

        public ListStressesResponseBodyStresses setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
