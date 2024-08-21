// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseResponseBody extends TeaModel {
    /**
     * <p>The certificate application repositories.</p>
     */
    @NameInMap("CertWarehouseList")
    public java.util.List<ListCertWarehouseResponseBodyCertWarehouseList> certWarehouseList;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The timestamp when the certificate application repository expires. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The instance ID of the certificate application repository.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the certificate application repository has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <p>The name of the certificate application repository.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The instance ID of the private CA.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1f</p>
         */
        @NameInMap("PcaInstanceId")
        public String pcaInstanceId;

        /**
         * <p>The queries per second (QPS).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The type of the certificate application repository. Valid values:</p>
         * <ul>
         * <li><strong>ssl</strong>: certificate application repository of SSL certificates</li>
         * <li><strong>uploadPCA</strong>: certificate application repository of uploaded private certificates</li>
         * <li><strong>free</strong>: certificate application repository of free certificates, available only on the China site (aliyun.com)</li>
         * <li><strong>aliyunPCA</strong>: certificate application repository of private certificates purchased from Alibaba Cloud Private Certificate Authority (PCA), available only on the China site (aliyun.com)</li>
         * <li><strong>disable</strong>: disabled certificate application repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyunPCA</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the certificate application repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
