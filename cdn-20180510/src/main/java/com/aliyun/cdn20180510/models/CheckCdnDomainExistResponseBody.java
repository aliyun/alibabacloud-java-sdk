// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CheckCdnDomainExistResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>DomainNotExist</strong>: The domain name is not added.</li>
     * <li><strong>DomainExistOtherUser</strong>: The domain name has been added by another account.</li>
     * <li><strong>DomainExistCdnProduct</strong>: The domain name has been added to Alibaba Cloud CDN.</li>
     * <li><strong>DomainExistDcdnProduct</strong>: The domain name has been added to Dynamic Content Delivery Network (DCDN).</li>
     * <li><strong>DomainExistScdnProduct</strong>: The domain name has been added to Secure CDN (SCDN).</li>
     * <li><strong>DomainExistVodProduct</strong>: The domain name has been added to ApsaraVideo VOD.</li>
     * <li><strong>DomainExistLiveProduct</strong>: The domain name has been added to ApsaraVideo Live.</li>
     * <li><strong>DomainExistDcdnipaProduct</strong>: The domain name has been added to DCDN IP Application Accelerator (IPA).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DomainNotExist</p>
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
