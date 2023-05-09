// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> instances;

    /**
     * <p>The CIDR block of the on-demand instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOnDemandInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusResponseBody self = new DescribeOnDemandInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusResponseBody setInstances(java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeOnDemandInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOnDemandInstanceStatusResponseBodyInstances extends TeaModel {
        /**
         * <p>WB269094</p>
         */
        @NameInMap("Declared")
        public String declared;

        @NameInMap("Desc")
        public String desc;

        /**
         * <p>DescribeOnDemandInstanceStatus</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("Mode")
        public String mode;

        @NameInMap("Net")
        public String net;

        /**
         * <p>DescribeOnDemandInstanceStatus</p>
         */
        @NameInMap("RegistedAs")
        public String registedAs;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeOnDemandInstanceStatusResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandInstanceStatusResponseBodyInstances self = new DescribeOnDemandInstanceStatusResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setDeclared(String declared) {
            this.declared = declared;
            return this;
        }
        public String getDeclared() {
            return this.declared;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setRegistedAs(String registedAs) {
            this.registedAs = registedAs;
            return this;
        }
        public String getRegistedAs() {
            return this.registedAs;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
