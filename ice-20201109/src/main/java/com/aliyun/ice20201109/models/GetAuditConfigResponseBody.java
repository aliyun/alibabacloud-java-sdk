// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAuditConfigResponseBody extends TeaModel {
    @NameInMap("Audit")
    public GetAuditConfigResponseBodyAudit audit;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuditConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditConfigResponseBody self = new GetAuditConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditConfigResponseBody setAudit(GetAuditConfigResponseBodyAudit audit) {
        this.audit = audit;
        return this;
    }
    public GetAuditConfigResponseBodyAudit getAudit() {
        return this.audit;
    }

    public GetAuditConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAuditConfigResponseBodyAudit extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LegalSwitch")
        public String legalSwitch;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static GetAuditConfigResponseBodyAudit build(java.util.Map<String, ?> map) throws Exception {
            GetAuditConfigResponseBodyAudit self = new GetAuditConfigResponseBodyAudit();
            return TeaModel.build(map, self);
        }

        public GetAuditConfigResponseBodyAudit setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetAuditConfigResponseBodyAudit setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAuditConfigResponseBodyAudit setLegalSwitch(String legalSwitch) {
            this.legalSwitch = legalSwitch;
            return this;
        }
        public String getLegalSwitch() {
            return this.legalSwitch;
        }

        public GetAuditConfigResponseBodyAudit setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetAuditConfigResponseBodyAudit setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
