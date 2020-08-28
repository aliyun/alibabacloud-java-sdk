// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713;

import com.aliyun.tea.*;
import com.aliyun.ft20180713.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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
            new TeaPair("cn-yushanfang", "ft.aliyuncs.com"),
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


    public TestFlowStrategy01Response testFlowStrategy01WithOptions(TestFlowStrategy01Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TestFlowStrategy01", "HTTPS", "PUT", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new TestFlowStrategy01Response());
    }

    public TestFlowStrategy01Response testFlowStrategy01(TestFlowStrategy01Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testFlowStrategy01WithOptions(request, runtime);
    }

    public TestHttpApiResponse testHttpApiWithOptions(TestHttpApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TestHttpApi", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new TestHttpApiResponse());
    }

    public TestHttpApiResponse testHttpApi(TestHttpApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testHttpApiWithOptions(request, runtime);
    }

    public BatchAuditTest01Response batchAuditTest01WithOptions(BatchAuditTest01Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchAuditTest01", "HTTPS", "POST", "2018-07-13", "Anonymous", null, TeaModel.buildMap(request), runtime), new BatchAuditTest01Response());
    }

    public BatchAuditTest01Response batchAuditTest01(BatchAuditTest01Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAuditTest01WithOptions(request, runtime);
    }

    public FtIpFlowControlResponse ftIpFlowControlWithOptions(FtIpFlowControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtIpFlowControl", "HTTPS", "POST", "2018-07-13", "Anonymous", null, TeaModel.buildMap(request), runtime), new FtIpFlowControlResponse());
    }

    public FtIpFlowControlResponse ftIpFlowControl(FtIpFlowControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftIpFlowControlWithOptions(request, runtime);
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubboWithOptions(FtDynamicAddressDubboRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtDynamicAddressDubbo", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtDynamicAddressDubboResponse());
    }

    public FtDynamicAddressDubboResponse ftDynamicAddressDubbo(FtDynamicAddressDubboRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftDynamicAddressDubboWithOptions(request, runtime);
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsfWithOptions(FtDynamicAddressHsfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtDynamicAddressHsf", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtDynamicAddressHsfResponse());
    }

    public FtDynamicAddressHsfResponse ftDynamicAddressHsf(FtDynamicAddressHsfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftDynamicAddressHsfWithOptions(request, runtime);
    }

    public FtFlowSpecialResponse ftFlowSpecialWithOptions(FtFlowSpecialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtFlowSpecial", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtFlowSpecialResponse());
    }

    public FtFlowSpecialResponse ftFlowSpecial(FtFlowSpecialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftFlowSpecialWithOptions(request, runtime);
    }

    public FTApiAliasApiResponse FTApiAliasApiWithOptions(FTApiAliasApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FTApiAliasApi", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FTApiAliasApiResponse());
    }

    public FTApiAliasApiResponse FTApiAliasApi(FTApiAliasApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.FTApiAliasApiWithOptions(request, runtime);
    }

    public FtEagleEyeResponse ftEagleEyeWithOptions(FtEagleEyeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtEagleEye", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtEagleEyeResponse());
    }

    public FtEagleEyeResponse ftEagleEye(FtEagleEyeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftEagleEyeWithOptions(request, runtime);
    }

    public FtParamListResponse ftParamListWithOptions(FtParamListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtParamList", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtParamListResponse());
    }

    public FtParamListResponse ftParamList(FtParamListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftParamListWithOptions(request, runtime);
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4WithOptions(FtGatedLaunchPolicy4Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FtGatedLaunchPolicy4", "HTTPS", "POST", "2018-07-13", "AK", null, TeaModel.buildMap(request), runtime), new FtGatedLaunchPolicy4Response());
    }

    public FtGatedLaunchPolicy4Response ftGatedLaunchPolicy4(FtGatedLaunchPolicy4Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ftGatedLaunchPolicy4WithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
