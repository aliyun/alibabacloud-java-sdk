// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTriggersResponseBody extends TeaModel {
    // The token used to obtain more results. If this parameter is left empty, all the results are returned.
    @NameInMap("nextToken")
    public String nextToken;

    // The information about triggers.
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
        // The time when the trigger was created.
        @NameInMap("createdTime")
        public String createdTime;

        // The description of the trigger.
        @NameInMap("description")
        public String description;

        // The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. For example, `{domainName}.cn-shanghai.fc.aliyuncs.com`.
        @NameInMap("domainName")
        public String domainName;

        // The ARN of the RAM role that is used by the event source to invoke the function.
        @NameInMap("invocationRole")
        public String invocationRole;

        // The time when the trigger was last modified.
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        // The version or alias of the service.
        @NameInMap("qualifier")
        public String qualifier;

        // The ARN of the event source.
        @NameInMap("sourceArn")
        public String sourceArn;

        // The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:
        // 
        // *   OSS trigger: [OSSTriggerConfig](javascript:void\(0\)).
        // *   Log Service trigger: [LogTriggerConfig](javascript:void\(0\)).
        // *   Time trigger: [TimeTriggerConfig](javascript:void\(0\)).
        // *   HTTP trigger: [HTTPTriggerConfig](javascript:void\(0\)).
        // *   Tablestore trigger: Specify the **SourceArn** parameter and leave this parameter empty.
        // *   Alibaba Cloud CDN event trigger: [CDNEventsTriggerConfig](javascript:void\(0\)).
        // *   MNS topic trigger: [MnsTopicTriggerConfig](javascript:void\(0\)).
        @NameInMap("triggerConfig")
        public String triggerConfig;

        // The unique ID of the trigger.
        @NameInMap("triggerId")
        public String triggerId;

        // The name of the trigger.
        @NameInMap("triggerName")
        public String triggerName;

        // The trigger type, such as **oss**, **log**, **tablestore**, **timer**, **http**, **cdn_events**, and **mns_topic**.
        @NameInMap("triggerType")
        public String triggerType;

        // The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.
        @NameInMap("urlInternet")
        public String urlInternet;

        // The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.
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
