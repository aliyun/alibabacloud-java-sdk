// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetConversationalAutomationResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetConversationalAutomationResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConversationalAutomationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationalAutomationResponseBody self = new GetConversationalAutomationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationalAutomationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetConversationalAutomationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConversationalAutomationResponseBody setData(GetConversationalAutomationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConversationalAutomationResponseBodyData getData() {
        return this.data;
    }

    public GetConversationalAutomationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConversationalAutomationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConversationalAutomationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConversationalAutomationResponseBodyDataCommands extends TeaModel {
        /**
         * <p>The description of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
         * <p>The name of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>common1</p>
         */
        @NameInMap("CommandName")
        public String commandName;

        public static GetConversationalAutomationResponseBodyDataCommands build(java.util.Map<String, ?> map) throws Exception {
            GetConversationalAutomationResponseBodyDataCommands self = new GetConversationalAutomationResponseBodyDataCommands();
            return TeaModel.build(map, self);
        }

        public GetConversationalAutomationResponseBodyDataCommands setCommandDescription(String commandDescription) {
            this.commandDescription = commandDescription;
            return this;
        }
        public String getCommandDescription() {
            return this.commandDescription;
        }

        public GetConversationalAutomationResponseBodyDataCommands setCommandName(String commandName) {
            this.commandName = commandName;
            return this;
        }
        public String getCommandName() {
            return this.commandName;
        }

    }

    public static class GetConversationalAutomationResponseBodyData extends TeaModel {
        /**
         * <p>The commands.</p>
         */
        @NameInMap("Commands")
        public java.util.List<GetConversationalAutomationResponseBodyDataCommands> commands;

        /**
         * <p>Indicates whether the welcoming message is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWelcomeMessage")
        public Boolean enableWelcomeMessage;

        /**
         * <p>The phone number of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>86138****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The opening remarks.</p>
         */
        @NameInMap("Prompts")
        public java.util.List<String> prompts;

        public static GetConversationalAutomationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConversationalAutomationResponseBodyData self = new GetConversationalAutomationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConversationalAutomationResponseBodyData setCommands(java.util.List<GetConversationalAutomationResponseBodyDataCommands> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<GetConversationalAutomationResponseBodyDataCommands> getCommands() {
            return this.commands;
        }

        public GetConversationalAutomationResponseBodyData setEnableWelcomeMessage(Boolean enableWelcomeMessage) {
            this.enableWelcomeMessage = enableWelcomeMessage;
            return this;
        }
        public Boolean getEnableWelcomeMessage() {
            return this.enableWelcomeMessage;
        }

        public GetConversationalAutomationResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetConversationalAutomationResponseBodyData setPrompts(java.util.List<String> prompts) {
            this.prompts = prompts;
            return this;
        }
        public java.util.List<String> getPrompts() {
            return this.prompts;
        }

    }

}
