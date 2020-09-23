// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListResourceGroupsResponseData> data;

    public static ListResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponse self = new ListResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResourceGroupsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListResourceGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponse setData(java.util.List<ListResourceGroupsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListResourceGroupsResponseData> getData() {
        return this.data;
    }

    public static class ListResourceGroupsResponseData extends TeaModel {
        @NameInMap("Identifier")
        @Validation(required = true)
        public String identifier;

        @NameInMap("Cluster")
        @Validation(required = true)
        public String cluster;

        @NameInMap("BizExtKey")
        @Validation(required = true)
        public String bizExtKey;

        @NameInMap("EnableKp")
        @Validation(required = true)
        public Boolean enableKp;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ResourceGroupType")
        @Validation(required = true)
        public String resourceGroupType;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("Sequence")
        @Validation(required = true)
        public Integer sequence;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Specs")
        @Validation(required = true)
        public java.util.Map<String, ?> specs;

        public static ListResourceGroupsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseData self = new ListResourceGroupsResponseData();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListResourceGroupsResponseData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListResourceGroupsResponseData setBizExtKey(String bizExtKey) {
            this.bizExtKey = bizExtKey;
            return this;
        }
        public String getBizExtKey() {
            return this.bizExtKey;
        }

        public ListResourceGroupsResponseData setEnableKp(Boolean enableKp) {
            this.enableKp = enableKp;
            return this;
        }
        public Boolean getEnableKp() {
            return this.enableKp;
        }

        public ListResourceGroupsResponseData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListResourceGroupsResponseData setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public ListResourceGroupsResponseData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListResourceGroupsResponseData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListResourceGroupsResponseData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListResourceGroupsResponseData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListResourceGroupsResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourceGroupsResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseData setSpecs(java.util.Map<String, ?> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.Map<String, ?> getSpecs() {
            return this.specs;
        }

    }

}
