// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificatePackageCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{TotalCount=189, RemainCount=94, UsedCount=95}</p>
     */
    @NameInMap("NoticeCountDetail")
    public String noticeCountDetail;

    /**
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;BrandName&quot;: &quot;CFCA&quot;,
     *     &quot;TotalCount&quot;: 14,
     *     &quot;DomainType&quot;: &quot;ONE&quot;,
     *     &quot;RemainCount&quot;: 14,
     *     &quot;ProductCode&quot;: &quot;cfca-ev-1-advanced&quot;,
     *     &quot;CertType&quot;: &quot;EV&quot;,
     *     &quot;ProductId&quot;: 8,
     *     &quot;UsedCount&quot;: 0
     *   }
     * ]</p>
     */
    @NameInMap("ProductCountList")
    public String productCountList;

    /**
     * <strong>example:</strong>
     * <p>{TotalCount=116900, RemainCount=90448, AutoPay=0, AutoPayCount=5000, UsedCount=26452}</p>
     */
    @NameInMap("ProxyCountDetail")
    public String proxyCountDetail;

    /**
     * <strong>example:</strong>
     * <p>08F45EA0-66A7-4504-9B31-3589F5CE308D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{TotalCount=573, RemainCount=243, FreeQuota=10, UsedCount=330}</p>
     */
    @NameInMap("TotalCountDetail")
    public String totalCountDetail;

    /**
     * <strong>example:</strong>
     * <p>{TotalCount=177, ValidCount=6, RemainCount=129, UsedCount=48}</p>
     */
    @NameInMap("TrusteeCountDetail")
    public String trusteeCountDetail;

    public static GetCertificatePackageCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificatePackageCountResponseBody self = new GetCertificatePackageCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificatePackageCountResponseBody setNoticeCountDetail(String noticeCountDetail) {
        this.noticeCountDetail = noticeCountDetail;
        return this;
    }
    public String getNoticeCountDetail() {
        return this.noticeCountDetail;
    }

    public GetCertificatePackageCountResponseBody setProductCountList(String productCountList) {
        this.productCountList = productCountList;
        return this;
    }
    public String getProductCountList() {
        return this.productCountList;
    }

    public GetCertificatePackageCountResponseBody setProxyCountDetail(String proxyCountDetail) {
        this.proxyCountDetail = proxyCountDetail;
        return this;
    }
    public String getProxyCountDetail() {
        return this.proxyCountDetail;
    }

    public GetCertificatePackageCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificatePackageCountResponseBody setTotalCountDetail(String totalCountDetail) {
        this.totalCountDetail = totalCountDetail;
        return this;
    }
    public String getTotalCountDetail() {
        return this.totalCountDetail;
    }

    public GetCertificatePackageCountResponseBody setTrusteeCountDetail(String trusteeCountDetail) {
        this.trusteeCountDetail = trusteeCountDetail;
        return this;
    }
    public String getTrusteeCountDetail() {
        return this.trusteeCountDetail;
    }

}
