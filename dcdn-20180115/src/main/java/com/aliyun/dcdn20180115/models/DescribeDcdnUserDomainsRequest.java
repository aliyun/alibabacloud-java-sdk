// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserDomainsRequest extends TeaModel {
    @NameInMap("ChangeEndTime")
    public String changeEndTime;

    @NameInMap("ChangeStartTime")
    public String changeStartTime;

    @NameInMap("CheckDomainShow")
    public Boolean checkDomainShow;

    @NameInMap("Coverage")
    public String coverage;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainSearchType")
    public String domainSearchType;

    @NameInMap("DomainStatus")
    public String domainStatus;

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
    public java.util.List<DescribeDcdnUserDomainsRequestTag> tag;

    public static DescribeDcdnUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserDomainsRequest self = new DescribeDcdnUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserDomainsRequest setChangeEndTime(String changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public String getChangeEndTime() {
        return this.changeEndTime;
    }

    public DescribeDcdnUserDomainsRequest setChangeStartTime(String changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public String getChangeStartTime() {
        return this.changeStartTime;
    }

    public DescribeDcdnUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeDcdnUserDomainsRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeDcdnUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeDcdnUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeDcdnUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDcdnUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDcdnUserDomainsRequest setTag(java.util.List<DescribeDcdnUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDcdnUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDcdnUserDomainsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDcdnUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserDomainsRequestTag self = new DescribeDcdnUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDcdnUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
