// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensResponseBody extends TeaModel {
    /**
     * <p>The information about the CEN instance.</p>
     */
    @NameInMap("Cens")
    public DescribeCensResponseBodyCens cens;

    /**
     * <p>The number of the page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BFA6822-240E-4E27-B4C8-AA400EF7474D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponseBody self = new DescribeCensResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCensResponseBody setCens(DescribeCensResponseBodyCens cens) {
        this.cens = cens;
        return this;
    }
    public DescribeCensResponseBodyCens getCens() {
        return this.cens;
    }

    public DescribeCensResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCensResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCensResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCensResponseBodyCensCenCenBandwidthPackageIds extends TeaModel {
        @NameInMap("CenBandwidthPackageId")
        public java.util.List<String> cenBandwidthPackageId;

        public static DescribeCensResponseBodyCensCenCenBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensCenCenBandwidthPackageIds self = new DescribeCensResponseBodyCensCenCenBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensCenCenBandwidthPackageIds setCenBandwidthPackageId(java.util.List<String> cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }
        public java.util.List<String> getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

    }

    public static class DescribeCensResponseBodyCensCenTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCensResponseBodyCensCenTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensCenTagsTag self = new DescribeCensResponseBodyCensCenTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensCenTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensResponseBodyCensCenTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCensResponseBodyCensCenTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCensResponseBodyCensCenTagsTag> tag;

        public static DescribeCensResponseBodyCensCenTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensCenTags self = new DescribeCensResponseBodyCensCenTags();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensCenTags setTag(java.util.List<DescribeCensResponseBodyCensCenTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCensResponseBodyCensCenTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCensResponseBodyCensCen extends TeaModel {
        /**
         * <p>The IDs of the bandwidth plans that are associated with the CEN instance.</p>
         */
        @NameInMap("CenBandwidthPackageIds")
        public DescribeCensResponseBodyCensCenCenBandwidthPackageIds cenBandwidthPackageIds;

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-0xyeagctz5sfg9****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the CEN instance was created.</p>
         * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-22T07:44Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether IPv6 is enabled for the CEN instance.</p>
         * <ul>
         * <li><strong>ENABLE</strong></li>
         * <li><strong>DISABLED</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLED</p>
         */
        @NameInMap("Ipv6Level")
        public String ipv6Level;

        /**
         * <p>The CEN instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The level of CIDR block overlapping.</p>
         * <p><strong>REDUCED</strong>: Overlapped CIDR blocks are allowed. This value specifies that CIDR blocks can overlap but CIDR blocks cannot be duplicates.</p>
         * 
         * <strong>example:</strong>
         * <p>REDUCED</p>
         */
        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        /**
         * <p>The ID of the resource group to which the CEN instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3unpnuw****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the CEN instance.</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Active</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The IDs of the tags that are added to the CEN instance.</p>
         */
        @NameInMap("Tags")
        public DescribeCensResponseBodyCensCenTags tags;

        public static DescribeCensResponseBodyCensCen build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensCen self = new DescribeCensResponseBodyCensCen();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensCen setCenBandwidthPackageIds(DescribeCensResponseBodyCensCenCenBandwidthPackageIds cenBandwidthPackageIds) {
            this.cenBandwidthPackageIds = cenBandwidthPackageIds;
            return this;
        }
        public DescribeCensResponseBodyCensCenCenBandwidthPackageIds getCenBandwidthPackageIds() {
            return this.cenBandwidthPackageIds;
        }

        public DescribeCensResponseBodyCensCen setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCensResponseBodyCensCen setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCensResponseBodyCensCen setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCensResponseBodyCensCen setIpv6Level(String ipv6Level) {
            this.ipv6Level = ipv6Level;
            return this;
        }
        public String getIpv6Level() {
            return this.ipv6Level;
        }

        public DescribeCensResponseBodyCensCen setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCensResponseBodyCensCen setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeCensResponseBodyCensCen setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCensResponseBodyCensCen setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCensResponseBodyCensCen setTags(DescribeCensResponseBodyCensCenTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCensResponseBodyCensCenTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeCensResponseBodyCens extends TeaModel {
        @NameInMap("Cen")
        public java.util.List<DescribeCensResponseBodyCensCen> cen;

        public static DescribeCensResponseBodyCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCens self = new DescribeCensResponseBodyCens();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCens setCen(java.util.List<DescribeCensResponseBodyCensCen> cen) {
            this.cen = cen;
            return this;
        }
        public java.util.List<DescribeCensResponseBodyCensCen> getCen() {
            return this.cen;
        }

    }

}
