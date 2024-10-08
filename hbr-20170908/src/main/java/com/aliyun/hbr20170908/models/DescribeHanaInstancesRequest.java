// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeHanaInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the SAP HANA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cl-0001zfc******50pr3</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz24ikcjyqjkq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the SAP HANA instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeHanaInstancesRequestTag> tag;

    /**
     * <p>The ID of the backup vault.</p>
     * 
     * <strong>example:</strong>
     * <p>v-000b0ov******6zs</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static DescribeHanaInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHanaInstancesRequest self = new DescribeHanaInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHanaInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeHanaInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHanaInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHanaInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHanaInstancesRequest setTag(java.util.List<DescribeHanaInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeHanaInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeHanaInstancesRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

    public static class DescribeHanaInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>ace:rm:rgld</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwutpyat2kwy</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHanaInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeHanaInstancesRequestTag self = new DescribeHanaInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeHanaInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHanaInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
