// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponseBody extends TeaModel {
    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("Cves")
    public java.util.List<DescribeVulDetailsResponseBodyCves> cves;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponseBody self = new DescribeVulDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponseBody setCves(java.util.List<DescribeVulDetailsResponseBodyCves> cves) {
        this.cves = cves;
        return this;
    }
    public java.util.List<DescribeVulDetailsResponseBodyCves> getCves() {
        return this.cves;
    }

    public DescribeVulDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVulDetailsResponseBodyCves extends TeaModel {
        /**
         * <p>The name of the Redhat Package Manager (RPM) package.</p>
         * <br>
         * <p>You can call the [DescribeVulList](~~223907~~) operation to obtain the names of RPM packages.</p>
         */
        @NameInMap("CveId")
        public String cveId;

        @NameInMap("CvssScore")
        public String cvssScore;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Summary")
        public String summary;

        @NameInMap("Title")
        public String title;

        public static DescribeVulDetailsResponseBodyCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseBodyCves self = new DescribeVulDetailsResponseBodyCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseBodyCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDetailsResponseBodyCves setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public DescribeVulDetailsResponseBodyCves setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeVulDetailsResponseBodyCves setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
