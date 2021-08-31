// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728;

import com.aliyun.tea.*;
import com.aliyun.mts20210728.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "mts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "mts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "mts.aliyuncs.com"),
            new TeaPair("cn-fujian", "mts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "mts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "mts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "mts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "mts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "mts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "mts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "mts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "mts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "mts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "mts.aliyuncs.com"),
            new TeaPair("me-east-1", "mts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "mts.aliyuncs.com"),
            new TeaPair("us-east-1", "mts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public QueryTraceMuResponse queryTraceMu(QueryTraceMuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceMuWithOptions(request, headers, runtime);
    }

    public QueryTraceMuResponse queryTraceMuWithOptions(QueryTraceMuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("QueryTraceMu", "2021-07-28", "HTTPS", "POST", "AK", "/queryTraceM3u8", "json", req, runtime), new QueryTraceMuResponse());
    }

    public SubmitImageCopyrightResponse submitImageCopyright(SubmitImageCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitImageCopyrightWithOptions(request, headers, runtime);
    }

    public SubmitImageCopyrightResponse submitImageCopyrightWithOptions(SubmitImageCopyrightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SubmitImageCopyright", "2021-07-28", "HTTPS", "POST", "AK", "/submitImageCopyright", "json", req, runtime), new SubmitImageCopyrightResponse());
    }

    public QueryImageCopyrightResponse queryImageCopyright(QueryImageCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageCopyrightWithOptions(request, headers, runtime);
    }

    public QueryImageCopyrightResponse queryImageCopyrightWithOptions(QueryImageCopyrightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("QueryImageCopyright", "2021-07-28", "HTTPS", "POST", "AK", "/queryImageCopyright", "json", req, runtime), new QueryImageCopyrightResponse());
    }

    public QueryCopyrightResponse queryCopyright(QueryCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCopyrightWithOptions(request, headers, runtime);
    }

    public QueryCopyrightResponse queryCopyrightWithOptions(QueryCopyrightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("QueryCopyright", "2021-07-28", "HTTPS", "POST", "AK", "/queryCopyrightJob", "json", req, runtime), new QueryCopyrightResponse());
    }

    public SubmitTracemuResponse submitTracemu(SubmitTracemuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitTracemuWithOptions(request, headers, runtime);
    }

    public SubmitTracemuResponse submitTracemuWithOptions(SubmitTracemuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            body.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trace)) {
            body.put("Trace", request.trace);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SubmitTracemu", "2021-07-28", "HTTPS", "POST", "AK", "/submitTraceM3u8", "json", req, runtime), new SubmitTracemuResponse());
    }

    public QueryTraceAbResponse queryTraceAb(QueryTraceAbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTraceAbWithOptions(request, headers, runtime);
    }

    public QueryTraceAbResponse queryTraceAbWithOptions(QueryTraceAbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            body.put("MediaId", request.mediaId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("QueryTraceAb", "2021-07-28", "HTTPS", "POST", "AK", "/queryTraceAb", "json", req, runtime), new QueryTraceAbResponse());
    }

    public SubmitTraceAbResponse submitTraceAb(SubmitTraceAbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitTraceAbWithOptions(request, headers, runtime);
    }

    public SubmitTraceAbResponse submitTraceAbWithOptions(SubmitTraceAbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            body.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SubmitTraceAb", "2021-07-28", "HTTPS", "POST", "AK", "/submitTraceAb", "json", req, runtime), new SubmitTraceAbResponse());
    }

    public SubmitCopyrightJobResponse submitCopyrightJob(SubmitCopyrightJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitCopyrightJobWithOptions(request, headers, runtime);
    }

    public SubmitCopyrightJobResponse submitCopyrightJobWithOptions(SubmitCopyrightJobRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            body.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            body.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            body.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTime)) {
            body.put("TotalTime", request.totalTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("SubmitCopyrightJob", "2021-07-28", "HTTPS", "POST", "AK", "/submitCopyrightJob", "json", req, runtime), new SubmitCopyrightJobResponse());
    }
}
