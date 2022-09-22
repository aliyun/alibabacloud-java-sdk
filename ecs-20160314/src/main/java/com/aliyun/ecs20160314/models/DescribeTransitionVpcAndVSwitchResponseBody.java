// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVpcAndVSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VmTransitionModels")
    public VmTransitionModels vmTransitionModels;

    public static DescribeTransitionVpcAndVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVpcAndVSwitchResponseBody self = new DescribeTransitionVpcAndVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVpcAndVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitionVpcAndVSwitchResponseBody setVmTransitionModels(VmTransitionModels vmTransitionModels) {
        this.vmTransitionModels = vmTransitionModels;
        return this;
    }
    public VmTransitionModels getVmTransitionModels() {
        return this.vmTransitionModels;
    }

    public static class Model extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static Model build(java.util.Map<String, ?> map) throws Exception {
            Model self = new Model();
            return TeaModel.build(map, self);
        }

        public Model setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public Model setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public Model setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public Model setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public Model setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class VmTransitionModels extends TeaModel {
        @NameInMap("Model")
        public java.util.List<Model> model;

        public static VmTransitionModels build(java.util.Map<String, ?> map) throws Exception {
            VmTransitionModels self = new VmTransitionModels();
            return TeaModel.build(map, self);
        }

        public VmTransitionModels setModel(java.util.List<Model> model) {
            this.model = model;
            return this;
        }
        public java.util.List<Model> getModel() {
            return this.model;
        }

    }

}
