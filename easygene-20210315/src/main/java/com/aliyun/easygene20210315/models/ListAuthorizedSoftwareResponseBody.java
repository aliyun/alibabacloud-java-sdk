// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Softwares")
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuthorizedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedSoftwareResponseBody self = new ListAuthorizedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedSoftwareResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListAuthorizedSoftwareResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizedSoftwareResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedSoftwareResponseBody setSoftwares(java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares) {
        this.softwares = softwares;
        return this;
    }
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> getSoftwares() {
        return this.softwares;
    }

    public ListAuthorizedSoftwareResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedSoftwareResponseBodySoftwares extends TeaModel {
        @NameInMap("HelpLink")
        public String helpLink;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Locations")
        public java.util.List<String> locations;

        @NameInMap("Promotion")
        public String promotion;

        @NameInMap("SoftwareDefaultVersion")
        public String softwareDefaultVersion;

        @NameInMap("SoftwareDescription")
        public String softwareDescription;

        @NameInMap("SoftwareIcon")
        public String softwareIcon;

        @NameInMap("SoftwareLicenseFee")
        public Float softwareLicenseFee;

        @NameInMap("SoftwareLongName")
        public String softwareLongName;

        @NameInMap("SoftwareName")
        public String softwareName;

        @NameInMap("SoftwareVersions")
        public java.util.List<String> softwareVersions;

        public static ListAuthorizedSoftwareResponseBodySoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedSoftwareResponseBodySoftwares self = new ListAuthorizedSoftwareResponseBodySoftwares();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setHelpLink(String helpLink) {
            this.helpLink = helpLink;
            return this;
        }
        public String getHelpLink() {
            return this.helpLink;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setPromotion(String promotion) {
            this.promotion = promotion;
            return this;
        }
        public String getPromotion() {
            return this.promotion;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDefaultVersion(String softwareDefaultVersion) {
            this.softwareDefaultVersion = softwareDefaultVersion;
            return this;
        }
        public String getSoftwareDefaultVersion() {
            return this.softwareDefaultVersion;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDescription(String softwareDescription) {
            this.softwareDescription = softwareDescription;
            return this;
        }
        public String getSoftwareDescription() {
            return this.softwareDescription;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareIcon(String softwareIcon) {
            this.softwareIcon = softwareIcon;
            return this;
        }
        public String getSoftwareIcon() {
            return this.softwareIcon;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLicenseFee(Float softwareLicenseFee) {
            this.softwareLicenseFee = softwareLicenseFee;
            return this;
        }
        public Float getSoftwareLicenseFee() {
            return this.softwareLicenseFee;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLongName(String softwareLongName) {
            this.softwareLongName = softwareLongName;
            return this;
        }
        public String getSoftwareLongName() {
            return this.softwareLongName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareVersions(java.util.List<String> softwareVersions) {
            this.softwareVersions = softwareVersions;
            return this;
        }
        public java.util.List<String> getSoftwareVersions() {
            return this.softwareVersions;
        }

    }

}
