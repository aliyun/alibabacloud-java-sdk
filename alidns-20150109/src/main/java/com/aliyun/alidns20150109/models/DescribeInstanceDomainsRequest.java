// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number to return. The page number starts from 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsRequest self = new DescribeInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
