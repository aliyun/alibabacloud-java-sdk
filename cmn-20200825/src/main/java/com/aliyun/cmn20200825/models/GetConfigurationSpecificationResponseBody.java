// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationSpecificationResponseBody extends TeaModel {
    @NameInMap("ConfigurationSpecification")
    public GetConfigurationSpecificationResponseBodyConfigurationSpecification configurationSpecification;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigurationSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationSpecificationResponseBody self = new GetConfigurationSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigurationSpecificationResponseBody setConfigurationSpecification(GetConfigurationSpecificationResponseBodyConfigurationSpecification configurationSpecification) {
        this.configurationSpecification = configurationSpecification;
        return this;
    }
    public GetConfigurationSpecificationResponseBodyConfigurationSpecification getConfigurationSpecification() {
        return this.configurationSpecification;
    }

    public GetConfigurationSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigurationSpecificationResponseBodyConfigurationSpecification extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("ConfigurationSpecificationId")
        public String configurationSpecificationId;

        /**
         * <p>代表创建时间的资源属性字段</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("RelatedVariate")
        public java.util.List<String> relatedVariate;

        @NameInMap("Role")
        public String role;

        @NameInMap("SpecificationContent")
        public String specificationContent;

        @NameInMap("SpecificationName")
        public String specificationName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Vendor")
        public String vendor;

        public static GetConfigurationSpecificationResponseBodyConfigurationSpecification build(java.util.Map<String, ?> map) throws Exception {
            GetConfigurationSpecificationResponseBodyConfigurationSpecification self = new GetConfigurationSpecificationResponseBodyConfigurationSpecification();
            return TeaModel.build(map, self);
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setConfigurationSpecificationId(String configurationSpecificationId) {
            this.configurationSpecificationId = configurationSpecificationId;
            return this;
        }
        public String getConfigurationSpecificationId() {
            return this.configurationSpecificationId;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setRelatedVariate(java.util.List<String> relatedVariate) {
            this.relatedVariate = relatedVariate;
            return this;
        }
        public java.util.List<String> getRelatedVariate() {
            return this.relatedVariate;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setSpecificationContent(String specificationContent) {
            this.specificationContent = specificationContent;
            return this;
        }
        public String getSpecificationContent() {
            return this.specificationContent;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetConfigurationSpecificationResponseBodyConfigurationSpecification setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
