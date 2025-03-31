// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTriggerResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2CA76D52-A8F0-4D0B-854E-FBD9F6C99049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The triggers of the repository.</p>
     */
    @NameInMap("Triggers")
    public java.util.List<ListRepoTriggerResponseBodyTriggers> triggers;

    public static ListRepoTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTriggerResponseBody self = new ListRepoTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTriggerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoTriggerResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTriggerResponseBody setTriggers(java.util.List<ListRepoTriggerResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<ListRepoTriggerResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class ListRepoTriggerResponseBodyTriggers extends TeaModel {
        /**
         * <p>The type of the event that activates the trigger. Valid values:</p>
         * <ul>
         * <li><code>BUILD_SUCCESS</code>: The trigger is activated when an image building task is successful.</li>
         * <li><code>BUILD_Fail</code>: The trigger is activated when an image building task fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUILD_SUCCESS</p>
         */
        @NameInMap("RepoEvent")
        public String repoEvent;

        /**
         * <p>The ID of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>crw-vriyql9eq7ep****</p>
         */
        @NameInMap("TriggerId")
        public String triggerId;

        /**
         * <p>The name of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TriggerName")
        public String triggerName;

        /**
         * <p>The image tag based on which the trigger is set.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("TriggerTag")
        public String triggerTag;

        /**
         * <p>The type of the trigger. Valid values:</p>
         * <ul>
         * <li><code>ALL</code>: a trigger that supports both tags and regular expressions.</li>
         * <li><code>TAG_LISTTAG</code>: a tag-based trigger.</li>
         * <li><code>TAG_REG_EXP</code>: a regular expression-based trigger.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The URL of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.test.com">https://www.test.com</a></p>
         */
        @NameInMap("TriggerUrl")
        public String triggerUrl;

        public static ListRepoTriggerResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTriggerResponseBodyTriggers self = new ListRepoTriggerResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public ListRepoTriggerResponseBodyTriggers setRepoEvent(String repoEvent) {
            this.repoEvent = repoEvent;
            return this;
        }
        public String getRepoEvent() {
            return this.repoEvent;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }
        public String getTriggerId() {
            return this.triggerId;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerTag(String triggerTag) {
            this.triggerTag = triggerTag;
            return this;
        }
        public String getTriggerTag() {
            return this.triggerTag;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListRepoTriggerResponseBodyTriggers setTriggerUrl(String triggerUrl) {
            this.triggerUrl = triggerUrl;
            return this;
        }
        public String getTriggerUrl() {
            return this.triggerUrl;
        }

    }

}
