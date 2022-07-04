// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpLocationServiceResponseBody extends TeaModel {
    // instance model
    @NameInMap("Instance")
    public DescribeIpLocationServiceResponseBodyInstance instance;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIpLocationServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpLocationServiceResponseBody self = new DescribeIpLocationServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpLocationServiceResponseBody setInstance(DescribeIpLocationServiceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public DescribeIpLocationServiceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public DescribeIpLocationServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIpLocationServiceResponseBodyInstance extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Region")
        public String region;

        public static DescribeIpLocationServiceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpLocationServiceResponseBodyInstance self = new DescribeIpLocationServiceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public DescribeIpLocationServiceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIpLocationServiceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeIpLocationServiceResponseBodyInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeIpLocationServiceResponseBodyInstance setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeIpLocationServiceResponseBodyInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
