// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByIpRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("RequestPars")
    public String requestPars;

    public static ListListenersByIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByIpRequest self = new ListListenersByIpRequest();
        return TeaModel.build(map, self);
    }

    public ListListenersByIpRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListListenersByIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListListenersByIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListListenersByIpRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public ListListenersByIpRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListListenersByIpRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
