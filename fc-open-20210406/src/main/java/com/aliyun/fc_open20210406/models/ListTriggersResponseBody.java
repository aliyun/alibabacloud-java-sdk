// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTriggersResponseBody extends TeaModel {
    /**
     * <p>The token used to obtain more results. If this parameter is left empty, all the results are returned.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The information about triggers.</p>
     */
    @NameInMap("triggers")
    public java.util.List<ListTriggersResponseBodyTriggers> triggers;

    public static ListTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersResponseBody self = new ListTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTriggersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTriggersResponseBody setTriggers(java.util.List<ListTriggersResponseBodyTriggers> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<ListTriggersResponseBodyTriggers> getTriggers() {
        return this.triggers;
    }

    public static class ListTriggersResponseBodyTriggers extends TeaModel {
        /**
         * <p>The time when the trigger was created.</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The description of the trigger.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. Example: `{domainName}.cn-shanghai.fc.aliyuncs.com`.</p>
         */
        @NameInMap("domainName")
        public String domainName;

        /**
         * <p>The ARN of the RAM role that is used by the event source to invoke the function.</p>
         */
        @NameInMap("invocationRole")
        public String invocationRole;

        /**
         * <p>The time when the trigger was last modified.</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The version or alias of the service.</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <p>The ARN of the event source.</p>
         */
        @NameInMap("sourceArn")
        public String sourceArn;

        /**
         * <p>The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:</p>
         * <br>
         * <p>*   Object Storage Service (OSS) trigger: [OSSTriggerConfig](~~415697~~)).</p>
         * <p>*   Simple Log Service trigger: [LogTriggerConfig](~~415694~~).</p>
         * <p>*   Time trigger: [TimeTriggerConfig](~~415712~~).</p>
         * <p>*   HTTP trigger: [HTTPTriggerConfig](~~415685~~).</p>
         * <p>*   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.</p>
         * <p>*   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](~~415674~~).</p>
         * <p>*   MNS topic trigger: [MnsTopicTriggerConfig](~~415695~~).</p>
         * <p>*   EventBridge triggers: [EventBridgeTriggerConfig](~~2508622~~).</p>
         */
        @NameInMap("triggerConfig")
        public String triggerConfig;

        /**
         * <p>The unique ID of the trigger.</p>
         */
        @NameInMap("triggerId")
        public String triggerId;

        /**
         * <p>The name of the trigger.</p>
         */
        @NameInMap("triggerName")
        public String triggerName;

        /**
         * <p>The trigger type. Valid values: **oss**, **log**, **tablestore**, **timer**, **http**, **cdn_events**, **mns_topic**, and **eventbridge**.</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>The public endpoint. You can access HTTP triggers over the Internet by using HTTP or HTTPS.</p>
         */
        @NameInMap("urlInternet")
        public String urlInternet;

        /**
         * <p>The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.</p>
         */
        @NameInMap("urlIntranet")
        public String urlIntranet;

        public static ListTriggersResponseBodyTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListTriggersResponseBodyTriggers self = new ListTriggersResponseBodyTriggers();
            return TeaModel.build(map, self);
        }

        public ListTriggersResponseBodyTriggers setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTriggersResponseBodyTriggers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTriggersResponseBodyTriggers setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListTriggersResponseBodyTriggers setInvocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }
        public String getInvocationRole() {
            return this.invocationRole;
        }

        public ListTriggersResponseBodyTriggers setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListTriggersResponseBodyTriggers setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public ListTriggersResponseBodyTriggers setSourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public String getSourceArn() {
            return this.sourceArn;
        }

        public ListTriggersResponseBodyTriggers setTriggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

        public ListTriggersResponseBodyTriggers setTriggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }
        public String getTriggerId() {
            return this.triggerId;
        }

        public ListTriggersResponseBodyTriggers setTriggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }
        public String getTriggerName() {
            return this.triggerName;
        }

        public ListTriggersResponseBodyTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public ListTriggersResponseBodyTriggers setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public ListTriggersResponseBodyTriggers setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
