// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumOrderersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumOrderersResponseBodyResult> result;

    public static DescribeFabricConsortiumOrderersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumOrderersResponseBody self = new DescribeFabricConsortiumOrderersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumOrderersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumOrderersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumOrderersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumOrderersResponseBody setResult(java.util.List<DescribeFabricConsortiumOrderersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumOrderersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumOrderersResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("OrdererName")
        public String ordererName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeFabricConsortiumOrderersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumOrderersResponseBodyResult self = new DescribeFabricConsortiumOrderersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setOrdererName(String ordererName) {
            this.ordererName = ordererName;
            return this;
        }
        public String getOrdererName() {
            return this.ordererName;
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeFabricConsortiumOrderersResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
