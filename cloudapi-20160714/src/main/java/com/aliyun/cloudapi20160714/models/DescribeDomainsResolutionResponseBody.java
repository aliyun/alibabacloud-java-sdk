// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDomainsResolutionResponseBody extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainResolutions")
    public DescribeDomainsResolutionResponseBodyDomainResolutions domainResolutions;

    public static DescribeDomainsResolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResolutionResponseBody self = new DescribeDomainsResolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResolutionResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainsResolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResolutionResponseBody setDomainResolutions(DescribeDomainsResolutionResponseBodyDomainResolutions domainResolutions) {
        this.domainResolutions = domainResolutions;
        return this;
    }
    public DescribeDomainsResolutionResponseBodyDomainResolutions getDomainResolutions() {
        return this.domainResolutions;
    }

    public static class DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution extends TeaModel {
        @NameInMap("DomainResolutionStatus")
        public String domainResolutionStatus;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution self = new DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution setDomainResolutionStatus(String domainResolutionStatus) {
            this.domainResolutionStatus = domainResolutionStatus;
            return this;
        }
        public String getDomainResolutionStatus() {
            return this.domainResolutionStatus;
        }

        public DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeDomainsResolutionResponseBodyDomainResolutions extends TeaModel {
        @NameInMap("DomainResolution")
        public java.util.List<DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution> domainResolution;

        public static DescribeDomainsResolutionResponseBodyDomainResolutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResolutionResponseBodyDomainResolutions self = new DescribeDomainsResolutionResponseBodyDomainResolutions();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResolutionResponseBodyDomainResolutions setDomainResolution(java.util.List<DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution> domainResolution) {
            this.domainResolution = domainResolution;
            return this;
        }
        public java.util.List<DescribeDomainsResolutionResponseBodyDomainResolutionsDomainResolution> getDomainResolution() {
            return this.domainResolution;
        }

    }

}
