// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListLiveRealtimeLogDeliveryDomainsResponseBodyContent content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95D5B69F-8AEC-419B-8F3A-612B35032B0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveRealtimeLogDeliveryDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryDomainsResponseBody self = new ListLiveRealtimeLogDeliveryDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryDomainsResponseBody setContent(ListLiveRealtimeLogDeliveryDomainsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryDomainsResponseBodyContent getContent() {
        return this.content;
    }

    public ListLiveRealtimeLogDeliveryDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Status")
        public String status;

        public static ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains self = new ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLiveRealtimeLogDeliveryDomainsResponseBodyContent extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains;

        public static ListLiveRealtimeLogDeliveryDomainsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryDomainsResponseBodyContent self = new ListLiveRealtimeLogDeliveryDomainsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseBodyContent setDomains(java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseBodyContentDomains> getDomains() {
            return this.domains;
        }

    }

}
