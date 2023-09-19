// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The group process information.</p>
     */
    @NameInMap("Resource")
    public CreateGroupMonitoringAgentProcessResponseBodyResource resource;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <br>
     * <p>*   true: The call is successful.</p>
     * <p>*   false: The call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateGroupMonitoringAgentProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupMonitoringAgentProcessResponseBody self = new CreateGroupMonitoringAgentProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupMonitoringAgentProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGroupMonitoringAgentProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGroupMonitoringAgentProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupMonitoringAgentProcessResponseBody setResource(CreateGroupMonitoringAgentProcessResponseBodyResource resource) {
        this.resource = resource;
        return this;
    }
    public CreateGroupMonitoringAgentProcessResponseBodyResource getResource() {
        return this.resource;
    }

    public CreateGroupMonitoringAgentProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGroupMonitoringAgentProcessResponseBodyResource extends TeaModel {
        /**
         * <p>The ID of the group process.</p>
         */
        @NameInMap("GroupProcessId")
        public String groupProcessId;

        public static CreateGroupMonitoringAgentProcessResponseBodyResource build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupMonitoringAgentProcessResponseBodyResource self = new CreateGroupMonitoringAgentProcessResponseBodyResource();
            return TeaModel.build(map, self);
        }

        public CreateGroupMonitoringAgentProcessResponseBodyResource setGroupProcessId(String groupProcessId) {
            this.groupProcessId = groupProcessId;
            return this;
        }
        public String getGroupProcessId() {
            return this.groupProcessId;
        }

    }

}
