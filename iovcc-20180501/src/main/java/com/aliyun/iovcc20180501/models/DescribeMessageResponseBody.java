// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeMessageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public DescribeMessageResponseBodyMessage message;

    public static DescribeMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMessageResponseBody self = new DescribeMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMessageResponseBody setMessage(DescribeMessageResponseBodyMessage message) {
        this.message = message;
        return this;
    }
    public DescribeMessageResponseBodyMessage getMessage() {
        return this.message;
    }

    public static class DescribeMessageResponseBodyMessage extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Action")
        public String action;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("PredictSendCnt")
        public Integer predictSendCnt;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("AuditMsg")
        public String auditMsg;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("GmtCreateTime")
        public Long gmtCreateTime;

        @NameInMap("ExipiredTime")
        public Long exipiredTime;

        @NameInMap("AckCnt")
        public Integer ackCnt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Parameter")
        public String parameter;

        @NameInMap("Audit")
        public Integer audit;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SendStatus")
        public Integer sendStatus;

        public static DescribeMessageResponseBodyMessage build(java.util.Map<String, ?> map) throws Exception {
            DescribeMessageResponseBodyMessage self = new DescribeMessageResponseBodyMessage();
            return TeaModel.build(map, self);
        }

        public DescribeMessageResponseBodyMessage setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeMessageResponseBodyMessage setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeMessageResponseBodyMessage setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeMessageResponseBodyMessage setPredictSendCnt(Integer predictSendCnt) {
            this.predictSendCnt = predictSendCnt;
            return this;
        }
        public Integer getPredictSendCnt() {
            return this.predictSendCnt;
        }

        public DescribeMessageResponseBodyMessage setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public DescribeMessageResponseBodyMessage setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeMessageResponseBodyMessage setAuditMsg(String auditMsg) {
            this.auditMsg = auditMsg;
            return this;
        }
        public String getAuditMsg() {
            return this.auditMsg;
        }

        public DescribeMessageResponseBodyMessage setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeMessageResponseBodyMessage setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeMessageResponseBodyMessage setGmtCreateTime(Long gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public Long getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public DescribeMessageResponseBodyMessage setExipiredTime(Long exipiredTime) {
            this.exipiredTime = exipiredTime;
            return this;
        }
        public Long getExipiredTime() {
            return this.exipiredTime;
        }

        public DescribeMessageResponseBodyMessage setAckCnt(Integer ackCnt) {
            this.ackCnt = ackCnt;
            return this;
        }
        public Integer getAckCnt() {
            return this.ackCnt;
        }

        public DescribeMessageResponseBodyMessage setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeMessageResponseBodyMessage setParameter(String parameter) {
            this.parameter = parameter;
            return this;
        }
        public String getParameter() {
            return this.parameter;
        }

        public DescribeMessageResponseBodyMessage setAudit(Integer audit) {
            this.audit = audit;
            return this;
        }
        public Integer getAudit() {
            return this.audit;
        }

        public DescribeMessageResponseBodyMessage setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeMessageResponseBodyMessage setSendStatus(Integer sendStatus) {
            this.sendStatus = sendStatus;
            return this;
        }
        public Integer getSendStatus() {
            return this.sendStatus;
        }

    }

}
