// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignStatuses")
    public java.util.List<DescribeSmsSignStatusResponseBodySignStatuses> signStatuses;

    public static DescribeSmsSignStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignStatusResponseBody self = new DescribeSmsSignStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsSignStatusResponseBody setSignStatuses(java.util.List<DescribeSmsSignStatusResponseBodySignStatuses> signStatuses) {
        this.signStatuses = signStatuses;
        return this;
    }
    public java.util.List<DescribeSmsSignStatusResponseBodySignStatuses> getSignStatuses() {
        return this.signStatuses;
    }

    public static class DescribeSmsSignStatusResponseBodySignStatuses extends TeaModel {
        @NameInMap("SignId")
        public String signId;

        @NameInMap("SignStatus")
        public Integer signStatus;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SignName")
        public String signName;

        public static DescribeSmsSignStatusResponseBodySignStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmsSignStatusResponseBodySignStatuses self = new DescribeSmsSignStatusResponseBodySignStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeSmsSignStatusResponseBodySignStatuses setSignId(String signId) {
            this.signId = signId;
            return this;
        }
        public String getSignId() {
            return this.signId;
        }

        public DescribeSmsSignStatusResponseBodySignStatuses setSignStatus(Integer signStatus) {
            this.signStatus = signStatus;
            return this;
        }
        public Integer getSignStatus() {
            return this.signStatus;
        }

        public DescribeSmsSignStatusResponseBodySignStatuses setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeSmsSignStatusResponseBodySignStatuses setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

    }

}
