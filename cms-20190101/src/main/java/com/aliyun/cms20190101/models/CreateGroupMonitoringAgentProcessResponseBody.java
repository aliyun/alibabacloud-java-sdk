// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateGroupMonitoringAgentProcessResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>The status code 200 indicates that the call is successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3F6150F9-45C7-43F9-9578-A58B2E726C90</p>
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
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>7F2B0024-4F21-48B9-A764-211CEC48****</p>
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
