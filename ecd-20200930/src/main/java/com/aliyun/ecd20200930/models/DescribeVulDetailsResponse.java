// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Cves")
    @Validation(required = true)
    public java.util.List<DescribeVulDetailsResponseCves> cves;

    public static DescribeVulDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsResponse self = new DescribeVulDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulDetailsResponse setCves(java.util.List<DescribeVulDetailsResponseCves> cves) {
        this.cves = cves;
        return this;
    }
    public java.util.List<DescribeVulDetailsResponseCves> getCves() {
        return this.cves;
    }

    public static class DescribeVulDetailsResponseCves extends TeaModel {
        @NameInMap("CveId")
        @Validation(required = true)
        public String cveId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("CvssScore")
        @Validation(required = true)
        public String cvssScore;

        @NameInMap("Summary")
        @Validation(required = true)
        public String summary;

        public static DescribeVulDetailsResponseCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDetailsResponseCves self = new DescribeVulDetailsResponseCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDetailsResponseCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDetailsResponseCves setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVulDetailsResponseCves setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public DescribeVulDetailsResponseCves setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

}
