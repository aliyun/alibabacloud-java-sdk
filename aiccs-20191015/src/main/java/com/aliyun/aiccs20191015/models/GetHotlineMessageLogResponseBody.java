// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Voice messages.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetHotlineMessageLogResponseBodyData> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotlineMessageLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogResponseBody self = new GetHotlineMessageLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineMessageLogResponseBody setData(java.util.List<GetHotlineMessageLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHotlineMessageLogResponseBodyData> getData() {
        return this.data;
    }

    public GetHotlineMessageLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineMessageLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineMessageLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotlineMessageLogResponseBodyData extends TeaModel {
        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100****2077</p>
         */
        @NameInMap("Acid")
        public String acid;

        /**
         * <p>The session content.</p>
         * 
         * <strong>example:</strong>
         * <p>您好。</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1623738027480</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11deca999****</p>
         */
        @NameInMap("Mid")
        public String mid;

        /**
         * <p>The sender type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Membership  </li>
         * <li><strong>2</strong>: Agent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SenderType")
        public Integer senderType;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1623738026460</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetHotlineMessageLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineMessageLogResponseBodyData self = new GetHotlineMessageLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineMessageLogResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

        public GetHotlineMessageLogResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetHotlineMessageLogResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetHotlineMessageLogResponseBodyData setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public GetHotlineMessageLogResponseBodyData setSenderType(Integer senderType) {
            this.senderType = senderType;
            return this;
        }
        public Integer getSenderType() {
            return this.senderType;
        }

        public GetHotlineMessageLogResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
