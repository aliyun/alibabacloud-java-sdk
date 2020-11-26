// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeOnDemandInstanceStatusResponseInstances> instances;

    public static DescribeOnDemandInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusResponse self = new DescribeOnDemandInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandInstanceStatusResponse setInstances(java.util.List<DescribeOnDemandInstanceStatusResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeOnDemandInstanceStatusResponseInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeOnDemandInstanceStatusResponseInstances extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("Net")
        @Validation(required = true)
        public String net;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RegistedAs")
        @Validation(required = true)
        public String registedAs;

        @NameInMap("Desc")
        @Validation(required = true)
        public String desc;

        @NameInMap("Declared")
        @Validation(required = true)
        public String declared;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        public static DescribeOnDemandInstanceStatusResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandInstanceStatusResponseInstances self = new DescribeOnDemandInstanceStatusResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandInstanceStatusResponseInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setRegistedAs(String registedAs) {
            this.registedAs = registedAs;
            return this;
        }
        public String getRegistedAs() {
            return this.registedAs;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setDeclared(String declared) {
            this.declared = declared;
            return this;
        }
        public String getDeclared() {
            return this.declared;
        }

        public DescribeOnDemandInstanceStatusResponseInstances setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

}
