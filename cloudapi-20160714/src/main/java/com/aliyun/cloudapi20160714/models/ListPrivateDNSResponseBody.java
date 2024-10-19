// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ListPrivateDNSResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateDNSList")
    public java.util.List<ListPrivateDNSResponseBodyPrivateDNSList> privateDNSList;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ016</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Record")
        public String record;

        /**
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
        @NameInMap("BindInstances")
        public java.util.List<String> bindInstances;

        /**
         * <strong>example:</strong>
         * <p>2023-05-10T08:17:00Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        @NameInMap("Records")
        public java.util.List<ListPrivateDNSResponseBodyPrivateDNSListRecords> records;

        /**
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
