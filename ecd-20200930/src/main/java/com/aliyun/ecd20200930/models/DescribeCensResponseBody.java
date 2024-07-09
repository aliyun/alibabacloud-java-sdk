// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCensResponseBody extends TeaModel {
    /**
     * <p>Details of the CEN instances.</p>
     */
    @NameInMap("Cens")
    public java.util.List<DescribeCensResponseBodyCens> cens;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of CEN instances returned.</p>
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

    public DescribeCensResponseBody setCens(java.util.List<DescribeCensResponseBodyCens> cens) {
        this.cens = cens;
        return this;
    }
    public java.util.List<DescribeCensResponseBodyCens> getCens() {
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

    public static class DescribeCensResponseBodyCensPackageIds extends TeaModel {
        /**
         * <p>The ID of the bandwidth plan that is bound to the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cenbwp-4c2zaavbvh5f42****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        public static DescribeCensResponseBodyCensPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensPackageIds self = new DescribeCensResponseBodyCensPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensPackageIds setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

    }

    public static class DescribeCensResponseBodyCensTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCensResponseBodyCensTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCensTags self = new DescribeCensResponseBodyCensTags();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCensTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensResponseBodyCensTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCensResponseBodyCens extends TeaModel {
        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-3gwy16dojz1m65****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the CEN instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-16T08:46Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IPv6 level.</p>
         * <blockquote>
         * <p> IPv6 is not supported.</p>
         * </blockquote>
         * <p>Valid value:</p>
         * <ul>
         * <li><p>DISABLED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISABLED</p>
         */
        @NameInMap("Ipv6Level")
        public String ipv6Level;

        /**
         * <p>The name of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testCen</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The bandwidth plans that are bound to the CEN instance.</p>
         */
        @NameInMap("PackageIds")
        public java.util.List<DescribeCensResponseBodyCensPackageIds> packageIds;

        /**
         * <p>The tolerated level of CIDR block conflict.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>REDUCED: CIDR block conflicts are allowed, but the conflicting CIDR blocks cannot be identical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REDUCED</p>
         */
        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        /**
         * <p>The status of the CEN instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Creating</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Active</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Deleting</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the CEN instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeCensResponseBodyCensTags> tags;

        public static DescribeCensResponseBodyCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCens self = new DescribeCensResponseBodyCens();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCens setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCensResponseBodyCens setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCensResponseBodyCens setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCensResponseBodyCens setIpv6Level(String ipv6Level) {
            this.ipv6Level = ipv6Level;
            return this;
        }
        public String getIpv6Level() {
            return this.ipv6Level;
        }

        public DescribeCensResponseBodyCens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCensResponseBodyCens setPackageIds(java.util.List<DescribeCensResponseBodyCensPackageIds> packageIds) {
            this.packageIds = packageIds;
            return this;
        }
        public java.util.List<DescribeCensResponseBodyCensPackageIds> getPackageIds() {
            return this.packageIds;
        }

        public DescribeCensResponseBodyCens setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeCensResponseBodyCens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCensResponseBodyCens setTags(java.util.List<DescribeCensResponseBodyCensTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCensResponseBodyCensTags> getTags() {
            return this.tags;
        }

    }

}
