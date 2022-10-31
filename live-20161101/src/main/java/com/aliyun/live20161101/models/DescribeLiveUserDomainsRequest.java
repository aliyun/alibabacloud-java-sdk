// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserDomainsRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainSearchType")
    public String domainSearchType;

    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("LiveDomainType")
    public String liveDomainType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionName")
    public String regionName;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<DescribeLiveUserDomainsRequestTag> tag;

    public static DescribeLiveUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserDomainsRequest self = new DescribeLiveUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeLiveUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeLiveUserDomainsRequest setLiveDomainType(String liveDomainType) {
        this.liveDomainType = liveDomainType;
        return this;
    }
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    public DescribeLiveUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLiveUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveUserDomainsRequest setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public DescribeLiveUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeLiveUserDomainsRequest setTag(java.util.List<DescribeLiveUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLiveUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeLiveUserDomainsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeLiveUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveUserDomainsRequestTag self = new DescribeLiveUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
