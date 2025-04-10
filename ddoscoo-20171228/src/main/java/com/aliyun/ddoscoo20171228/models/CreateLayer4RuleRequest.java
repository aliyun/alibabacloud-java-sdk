// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class CreateLayer4RuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;InstanceId&quot;:&quot;xxxxxx-xxxxxx-xxxxxx-xxxxxxx&quot;,&quot;Protocol&quot;:&quot;tcp&quot;,&quot;FrontendPort&quot;:80,&quot;BackendPort&quot;:5,&quot;RealServers&quot;:&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;}]</p>
     */
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("ProxyEnable")
    public Integer proxyEnable;

    @NameInMap("UsTimeout")
    public CreateLayer4RuleRequestUsTimeout usTimeout;

    public static CreateLayer4RuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLayer4RuleRequest self = new CreateLayer4RuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateLayer4RuleRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public CreateLayer4RuleRequest setProxyEnable(Integer proxyEnable) {
        this.proxyEnable = proxyEnable;
        return this;
    }
    public Integer getProxyEnable() {
        return this.proxyEnable;
    }

    public CreateLayer4RuleRequest setUsTimeout(CreateLayer4RuleRequestUsTimeout usTimeout) {
        this.usTimeout = usTimeout;
        return this;
    }
    public CreateLayer4RuleRequestUsTimeout getUsTimeout() {
        return this.usTimeout;
    }

    public static class CreateLayer4RuleRequestUsTimeout extends TeaModel {
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("RsTimeout")
        public Long rsTimeout;

        public static CreateLayer4RuleRequestUsTimeout build(java.util.Map<String, ?> map) throws Exception {
            CreateLayer4RuleRequestUsTimeout self = new CreateLayer4RuleRequestUsTimeout();
            return TeaModel.build(map, self);
        }

        public CreateLayer4RuleRequestUsTimeout setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public CreateLayer4RuleRequestUsTimeout setRsTimeout(Long rsTimeout) {
            this.rsTimeout = rsTimeout;
            return this;
        }
        public Long getRsTimeout() {
            return this.rsTimeout;
        }

    }

}
