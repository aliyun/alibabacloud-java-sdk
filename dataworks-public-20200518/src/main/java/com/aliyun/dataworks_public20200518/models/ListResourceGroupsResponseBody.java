// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListResourceGroupsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setData(java.util.List<ListResourceGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListResourceGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListResourceGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListResourceGroupsResponseBodyData extends TeaModel {
        @NameInMap("BizExtKey")
        public String bizExtKey;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableKp")
        public Boolean enableKp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Identifier")
        public String identifier;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("ResourceGroupType")
        public String resourceGroupType;

        @NameInMap("Sequence")
        public Integer sequence;

        @NameInMap("Specs")
        public java.util.Map<String, ?> specs;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListResourceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsResponseBodyData self = new ListResourceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsResponseBodyData setBizExtKey(String bizExtKey) {
            this.bizExtKey = bizExtKey;
            return this;
        }
        public String getBizExtKey() {
            return this.bizExtKey;
        }

        public ListResourceGroupsResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListResourceGroupsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceGroupsResponseBodyData setEnableKp(Boolean enableKp) {
            this.enableKp = enableKp;
            return this;
        }
        public Boolean getEnableKp() {
            return this.enableKp;
        }

        public ListResourceGroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListResourceGroupsResponseBodyData setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListResourceGroupsResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListResourceGroupsResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListResourceGroupsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceGroupsResponseBodyData setResourceGroupType(String resourceGroupType) {
            this.resourceGroupType = resourceGroupType;
            return this;
        }
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        public ListResourceGroupsResponseBodyData setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListResourceGroupsResponseBodyData setSpecs(java.util.Map<String, ?> specs) {
            this.specs = specs;
            return this;
        }
        public java.util.Map<String, ?> getSpecs() {
            return this.specs;
        }

        public ListResourceGroupsResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListResourceGroupsResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListResourceGroupsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
