// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventDisposeResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeEventDisposeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEventDisposeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventDisposeResponseBody self = new DescribeEventDisposeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventDisposeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEventDisposeResponseBody setData(DescribeEventDisposeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEventDisposeResponseBodyData getData() {
        return this.data;
    }

    public DescribeEventDisposeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventDisposeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventDisposeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventDisposeResponseBodyDataReceiverInfo extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("MessageTitle")
        public String messageTitle;

        @NameInMap("Receiver")
        public String receiver;

        @NameInMap("Status")
        public Integer status;

        public static DescribeEventDisposeResponseBodyDataReceiverInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDisposeResponseBodyDataReceiverInfo self = new DescribeEventDisposeResponseBodyDataReceiverInfo();
            return TeaModel.build(map, self);
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setMessageTitle(String messageTitle) {
            this.messageTitle = messageTitle;
            return this;
        }
        public String getMessageTitle() {
            return this.messageTitle;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public DescribeEventDisposeResponseBodyDataReceiverInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeEventDisposeResponseBodyData extends TeaModel {
        @NameInMap("EventDispose")
        public java.util.List<?> eventDispose;

        @NameInMap("ReceiverInfo")
        public DescribeEventDisposeResponseBodyDataReceiverInfo receiverInfo;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public Integer status;

        public static DescribeEventDisposeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventDisposeResponseBodyData self = new DescribeEventDisposeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEventDisposeResponseBodyData setEventDispose(java.util.List<?> eventDispose) {
            this.eventDispose = eventDispose;
            return this;
        }
        public java.util.List<?> getEventDispose() {
            return this.eventDispose;
        }

        public DescribeEventDisposeResponseBodyData setReceiverInfo(DescribeEventDisposeResponseBodyDataReceiverInfo receiverInfo) {
            this.receiverInfo = receiverInfo;
            return this;
        }
        public DescribeEventDisposeResponseBodyDataReceiverInfo getReceiverInfo() {
            return this.receiverInfo;
        }

        public DescribeEventDisposeResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeEventDisposeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
