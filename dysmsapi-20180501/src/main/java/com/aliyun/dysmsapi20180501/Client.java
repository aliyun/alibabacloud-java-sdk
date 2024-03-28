// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501;

import com.aliyun.tea.*;
import com.aliyun.dysmsapi20180501.models.*;

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
      * *   You cannot call the BatchSendMessageToGlobe operation to send messages to the Chinese mainland.
      * *   You can call the BatchSendMessageToGlobe operation to send notifications and promotional messages to a limited number of mobile phone numbers at a time. To send messages to a large number of mobile phone numbers at a time, use the mass messaging feature of the SMS console.
      * *   For time-sensitive related messages, we recommend that you use the [SendMessageToGlobe](https://www.alibabacloud.com/help/zh/sms/developer-reference/api-dysmsapi-2018-05-01-batchsendmessagetoglobe) operation to ensure that messages are delivered on time.
      * *   In each request, you can send messages to up to 1,000 mobile phone numbers.
      * ### [](#qps)QPS limits
      * You can call this operation only once per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
      * @param request BatchSendMessageToGlobeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return BatchSendMessageToGlobeResponse
     */
    public BatchSendMessageToGlobeResponse batchSendMessageToGlobeWithOptions(BatchSendMessageToGlobeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSendMessageToGlobe"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSendMessageToGlobeResponse());
    }

    /**
      * *   You cannot call the BatchSendMessageToGlobe operation to send messages to the Chinese mainland.
      * *   You can call the BatchSendMessageToGlobe operation to send notifications and promotional messages to a limited number of mobile phone numbers at a time. To send messages to a large number of mobile phone numbers at a time, use the mass messaging feature of the SMS console.
      * *   For time-sensitive related messages, we recommend that you use the [SendMessageToGlobe](https://www.alibabacloud.com/help/zh/sms/developer-reference/api-dysmsapi-2018-05-01-batchsendmessagetoglobe) operation to ensure that messages are delivered on time.
      * *   In each request, you can send messages to up to 1,000 mobile phone numbers.
      * ### [](#qps)QPS limits
      * You can call this operation only once per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
      * @param request BatchSendMessageToGlobeRequest
      * @return BatchSendMessageToGlobeResponse
     */
    public BatchSendMessageToGlobeResponse batchSendMessageToGlobe(BatchSendMessageToGlobeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSendMessageToGlobeWithOptions(request, runtime);
    }

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      *
      * @param request ConversionDataRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ConversionDataResponse
     */
    public ConversionDataResponse conversionDataWithOptions(ConversionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversionRate)) {
            body.put("ConversionRate", request.conversionRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTime)) {
            body.put("ReportTime", request.reportTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConversionData"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConversionDataResponse());
    }

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      *
      * @param request ConversionDataRequest
      * @return ConversionDataResponse
     */
    public ConversionDataResponse conversionData(ConversionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.conversionDataWithOptions(request, runtime);
    }

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
      * @param request QueryMessageRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return QueryMessageResponse
     */
    public QueryMessageResponse queryMessageWithOptions(QueryMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessage"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessageResponse());
    }

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
      * @param request QueryMessageRequest
      * @return QueryMessageResponse
     */
    public QueryMessageResponse queryMessage(QueryMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMessageWithOptions(request, runtime);
    }

    /**
      * ### Usage notes
      * You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.
      * ### QPS limit
      * You may call this operation up to 300 times per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
      * @param request SendMessageToGlobeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SendMessageToGlobeResponse
     */
    public SendMessageToGlobeResponse sendMessageToGlobeWithOptions(SendMessageToGlobeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessageToGlobe"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageToGlobeResponse());
    }

    /**
      * ### Usage notes
      * You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.
      * ### QPS limit
      * You may call this operation up to 300 times per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
      * @param request SendMessageToGlobeRequest
      * @return SendMessageToGlobeResponse
     */
    public SendMessageToGlobeResponse sendMessageToGlobe(SendMessageToGlobeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageToGlobeWithOptions(request, runtime);
    }

    /**
      * ### Usage notes
      * You can call the SendMessageWithTemplate operation to send messages only to the Chinese mainland.
      *
      * @param request SendMessageWithTemplateRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SendMessageWithTemplateResponse
     */
    public SendMessageWithTemplateResponse sendMessageWithTemplateWithOptions(SendMessageWithTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
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

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessageWithTemplate"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageWithTemplateResponse());
    }

    /**
      * ### Usage notes
      * You can call the SendMessageWithTemplate operation to send messages only to the Chinese mainland.
      *
      * @param request SendMessageWithTemplateRequest
      * @return SendMessageWithTemplateResponse
     */
    public SendMessageWithTemplateResponse sendMessageWithTemplate(SendMessageWithTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageWithTemplateWithOptions(request, runtime);
    }

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      * > If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations:
      * > * Call the SmsConversion operation in an asynchronous manner by configuring queues or events.
      * > * Manually degrade your services or use a circuit breaker to automatically degrade services.
      *
      * @param request SmsConversionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SmsConversionResponse
     */
    public SmsConversionResponse smsConversionWithOptions(SmsConversionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmsConversion"),
            new TeaPair("version", "2018-05-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmsConversionResponse());
    }

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      * > If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations:
      * > * Call the SmsConversion operation in an asynchronous manner by configuring queues or events.
      * > * Manually degrade your services or use a circuit breaker to automatically degrade services.
      *
      * @param request SmsConversionRequest
      * @return SmsConversionResponse
     */
    public SmsConversionResponse smsConversion(SmsConversionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smsConversionWithOptions(request, runtime);
    }
}
