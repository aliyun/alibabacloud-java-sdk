// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesRequest extends TeaModel {
    /**
     * <p>The Sorting direction. Values:</p>
     * <p>* **DESC**: Descending (if not specified, the default is descending order)</p>
     * <p>* **ASC**: Ascending</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <br>
     * <p>*   PUBLIC (default): hosted public domain name</p>
     * <p>*   CACHE: cached public domain name</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** : Chinese</p>
     * <p>*   **en** (default) : English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Sorting parameter. Values:</p>
     * <p>* createDate: Sort by creation time (if not specified, the default is to sort by creation time)</p>
     * <p>* expireDate: Sort by expiration time</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The version code of the Alibaba Cloud DNS instance.</p>
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
