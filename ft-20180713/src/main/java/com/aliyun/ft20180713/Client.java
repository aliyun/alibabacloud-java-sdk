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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAuditTest01", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAuditTest01Response());
    }

    public BatchAuditTest01Response batchAuditTest01(BatchAuditTest01Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAuditTest01WithOptions(request, runtime);
    }

    public FTApiAliasApiResponse fTApiAliasApiWithOptions(FTApiAliasApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FTApiAliasApi", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FTApiAliasApiResponse());
    }

    public FTApiAliasApiResponse fTApiAliasApi(FTApiAliasApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fTApiAliasApiWithOptions(request, runtime);
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubboWithOptions(FtDynamicAddressDubboRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtDynamicAddressDubbo", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtDynamicAddressDubboResponse());
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubbo(FtDynamicAddressDubboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressDubboWithOptions(request, runtime);
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsfWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("FtDynamicAddressHsf", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtDynamicAddressHsfResponse());
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsf() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressHsfWithOptions(runtime);
    }

    public FtDynamicAddressHttpVpcResponse ftDynamicAddressHttpVpcWithOptions(FtDynamicAddressHttpVpcRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FtDynamicAddressHttpVpcShrinkRequest request = new FtDynamicAddressHttpVpcShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stringValue)) {
            request.stringValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stringValue, "StringValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultValue)) {
            request.defaultValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultValue, "DefaultValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherParam)) {
            request.otherParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherParam, "OtherParam", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtDynamicAddressHttpVpc", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtDynamicAddressHttpVpcResponse());
    }

    public FtDynamicAddressHttpVpcResponse ftDynamicAddressHttpVpc(FtDynamicAddressHttpVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftDynamicAddressHttpVpcWithOptions(request, runtime);
    }

    public FtEagleEyeResponse ftEagleEyeWithOptions(FtEagleEyeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtEagleEye", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtEagleEyeResponse());
    }

    public FtEagleEyeResponse ftEagleEye(FtEagleEyeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftEagleEyeWithOptions(request, runtime);
    }

    public FtFlowSpecialResponse ftFlowSpecialWithOptions(FtFlowSpecialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtFlowSpecial", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtFlowSpecialResponse());
    }

    public FtFlowSpecialResponse ftFlowSpecial(FtFlowSpecialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftFlowSpecialWithOptions(request, runtime);
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4WithOptions(FtGatedLaunchPolicy4Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtGatedLaunchPolicy4", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtGatedLaunchPolicy4Response());
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4(FtGatedLaunchPolicy4Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftGatedLaunchPolicy4WithOptions(request, runtime);
    }

    public FtIpFlowControlResponse ftIpFlowControlWithOptions(FtIpFlowControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtIpFlowControl", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtIpFlowControlResponse());
    }

    public FtIpFlowControlResponse ftIpFlowControl(FtIpFlowControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ftIpFlowControlWithOptions(request, runtime);
    }

    public FtParamListResponse ftParamListWithOptions(FtParamListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FtParamList", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new FtParamListResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestFlowStrategy01", "2018-07-13", "HTTPS", "PUT", "AK", "json", req, runtime), new TestFlowStrategy01Response());
    }

    public TestFlowStrategy01Response testFlowStrategy01(TestFlowStrategy01Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testFlowStrategy01WithOptions(request, runtime);
    }

    public TestHttpApiResponse testHttpApiWithOptions(TestHttpApiRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TestHttpApiShrinkRequest request = new TestHttpApiShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.stringValue)) {
            request.stringValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.stringValue, "StringValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.defaultValue)) {
            request.defaultValueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.defaultValue, "DefaultValue", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.otherParam)) {
            request.otherParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.otherParam, "OtherParam", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestHttpApi", "2018-07-13", "HTTPS", "POST", "AK", "json", req, runtime), new TestHttpApiResponse());
    }

    public TestHttpApiResponse testHttpApi(TestHttpApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testHttpApiWithOptions(request, runtime);
    }
}
