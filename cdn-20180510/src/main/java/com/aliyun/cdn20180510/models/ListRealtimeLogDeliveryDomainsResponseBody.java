// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public ListRealtimeLogDeliveryDomainsResponseBodyContent content;

    public static ListRealtimeLogDeliveryDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryDomainsResponseBody self = new ListRealtimeLogDeliveryDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRealtimeLogDeliveryDomainsResponseBody setContent(ListRealtimeLogDeliveryDomainsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListRealtimeLogDeliveryDomainsResponseBodyContent getContent() {
        return this.content;
    }

    public static class ListRealtimeLogDeliveryDomainsResponseBodyContentDomains extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DomainName")
        public String domainName;

        public static ListRealtimeLogDeliveryDomainsResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryDomainsResponseBodyContentDomains self = new ListRealtimeLogDeliveryDomainsResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryDomainsResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRealtimeLogDeliveryDomainsResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class ListRealtimeLogDeliveryDomainsResponseBodyContent extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<ListRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains;

        public static ListRealtimeLogDeliveryDomainsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryDomainsResponseBodyContent self = new ListRealtimeLogDeliveryDomainsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryDomainsResponseBodyContent setDomains(java.util.List<ListRealtimeLogDeliveryDomainsResponseBodyContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<ListRealtimeLogDeliveryDomainsResponseBodyContentDomains> getDomains() {
            return this.domains;
        }

    }

}
