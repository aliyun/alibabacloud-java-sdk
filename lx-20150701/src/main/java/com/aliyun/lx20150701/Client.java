// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701;

import com.aliyun.tea.*;
import com.aliyun.lx20150701.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lx", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ModifyReservedInstanceResponse modifyReservedInstanceWithOptions(ModifyReservedInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReservedInstance", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReservedInstanceResponse());
    }

    public ModifyReservedInstanceResponse modifyReservedInstance(ModifyReservedInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReservedInstanceWithOptions(request, runtime);
    }

    public PageQueryByPipCodeResponse pageQueryByPipCodeWithOptions(PageQueryByPipCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PageQueryByPipCode", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new PageQueryByPipCodeResponse());
    }

    public PageQueryByPipCodeResponse pageQueryByPipCode(PageQueryByPipCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageQueryByPipCodeWithOptions(request, runtime);
    }

    public RefundVnoBatchInstancesResponse refundVnoBatchInstancesWithOptions(RefundVnoBatchInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefundVnoBatchInstances", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RefundVnoBatchInstancesResponse());
    }

    public RefundVnoBatchInstancesResponse refundVnoBatchInstances(RefundVnoBatchInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundVnoBatchInstancesWithOptions(request, runtime);
    }

    public DescribeReservedInstancePriceResponse describeReservedInstancePriceWithOptions(DescribeReservedInstancePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeReservedInstancePrice", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReservedInstancePriceResponse());
    }

    public DescribeReservedInstancePriceResponse describeReservedInstancePrice(DescribeReservedInstancePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReservedInstancePriceWithOptions(request, runtime);
    }

    public ValidateCreateOrderExpressResponse validateCreateOrderExpressWithOptions(ValidateCreateOrderExpressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateCreateOrderExpress", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateCreateOrderExpressResponse());
    }

    public ValidateCreateOrderExpressResponse validateCreateOrderExpress(ValidateCreateOrderExpressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateCreateOrderExpressWithOptions(request, runtime);
    }

    public FillAgAccountActionResponse fillAgAccountActionWithOptions(FillAgAccountActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FillAgAccountAction", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new FillAgAccountActionResponse());
    }

    public FillAgAccountActionResponse fillAgAccountAction(FillAgAccountActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fillAgAccountActionWithOptions(request, runtime);
    }

    public ValidateUserBuyPermissionResponse validateUserBuyPermissionWithOptions(ValidateUserBuyPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateUserBuyPermission", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateUserBuyPermissionResponse());
    }

    public ValidateUserBuyPermissionResponse validateUserBuyPermission(ValidateUserBuyPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateUserBuyPermissionWithOptions(request, runtime);
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApiWithOptions(SubscriptionCreateOrderApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubscriptionCreateOrderApi", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SubscriptionCreateOrderApiResponse());
    }

    public SubscriptionCreateOrderApiResponse subscriptionCreateOrderApi(SubscriptionCreateOrderApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscriptionCreateOrderApiWithOptions(request, runtime);
    }

    public TransferResourceResponse transferResourceWithOptions(TransferResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferResource", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new TransferResourceResponse());
    }

    public TransferResourceResponse transferResource(TransferResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferResourceWithOptions(request, runtime);
    }

    public DoPhysicalDeleteResourceResponse doPhysicalDeleteResourceWithOptions(DoPhysicalDeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("doPhysicalDeleteResource", "2015-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new DoPhysicalDeleteResourceResponse());
    }

    public DoPhysicalDeleteResourceResponse doPhysicalDeleteResource(DoPhysicalDeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doPhysicalDeleteResourceWithOptions(request, runtime);
    }
}
