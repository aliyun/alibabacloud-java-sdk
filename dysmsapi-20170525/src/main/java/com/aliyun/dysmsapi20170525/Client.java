// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dysmsapi20170525.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dysmsapi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dysmsapi-proxy.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dysmsapi-xman.cn-hongkong.aliyuncs.com"),
            new TeaPair("eu-central-1", "dysmsapi.eu-central-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dysmsapi.us-east-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dysmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    /**
     * <b>summary</b> : 
     * <p>添加验证码签名信息</p>
     * 
     * @param request AddExtCodeSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddExtCodeSignResponse
     */
    public AddExtCodeSignResponse addExtCodeSignWithOptions(AddExtCodeSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extCode)) {
            query.put("ExtCode", request.extCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddExtCodeSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddExtCodeSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加验证码签名信息</p>
     * 
     * @param request AddExtCodeSignRequest
     * @return AddExtCodeSignResponse
     */
    public AddExtCodeSignResponse addExtCodeSign(AddExtCodeSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addExtCodeSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must register the primary domain name of the source URL in the Short Message Service (SMS) console. After the domain name is registered, you can call this operation to create a short URL. For more information, see <a href="https://help.aliyun.com/document_detail/302325.html#title-mau-zdh-hd0">Domain name registration</a>.</p>
     * <ul>
     * <li>You can create up to 3,000 short URLs within a natural day.</li>
     * <li>After a short URL is generated, a security review is required. Generally, the review takes 10 minutes to 2 hours to complete. Before the security review is passed, the short URL cannot be directly accessed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a short URL.</p>
     * 
     * @param request AddShortUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddShortUrlResponse
     */
    public AddShortUrlResponse addShortUrlWithOptions(AddShortUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDays)) {
            body.put("EffectiveDays", request.effectiveDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortUrlName)) {
            body.put("ShortUrlName", request.shortUrlName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            body.put("SourceUrl", request.sourceUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShortUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must register the primary domain name of the source URL in the Short Message Service (SMS) console. After the domain name is registered, you can call this operation to create a short URL. For more information, see <a href="https://help.aliyun.com/document_detail/302325.html#title-mau-zdh-hd0">Domain name registration</a>.</p>
     * <ul>
     * <li>You can create up to 3,000 short URLs within a natural day.</li>
     * <li>After a short URL is generated, a security review is required. Generally, the review takes 10 minutes to 2 hours to complete. Before the security review is passed, the short URL cannot be directly accessed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a short URL.</p>
     * 
     * @param request AddShortUrlRequest
     * @return AddShortUrlResponse
     */
    public AddShortUrlResponse addShortUrl(AddShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddSmsSign operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service (SMS) console</a> to create an SMS signature. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>. You can call the QuerySmsSign operation or use the SMS console to query the review status of the signature.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation only once per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You cannot cancel the review of a signature.</li>
     * <li>Individual users can create only one verification code signature, and can create only one general-purpose signature within a natural day. If you need to apply for multiple signatures, we recommend that you upgrade your account to an enterprise user.</li>
     * <li>If you need to use the same signature for messages sent to recipients both in and outside the Chinese mainland, the signature must be a general-purpose signature.</li>
     * <li>If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</li>
     * <li>An SMS signature must undergo a thorough review process before it can be approved for use.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a signature.</p>
     * 
     * @param request AddSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSmsSignResponse
     */
    public AddSmsSignResponse addSmsSignWithOptions(AddSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signSource)) {
            query.put("SignSource", request.signSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signType)) {
            query.put("SignType", request.signType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signFileList)) {
            body.put("SignFileList", request.signFileList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddSmsSign operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service (SMS) console</a> to create an SMS signature. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>. You can call the QuerySmsSign operation or use the SMS console to query the review status of the signature.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation only once per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You cannot cancel the review of a signature.</li>
     * <li>Individual users can create only one verification code signature, and can create only one general-purpose signature within a natural day. If you need to apply for multiple signatures, we recommend that you upgrade your account to an enterprise user.</li>
     * <li>If you need to use the same signature for messages sent to recipients both in and outside the Chinese mainland, the signature must be a general-purpose signature.</li>
     * <li>If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</li>
     * <li>An SMS signature must undergo a thorough review process before it can be approved for use.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a signature.</p>
     * 
     * @param request AddSmsSignRequest
     * @return AddSmsSignResponse
     */
    public AddSmsSignResponse addSmsSign(AddSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a> to apply for a message template. The template must comply with the <a href="https://help.aliyun.com/document_detail/108253.html">message template specifications</a>. You can call the <a href="https://help.aliyun.com/document_detail/419289.html">QuerySmsTemplate</a> operation or use the Alibaba Cloud SMS console to check whether the message template is approved.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Message templates pending approval can be withdrawn. You can withdraw a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>If you call the AddSmsTemplate operation, you can apply for a maximum of 100 message templates in a calendar day. After you apply for a message template, we recommend that you wait for at least 30 seconds before you apply for another one. If you use the Alibaba Cloud SMS console, you can apply for an unlimited number of message templates.</li>
     * <li>Messages sent to the Chinese mainland and messages sent to countries or regions outside the Chinese mainland use separate message templates. Create message templates based on your needs.</li>
     * <li>If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</li>
     * <li>A signature must undergo a thorough review process before it can be approved for use. For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message template.</p>
     * 
     * @deprecated OpenAPI AddSmsTemplate is deprecated, please use Dysmsapi::2017-05-25::CreateSmsTemplate instead.
     * 
     * @param request AddSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public AddSmsTemplateResponse addSmsTemplateWithOptions(AddSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a> to apply for a message template. The template must comply with the <a href="https://help.aliyun.com/document_detail/108253.html">message template specifications</a>. You can call the <a href="https://help.aliyun.com/document_detail/419289.html">QuerySmsTemplate</a> operation or use the Alibaba Cloud SMS console to check whether the message template is approved.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Message templates pending approval can be withdrawn. You can withdraw a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>If you call the AddSmsTemplate operation, you can apply for a maximum of 100 message templates in a calendar day. After you apply for a message template, we recommend that you wait for at least 30 seconds before you apply for another one. If you use the Alibaba Cloud SMS console, you can apply for an unlimited number of message templates.</li>
     * <li>Messages sent to the Chinese mainland and messages sent to countries or regions outside the Chinese mainland use separate message templates. Create message templates based on your needs.</li>
     * <li>If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</li>
     * <li>A signature must undergo a thorough review process before it can be approved for use. For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a message template.</p>
     * 
     * @deprecated OpenAPI AddSmsTemplate is deprecated, please use Dysmsapi::2017-05-25::CreateSmsTemplate instead.
     * 
     * @param request AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public AddSmsTemplateResponse addSmsTemplate(AddSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更换签名的资质和授权书</p>
     * 
     * @param request ChangeSignatureQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeSignatureQualificationResponse
     */
    public ChangeSignatureQualificationResponse changeSignatureQualificationWithOptions(ChangeSignatureQualificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterId)) {
            query.put("AuthorizationLetterId", request.authorizationLetterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureName)) {
            query.put("SignatureName", request.signatureName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeSignatureQualification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeSignatureQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更换签名的资质和授权书</p>
     * 
     * @param request ChangeSignatureQualificationRequest
     * @return ChangeSignatureQualificationResponse
     */
    public ChangeSignatureQualificationResponse changeSignatureQualification(ChangeSignatureQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeSignatureQualificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 2,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a mobile phone number can receive card messages.</p>
     * 
     * @param request CheckMobilesCardSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMobilesCardSupportResponse
     */
    public CheckMobilesCardSupportResponse checkMobilesCardSupportWithOptions(CheckMobilesCardSupportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobiles)) {
            query.put("Mobiles", request.mobiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMobilesCardSupport"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMobilesCardSupportResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 2,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a mobile phone number can receive card messages.</p>
     * 
     * @param request CheckMobilesCardSupportRequest
     * @return CheckMobilesCardSupportResponse
     */
    public CheckMobilesCardSupportResponse checkMobilesCardSupport(CheckMobilesCardSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMobilesCardSupportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends conversion rate information to Alibaba Cloud SMS.</p>
     * 
     * @param request ConversionDataIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConversionDataIntlResponse
     */
    public ConversionDataIntlResponse conversionDataIntlWithOptions(ConversionDataIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversionRate)) {
            query.put("ConversionRate", request.conversionRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTime)) {
            query.put("ReportTime", request.reportTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConversionDataIntl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConversionDataIntlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends conversion rate information to Alibaba Cloud SMS.</p>
     * 
     * @param request ConversionDataIntlRequest
     * @return ConversionDataIntlResponse
     */
    public ConversionDataIntlResponse conversionDataIntl(ConversionDataIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.conversionDataIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The CreateCardSmsTemplate operation saves the card message template information, submits it to the mobile phone manufacturer for approval, and returns the message template ID.</p>
     * <ul>
     * <li>If the type of the message template is not supported or events that are not supported by the mobile phone manufacturer are specified, the template is not submitted. For more information, see <a href="https://help.aliyun.com/document_detail/434611.html">Supported message templates</a>.</li>
     * <li>For information about sample card message templates, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample card message templates</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a card message template.</p>
     * 
     * @param tmpReq CreateCardSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCardSmsTemplateResponse
     */
    public CreateCardSmsTemplateResponse createCardSmsTemplateWithOptions(CreateCardSmsTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCardSmsTemplateShrinkRequest request = new CreateCardSmsTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.factorys)) {
            query.put("Factorys", request.factorys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCardSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCardSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The CreateCardSmsTemplate operation saves the card message template information, submits it to the mobile phone manufacturer for approval, and returns the message template ID.</p>
     * <ul>
     * <li>If the type of the message template is not supported or events that are not supported by the mobile phone manufacturer are specified, the template is not submitted. For more information, see <a href="https://help.aliyun.com/document_detail/434611.html">Supported message templates</a>.</li>
     * <li>For information about sample card message templates, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample card message templates</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a card message template.</p>
     * 
     * @param request CreateCardSmsTemplateRequest
     * @return CreateCardSmsTemplateResponse
     */
    public CreateCardSmsTemplateResponse createCardSmsTemplate(CreateCardSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCardSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建短链</p>
     * 
     * @param request CreateSmartShortUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmartShortUrlResponse
     */
    public CreateSmartShortUrlResponse createSmartShortUrlWithOptions(CreateSmartShortUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            query.put("SourceUrl", request.sourceUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmartShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmartShortUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建短链</p>
     * 
     * @param request CreateSmartShortUrlRequest
     * @return CreateSmartShortUrlResponse
     */
    public CreateSmartShortUrlResponse createSmartShortUrl(CreateSmartShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmartShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建APP-ICP备案对客openAPI</p>
     * 
     * @param request CreateSmsAppIcpRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsAppIcpRecordResponse
     */
    public CreateSmsAppIcpRecordResponse createSmsAppIcpRecordWithOptions(CreateSmsAppIcpRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appApprovalDate)) {
            query.put("AppApprovalDate", request.appApprovalDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIcpLicenseNumber)) {
            query.put("AppIcpLicenseNumber", request.appIcpLicenseNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIcpRecordPic)) {
            query.put("AppIcpRecordPic", request.appIcpRecordPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appPrincipalUnitName)) {
            query.put("AppPrincipalUnitName", request.appPrincipalUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appServiceName)) {
            query.put("AppServiceName", request.appServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsAppIcpRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsAppIcpRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建APP-ICP备案对客openAPI</p>
     * 
     * @param request CreateSmsAppIcpRecordRequest
     * @return CreateSmsAppIcpRecordResponse
     */
    public CreateSmsAppIcpRecordResponse createSmsAppIcpRecord(CreateSmsAppIcpRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsAppIcpRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建委托授权书</p>
     * 
     * @param tmpReq CreateSmsAuthorizationLetterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsAuthorizationLetterResponse
     */
    public CreateSmsAuthorizationLetterResponse createSmsAuthorizationLetterWithOptions(CreateSmsAuthorizationLetterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSmsAuthorizationLetterShrinkRequest request = new CreateSmsAuthorizationLetterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.signList)) {
            request.signListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.signList, "SignList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorization)) {
            query.put("Authorization", request.authorization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterExpDate)) {
            query.put("AuthorizationLetterExpDate", request.authorizationLetterExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterName)) {
            query.put("AuthorizationLetterName", request.authorizationLetterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterPic)) {
            query.put("AuthorizationLetterPic", request.authorizationLetterPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationCode)) {
            query.put("OrganizationCode", request.organizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyAuthorization)) {
            query.put("ProxyAuthorization", request.proxyAuthorization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signListShrink)) {
            query.put("SignList", request.signListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsAuthorizationLetter"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsAuthorizationLetterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建委托授权书</p>
     * 
     * @param request CreateSmsAuthorizationLetterRequest
     * @return CreateSmsAuthorizationLetterResponse
     */
    public CreateSmsAuthorizationLetterResponse createSmsAuthorizationLetter(CreateSmsAuthorizationLetterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsAuthorizationLetterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Individual authenticated users can apply for one formal signature per natural day under the same Alibaba Cloud account, while enterprise authenticated users have no current restrictions. For details on the differences in rights between individual and enterprise users, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm">User Guide</a>.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * <li>After submitting the signature application, you can query the signature review status and details via the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-getsmssign?spm">GetSmsSign</a> interface. You can also <a href="https://help.aliyun.com/zh/sms/developer-reference/configure-delivery-receipts-1?spm">Configure Receipt Messages</a> and obtain signature review status messages through SignSmsReport.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create SMS Signature</p>
     * 
     * @param tmpReq CreateSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSignWithOptions(CreateSmsSignRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSmsSignShrinkRequest request = new CreateSmsSignShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.moreData)) {
            request.moreDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.moreData, "MoreData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIcpRecordId)) {
            query.put("AppIcpRecordId", request.appIcpRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applySceneContent)) {
            query.put("ApplySceneContent", request.applySceneContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterId)) {
            query.put("AuthorizationLetterId", request.authorizationLetterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moreDataShrink)) {
            query.put("MoreData", request.moreDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signSource)) {
            query.put("SignSource", request.signSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signType)) {
            query.put("SignType", request.signType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdParty)) {
            query.put("ThirdParty", request.thirdParty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkId)) {
            query.put("TrademarkId", request.trademarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Individual authenticated users can apply for one formal signature per natural day under the same Alibaba Cloud account, while enterprise authenticated users have no current restrictions. For details on the differences in rights between individual and enterprise users, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm">User Guide</a>.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * <li>After submitting the signature application, you can query the signature review status and details via the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-getsmssign?spm">GetSmsSign</a> interface. You can also <a href="https://help.aliyun.com/zh/sms/developer-reference/configure-delivery-receipts-1?spm">Configure Receipt Messages</a> and obtain signature review status messages through SignSmsReport.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create SMS Signature</p>
     * 
     * @param request CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    public CreateSmsSignResponse createSmsSign(CreateSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>It is recommended to apply for SMS templates via the API with at least a 30-second interval between each request.</li>
     * <li>The template information applied through the API will be synchronized in the SMS service console. For operations related to templates in the console, please refer to SMS Templates.</li>
     * <li>After submitting the template application, you can query the audit status and details using the GetSmsTemplate interface. You can also configure delivery receipts to obtain the audit status messages via TemplateSmsReport.</li>
     * <li>Domestic SMS templates are not interchangeable with international/Hong Kong, Macao, and Taiwan SMS templates. Please apply for templates based on your business scenario.</li>
     * <li>Only enterprise-verified users can apply for promotional messages and international/Hong Kong, Macao, and Taiwan messages. For differences in rights between personal and enterprise users, please refer to Usage Instructions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create SMS Template</p>
     * 
     * @param tmpReq CreateSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsTemplateResponse
     */
    public CreateSmsTemplateResponse createSmsTemplateWithOptions(CreateSmsTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSmsTemplateShrinkRequest request = new CreateSmsTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.moreData)) {
            request.moreDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.moreData, "MoreData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applySceneContent)) {
            query.put("ApplySceneContent", request.applySceneContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intlType)) {
            query.put("IntlType", request.intlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moreDataShrink)) {
            query.put("MoreData", request.moreDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedSignName)) {
            query.put("RelatedSignName", request.relatedSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateRule)) {
            query.put("TemplateRule", request.templateRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficDriving)) {
            query.put("TrafficDriving", request.trafficDriving);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>It is recommended to apply for SMS templates via the API with at least a 30-second interval between each request.</li>
     * <li>The template information applied through the API will be synchronized in the SMS service console. For operations related to templates in the console, please refer to SMS Templates.</li>
     * <li>After submitting the template application, you can query the audit status and details using the GetSmsTemplate interface. You can also configure delivery receipts to obtain the audit status messages via TemplateSmsReport.</li>
     * <li>Domestic SMS templates are not interchangeable with international/Hong Kong, Macao, and Taiwan SMS templates. Please apply for templates based on your business scenario.</li>
     * <li>Only enterprise-verified users can apply for promotional messages and international/Hong Kong, Macao, and Taiwan messages. For differences in rights between personal and enterprise users, please refer to Usage Instructions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create SMS Template</p>
     * 
     * @param request CreateSmsTemplateRequest
     * @return CreateSmsTemplateResponse
     */
    public CreateSmsTemplateResponse createSmsTemplate(CreateSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建商标对客openAPI</p>
     * 
     * @param request CreateSmsTrademarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmsTrademarkResponse
     */
    public CreateSmsTrademarkResponse createSmsTrademarkWithOptions(CreateSmsTrademarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkApplicantName)) {
            query.put("TrademarkApplicantName", request.trademarkApplicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkEffExpDate)) {
            query.put("TrademarkEffExpDate", request.trademarkEffExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkPic)) {
            query.put("TrademarkPic", request.trademarkPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkRegistrationNumber)) {
            query.put("TrademarkRegistrationNumber", request.trademarkRegistrationNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmsTrademark"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmsTrademarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建商标对客openAPI</p>
     * 
     * @param request CreateSmsTrademarkRequest
     * @return CreateSmsTrademarkResponse
     */
    public CreateSmsTrademarkResponse createSmsTrademark(CreateSmsTrademarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsTrademarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除验证码签名</p>
     * 
     * @param request DeleteExtCodeSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExtCodeSignResponse
     */
    public DeleteExtCodeSignResponse deleteExtCodeSignWithOptions(DeleteExtCodeSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extCode)) {
            query.put("ExtCode", request.extCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExtCodeSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExtCodeSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除验证码签名</p>
     * 
     * @param request DeleteExtCodeSignRequest
     * @return DeleteExtCodeSignResponse
     */
    public DeleteExtCodeSignResponse deleteExtCodeSign(DeleteExtCodeSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExtCodeSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a short URL. After you delete a short URL, it cannot be changed to its original state.</p>
     * 
     * @param request DeleteShortUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteShortUrlResponse
     */
    public DeleteShortUrlResponse deleteShortUrlWithOptions(DeleteShortUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            body.put("SourceUrl", request.sourceUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteShortUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a short URL. After you delete a short URL, it cannot be changed to its original state.</p>
     * 
     * @param request DeleteShortUrlRequest
     * @return DeleteShortUrlResponse
     */
    public DeleteShortUrlResponse deleteShortUrl(DeleteShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除资质对客openAPI</p>
     * 
     * @param request DeleteSmsQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmsQualificationResponse
     */
    public DeleteSmsQualificationResponse deleteSmsQualificationWithOptions(DeleteSmsQualificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationGroupId)) {
            query.put("QualificationGroupId", request.qualificationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmsQualification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmsQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除资质对客openAPI</p>
     * 
     * @param request DeleteSmsQualificationRequest
     * @return DeleteSmsQualificationResponse
     */
    public DeleteSmsQualificationResponse deleteSmsQualification(DeleteSmsQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmsQualificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete a signature that has not been approved.</p>
     * <ul>
     * <li>After you delete a signature, you cannot recover it. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a signature.</p>
     * 
     * @param request DeleteSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmsSignResponse
     */
    public DeleteSmsSignResponse deleteSmsSignWithOptions(DeleteSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You cannot delete a signature that has not been approved.</p>
     * <ul>
     * <li>After you delete a signature, you cannot recover it. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a signature.</p>
     * 
     * @param request DeleteSmsSignRequest
     * @return DeleteSmsSignResponse
     */
    public DeleteSmsSignResponse deleteSmsSign(DeleteSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Message templates pending approval can be withdrawn. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</p>
     * <ul>
     * <li>Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>You cannot recover deleted message templates. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message template.</p>
     * 
     * @param request DeleteSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmsTemplateResponse
     */
    public DeleteSmsTemplateResponse deleteSmsTemplateWithOptions(DeleteSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Message templates pending approval can be withdrawn. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</p>
     * <ul>
     * <li>Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>You cannot recover deleted message templates. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a message template.</p>
     * 
     * @param request DeleteSmsTemplateRequest
     * @return DeleteSmsTemplateResponse
     */
    public DeleteSmsTemplateResponse deleteSmsTemplate(DeleteSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query card sending details</p>
     * 
     * @param request GetCardSmsDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCardSmsDetailsResponse
     */
    public GetCardSmsDetailsResponse getCardSmsDetailsWithOptions(GetCardSmsDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizCardId)) {
            query.put("BizCardId", request.bizCardId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizDigitId)) {
            query.put("BizDigitId", request.bizDigitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizSmsId)) {
            query.put("BizSmsId", request.bizSmsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendDate)) {
            query.put("SendDate", request.sendDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardSmsDetails"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardSmsDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query card sending details</p>
     * 
     * @param request GetCardSmsDetailsRequest
     * @return GetCardSmsDetailsResponse
     */
    public GetCardSmsDetailsResponse getCardSmsDetails(GetCardSmsDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardSmsDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the short URLs of a card messages template.</p>
     * 
     * @param request GetCardSmsLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCardSmsLinkResponse
     */
    public GetCardSmsLinkResponse getCardSmsLinkWithOptions(GetCardSmsLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardCodeType)) {
            query.put("CardCodeType", request.cardCodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardLinkType)) {
            query.put("CardLinkType", request.cardLinkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateCode)) {
            query.put("CardTemplateCode", request.cardTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateParamJson)) {
            query.put("CardTemplateParamJson", request.cardTemplateParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customShortCodeJson)) {
            query.put("CustomShortCodeJson", request.customShortCodeJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberJson)) {
            query.put("PhoneNumberJson", request.phoneNumberJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signNameJson)) {
            query.put("SignNameJson", request.signNameJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardSmsLink"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardSmsLinkResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the short URLs of a card messages template.</p>
     * 
     * @param request GetCardSmsLinkRequest
     * @return GetCardSmsLinkResponse
     */
    public GetCardSmsLinkResponse getCardSmsLink(GetCardSmsLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardSmsLinkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a resource uploaded to the specified Object Storage Service (OSS) bucket for unified management. Then, a resource ID is returned. You can manage the resource based on the ID.</p>
     * 
     * @param request GetMediaResourceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaResourceIdResponse
     */
    public GetMediaResourceIdResponse getMediaResourceIdWithOptions(GetMediaResourceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            query.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            query.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memo)) {
            query.put("Memo", request.memo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaResourceId"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaResourceIdResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Converts a resource uploaded to the specified Object Storage Service (OSS) bucket for unified management. Then, a resource ID is returned. You can manage the resource based on the ID.</p>
     * 
     * @param request GetMediaResourceIdRequest
     * @return GetMediaResourceIdResponse
     */
    public GetMediaResourceIdResponse getMediaResourceId(GetMediaResourceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaResourceIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resources such as images and videos used for card message templates can be uploaded to Object Storage Service (OSS) buckets for storage. For more information, see <a href="https://help.aliyun.com/document_detail/437303.html">Upload files to OSS</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the OSS configuration information about card messages.</p>
     * 
     * @param request GetOSSInfoForCardTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSInfoForCardTemplateResponse
     */
    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplateWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSInfoForCardTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOSSInfoForCardTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resources such as images and videos used for card message templates can be uploaded to Object Storage Service (OSS) buckets for storage. For more information, see <a href="https://help.aliyun.com/document_detail/437303.html">Upload files to OSS</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the OSS configuration information about card messages.</p>
     * @return GetOSSInfoForCardTemplateResponse
     */
    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplate() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSInfoForCardTemplateWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When creating signatures or templates, you can upload materials such as login pages with links, backend page screenshots, software copyrights, supplementary agreements, etc. This helps the review personnel understand your business details. If there are multiple materials, they can be combined into one file, supporting png, jpg, jpeg, doc, docx, pdf formats.</li>
     * <li>For additional materials needed when creating signatures or templates, you can upload them to the OSS file system for storage. For file upload operations, refer to <a href="https://help.aliyun.com/zh/sms/upload-files-through-oss">OSS File Upload</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>SMS File Upload, Get Authorization Info</p>
     * 
     * @param request GetOSSInfoForUploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSInfoForUploadFileResponse
     */
    public GetOSSInfoForUploadFileResponse getOSSInfoForUploadFileWithOptions(GetOSSInfoForUploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSInfoForUploadFile"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOSSInfoForUploadFileResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When creating signatures or templates, you can upload materials such as login pages with links, backend page screenshots, software copyrights, supplementary agreements, etc. This helps the review personnel understand your business details. If there are multiple materials, they can be combined into one file, supporting png, jpg, jpeg, doc, docx, pdf formats.</li>
     * <li>For additional materials needed when creating signatures or templates, you can upload them to the OSS file system for storage. For file upload operations, refer to <a href="https://help.aliyun.com/zh/sms/upload-files-through-oss">OSS File Upload</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>SMS File Upload, Get Authorization Info</p>
     * 
     * @param request GetOSSInfoForUploadFileRequest
     * @return GetOSSInfoForUploadFileResponse
     */
    public GetOSSInfoForUploadFileResponse getOSSInfoForUploadFile(GetOSSInfoForUploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSInfoForUploadFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传文件获取oss配置</p>
     * 
     * @param request GetQualificationOssInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQualificationOssInfoResponse
     */
    public GetQualificationOssInfoResponse getQualificationOssInfoWithOptions(GetQualificationOssInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQualificationOssInfo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQualificationOssInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传文件获取oss配置</p>
     * 
     * @param request GetQualificationOssInfoRequest
     * @return GetQualificationOssInfoResponse
     */
    public GetQualificationOssInfoResponse getQualificationOssInfo(GetQualificationOssInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualificationOssInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OCR的OSS信息</p>
     * 
     * @param request GetSmsOcrOssInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsOcrOssInfoResponse
     */
    public GetSmsOcrOssInfoResponse getSmsOcrOssInfoWithOptions(GetSmsOcrOssInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsOcrOssInfo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsOcrOssInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OCR的OSS信息</p>
     * 
     * @param request GetSmsOcrOssInfoRequest
     * @return GetSmsOcrOssInfoResponse
     */
    public GetSmsOcrOssInfoResponse getSmsOcrOssInfo(GetSmsOcrOssInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsOcrOssInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Generally, after submitting the signature, Alibaba Cloud expects to complete the review within 2 hours (Review Business Hours: Monday to Sunday 9:00~21:00, with legal holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the signature fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-updatesmssign?spm">UpdateSmsSign</a> API, or modify the unapproved SMS signature on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Signature Management</a> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query SMS Signature Details</p>
     * 
     * @param request GetSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsSignResponse
     */
    public GetSmsSignResponse getSmsSignWithOptions(GetSmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Generally, after submitting the signature, Alibaba Cloud expects to complete the review within 2 hours (Review Business Hours: Monday to Sunday 9:00~21:00, with legal holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the signature fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-updatesmssign?spm">UpdateSmsSign</a> API, or modify the unapproved SMS signature on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Signature Management</a> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query SMS Signature Details</p>
     * 
     * @param request GetSmsSignRequest
     * @return GetSmsSignResponse
     */
    public GetSmsSignResponse getSmsSign(GetSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Under normal circumstances, Alibaba Cloud expects to complete the review within 2 hours after template submission (review working hours: Monday to Sunday 9:00~21:00, with statutory holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the template fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.41fd339f3bPSCQ">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-modifysmstemplate?spm=a2c4g.11186623.0.0.5b1f6e8bQloFit">ModifySmsTemplate</a> API or modify the SMS template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * <li>The current QuerySmsTemplate interface queries the audit details of a single template by template code. The <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-querysmstemplatelist?spm=a2c4g.11186623.0.0.24086e8bO8cFn4">QuerySmsTemplateList</a> interface can query the template details of all templates under your current account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Text SMS Template Details</p>
     * 
     * @param request GetSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsTemplateResponse
     */
    public GetSmsTemplateResponse getSmsTemplateWithOptions(GetSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Under normal circumstances, Alibaba Cloud expects to complete the review within 2 hours after template submission (review working hours: Monday to Sunday 9:00~21:00, with statutory holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the template fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.41fd339f3bPSCQ">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-modifysmstemplate?spm=a2c4g.11186623.0.0.5b1f6e8bQloFit">ModifySmsTemplate</a> API or modify the SMS template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * <li>The current QuerySmsTemplate interface queries the audit details of a single template by template code. The <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-querysmstemplatelist?spm=a2c4g.11186623.0.0.24086e8bO8cFn4">QuerySmsTemplateList</a> interface can query the template details of all templates under your current account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query Text SMS Template Details</p>
     * 
     * @param request GetSmsTemplateRequest
     * @return GetSmsTemplateResponse
     */
    public GetSmsTemplateResponse getSmsTemplate(GetSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询模板列表详情（新接口）</p>
     * 
     * @param tmpReq GetSmsTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSmsTemplateListResponse
     */
    public GetSmsTemplateListResponse getSmsTemplateListWithOptions(GetSmsTemplateListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSmsTemplateListShrinkRequest request = new GetSmsTemplateListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.usableStateList)) {
            request.usableStateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.usableStateList, "UsableStateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateTag)) {
            query.put("TemplateTag", request.templateTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usableStateListShrink)) {
            query.put("UsableStateList", request.usableStateListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSmsTemplateList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSmsTemplateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询模板列表详情（新接口）</p>
     * 
     * @param request GetSmsTemplateListRequest
     * @return GetSmsTemplateListResponse
     */
    public GetSmsTemplateListResponse getSmsTemplateList(GetSmsTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSmsTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of a message template.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of a message template.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a> to modify an existing signature and submit the signature for approval. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">signature specifications</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Signatures pending approval cannot be modified.</li>
     * <li>You cannot modify a signature after it is approved. If you no longer need the signature, you can delete it.</li>
     * <li>If you are an individual user, you cannot apply for a new signature on the same day that your signature is rejected or deleted. We recommend that you modify the rejected signature and submit it again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a rejected signature and submit it for approval. Signatures that are pending approval or have been approved cannot be modified.</p>
     * 
     * @param request ModifySmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmsSignResponse
     */
    public ModifySmsSignResponse modifySmsSignWithOptions(ModifySmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signSource)) {
            query.put("SignSource", request.signSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signType)) {
            query.put("SignType", request.signType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signFileList)) {
            body.put("SignFileList", request.signFileList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a> to modify an existing signature and submit the signature for approval. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">signature specifications</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Signatures pending approval cannot be modified.</li>
     * <li>You cannot modify a signature after it is approved. If you no longer need the signature, you can delete it.</li>
     * <li>If you are an individual user, you cannot apply for a new signature on the same day that your signature is rejected or deleted. We recommend that you modify the rejected signature and submit it again.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a rejected signature and submit it for approval. Signatures that are pending approval or have been approved cannot be modified.</p>
     * 
     * @param request ModifySmsSignRequest
     * @return ModifySmsSignResponse
     */
    public ModifySmsSignResponse modifySmsSign(ModifySmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you apply for a message template, if the template fails to pass the review, you can call this operation to modify the template and submit the template again. You can call this operation to modify only a template for a specific message type.
     * The template content must comply with the <a href="https://help.aliyun.com/document_detail/108253.html">SMS template specifications</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of an unapproved message template and submits it for review again.</p>
     * 
     * @deprecated OpenAPI ModifySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::UpdateSmsTemplate instead.
     * 
     * @param request ModifySmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public ModifySmsTemplateResponse modifySmsTemplateWithOptions(ModifySmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you apply for a message template, if the template fails to pass the review, you can call this operation to modify the template and submit the template again. You can call this operation to modify only a template for a specific message type.
     * The template content must comply with the <a href="https://help.aliyun.com/document_detail/108253.html">SMS template specifications</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of an unapproved message template and submits it for review again.</p>
     * 
     * @deprecated OpenAPI ModifySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::UpdateSmsTemplate instead.
     * 
     * @param request ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public ModifySmsTemplateResponse modifySmsTemplate(ModifySmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of a message template.</p>
     * 
     * @param request QueryCardSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCardSmsTemplateResponse
     */
    public QueryCardSmsTemplateResponse queryCardSmsTemplateWithOptions(QueryCardSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCardSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCardSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of a message template.</p>
     * 
     * @param request QueryCardSmsTemplateRequest
     * @return QueryCardSmsTemplateResponse
     */
    public QueryCardSmsTemplateResponse queryCardSmsTemplate(QueryCardSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCardSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sent card messages.</p>
     * 
     * @param request QueryCardSmsTemplateReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCardSmsTemplateReportResponse
     */
    public QueryCardSmsTemplateReportResponse queryCardSmsTemplateReportWithOptions(QueryCardSmsTemplateReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCodes)) {
            query.put("TemplateCodes", request.templateCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCardSmsTemplateReport"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCardSmsTemplateReportResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sent card messages.</p>
     * 
     * @param request QueryCardSmsTemplateReportRequest
     * @return QueryCardSmsTemplateReportResponse
     */
    public QueryCardSmsTemplateReportResponse queryCardSmsTemplateReport(QueryCardSmsTemplateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCardSmsTemplateReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询验证码签名</p>
     * 
     * @param request QueryExtCodeSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExtCodeSignResponse
     */
    public QueryExtCodeSignResponse queryExtCodeSignWithOptions(QueryExtCodeSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extCode)) {
            query.put("ExtCode", request.extCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExtCodeSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExtCodeSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询验证码签名</p>
     * 
     * @param request QueryExtCodeSignRequest
     * @return QueryExtCodeSignResponse
     */
    public QueryExtCodeSignResponse queryExtCodeSign(QueryExtCodeSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryExtCodeSignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a mobile phone number can receive card messages.</p>
     * 
     * @param tmpReq QueryMobilesCardSupportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMobilesCardSupportResponse
     */
    public QueryMobilesCardSupportResponse queryMobilesCardSupportWithOptions(QueryMobilesCardSupportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMobilesCardSupportShrinkRequest request = new QueryMobilesCardSupportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mobiles)) {
            request.mobilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mobiles, "Mobiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobilesShrink)) {
            query.put("Mobiles", request.mobilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMobilesCardSupport"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMobilesCardSupportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a mobile phone number can receive card messages.</p>
     * 
     * @param request QueryMobilesCardSupportRequest
     * @return QueryMobilesCardSupportResponse
     */
    public QueryMobilesCardSupportResponse queryMobilesCardSupport(QueryMobilesCardSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMobilesCardSupportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>点击明细查询</p>
     * 
     * @param request QueryPageSmartShortUrlLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPageSmartShortUrlLogResponse
     */
    public QueryPageSmartShortUrlLogResponse queryPageSmartShortUrlLogWithOptions(QueryPageSmartShortUrlLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createDateEnd)) {
            query.put("CreateDateEnd", request.createDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createDateStart)) {
            query.put("CreateDateStart", request.createDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shortUrl)) {
            query.put("ShortUrl", request.shortUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPageSmartShortUrlLog"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPageSmartShortUrlLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>点击明细查询</p>
     * 
     * @param request QueryPageSmartShortUrlLogRequest
     * @return QueryPageSmartShortUrlLogResponse
     */
    public QueryPageSmartShortUrlLogResponse queryPageSmartShortUrlLog(QueryPageSmartShortUrlLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPageSmartShortUrlLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a message.</p>
     * 
     * @param request QuerySendDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySendDetailsResponse
     */
    public QuerySendDetailsResponse querySendDetailsWithOptions(QuerySendDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendDate)) {
            query.put("SendDate", request.sendDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySendDetails"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySendDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a message.</p>
     * 
     * @param request QuerySendDetailsRequest
     * @return QuerySendDetailsResponse
     */
    public QuerySendDetailsResponse querySendDetails(QuerySendDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySendDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to query message delivery details, including the number of delivered messages, the number of messages with delivery receipts, and the time that a message is sent. If a large number of messages are sent on the specified date, you can specify the number of items displayed on each page and the number of pages to view the details by page.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message delivery details.</p>
     * 
     * @param request QuerySendStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySendStatisticsResponse
     */
    public QuerySendStatisticsResponse querySendStatisticsWithOptions(QuerySendStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGlobe)) {
            query.put("IsGlobe", request.isGlobe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySendStatistics"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySendStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to query message delivery details, including the number of delivered messages, the number of messages with delivery receipts, and the time that a message is sent. If a large number of messages are sent on the specified date, you can specify the number of items displayed on each page and the number of pages to view the details by page.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message delivery details.</p>
     * 
     * @param request QuerySendStatisticsRequest
     * @return QuerySendStatisticsResponse
     */
    public QuerySendStatisticsResponse querySendStatistics(QuerySendStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySendStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a short URL.</p>
     * 
     * @param request QueryShortUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryShortUrlResponse
     */
    public QueryShortUrlResponse queryShortUrlWithOptions(QueryShortUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shortUrl)) {
            body.put("ShortUrl", request.shortUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShortUrl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShortUrlResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a short URL.</p>
     * 
     * @param request QueryShortUrlRequest
     * @return QueryShortUrlResponse
     */
    public QueryShortUrlResponse queryShortUrl(QueryShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个资质详情</p>
     * 
     * @param request QuerySingleSmsQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySingleSmsQualificationResponse
     */
    public QuerySingleSmsQualificationResponse querySingleSmsQualificationWithOptions(QuerySingleSmsQualificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationGroupId)) {
            query.put("QualificationGroupId", request.qualificationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySingleSmsQualification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySingleSmsQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单个资质详情</p>
     * 
     * @param request QuerySingleSmsQualificationRequest
     * @return QuerySingleSmsQualificationResponse
     */
    public QuerySingleSmsQualificationResponse querySingleSmsQualification(QuerySingleSmsQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySingleSmsQualificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询APP-ICP备案对客openAPI</p>
     * 
     * @param tmpReq QuerySmsAppIcpRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsAppIcpRecordResponse
     */
    public QuerySmsAppIcpRecordResponse querySmsAppIcpRecordWithOptions(QuerySmsAppIcpRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySmsAppIcpRecordShrinkRequest request = new QuerySmsAppIcpRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appIcpRecordIdList)) {
            request.appIcpRecordIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appIcpRecordIdList, "AppIcpRecordIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIcpRecordIdListShrink)) {
            query.put("AppIcpRecordIdList", request.appIcpRecordIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsAppIcpRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsAppIcpRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询APP-ICP备案对客openAPI</p>
     * 
     * @param request QuerySmsAppIcpRecordRequest
     * @return QuerySmsAppIcpRecordResponse
     */
    public QuerySmsAppIcpRecordResponse querySmsAppIcpRecord(QuerySmsAppIcpRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsAppIcpRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询委托授权书</p>
     * 
     * @param tmpReq QuerySmsAuthorizationLetterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsAuthorizationLetterResponse
     */
    public QuerySmsAuthorizationLetterResponse querySmsAuthorizationLetterWithOptions(QuerySmsAuthorizationLetterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySmsAuthorizationLetterShrinkRequest request = new QuerySmsAuthorizationLetterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authorizationLetterIdList)) {
            request.authorizationLetterIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authorizationLetterIdList, "AuthorizationLetterIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterIdListShrink)) {
            query.put("AuthorizationLetterIdList", request.authorizationLetterIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationCode)) {
            query.put("OrganizationCode", request.organizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsAuthorizationLetter"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsAuthorizationLetterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询委托授权书</p>
     * 
     * @param request QuerySmsAuthorizationLetterRequest
     * @return QuerySmsAuthorizationLetterResponse
     */
    public QuerySmsAuthorizationLetterResponse querySmsAuthorizationLetter(QuerySmsAuthorizationLetterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsAuthorizationLetterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资质审核列表页</p>
     * 
     * @param request QuerySmsQualificationRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsQualificationRecordResponse
     */
    public QuerySmsQualificationRecordResponse querySmsQualificationRecordWithOptions(QuerySmsQualificationRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationGroupName)) {
            query.put("QualificationGroupName", request.qualificationGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBySelf)) {
            query.put("UseBySelf", request.useBySelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderId)) {
            query.put("WorkOrderId", request.workOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsQualificationRecord"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsQualificationRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资质审核列表页</p>
     * 
     * @param request QuerySmsQualificationRecordRequest
     * @return QuerySmsQualificationRecordResponse
     */
    public QuerySmsQualificationRecordResponse querySmsQualificationRecord(QuerySmsQualificationRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsQualificationRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you apply for an SMS signature, you can query its status by using the <a href="https://dysms.console.aliyun.com/dysms.htm">Alibaba Cloud SMS console</a> or calling the operation. If the signature is rejected, you can modify the signature based on the reason why it is rejected.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this API operation up to 500 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a signature.</p>
     * 
     * @param request QuerySmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsSignResponse
     */
    public QuerySmsSignResponse querySmsSignWithOptions(QuerySmsSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you apply for an SMS signature, you can query its status by using the <a href="https://dysms.console.aliyun.com/dysms.htm">Alibaba Cloud SMS console</a> or calling the operation. If the signature is rejected, you can modify the signature based on the reason why it is rejected.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this API operation up to 500 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a signature.</p>
     * 
     * @param request QuerySmsSignRequest
     * @return QuerySmsSignResponse
     */
    public QuerySmsSignResponse querySmsSign(QuerySmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message signatures, including the name, creation time, and approval status of each signature. If a message template is rejected, the reason is returned. Modify the message signature based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message signatures by page.</p>
     * 
     * @param request QuerySmsSignListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsSignListResponse
     */
    public QuerySmsSignListResponse querySmsSignListWithOptions(QuerySmsSignListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsSignList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsSignListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message signatures, including the name, creation time, and approval status of each signature. If a message template is rejected, the reason is returned. Modify the message signature based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message signatures by page.</p>
     * 
     * @param request QuerySmsSignListRequest
     * @return QuerySmsSignListResponse
     */
    public QuerySmsSignListResponse querySmsSignList(QuerySmsSignListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsSignListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a message template, you can call this operation to query the approval status of the template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval status of a message template.</p>
     * 
     * @deprecated OpenAPI QuerySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::GetSmsTemplate instead.
     * 
     * @param request QuerySmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public QuerySmsTemplateResponse querySmsTemplateWithOptions(QuerySmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create a message template, you can call this operation to query the approval status of the template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval status of a message template.</p>
     * 
     * @deprecated OpenAPI QuerySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::GetSmsTemplate instead.
     * 
     * @param request QuerySmsTemplateRequest
     * @return QuerySmsTemplateResponse
     */
    @Deprecated
    // Deprecated
    public QuerySmsTemplateResponse querySmsTemplate(QuerySmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message templates, including the name, creation time, and approval status of each template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message templates.</p>
     * 
     * @param request QuerySmsTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsTemplateListResponse
     */
    public QuerySmsTemplateListResponse querySmsTemplateListWithOptions(QuerySmsTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsTemplateList"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message templates, including the name, creation time, and approval status of each template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries message templates.</p>
     * 
     * @param request QuerySmsTemplateListRequest
     * @return QuerySmsTemplateListResponse
     */
    public QuerySmsTemplateListResponse querySmsTemplateList(QuerySmsTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询商标对客openAPI</p>
     * 
     * @param tmpReq QuerySmsTrademarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmsTrademarkResponse
     */
    public QuerySmsTrademarkResponse querySmsTrademarkWithOptions(QuerySmsTrademarkRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySmsTrademarkShrinkRequest request = new QuerySmsTrademarkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.trademarkIdList)) {
            request.trademarkIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.trademarkIdList, "TrademarkIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkIdListShrink)) {
            query.put("TrademarkIdList", request.trademarkIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmsTrademark"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmsTrademarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询商标对客openAPI</p>
     * 
     * @param request QuerySmsTrademarkRequest
     * @return QuerySmsTrademarkResponse
     */
    public QuerySmsTrademarkResponse querySmsTrademark(QuerySmsTrademarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTrademarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证手机验证码</p>
     * 
     * @param request RequiredPhoneCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequiredPhoneCodeResponse
     */
    public RequiredPhoneCodeResponse requiredPhoneCodeWithOptions(RequiredPhoneCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            query.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequiredPhoneCode"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequiredPhoneCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证手机验证码</p>
     * 
     * @param request RequiredPhoneCodeRequest
     * @return RequiredPhoneCodeResponse
     */
    public RequiredPhoneCodeResponse requiredPhoneCode(RequiredPhoneCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requiredPhoneCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to send multiple card messages to a maximum of mobile phone numbers at a time. Different signatures and rollback settings can be specified for the mobile phone numbers.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends multiple card messages at a time.</p>
     * 
     * @param request SendBatchCardSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendBatchCardSmsResponse
     */
    public SendBatchCardSmsResponse sendBatchCardSmsWithOptions(SendBatchCardSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateCode)) {
            query.put("CardTemplateCode", request.cardTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateParamJson)) {
            query.put("CardTemplateParamJson", request.cardTemplateParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalTemplateCode)) {
            query.put("DigitalTemplateCode", request.digitalTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalTemplateParamJson)) {
            query.put("DigitalTemplateParamJson", request.digitalTemplateParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackType)) {
            query.put("FallbackType", request.fallbackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberJson)) {
            query.put("PhoneNumberJson", request.phoneNumberJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signNameJson)) {
            query.put("SignNameJson", request.signNameJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateCode)) {
            query.put("SmsTemplateCode", request.smsTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateParamJson)) {
            query.put("SmsTemplateParamJson", request.smsTemplateParamJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsUpExtendCodeJson)) {
            query.put("SmsUpExtendCodeJson", request.smsUpExtendCodeJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamJson)) {
            query.put("TemplateParamJson", request.templateParamJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBatchCardSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBatchCardSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to send multiple card messages to a maximum of mobile phone numbers at a time. Different signatures and rollback settings can be specified for the mobile phone numbers.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends multiple card messages at a time.</p>
     * 
     * @param request SendBatchCardSmsRequest
     * @return SendBatchCardSmsResponse
     */
    public SendBatchCardSmsResponse sendBatchCardSms(SendBatchCardSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendBatchCardSmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to send messages to a maximum of 100 recipients at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a single message template and multiple signatures to send messages to multiple recipients.</p>
     * 
     * @param request SendBatchSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendBatchSmsResponse
     */
    public SendBatchSmsResponse sendBatchSmsWithOptions(SendBatchSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberJson)) {
            body.put("PhoneNumberJson", request.phoneNumberJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signNameJson)) {
            body.put("SignNameJson", request.signNameJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsUpExtendCodeJson)) {
            body.put("SmsUpExtendCodeJson", request.smsUpExtendCodeJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParamJson)) {
            body.put("TemplateParamJson", request.templateParamJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBatchSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBatchSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to send messages to a maximum of 100 recipients at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Uses a single message template and multiple signatures to send messages to multiple recipients.</p>
     * 
     * @param request SendBatchSmsRequest
     * @return SendBatchSmsResponse
     */
    public SendBatchSmsResponse sendBatchSms(SendBatchSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendBatchSmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that the message template that you want to use has been approved. If the mobile phone number of a recipient does not support card messages, the SendCardSms operation allows the rollback feature to ensure successful delivery.</p>
     * <ul>
     * <li>When you call the SendCardSms operation to send card messages, the operation checks whether the mobile phone numbers of the recipients support card messages. If the mobile phone numbers do not support card messages, you can specify whether to enable rollback. Otherwise, the card message cannot be delivered.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a card message.</p>
     * 
     * @param request SendCardSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendCardSmsResponse
     */
    public SendCardSmsResponse sendCardSmsWithOptions(SendCardSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardObjects)) {
            query.put("CardObjects", request.cardObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardTemplateCode)) {
            query.put("CardTemplateCode", request.cardTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalTemplateCode)) {
            query.put("DigitalTemplateCode", request.digitalTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalTemplateParam)) {
            query.put("DigitalTemplateParam", request.digitalTemplateParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackType)) {
            query.put("FallbackType", request.fallbackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateCode)) {
            query.put("SmsTemplateCode", request.smsTemplateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsTemplateParam)) {
            query.put("SmsTemplateParam", request.smsTemplateParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsUpExtendCode)) {
            query.put("SmsUpExtendCode", request.smsUpExtendCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParam)) {
            query.put("TemplateParam", request.templateParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCardSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCardSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that the message template that you want to use has been approved. If the mobile phone number of a recipient does not support card messages, the SendCardSms operation allows the rollback feature to ensure successful delivery.</p>
     * <ul>
     * <li>When you call the SendCardSms operation to send card messages, the operation checks whether the mobile phone numbers of the recipients support card messages. If the mobile phone numbers do not support card messages, you can specify whether to enable rollback. Otherwise, the card message cannot be delivered.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a card message.</p>
     * 
     * @param request SendCardSmsRequest
     * @return SendCardSmsResponse
     */
    public SendCardSmsResponse sendCardSms(SendCardSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCardSmsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送物流短信</p>
     * 
     * @param request SendLogisticsSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendLogisticsSmsResponse
     */
    public SendLogisticsSmsResponse sendLogisticsSmsWithOptions(SendLogisticsSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expressCompanyCode)) {
            query.put("ExpressCompanyCode", request.expressCompanyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailNo)) {
            query.put("MailNo", request.mailNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformCompanyCode)) {
            query.put("PlatformCompanyCode", request.platformCompanyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParam)) {
            query.put("TemplateParam", request.templateParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendLogisticsSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendLogisticsSmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送物流短信</p>
     * 
     * @param request SendLogisticsSmsRequest
     * @return SendLogisticsSmsResponse
     */
    public SendLogisticsSmsResponse sendLogisticsSms(SendLogisticsSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendLogisticsSmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is mainly used to send a single message. In special scenarios, you can send multiple messages with the same content to a maximum of 1,000 mobile numbers. Note that group sending may be delayed.</p>
     * <ul>
     * <li>To send messages with different signatures and template content to multiple mobile numbers in a single request, call the <a href="https://help.aliyun.com/document_detail/102364.html">SendBatchSms</a> operation.</li>
     * <li>You are charged for using Alibaba Cloud Short Message Service (SMS) based on the amount of messages sent. For more information, see <a href="https://www.aliyun.com/price/product#/sms/detail">Pricing</a>.</li>
     * <li>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message. Before you call this operation, submit a message signature and message template, and make sure that the signature and template are approved.</p>
     * 
     * @param request SendSmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendSmsResponse
     */
    public SendSmsResponse sendSmsWithOptions(SendSmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smsUpExtendCode)) {
            query.put("SmsUpExtendCode", request.smsUpExtendCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateParam)) {
            query.put("TemplateParam", request.templateParam);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSms"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendSmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is mainly used to send a single message. In special scenarios, you can send multiple messages with the same content to a maximum of 1,000 mobile numbers. Note that group sending may be delayed.</p>
     * <ul>
     * <li>To send messages with different signatures and template content to multiple mobile numbers in a single request, call the <a href="https://help.aliyun.com/document_detail/102364.html">SendBatchSms</a> operation.</li>
     * <li>You are charged for using Alibaba Cloud Short Message Service (SMS) based on the amount of messages sent. For more information, see <a href="https://www.aliyun.com/price/product#/sms/detail">Pricing</a>.</li>
     * <li>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message. Before you call this operation, submit a message signature and message template, and make sure that the signature and template are approved.</p>
     * 
     * @param request SendSmsRequest
     * @return SendSmsResponse
     */
    public SendSmsResponse sendSms(SendSmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendSmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Metrics:</p>
     * <ul>
     * <li>Requested OTP messages</li>
     * <li>Verified OTP messages
     * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.<blockquote>
     * <p>If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations: 1. Call the SmsConversion operation in an asynchronous manner by configuring queues or events. 2. Manually degrade your services or use a circuit breaker to automatically degrade services.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reports the status of an OTP message to Alibaba Cloud SMS.</p>
     * 
     * @param request SmsConversionIntlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmsConversionIntlResponse
     */
    public SmsConversionIntlResponse smsConversionIntlWithOptions(SmsConversionIntlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversionTime)) {
            query.put("ConversionTime", request.conversionTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delivered)) {
            query.put("Delivered", request.delivered);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsConversionIntl"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsConversionIntlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Metrics:</p>
     * <ul>
     * <li>Requested OTP messages</li>
     * <li>Verified OTP messages
     * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.<blockquote>
     * <p>If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations: 1. Call the SmsConversion operation in an asynchronous manner by configuring queues or events. 2. Manually degrade your services or use a circuit breaker to automatically degrade services.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reports the status of an OTP message to Alibaba Cloud SMS.</p>
     * 
     * @param request SmsConversionIntlRequest
     * @return SmsConversionIntlResponse
     */
    public SmsConversionIntlResponse smsConversionIntl(SmsConversionIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smsConversionIntlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建资质对客openAPI</p>
     * 
     * @param tmpReq SubmitSmsQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSmsQualificationResponse
     */
    public SubmitSmsQualificationResponse submitSmsQualificationWithOptions(SubmitSmsQualificationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSmsQualificationShrinkRequest request = new SubmitSmsQualificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.businessLicensePics)) {
            request.businessLicensePicsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.businessLicensePics, "BusinessLicensePics", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherFiles)) {
            request.otherFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherFiles, "OtherFiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardExpDate)) {
            query.put("AdminIDCardExpDate", request.adminIDCardExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardFrontFace)) {
            query.put("AdminIDCardFrontFace", request.adminIDCardFrontFace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardNo)) {
            query.put("AdminIDCardNo", request.adminIDCardNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardPic)) {
            query.put("AdminIDCardPic", request.adminIDCardPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardType)) {
            query.put("AdminIDCardType", request.adminIDCardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminName)) {
            query.put("AdminName", request.adminName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminPhoneNo)) {
            query.put("AdminPhoneNo", request.adminPhoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicensePicsShrink)) {
            query.put("BusinessLicensePics", request.businessLicensePicsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bussinessLicenseExpDate)) {
            query.put("BussinessLicenseExpDate", request.bussinessLicenseExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyCode)) {
            query.put("CertifyCode", request.certifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyType)) {
            query.put("CompanyType", request.companyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIDCardNo)) {
            query.put("LegalPersonIDCardNo", request.legalPersonIDCardNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIDCardType)) {
            query.put("LegalPersonIDCardType", request.legalPersonIDCardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardBackSide)) {
            query.put("LegalPersonIdCardBackSide", request.legalPersonIdCardBackSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardEffTime)) {
            query.put("LegalPersonIdCardEffTime", request.legalPersonIdCardEffTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardFrontSide)) {
            query.put("LegalPersonIdCardFrontSide", request.legalPersonIdCardFrontSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationCode)) {
            query.put("OrganizationCode", request.organizationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherFilesShrink)) {
            query.put("OtherFiles", request.otherFilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationName)) {
            query.put("QualificationName", request.qualificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBySelf)) {
            query.put("UseBySelf", request.useBySelf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whetherShare)) {
            query.put("WhetherShare", request.whetherShare);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSmsQualification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmsQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建资质对客openAPI</p>
     * 
     * @param request SubmitSmsQualificationRequest
     * @return SubmitSmsQualificationResponse
     */
    public SubmitSmsQualificationResponse submitSmsQualification(SubmitSmsQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmsQualificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to a message template.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches tags to a message template.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes tags from a message template.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes tags from a message template.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改验证码签名</p>
     * 
     * @param request UpdateExtCodeSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExtCodeSignResponse
     */
    public UpdateExtCodeSignResponse updateExtCodeSignWithOptions(UpdateExtCodeSignRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.existExtCode)) {
            query.put("ExistExtCode", request.existExtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newExtCode)) {
            query.put("NewExtCode", request.newExtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExtCodeSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExtCodeSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改验证码签名</p>
     * 
     * @param request UpdateExtCodeSignRequest
     * @return UpdateExtCodeSignResponse
     */
    public UpdateExtCodeSignResponse updateExtCodeSign(UpdateExtCodeSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExtCodeSignWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改资质对客openAPI</p>
     * 
     * @param tmpReq UpdateSmsQualificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmsQualificationResponse
     */
    public UpdateSmsQualificationResponse updateSmsQualificationWithOptions(UpdateSmsQualificationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSmsQualificationShrinkRequest request = new UpdateSmsQualificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.businessLicensePics)) {
            request.businessLicensePicsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.businessLicensePics, "BusinessLicensePics", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherFiles)) {
            request.otherFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherFiles, "OtherFiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardExpDate)) {
            query.put("AdminIDCardExpDate", request.adminIDCardExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardFrontFace)) {
            query.put("AdminIDCardFrontFace", request.adminIDCardFrontFace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardNo)) {
            query.put("AdminIDCardNo", request.adminIDCardNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardPic)) {
            query.put("AdminIDCardPic", request.adminIDCardPic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminIDCardType)) {
            query.put("AdminIDCardType", request.adminIDCardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminName)) {
            query.put("AdminName", request.adminName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminPhoneNo)) {
            query.put("AdminPhoneNo", request.adminPhoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicensePicsShrink)) {
            query.put("BusinessLicensePics", request.businessLicensePicsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bussinessLicenseExpDate)) {
            query.put("BussinessLicenseExpDate", request.bussinessLicenseExpDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certifyCode)) {
            query.put("CertifyCode", request.certifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIDCardNo)) {
            query.put("LegalPersonIDCardNo", request.legalPersonIDCardNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIDCardType)) {
            query.put("LegalPersonIDCardType", request.legalPersonIDCardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardBackSide)) {
            query.put("LegalPersonIdCardBackSide", request.legalPersonIdCardBackSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardEffTime)) {
            query.put("LegalPersonIdCardEffTime", request.legalPersonIdCardEffTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonIdCardFrontSide)) {
            query.put("LegalPersonIdCardFrontSide", request.legalPersonIdCardFrontSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPersonName)) {
            query.put("LegalPersonName", request.legalPersonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherFilesShrink)) {
            query.put("OtherFiles", request.otherFilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationGroupId)) {
            query.put("QualificationGroupId", request.qualificationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmsQualification"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmsQualificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改资质对客openAPI</p>
     * 
     * @param request UpdateSmsQualificationRequest
     * @return UpdateSmsQualificationResponse
     */
    public UpdateSmsQualificationResponse updateSmsQualification(UpdateSmsQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmsQualificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Only signatures that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a> and call this interface to modify and resubmit for review after modification.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, please see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Text SMS Signature</p>
     * 
     * @param tmpReq UpdateSmsSignRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmsSignResponse
     */
    public UpdateSmsSignResponse updateSmsSignWithOptions(UpdateSmsSignRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSmsSignShrinkRequest request = new UpdateSmsSignShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.moreData)) {
            request.moreDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.moreData, "MoreData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIcpRecordId)) {
            query.put("AppIcpRecordId", request.appIcpRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applySceneContent)) {
            query.put("ApplySceneContent", request.applySceneContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationLetterId)) {
            query.put("AuthorizationLetterId", request.authorizationLetterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moreDataShrink)) {
            query.put("MoreData", request.moreDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signSource)) {
            query.put("SignSource", request.signSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signType)) {
            query.put("SignType", request.signType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdParty)) {
            query.put("ThirdParty", request.thirdParty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkId)) {
            query.put("TrademarkId", request.trademarkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmsSign"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmsSignResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Only signatures that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a> and call this interface to modify and resubmit for review after modification.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, please see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Update Text SMS Signature</p>
     * 
     * @param request UpdateSmsSignRequest
     * @return UpdateSmsSignResponse
     */
    public UpdateSmsSignResponse updateSmsSign(UpdateSmsSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmsSignWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on SMS Service Update: Signature &amp; Template Interfaces</a>.</li>
     * <li>Only templates that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.4bf5561ajcFtMQ">Handling Suggestions for Failed SMS Template Reviews</a> and call this interface to modify and resubmit for review.</li>
     * <li>Modifications made through the interface will be synchronized in the SMS service console. For related operations on templates in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/message-templates/?spm=a2c4g.11186623.0.0.35a947464Itaxp">SMS Templates</a>.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The single-user QPS limit for this interface is 1000 times/second. Exceeding this limit will result in API throttling, which may impact your business. Please make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Text SMS Template</p>
     * 
     * @param tmpReq UpdateSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmsTemplateResponse
     */
    public UpdateSmsTemplateResponse updateSmsTemplateWithOptions(UpdateSmsTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSmsTemplateShrinkRequest request = new UpdateSmsTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.moreData)) {
            request.moreDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.moreData, "MoreData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applySceneContent)) {
            query.put("ApplySceneContent", request.applySceneContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intlType)) {
            query.put("IntlType", request.intlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moreDataShrink)) {
            query.put("MoreData", request.moreDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedSignName)) {
            query.put("RelatedSignName", request.relatedSignName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateRule)) {
            query.put("TemplateRule", request.templateRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficDriving)) {
            query.put("TrafficDriving", request.trafficDriving);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on SMS Service Update: Signature &amp; Template Interfaces</a>.</li>
     * <li>Only templates that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.4bf5561ajcFtMQ">Handling Suggestions for Failed SMS Template Reviews</a> and call this interface to modify and resubmit for review.</li>
     * <li>Modifications made through the interface will be synchronized in the SMS service console. For related operations on templates in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/message-templates/?spm=a2c4g.11186623.0.0.35a947464Itaxp">SMS Templates</a>.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The single-user QPS limit for this interface is 1000 times/second. Exceeding this limit will result in API throttling, which may impact your business. Please make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Update Text SMS Template</p>
     * 
     * @param request UpdateSmsTemplateRequest
     * @return UpdateSmsTemplateResponse
     */
    public UpdateSmsTemplateResponse updateSmsTemplate(UpdateSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送手机验证码</p>
     * 
     * @param request ValidPhoneCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidPhoneCodeResponse
     */
    public ValidPhoneCodeResponse validPhoneCodeWithOptions(ValidPhoneCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certifyCode)) {
            query.put("CertifyCode", request.certifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNo)) {
            query.put("PhoneNo", request.phoneNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidPhoneCode"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidPhoneCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送手机验证码</p>
     * 
     * @param request ValidPhoneCodeRequest
     * @return ValidPhoneCodeResponse
     */
    public ValidPhoneCodeResponse validPhoneCode(ValidPhoneCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validPhoneCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>物流短信运单号校验</p>
     * 
     * @param request VerifyLogisticsSmsMailNoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyLogisticsSmsMailNoResponse
     */
    public VerifyLogisticsSmsMailNoResponse verifyLogisticsSmsMailNoWithOptions(VerifyLogisticsSmsMailNoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expressCompanyCode)) {
            query.put("ExpressCompanyCode", request.expressCompanyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailNo)) {
            query.put("MailNo", request.mailNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformCompanyCode)) {
            query.put("PlatformCompanyCode", request.platformCompanyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyLogisticsSmsMailNo"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyLogisticsSmsMailNoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>物流短信运单号校验</p>
     * 
     * @param request VerifyLogisticsSmsMailNoRequest
     * @return VerifyLogisticsSmsMailNoResponse
     */
    public VerifyLogisticsSmsMailNoResponse verifyLogisticsSmsMailNo(VerifyLogisticsSmsMailNoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyLogisticsSmsMailNoWithOptions(request, runtime);
    }
}
