// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713;

import com.aliyun.tea.*;
import com.aliyun.ft20180713.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "ft.aliyuncs.com"),
            new TeaPair("ap-south-1", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ft.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ft.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ft.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ft.aliyuncs.com"),
            new TeaPair("cn-fujian", "ft.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ft.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ft.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ft.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ft.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ft.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ft.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ft.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ft.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ft.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "ft.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ft.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ft.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ft.aliyuncs.com"),
            new TeaPair("eu-central-1", "ft.aliyuncs.com"),
            new TeaPair("eu-west-1", "ft.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ft.aliyuncs.com"),
            new TeaPair("me-east-1", "ft.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ft.aliyuncs.com"),
            new TeaPair("us-west-1", "ft.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ft", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BatchAuditTest01Response batchAuditTest01WithOptions(BatchAuditTest01Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchAuditTest01)) {
            query.put("BatchAuditTest01", request.batchAuditTest01);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demo01)) {
            query.put("Demo01", request.demo01);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.test010101)) {
            body.put("Test010101", request.test010101);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAuditTest01"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAuditTest01Response());
    }

    public BatchAuditTest01Response batchAuditTest01(BatchAuditTest01Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAuditTest01WithOptions(request, runtime);
    }

    public FTApiAliasApiResponse fTApiAliasApiWithOptions(FTApiAliasApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FTApiAliasApi"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FTApiAliasApiResponse());
    }

    public FTApiAliasApiResponse fTApiAliasApi(FTApiAliasApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fTApiAliasApiWithOptions(request, runtime);
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubboWithOptions(FtDynamicAddressDubboRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.intValue)) {
            query.put("IntValue", request.intValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stringValue)) {
            query.put("StringValue", request.stringValue);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtDynamicAddressDubbo"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtDynamicAddressDubboResponse());
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubbo(FtDynamicAddressDubboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressDubboWithOptions(request, runtime);
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsfWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtDynamicAddressHsf"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtDynamicAddressHsfResponse());
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsf() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressHsfWithOptions(runtime);
    }

    public FtDynamicAddressHttpVpcResponse ftDynamicAddressHttpVpcWithOptions(FtDynamicAddressHttpVpcRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FtDynamicAddressHttpVpcShrinkRequest request = new FtDynamicAddressHttpVpcShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultValue)) {
            request.defaultValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultValue, "DefaultValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherParam)) {
            request.otherParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherParam, "OtherParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stringValue)) {
            request.stringValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stringValue, "StringValue", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.booleanParam)) {
            query.put("BooleanParam", request.booleanParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultValueShrink)) {
            query.put("DefaultValue", request.defaultValueShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherParamShrink)) {
            query.put("OtherParam", request.otherParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.p1)) {
            query.put("P1", request.p1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stringValueShrink)) {
            query.put("StringValue", request.stringValueShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtDynamicAddressHttpVpc"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtDynamicAddressHttpVpcResponse());
    }

    public FtDynamicAddressHttpVpcResponse ftDynamicAddressHttpVpc(FtDynamicAddressHttpVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressHttpVpcWithOptions(request, runtime);
    }

    public FtEagleEyeResponse ftEagleEyeWithOptions(FtEagleEyeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtEagleEye"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtEagleEyeResponse());
    }

    public FtEagleEyeResponse ftEagleEye(FtEagleEyeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftEagleEyeWithOptions(request, runtime);
    }

    public FtFlowSpecialResponse ftFlowSpecialWithOptions(FtFlowSpecialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtFlowSpecial"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtFlowSpecialResponse());
    }

    public FtFlowSpecialResponse ftFlowSpecial(FtFlowSpecialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftFlowSpecialWithOptions(request, runtime);
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4WithOptions(FtGatedLaunchPolicy4Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isGatedLaunch)) {
            query.put("IsGatedLaunch", request.isGatedLaunch);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtGatedLaunchPolicy4"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtGatedLaunchPolicy4Response());
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4(FtGatedLaunchPolicy4Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftGatedLaunchPolicy4WithOptions(request, runtime);
    }

    public FtIpFlowControlResponse ftIpFlowControlWithOptions(FtIpFlowControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtIpFlowControl"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtIpFlowControlResponse());
    }

    public FtIpFlowControlResponse ftIpFlowControl(FtIpFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftIpFlowControlWithOptions(request, runtime);
    }

    public FtParamListResponse ftParamListWithOptions(FtParamListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disk)) {
            query.put("Disk", request.disk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FtParamList"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FtParamListResponse());
    }

    public FtParamListResponse ftParamList(FtParamListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftParamListWithOptions(request, runtime);
    }

    public TestFlowStrategy01Response testFlowStrategy01WithOptions(TestFlowStrategy01Request tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestFlowStrategy01ShrinkRequest request = new TestFlowStrategy01ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namesShrink)) {
            body.put("Names", request.namesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestFlowStrategy01"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestFlowStrategy01Response());
    }

    public TestFlowStrategy01Response testFlowStrategy01(TestFlowStrategy01Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testFlowStrategy01WithOptions(request, runtime);
    }

    public TestHttpApiResponse testHttpApiWithOptions(TestHttpApiRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestHttpApiShrinkRequest request = new TestHttpApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultValue)) {
            request.defaultValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultValue, "DefaultValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherParam)) {
            request.otherParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherParam, "OtherParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stringValue)) {
            request.stringValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stringValue, "StringValue", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.booleanParam)) {
            query.put("BooleanParam", request.booleanParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultValueShrink)) {
            query.put("DefaultValue", request.defaultValueShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherParamShrink)) {
            query.put("OtherParam", request.otherParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stringValueShrink)) {
            query.put("StringValue", request.stringValueShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestHttpApi"),
            new TeaPair("version", "2018-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestHttpApiResponse());
    }

    public TestHttpApiResponse testHttpApi(TestHttpApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testHttpApiWithOptions(request, runtime);
    }
}
