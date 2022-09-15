// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseResponseBody extends TeaModel {
    @NameInMap("CertWarehouseList")
    public java.util.List<ListCertWarehouseResponseBodyCertWarehouseList> certWarehouseList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowSize")
    public Long showSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertWarehouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertWarehouseResponseBody self = new ListCertWarehouseResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertWarehouseResponseBody setCertWarehouseList(java.util.List<ListCertWarehouseResponseBodyCertWarehouseList> certWarehouseList) {
        this.certWarehouseList = certWarehouseList;
        return this;
    }
    public java.util.List<ListCertWarehouseResponseBodyCertWarehouseList> getCertWarehouseList() {
        return this.certWarehouseList;
    }

    public ListCertWarehouseResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCertWarehouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertWarehouseResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCertWarehouseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertWarehouseResponseBodyCertWarehouseList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsExpired")
        public Boolean isExpired;

        @NameInMap("Name")
        public String name;

        @NameInMap("PcaInstanceId")
        public String pcaInstanceId;

        @NameInMap("Qps")
        public Long qps;

        @NameInMap("Type")
        public String type;

        @NameInMap("WhId")
        public Long whId;

        public static ListCertWarehouseResponseBodyCertWarehouseList build(java.util.Map<String, ?> map) throws Exception {
            ListCertWarehouseResponseBodyCertWarehouseList self = new ListCertWarehouseResponseBodyCertWarehouseList();
            return TeaModel.build(map, self);
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setPcaInstanceId(String pcaInstanceId) {
            this.pcaInstanceId = pcaInstanceId;
            return this;
        }
        public String getPcaInstanceId() {
            return this.pcaInstanceId;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCertWarehouseResponseBodyCertWarehouseList setWhId(Long whId) {
            this.whId = whId;
            return this;
        }
        public Long getWhId() {
            return this.whId;
        }

    }

}
