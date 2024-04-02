// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteScanResultDetailResponseBody extends TeaModel {
    @NameInMap("Baseline")
    public String baseline;

    @NameInMap("Content")
    public String content;

    @NameInMap("HitKeywords")
    public java.util.List<String> hitKeywords;

    @NameInMap("ImageScanResults")
    public java.util.List<DescribeWebsiteScanResultDetailResponseBodyImageScanResults> imageScanResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TamperedSource")
    public String tamperedSource;

    public static DescribeWebsiteScanResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteScanResultDetailResponseBody self = new DescribeWebsiteScanResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteScanResultDetailResponseBody setBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }
    public String getBaseline() {
        return this.baseline;
    }

    public DescribeWebsiteScanResultDetailResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeWebsiteScanResultDetailResponseBody setHitKeywords(java.util.List<String> hitKeywords) {
        this.hitKeywords = hitKeywords;
        return this;
    }
    public java.util.List<String> getHitKeywords() {
        return this.hitKeywords;
    }

    public DescribeWebsiteScanResultDetailResponseBody setImageScanResults(java.util.List<DescribeWebsiteScanResultDetailResponseBodyImageScanResults> imageScanResults) {
        this.imageScanResults = imageScanResults;
        return this;
    }
    public java.util.List<DescribeWebsiteScanResultDetailResponseBodyImageScanResults> getImageScanResults() {
        return this.imageScanResults;
    }

    public DescribeWebsiteScanResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebsiteScanResultDetailResponseBody setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeWebsiteScanResultDetailResponseBody setTamperedSource(String tamperedSource) {
        this.tamperedSource = tamperedSource;
        return this;
    }
    public String getTamperedSource() {
        return this.tamperedSource;
    }

    public static class DescribeWebsiteScanResultDetailResponseBodyImageScanResults extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Url")
        public String url;

        public static DescribeWebsiteScanResultDetailResponseBodyImageScanResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebsiteScanResultDetailResponseBodyImageScanResults self = new DescribeWebsiteScanResultDetailResponseBodyImageScanResults();
            return TeaModel.build(map, self);
        }

        public DescribeWebsiteScanResultDetailResponseBodyImageScanResults setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public DescribeWebsiteScanResultDetailResponseBodyImageScanResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
