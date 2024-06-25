// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceResponseBody extends TeaModel {
    /**
     * <p>The returned response code. Valid values:</p>
     * <ul>
     * <li>Success: The request is successful.</li>
     * <li>Other codes: The request failed. For more information about error codes, see Error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateEventSourceResponseBodyData data;

    /**
     * <p>The returned error message.</p>
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
     * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
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
