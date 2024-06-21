// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigRequest extends TeaModel {
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

}
