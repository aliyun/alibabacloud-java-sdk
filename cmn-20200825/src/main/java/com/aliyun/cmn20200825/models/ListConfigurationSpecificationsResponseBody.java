// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationSpecificationsResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("ConfigurationSpecification")
    public java.util.List<ListConfigurationSpecificationsResponseBodyConfigurationSpecification> configurationSpecification;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConfigurationSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationSpecificationsResponseBody self = new ListConfigurationSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigurationSpecificationsResponseBody setConfigurationSpecification(java.util.List<ListConfigurationSpecificationsResponseBodyConfigurationSpecification> configurationSpecification) {
        this.configurationSpecification = configurationSpecification;
        return this;
    }
    public java.util.List<ListConfigurationSpecificationsResponseBodyConfigurationSpecification> getConfigurationSpecification() {
        return this.configurationSpecification;
    }

    public ListConfigurationSpecificationsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListConfigurationSpecificationsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListConfigurationSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigurationSpecificationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListConfigurationSpecificationsResponseBodyConfigurationSpecification extends TeaModel {
        // 架构
        @NameInMap("Architecture")
        public String architecture;

        // 配置规范id
        @NameInMap("ConfigurationSpecificationId")
        public String configurationSpecificationId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 型号
        @NameInMap("Model")
        public String model;

        // 相关变量
        @NameInMap("RelatedVariate")
        public java.util.List<String> relatedVariate;

        // 角色
        @NameInMap("Role")
        public String role;

        // 规范内容
        @NameInMap("SpecificationContent")
        public String specificationContent;

        // 配置规范名字
        @NameInMap("SpecificationName")
        public String specificationName;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        public static ListConfigurationSpecificationsResponseBodyConfigurationSpecification build(java.util.Map<String, ?> map) throws Exception {
            ListConfigurationSpecificationsResponseBodyConfigurationSpecification self = new ListConfigurationSpecificationsResponseBodyConfigurationSpecification();
            return TeaModel.build(map, self);
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setConfigurationSpecificationId(String configurationSpecificationId) {
            this.configurationSpecificationId = configurationSpecificationId;
            return this;
        }
        public String getConfigurationSpecificationId() {
            return this.configurationSpecificationId;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setRelatedVariate(java.util.List<String> relatedVariate) {
            this.relatedVariate = relatedVariate;
            return this;
        }
        public java.util.List<String> getRelatedVariate() {
            return this.relatedVariate;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setSpecificationContent(String specificationContent) {
            this.specificationContent = specificationContent;
            return this;
        }
        public String getSpecificationContent() {
            return this.specificationContent;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setSpecificationName(String specificationName) {
            this.specificationName = specificationName;
            return this;
        }
        public String getSpecificationName() {
            return this.specificationName;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListConfigurationSpecificationsResponseBodyConfigurationSpecification setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
