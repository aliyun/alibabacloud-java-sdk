// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeVaultsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<DescribeVaultsRequestTag> tag;

    @NameInMap("VaultId")
    public String vaultId;

    @NameInMap("VaultRegionId")
    public String vaultRegionId;

    @NameInMap("VaultType")
    public String vaultType;

    public static DescribeVaultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVaultsRequest self = new DescribeVaultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVaultsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVaultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVaultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVaultsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVaultsRequest setTag(java.util.List<DescribeVaultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVaultsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVaultsRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public DescribeVaultsRequest setVaultRegionId(String vaultRegionId) {
        this.vaultRegionId = vaultRegionId;
        return this;
    }
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    public DescribeVaultsRequest setVaultType(String vaultType) {
        this.vaultType = vaultType;
        return this;
    }
    public String getVaultType() {
        return this.vaultType;
    }

    public static class DescribeVaultsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVaultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVaultsRequestTag self = new DescribeVaultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVaultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVaultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
