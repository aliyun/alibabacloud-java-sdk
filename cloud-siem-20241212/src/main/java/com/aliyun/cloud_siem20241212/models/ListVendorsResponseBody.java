// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsResponseBody extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Vendors")
    public java.util.List<ListVendorsResponseBodyVendors> vendors;

    public static ListVendorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVendorsResponseBody self = new ListVendorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVendorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVendorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVendorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVendorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVendorsResponseBody setVendors(java.util.List<ListVendorsResponseBodyVendors> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<ListVendorsResponseBodyVendors> getVendors() {
        return this.vendors;
    }

    public static class ListVendorsResponseBodyVendors extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("VendorId")
        public String vendorId;

        @NameInMap("VendorName")
        public String vendorName;

        @NameInMap("VendorType")
        public String vendorType;

        public static ListVendorsResponseBodyVendors build(java.util.Map<String, ?> map) throws Exception {
            ListVendorsResponseBodyVendors self = new ListVendorsResponseBodyVendors();
            return TeaModel.build(map, self);
        }

        public ListVendorsResponseBodyVendors setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListVendorsResponseBodyVendors setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListVendorsResponseBodyVendors setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

        public ListVendorsResponseBodyVendors setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

        public ListVendorsResponseBodyVendors setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
