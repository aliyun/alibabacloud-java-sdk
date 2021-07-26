// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationSpecificationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 配置规范对象
    @NameInMap("ConfigurationSpecification")
    public GetConfigurationSpecificationResponseBodyConfigurationSpecification configurationSpecification;

    public static GetConfigurationSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationSpecificationResponseBody self = new GetConfigurationSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigurationSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigurationSpecificationResponseBody setConfigurationSpecification(GetConfigurationSpecificationResponseBodyConfigurationSpecification configurationSpecification) {
        this.configurationSpecification = configurationSpecification;
        return this;
    }
    public GetConfigurationSpecificationResponseBodyConfigurationSpecification getConfigurationSpecification() {
        return this.configurationSpecification;
    }

    public static class GetConfigurationSpecificationResponseBodyConfigurationSpecification extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 配置规范资源ID
        @NameInMap("ConfigurationSpecificationId")
        public String configurationSpecificationId;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 配置规范名字
        @NameInMap("SpecificationName")
        public String specificationName;

        // 架构
        @NameInMap("Architecture")
        public String architecture;

        // 角色
        @NameInMap("Role")
        public String role;

        // 型号
        @NameInMap("Mode")
        public String mode;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 规范内容
        @NameInMap("SpecificationContent")
        public String specificationContent;

        // 相关变量
        @NameInMap("RelatedVariate")
        public java.util.List<String> relatedVariate;

        public static GetConfigurationSpecificationResponseBodyConfigurationSpecification build(java.util.Map<String, ?> map) throws Exception {
            GetConfigurationSpecificationResponseBodyConfigurationSpecification self = new GetConfigurationSpecificationResponseBodyConfigurationSpecification();
            return TeaModel.build(map, self);
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setConfigurationSpecificationId(String configurationSpecificationId) {
            this.configurationSpecificationId = configurationSpecificationId;
            return this;
        }
        public String getConfigurationSpecificationId() {
            return this.configurationSpecificationId;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setSpecificationContent(String specificationContent) {
            this.specificationContent = specificationContent;
            return this;
        }
        public String getSpecificationContent() {
            return this.specificationContent;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setRelatedVariate(java.util.List<String> relatedVariate) {
            this.relatedVariate = relatedVariate;
            return this;
        }
        public java.util.List<String> getRelatedVariate() {
            return this.relatedVariate;
        }

    }

}
