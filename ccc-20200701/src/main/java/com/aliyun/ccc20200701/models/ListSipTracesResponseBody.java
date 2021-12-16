// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipTracesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSipTracesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSipTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipTracesResponseBody self = new ListSipTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipTracesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipTracesResponseBody setData(java.util.List<ListSipTracesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSipTracesResponseBodyData> getData() {
        return this.data;
    }

    public ListSipTracesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSipTracesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSipTracesResponseBodyData extends TeaModel {
        @NameInMap("CallId")
        public String callId;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("DestinationNodeIp")
        public String destinationNodeIp;

        @NameInMap("FirstLine")
        public String firstLine;

        @NameInMap("Payload")
        public String payload;

        @NameInMap("SourceNodeIp")
        public String sourceNodeIp;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static ListSipTracesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSipTracesResponseBodyData self = new ListSipTracesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSipTracesResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListSipTracesResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListSipTracesResponseBodyData setDestinationNodeIp(String destinationNodeIp) {
            this.destinationNodeIp = destinationNodeIp;
            return this;
        }
        public String getDestinationNodeIp() {
            return this.destinationNodeIp;
        }

        public ListSipTracesResponseBodyData setFirstLine(String firstLine) {
            this.firstLine = firstLine;
            return this;
        }
        public String getFirstLine() {
            return this.firstLine;
        }

        public ListSipTracesResponseBodyData setPayload(String payload) {
            this.payload = payload;
            return this;
        }
        public String getPayload() {
            return this.payload;
        }

        public ListSipTracesResponseBodyData setSourceNodeIp(String sourceNodeIp) {
            this.sourceNodeIp = sourceNodeIp;
            return this;
        }
        public String getSourceNodeIp() {
            return this.sourceNodeIp;
        }

        public ListSipTracesResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
