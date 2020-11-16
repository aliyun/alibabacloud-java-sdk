// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Content")
    @Validation(required = true)
    public ListLiveRealtimeLogDeliveryDomainsResponseContent content;

    public static ListLiveRealtimeLogDeliveryDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryDomainsResponse self = new ListLiveRealtimeLogDeliveryDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse setContent(ListLiveRealtimeLogDeliveryDomainsResponseContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryDomainsResponseContent getContent() {
        return this.content;
    }

    public static class ListLiveRealtimeLogDeliveryDomainsResponseContentDomains extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListLiveRealtimeLogDeliveryDomainsResponseContentDomains build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryDomainsResponseContentDomains self = new ListLiveRealtimeLogDeliveryDomainsResponseContentDomains();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLiveRealtimeLogDeliveryDomainsResponseContent extends TeaModel {
        @NameInMap("Domains")
        @Validation(required = true)
        public java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseContentDomains> domains;

        public static ListLiveRealtimeLogDeliveryDomainsResponseContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryDomainsResponseContent self = new ListLiveRealtimeLogDeliveryDomainsResponseContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryDomainsResponseContent setDomains(java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryDomainsResponseContentDomains> getDomains() {
            return this.domains;
        }

    }

}
