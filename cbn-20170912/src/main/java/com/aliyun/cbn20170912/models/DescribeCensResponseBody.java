// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensResponseBody extends TeaModel {
    @NameInMap("Cens")
    public DescribeCensResponseBodyCens cens;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CenBandwidthPackageIds")
        public DescribeCensResponseBodyCensCenCenBandwidthPackageIds cenBandwidthPackageIds;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProtectionLevel")
        public String protectionLevel;

        @NameInMap("Status")
        public String status;

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
