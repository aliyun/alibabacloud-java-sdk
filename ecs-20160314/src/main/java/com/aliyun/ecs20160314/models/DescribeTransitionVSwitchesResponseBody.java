// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVSwitchesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VSwitchModels")
    public VSwitchModels vSwitchModels;

    public static DescribeTransitionVSwitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVSwitchesResponseBody self = new DescribeTransitionVSwitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVSwitchesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTransitionVSwitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitionVSwitchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTransitionVSwitchesResponseBody setVSwitchModels(VSwitchModels vSwitchModels) {
        this.vSwitchModels = vSwitchModels;
        return this;
    }
    public VSwitchModels getVSwitchModels() {
        return this.vSwitchModels;
    }

    public static class Model extends TeaModel {
        @NameInMap("CIDR")
        public String CIDR;

        @NameInMap("Description")
        public String description;

        @NameInMap("IzNo")
        public String izNo;

        @NameInMap("Name")
        public String name;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static Model build(java.util.Map<String, ?> map) throws Exception {
            Model self = new Model();
            return TeaModel.build(map, self);
        }

        public Model setCIDR(String CIDR) {
            this.CIDR = CIDR;
            return this;
        }
        public String getCIDR() {
            return this.CIDR;
        }

        public Model setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public Model setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public Model setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class VSwitchModels extends TeaModel {
        @NameInMap("Model")
        public java.util.List<Model> model;

        public static VSwitchModels build(java.util.Map<String, ?> map) throws Exception {
            VSwitchModels self = new VSwitchModels();
            return TeaModel.build(map, self);
        }

        public VSwitchModels setModel(java.util.List<Model> model) {
            this.model = model;
            return this;
        }
        public java.util.List<Model> getModel() {
            return this.model;
        }

    }

}
