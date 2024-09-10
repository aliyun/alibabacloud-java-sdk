// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>ba6d88e2-a6f2-4d2c-a2ae-68b76b078445</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Softwares")
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/document_detail/257750.html">https://help.aliyun.com/document_detail/257750.html</a></p>
         */
        @NameInMap("HelpLink")
        public String helpLink;

        /**
         * <strong>example:</strong>
         * <p>yyyy/MM/dd HH:mm:ss</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Locations")
        public java.util.List<String> locations;

        @NameInMap("Promotion")
        public String promotion;

        /**
         * <strong>example:</strong>
         * <p>201911</p>
         */
        @NameInMap("SoftwareDefaultVersion")
        public String softwareDefaultVersion;

        /**
         * <strong>example:</strong>
         * <p>NGS数据二级分析软件，提供基于CPU的加速方案，可替代BWA，GATK，HaplotypeCaller，Mutect和Mutect2等分析流程。包括DNASeq，DNAScope，TNScope等工具</p>
         */
        @NameInMap("SoftwareDescription")
        public String softwareDescription;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i2/O1CN01mmZovA1UJfeKQAYvF_!!6000000002497-2-tps-256-256.png">https://img.alicdn.com/imgextra/i2/O1CN01mmZovA1UJfeKQAYvF_!!6000000002497-2-tps-256-256.png</a></p>
         */
        @NameInMap("SoftwareIcon")
        public String softwareIcon;

        /**
         * <strong>example:</strong>
         * <p>0.15</p>
         */
        @NameInMap("SoftwareLicenseFee")
        public Float softwareLicenseFee;

        /**
         * <strong>example:</strong>
         * <p>Sentieon加速软件</p>
         */
        @NameInMap("SoftwareLongName")
        public String softwareLongName;

        /**
         * <strong>example:</strong>
         * <p>sentieon</p>
         */
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
