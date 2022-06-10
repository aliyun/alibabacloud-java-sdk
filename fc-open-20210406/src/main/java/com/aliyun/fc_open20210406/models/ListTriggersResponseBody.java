// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListTriggersResponseBody extends TeaModel {
    // 用来返回更多的查询结果。如果这个值没有返回，则说明没有更多结果
    @NameInMap("nextToken")
    public String nextToken;

    // Trigger列表
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
        // 创建时间
        @NameInMap("createdTime")
        public String createdTime;

        @NameInMap("description")
        public String description;

        // 域名名称，使用域名名称拼接上函数计算域名，可以采用HTTP协议调用到触发器对应版本的函数。例如{domainName}.cn-shanghai.fc.aliyuncs.com
        @NameInMap("domainName")
        public String domainName;

        // 调用函数使用的RAM角色的ARN
        @NameInMap("invocationRole")
        public String invocationRole;

        // 上次修改时间
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        // service版本
        @NameInMap("qualifier")
        public String qualifier;

        // event source的Aliyun Resource Name（ARN
        @NameInMap("sourceArn")
        public String sourceArn;

        // trigger配置对象
        @NameInMap("triggerConfig")
        public String triggerConfig;

        @NameInMap("triggerId")
        public String triggerId;

        // trigger名称
        @NameInMap("triggerName")
        public String triggerName;

        // trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
        @NameInMap("triggerType")
        public String triggerType;

        // 公网域名地址。在互联网可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
        @NameInMap("urlInternet")
        public String urlInternet;

        // 私网域名地址。在VPC可以通过HTTP协议或者HTTPS协议访问HTTP Trigger。
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
