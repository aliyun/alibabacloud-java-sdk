// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li><p><code>Success</code>: The request was successful.</p>
     * </li>
     * <li><p>Other values indicate errors. For more information, see the &quot;Error codes&quot; section.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned by the request.</p>
     */
    @NameInMap("Data")
    public CreateEventSourceResponseBodyData data;

    /**
     * <p>The error message returned if the request is unsuccessful.</p>
     * 
     * <strong>example:</strong>
     * <p>Remote error. requestId: [A8EFABD2-95B9-1C46-9E01-xxxx], error code: [CreateRelatedResourceFailed], message: [Create related resource failed, EntityNotExist.Role : The role not exists: xxxx. \r\nRequestId : xxxx-168C-54ED-8FEB-BF11CB70AEB7]</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2922208e-e1c6-43ee-bfd1-aca50263bc8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of <code>true</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceResponseBody self = new CreateEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventSourceResponseBody setData(CreateEventSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateEventSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventSourceResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventbus/my-event-bus/eventsource/mymns.source</p>
         */
        @NameInMap("EventSourceARN")
        public String eventSourceARN;

        public static CreateEventSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceResponseBodyData self = new CreateEventSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceResponseBodyData setEventSourceARN(String eventSourceARN) {
            this.eventSourceARN = eventSourceARN;
            return this;
        }
        public String getEventSourceARN() {
            return this.eventSourceARN;
        }

    }

}
