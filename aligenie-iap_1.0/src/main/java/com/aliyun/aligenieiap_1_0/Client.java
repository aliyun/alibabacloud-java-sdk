// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0;

import com.aliyun.tea.*;
import com.aliyun.aligenieiap_1_0.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aligenie", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public NotificationResponse notification(NotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        NotificationHeaders headers = new NotificationHeaders();
        return this.notificationWithOptions(request, headers, runtime);
    }

    public NotificationResponse notificationWithOptions(NotificationRequest tmpReq, NotificationHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        NotificationShrinkRequest request = new NotificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.notificationUnicastRequest))) {
            request.notificationUnicastRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.notificationUnicastRequest), "NotificationUnicastRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.tenantInfo))) {
            request.tenantInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.tenantInfo), "TenantInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationUnicastRequestShrink)) {
            body.put("NotificationUnicastRequest", request.notificationUnicastRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantInfoShrink)) {
            body.put("TenantInfo", request.tenantInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", headers.xAcsAligenieAccessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", headers.authorization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("Notification", "iap_1.0", "HTTPS", "PUT", "AK", "/notification", "none", req, runtime), new NotificationResponse());
    }

    public PushNotificationsResponse pushNotifications(PushNotificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        PushNotificationsHeaders headers = new PushNotificationsHeaders();
        return this.pushNotificationsWithOptions(request, headers, runtime);
    }

    public PushNotificationsResponse pushNotificationsWithOptions(PushNotificationsRequest tmpReq, PushNotificationsHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushNotificationsShrinkRequest request = new PushNotificationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.notificationUnicastRequest))) {
            request.notificationUnicastRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.notificationUnicastRequest), "NotificationUnicastRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.tenantInfo))) {
            request.tenantInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.tenantInfo), "TenantInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationUnicastRequestShrink)) {
            body.put("NotificationUnicastRequest", request.notificationUnicastRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantInfoShrink)) {
            body.put("TenantInfo", request.tenantInfoShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", headers.xAcsAligenieAccessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", headers.authorization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("PushNotifications", "iap_1.0", "HTTPS", "PUT", "AK", "/notifications", "json", req, runtime), new PushNotificationsResponse());
    }

    public WakeUpAppResponse wakeUpApp(WakeUpAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        WakeUpAppHeaders headers = new WakeUpAppHeaders();
        return this.wakeUpAppWithOptions(request, headers, runtime);
    }

    public WakeUpAppResponse wakeUpAppWithOptions(WakeUpAppRequest request, WakeUpAppHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.genieAppId)) {
            body.put("GenieAppId", request.genieAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.targetInfo))) {
            body.put("TargetInfo", request.targetInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDebug)) {
            body.put("IsDebug", request.isDebug);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", headers.xAcsAligenieAccessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", headers.authorization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("WakeUpApp", "iap_1.0", "HTTPS", "PUT", "AK", "/wakeup", "json", req, runtime), new WakeUpAppResponse());
    }
}
