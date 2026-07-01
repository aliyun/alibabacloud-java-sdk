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
            new TeaPair("us-east-1", "dysmsapi.us-east-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dysmsapi.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dysmsapi.aliyuncs.com")
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
     * <b>summary</b> : 
     * <p>创建/编辑5G消息固定菜单</p>
     * 
     * @param request AddRcsSignMenuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRcsSignMenuResponse
     */
    public AddRcsSignMenuResponse addRcsSignMenuWithOptions(AddRcsSignMenuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.menuContent)) {
            query.put("MenuContent", request.menuContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRcsSignMenu"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRcsSignMenuResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建/编辑5G消息固定菜单</p>
     * 
     * @param request AddRcsSignMenuRequest
     * @return AddRcsSignMenuResponse
     */
    public AddRcsSignMenuResponse addRcsSignMenu(AddRcsSignMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRcsSignMenuWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * Short Message Service does not currently support this API operation.</p>
     * </blockquote>
     * <ul>
     * <li>You can create up to 3,000 short URLs per calendar day.</li>
     * <li>After a short URL is generated, it must pass a security review, which typically takes 10 minutes to 2 hours. You cannot access the short URL until it passes this review.</li>
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
     * <blockquote>
     * <p>Notice: 
     * Short Message Service does not currently support this API operation.</p>
     * </blockquote>
     * <ul>
     * <li>You can create up to 3,000 short URLs per calendar day.</li>
     * <li>After a short URL is generated, it must pass a security review, which typically takes 10 minutes to 2 hours. You cannot access the short URL until it passes this review.</li>
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
     * <ul>
     * <li>In accordance with the regulations of the Ministry of Industry and Information Technology (MIIT) and the <a href="https://help.aliyun.com/document_detail/2806975.html">relevant requirements</a> of carriers, Alibaba Cloud has made functional modifications to signature-related APIs. To improve the review efficiency and approval rate of your signatures, use the new API <a href="https://help.aliyun.com/document_detail/2807427.html">CreateSmsSign - Apply for an SMS signature</a>.</li>
     * <li>An individual user can apply for one signature per natural day under the same Alibaba Cloud account. Enterprise users have no limit on the number of applications. For details about the differences in rights and interests between individual users and enterprise users, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * <li>The signature information applied for through the API is synchronized to the SMS console. For operations on signatures in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * <li>After you submit a signature application, you can call the <a href="https://help.aliyun.com/document_detail/419283.html">QuerySmsSign</a> API to query the review status and details of the signature. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and use <a href="https://help.aliyun.com/document_detail/120998.html">SignSmsReport</a> to obtain signature review status messages.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 1 call per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>This API has been discontinued.</p>
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
     * <ul>
     * <li>In accordance with the regulations of the Ministry of Industry and Information Technology (MIIT) and the <a href="https://help.aliyun.com/document_detail/2806975.html">relevant requirements</a> of carriers, Alibaba Cloud has made functional modifications to signature-related APIs. To improve the review efficiency and approval rate of your signatures, use the new API <a href="https://help.aliyun.com/document_detail/2807427.html">CreateSmsSign - Apply for an SMS signature</a>.</li>
     * <li>An individual user can apply for one signature per natural day under the same Alibaba Cloud account. Enterprise users have no limit on the number of applications. For details about the differences in rights and interests between individual users and enterprise users, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * <li>The signature information applied for through the API is synchronized to the SMS console. For operations on signatures in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * <li>After you submit a signature application, you can call the <a href="https://help.aliyun.com/document_detail/419283.html">QuerySmsSign</a> API to query the review status and details of the signature. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and use <a href="https://help.aliyun.com/document_detail/120998.html">SignSmsReport</a> to obtain signature review status messages.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 1 call per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>This API has been discontinued.</p>
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
     * <ul>
     * <li>In accordance with the regulations of the Ministry of Industry and Information Technology and the <a href="https://help.aliyun.com/document_detail/2806975.html">related requirements</a> of carriers, Alibaba Cloud has revamped the functionality of template-related APIs. To improve the review efficiency and approval rate of your templates, please use the new operation <a href="https://help.aliyun.com/document_detail/2807431.html">CreateSmsTemplate - Apply for SMS template</a>.</li>
     * <li>You can submit a maximum of 100 SMS template applications per natural day via the API. It is recommended that each application be submitted at intervals of at least 30 seconds. There is no limit on the number of submissions when applying for SMS templates through the <a href="https://dysms.console.aliyun.com/domestic/text/template">console</a>.</li>
     * <li>Template information applied for through the API is synchronized to the SMS service console. For related template operations in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">SMS templates</a>.</li>
     * <li>After submitting the template application, you can query the template review status and details through the <a href="https://help.aliyun.com/document_detail/419289.html">QuerySmsTemplate</a> operation. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and obtain the template review status messages through <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a>.</li>
     * <li>Domestic SMS templates and international/Hong Kong, Macao, and Taiwan SMS templates are not interchangeable (cannot be mixed). Please apply for templates based on your business usage scenarios.</li>
     * <li>Only enterprise-verified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. For details about the differences between individual and enterprise user privileges, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The per-user QPS limit for this operation is 1,000 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the operation reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>An SMS template is the detailed content received by the recipient, including variables and template content. You can apply for verification code, notification, or promotional SMS templates based on your business needs. SMS can only be sent after the template is approved.</p>
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
     * <ul>
     * <li>In accordance with the regulations of the Ministry of Industry and Information Technology and the <a href="https://help.aliyun.com/document_detail/2806975.html">related requirements</a> of carriers, Alibaba Cloud has revamped the functionality of template-related APIs. To improve the review efficiency and approval rate of your templates, please use the new operation <a href="https://help.aliyun.com/document_detail/2807431.html">CreateSmsTemplate - Apply for SMS template</a>.</li>
     * <li>You can submit a maximum of 100 SMS template applications per natural day via the API. It is recommended that each application be submitted at intervals of at least 30 seconds. There is no limit on the number of submissions when applying for SMS templates through the <a href="https://dysms.console.aliyun.com/domestic/text/template">console</a>.</li>
     * <li>Template information applied for through the API is synchronized to the SMS service console. For related template operations in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">SMS templates</a>.</li>
     * <li>After submitting the template application, you can query the template review status and details through the <a href="https://help.aliyun.com/document_detail/419289.html">QuerySmsTemplate</a> operation. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and obtain the template review status messages through <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a>.</li>
     * <li>Domestic SMS templates and international/Hong Kong, Macao, and Taiwan SMS templates are not interchangeable (cannot be mixed). Please apply for templates based on your business usage scenarios.</li>
     * <li>Only enterprise-verified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. For details about the differences between individual and enterprise user privileges, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The per-user QPS limit for this operation is 1,000 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the operation reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>An SMS template is the detailed content received by the recipient, including variables and template content. You can apply for verification code, notification, or promotional SMS templates based on your business needs. SMS can only be sent after the template is approved.</p>
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
     * <p>Updates the qualification and authorization letter for a signature.</p>
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
     * <p>Updates the qualification and authorization letter for a signature.</p>
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
     * <ul>
     * <li>Alibaba Cloud accounts that have not activated card SMS cannot call this API.</li>
     * <li>Card SMS is currently in the internal invitation phase. Contact your Alibaba Cloud account manager to apply for activation or <a href="https://help.aliyun.com/document_detail/464625.html">contact Alibaba Cloud pre-sales</a>.</li>
     * <li>We recommend that you use the new API <a href="~~QueryMobilesCardSupport~~">QueryMobilesCardSupport</a> to query whether phone numbers support card SMS.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 2,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether phone numbers support card SMS.</p>
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
     * <ul>
     * <li>Alibaba Cloud accounts that have not activated card SMS cannot call this API.</li>
     * <li>Card SMS is currently in the internal invitation phase. Contact your Alibaba Cloud account manager to apply for activation or <a href="https://help.aliyun.com/document_detail/464625.html">contact Alibaba Cloud pre-sales</a>.</li>
     * <li>We recommend that you use the new API <a href="~~QueryMobilesCardSupport~~">QueryMobilesCardSupport</a> to query whether phone numbers support card SMS.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 2,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make calls reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether phone numbers support card SMS.</p>
     * 
     * @param request CheckMobilesCardSupportRequest
     * @return CheckMobilesCardSupportResponse
     */
    public CheckMobilesCardSupportResponse checkMobilesCardSupport(CheckMobilesCardSupportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMobilesCardSupportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>指标说明：转化率=OTP 转化量/OTP 发送量。</p>
     * <ul>
     * <li>OTP发送量：验证码发送量。</li>
     * <li>OTP转化量：验证码转换量。（用户成功获取验证码，并进行回传）<blockquote>
     * <p>转化率反馈功能会对业务系统有一定的侵入性，为了防止调用转化率 API 的抖动影响业务逻辑，请考虑： </p>
     * <ul>
     * <li>使用异步模式（例如：队列或事件驱动）调用 API。 </li>
     * <li>添加可降级的方案保护业务逻辑（例如：手动降级开工或者使用断路器自动降级）。</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reports SMS conversion rate statistics to the Alibaba Cloud SMS platform.</p>
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
     * <b>description</b> :
     * <p>指标说明：转化率=OTP 转化量/OTP 发送量。</p>
     * <ul>
     * <li>OTP发送量：验证码发送量。</li>
     * <li>OTP转化量：验证码转换量。（用户成功获取验证码，并进行回传）<blockquote>
     * <p>转化率反馈功能会对业务系统有一定的侵入性，为了防止调用转化率 API 的抖动影响业务逻辑，请考虑： </p>
     * <ul>
     * <li>使用异步模式（例如：队列或事件驱动）调用 API。 </li>
     * <li>添加可降级的方案保护业务逻辑（例如：手动降级开工或者使用断路器自动降级）。</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reports SMS conversion rate statistics to the Alibaba Cloud SMS platform.</p>
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
     * <ul>
     * <li>The card SMS feature is currently available by invitation only. To enable this feature, contact your Alibaba Cloud business manager or our <a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213273d4Xe6UEu#section-81n-72q-ybm">pre-sales consultation</a> team.</li>
     * <li>This operation saves a card SMS template, submits it to mobile phone vendors for review, and returns a template code.</li>
     * <li>If a card SMS template contains a type or event that a vendor does not support, the system does not submit the template to that vendor for review. For more information, see <a href="https://help.aliyun.com/document_detail/434611.html">Supported template types by vendor</a>.</li>
     * <li>For more examples of card SMS templates, see <a href="https://help.aliyun.com/document_detail/435361.html">Card SMS template examples</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 300. API calls that exceed this limit are throttled, which may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a card SMS template.</p>
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
     * <ul>
     * <li>The card SMS feature is currently available by invitation only. To enable this feature, contact your Alibaba Cloud business manager or our <a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213273d4Xe6UEu#section-81n-72q-ybm">pre-sales consultation</a> team.</li>
     * <li>This operation saves a card SMS template, submits it to mobile phone vendors for review, and returns a template code.</li>
     * <li>If a card SMS template contains a type or event that a vendor does not support, the system does not submit the template to that vendor for review. For more information, see <a href="https://help.aliyun.com/document_detail/434611.html">Supported template types by vendor</a>.</li>
     * <li>For more examples of card SMS templates, see <a href="https://help.aliyun.com/document_detail/435361.html">Card SMS template examples</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 300. API calls that exceed this limit are throttled, which may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a card SMS template.</p>
     * 
     * @param request CreateCardSmsTemplateRequest
     * @return CreateCardSmsTemplateResponse
     */
    public CreateCardSmsTemplateResponse createCardSmsTemplate(CreateCardSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCardSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates, updates, or deletes a signature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an order to add, update, or delete a digital message signature.</p>
     * 
     * @param tmpReq CreateDigitalSignOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDigitalSignOrderResponse
     */
    public CreateDigitalSignOrderResponse createDigitalSignOrderWithOptions(CreateDigitalSignOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDigitalSignOrderShrinkRequest request = new CreateDigitalSignOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderContext)) {
            request.orderContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderContext, "OrderContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendMessage)) {
            query.put("ExtendMessage", request.extendMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderContextShrink)) {
            query.put("OrderContext", request.orderContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationId)) {
            query.put("QualificationId", request.qualificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationVersion)) {
            query.put("QualificationVersion", request.qualificationVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signId)) {
            query.put("SignId", request.signId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signIndustry)) {
            query.put("SignIndustry", request.signIndustry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signSource)) {
            query.put("SignSource", request.signSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitter)) {
            query.put("Submitter", request.submitter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDigitalSignOrder"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDigitalSignOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates, updates, or deletes a signature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an order to add, update, or delete a digital message signature.</p>
     * 
     * @param request CreateDigitalSignOrderRequest
     * @return CreateDigitalSignOrderResponse
     */
    public CreateDigitalSignOrderResponse createDigitalSignOrder(CreateDigitalSignOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDigitalSignOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to create a reusable template for your digital SMS messages.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a digital SMS template.</p>
     * 
     * @param request CreateDigitalSmsTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDigitalSmsTemplateResponse
     */
    public CreateDigitalSmsTemplateResponse createDigitalSmsTemplateWithOptions(CreateDigitalSmsTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateContents)) {
            query.put("TemplateContents", request.templateContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDigitalSmsTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDigitalSmsTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this operation to create a reusable template for your digital SMS messages.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a digital SMS template.</p>
     * 
     * @param request CreateDigitalSmsTemplateRequest
     * @return CreateDigitalSmsTemplateResponse
     */
    public CreateDigitalSmsTemplateResponse createDigitalSmsTemplate(CreateDigitalSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDigitalSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建终端5G适配情况查询任务</p>
     * 
     * @param request CreateRCSMobileCapableTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRCSMobileCapableTaskResponse
     */
    public CreateRCSMobileCapableTaskResponse createRCSMobileCapableTaskWithOptions(CreateRCSMobileCapableTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbersFile)) {
            query.put("PhoneNumbersFile", request.phoneNumbersFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRCSMobileCapableTask"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRCSMobileCapableTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建终端5G适配情况查询任务</p>
     * 
     * @param request CreateRCSMobileCapableTaskRequest
     * @return CreateRCSMobileCapableTaskResponse
     */
    public CreateRCSMobileCapableTaskResponse createRCSMobileCapableTask(CreateRCSMobileCapableTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRCSMobileCapableTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G消息模板</p>
     * 
     * @param request CreateRCSTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRCSTemplateResponse
     */
    public CreateRCSTemplateResponse createRCSTemplateWithOptions(CreateRCSTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relatedSignNames)) {
            query.put("RelatedSignNames", request.relatedSignNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFormat)) {
            query.put("TemplateFormat", request.templateFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateMenu)) {
            query.put("TemplateMenu", request.templateMenu);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRCSTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRCSTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G消息模板</p>
     * 
     * @param request CreateRCSTemplateRequest
     * @return CreateRCSTemplateResponse
     */
    public CreateRCSTemplateResponse createRCSTemplate(CreateRCSTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRCSTemplateWithOptions(request, runtime);
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: To use a <strong>live app</strong> as a signature source, you must now provide its ICP filing information. This requires you to upload a screenshot of the app\&quot;s ICP filing.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The process for using a live app as a signature source has changed. If you use an app as the signature source, you must call this operation to create an ICP filing record for it.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.appRuntimePic)) {
            query.put("AppRuntimePic", request.appRuntimePic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appServiceName)) {
            query.put("AppServiceName", request.appServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appStoreDownloadPic)) {
            query.put("AppStoreDownloadPic", request.appStoreDownloadPic);
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: To use a <strong>live app</strong> as a signature source, you must now provide its ICP filing information. This requires you to upload a screenshot of the app\&quot;s ICP filing.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The process for using a live app as a signature source has changed. If you use an app as the signature source, you must call this operation to create an ICP filing record for it.</p>
     * 
     * @param request CreateSmsAppIcpRecordRequest
     * @return CreateSmsAppIcpRecordResponse
     */
    public CreateSmsAppIcpRecordResponse createSmsAppIcpRecord(CreateSmsAppIcpRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsAppIcpRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before use, please read the <a href="https://help.aliyun.com/document_detail/56741.html">Authorization Letter Specifications</a>. Download the <a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250414/bvpcmo/%E6%8E%88%E6%9D%83%E5%A7%94%E6%89%98%E4%B9%A6%E6%A8%A1%E7%89%88.doc">Authorization Letter Template</a>, fill it out and stamp it according to the specifications, and then upload it.</li>
     * <li>The authorization letter you create can be used when applying for SMS qualifications or SMS signatures. If your qualification or signature is intended for use by a third party, you must create and submit an authorization letter.</li>
     * <li>After creating an authorization letter, you can call <a href="~~QuerySmsAuthorizationLetter~~">QuerySmsAuthorizationLetter</a> to query the details of the created authorization letter. Authorization letter information created through the API is synchronized to the Short Message Service console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If the qualification is intended for use by a third party or the requested signature involves third-party rights, you must obtain third-party authorization and create an authorization letter before submitting the application.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before use, please read the <a href="https://help.aliyun.com/document_detail/56741.html">Authorization Letter Specifications</a>. Download the <a href="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/zh-CN/20250414/bvpcmo/%E6%8E%88%E6%9D%83%E5%A7%94%E6%89%98%E4%B9%A6%E6%A8%A1%E7%89%88.doc">Authorization Letter Template</a>, fill it out and stamp it according to the specifications, and then upload it.</li>
     * <li>The authorization letter you create can be used when applying for SMS qualifications or SMS signatures. If your qualification or signature is intended for use by a third party, you must create and submit an authorization letter.</li>
     * <li>After creating an authorization letter, you can call <a href="~~QuerySmsAuthorizationLetter~~">QuerySmsAuthorizationLetter</a> to query the details of the created authorization letter. Authorization letter information created through the API is synchronized to the Short Message Service console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If the qualification is intended for use by a third party or the requested signature involves third-party rights, you must obtain third-party authorization and create an authorization letter before submitting the application.</p>
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
     * <li>For details about the changes between the new and original operations, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on updating signature and template operations for Short Message Service</a>.</li>
     * <li>Users who verify your identity - Individual account can apply for one formal signature per calendar day per Alibaba Cloud account. Users who verify your identity - Enterprise account currently have no such limit. For details about the differences between individual and enterprise user privileges, see <a href="https://help.aliyun.com/document_detail/55324.html">Before you begin</a>.</li>
     * <li>Read the <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a> to learn about the SMS signature review standards.</li>
     * <li>Signatures applied for through the API are synchronized to the Short Message Service console. For console-related operations, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * <li>After you submit a signature application, you can call the <a href="https://help.aliyun.com/document_detail/2807429.html">GetSmsSign</a> operation to query the signature review status and details. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and use <a href="https://help.aliyun.com/document_detail/120998.html">SignSmsReport</a> to obtain the signature review status messages.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An SMS signature identifies the sender of an SMS message. Before sending SMS messages, you must apply for a signature and a template. The system prepends the approved SMS signature to the message content and sends them together to the recipient.</p>
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
     * <li>For details about the changes between the new and original operations, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on updating signature and template operations for Short Message Service</a>.</li>
     * <li>Users who verify your identity - Individual account can apply for one formal signature per calendar day per Alibaba Cloud account. Users who verify your identity - Enterprise account currently have no such limit. For details about the differences between individual and enterprise user privileges, see <a href="https://help.aliyun.com/document_detail/55324.html">Before you begin</a>.</li>
     * <li>Read the <a href="https://help.aliyun.com/document_detail/108076.html">Signature specifications</a> to learn about the SMS signature review standards.</li>
     * <li>Signatures applied for through the API are synchronized to the Short Message Service console. For console-related operations, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * <li>After you submit a signature application, you can call the <a href="https://help.aliyun.com/document_detail/2807429.html">GetSmsSign</a> operation to query the signature review status and details. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure receipt messages</a> and use <a href="https://help.aliyun.com/document_detail/120998.html">SignSmsReport</a> to obtain the signature review status messages.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An SMS signature identifies the sender of an SMS message. Before sending SMS messages, you must apply for a signature and a template. The system prepends the approved SMS signature to the message content and sends them together to the recipient.</p>
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
     * <li>For details on the API changes for signatures and templates, see the <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Signature and Template API Updates for Short Message Service</a>.</li>
     * <li>Wait at least 30 seconds between API calls when applying for a message template.</li>
     * <li>Message templates you apply for via the API are synchronized to the Short Message Service console. For details on how to manage message templates in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">Message templates</a>.</li>
     * <li>After you submit a template for review, you can call the <a href="https://help.aliyun.com/document_detail/2807433.html">GetSmsTemplate</a> API to query the template\&quot;s review status and details. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure status reports</a> to receive the template\&quot;s review status through <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a>.</li>
     * <li>Message templates for Chinese mainland messages and international messages are not interchangeable. Apply for message templates based on your use case.</li>
     * <li>Only enterprise-verified users can apply for message templates for promotional messages and international messages. For details on the permission differences between individual and enterprise users, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A message template defines the content of an SMS message. This content includes the message text and any variables. You can create templates for various business needs, such as sending verification codes, notifications, or promotional messages. A template must be approved before you can use it to send messages.</p>
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
     * <li>For details on the API changes for signatures and templates, see the <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Signature and Template API Updates for Short Message Service</a>.</li>
     * <li>Wait at least 30 seconds between API calls when applying for a message template.</li>
     * <li>Message templates you apply for via the API are synchronized to the Short Message Service console. For details on how to manage message templates in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">Message templates</a>.</li>
     * <li>After you submit a template for review, you can call the <a href="https://help.aliyun.com/document_detail/2807433.html">GetSmsTemplate</a> API to query the template\&quot;s review status and details. You can also <a href="https://help.aliyun.com/document_detail/101508.html">configure status reports</a> to receive the template\&quot;s review status through <a href="https://help.aliyun.com/document_detail/120999.html">TemplateSmsReport</a>.</li>
     * <li>Message templates for Chinese mainland messages and international messages are not interchangeable. Apply for message templates based on your use case.</li>
     * <li>Only enterprise-verified users can apply for message templates for promotional messages and international messages. For details on the permission differences between individual and enterprise users, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A message template defines the content of an SMS message. This content includes the message text and any variables. You can create templates for various business needs, such as sending verification codes, notifications, or promotional messages. A template must be approved before you can use it to send messages.</p>
     * 
     * @param request CreateSmsTemplateRequest
     * @return CreateSmsTemplateResponse
     */
    public CreateSmsTemplateResponse createSmsTemplate(CreateSmsTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmsTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The trademark must be searchable on the China Trademark Network of the Trademark Office of the China National Intellectual Property Administration, and the trademark owner must match the enterprise name.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a trademark entity. This operation is used when you need to upload trademark information when the signature source is set to trademark.</p>
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
     * <b>description</b> :
     * <p>The trademark must be searchable on the China Trademark Network of the Trademark Office of the China National Intellectual Property Administration, and the trademark owner must match the enterprise name.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a trademark entity. This operation is used when you need to upload trademark information when the signature source is set to trademark.</p>
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
     * <blockquote>
     * <p>Notice: 
     * Short Message Service does not currently support this API operation.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100. Calls that exceed this limit are subject to rate limiting, which may affect your business. To prevent disruptions, call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a short URL. After deletion, the short URL is no longer usable and cannot be resolved to the source URL.</p>
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
     * <blockquote>
     * <p>Notice: 
     * Short Message Service does not currently support this API operation.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100. Calls that exceed this limit are subject to rate limiting, which may affect your business. To prevent disruptions, call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a short URL. After deletion, the short URL is no longer usable and cannot be resolved to the source URL.</p>
     * 
     * @param request DeleteShortUrlRequest
     * @return DeleteShortUrlResponse
     */
    public DeleteShortUrlResponse deleteShortUrl(DeleteShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: Once a qualification is deleted, it cannot be restored or selected when you apply for signatures later. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Qualifications under review cannot be modified or deleted. You can withdraw the application in the Short Message Service <a href="https://dysms.console.aliyun.com/domestic/text/qualification">console</a> before performing the operation.</li>
     * <li>Approved qualifications that have been bound to signatures cannot be deleted.</li>
     * <li>Rejected qualifications can be directly resubmitted for review after you <a href="~~UpdateSmsQualification~~">modify the qualification information</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you no longer use an SMS qualification or need to delete it for other reasons, call this API or delete the SMS qualification in the Short Message Service console.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: Once a qualification is deleted, it cannot be restored or selected when you apply for signatures later. Proceed with caution.</p>
     * </blockquote>
     * <ul>
     * <li>Qualifications under review cannot be modified or deleted. You can withdraw the application in the Short Message Service <a href="https://dysms.console.aliyun.com/domestic/text/qualification">console</a> before performing the operation.</li>
     * <li>Approved qualifications that have been bound to signatures cannot be deleted.</li>
     * <li>Rejected qualifications can be directly resubmitted for review after you <a href="~~UpdateSmsQualification~~">modify the qualification information</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you no longer use an SMS qualification or need to delete it for other reasons, call this API or delete the SMS qualification in the Short Message Service console.</p>
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
     * <ul>
     * <li>You can delete signatures that are in the Withdrawn, Failed, or Approved state. You cannot delete signatures that are in the Pending Approval state.</li>
     * <li>Deleted SMS signatures cannot be recovered, and the signature can no longer be used to send SMS messages. Proceed with caution.</li>
     * <li>Signature deletion operations performed via the API are synchronized to the SMS Service console. For information about how to manage templates in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you no longer use an SMS signature and need to delete it, call this operation or delete the SMS signature in the SMS Service console.</p>
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
     * <ul>
     * <li>You can delete signatures that are in the Withdrawn, Failed, or Approved state. You cannot delete signatures that are in the Pending Approval state.</li>
     * <li>Deleted SMS signatures cannot be recovered, and the signature can no longer be used to send SMS messages. Proceed with caution.</li>
     * <li>Signature deletion operations performed via the API are synchronized to the SMS Service console. For information about how to manage templates in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">SMS signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you no longer use an SMS signature and need to delete it, call this operation or delete the SMS signature in the SMS Service console.</p>
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
     * <ul>
     * <li>支持删除已撤回、审核失败或审核通过的模板，审核中的短信模板不支持删除。</li>
     * <li>删除短信模板后不可恢复，且后续不可再使用该模板发送短信，请谨慎操作。</li>
     * <li>通过接口删除模板的操作会在短信服务控制台同步，在控制台对模板的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108085.html">短信模板</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an SMS template that you no longer need.</p>
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
     * <ul>
     * <li>支持删除已撤回、审核失败或审核通过的模板，审核中的短信模板不支持删除。</li>
     * <li>删除短信模板后不可恢复，且后续不可再使用该模板发送短信，请谨慎操作。</li>
     * <li>通过接口删除模板的操作会在短信服务控制台同步，在控制台对模板的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108085.html">短信模板</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an SMS template that you no longer need.</p>
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
     * <p>Queries the card SMS sending records and sending status of a single phone number.</p>
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
     * <p>Queries the card SMS sending records and sending status of a single phone number.</p>
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
     * <ul>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213273d4Xe6UEu#section-81n-72q-ybm">阿里云售前咨询</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <ul>
     * <li>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the short URL for a card message.</p>
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
     * <ul>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213273d4Xe6UEu#section-81n-72q-ybm">阿里云售前咨询</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <ul>
     * <li>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the short URL for a card message.</p>
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
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为300次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Converts images and videos uploaded to OSS storage for card SMS into resource data for unified management, and returns a resource ID. You can manage the returned resource ID as needed.</p>
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
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为300次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Converts images and videos uploaded to OSS storage for card SMS into resource data for unified management, and returns a resource ID. You can manage the returned resource ID as needed.</p>
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
     * <ul>
     * <li>您在调用卡片短信相关API接口前，首先需要开通卡片短信功能，目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html">阿里云售前咨询</a>。</li>
     * <li>卡片短信模板中使用的图片、视频等素材资源可上传到OSS文件系统保存。文件上传操作，请参见<a href="https://help.aliyun.com/document_detail/437303.html">OSS文件上传</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为300次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS resource configuration information for card messages. This information is used for subsequent OSS file upload operations.</p>
     * 
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
     * <ul>
     * <li>您在调用卡片短信相关API接口前，首先需要开通卡片短信功能，目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html">阿里云售前咨询</a>。</li>
     * <li>卡片短信模板中使用的图片、视频等素材资源可上传到OSS文件系统保存。文件上传操作，请参见<a href="https://help.aliyun.com/document_detail/437303.html">OSS文件上传</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为300次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the OSS resource configuration information for card messages. This information is used for subsequent OSS file upload operations.</p>
     * @return GetOSSInfoForCardTemplateResponse
     */
    public GetOSSInfoForCardTemplateResponse getOSSInfoForCardTemplate() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSInfoForCardTemplateWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you create a signature or template, you can upload materials such as login pages with links, backend page screenshots, software copyrights, and supplementary agreements. These materials help reviewers understand the details of your business. If you have multiple materials, you can combine them into one file. The supported formats are png, jpg, jpeg, doc, docx, and pdf.</li>
     * <li>Additional materials required for creating a signature or template can be uploaded to the OSS file system for storage. For information about file upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files to OSS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains OSS resource configuration information, which will be used for subsequent OSS file upload operations.</p>
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
     * <li>When you create a signature or template, you can upload materials such as login pages with links, backend page screenshots, software copyrights, and supplementary agreements. These materials help reviewers understand the details of your business. If you have multiple materials, you can combine them into one file. The supported formats are png, jpg, jpeg, doc, docx, and pdf.</li>
     * <li>Additional materials required for creating a signature or template can be uploaded to the OSS file system for storage. For information about file upload operations, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files to OSS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains OSS resource configuration information, which will be used for subsequent OSS file upload operations.</p>
     * 
     * @param request GetOSSInfoForUploadFileRequest
     * @return GetOSSInfoForUploadFileResponse
     */
    public GetOSSInfoForUploadFileResponse getOSSInfoForUploadFile(GetOSSInfoForUploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOSSInfoForUploadFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you apply for a qualification or signature, if the purpose is for other use or involves a third party, you must provide an <a href="https://help.aliyun.com/document_detail/56741.html">authorization letter</a>.</li>
     * <li>After you use this API to obtain the OSS resource configuration information, upload the related qualification materials through OSS. For more information, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</li>
     * <li>The names of files to be uploaded cannot contain Chinese characters or special symbols.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the OSS resource configuration information for qualification materials. This configuration information will be used for subsequent uploads of qualification files such as authorization letters and enterprise certificates.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>When you apply for a qualification or signature, if the purpose is for other use or involves a third party, you must provide an <a href="https://help.aliyun.com/document_detail/56741.html">authorization letter</a>.</li>
     * <li>After you use this API to obtain the OSS resource configuration information, upload the related qualification materials through OSS. For more information, see <a href="https://help.aliyun.com/document_detail/2833114.html">Upload files through OSS</a>.</li>
     * <li>The names of files to be uploaded cannot contain Chinese characters or special symbols.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the OSS resource configuration information for qualification materials. This configuration information will be used for subsequent uploads of qualification files such as authorization letters and enterprise certificates.</p>
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
     * <p>查询5g短信详情</p>
     * 
     * @param request GetRCSSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRCSSignatureResponse
     */
    public GetRCSSignatureResponse getRCSSignatureWithOptions(GetRCSSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRCSSignature"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRCSSignatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5g短信详情</p>
     * 
     * @param request GetRCSSignatureRequest
     * @return GetRCSSignatureResponse
     */
    public GetRCSSignatureResponse getRCSSignature(GetRCSSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRCSSignatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the OSS information for OCR.</p>
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
     * <p>Retrieves the OSS information for OCR.</p>
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
     * <li>仅可查询<strong>首次创建</strong>的签名资料或者<strong>最新审核通过</strong>的资料。</li>
     * <li>新接口和原接口变更的公告详情请参见<a href="https://help.aliyun.com/document_detail/2806975.html">关于短信服务更新签名&amp;模板接口的公告</a>。</li>
     * <li>审核时间：一般情况下，签名提交后，阿里云预计在 2 个小时内审核完成（审核工作时间：周一至周日 9:00~21:00，法定节假日顺延）。</li>
     * <li>如果签名未通过审核，会返回审核失败的原因，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用<a href="https://help.aliyun.com/document_detail/2807428.html">UpdateSmsSign</a>接口或在<a href="https://dysms.console.aliyun.com/domestic/text/sign">签名管理</a>页面修改未审核通过的短信签名。</li>
     * <li><a href="~~QuerySmsSignList~~">QuerySmsSignList</a>接口可以查询您账号下的所有签名，包括签名审核状态、签名类型、签名名称等。</li>
     * <li>本接口的单用户QPS限制为150次/秒。超过限制，API调用将会被限流，这可能会影响您的业务，请合理调用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the review details of a signature after you apply for it.</p>
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
     * <li>仅可查询<strong>首次创建</strong>的签名资料或者<strong>最新审核通过</strong>的资料。</li>
     * <li>新接口和原接口变更的公告详情请参见<a href="https://help.aliyun.com/document_detail/2806975.html">关于短信服务更新签名&amp;模板接口的公告</a>。</li>
     * <li>审核时间：一般情况下，签名提交后，阿里云预计在 2 个小时内审核完成（审核工作时间：周一至周日 9:00~21:00，法定节假日顺延）。</li>
     * <li>如果签名未通过审核，会返回审核失败的原因，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用<a href="https://help.aliyun.com/document_detail/2807428.html">UpdateSmsSign</a>接口或在<a href="https://dysms.console.aliyun.com/domestic/text/sign">签名管理</a>页面修改未审核通过的短信签名。</li>
     * <li><a href="~~QuerySmsSignList~~">QuerySmsSignList</a>接口可以查询您账号下的所有签名，包括签名审核状态、签名类型、签名名称等。</li>
     * <li>本接口的单用户QPS限制为150次/秒。超过限制，API调用将会被限流，这可能会影响您的业务，请合理调用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the review details of a signature after you apply for it.</p>
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
     * <li>新接口和原接口变更的公告详情请参见<a href="https://help.aliyun.com/document_detail/2806975.html">关于短信服务更新签名&amp;模板接口的公告</a>。</li>
     * <li>审核时间：一般情况下，模板提交后，阿里云预计在2个小时内审核完成（审核工作时间：周一至周日9:00~21:00，法定节假日顺延）。</li>
     * <li>如果模板未通过审核，会返回审核失败的原因，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用<a href="~~UpdateSmsTemplate~~">UpdateSmsTemplate</a>接口或在<a href="https://dysms.console.aliyun.com/domestic/text/template">模板管理</a>页面修改短信模板。</li>
     * <li>当前接口是通过模板Code查询单个模板的审核详情。<a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a>接口可以查询您当前账号下所有模板的模板详情。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval details of a template after you submit a template application. You can view the approval status of the template.</p>
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
     * <li>新接口和原接口变更的公告详情请参见<a href="https://help.aliyun.com/document_detail/2806975.html">关于短信服务更新签名&amp;模板接口的公告</a>。</li>
     * <li>审核时间：一般情况下，模板提交后，阿里云预计在2个小时内审核完成（审核工作时间：周一至周日9:00~21:00，法定节假日顺延）。</li>
     * <li>如果模板未通过审核，会返回审核失败的原因，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用<a href="~~UpdateSmsTemplate~~">UpdateSmsTemplate</a>接口或在<a href="https://dysms.console.aliyun.com/domestic/text/template">模板管理</a>页面修改短信模板。</li>
     * <li>当前接口是通过模板Code查询单个模板的审核详情。<a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a>接口可以查询您当前账号下所有模板的模板详情。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the approval details of a template after you submit a template application. You can view the approval status of the template.</p>
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
     * <p>You can log on to the Short Message Service (SMS) console and go to the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page to filter SMS templates that are bound to tag key-value pairs, or click <strong>Details</strong> in the Actions column to view the tags that are bound to the current template.</p>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this operation is 50 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags are markers that you add to templates. Each tag consists of a key-value pair (Key-Value). You can query the template codes bound to a tag key-value pair, or query all tags bound to a specific template.</p>
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
     * <p>You can log on to the Short Message Service (SMS) console and go to the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page to filter SMS templates that are bound to tag key-value pairs, or click <strong>Details</strong> in the Actions column to view the tags that are bound to the current template.</p>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this operation is 50 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this operation properly.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags are markers that you add to templates. Each tag consists of a key-value pair (Key-Value). You can query the template codes bound to a tag key-value pair, or query all tags bound to a specific template.</p>
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
     * <ul>
     * <li>根据工信部规定与运营商<a href="https://help.aliyun.com/document_detail/2806975.html">相关要求</a>，阿里云进行了签名相关API的功能改造。为提升您签名的审核效率和审核通过率，请您使用新接口<a href="https://help.aliyun.com/document_detail/2807428.html">UpdateSmsSign-修改短信签名</a>。</li>
     * <li>仅支持修改未通过审核的签名，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用此接口修改后自动提交审核，签名进入待审核状态。</li>
     * <li>通过接口修改签名的操作会在短信服务控制台同步，在控制台对签名的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108073.html">短信签名</a>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation is discontinued.</p>
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
     * <ul>
     * <li>根据工信部规定与运营商<a href="https://help.aliyun.com/document_detail/2806975.html">相关要求</a>，阿里云进行了签名相关API的功能改造。为提升您签名的审核效率和审核通过率，请您使用新接口<a href="https://help.aliyun.com/document_detail/2807428.html">UpdateSmsSign-修改短信签名</a>。</li>
     * <li>仅支持修改未通过审核的签名，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用此接口修改后自动提交审核，签名进入待审核状态。</li>
     * <li>通过接口修改签名的操作会在短信服务控制台同步，在控制台对签名的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108073.html">短信签名</a>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This operation is discontinued.</p>
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
     * <ul>
     * <li>根据工信部规定与运营商<a href="https://help.aliyun.com/document_detail/2806975.html">相关要求</a>，阿里云进行了模板相关API的功能改造。为提升您模板的审核效率和审核通过率，请您使用新接口<a href="https://help.aliyun.com/document_detail/2807432.html">UpdateSmsTemplate-修改短信模板</a>。</li>
     * <li>仅支持修改未通过审核的模板，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用此接口修改后重新提交审核。</li>
     * <li>通过接口修改模板的操作会在短信服务控制台同步，在控制台对模板的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108085.html">短信模板</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>This operation is discontinued.</p>
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
     * <ul>
     * <li>根据工信部规定与运营商<a href="https://help.aliyun.com/document_detail/2806975.html">相关要求</a>，阿里云进行了模板相关API的功能改造。为提升您模板的审核效率和审核通过率，请您使用新接口<a href="https://help.aliyun.com/document_detail/2807432.html">UpdateSmsTemplate-修改短信模板</a>。</li>
     * <li>仅支持修改未通过审核的模板，请参考<a href="https://help.aliyun.com/document_detail/65990.html">短信审核失败的处理建议</a>，调用此接口修改后重新提交审核。</li>
     * <li>通过接口修改模板的操作会在短信服务控制台同步，在控制台对模板的相关操作，请参见<a href="https://help.aliyun.com/document_detail/108085.html">短信模板</a>。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
     * 
     * <b>summary</b> : 
     * <p>This operation is discontinued.</p>
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
     * <ul>
     * <li>Alibaba Cloud accounts that have not activated the card SMS service cannot call this API.</li>
     * <li>The card SMS service is currently in the internal invitation phase. Contact your Alibaba Cloud business manager to apply for activation or <a href="https://help.aliyun.com/document_detail/464625.html">contact Alibaba Cloud pre-sales consultation</a>.</li>
     * <li>You can also log on to the <a href="https://dysms.console.aliyun.com/domestic/card">Domestic Card SMS</a> page in the console and query the review status of card SMS templates on the Template Management tab.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this operation is 300 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of a card SMS template and returns information about the review by mobile phone vendors.</p>
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
     * <ul>
     * <li>Alibaba Cloud accounts that have not activated the card SMS service cannot call this API.</li>
     * <li>The card SMS service is currently in the internal invitation phase. Contact your Alibaba Cloud business manager to apply for activation or <a href="https://help.aliyun.com/document_detail/464625.html">contact Alibaba Cloud pre-sales consultation</a>.</li>
     * <li>You can also log on to the <a href="https://dysms.console.aliyun.com/domestic/card">Domestic Card SMS</a> page in the console and query the review status of card SMS templates on the Template Management tab.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this operation is 300 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of a card SMS template and returns information about the review by mobile phone vendors.</p>
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
     * <p>The QPS limit on this operation is 300 calls per second per user. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation at a reasonable pace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the parsing data of a specified card SMS template. The parsing data includes the number of successful SMS parsing receipts, the number of message exposures, and the number of message clicks.</p>
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
     * <p>The QPS limit on this operation is 300 calls per second per user. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation at a reasonable pace.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the parsing data of a specified card SMS template. The parsing data includes the number of successful SMS parsing receipts, the number of message exposures, and the number of message clicks.</p>
     * 
     * @param request QueryCardSmsTemplateReportRequest
     * @return QueryCardSmsTemplateReportResponse
     */
    public QueryCardSmsTemplateReportResponse queryCardSmsTemplateReport(QueryCardSmsTemplateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCardSmsTemplateReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query only the digital SMS signatures that belong to your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a digital SMS signature by its name.</p>
     * 
     * @param request QueryDigitalSignByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDigitalSignByNameResponse
     */
    public QueryDigitalSignByNameResponse queryDigitalSignByNameWithOptions(QueryDigitalSignByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryDigitalSignByName"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDigitalSignByNameResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query only the digital SMS signatures that belong to your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a digital SMS signature by its name.</p>
     * 
     * @param request QueryDigitalSignByNameRequest
     * @return QueryDigitalSignByNameResponse
     */
    public QueryDigitalSignByNameResponse queryDigitalSignByName(QueryDigitalSignByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDigitalSignByNameWithOptions(request, runtime);
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
     * <b>description</b> :
     * <ul>
     * <li>未开通卡片短信业务的阿里云账号无法调用此API。</li>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或<a href="https://help.aliyun.com/document_detail/464625.html">联系阿里云售前咨询</a>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a phone number supports card SMS messages.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>未开通卡片短信业务的阿里云账号无法调用此API。</li>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或<a href="https://help.aliyun.com/document_detail/464625.html">联系阿里云售前咨询</a>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a phone number supports card SMS messages.</p>
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
     * <p>批量查询终端5G适配情况</p>
     * 
     * @param request QueryRCSMobileCapableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRCSMobileCapableResponse
     */
    public QueryRCSMobileCapableResponse queryRCSMobileCapableWithOptions(QueryRCSMobileCapableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRCSMobileCapable"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRCSMobileCapableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询终端5G适配情况</p>
     * 
     * @param request QueryRCSMobileCapableRequest
     * @return QueryRCSMobileCapableResponse
     */
    public QueryRCSMobileCapableResponse queryRCSMobileCapable(QueryRCSMobileCapableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRCSMobileCapableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端5G适配情况任务结果</p>
     * 
     * @param request QueryRCSMobileCapableTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRCSMobileCapableTaskResultResponse
     */
    public QueryRCSMobileCapableTaskResultResponse queryRCSMobileCapableTaskResultWithOptions(QueryRCSMobileCapableTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRCSMobileCapableTaskResult"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRCSMobileCapableTaskResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询终端5G适配情况任务结果</p>
     * 
     * @param request QueryRCSMobileCapableTaskResultRequest
     * @return QueryRCSMobileCapableTaskResultResponse
     */
    public QueryRCSMobileCapableTaskResultResponse queryRCSMobileCapableTaskResult(QueryRCSMobileCapableTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRCSMobileCapableTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G模板详情</p>
     * 
     * @param request QueryRCSTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRCSTemplateResponse
     */
    public QueryRCSTemplateResponse queryRCSTemplateWithOptions(QueryRCSTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            query.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRCSTemplate"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRCSTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G模板详情</p>
     * 
     * @param request QueryRCSTemplateRequest
     * @return QueryRCSTemplateResponse
     */
    public QueryRCSTemplateResponse queryRCSTemplate(QueryRCSTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRCSTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指定版本查看5G消息固定菜单详情</p>
     * 
     * @param request QueryRcsSignMenuByVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRcsSignMenuByVersionResponse
     */
    public QueryRcsSignMenuByVersionResponse queryRcsSignMenuByVersionWithOptions(QueryRcsSignMenuByVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rcsMenuVersion)) {
            query.put("RcsMenuVersion", request.rcsMenuVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRcsSignMenuByVersion"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRcsSignMenuByVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指定版本查看5G消息固定菜单详情</p>
     * 
     * @param request QueryRcsSignMenuByVersionRequest
     * @return QueryRcsSignMenuByVersionResponse
     */
    public QueryRcsSignMenuByVersionResponse queryRcsSignMenuByVersion(QueryRcsSignMenuByVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRcsSignMenuByVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation queries the details of SMS messages sent to a specific phone number on a given date. You can also provide the <code>BizId</code> to query a specific delivery record.</li>
     * <li>This operation queries delivery details for a single phone number at a time. To view delivery details in bulk, use the <a href="https://help.aliyun.com/document_detail/419276.html">QuerySendStatistics</a> operation to query delivery statistics, or log in to the <a href="https://dysms.console.aliyun.com/record">Delivery Receipts</a> page in the console.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 5,000 requests per second per user. Calls that exceed this limit are throttled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery records and status of SMS messages sent to a single phone number.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This operation queries the details of SMS messages sent to a specific phone number on a given date. You can also provide the <code>BizId</code> to query a specific delivery record.</li>
     * <li>This operation queries delivery details for a single phone number at a time. To view delivery details in bulk, use the <a href="https://help.aliyun.com/document_detail/419276.html">QuerySendStatistics</a> operation to query delivery statistics, or log in to the <a href="https://dysms.console.aliyun.com/record">Delivery Receipts</a> page in the console.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 5,000 requests per second per user. Calls that exceed this limit are throttled.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery records and status of SMS messages sent to a single phone number.</p>
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
     * <ul>
     * <li>If you query data over a long time range, the results are paginated. You can specify the page size and page number to navigate through the Delivery Logs.</li>
     * <li>You can also view delivery details by logging in to the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service console</a> and navigating to the <strong>Business Statistics</strong> &gt; <strong>Delivery Logs</strong> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries message delivery statistics, including send dates, the number of successfully sent messages, and the number of received delivery receipts.</p>
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
     * <ul>
     * <li>If you query data over a long time range, the results are paginated. You can specify the page size and page number to navigate through the Delivery Logs.</li>
     * <li>You can also view delivery details by logging in to the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service console</a> and navigating to the <strong>Business Statistics</strong> &gt; <strong>Delivery Logs</strong> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries message delivery statistics, including send dates, the number of successfully sent messages, and the number of received delivery receipts.</p>
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
     * <blockquote>
     * <p>Notice: 
     * This API is not currently supported by Short Message Service.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 20 queries per second per user. API calls that exceed this limit are rate-limited, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the status and availability of a short link.</p>
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
     * <blockquote>
     * <p>Notice: 
     * This API is not currently supported by Short Message Service.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 20 queries per second per user. API calls that exceed this limit are rate-limited, which can impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the status and availability of a short link.</p>
     * 
     * @param request QueryShortUrlRequest
     * @return QueryShortUrlResponse
     */
    public QueryShortUrlResponse queryShortUrl(QueryShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API queries the details of a single qualification (enterprise information, legal representative information, and administrator information).</li>
     * <li>To query all qualification information under your current account, or to query review details, call the <a href="~~QuerySmsQualificationRecord~~">QuerySmsQualificationRecord</a> operation.</li>
     * <li>Affected by the SMS signature real-name registration requirements, the volume of qualification review tickets is growing rapidly, and the review time may be extended. Please be patient. The review is expected to be completed within 2 business days (review hours: Monday to Sunday 9:00-21:00, postponed for legal holidays). In special cases, the review time may be extended. Please be patient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you apply for SMS qualifications, you can call this operation to query the details of a single qualification.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This API queries the details of a single qualification (enterprise information, legal representative information, and administrator information).</li>
     * <li>To query all qualification information under your current account, or to query review details, call the <a href="~~QuerySmsQualificationRecord~~">QuerySmsQualificationRecord</a> operation.</li>
     * <li>Affected by the SMS signature real-name registration requirements, the volume of qualification review tickets is growing rapidly, and the review time may be extended. Please be patient. The review is expected to be completed within 2 business days (review hours: Monday to Sunday 9:00-21:00, postponed for legal holidays). In special cases, the review time may be extended. Please be patient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you apply for SMS qualifications, you can call this operation to query the details of a single qualification.</p>
     * 
     * @param request QuerySingleSmsQualificationRequest
     * @return QuerySingleSmsQualificationResponse
     */
    public QuerySingleSmsQualificationResponse querySingleSmsQualification(QuerySingleSmsQualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySingleSmsQualificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Pass a list of icp record IDs to retrieve their details.
     * For example, call the QuerySmsSignList or GetSmsSign API to obtain the required icp record IDs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries icp record details.</p>
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
     * <b>description</b> :
     * <p>Pass a list of icp record IDs to retrieve their details.
     * For example, call the QuerySmsSignList or GetSmsSign API to obtain the required icp record IDs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries icp record details.</p>
     * 
     * @param request QuerySmsAppIcpRecordRequest
     * @return QuerySmsAppIcpRecordResponse
     */
    public QuerySmsAppIcpRecordResponse querySmsAppIcpRecord(QuerySmsAppIcpRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsAppIcpRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Supports full query or conditional query:<ul>
     * <li><strong>Full query</strong>: Queries the information of all letters of authorization under your current account. No parameters need to be passed. Full query is performed by default.</li>
     * <li><strong>Conditional query</strong>: Supports queries by letter of authorization ID, signature name, and review status of the letter of authorization. Pass the parameters by which you want to filter.</li>
     * </ul>
     * </li>
     * <li>Review duration: Affected by the real-name registration requirements for SMS signatures, the volume of qualification review tickets is currently increasing rapidly, and the review duration may be extended. Please wait patiently. The review is expected to be completed within 2 working days. SMS signatures and templates are expected to be reviewed within 2 hours after submission. Reviews involving governments and enterprises are generally completed within 2 working days. If verification upgrades, a large number of review tasks, or non-working hours are encountered, the review duration may be extended. Please wait patiently. (Review working hours: Monday to Sunday, 9:00–21:00, postponed for statutory holidays.)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries created letters of authorization. You can view the review status and authorized signature scope of the letters.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Supports full query or conditional query:<ul>
     * <li><strong>Full query</strong>: Queries the information of all letters of authorization under your current account. No parameters need to be passed. Full query is performed by default.</li>
     * <li><strong>Conditional query</strong>: Supports queries by letter of authorization ID, signature name, and review status of the letter of authorization. Pass the parameters by which you want to filter.</li>
     * </ul>
     * </li>
     * <li>Review duration: Affected by the real-name registration requirements for SMS signatures, the volume of qualification review tickets is currently increasing rapidly, and the review duration may be extended. Please wait patiently. The review is expected to be completed within 2 working days. SMS signatures and templates are expected to be reviewed within 2 hours after submission. Reviews involving governments and enterprises are generally completed within 2 working days. If verification upgrades, a large number of review tasks, or non-working hours are encountered, the review duration may be extended. Please wait patiently. (Review working hours: Monday to Sunday, 9:00–21:00, postponed for statutory holidays.)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries created letters of authorization. You can view the review status and authorized signature scope of the letters.</p>
     * 
     * @param request QuerySmsAuthorizationLetterRequest
     * @return QuerySmsAuthorizationLetterResponse
     */
    public QuerySmsAuthorizationLetterResponse querySmsAuthorizationLetter(QuerySmsAuthorizationLetterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsAuthorizationLetterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>支持全量查询或条件查询：<ul>
     * <li><strong>全量查询</strong>：查询您当前帐户下所有短信资质，无需传参。默认全量查询。</li>
     * <li><strong>条件查询</strong>：支持根据资质名称、企业名称、法人姓名、审核状态、审核工单ID、资质用途进行查询，传入您希望筛选的参数即可。</li>
     * </ul>
     * </li>
     * <li>本接口用于查询资质及其审核信息，如果需要查询单个资质的具体信息（企业信息、法人信息、管理员信息），请调用<a href="~~QuerySingleSmsQualification~~">查询单个资质详情</a>接口。</li>
     * <li>受短信签名实名制报备要求影响，当前资质审核工单量增长快速，审核时间可能会延长，请耐心等待，预计2个工作日内完成（审核工作时间：周一至周日 9:00~21:00，法定节假日顺延）。特殊情况可能延长审核时间，请耐心等待。</li>
     * <li>如果资质未通过审核，审核备注<code>AuditRemark</code>会返回审核失败的原因，请参考<a href="~~2384377#a96cc318b94x1~~">审核失败的处理建议</a>，调用<a href="~~UpdateSmsQualification~~">修改短信资质</a>接口或在控制台<a href="https://dysms.console.aliyun.com/domestic/text/qualification">资质管理</a>页面修改资质信息后，重新发起审核。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SMS qualifications and their review details after you submit qualification applications. This operation supports filtered query.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>支持全量查询或条件查询：<ul>
     * <li><strong>全量查询</strong>：查询您当前帐户下所有短信资质，无需传参。默认全量查询。</li>
     * <li><strong>条件查询</strong>：支持根据资质名称、企业名称、法人姓名、审核状态、审核工单ID、资质用途进行查询，传入您希望筛选的参数即可。</li>
     * </ul>
     * </li>
     * <li>本接口用于查询资质及其审核信息，如果需要查询单个资质的具体信息（企业信息、法人信息、管理员信息），请调用<a href="~~QuerySingleSmsQualification~~">查询单个资质详情</a>接口。</li>
     * <li>受短信签名实名制报备要求影响，当前资质审核工单量增长快速，审核时间可能会延长，请耐心等待，预计2个工作日内完成（审核工作时间：周一至周日 9:00~21:00，法定节假日顺延）。特殊情况可能延长审核时间，请耐心等待。</li>
     * <li>如果资质未通过审核，审核备注<code>AuditRemark</code>会返回审核失败的原因，请参考<a href="~~2384377#a96cc318b94x1~~">审核失败的处理建议</a>，调用<a href="~~UpdateSmsQualification~~">修改短信资质</a>接口或在控制台<a href="https://dysms.console.aliyun.com/domestic/text/qualification">资质管理</a>页面修改资质信息后，重新发起审核。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SMS qualifications and their review details after you submit qualification applications. This operation supports filtered query.</p>
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
     * <ul>
     * <li>To comply with regulations from the Ministry of Industry and Information Technology (MIIT) and <a href="https://help.aliyun.com/document_detail/2806975.html">related requirements</a> from carriers, Alibaba Cloud has upgraded its SMS signature management APIs. We recommend using the new <a href="https://help.aliyun.com/document_detail/2807429.html">GetSmsSign - Query Signature Details</a> API, which returns more detailed information about signatures than this API.</li>
     * <li>We typically review signatures within two hours of submission. The review service is available from 9:00 to 21:00, Monday to Sunday. Reviews may be delayed during public holidays. We recommend submitting your application before 18:00 for a timely review.</li>
     * <li>If a signature is rejected, the response includes the review reason. For troubleshooting information, see <a href="https://help.aliyun.com/document_detail/65990.html">Troubleshooting Signature Review Failures</a>. You can then call the <a href="https://help.aliyun.com/document_detail/419287.html">ModifySmsTemplate</a> API or modify the SMS signature on the <a href="https://dysms.console.aliyun.com/domestic/text">Signature Management</a> page.</li>
     * <li>This API queries the review details for a single signature by name. To query all signatures in your account, call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsSignList</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of an SMS signature.</p>
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
     * <ul>
     * <li>To comply with regulations from the Ministry of Industry and Information Technology (MIIT) and <a href="https://help.aliyun.com/document_detail/2806975.html">related requirements</a> from carriers, Alibaba Cloud has upgraded its SMS signature management APIs. We recommend using the new <a href="https://help.aliyun.com/document_detail/2807429.html">GetSmsSign - Query Signature Details</a> API, which returns more detailed information about signatures than this API.</li>
     * <li>We typically review signatures within two hours of submission. The review service is available from 9:00 to 21:00, Monday to Sunday. Reviews may be delayed during public holidays. We recommend submitting your application before 18:00 for a timely review.</li>
     * <li>If a signature is rejected, the response includes the review reason. For troubleshooting information, see <a href="https://help.aliyun.com/document_detail/65990.html">Troubleshooting Signature Review Failures</a>. You can then call the <a href="https://help.aliyun.com/document_detail/419287.html">ModifySmsTemplate</a> API or modify the SMS signature on the <a href="https://dysms.console.aliyun.com/domestic/text">Signature Management</a> page.</li>
     * <li>This API queries the review details for a single signature by name. To query all signatures in your account, call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsSignList</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the review status of an SMS signature.</p>
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
     * <p>This operation queries the signature information that was <strong>first created</strong> or the <strong>most recently approved</strong> signature details under your current account. If you need to query more information such as application scenario content or files uploaded during application, you can call the <a href="~~GetSmsSign~~">GetSmsSign</a> operation to query the audit details of a single signature by signature name.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query all signatures under your account, including signature audit status, signature type, and signature name.</p>
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
     * <p>This operation queries the signature information that was <strong>first created</strong> or the <strong>most recently approved</strong> signature details under your current account. If you need to query more information such as application scenario content or files uploaded during application, you can call the <a href="~~GetSmsSign~~">GetSmsSign</a> operation to query the audit details of a single signature by signature name.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query all signatures under your account, including signature audit status, signature type, and signature name.</p>
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
     * <ul>
     * <li>Alibaba Cloud has updated its template-related APIs to comply with regulatory and <a href="https://help.aliyun.com/document_detail/2806975.html">carrier requirements</a>. We recommend that you use the new <a href="https://help.aliyun.com/document_detail/2807433.html">GetSmsTemplate - Query template review details</a> API. The new API returns more detailed template information in its response.</li>
     * <li>Review timeline: After you submit a template, Alibaba Cloud typically completes the review within two hours. Review hours are 9:00 to 21:00 (UTC+8) from Monday to Sunday. Reviews are postponed during public holidays. We recommend that you submit your templates before 18:00 (UTC+8).</li>
     * <li>If a template fails review, the response includes the reason for the rejection. For more information, see <a href="https://help.aliyun.com/document_detail/65990.html">Suggestions for handling a failed review</a>. You can then call the <a href="https://help.aliyun.com/document_detail/419287.html">ModifySmsTemplate</a> API or modify the template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * <li>QuerySmsTemplate queries the review details of a single template by its template code. To query the details of all templates in your account, call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API has been deprecated.</p>
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
     * <ul>
     * <li>Alibaba Cloud has updated its template-related APIs to comply with regulatory and <a href="https://help.aliyun.com/document_detail/2806975.html">carrier requirements</a>. We recommend that you use the new <a href="https://help.aliyun.com/document_detail/2807433.html">GetSmsTemplate - Query template review details</a> API. The new API returns more detailed template information in its response.</li>
     * <li>Review timeline: After you submit a template, Alibaba Cloud typically completes the review within two hours. Review hours are 9:00 to 21:00 (UTC+8) from Monday to Sunday. Reviews are postponed during public holidays. We recommend that you submit your templates before 18:00 (UTC+8).</li>
     * <li>If a template fails review, the response includes the reason for the rejection. For more information, see <a href="https://help.aliyun.com/document_detail/65990.html">Suggestions for handling a failed review</a>. You can then call the <a href="https://help.aliyun.com/document_detail/419287.html">ModifySmsTemplate</a> API or modify the template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * <li>QuerySmsTemplate queries the review details of a single template by its template code. To query the details of all templates in your account, call the <a href="https://help.aliyun.com/document_detail/419288.html">QuerySmsTemplateList</a> API.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This API has been deprecated.</p>
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
     * <ul>
     * <li>This operation queries the template details of all templates under your current account. To query more details such as the template variable content and the file information uploaded during application, you can call the <a href="~~GetSmsTemplate~~">GetSmsTemplate</a> operation to query the approval details of a single template by template code.</li>
     * <li>You can also log on to the Short Message Service (SMS) console and view the template details of all templates under your current account on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query all templates under your account. This way, you can view template details, including the template approval status, template type, and template content.</p>
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
     * <ul>
     * <li>This operation queries the template details of all templates under your current account. To query more details such as the template variable content and the file information uploaded during application, you can call the <a href="~~GetSmsTemplate~~">GetSmsTemplate</a> operation to query the approval details of a single template by template code.</li>
     * <li>You can also log on to the Short Message Service (SMS) console and view the template details of all templates under your current account on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query all templates under your account. This way, you can view template details, including the template approval status, template type, and template content.</p>
     * 
     * @param request QuerySmsTemplateListRequest
     * @return QuerySmsTemplateListResponse
     */
    public QuerySmsTemplateListResponse querySmsTemplateList(QuerySmsTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the details of trademarks by using a list of trademark IDs.
     * For example, you can obtain trademark IDs by calling signature query operations such as <code>QuerySmsSignList</code> or <code>GetSmsSign</code>. You can then use this operation to retrieve the details of each trademark.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more trademarks.</p>
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
     * <b>description</b> :
     * <p>This operation retrieves the details of trademarks by using a list of trademark IDs.
     * For example, you can obtain trademark IDs by calling signature query operations such as <code>QuerySmsSignList</code> or <code>GetSmsSign</code>. You can then use this operation to retrieve the details of each trademark.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more trademarks.</p>
     * 
     * @param request QuerySmsTrademarkRequest
     * @return QuerySmsTrademarkResponse
     */
    public QuerySmsTrademarkResponse querySmsTrademark(QuerySmsTrademarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmsTrademarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you receive the phone verification code, pass it to the <code>CertifyCode</code> parameter of the <a href="~~SubmitSmsQualification~~">SubmitSmsQualification</a> or <a href="~~UpdateSmsQualification~~">UpdateSmsQualification</a> operation.</li>
     * <li>You can call the <a href="~~ValidPhoneCode~~">ValidPhoneCode</a> operation to verify whether the SMS verification code is correct.</li>
     * <li>This operation is subject to <a href="~~44335#section-0wh-xn6-0t7~~">throttling</a>. Do not call it too frequently. For the same phone number, a maximum of 1 message per minute, 5 messages per hour, and 10 messages per day are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When applying for SMS qualification, the administrator\&quot;s phone number must be verified. Use this operation to obtain an SMS verification code.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>After you receive the phone verification code, pass it to the <code>CertifyCode</code> parameter of the <a href="~~SubmitSmsQualification~~">SubmitSmsQualification</a> or <a href="~~UpdateSmsQualification~~">UpdateSmsQualification</a> operation.</li>
     * <li>You can call the <a href="~~ValidPhoneCode~~">ValidPhoneCode</a> operation to verify whether the SMS verification code is correct.</li>
     * <li>This operation is subject to <a href="~~44335#section-0wh-xn6-0t7~~">throttling</a>. Do not call it too frequently. For the same phone number, a maximum of 1 message per minute, 5 messages per hour, and 10 messages per day are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When applying for SMS qualification, the administrator\&quot;s phone number must be verified. Use this operation to obtain an SMS verification code.</p>
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
     * <ul>
     * <li>Sending card SMS messages is a billable operation. You are not charged if a card SMS message fails to be sent or rendered. For more information, see <a href="https://help.aliyun.com/document_detail/437951.html">Multimedia SMS pricing</a>.</li>
     * <li>The card SMS feature is currently in the internal invitation phase. Contact your Alibaba Cloud business manager to apply for activation, or contact <a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213219fcSn2Ykj#section-81n-72q-ybm">Alibaba Cloud pre-sales consulting</a>.</li>
     * <li>We recommend that you set the timeout period for card SMS messages to a value greater than or equal to 3 seconds. If a timeout failure occurs, we recommend that you check the delivery status before deciding whether to retry. We also recommend that you do not enable SDK retry logic when calling this operation; otherwise, multiple sending attempts may occur. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">Timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">Retry mechanism</a>.</li>
     * <li>Domestic SMS, international SMS, and multimedia SMS do not currently support idempotency. Implement idempotency control to prevent duplicate operations caused by multiple retries.</li>
     * <li>Before you send a card SMS message, you must add and obtain approval for a card SMS template. When this operation is called to send an SMS message, the system checks whether the phone number supports card SMS messages. If the phone number does not support card SMS messages, you can configure whether to accept fallback to digital SMS or text SMS in the operation to improve the delivery rate.</li>
     * <li>When you send card SMS messages in batches, each phone number can use a different signature and a different fallback. In a single request, you can send card SMS messages to a maximum of 100 phone numbers.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation in a reasonable manner.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends card SMS messages in batches.</p>
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
     * <ul>
     * <li>Sending card SMS messages is a billable operation. You are not charged if a card SMS message fails to be sent or rendered. For more information, see <a href="https://help.aliyun.com/document_detail/437951.html">Multimedia SMS pricing</a>.</li>
     * <li>The card SMS feature is currently in the internal invitation phase. Contact your Alibaba Cloud business manager to apply for activation, or contact <a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213219fcSn2Ykj#section-81n-72q-ybm">Alibaba Cloud pre-sales consulting</a>.</li>
     * <li>We recommend that you set the timeout period for card SMS messages to a value greater than or equal to 3 seconds. If a timeout failure occurs, we recommend that you check the delivery status before deciding whether to retry. We also recommend that you do not enable SDK retry logic when calling this operation; otherwise, multiple sending attempts may occur. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">Timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">Retry mechanism</a>.</li>
     * <li>Domestic SMS, international SMS, and multimedia SMS do not currently support idempotency. Implement idempotency control to prevent duplicate operations caused by multiple retries.</li>
     * <li>Before you send a card SMS message, you must add and obtain approval for a card SMS template. When this operation is called to send an SMS message, the system checks whether the phone number supports card SMS messages. If the phone number does not support card SMS messages, you can configure whether to accept fallback to digital SMS or text SMS in the operation to improve the delivery rate.</li>
     * <li>When you send card SMS messages in batches, each phone number can use a different signature and a different fallback. In a single request, you can send card SMS messages to a maximum of 100 phone numbers.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation in a reasonable manner.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends card SMS messages in batches.</p>
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
     * <h3>Basic information</h3>
     * <ul>
     * <li>You can send messages to a maximum of 100 phone numbers in a single call.</li>
     * <li>The global <a href="https://help.aliyun.com/document_detail/419270.html">endpoint</a> is <code>dysmsapi.aliyuncs.com</code>. For a list of region-specific endpoints, see <a href="https://help.aliyun.com/document_detail/419270.html">Endpoints</a>.</li>
     * </ul>
     * <h3>API calls</h3>
     * <ul>
     * <li>We recommend calling this operation using an SDK. For more information, see <a href="https://help.aliyun.com/document_detail/2841024.html">Make your first API call</a>.</li>
     * <li>To send messages from the console, see <a href="https://help.aliyun.com/document_detail/108266.html">Send group messages</a>.</li>
     * <li>To build your own API requests, see <a href="https://help.aliyun.com/document_detail/2593177.html">V3 request body and signature mechanism</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For domestic SMS, we recommend setting the timeout period to 1 second or longer. If a timeout occurs, check the delivery receipt status before you retry the request. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">retry mechanism</a>.</li>
     * <li>This operation does not support idempotence for domestic SMS, international SMS, or Multimedia Messaging Service (MMS) messages. You must implement your own idempotence controls to prevent duplicate operations caused by multiple retries.</li>
     * <li>This is a billable operation. For domestic SMS, you are charged based on the delivery receipt status from the carrier. You are not charged for messages that are successfully submitted but fail carrier delivery. For more information, see <a href="https://help.aliyun.com/document_detail/44340.html">Billing overview</a>.<blockquote>
     * <p>Warning: 
     * Batch message delivery may be delayed due to system capacity limits. For time-sensitive messages, such as verification codes or alert notifications, use the SendSms operation to send messages individually.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The Queries Per Second (QPS) limit for a single user is 5,000. Calls that exceed this limit are throttled. Plan your usage accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation sends messages to different phone numbers using a single template, with different signatures and template variables for each recipient.</p>
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
     * <h3>Basic information</h3>
     * <ul>
     * <li>You can send messages to a maximum of 100 phone numbers in a single call.</li>
     * <li>The global <a href="https://help.aliyun.com/document_detail/419270.html">endpoint</a> is <code>dysmsapi.aliyuncs.com</code>. For a list of region-specific endpoints, see <a href="https://help.aliyun.com/document_detail/419270.html">Endpoints</a>.</li>
     * </ul>
     * <h3>API calls</h3>
     * <ul>
     * <li>We recommend calling this operation using an SDK. For more information, see <a href="https://help.aliyun.com/document_detail/2841024.html">Make your first API call</a>.</li>
     * <li>To send messages from the console, see <a href="https://help.aliyun.com/document_detail/108266.html">Send group messages</a>.</li>
     * <li>To build your own API requests, see <a href="https://help.aliyun.com/document_detail/2593177.html">V3 request body and signature mechanism</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For domestic SMS, we recommend setting the timeout period to 1 second or longer. If a timeout occurs, check the delivery receipt status before you retry the request. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">retry mechanism</a>.</li>
     * <li>This operation does not support idempotence for domestic SMS, international SMS, or Multimedia Messaging Service (MMS) messages. You must implement your own idempotence controls to prevent duplicate operations caused by multiple retries.</li>
     * <li>This is a billable operation. For domestic SMS, you are charged based on the delivery receipt status from the carrier. You are not charged for messages that are successfully submitted but fail carrier delivery. For more information, see <a href="https://help.aliyun.com/document_detail/44340.html">Billing overview</a>.<blockquote>
     * <p>Warning: 
     * Batch message delivery may be delayed due to system capacity limits. For time-sensitive messages, such as verification codes or alert notifications, use the SendSms operation to send messages individually.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The Queries Per Second (QPS) limit for a single user is 5,000. Calls that exceed this limit are throttled. Plan your usage accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation sends messages to different phone numbers using a single template, with different signatures and template variables for each recipient.</p>
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
     * <ul>
     * <li>发送卡片短信为计费接口，卡片短信发送失败或渲染失败时不计费，详情请参见<a href="https://help.aliyun.com/document_detail/437951.html">多媒体短信定价</a>。</li>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213219fcSn2Ykj#section-81n-72q-ybm">阿里云售前咨询</a>。</li>
     * <li>卡片短信超时时间建议设置为≥3S；发生超时失败的情况时，建议查看回执状态后再判断是否重试。同时建议您在调用此接口时，不要开启SDK重试逻辑，否则可能会造成多次发送的情况。超时和重试的相关设置，请参见<a href="https://help.aliyun.com/document_detail/262079.html">超时机制</a>、<a href="https://help.aliyun.com/document_detail/262080.html">重试机制</a>。</li>
     * <li>国内短信、国际短信及多媒体短信目前均不支持幂等的能力，请您做好幂等控制，防止因多次重试而导致的重复操作问题。</li>
     * <li>发送卡片短信前需添加卡片短信模板且模板审核通过。本接口在发送短信时，会校验号码是否支持卡片短信。如果该手机号不支持发送卡片短信，可在接口中设置是否接受数字短信和文本短信的回落，提升发送的触达率。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
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
     * <ul>
     * <li>发送卡片短信为计费接口，卡片短信发送失败或渲染失败时不计费，详情请参见<a href="https://help.aliyun.com/document_detail/437951.html">多媒体短信定价</a>。</li>
     * <li>目前卡片短信在内部邀约阶段，请联系您的阿里云商务经理申请开通或联系<a href="https://help.aliyun.com/document_detail/464625.html?spm=a2c4g.11186623.0.0.213219fcSn2Ykj#section-81n-72q-ybm">阿里云售前咨询</a>。</li>
     * <li>卡片短信超时时间建议设置为≥3S；发生超时失败的情况时，建议查看回执状态后再判断是否重试。同时建议您在调用此接口时，不要开启SDK重试逻辑，否则可能会造成多次发送的情况。超时和重试的相关设置，请参见<a href="https://help.aliyun.com/document_detail/262079.html">超时机制</a>、<a href="https://help.aliyun.com/document_detail/262080.html">重试机制</a>。</li>
     * <li>国内短信、国际短信及多媒体短信目前均不支持幂等的能力，请您做好幂等控制，防止因多次重试而导致的重复操作问题。</li>
     * <li>发送卡片短信前需添加卡片短信模板且模板审核通过。本接口在发送短信时，会校验号码是否支持卡片短信。如果该手机号不支持发送卡片短信，可在接口中设置是否接受数字短信和文本短信的回落，提升发送的触达率。</li>
     * </ul>
     * <h3>QPS限制</h3>
     * <p>本接口的单用户QPS限制为1000次/秒。超过限制，API调用会被限流，这可能会影响您的业务，请合理调用。</p>
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
     * <b>summary</b> : 
     * <p>5G消息首次下行</p>
     * 
     * @param request SendRCSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRCSResponse
     */
    public SendRCSResponse sendRCSWithOptions(SendRCSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
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
            new TeaPair("action", "SendRCS"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendRCSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>5G消息首次下行</p>
     * 
     * @param request SendRCSRequest
     * @return SendRCSResponse
     */
    public SendRCSResponse sendRCS(SendRCSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRCSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>5G消息交互下行</p>
     * 
     * @param request SendRCSReplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRCSReplyResponse
     */
    public SendRCSReplyResponse sendRCSReplyWithOptions(SendRCSReplyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inReplyToRcsID)) {
            query.put("InReplyToRcsID", request.inReplyToRcsID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outId)) {
            query.put("OutId", request.outId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumbers)) {
            query.put("PhoneNumbers", request.phoneNumbers);
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
            new TeaPair("action", "SendRCSReply"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendRCSReplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>5G消息交互下行</p>
     * 
     * @param request SendRCSReplyRequest
     * @return SendRCSReplyResponse
     */
    public SendRCSReplyResponse sendRCSReply(SendRCSReplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRCSReplyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this API to send an SMS message to a single mobile number. This API also supports sending messages with the same signature and template variables to multiple mobile numbers, up to 1,000 per request. Note that bulk sending may experience some latency. If you need to send messages with different signatures or template variables to multiple recipients, use the <a href="https://help.aliyun.com/document_detail/419274.html">SendBatchSms</a> API, which supports up to 100 mobile numbers per request.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For SMS messages sent to the Chinese mainland, we recommend setting the timeout period to 1 second or longer. If a timeout occurs, check the delivery receipt status before retrying the request. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">Timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">Retry mechanism</a>.</li>
     * <li>This API does not support idempotence for domestic, international, or multimedia SMS messages. You must implement your own idempotence controls to prevent sending duplicate messages during retries.</li>
     * <li>This is a billable API. For messages sent to the Chinese mainland, billing is based on the delivery receipt status from the carrier. You are not charged if the API call is successful but the carrier fails to deliver the message. For more information, see <a href="https://help.aliyun.com/document_detail/44340.html">Billing</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This API has a queries per second (QPS) limit of 5,000 for each user. The system throttles calls that exceed this limit. To avoid throttling, use this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends an SMS message to one or more specified mobile numbers.</p>
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
     * <p>Use this API to send an SMS message to a single mobile number. This API also supports sending messages with the same signature and template variables to multiple mobile numbers, up to 1,000 per request. Note that bulk sending may experience some latency. If you need to send messages with different signatures or template variables to multiple recipients, use the <a href="https://help.aliyun.com/document_detail/419274.html">SendBatchSms</a> API, which supports up to 100 mobile numbers per request.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>For SMS messages sent to the Chinese mainland, we recommend setting the timeout period to 1 second or longer. If a timeout occurs, check the delivery receipt status before retrying the request. For more information about timeout and retry settings, see <a href="https://help.aliyun.com/document_detail/262079.html">Timeout mechanism</a> and <a href="https://help.aliyun.com/document_detail/262080.html">Retry mechanism</a>.</li>
     * <li>This API does not support idempotence for domestic, international, or multimedia SMS messages. You must implement your own idempotence controls to prevent sending duplicate messages during retries.</li>
     * <li>This is a billable API. For messages sent to the Chinese mainland, billing is based on the delivery receipt status from the carrier. You are not charged if the API call is successful but the carrier fails to deliver the message. For more information, see <a href="https://help.aliyun.com/document_detail/44340.html">Billing</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>This API has a queries per second (QPS) limit of 5,000 for each user. The system throttles calls that exceed this limit. To avoid throttling, use this API within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends an SMS message to one or more specified mobile numbers.</p>
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
     * <p>Metric definitions:</p>
     * <ul>
     * <li>OTP send volume: the number of verification codes sent.</li>
     * <li>OTP conversion volume: the number of verification codes converted (the number of times a user successfully obtained a verification code and reported it back).
     * Conversion rate = OTP conversion volume / OTP send volume.<blockquote>
     * <p>The conversion rate feedback feature has a certain level of intrusiveness on the business system. To prevent jitter in conversion rate API calls from affecting business logic, please consider the following:  - Call the API in asynchronous mode (for example, using a queue or event-driven approach).  - Add a degradable solution to protect business logic (for example, manual degradation, or automatic degradation using a circuit breaker).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Feeds back the SMS delivery status corresponding to each message ID (MessageId) to the Alibaba Cloud International SMS platform.</p>
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
     * <p>Metric definitions:</p>
     * <ul>
     * <li>OTP send volume: the number of verification codes sent.</li>
     * <li>OTP conversion volume: the number of verification codes converted (the number of times a user successfully obtained a verification code and reported it back).
     * Conversion rate = OTP conversion volume / OTP send volume.<blockquote>
     * <p>The conversion rate feedback feature has a certain level of intrusiveness on the business system. To prevent jitter in conversion rate API calls from affecting business logic, please consider the following:  - Call the API in asynchronous mode (for example, using a queue or event-driven approach).  - Add a degradable solution to protect business logic (for example, manual degradation, or automatic degradation using a circuit breaker).</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Feeds back the SMS delivery status corresponding to each message ID (MessageId) to the Alibaba Cloud International SMS platform.</p>
     * 
     * @param request SmsConversionIntlRequest
     * @return SmsConversionIntlResponse
     */
    public SmsConversionIntlResponse smsConversionIntl(SmsConversionIntlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smsConversionIntlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before submitting an application, read <a href="https://help.aliyun.com/document_detail/2384377.html">Qualification material description</a> and prepare the required qualification materials.</li>
     * <li>Currently, only users who have completed <strong>verify your identity - Enterprise account</strong> can use the API to apply for SMS qualifications. If your Alibaba Cloud account has completed verify your identity - Individual account, apply for qualifications through the Short Message Service <a href="https://dysms.console.aliyun.com/domestic/text/qualification/add">console</a>, or <a href="https://help.aliyun.com/document_detail/37178.html">upgrade to verify your identity - Enterprise account</a>. <a href="https://myaccount.console.aliyun.com/cert-info">View my account verification type</a></li>
     * <li>Batch qualification applications are not supported. Wait at least 5 seconds between applications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an SMS qualification application. As required by the Ministry of Industry and Information Technology (MIIT) and carriers for real-name SMS sending, domestic SMS services require qualification credential information of the signature owner. Apply for an SMS qualification first, and then apply for signatures and templates.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Before submitting an application, read <a href="https://help.aliyun.com/document_detail/2384377.html">Qualification material description</a> and prepare the required qualification materials.</li>
     * <li>Currently, only users who have completed <strong>verify your identity - Enterprise account</strong> can use the API to apply for SMS qualifications. If your Alibaba Cloud account has completed verify your identity - Individual account, apply for qualifications through the Short Message Service <a href="https://dysms.console.aliyun.com/domestic/text/qualification/add">console</a>, or <a href="https://help.aliyun.com/document_detail/37178.html">upgrade to verify your identity - Enterprise account</a>. <a href="https://myaccount.console.aliyun.com/cert-info">View my account verification type</a></li>
     * <li>Batch qualification applications are not supported. Wait at least 5 seconds between applications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits an SMS qualification application. As required by the Ministry of Industry and Information Technology (MIIT) and carriers for real-name SMS sending, domestic SMS services require qualification credential information of the signature owner. Apply for an SMS qualification first, and then apply for signatures and templates.</p>
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
     * <ul>
     * <li>Each template can be bound to up to 20 tags.</li>
     * <li>The tag key (Key) must be unique within the same template. If a template has two tags with the same Key but different Values, the new value overwrites the old value.</li>
     * <li>This feature is only available for domestic text messages of Short Message Service on the China site.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this operation is 50 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags can mark resources, allowing enterprises or individuals to classify templates of the same type for easier search and resource aggregation. Call this operation to bind tags to SMS templates.</p>
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
     * <ul>
     * <li>Each template can be bound to up to 20 tags.</li>
     * <li>The tag key (Key) must be unique within the same template. If a template has two tags with the same Key but different Values, the new value overwrites the old value.</li>
     * <li>This feature is only available for domestic text messages of Short Message Service on the China site.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit of this operation is 50 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags can mark resources, allowing enterprises or individuals to classify templates of the same type for easier search and resource aggregation. Call this operation to bind tags to SMS templates.</p>
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
     * <p>The QPS limit per user for this operation is 50 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the operation reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags can mark resources, allowing enterprises or individuals to categorize templates of the same type for easier search and resource aggregation. If a template is no longer applicable to its currently bound tags, you can unbind the tags from the template. You can delete a single tag or delete tags in batches.</p>
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
     * <p>The QPS limit per user for this operation is 50 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call the operation reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>Tags can mark resources, allowing enterprises or individuals to categorize templates of the same type for easier search and resource aggregation. If a template is no longer applicable to its currently bound tags, you can unbind the tags from the template. You can delete a single tag or delete tags in batches.</p>
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
     * <p>编辑5g签名</p>
     * 
     * @param request UpdateRCSSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRCSSignatureResponse
     */
    public UpdateRCSSignatureResponse updateRCSSignatureWithOptions(UpdateRCSSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundImage)) {
            query.put("BackgroundImage", request.backgroundImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bubbleColor)) {
            query.put("BubbleColor", request.bubbleColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logo)) {
            query.put("Logo", request.logo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeAddress)) {
            query.put("OfficeAddress", request.officeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEmail)) {
            query.put("ServiceEmail", request.serviceEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePhone)) {
            query.put("ServicePhone", request.servicePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTerms)) {
            query.put("ServiceTerms", request.serviceTerms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceWebsite)) {
            query.put("ServiceWebsite", request.serviceWebsite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRCSSignature"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRCSSignatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑5g签名</p>
     * 
     * @param request UpdateRCSSignatureRequest
     * @return UpdateRCSSignatureResponse
     */
    public UpdateRCSSignatureResponse updateRCSSignature(UpdateRCSSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRCSSignatureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Qualifications under review do not support modification. Please wait for the review process to finish, or <a href="https://dysms.console.aliyun.com/domestic/text/qualification">withdraw the application</a> in the SMS Service console before making modifications.</li>
     * <li>The modified SMS qualification <strong>must be re-reviewed</strong> (including qualifications that have already passed review). Please upload materials that meet the specifications according to the <a href="https://help.aliyun.com/document_detail/2384377.html">Qualification Material Description</a>.</li>
     * <li><strong>Modification is not supported</strong> for the qualification name, application purpose, or unified social credit code.</li>
     * <li>Batch modification of SMS qualifications is not supported. It is recommended to leave at least 5 seconds between modifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you need to update SMS qualification information, you can submit a modification request through this API. After submission, it will re-enter the review process.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Qualifications under review do not support modification. Please wait for the review process to finish, or <a href="https://dysms.console.aliyun.com/domestic/text/qualification">withdraw the application</a> in the SMS Service console before making modifications.</li>
     * <li>The modified SMS qualification <strong>must be re-reviewed</strong> (including qualifications that have already passed review). Please upload materials that meet the specifications according to the <a href="https://help.aliyun.com/document_detail/2384377.html">Qualification Material Description</a>.</li>
     * <li><strong>Modification is not supported</strong> for the qualification name, application purpose, or unified social credit code.</li>
     * <li>Batch modification of SMS qualifications is not supported. It is recommended to leave at least 5 seconds between modifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you need to update SMS qualification information, you can submit a modification request through this API. After submission, it will re-enter the review process.</p>
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
     * <li>For details about the updates to the signature and template APIs, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Updating Signature &amp; Template APIs for Short Message Service</a>.</li>
     * <li>You can modify signatures that are either <strong>rejected</strong> or <strong>approved</strong>. For guidance on handling review failures, see <a href="https://help.aliyun.com/document_detail/65990.html">Handling signature review failures</a>. Call this API to modify and resubmit the signature for review.</li>
     * <li>You cannot use this API to edit the name of a <strong>rejected</strong> signature. To edit the name, go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service console</a>.</li>
     * <li>Signatures you request using this API are synchronized with the Short Message Service console. For information on managing signatures in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">Signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can modify rejected or approved signatures. A modified signature is automatically submitted for review, and its status changes to pending review.</p>
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
     * <li>For details about the updates to the signature and template APIs, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Updating Signature &amp; Template APIs for Short Message Service</a>.</li>
     * <li>You can modify signatures that are either <strong>rejected</strong> or <strong>approved</strong>. For guidance on handling review failures, see <a href="https://help.aliyun.com/document_detail/65990.html">Handling signature review failures</a>. Call this API to modify and resubmit the signature for review.</li>
     * <li>You cannot use this API to edit the name of a <strong>rejected</strong> signature. To edit the name, go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Short Message Service console</a>.</li>
     * <li>Signatures you request using this API are synchronized with the Short Message Service console. For information on managing signatures in the console, see <a href="https://help.aliyun.com/document_detail/108073.html">Signatures</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can modify rejected or approved signatures. A modified signature is automatically submitted for review, and its status changes to pending review.</p>
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
     * <li>For details about the changes to the signature and template APIs, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Updating Signature &amp; Template APIs for Short Message Service</a>.</li>
     * <li>You can only modify templates that have failed review. For troubleshooting, see <a href="https://help.aliyun.com/document_detail/65990.html">Suggestions for handling failed SMS template reviews</a>. After modifying a template with this API, you must resubmit it for review.</li>
     * <li>Template changes made using this API are synchronized with the Short Message Service console. To learn more about managing templates in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">SMS templates</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 1,000 queries per second per user. If you exceed this limit, your API calls will be throttled. This can affect your business, so please use the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>This API modifies a template that failed review and automatically resubmits it.</p>
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
     * <li>For details about the changes to the signature and template APIs, see <a href="https://help.aliyun.com/document_detail/2806975.html">Announcement on Updating Signature &amp; Template APIs for Short Message Service</a>.</li>
     * <li>You can only modify templates that have failed review. For troubleshooting, see <a href="https://help.aliyun.com/document_detail/65990.html">Suggestions for handling failed SMS template reviews</a>. After modifying a template with this API, you must resubmit it for review.</li>
     * <li>Template changes made using this API are synchronized with the Short Message Service console. To learn more about managing templates in the console, see <a href="https://help.aliyun.com/document_detail/108085.html">SMS templates</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 1,000 queries per second per user. If you exceed this limit, your API calls will be throttled. This can affect your business, so please use the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>This API modifies a template that failed review and automatically resubmits it.</p>
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
     * <p>升级文本短信为5g签名</p>
     * 
     * @param request UpgradeToRCSSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeToRCSSignatureResponse
     */
    public UpgradeToRCSSignatureResponse upgradeToRCSSignatureWithOptions(UpgradeToRCSSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundImage)) {
            query.put("BackgroundImage", request.backgroundImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bubbleColor)) {
            query.put("BubbleColor", request.bubbleColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logo)) {
            query.put("Logo", request.logo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeAddress)) {
            query.put("OfficeAddress", request.officeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEmail)) {
            query.put("ServiceEmail", request.serviceEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePhone)) {
            query.put("ServicePhone", request.servicePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTerms)) {
            query.put("ServiceTerms", request.serviceTerms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceWebsite)) {
            query.put("ServiceWebsite", request.serviceWebsite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signName)) {
            query.put("SignName", request.signName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeToRCSSignature"),
            new TeaPair("version", "2017-05-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeToRCSSignatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级文本短信为5g签名</p>
     * 
     * @param request UpgradeToRCSSignatureRequest
     * @return UpgradeToRCSSignatureResponse
     */
    public UpgradeToRCSSignatureResponse upgradeToRCSSignature(UpgradeToRCSSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeToRCSSignatureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call the <a href="~~RequiredPhoneCode~~">RequiredPhoneCode</a> operation first. Alibaba Cloud sends an SMS verification code to the phone number that you provided.</li>
     * <li>This operation does not affect the SMS qualification application process and is used only to verify the SMS verification code. When you submit the actual application, pass the verification code into the <code>CertifyCode</code> parameter of the <a href="~~SubmitSmsQualification~~">SubmitSmsQualification</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When applying for SMS qualification, the administrator\&quot;s phone number must be verified. This operation verifies the phone number and the received verification code.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Call the <a href="~~RequiredPhoneCode~~">RequiredPhoneCode</a> operation first. Alibaba Cloud sends an SMS verification code to the phone number that you provided.</li>
     * <li>This operation does not affect the SMS qualification application process and is used only to verify the SMS verification code. When you submit the actual application, pass the verification code into the <code>CertifyCode</code> parameter of the <a href="~~SubmitSmsQualification~~">SubmitSmsQualification</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When applying for SMS qualification, the administrator\&quot;s phone number must be verified. This operation verifies the phone number and the received verification code.</p>
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
