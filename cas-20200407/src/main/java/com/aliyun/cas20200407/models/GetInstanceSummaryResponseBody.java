// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoReissueCount")
    public Integer autoReissueCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CertificateCount")
    public Integer certificateCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InactiveCount")
    public Integer inactiveCount;

    /**
     * <strong>example:</strong>
     * <p>09470F19-CEE8-5C63-BF2C-02B5E3F07A17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WillExpireCount")
    public Integer willExpireCount;

    public static GetInstanceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryResponseBody self = new GetInstanceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryResponseBody setAutoReissueCount(Integer autoReissueCount) {
        this.autoReissueCount = autoReissueCount;
        return this;
    }
    public Integer getAutoReissueCount() {
        return this.autoReissueCount;
    }

    public GetInstanceSummaryResponseBody setCertificateCount(Integer certificateCount) {
        this.certificateCount = certificateCount;
        return this;
    }
    public Integer getCertificateCount() {
        return this.certificateCount;
    }

    public GetInstanceSummaryResponseBody setInactiveCount(Integer inactiveCount) {
        this.inactiveCount = inactiveCount;
        return this;
    }
    public Integer getInactiveCount() {
        return this.inactiveCount;
    }

    public GetInstanceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSummaryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetInstanceSummaryResponseBody setWillExpireCount(Integer willExpireCount) {
        this.willExpireCount = willExpireCount;
        return this;
    }
    public Integer getWillExpireCount() {
        return this.willExpireCount;
    }

}
