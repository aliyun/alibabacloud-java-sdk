// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstancesRequest extends TeaModel {
    /**
     * <p>The keyword that you use for query. Exact match is supported by instance ID or instance name.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether additional information is required. Default value: **false**.</p>
     */
    @NameInMap("NeedDetailAttributes")
    public Boolean needDetailAttributes;

    /**
     * <p>The page number to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeGtmInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstancesRequest self = new DescribeGtmInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstancesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeGtmInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmInstancesRequest setNeedDetailAttributes(Boolean needDetailAttributes) {
        this.needDetailAttributes = needDetailAttributes;
        return this;
    }
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

    public DescribeGtmInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
