// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationSpecificationsResponseBody extends TeaModel {
    @NameInMap("ConfigurationSpecification")
    public java.util.List<ListConfigurationSpecificationsResponseBodyConfigurationSpecification> configurationSpecification;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("ConfigurationSpecificationId")
        public String configurationSpecificationId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Model")
        public String model;

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
