// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumOrderersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeConsortiumOrderersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumOrderersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumOrderersResponseBody self = new DescribeConsortiumOrderersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumOrderersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumOrderersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumOrderersResponseBody setResult(java.util.List<DescribeConsortiumOrderersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumOrderersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumOrderersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumOrderersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>ecs.n1.small</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>order1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>7050</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>1544411108000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeConsortiumOrderersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumOrderersResponseBodyResult self = new DescribeConsortiumOrderersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumOrderersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeConsortiumOrderersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeConsortiumOrderersResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeConsortiumOrderersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConsortiumOrderersResponseBodyResult setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeConsortiumOrderersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
