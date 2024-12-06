// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ListPrivateDNSResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The internal domain name resolutions.</p>
     */
    @NameInMap("PrivateDNSList")
    public java.util.List<ListPrivateDNSResponseBodyPrivateDNSList> privateDNSList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPrivateDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateDNSResponseBody self = new ListPrivateDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateDNSResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPrivateDNSResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrivateDNSResponseBody setPrivateDNSList(java.util.List<ListPrivateDNSResponseBodyPrivateDNSList> privateDNSList) {
        this.privateDNSList = privateDNSList;
        return this;
    }
    public java.util.List<ListPrivateDNSResponseBodyPrivateDNSList> getPrivateDNSList() {
        return this.privateDNSList;
    }

    public ListPrivateDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateDNSResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPrivateDNSResponseBodyPrivateDNSListRecords extends TeaModel {
        /**
         * <p>The resolution record.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Record")
        public String record;

        /**
         * <p>The weight of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListPrivateDNSResponseBodyPrivateDNSListRecords build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateDNSResponseBodyPrivateDNSListRecords self = new ListPrivateDNSResponseBodyPrivateDNSListRecords();
            return TeaModel.build(map, self);
        }

        public ListPrivateDNSResponseBodyPrivateDNSListRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

        public ListPrivateDNSResponseBodyPrivateDNSListRecords setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListPrivateDNSResponseBodyPrivateDNSList extends TeaModel {
        /**
         * <p>The instances that are associated with the resolution.</p>
         */
        @NameInMap("BindInstances")
        public java.util.List<String> bindInstances;

        /**
         * <p>The time when the resolution was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-10T08:17:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The internal domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <p>The resolution records.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListPrivateDNSResponseBodyPrivateDNSListRecords> records;

        /**
         * <p>The internal domain name resolution type. Valid values:</p>
         * <ul>
         * <li>VPC: resolution for VPC access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
         * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPrivateDNSResponseBodyPrivateDNSList build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateDNSResponseBodyPrivateDNSList self = new ListPrivateDNSResponseBodyPrivateDNSList();
            return TeaModel.build(map, self);
        }

        public ListPrivateDNSResponseBodyPrivateDNSList setBindInstances(java.util.List<String> bindInstances) {
            this.bindInstances = bindInstances;
            return this;
        }
        public java.util.List<String> getBindInstances() {
            return this.bindInstances;
        }

        public ListPrivateDNSResponseBodyPrivateDNSList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListPrivateDNSResponseBodyPrivateDNSList setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public ListPrivateDNSResponseBodyPrivateDNSList setRecords(java.util.List<ListPrivateDNSResponseBodyPrivateDNSListRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListPrivateDNSResponseBodyPrivateDNSListRecords> getRecords() {
            return this.records;
        }

        public ListPrivateDNSResponseBodyPrivateDNSList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
