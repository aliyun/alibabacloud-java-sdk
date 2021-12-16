// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSLSRealTimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Content")
    public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnSLSRealTimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSLSRealTimeLogDeliveryResponseBody self = new CreateDcdnSLSRealTimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSLSRealTimeLogDeliveryResponseBody setContent(CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public CreateDcdnSLSRealTimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        public static CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains self = new CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains> domains;

        public static CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent self = new CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateDcdnSLSRealTimeLogDeliveryResponseBodyContent setDomains(java.util.List<CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<CreateDcdnSLSRealTimeLogDeliveryResponseBodyContentDomains> getDomains() {
            return this.domains;
        }

    }

}
