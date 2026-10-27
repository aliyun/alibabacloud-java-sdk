// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetIdentityProviderServiceProviderResponseBody extends TeaModel {
    /**
     * <p>失败时结合 HTTP 状态及 message 处理。</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>结果结构见本接口返回字段；异步写接口的返回表示受理，不保证后台任务已完成。</p>
     */
    @NameInMap("data")
    public GetIdentityProviderServiceProviderResponseBodyData data;

    /**
     * <p>本次请求的处理状态，不等同后台任务最终结果。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>请求受理或错误消息；异步任务结果需按对应查询接口核对。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>用于关联本次调用与排障，失败时请保留。</p>
     * 
     * <strong>example:</strong>
     * <p>request-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>true 表示本次请求处理成功；异步写入仍需继续查询任务结果。</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetIdentityProviderServiceProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderServiceProviderResponseBody self = new GetIdentityProviderServiceProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderServiceProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetIdentityProviderServiceProviderResponseBody setData(GetIdentityProviderServiceProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIdentityProviderServiceProviderResponseBodyData getData() {
        return this.data;
    }

    public GetIdentityProviderServiceProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetIdentityProviderServiceProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIdentityProviderServiceProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderServiceProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIdentityProviderServiceProviderResponseBodyData extends TeaModel {
        /**
         * <p>我方 SAML 断言消费地址，配置到外部 IdP。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sp.example.com/saml/acs">https://sp.example.com/saml/acs</a></p>
         */
        @NameInMap("acsUrl")
        public String acsUrl;

        /**
         * <p>我方 SP 的实体标识，配置到外部 IdP；不是外部 IdP Entity ID。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://sp.example.com/entity">https://sp.example.com/entity</a></p>
         */
        @NameInMap("entityId")
        public String entityId;

        /**
         * <p>我方 SP Metadata XML，供外部 IdP 导入；不能作为 IdP XML 提交 SAML 配置。</p>
         * 
         * <strong>example:</strong>
         * <p><EntityDescriptor xmlns="urn:oasis:names:tc:SAML:2.0:metadata" entityID="https://sp.example.com/entity"><SPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol"><AssertionConsumerService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST" Location="https://sp.example.com/saml/acs" index="0"/></SPSSODescriptor></EntityDescriptor></p>
         */
        @NameInMap("metadataXml")
        public String metadataXml;

        /**
         * <p>查询参数必填，仅支持精确值 SAML；响应返回 SAML。</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("protocol")
        public String protocol;

        public static GetIdentityProviderServiceProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderServiceProviderResponseBodyData self = new GetIdentityProviderServiceProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderServiceProviderResponseBodyData setAcsUrl(String acsUrl) {
            this.acsUrl = acsUrl;
            return this;
        }
        public String getAcsUrl() {
            return this.acsUrl;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setMetadataXml(String metadataXml) {
            this.metadataXml = metadataXml;
            return this;
        }
        public String getMetadataXml() {
            return this.metadataXml;
        }

        public GetIdentityProviderServiceProviderResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
