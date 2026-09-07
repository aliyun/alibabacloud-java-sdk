// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulDesktopsResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page in a paged query.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. An empty value indicates that no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kRxd1mKkNnHlUy14zdjl/I</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of cloud computers affected by the vulnerability.</p>
     */
    @NameInMap("VulDesktops")
    public java.util.List<DescribeVulDesktopsResponseBodyVulDesktops> vulDesktops;

    public static DescribeVulDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDesktopsResponseBody self = new DescribeVulDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDesktopsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVulDesktopsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVulDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulDesktopsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulDesktopsResponseBody setVulDesktops(java.util.List<DescribeVulDesktopsResponseBodyVulDesktops> vulDesktops) {
        this.vulDesktops = vulDesktops;
        return this;
    }
    public java.util.List<DescribeVulDesktopsResponseBodyVulDesktops> getVulDesktops() {
        return this.vulDesktops;
    }

    public static class DescribeVulDesktopsResponseBodyVulDesktopsCves extends TeaModel {
        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-62690</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The vulnerability level.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("CveLevel")
        public String cveLevel;

        /**
         * <p>The vulnerability name.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows Push Notification Elevation of Privilege Vulnerability</p>
         */
        @NameInMap("CveTitle")
        public String cveTitle;

        /**
         * <p>The CVE URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avd.aliyun.com/detail/CVE-2026-62690">https://avd.aliyun.com/detail/CVE-2026-62690</a></p>
         */
        @NameInMap("CveUrl")
        public String cveUrl;

        /**
         * <p>The vulnerability score.</p>
         * 
         * <strong>example:</strong>
         * <p>7.0</p>
         */
        @NameInMap("ImpactScore")
        public String impactScore;

        /**
         * <p>The reference URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://msrc.microsoft.com/update-guide/vulnerability/CVE-2026-62690">https://msrc.microsoft.com/update-guide/vulnerability/CVE-2026-62690</a></p>
         */
        @NameInMap("ReferenceUrl")
        public String referenceUrl;

        /**
         * <p>The release time. The time follows the ISO 8601 standard in UTC: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-11 07:00:00</p>
         */
        @NameInMap("ReleaseTime")
        public String releaseTime;

        public static DescribeVulDesktopsResponseBodyVulDesktopsCves build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDesktopsResponseBodyVulDesktopsCves self = new DescribeVulDesktopsResponseBodyVulDesktopsCves();
            return TeaModel.build(map, self);
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setCveLevel(String cveLevel) {
            this.cveLevel = cveLevel;
            return this;
        }
        public String getCveLevel() {
            return this.cveLevel;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setCveTitle(String cveTitle) {
            this.cveTitle = cveTitle;
            return this;
        }
        public String getCveTitle() {
            return this.cveTitle;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setCveUrl(String cveUrl) {
            this.cveUrl = cveUrl;
            return this;
        }
        public String getCveUrl() {
            return this.cveUrl;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setImpactScore(String impactScore) {
            this.impactScore = impactScore;
            return this;
        }
        public String getImpactScore() {
            return this.impactScore;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setReferenceUrl(String referenceUrl) {
            this.referenceUrl = referenceUrl;
            return this;
        }
        public String getReferenceUrl() {
            return this.referenceUrl;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsCves setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

    }

    public static class DescribeVulDesktopsResponseBodyVulDesktopsFixRecords extends TeaModel {
        /**
         * <p>The batch ID of the scheduled task execution.</p>
         * 
         * <strong>example:</strong>
         * <p>d7f3d7bc-b98b-4da8-95ae-fea21b604b34</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Update failed</p>
         */
        @NameInMap("FixFailureReason")
        public String fixFailureReason;

        /**
         * <p>The fix result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("FixResult")
        public String fixResult;

        /**
         * <p>The timestamp when the fix task ended, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05 13:57:31</p>
         */
        @NameInMap("FixTime")
        public String fixTime;

        /**
         * <p>The fix type.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoTask</p>
         */
        @NameInMap("FixType")
        public String fixType;

        public static DescribeVulDesktopsResponseBodyVulDesktopsFixRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDesktopsResponseBodyVulDesktopsFixRecords self = new DescribeVulDesktopsResponseBodyVulDesktopsFixRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsFixRecords setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsFixRecords setFixFailureReason(String fixFailureReason) {
            this.fixFailureReason = fixFailureReason;
            return this;
        }
        public String getFixFailureReason() {
            return this.fixFailureReason;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsFixRecords setFixResult(String fixResult) {
            this.fixResult = fixResult;
            return this;
        }
        public String getFixResult() {
            return this.fixResult;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsFixRecords setFixTime(String fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public String getFixTime() {
            return this.fixTime;
        }

        public DescribeVulDesktopsResponseBodyVulDesktopsFixRecords setFixType(String fixType) {
            this.fixType = fixType;
            return this;
        }
        public String getFixType() {
            return this.fixType;
        }

    }

    public static class DescribeVulDesktopsResponseBodyVulDesktops extends TeaModel {
        /**
         * <p>The configuration task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0bbay4w7bwbxd****</p>
         */
        @NameInMap("ConfigGroupId")
        public String configGroupId;

        /**
         * <p>The number of vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("CveCount")
        public Integer cveCount;

        /**
         * <p>The list of vulnerability details.</p>
         */
        @NameInMap("Cves")
        public java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsCves> cves;

        /**
         * <p>The ID of the cloud computer affected by the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-0jtd4z5binubxe32e</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>Indicates whether the activation code is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The time when the vulnerability was first discovered.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05 00:00:00</p>
         */
        @NameInMap("FirstFoundTime")
        public String firstFoundTime;

        /**
         * <p>The list of fix records for the cloud computer.</p>
         */
        @NameInMap("FixRecords")
        public java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsFixRecords> fixRecords;

        /**
         * <p>The list of patch IDs.</p>
         */
        @NameInMap("PatchIds")
        public java.util.List<String> patchIds;

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The enterprise resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2tswogr****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The fix status of the patch.</p>
         * 
         * <strong>example:</strong>
         * <p>Fixed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The patch level.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("VulLevel")
        public String vulLevel;

        public static DescribeVulDesktopsResponseBodyVulDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulDesktopsResponseBodyVulDesktops self = new DescribeVulDesktopsResponseBodyVulDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setConfigGroupId(String configGroupId) {
            this.configGroupId = configGroupId;
            return this;
        }
        public String getConfigGroupId() {
            return this.configGroupId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setCveCount(Integer cveCount) {
            this.cveCount = cveCount;
            return this;
        }
        public Integer getCveCount() {
            return this.cveCount;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setCves(java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsCves> cves) {
            this.cves = cves;
            return this;
        }
        public java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsCves> getCves() {
            return this.cves;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setFirstFoundTime(String firstFoundTime) {
            this.firstFoundTime = firstFoundTime;
            return this;
        }
        public String getFirstFoundTime() {
            return this.firstFoundTime;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setFixRecords(java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsFixRecords> fixRecords) {
            this.fixRecords = fixRecords;
            return this;
        }
        public java.util.List<DescribeVulDesktopsResponseBodyVulDesktopsFixRecords> getFixRecords() {
            return this.fixRecords;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setPatchIds(java.util.List<String> patchIds) {
            this.patchIds = patchIds;
            return this;
        }
        public java.util.List<String> getPatchIds() {
            return this.patchIds;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulDesktopsResponseBodyVulDesktops setVulLevel(String vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public String getVulLevel() {
            return this.vulLevel;
        }

    }

}
