// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class QuerySmsUpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsUps")
    public java.util.List<QuerySmsUpsResponseBodySmsUps> smsUps;

    @NameInMap("TotalElements")
    public Long totalElements;

    public static QuerySmsUpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsUpsResponseBody self = new QuerySmsUpsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsUpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsUpsResponseBody setSmsUps(java.util.List<QuerySmsUpsResponseBodySmsUps> smsUps) {
        this.smsUps = smsUps;
        return this;
    }
    public java.util.List<QuerySmsUpsResponseBodySmsUps> getSmsUps() {
        return this.smsUps;
    }

    public QuerySmsUpsResponseBody setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    public Long getTotalElements() {
        return this.totalElements;
    }

    public static class QuerySmsUpsResponseBodySmsUps extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("DestCode")
        public String destCode;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("SendTime")
        public String sendTime;

        @NameInMap("SequenceId")
        public String sequenceId;

        @NameInMap("TenantId")
        public String tenantId;

        public static QuerySmsUpsResponseBodySmsUps build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsUpsResponseBodySmsUps self = new QuerySmsUpsResponseBodySmsUps();
            return TeaModel.build(map, self);
        }

        public QuerySmsUpsResponseBodySmsUps setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QuerySmsUpsResponseBodySmsUps setDestCode(String destCode) {
            this.destCode = destCode;
            return this;
        }
        public String getDestCode() {
            return this.destCode;
        }

        public QuerySmsUpsResponseBodySmsUps setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QuerySmsUpsResponseBodySmsUps setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public QuerySmsUpsResponseBodySmsUps setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public QuerySmsUpsResponseBodySmsUps setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
