// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseResponseBody extends TeaModel {
    /**
     * <p>The list of certificate repositories.</p>
     */
    @NameInMap("CertWarehouseList")
    public java.util.List<ListCertWarehouseResponseBodyCertWarehouseList> certWarehouseList;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The expiration time, in timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1665819958000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The sales instance.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1f</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the repository has expired. Valid values:</p>
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
         * <p>The repository name.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The PCA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>14dcc8afc7578e1f</p>
         */
        @NameInMap("PcaInstanceId")
        public String pcaInstanceId;

        /**
         * <p>Qps。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Qps")
        public Long qps;

        /**
         * <p>The repository type. Valid values:</p>
         * <ul>
         * <li><strong>uploadCA</strong>: an uploaded CA certificate that contains a complete certificate chain.</li>
         * <li><strong>uploadPCA</strong>: an uploaded certificate, including a self-signed certificate, a certificate issued by a third party, or a certificate issued by Alibaba Cloud.</li>
         * <li><strong>aliyunPCA</strong>: an Alibaba Cloud PCA certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyunPCA</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The repository ID.</p>
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
