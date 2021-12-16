// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSLSRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Content")
    public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnSLSRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSLSRealtimeLogDeliveryResponseBody self = new UpdateDcdnSLSRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSLSRealtimeLogDeliveryResponseBody setContent(UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        public static UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains build(java.util.Map<String, ?> map) throws Exception {
            UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains self = new UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains();
            return TeaModel.build(map, self);
        }

        public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent extends TeaModel {
        @NameInMap("Domains")
        public java.util.List<UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains> domains;

        public static UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent self = new UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContent setDomains(java.util.List<UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<UpdateDcdnSLSRealtimeLogDeliveryResponseBodyContentDomains> getDomains() {
            return this.domains;
        }

    }

}
