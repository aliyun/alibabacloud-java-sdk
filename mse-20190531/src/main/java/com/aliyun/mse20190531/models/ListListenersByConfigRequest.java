// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The data ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zeekr-clueboss.yml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    /**
     * <p>The list of additional canary release rules. When performing listener matching, the additional canary release rules are merged with existing rules for matching.</p>
     */
    @NameInMap("ExtGrayRules")
    public java.util.List<ListListenersByConfigRequestExtGrayRules> extGrayRules;

    /**
     * <p>The group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-m7r1yurp00e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The namespace ID. Default value: public.</p>
     * 
     * <strong>example:</strong>
     * <p>aaeb4d28-c9eb-4fa2-85f5-d03ce7ee8df1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is deprecated and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>...</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListListenersByConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigRequest self = new ListListenersByConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListListenersByConfigRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListListenersByConfigRequest setExtGrayRules(java.util.List<ListListenersByConfigRequestExtGrayRules> extGrayRules) {
        this.extGrayRules = extGrayRules;
        return this;
    }
    public java.util.List<ListListenersByConfigRequestExtGrayRules> getExtGrayRules() {
        return this.extGrayRules;
    }

    public ListListenersByConfigRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListListenersByConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListListenersByConfigRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListListenersByConfigRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public static class ListListenersByConfigRequestExtGrayRules extends TeaModel {
        /**
         * <p>The canary release rule. If it is a Beta canary release, this field contains the IP addresses of the canary release clients, separated by commas. If it is a tag-based canary release, this field contains tag_name=tag_value, with multiple tag values separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("GrayRule")
        public String grayRule;

        /**
         * <p>The name of the canary release version.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GrayRuleName")
        public String grayRuleName;

        /**
         * <p>The priority of the canary release version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GrayRulePriority")
        public Integer grayRulePriority;

        /**
         * <p>The type of the canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Tags</p>
         */
        @NameInMap("GrayRuleType")
        public String grayRuleType;

        public static ListListenersByConfigRequestExtGrayRules build(java.util.Map<String, ?> map) throws Exception {
            ListListenersByConfigRequestExtGrayRules self = new ListListenersByConfigRequestExtGrayRules();
            return TeaModel.build(map, self);
        }

        public ListListenersByConfigRequestExtGrayRules setGrayRule(String grayRule) {
            this.grayRule = grayRule;
            return this;
        }
        public String getGrayRule() {
            return this.grayRule;
        }

        public ListListenersByConfigRequestExtGrayRules setGrayRuleName(String grayRuleName) {
            this.grayRuleName = grayRuleName;
            return this;
        }
        public String getGrayRuleName() {
            return this.grayRuleName;
        }

        public ListListenersByConfigRequestExtGrayRules setGrayRulePriority(Integer grayRulePriority) {
            this.grayRulePriority = grayRulePriority;
            return this;
        }
        public Integer getGrayRulePriority() {
            return this.grayRulePriority;
        }

        public ListListenersByConfigRequestExtGrayRules setGrayRuleType(String grayRuleType) {
            this.grayRuleType = grayRuleType;
            return this;
        }
        public String getGrayRuleType() {
            return this.grayRuleType;
        }

    }

}
