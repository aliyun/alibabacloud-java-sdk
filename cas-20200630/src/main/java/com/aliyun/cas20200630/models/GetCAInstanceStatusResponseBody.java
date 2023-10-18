// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusResponseBody extends TeaModel {
    @NameInMap("InstanceStatusList")
    public java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> instanceStatusList;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCAInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusResponseBody self = new GetCAInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusResponseBody setInstanceStatusList(java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> instanceStatusList) {
        this.instanceStatusList = instanceStatusList;
        return this;
    }
    public java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    public GetCAInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCAInstanceStatusResponseBodyInstanceStatusList extends TeaModel {
        @NameInMap("AfterTime")
        public Long afterTime;

        @NameInMap("BeforeTime")
        public Long beforeTime;

        @NameInMap("CertIssuedCount")
        public Integer certIssuedCount;

        @NameInMap("CertTotalCount")
        public Integer certTotalCount;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseExpireTime")
        public Long useExpireTime;

        public static GetCAInstanceStatusResponseBodyInstanceStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetCAInstanceStatusResponseBodyInstanceStatusList self = new GetCAInstanceStatusResponseBodyInstanceStatusList();
            return TeaModel.build(map, self);
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setAfterTime(Long afterTime) {
            this.afterTime = afterTime;
            return this;
        }
        public Long getAfterTime() {
            return this.afterTime;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setBeforeTime(Long beforeTime) {
            this.beforeTime = beforeTime;
            return this;
        }
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setCertIssuedCount(Integer certIssuedCount) {
            this.certIssuedCount = certIssuedCount;
            return this;
        }
        public Integer getCertIssuedCount() {
            return this.certIssuedCount;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setCertTotalCount(Integer certTotalCount) {
            this.certTotalCount = certTotalCount;
            return this;
        }
        public Integer getCertTotalCount() {
            return this.certTotalCount;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setUseExpireTime(Long useExpireTime) {
            this.useExpireTime = useExpireTime;
            return this;
        }
        public Long getUseExpireTime() {
            return this.useExpireTime;
        }

    }

}
