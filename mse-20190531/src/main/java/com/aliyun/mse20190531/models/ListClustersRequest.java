// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClustersRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The alias of the instance. Fuzzy match is supported.
    @NameInMap("ClusterAliasName")
    public String clusterAliasName;

    // The number of the page to return.
    @NameInMap("PageNum")
    public Integer pageNum;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region in which the instance resides. The region is supported by MSE.
    @NameInMap("RegionId")
    public String regionId;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    // The ID of the resource group to which the instance belongs. For more information about resource groups, see the topic "View basic information of a resource group."
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The list of tags. A maximum number of 20 tags are supported.
    @NameInMap("Tag")
    public java.util.List<ListClustersRequestTag> tag;

    public static ListClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClustersRequest self = new ListClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListClustersRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListClustersRequest setClusterAliasName(String clusterAliasName) {
        this.clusterAliasName = clusterAliasName;
        return this;
    }
    public String getClusterAliasName() {
        return this.clusterAliasName;
    }

    public ListClustersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClustersRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListClustersRequest setTag(java.util.List<ListClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class ListClustersRequestTag extends TeaModel {
        // The tag key.
        @NameInMap("Key")
        public String key;

        // The tag value.
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
