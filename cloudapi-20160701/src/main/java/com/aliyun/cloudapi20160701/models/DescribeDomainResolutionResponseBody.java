// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeDomainResolutionResponseBody extends TeaModel {
    @NameInMap("DomainResolutions")
    public DescribeDomainResolutionResponseBodyDomainResolutions domainResolutions;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainResolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolutionResponseBody self = new DescribeDomainResolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolutionResponseBody setDomainResolutions(DescribeDomainResolutionResponseBodyDomainResolutions domainResolutions) {
        this.domainResolutions = domainResolutions;
        return this;
    }
    public DescribeDomainResolutionResponseBodyDomainResolutions getDomainResolutions() {
        return this.domainResolutions;
    }

    public DescribeDomainResolutionResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDomainResolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainNameResolution")
        public String domainNameResolution;

        public static DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution self = new DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution setDomainNameResolution(String domainNameResolution) {
            this.domainNameResolution = domainNameResolution;
            return this;
        }
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

    }

    public static class DescribeDomainResolutionResponseBodyDomainResolutions extends TeaModel {
        @NameInMap("DomainResolution")
        public java.util.List<DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution> domainResolution;

        public static DescribeDomainResolutionResponseBodyDomainResolutions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResolutionResponseBodyDomainResolutions self = new DescribeDomainResolutionResponseBodyDomainResolutions();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResolutionResponseBodyDomainResolutions setDomainResolution(java.util.List<DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution> domainResolution) {
            this.domainResolution = domainResolution;
            return this;
        }
        public java.util.List<DescribeDomainResolutionResponseBodyDomainResolutionsDomainResolution> getDomainResolution() {
            return this.domainResolution;
        }

    }

}
