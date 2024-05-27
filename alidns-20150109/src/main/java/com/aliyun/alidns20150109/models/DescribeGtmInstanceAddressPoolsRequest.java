// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceAddressPoolsRequest extends TeaModel {
    /**
     * <p>The ID of the GTM instance that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page. Maximum value: **100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGtmInstanceAddressPoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceAddressPoolsRequest self = new DescribeGtmInstanceAddressPoolsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceAddressPoolsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceAddressPoolsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmInstanceAddressPoolsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstanceAddressPoolsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
