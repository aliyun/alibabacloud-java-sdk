// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateHookConfigurationResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the mounted script.</p>
     */
    @NameInMap("HooksConfiguration")
    public java.util.List<UpdateHookConfigurationResponseBodyHooksConfiguration> hooksConfiguration;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateHookConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHookConfigurationResponseBody self = new UpdateHookConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHookConfigurationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateHookConfigurationResponseBody setHooksConfiguration(java.util.List<UpdateHookConfigurationResponseBodyHooksConfiguration> hooksConfiguration) {
        this.hooksConfiguration = hooksConfiguration;
        return this;
    }
    public java.util.List<UpdateHookConfigurationResponseBodyHooksConfiguration> getHooksConfiguration() {
        return this.hooksConfiguration;
    }

    public UpdateHookConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateHookConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateHookConfigurationResponseBodyHooksConfiguration extends TeaModel {
        /**
         * <p>Indicates whether a mount failure is ignored. Valid values:</p>
         * <br>
         * <p>*   **true**: A mount failure is ignored.</p>
         * <p>*   **false**: A mount failure is not ignored.</p>
         */
        @NameInMap("IgnoreFail")
        public Boolean ignoreFail;

        /**
         * <p>The name of the mounted script.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The content of the mounted script.</p>
         */
        @NameInMap("Script")
        public String script;

        public static UpdateHookConfigurationResponseBodyHooksConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateHookConfigurationResponseBodyHooksConfiguration self = new UpdateHookConfigurationResponseBodyHooksConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateHookConfigurationResponseBodyHooksConfiguration setIgnoreFail(Boolean ignoreFail) {
            this.ignoreFail = ignoreFail;
            return this;
        }
        public Boolean getIgnoreFail() {
            return this.ignoreFail;
        }

        public UpdateHookConfigurationResponseBodyHooksConfiguration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHookConfigurationResponseBodyHooksConfiguration setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

}
