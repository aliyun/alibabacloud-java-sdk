// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsDomainNameListResponseBody extends TeaModel {
    /**
     * <p>The list of domain names.</p>
     */
    @NameInMap("DomainNameList")
    public java.util.List<String> domainNameList;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>822B9125-6E1A-551C-8EAF-6E7AE74****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of private DNS domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePrivateDnsDomainNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsDomainNameListResponseBody self = new DescribePrivateDnsDomainNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsDomainNameListResponseBody setDomainNameList(java.util.List<String> domainNameList) {
        this.domainNameList = domainNameList;
        return this;
    }
    public java.util.List<String> getDomainNameList() {
        return this.domainNameList;
    }

    public DescribePrivateDnsDomainNameListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePrivateDnsDomainNameListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePrivateDnsDomainNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrivateDnsDomainNameListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
