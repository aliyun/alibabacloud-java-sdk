// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115;

import com.aliyun.tea.*;
import com.aliyun.dcdn20180115.models.*;
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
            new TeaPair("ap-northeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dcdn.aliyuncs.com"),
            new TeaPair("ap-south-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dcdn.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dcdn.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-fujian", "dcdn.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dcdn.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dcdn.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dcdn.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dcdn.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dcdn.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dcdn.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-central-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1", "dcdn.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dcdn.aliyuncs.com"),
            new TeaPair("me-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dcdn.aliyuncs.com"),
            new TeaPair("us-east-1", "dcdn.aliyuncs.com"),
            new TeaPair("us-west-1", "dcdn.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dcdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddDcdnDomainResponse addDcdnDomainWithOptions(AddDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddDcdnDomainResponse());
    }

    public AddDcdnDomainResponse addDcdnDomain(AddDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDcdnDomainWithOptions(request, runtime);
    }

    public AddDcdnIpaDomainResponse addDcdnIpaDomainWithOptions(AddDcdnIpaDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDcdnIpaDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new AddDcdnIpaDomainResponse());
    }

    public AddDcdnIpaDomainResponse addDcdnIpaDomain(AddDcdnIpaDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDcdnIpaDomainWithOptions(request, runtime);
    }

    public BatchAddDcdnDomainResponse batchAddDcdnDomainWithOptions(BatchAddDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAddDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAddDcdnDomainResponse());
    }

    public BatchAddDcdnDomainResponse batchAddDcdnDomain(BatchAddDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddDcdnDomainWithOptions(request, runtime);
    }

    public BatchDeleteDcdnDomainConfigsResponse batchDeleteDcdnDomainConfigsWithOptions(BatchDeleteDcdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteDcdnDomainConfigs", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteDcdnDomainConfigsResponse());
    }

    public BatchDeleteDcdnDomainConfigsResponse batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteDcdnDomainConfigsWithOptions(request, runtime);
    }

    public BatchSetDcdnDomainCertificateResponse batchSetDcdnDomainCertificateWithOptions(BatchSetDcdnDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetDcdnDomainCertificate", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetDcdnDomainCertificateResponse());
    }

    public BatchSetDcdnDomainCertificateResponse batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetDcdnDomainCertificateWithOptions(request, runtime);
    }

    public BatchSetDcdnDomainConfigsResponse batchSetDcdnDomainConfigsWithOptions(BatchSetDcdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetDcdnDomainConfigs", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetDcdnDomainConfigsResponse());
    }

    public BatchSetDcdnDomainConfigsResponse batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetDcdnDomainConfigsWithOptions(request, runtime);
    }

    public BatchSetDcdnIpaDomainConfigsResponse batchSetDcdnIpaDomainConfigsWithOptions(BatchSetDcdnIpaDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetDcdnIpaDomainConfigs", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetDcdnIpaDomainConfigsResponse());
    }

    public BatchSetDcdnIpaDomainConfigsResponse batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    public BatchStartDcdnDomainResponse batchStartDcdnDomainWithOptions(BatchStartDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStartDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStartDcdnDomainResponse());
    }

    public BatchStartDcdnDomainResponse batchStartDcdnDomain(BatchStartDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartDcdnDomainWithOptions(request, runtime);
    }

    public BatchStopDcdnDomainResponse batchStopDcdnDomainWithOptions(BatchStopDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopDcdnDomainResponse());
    }

    public BatchStopDcdnDomainResponse batchStopDcdnDomain(BatchStopDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopDcdnDomainWithOptions(request, runtime);
    }

    public CreateDcdnCertificateSigningRequestResponse createDcdnCertificateSigningRequestWithOptions(CreateDcdnCertificateSigningRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDcdnCertificateSigningRequest", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDcdnCertificateSigningRequestResponse());
    }

    public CreateDcdnCertificateSigningRequestResponse createDcdnCertificateSigningRequest(CreateDcdnCertificateSigningRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDcdnCertificateSigningRequestWithOptions(request, runtime);
    }

    public CreateDcdnDomainOfflineLogDeliveryResponse createDcdnDomainOfflineLogDeliveryWithOptions(CreateDcdnDomainOfflineLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDcdnDomainOfflineLogDelivery", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDcdnDomainOfflineLogDeliveryResponse());
    }

    public CreateDcdnDomainOfflineLogDeliveryResponse createDcdnDomainOfflineLogDelivery(CreateDcdnDomainOfflineLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDcdnDomainOfflineLogDeliveryWithOptions(request, runtime);
    }

    public DeleteDcdnDomainResponse deleteDcdnDomainWithOptions(DeleteDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDcdnDomainResponse());
    }

    public DeleteDcdnDomainResponse deleteDcdnDomain(DeleteDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDcdnDomainWithOptions(request, runtime);
    }

    public DeleteDcdnIpaDomainResponse deleteDcdnIpaDomainWithOptions(DeleteDcdnIpaDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDcdnIpaDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDcdnIpaDomainResponse());
    }

    public DeleteDcdnIpaDomainResponse deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDcdnIpaDomainWithOptions(request, runtime);
    }

    public DeleteDcdnIpaSpecificConfigResponse deleteDcdnIpaSpecificConfigWithOptions(DeleteDcdnIpaSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDcdnIpaSpecificConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDcdnIpaSpecificConfigResponse());
    }

    public DeleteDcdnIpaSpecificConfigResponse deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDcdnIpaSpecificConfigWithOptions(request, runtime);
    }

    public DeleteDcdnSpecificConfigResponse deleteDcdnSpecificConfigWithOptions(DeleteDcdnSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDcdnSpecificConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDcdnSpecificConfigResponse());
    }

    public DeleteDcdnSpecificConfigResponse deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDcdnSpecificConfigWithOptions(request, runtime);
    }

    public DeleteDcdnSpecificStagingConfigResponse deleteDcdnSpecificStagingConfigWithOptions(DeleteDcdnSpecificStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDcdnSpecificStagingConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDcdnSpecificStagingConfigResponse());
    }

    public DeleteDcdnSpecificStagingConfigResponse deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDcdnSpecificStagingConfigWithOptions(request, runtime);
    }

    public DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsDataWithOptions(DescribeDcdnBgpBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnBgpBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnBgpBpsDataResponse());
    }

    public DescribeDcdnBgpBpsDataResponse describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnBgpBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficDataWithOptions(DescribeDcdnBgpTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnBgpTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnBgpTrafficDataResponse());
    }

    public DescribeDcdnBgpTrafficDataResponse describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnBgpTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetailWithOptions(DescribeDcdnCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnCertificateDetail", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnCertificateDetailResponse());
    }

    public DescribeDcdnCertificateDetailResponse describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnCertificateDetailWithOptions(request, runtime);
    }

    public DescribeDcdnCertificateListResponse describeDcdnCertificateListWithOptions(DescribeDcdnCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnCertificateList", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnCertificateListResponse());
    }

    public DescribeDcdnCertificateListResponse describeDcdnCertificateList(DescribeDcdnCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnCertificateListWithOptions(request, runtime);
    }

    public DescribeDcdnConfigOfVersionResponse describeDcdnConfigOfVersionWithOptions(DescribeDcdnConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnConfigOfVersion", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnConfigOfVersionResponse());
    }

    public DescribeDcdnConfigOfVersionResponse describeDcdnConfigOfVersion(DescribeDcdnConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnConfigOfVersionWithOptions(request, runtime);
    }

    public DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsDataWithOptions(DescribeDcdnDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainBpsDataResponse());
    }

    public DescribeDcdnDomainBpsDataResponse describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificateWithOptions(DescribeDcdnDomainByCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainByCertificate", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainByCertificateResponse());
    }

    public DescribeDcdnDomainByCertificateResponse describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainByCertificateWithOptions(request, runtime);
    }

    public DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfoWithOptions(DescribeDcdnDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainCertificateInfo", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainCertificateInfoResponse());
    }

    public DescribeDcdnDomainCertificateInfoResponse describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeDcdnDomainCnameResponse describeDcdnDomainCnameWithOptions(DescribeDcdnDomainCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainCname", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainCnameResponse());
    }

    public DescribeDcdnDomainCnameResponse describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainCnameWithOptions(request, runtime);
    }

    public DescribeDcdnDomainConfigsResponse describeDcdnDomainConfigsWithOptions(DescribeDcdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainConfigs", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainConfigsResponse());
    }

    public DescribeDcdnDomainConfigsResponse describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainConfigsWithOptions(request, runtime);
    }

    public DescribeDcdnDomainDetailResponse describeDcdnDomainDetailWithOptions(DescribeDcdnDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainDetail", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainDetailResponse());
    }

    public DescribeDcdnDomainDetailResponse describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainDetailWithOptions(request, runtime);
    }

    public DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateDataWithOptions(DescribeDcdnDomainHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainHitRateData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainHitRateDataResponse());
    }

    public DescribeDcdnDomainHitRateDataResponse describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainHitRateDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeDataWithOptions(DescribeDcdnDomainHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainHttpCodeData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainHttpCodeDataResponse());
    }

    public DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsDataWithOptions(DescribeDcdnDomainIpaBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainIpaBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainIpaBpsDataResponse());
    }

    public DescribeDcdnDomainIpaBpsDataResponse describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainIpaBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficDataWithOptions(DescribeDcdnDomainIpaTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainIpaTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainIpaTrafficDataResponse());
    }

    public DescribeDcdnDomainIpaTrafficDataResponse describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainIpaTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainIspDataResponse describeDcdnDomainIspDataWithOptions(DescribeDcdnDomainIspDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainIspData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainIspDataResponse());
    }

    public DescribeDcdnDomainIspDataResponse describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainIspDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainLogResponse describeDcdnDomainLogWithOptions(DescribeDcdnDomainLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainLog", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainLogResponse());
    }

    public DescribeDcdnDomainLogResponse describeDcdnDomainLog(DescribeDcdnDomainLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainLogWithOptions(request, runtime);
    }

    public DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageDataWithOptions(DescribeDcdnDomainMultiUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainMultiUsageData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainMultiUsageDataResponse());
    }

    public DescribeDcdnDomainMultiUsageDataResponse describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainMultiUsageDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsDataWithOptions(DescribeDcdnDomainOriginBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainOriginBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainOriginBpsDataResponse());
    }

    public DescribeDcdnDomainOriginBpsDataResponse describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainOriginBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficDataWithOptions(DescribeDcdnDomainOriginTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainOriginTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainOriginTrafficDataResponse());
    }

    public DescribeDcdnDomainOriginTrafficDataResponse describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainOriginTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainPropertyResponse describeDcdnDomainPropertyWithOptions(DescribeDcdnDomainPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainProperty", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainPropertyResponse());
    }

    public DescribeDcdnDomainPropertyResponse describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainPropertyWithOptions(request, runtime);
    }

    public DescribeDcdnDomainPvDataResponse describeDcdnDomainPvDataWithOptions(DescribeDcdnDomainPvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainPvData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainPvDataResponse());
    }

    public DescribeDcdnDomainPvDataResponse describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainPvDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsDataWithOptions(DescribeDcdnDomainQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainQpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainQpsDataResponse());
    }

    public DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainQpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsDataWithOptions(DescribeDcdnDomainRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeBpsData", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeBpsDataResponse());
    }

    public DescribeDcdnDomainRealTimeBpsDataResponse describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateDataWithOptions(DescribeDcdnDomainRealTimeByteHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeByteHitRateData", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeByteHitRateDataResponse());
    }

    public DescribeDcdnDomainRealTimeByteHitRateDataResponse describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeDetailDataResponse describeDcdnDomainRealTimeDetailDataWithOptions(DescribeDcdnDomainRealTimeDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeDetailData", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeDetailDataResponse());
    }

    public DescribeDcdnDomainRealTimeDetailDataResponse describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeDataWithOptions(DescribeDcdnDomainRealTimeHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeHttpCodeData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeDcdnDomainRealTimeHttpCodeDataResponse describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse describeDcdnDomainRealTimeQpsDataWithOptions(DescribeDcdnDomainRealTimeQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeQpsData", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeQpsDataResponse());
    }

    public DescribeDcdnDomainRealTimeQpsDataResponse describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateDataWithOptions(DescribeDcdnDomainRealTimeReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeReqHitRateData", "2018-01-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeReqHitRateDataResponse());
    }

    public DescribeDcdnDomainRealTimeReqHitRateDataResponse describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsDataWithOptions(DescribeDcdnDomainRealTimeSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeSrcBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeSrcBpsDataResponse());
    }

    public DescribeDcdnDomainRealTimeSrcBpsDataResponse describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeDataWithOptions(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeSrcHttpCodeData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse());
    }

    public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficDataWithOptions(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeSrcTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeSrcTrafficDataResponse());
    }

    public DescribeDcdnDomainRealTimeSrcTrafficDataResponse describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficDataWithOptions(DescribeDcdnDomainRealTimeTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRealTimeTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRealTimeTrafficDataResponse());
    }

    public DescribeDcdnDomainRealTimeTrafficDataResponse describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionDataWithOptions(DescribeDcdnDomainRegionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainRegionData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainRegionDataResponse());
    }

    public DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfigWithOptions(DescribeDcdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainStagingConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainStagingConfigResponse());
    }

    public DescribeDcdnDomainStagingConfigResponse describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    public DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisitWithOptions(DescribeDcdnDomainTopReferVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainTopReferVisit", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainTopReferVisitResponse());
    }

    public DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainTopReferVisitWithOptions(request, runtime);
    }

    public DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisitWithOptions(DescribeDcdnDomainTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainTopUrlVisit", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainTopUrlVisitResponse());
    }

    public DescribeDcdnDomainTopUrlVisitResponse describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficDataWithOptions(DescribeDcdnDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainTrafficDataResponse());
    }

    public DescribeDcdnDomainTrafficDataResponse describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainUvDataResponse describeDcdnDomainUvDataWithOptions(DescribeDcdnDomainUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainUvData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainUvDataResponse());
    }

    public DescribeDcdnDomainUvDataResponse describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainUvDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsDataWithOptions(DescribeDcdnDomainWebsocketBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainWebsocketBpsData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainWebsocketBpsDataResponse());
    }

    public DescribeDcdnDomainWebsocketBpsDataResponse describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainWebsocketBpsDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeDataWithOptions(DescribeDcdnDomainWebsocketHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainWebsocketHttpCodeData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainWebsocketHttpCodeDataResponse());
    }

    public DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainWebsocketHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficDataWithOptions(DescribeDcdnDomainWebsocketTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnDomainWebsocketTrafficData", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnDomainWebsocketTrafficDataResponse());
    }

    public DescribeDcdnDomainWebsocketTrafficDataResponse describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnDomainWebsocketTrafficDataWithOptions(request, runtime);
    }

    public DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainListWithOptions(DescribeDcdnHttpsDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnHttpsDomainList", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnHttpsDomainListResponse());
    }

    public DescribeDcdnHttpsDomainListResponse describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnHttpsDomainListWithOptions(request, runtime);
    }

    public DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigsWithOptions(DescribeDcdnIpaDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnIpaDomainConfigs", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnIpaDomainConfigsResponse());
    }

    public DescribeDcdnIpaDomainConfigsResponse describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnIpaDomainConfigsWithOptions(request, runtime);
    }

    public DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetailWithOptions(DescribeDcdnIpaDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnIpaDomainDetail", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnIpaDomainDetailResponse());
    }

    public DescribeDcdnIpaDomainDetailResponse describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnIpaDomainDetailWithOptions(request, runtime);
    }

    public DescribeDcdnIpaServiceResponse describeDcdnIpaServiceWithOptions(DescribeDcdnIpaServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnIpaService", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnIpaServiceResponse());
    }

    public DescribeDcdnIpaServiceResponse describeDcdnIpaService(DescribeDcdnIpaServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnIpaServiceWithOptions(request, runtime);
    }

    public DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomainsWithOptions(DescribeDcdnIpaUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnIpaUserDomains", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnIpaUserDomainsResponse());
    }

    public DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnIpaUserDomainsWithOptions(request, runtime);
    }

    public DescribeDcdnIpInfoResponse describeDcdnIpInfoWithOptions(DescribeDcdnIpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnIpInfo", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnIpInfoResponse());
    }

    public DescribeDcdnIpInfoResponse describeDcdnIpInfo(DescribeDcdnIpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnIpInfoWithOptions(request, runtime);
    }

    public DescribeDcdnOfflineLogDeliveryResponse describeDcdnOfflineLogDeliveryWithOptions(DescribeDcdnOfflineLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnOfflineLogDelivery", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnOfflineLogDeliveryResponse());
    }

    public DescribeDcdnOfflineLogDeliveryResponse describeDcdnOfflineLogDelivery(DescribeDcdnOfflineLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnOfflineLogDeliveryWithOptions(request, runtime);
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponse describeDcdnOfflineLogDeliveryFieldWithOptions(DescribeDcdnOfflineLogDeliveryFieldRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnOfflineLogDeliveryField", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnOfflineLogDeliveryFieldResponse());
    }

    public DescribeDcdnOfflineLogDeliveryFieldResponse describeDcdnOfflineLogDeliveryField(DescribeDcdnOfflineLogDeliveryFieldRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnOfflineLogDeliveryFieldWithOptions(request, runtime);
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponse describeDcdnOfflineLogDeliveryRegionsWithOptions(DescribeDcdnOfflineLogDeliveryRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnOfflineLogDeliveryRegions", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnOfflineLogDeliveryRegionsResponse());
    }

    public DescribeDcdnOfflineLogDeliveryRegionsResponse describeDcdnOfflineLogDeliveryRegions(DescribeDcdnOfflineLogDeliveryRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnOfflineLogDeliveryRegionsWithOptions(request, runtime);
    }

    public DescribeDcdnOfflineLogDeliveryStatusResponse describeDcdnOfflineLogDeliveryStatusWithOptions(DescribeDcdnOfflineLogDeliveryStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnOfflineLogDeliveryStatus", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnOfflineLogDeliveryStatusResponse());
    }

    public DescribeDcdnOfflineLogDeliveryStatusResponse describeDcdnOfflineLogDeliveryStatus(DescribeDcdnOfflineLogDeliveryStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnOfflineLogDeliveryStatusWithOptions(request, runtime);
    }

    public DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuotaWithOptions(DescribeDcdnRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnRefreshQuota", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnRefreshQuotaResponse());
    }

    public DescribeDcdnRefreshQuotaResponse describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasksWithOptions(DescribeDcdnRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnRefreshTasks", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnRefreshTasksResponse());
    }

    public DescribeDcdnRefreshTasksResponse describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnRefreshTasksWithOptions(request, runtime);
    }

    public DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIspWithOptions(DescribeDcdnRegionAndIspRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnRegionAndIsp", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnRegionAndIspResponse());
    }

    public DescribeDcdnRegionAndIspResponse describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnRegionAndIspWithOptions(request, runtime);
    }

    public DescribeDcdnServiceResponse describeDcdnServiceWithOptions(DescribeDcdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnService", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnServiceResponse());
    }

    public DescribeDcdnServiceResponse describeDcdnService(DescribeDcdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnServiceWithOptions(request, runtime);
    }

    public DescribeDcdnStagingIpResponse describeDcdnStagingIpWithOptions(DescribeDcdnStagingIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnStagingIp", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnStagingIpResponse());
    }

    public DescribeDcdnStagingIpResponse describeDcdnStagingIp(DescribeDcdnStagingIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnStagingIpWithOptions(request, runtime);
    }

    public DescribeDcdnTagResourcesResponse describeDcdnTagResourcesWithOptions(DescribeDcdnTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnTagResources", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnTagResourcesResponse());
    }

    public DescribeDcdnTagResourcesResponse describeDcdnTagResources(DescribeDcdnTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnTagResourcesWithOptions(request, runtime);
    }

    public DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlowWithOptions(DescribeDcdnTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnTopDomainsByFlow", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnTopDomainsByFlowResponse());
    }

    public DescribeDcdnTopDomainsByFlowResponse describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeDcdnUserBillHistoryResponse describeDcdnUserBillHistoryWithOptions(DescribeDcdnUserBillHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserBillHistory", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserBillHistoryResponse());
    }

    public DescribeDcdnUserBillHistoryResponse describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserBillHistoryWithOptions(request, runtime);
    }

    public DescribeDcdnUserBillTypeResponse describeDcdnUserBillTypeWithOptions(DescribeDcdnUserBillTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserBillType", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserBillTypeResponse());
    }

    public DescribeDcdnUserBillTypeResponse describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserBillTypeWithOptions(request, runtime);
    }

    public DescribeDcdnUserDomainsResponse describeDcdnUserDomainsWithOptions(DescribeDcdnUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserDomains", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserDomainsResponse());
    }

    public DescribeDcdnUserDomainsResponse describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserDomainsWithOptions(request, runtime);
    }

    public DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFuncWithOptions(DescribeDcdnUserDomainsByFuncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserDomainsByFunc", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserDomainsByFuncResponse());
    }

    public DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserDomainsByFuncWithOptions(request, runtime);
    }

    public DescribeDcdnUserQuotaResponse describeDcdnUserQuotaWithOptions(DescribeDcdnUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserQuota", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserQuotaResponse());
    }

    public DescribeDcdnUserQuotaResponse describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserQuotaWithOptions(request, runtime);
    }

    public DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackageWithOptions(DescribeDcdnUserResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserResourcePackage", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserResourcePackageResponse());
    }

    public DescribeDcdnUserResourcePackageResponse describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserResourcePackageWithOptions(request, runtime);
    }

    public DescribeDcdnUserSecDropResponse describeDcdnUserSecDropWithOptions(DescribeDcdnUserSecDropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserSecDrop", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserSecDropResponse());
    }

    public DescribeDcdnUserSecDropResponse describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserSecDropWithOptions(request, runtime);
    }

    public DescribeDcdnUserTagsResponse describeDcdnUserTagsWithOptions(DescribeDcdnUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnUserTags", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnUserTagsResponse());
    }

    public DescribeDcdnUserTagsResponse describeDcdnUserTags(DescribeDcdnUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnUserTagsWithOptions(request, runtime);
    }

    public DescribeDcdnVerifyContentResponse describeDcdnVerifyContentWithOptions(DescribeDcdnVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnVerifyContent", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnVerifyContentResponse());
    }

    public DescribeDcdnVerifyContentResponse describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnVerifyContentWithOptions(request, runtime);
    }

    public DescribeDcdnWafDomainResponse describeDcdnWafDomainWithOptions(DescribeDcdnWafDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDcdnWafDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDcdnWafDomainResponse());
    }

    public DescribeDcdnWafDomainResponse describeDcdnWafDomain(DescribeDcdnWafDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDcdnWafDomainWithOptions(request, runtime);
    }

    public DescribeUserDcdnIpaStatusResponse describeUserDcdnIpaStatusWithOptions(DescribeUserDcdnIpaStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserDcdnIpaStatus", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserDcdnIpaStatusResponse());
    }

    public DescribeUserDcdnIpaStatusResponse describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDcdnIpaStatusWithOptions(request, runtime);
    }

    public DescribeUserDcdnStatusResponse describeUserDcdnStatusWithOptions(DescribeUserDcdnStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserDcdnStatus", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserDcdnStatusResponse());
    }

    public DescribeUserDcdnStatusResponse describeUserDcdnStatus(DescribeUserDcdnStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDcdnStatusWithOptions(request, runtime);
    }

    public DisableDcdnDomainOfflineLogDeliveryResponse disableDcdnDomainOfflineLogDeliveryWithOptions(DisableDcdnDomainOfflineLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDcdnDomainOfflineLogDelivery", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDcdnDomainOfflineLogDeliveryResponse());
    }

    public DisableDcdnDomainOfflineLogDeliveryResponse disableDcdnDomainOfflineLogDelivery(DisableDcdnDomainOfflineLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDcdnDomainOfflineLogDeliveryWithOptions(request, runtime);
    }

    public DisableDcdnOfflineLogDeliveryResponse disableDcdnOfflineLogDeliveryWithOptions(DisableDcdnOfflineLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableDcdnOfflineLogDelivery", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new DisableDcdnOfflineLogDeliveryResponse());
    }

    public DisableDcdnOfflineLogDeliveryResponse disableDcdnOfflineLogDelivery(DisableDcdnOfflineLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDcdnOfflineLogDeliveryWithOptions(request, runtime);
    }

    public EnableDcdnDomainOfflineLogDeliveryResponse enableDcdnDomainOfflineLogDeliveryWithOptions(EnableDcdnDomainOfflineLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableDcdnDomainOfflineLogDelivery", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new EnableDcdnDomainOfflineLogDeliveryResponse());
    }

    public EnableDcdnDomainOfflineLogDeliveryResponse enableDcdnDomainOfflineLogDelivery(EnableDcdnDomainOfflineLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDcdnDomainOfflineLogDeliveryWithOptions(request, runtime);
    }

    public ModifyDCdnDomainSchdmByPropertyResponse modifyDCdnDomainSchdmByPropertyWithOptions(ModifyDCdnDomainSchdmByPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDCdnDomainSchdmByProperty", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDCdnDomainSchdmByPropertyResponse());
    }

    public ModifyDCdnDomainSchdmByPropertyResponse modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public OpenDcdnServiceResponse openDcdnServiceWithOptions(OpenDcdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenDcdnService", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new OpenDcdnServiceResponse());
    }

    public OpenDcdnServiceResponse openDcdnService(OpenDcdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openDcdnServiceWithOptions(request, runtime);
    }

    public PreloadDcdnObjectCachesResponse preloadDcdnObjectCachesWithOptions(PreloadDcdnObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PreloadDcdnObjectCaches", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new PreloadDcdnObjectCachesResponse());
    }

    public PreloadDcdnObjectCachesResponse preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.preloadDcdnObjectCachesWithOptions(request, runtime);
    }

    public PublishDcdnStagingConfigToProductionResponse publishDcdnStagingConfigToProductionWithOptions(PublishDcdnStagingConfigToProductionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishDcdnStagingConfigToProduction", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new PublishDcdnStagingConfigToProductionResponse());
    }

    public PublishDcdnStagingConfigToProductionResponse publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishDcdnStagingConfigToProductionWithOptions(request, runtime);
    }

    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCachesWithOptions(RefreshDcdnObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshDcdnObjectCaches", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshDcdnObjectCachesResponse());
    }

    public RefreshDcdnObjectCachesResponse refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshDcdnObjectCachesWithOptions(request, runtime);
    }

    public RollbackDcdnStagingConfigResponse rollbackDcdnStagingConfigWithOptions(RollbackDcdnStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackDcdnStagingConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackDcdnStagingConfigResponse());
    }

    public RollbackDcdnStagingConfigResponse rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackDcdnStagingConfigWithOptions(request, runtime);
    }

    public SetDcdnConfigOfVersionResponse setDcdnConfigOfVersionWithOptions(SetDcdnConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDcdnConfigOfVersion", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetDcdnConfigOfVersionResponse());
    }

    public SetDcdnConfigOfVersionResponse setDcdnConfigOfVersion(SetDcdnConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDcdnConfigOfVersionWithOptions(request, runtime);
    }

    public SetDcdnDomainCertificateResponse setDcdnDomainCertificateWithOptions(SetDcdnDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDcdnDomainCertificate", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetDcdnDomainCertificateResponse());
    }

    public SetDcdnDomainCertificateResponse setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDcdnDomainCertificateWithOptions(request, runtime);
    }

    public SetDcdnDomainCSRCertificateResponse setDcdnDomainCSRCertificateWithOptions(SetDcdnDomainCSRCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDcdnDomainCSRCertificate", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetDcdnDomainCSRCertificateResponse());
    }

    public SetDcdnDomainCSRCertificateResponse setDcdnDomainCSRCertificate(SetDcdnDomainCSRCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDcdnDomainCSRCertificateWithOptions(request, runtime);
    }

    public SetDcdnDomainStagingConfigResponse setDcdnDomainStagingConfigWithOptions(SetDcdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDcdnDomainStagingConfig", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new SetDcdnDomainStagingConfigResponse());
    }

    public SetDcdnDomainStagingConfigResponse setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDcdnDomainStagingConfigWithOptions(request, runtime);
    }

    public StartDcdnDomainResponse startDcdnDomainWithOptions(StartDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartDcdnDomainResponse());
    }

    public StartDcdnDomainResponse startDcdnDomain(StartDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDcdnDomainWithOptions(request, runtime);
    }

    public StartDcdnIpaDomainResponse startDcdnIpaDomainWithOptions(StartDcdnIpaDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDcdnIpaDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartDcdnIpaDomainResponse());
    }

    public StartDcdnIpaDomainResponse startDcdnIpaDomain(StartDcdnIpaDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDcdnIpaDomainWithOptions(request, runtime);
    }

    public StopDcdnDomainResponse stopDcdnDomainWithOptions(StopDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopDcdnDomainResponse());
    }

    public StopDcdnDomainResponse stopDcdnDomain(StopDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDcdnDomainWithOptions(request, runtime);
    }

    public StopDcdnIpaDomainResponse stopDcdnIpaDomainWithOptions(StopDcdnIpaDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDcdnIpaDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopDcdnIpaDomainResponse());
    }

    public StopDcdnIpaDomainResponse stopDcdnIpaDomain(StopDcdnIpaDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDcdnIpaDomainWithOptions(request, runtime);
    }

    public TagDcdnResourcesResponse tagDcdnResourcesWithOptions(TagDcdnResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagDcdnResources", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new TagDcdnResourcesResponse());
    }

    public TagDcdnResourcesResponse tagDcdnResources(TagDcdnResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagDcdnResourcesWithOptions(request, runtime);
    }

    public UntagDcdnResourcesResponse untagDcdnResourcesWithOptions(UntagDcdnResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagDcdnResources", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UntagDcdnResourcesResponse());
    }

    public UntagDcdnResourcesResponse untagDcdnResources(UntagDcdnResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagDcdnResourcesWithOptions(request, runtime);
    }

    public UpdateDcdnDomainResponse updateDcdnDomainWithOptions(UpdateDcdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDcdnDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDcdnDomainResponse());
    }

    public UpdateDcdnDomainResponse updateDcdnDomain(UpdateDcdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDcdnDomainWithOptions(request, runtime);
    }

    public UpdateDcdnIpaDomainResponse updateDcdnIpaDomainWithOptions(UpdateDcdnIpaDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDcdnIpaDomain", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDcdnIpaDomainResponse());
    }

    public UpdateDcdnIpaDomainResponse updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDcdnIpaDomainWithOptions(request, runtime);
    }

    public VerifyDcdnDomainOwnerResponse verifyDcdnDomainOwnerWithOptions(VerifyDcdnDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyDcdnDomainOwner", "2018-01-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyDcdnDomainOwnerResponse());
    }

    public VerifyDcdnDomainOwnerResponse verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDcdnDomainOwnerWithOptions(request, runtime);
    }
}
