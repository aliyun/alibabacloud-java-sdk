// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Cens")
    public java.util.List<DescribeCensResponseBodyCens> cens;

    public static DescribeCensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponseBody self = new DescribeCensResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCensResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeCensResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCensResponseBody setCens(java.util.List<DescribeCensResponseBodyCens> cens) {
        this.cens = cens;
        return this;
    }
    public java.util.List<DescribeCensResponseBodyCens> getCens() {
        return this.cens;
    }

    public static class DescribeCensResponseBodyCensTags extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CenBandwidthPackageIds")
        public java.util.List<String> cenBandwidthPackageIds;

        @NameInMap("Description")
        public String description;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        @NameInMap("Tags")
        public java.util.List<DescribeCensResponseBodyCensTags> tags;

        @NameInMap("Name")
        public String name;

        public static DescribeCensResponseBodyCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseBodyCens self = new DescribeCensResponseBodyCens();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseBodyCens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCensResponseBodyCens setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCensResponseBodyCens setCenBandwidthPackageIds(java.util.List<String> cenBandwidthPackageIds) {
            this.cenBandwidthPackageIds = cenBandwidthPackageIds;
            return this;
        }
        public java.util.List<String> getCenBandwidthPackageIds() {
            return this.cenBandwidthPackageIds;
        }

        public DescribeCensResponseBodyCens setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCensResponseBodyCens setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCensResponseBodyCens setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeCensResponseBodyCens setTags(java.util.List<DescribeCensResponseBodyCensTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCensResponseBodyCensTags> getTags() {
            return this.tags;
        }

        public DescribeCensResponseBodyCens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
