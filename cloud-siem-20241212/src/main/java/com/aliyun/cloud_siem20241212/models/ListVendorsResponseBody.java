// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListVendorsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57。</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <strong>example:</strong>
         * <p>vd-qlsw5eocx94w9。</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        /**
         * <strong>example:</strong>
         * <p>111。</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        /**
         * <strong>example:</strong>
         * <p>preset。</p>
         */
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
