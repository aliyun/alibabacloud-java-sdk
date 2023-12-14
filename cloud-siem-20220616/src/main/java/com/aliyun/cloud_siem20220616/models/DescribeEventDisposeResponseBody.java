// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeEventDisposeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeEventDisposeResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
        /**
         * <p>The channel of the contact information. Valid values:</p>
         * <br>
         * <p>*   message</p>
         * <p>*   mail</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the recipient who receives the event handling result.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the event.</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The message title.</p>
         */
        @NameInMap("MessageTitle")
        public String messageTitle;

        /**
         * <p>The contact information of the recipient.</p>
         */
        @NameInMap("Receiver")
        public String receiver;

        /**
         * <p>Indicates whether the message is sent. Valid values:</p>
         * <br>
         * <p>*   0: not sent</p>
         * <p>*   1: sent</p>
         */
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
        /**
         * <p>An array consisting of JSON objects that are configured for event handling.</p>
         */
        @NameInMap("EventDispose")
        public java.util.List<?> eventDispose;

        /**
         * <p>The JSON object that is configured for an alert recipient.</p>
         */
        @NameInMap("ReceiverInfo")
        public DescribeEventDisposeResponseBodyDataReceiverInfo receiverInfo;

        /**
         * <p>The description of the event.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the event. Valid values:</p>
         * <br>
         * <p>*   0: not handled</p>
         * <p>*   1: handing</p>
         * <p>*   5: handling failed</p>
         * <p>*   10: handled</p>
         */
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
