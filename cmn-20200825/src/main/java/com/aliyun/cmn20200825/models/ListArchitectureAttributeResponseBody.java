// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListArchitectureAttributeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 架构对象
    @NameInMap("Architecture")
    public java.util.List<ListArchitectureAttributeResponseBodyArchitecture> architecture;

    public static ListArchitectureAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArchitectureAttributeResponseBody self = new ListArchitectureAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArchitectureAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListArchitectureAttributeResponseBody setArchitecture(java.util.List<ListArchitectureAttributeResponseBodyArchitecture> architecture) {
        this.architecture = architecture;
        return this;
    }
    public java.util.List<ListArchitectureAttributeResponseBodyArchitecture> getArchitecture() {
        return this.architecture;
    }

    public static class ListArchitectureAttributeResponseBodyArchitecture extends TeaModel {
        // 角色
        @NameInMap("Role")
        public java.util.List<String> role;

        // 厂商
        @NameInMap("Vendor")
        public java.util.List<String> vendor;

        // 型号
        @NameInMap("Model")
        public java.util.List<String> model;

        public static ListArchitectureAttributeResponseBodyArchitecture build(java.util.Map<String, ?> map) throws Exception {
            ListArchitectureAttributeResponseBodyArchitecture self = new ListArchitectureAttributeResponseBodyArchitecture();
            return TeaModel.build(map, self);
        }

        public ListArchitectureAttributeResponseBodyArchitecture setRole(java.util.List<String> role) {
            this.role = role;
            return this;
        }
        public java.util.List<String> getRole() {
            return this.role;
        }

        public ListArchitectureAttributeResponseBodyArchitecture setVendor(java.util.List<String> vendor) {
            this.vendor = vendor;
            return this;
        }
        public java.util.List<String> getVendor() {
            return this.vendor;
        }

        public ListArchitectureAttributeResponseBodyArchitecture setModel(java.util.List<String> model) {
            this.model = model;
            return this;
        }
        public java.util.List<String> getModel() {
            return this.model;
        }

    }

}
