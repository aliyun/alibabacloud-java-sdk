// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zeekr-clueboss.yml</p>
     */
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("ExtGrayRules")
    public String extGrayRulesShrink;

    /**
     * <p>The name of the group.</p>
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
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>aaeb4d28-c9eb-4fa2-85f5-d03ce7ee8df1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{\\&quot;appGroup\\&quot;:\\&quot;emas-zfive_prehost\\&quot;,\\&quot;appName\\&quot;:\\&quot;emas-zfive\\&quot;,\\&quot;appStage\\&quot;:\\&quot;PRE_PUBLISH\\&quot;,\\&quot;appUnit\\&quot;:\\&quot;\\&quot;,\\&quot;bucId\\&quot;:\\&quot;225902\\&quot;,\\&quot;bucName\\&quot;:\\&quot;Wireless\\&quot;,\\&quot;provider\\&quot;:\\&quot;aliyun\\&quot;}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    public static ListListenersByConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigShrinkRequest self = new ListListenersByConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListListenersByConfigShrinkRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public ListListenersByConfigShrinkRequest setExtGrayRulesShrink(String extGrayRulesShrink) {
        this.extGrayRulesShrink = extGrayRulesShrink;
        return this;
    }
    public String getExtGrayRulesShrink() {
        return this.extGrayRulesShrink;
    }

    public ListListenersByConfigShrinkRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListListenersByConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListListenersByConfigShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListListenersByConfigShrinkRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
