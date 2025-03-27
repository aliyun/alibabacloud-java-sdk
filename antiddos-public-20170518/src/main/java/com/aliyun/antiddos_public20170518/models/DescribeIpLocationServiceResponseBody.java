// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeIpLocationServiceResponseBody extends TeaModel {
    /**
     * <p>The details of the asset.</p>
     */
    @NameInMap("Instance")
    public DescribeIpLocationServiceResponseBodyInstance instance;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C728D7E9-9A39-52E0-966B-5C33118BDBB0</p>
     */
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
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cb6x80tfgocid****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>launch-advisor-2021****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: an ECS instance.</li>
         * <li><strong>slb</strong>: an SLB instance.</li>
         * <li><strong>eip</strong>: an EIP.</li>
         * <li><strong>ipv6</strong>: an IPv6 gateway.</li>
         * <li><strong>swas</strong>: a simple application server.</li>
         * <li><strong>waf</strong>: a Web Application Firewall (WAF) instance of the Exclusive edition.</li>
         * <li><strong>ga_basic</strong>: a Global Accelerator (GA) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>121.199.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The region to which the public IP address of the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
