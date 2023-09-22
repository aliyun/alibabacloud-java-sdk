// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The version code of the Alibaba Cloud DNS instance.</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The total number of domain names.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    public static DescribeDnsProductInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstancesRequest self = new DescribeDnsProductInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstancesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeDnsProductInstancesRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDnsProductInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsProductInstancesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeDnsProductInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsProductInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsProductInstancesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeDnsProductInstancesRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
