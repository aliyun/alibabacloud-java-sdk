// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListAssetCountResponseBody extends TeaModel {
    @NameInMap("AssetCountList")
    public java.util.List<ListAssetCountResponseBodyAssetCountList> assetCountList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAssetCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCountResponseBody self = new ListAssetCountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAssetCountResponseBody setAssetCountList(java.util.List<ListAssetCountResponseBodyAssetCountList> assetCountList) {
        this.assetCountList = assetCountList;
        return this;
    }
    public java.util.List<ListAssetCountResponseBodyAssetCountList> getAssetCountList() {
        return this.assetCountList;
    }

    public ListAssetCountResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListAssetCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAssetCountResponseBody setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListAssetCountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAssetCountResponseBodyAssetCountList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("AliyunAssetCount")
        public Long aliyunAssetCount;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("CertificateCount")
        public Integer certificateCount;

        /**
         * <strong>example:</strong>
         * <p>1767680115423</p>
         */
        @NameInMap("CountDate")
        public Long countDate;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("DomainAssetCount")
        public Integer domainAssetCount;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("MultiCloudAssetCount")
        public Long multiCloudAssetCount;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Points")
        public Long points;

        public static ListAssetCountResponseBodyAssetCountList build(java.util.Map<String, ?> map) throws Exception {
            ListAssetCountResponseBodyAssetCountList self = new ListAssetCountResponseBodyAssetCountList();
            return TeaModel.build(map, self);
        }

        public ListAssetCountResponseBodyAssetCountList setAliyunAssetCount(Long aliyunAssetCount) {
            this.aliyunAssetCount = aliyunAssetCount;
            return this;
        }
        public Long getAliyunAssetCount() {
            return this.aliyunAssetCount;
        }

        public ListAssetCountResponseBodyAssetCountList setCertificateCount(Integer certificateCount) {
            this.certificateCount = certificateCount;
            return this;
        }
        public Integer getCertificateCount() {
            return this.certificateCount;
        }

        public ListAssetCountResponseBodyAssetCountList setCountDate(Long countDate) {
            this.countDate = countDate;
            return this;
        }
        public Long getCountDate() {
            return this.countDate;
        }

        public ListAssetCountResponseBodyAssetCountList setDomainAssetCount(Integer domainAssetCount) {
            this.domainAssetCount = domainAssetCount;
            return this;
        }
        public Integer getDomainAssetCount() {
            return this.domainAssetCount;
        }

        public ListAssetCountResponseBodyAssetCountList setMultiCloudAssetCount(Long multiCloudAssetCount) {
            this.multiCloudAssetCount = multiCloudAssetCount;
            return this;
        }
        public Long getMultiCloudAssetCount() {
            return this.multiCloudAssetCount;
        }

        public ListAssetCountResponseBodyAssetCountList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

    }

}
