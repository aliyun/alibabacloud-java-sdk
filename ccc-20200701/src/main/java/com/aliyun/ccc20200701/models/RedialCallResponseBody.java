// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RedialCallResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of &quot;OK&quot; indicates that the request succeeded. For other error codes, see the error code list.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public RedialCallResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>List of response parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF268B34-09C2-43FD-BAC4-5D31EA63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RedialCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedialCallResponseBody self = new RedialCallResponseBody();
        return TeaModel.build(map, self);
    }

    public RedialCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RedialCallResponseBody setData(RedialCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RedialCallResponseBodyData getData() {
        return this.data;
    }

    public RedialCallResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RedialCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RedialCallResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public RedialCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RedialCallResponseBodyDataCallContextChannelContexts extends TeaModel {
        /**
         * <p>The call type of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Call channel flags.</p>
         * 
         * <strong>example:</strong>
         * <p>COACHING</p>
         */
        @NameInMap("ChannelFlags")
        public String channelFlags;

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-653821410368****</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The status of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("ChannelState")
        public String channelState;

        /**
         * <p>The callee of the voice channel.</p>
         * 
         * <strong>example:</strong>
         * <p>8001****</p>
         */
        @NameInMap("Destination")
        public String destination;

        /**
         * <p>Call job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The calling party of the call channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1318888****</p>
         */
        @NameInMap("Originator")
        public String originator;

        /**
         * <p>The party that initiated the hang-up of the call channel, indicating who first terminated the call.</p>
         * 
         * <strong>example:</strong>
         * <p>139xxxx0501</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The release reason of the voice channel, indicating why the current voice channel was released. The value is derived from the response codes defined in the SIP protocol. Customers can refer to the SIP protocol to analyze the release reason.</p>
         * 
         * <strong>example:</strong>
         * <p>486:USER_BUSY</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>UNIX timestamp of the last status change.</p>
         * 
         * <strong>example:</strong>
         * <p>1609138903315</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>User extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8000****</p>
         */
        @NameInMap("UserExtension")
        public String userExtension;

        /**
         * <p>Agent User ID information.</p>
         * 
         * <strong>example:</strong>
         * <p>samzhang@abc</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RedialCallResponseBodyDataCallContextChannelContexts build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataCallContextChannelContexts self = new RedialCallResponseBodyDataCallContextChannelContexts();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelFlags(String channelFlags) {
            this.channelFlags = channelFlags;
            return this;
        }
        public String getChannelFlags() {
            return this.channelFlags;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setChannelState(String channelState) {
            this.channelState = channelState;
            return this;
        }
        public String getChannelState() {
            return this.channelState;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setOriginator(String originator) {
            this.originator = originator;
            return this;
        }
        public String getOriginator() {
            return this.originator;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setUserExtension(String userExtension) {
            this.userExtension = userExtension;
            return this;
        }
        public String getUserExtension() {
            return this.userExtension;
        }

        public RedialCallResponseBodyDataCallContextChannelContexts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class RedialCallResponseBodyDataCallContext extends TeaModel {
        /**
         * <p>The call type, indicating the type of the call when it was initially initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>The list of call channels.</p>
         */
        @NameInMap("ChannelContexts")
        public java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> channelContexts;

        /**
         * <p>Cloud Contact Center instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The call job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static RedialCallResponseBodyDataCallContext build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataCallContext self = new RedialCallResponseBodyDataCallContext();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataCallContext setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public RedialCallResponseBodyDataCallContext setChannelContexts(java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> channelContexts) {
            this.channelContexts = channelContexts;
            return this;
        }
        public java.util.List<RedialCallResponseBodyDataCallContextChannelContexts> getChannelContexts() {
            return this.channelContexts;
        }

        public RedialCallResponseBodyDataCallContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RedialCallResponseBodyDataCallContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class RedialCallResponseBodyDataUserContext extends TeaModel {
        /**
         * <p>Break status code, which is divided into system-defined and customer-defined types.</p>
         * <p>System-defined break codes:</p>
         * <ul>
         * <li><p>Warm-up: A temporary break state after an agent is published but before becoming idle.</p>
         * </li>
         * <li><p>RingingTimeout: A break caused by ringing timeout for the agent.</p>
         * </li>
         * <li><p>RejectCall: A break caused by the agent rejecting a call.</p>
         * </li>
         * </ul>
         * <p>There are no restrictions on customer-defined status codes. Customers can define them according to their business needs.</p>
         * 
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Device ID, which is the identity of a browser-based Web Real-Time Communication (WebRTC) softphone or a physical phone device. Only one type of device can be registered at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>CCC-x.x.x.x-chrome102-bsdf911812c60f61e</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>User extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>8000****</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Call job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6573574060089****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>List of skill group IDs that the agent has signed into.</p>
         */
        @NameInMap("SignedSkillGroupIdList")
        public java.util.List<String> signedSkillGroupIdList;

        /**
         * <p>Agent User ID information.</p>
         * 
         * <strong>example:</strong>
         * <p>samzhang@abc</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Agent status. Enumeration values:</p>
         * <ul>
         * <li><p>READY: idle</p>
         * </li>
         * <li><p>WORKING: post-processing</p>
         * </li>
         * <li><p>DIALING: dial-up</p>
         * </li>
         * <li><p>BREAK: break</p>
         * </li>
         * <li><p>OFFLINE: offline</p>
         * </li>
         * <li><p>TALKING: talking</p>
         * </li>
         * <li><p>RINGING: ringing</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("UserState")
        public String userState;

        /**
         * <p>Work mode. Enumeration values:</p>
         * <ul>
         * <li><p>ON_SITE: On-site mode</p>
         * </li>
         * <li><p>OFF_SITE: Off-site mode</p>
         * </li>
         * <li><p>OFFICE_PHONE: Office phone mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static RedialCallResponseBodyDataUserContext build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyDataUserContext self = new RedialCallResponseBodyDataUserContext();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyDataUserContext setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public RedialCallResponseBodyDataUserContext setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public RedialCallResponseBodyDataUserContext setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public RedialCallResponseBodyDataUserContext setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RedialCallResponseBodyDataUserContext setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public RedialCallResponseBodyDataUserContext setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public RedialCallResponseBodyDataUserContext setSignedSkillGroupIdList(java.util.List<String> signedSkillGroupIdList) {
            this.signedSkillGroupIdList = signedSkillGroupIdList;
            return this;
        }
        public java.util.List<String> getSignedSkillGroupIdList() {
            return this.signedSkillGroupIdList;
        }

        public RedialCallResponseBodyDataUserContext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public RedialCallResponseBodyDataUserContext setUserState(String userState) {
            this.userState = userState;
            return this;
        }
        public String getUserState() {
            return this.userState;
        }

        public RedialCallResponseBodyDataUserContext setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class RedialCallResponseBodyData extends TeaModel {
        /**
         * <p>Call context environment.</p>
         */
        @NameInMap("CallContext")
        public RedialCallResponseBodyDataCallContext callContext;

        /**
         * <p>Context ID, strictly ordered and incrementing.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ContextId")
        public Long contextId;

        /**
         * <p>Agent context environment.</p>
         */
        @NameInMap("UserContext")
        public RedialCallResponseBodyDataUserContext userContext;

        public static RedialCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RedialCallResponseBodyData self = new RedialCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RedialCallResponseBodyData setCallContext(RedialCallResponseBodyDataCallContext callContext) {
            this.callContext = callContext;
            return this;
        }
        public RedialCallResponseBodyDataCallContext getCallContext() {
            return this.callContext;
        }

        public RedialCallResponseBodyData setContextId(Long contextId) {
            this.contextId = contextId;
            return this;
        }
        public Long getContextId() {
            return this.contextId;
        }

        public RedialCallResponseBodyData setUserContext(RedialCallResponseBodyDataUserContext userContext) {
            this.userContext = userContext;
            return this;
        }
        public RedialCallResponseBodyDataUserContext getUserContext() {
            return this.userContext;
        }

    }

}
