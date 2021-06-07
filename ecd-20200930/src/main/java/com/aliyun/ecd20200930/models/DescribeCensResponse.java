// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCensResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Cens")
    @Validation(required = true)
    public java.util.List<DescribeCensResponseCens> cens;

    public static DescribeCensResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensResponse self = new DescribeCensResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCensResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCensResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCensResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCensResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCensResponse setCens(java.util.List<DescribeCensResponseCens> cens) {
        this.cens = cens;
        return this;
    }
    public java.util.List<DescribeCensResponseCens> getCens() {
        return this.cens;
    }

    public static class DescribeCensResponseCensTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeCensResponseCensTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseCensTags self = new DescribeCensResponseCensTags();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseCensTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensResponseCensTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCensResponseCensPackageIds extends TeaModel {
        @NameInMap("PackageId")
        @Validation(required = true)
        public String packageId;

        public static DescribeCensResponseCensPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseCensPackageIds self = new DescribeCensResponseCensPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseCensPackageIds setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

    }

    public static class DescribeCensResponseCens extends TeaModel {
        @NameInMap("CenId")
        @Validation(required = true)
        public String cenId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ProtectionLevel")
        @Validation(required = true)
        public String protectionLevel;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Ipv6Level")
        @Validation(required = true)
        public String ipv6Level;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<DescribeCensResponseCensTags> tags;

        @NameInMap("PackageIds")
        @Validation(required = true)
        public java.util.List<DescribeCensResponseCensPackageIds> packageIds;

        public static DescribeCensResponseCens build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensResponseCens self = new DescribeCensResponseCens();
            return TeaModel.build(map, self);
        }

        public DescribeCensResponseCens setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeCensResponseCens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCensResponseCens setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCensResponseCens setProtectionLevel(String protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        public DescribeCensResponseCens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCensResponseCens setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCensResponseCens setIpv6Level(String ipv6Level) {
            this.ipv6Level = ipv6Level;
            return this;
        }
        public String getIpv6Level() {
            return this.ipv6Level;
        }

        public DescribeCensResponseCens setTags(java.util.List<DescribeCensResponseCensTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCensResponseCensTags> getTags() {
            return this.tags;
        }

        public DescribeCensResponseCens setPackageIds(java.util.List<DescribeCensResponseCensPackageIds> packageIds) {
            this.packageIds = packageIds;
            return this;
        }
        public java.util.List<DescribeCensResponseCensPackageIds> getPackageIds() {
            return this.packageIds;
        }

    }

}
