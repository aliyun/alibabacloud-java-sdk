// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsTemplateStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateStatuses")
    public java.util.List<DescribeSmsTemplateStatusResponseBodyTemplateStatuses> templateStatuses;

    public static DescribeSmsTemplateStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsTemplateStatusResponseBody self = new DescribeSmsTemplateStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmsTemplateStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsTemplateStatusResponseBody setTemplateStatuses(java.util.List<DescribeSmsTemplateStatusResponseBodyTemplateStatuses> templateStatuses) {
        this.templateStatuses = templateStatuses;
        return this;
    }
    public java.util.List<DescribeSmsTemplateStatusResponseBodyTemplateStatuses> getTemplateStatuses() {
        return this.templateStatuses;
    }

    public static class DescribeSmsTemplateStatusResponseBodyTemplateStatuses extends TeaModel {
        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateStatus")
        public String templateStatus;

        @NameInMap("Reason")
        public String reason;

        public static DescribeSmsTemplateStatusResponseBodyTemplateStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmsTemplateStatusResponseBodyTemplateStatuses self = new DescribeSmsTemplateStatusResponseBodyTemplateStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSmsTemplateStatusResponseBodyTemplateStatuses setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public DescribeSmsTemplateStatusResponseBodyTemplateStatuses setTemplateStatus(String templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public String getTemplateStatus() {
            return this.templateStatus;
        }

        public DescribeSmsTemplateStatusResponseBodyTemplateStatuses setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
