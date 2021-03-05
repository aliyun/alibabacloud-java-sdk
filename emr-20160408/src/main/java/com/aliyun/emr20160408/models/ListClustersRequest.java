// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("CreateType")
    public String createType;

    @NameInMap("MachineType")
    public String machineType;

    @NameInMap("IsDesc")
    public Boolean isDesc;

    @NameInMap("DepositType")
    public String depositType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DefaultStatus")
    public Boolean defaultStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClusterTypeList")
    public java.util.List<String> clusterTypeList;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    @NameInMap("Tag")
    public java.util.List<ListClustersRequestTag> tag;

    @NameInMap("ExpiredTagList")
    public java.util.List<String> expiredTagList;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClustersRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public ListClustersRequest setMachineType(String machineType) {
        this.machineType = machineType;
        return this;
    }
    public String getMachineType() {
        return this.machineType;
    }

    public ListClustersRequest setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    public ListClustersRequest setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ListClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersRequest setDefaultStatus(Boolean defaultStatus) {
        this.defaultStatus = defaultStatus;
        return this;
    }
    public Boolean getDefaultStatus() {
        return this.defaultStatus;
    }

    public ListClustersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClustersRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListClustersRequest setClusterTypeList(java.util.List<String> clusterTypeList) {
        this.clusterTypeList = clusterTypeList;
        return this;
    }
    public java.util.List<String> getClusterTypeList() {
        return this.clusterTypeList;
    }

    public ListClustersRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListClustersRequest setTag(java.util.List<ListClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListClustersRequestTag> getTag() {
        return this.tag;
    }

    public ListClustersRequest setExpiredTagList(java.util.List<String> expiredTagList) {
        this.expiredTagList = expiredTagList;
        return this;
    }
    public java.util.List<String> getExpiredTagList() {
        return this.expiredTagList;
    }

    public static class ListClustersRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListClustersRequestTag self = new ListClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
