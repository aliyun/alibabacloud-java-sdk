// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVpcsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VpcModels")
    public VpcModels vpcModels;

    public static DescribeTransitionVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVpcsResponseBody self = new DescribeTransitionVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVpcsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTransitionVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitionVpcsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTransitionVpcsResponseBody setVpcModels(VpcModels vpcModels) {
        this.vpcModels = vpcModels;
        return this;
    }
    public VpcModels getVpcModels() {
        return this.vpcModels;
    }

    public static class Model extends TeaModel {
        @NameInMap("Config")
        public String config;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static Model build(java.util.Map<String, ?> map) throws Exception {
            Model self = new Model();
            return TeaModel.build(map, self);
        }

        public Model setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public Model setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Model setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public Model setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public Model setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public Model setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class VpcModels extends TeaModel {
        @NameInMap("Model")
        public java.util.List<Model> model;

        public static VpcModels build(java.util.Map<String, ?> map) throws Exception {
            VpcModels self = new VpcModels();
            return TeaModel.build(map, self);
        }

        public VpcModels setModel(java.util.List<Model> model) {
            this.model = model;
            return this;
        }
        public java.util.List<Model> getModel() {
            return this.model;
        }

    }

}
