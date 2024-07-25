// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetConversationalAutomationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetConversationalAutomationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("CommandDescription")
        public String commandDescription;

        /**
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
        @NameInMap("Commands")
        public java.util.List<GetConversationalAutomationResponseBodyDataCommands> commands;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWelcomeMessage")
        public Boolean enableWelcomeMessage;

        /**
         * <strong>example:</strong>
         * <p>86138****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

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
