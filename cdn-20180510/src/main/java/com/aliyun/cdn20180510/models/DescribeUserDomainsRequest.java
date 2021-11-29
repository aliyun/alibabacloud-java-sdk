// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserDomainsRequest extends TeaModel {
    @NameInMap("CdnType")
    public String cdnType;

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

    @NameInMap("Source")
    public String source;

    @NameInMap("Tag")
    public java.util.List<DescribeUserDomainsRequestTag> tag;

    public static DescribeUserDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDomainsRequest self = new DescribeUserDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserDomainsRequest setCdnType(String cdnType) {
        this.cdnType = cdnType;
        return this;
    }
    public String getCdnType() {
        return this.cdnType;
    }

    public DescribeUserDomainsRequest setChangeEndTime(String changeEndTime) {
        this.changeEndTime = changeEndTime;
        return this;
    }
    public String getChangeEndTime() {
        return this.changeEndTime;
    }

    public DescribeUserDomainsRequest setChangeStartTime(String changeStartTime) {
        this.changeStartTime = changeStartTime;
        return this;
    }
    public String getChangeStartTime() {
        return this.changeStartTime;
    }

    public DescribeUserDomainsRequest setCheckDomainShow(Boolean checkDomainShow) {
        this.checkDomainShow = checkDomainShow;
        return this;
    }
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    public DescribeUserDomainsRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeUserDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeUserDomainsRequest setDomainSearchType(String domainSearchType) {
        this.domainSearchType = domainSearchType;
        return this;
    }
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    public DescribeUserDomainsRequest setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescribeUserDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserDomainsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeUserDomainsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeUserDomainsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeUserDomainsRequest setTag(java.util.List<DescribeUserDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeUserDomainsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeUserDomainsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeUserDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserDomainsRequestTag self = new DescribeUserDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeUserDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeUserDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
