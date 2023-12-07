// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainExistResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <br>
     * <p>*   **DomainNotExist**: The domain name is not added.</p>
     * <p>*   **DomainExistOtherUser**: The domain name has been added by another account.</p>
     * <p>*   **DomainExistCdnProduct**: The domain name has been added to Alibaba Cloud CDN.</p>
     * <p>*   **DomainExistDcdnProduct**: The domain name has been added to Dynamic Content Delivery Network (DCDN).</p>
     * <p>*   **DomainExistScdnProduct**: The domain name has been added to Secure CDN (SCDN).</p>
     * <p>*   **DomainExistVodProduct**: The domain name has been added to ApsaraVideo VOD.</p>
     * <p>*   **DomainExistLiveProduct**: The domain name has been added to ApsaraVideo Live.</p>
     * <p>*   **DomainExistDcdnipaProduct**: The domain name has been added to DCDN IP Application Accelerator (IPA).</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckCdnDomainExistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCdnDomainExistResponseBody self = new CheckCdnDomainExistResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCdnDomainExistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCdnDomainExistResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
