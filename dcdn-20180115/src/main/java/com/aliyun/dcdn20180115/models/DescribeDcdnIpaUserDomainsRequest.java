// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnIpaUserDomainsRequest extends TeaModel {
    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainSearchType")
    public String domainSearchType;

    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("FuncFilter")
    public String funcFilter;

    @NameInMap("FuncId")
    public String funcId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<DescribeDcdnIpaUserDomainsRequestTag> tag;

    public static DescribeDcdnIpaUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnIpaUserDomainsRequest self = new DescribeDcdnIpaUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnIpaUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeDcdnIpaUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeDcdnIpaUserDomainsRequest setFuncFilter(String funcFilter) {
        this.funcFilter = funcFilter;
        return this;
    }
    public String getFuncFilter() {
        return this.funcFilter;
    }

    public DescribeDcdnIpaUserDomainsRequest setFuncId(String funcId) {
        this.funcId = funcId;
        return this;
    }
    public String getFuncId() {
        return this.funcId;
    }

    public DescribeDcdnIpaUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnIpaUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnIpaUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnIpaUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDcdnIpaUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDcdnIpaUserDomainsRequest setTag(java.util.List<DescribeDcdnIpaUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDcdnIpaUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDcdnIpaUserDomainsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnIpaUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnIpaUserDomainsRequestTag self = new DescribeDcdnIpaUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnIpaUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnIpaUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
