// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510;

import com.aliyun.tea.*;
import com.aliyun.cdn20180510.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "cdn.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "cdn.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cdn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddCdnDomainResponse addCdnDomainWithOptions(AddCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new AddCdnDomainResponse());
    }

    public AddCdnDomainResponse addCdnDomain(AddCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCdnDomainWithOptions(request, runtime);
    }

    public AddFCTriggerResponse addFCTriggerWithOptions(AddFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddFCTrigger", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new AddFCTriggerResponse());
    }

    public AddFCTriggerResponse addFCTrigger(AddFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFCTriggerWithOptions(request, runtime);
    }

    public BatchAddCdnDomainResponse batchAddCdnDomainWithOptions(BatchAddCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAddCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAddCdnDomainResponse());
    }

    public BatchAddCdnDomainResponse batchAddCdnDomain(BatchAddCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddCdnDomainWithOptions(request, runtime);
    }

    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfigWithOptions(BatchSetCdnDomainConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetCdnDomainConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetCdnDomainConfigResponse());
    }

    public BatchSetCdnDomainConfigResponse batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetCdnDomainConfigWithOptions(request, runtime);
    }

    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificateWithOptions(BatchSetCdnDomainServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetCdnDomainServerCertificate", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetCdnDomainServerCertificateResponse());
    }

    public BatchSetCdnDomainServerCertificateResponse batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetCdnDomainServerCertificateWithOptions(request, runtime);
    }

    public BatchStartCdnDomainResponse batchStartCdnDomainWithOptions(BatchStartCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStartCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStartCdnDomainResponse());
    }

    public BatchStartCdnDomainResponse batchStartCdnDomain(BatchStartCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartCdnDomainWithOptions(request, runtime);
    }

    public BatchStopCdnDomainResponse batchStopCdnDomainWithOptions(BatchStopCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopCdnDomainResponse());
    }

    public BatchStopCdnDomainResponse batchStopCdnDomain(BatchStopCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopCdnDomainWithOptions(request, runtime);
    }

    public BatchUpdateCdnDomainResponse batchUpdateCdnDomainWithOptions(BatchUpdateCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUpdateCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUpdateCdnDomainResponse());
    }

    public BatchUpdateCdnDomainResponse batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateCdnDomainWithOptions(request, runtime);
    }

    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequestWithOptions(CreateCdnCertificateSigningRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCdnCertificateSigningRequest", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCdnCertificateSigningRequestResponse());
    }

    public CreateCdnCertificateSigningRequestResponse createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnCertificateSigningRequestWithOptions(request, runtime);
    }

    public CreateCdnDeliverTaskResponse createCdnDeliverTaskWithOptions(CreateCdnDeliverTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCdnDeliverTaskShrinkRequest request = new CreateCdnDeliverTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deliver)) {
            request.deliverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deliver, "Deliver", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "Schedule", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCdnDeliverTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCdnDeliverTaskResponse());
    }

    public CreateCdnDeliverTaskResponse createCdnDeliverTask(CreateCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnDeliverTaskWithOptions(request, runtime);
    }

    public CreateCdnSubTaskResponse createCdnSubTaskWithOptions(CreateCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCdnSubTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCdnSubTaskResponse());
    }

    public CreateCdnSubTaskResponse createCdnSubTask(CreateCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCdnSubTaskWithOptions(request, runtime);
    }

    public CreateIllegalUrlExportTaskResponse createIllegalUrlExportTaskWithOptions(CreateIllegalUrlExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIllegalUrlExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIllegalUrlExportTaskResponse());
    }

    public CreateIllegalUrlExportTaskResponse createIllegalUrlExportTask(CreateIllegalUrlExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIllegalUrlExportTaskWithOptions(request, runtime);
    }

    public CreateRealTimeLogDeliveryResponse createRealTimeLogDeliveryWithOptions(CreateRealTimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRealTimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new CreateRealTimeLogDeliveryResponse());
    }

    public CreateRealTimeLogDeliveryResponse createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTaskWithOptions(CreateUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUsageDetailDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUsageDetailDataExportTaskResponse());
    }

    public CreateUsageDetailDataExportTaskResponse createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTaskWithOptions(CreateUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserUsageDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserUsageDataExportTaskResponse());
    }

    public CreateUserUsageDataExportTaskResponse createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTaskWithOptions(DeleteCdnDeliverTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCdnDeliverTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCdnDeliverTaskResponse());
    }

    public DeleteCdnDeliverTaskResponse deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnDeliverTaskWithOptions(request, runtime);
    }

    public DeleteCdnDomainResponse deleteCdnDomainWithOptions(DeleteCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCdnDomainResponse());
    }

    public DeleteCdnDomainResponse deleteCdnDomain(DeleteCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnDomainWithOptions(request, runtime);
    }

    public DeleteCdnSubTaskResponse deleteCdnSubTaskWithOptions(DeleteCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCdnSubTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCdnSubTaskResponse());
    }

    public DeleteCdnSubTaskResponse deleteCdnSubTask(DeleteCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCdnSubTaskWithOptions(request, runtime);
    }

    public DeleteFCTriggerResponse deleteFCTriggerWithOptions(DeleteFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFCTrigger", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFCTriggerResponse());
    }

    public DeleteFCTriggerResponse deleteFCTrigger(DeleteFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFCTriggerWithOptions(request, runtime);
    }

    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDeliveryWithOptions(DeleteRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRealtimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteRealtimeLogDeliveryResponse());
    }

    public DeleteRealtimeLogDeliveryResponse deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteSpecificConfigResponse deleteSpecificConfigWithOptions(DeleteSpecificConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSpecificConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSpecificConfigResponse());
    }

    public DeleteSpecificConfigResponse deleteSpecificConfig(DeleteSpecificConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpecificConfigWithOptions(request, runtime);
    }

    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfigWithOptions(DeleteSpecificStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSpecificStagingConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSpecificStagingConfigResponse());
    }

    public DeleteSpecificStagingConfigResponse deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpecificStagingConfigWithOptions(request, runtime);
    }

    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTaskWithOptions(DeleteUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUsageDetailDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUsageDetailDataExportTaskResponse());
    }

    public DeleteUsageDetailDataExportTaskResponse deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTaskWithOptions(DeleteUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserUsageDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserUsageDataExportTaskResponse());
    }

    public DeleteUserUsageDataExportTaskResponse deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DescribeActiveVersionOfConfigGroupResponse describeActiveVersionOfConfigGroupWithOptions(DescribeActiveVersionOfConfigGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveVersionOfConfigGroup", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeActiveVersionOfConfigGroupResponse());
    }

    public DescribeActiveVersionOfConfigGroupResponse describeActiveVersionOfConfigGroup(DescribeActiveVersionOfConfigGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveVersionOfConfigGroupWithOptions(request, runtime);
    }

    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetailWithOptions(DescribeCdnCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnCertificateDetail", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnCertificateDetailResponse());
    }

    public DescribeCdnCertificateDetailResponse describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnCertificateDetailWithOptions(request, runtime);
    }

    public DescribeCdnCertificateListResponse describeCdnCertificateListWithOptions(DescribeCdnCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnCertificateList", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnCertificateListResponse());
    }

    public DescribeCdnCertificateListResponse describeCdnCertificateList(DescribeCdnCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnCertificateListWithOptions(request, runtime);
    }

    public DescribeCdnDeliverListResponse describeCdnDeliverListWithOptions(DescribeCdnDeliverListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDeliverList", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDeliverListResponse());
    }

    public DescribeCdnDeliverListResponse describeCdnDeliverList(DescribeCdnDeliverListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDeliverListWithOptions(request, runtime);
    }

    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificateWithOptions(DescribeCdnDomainByCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDomainByCertificate", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDomainByCertificateResponse());
    }

    public DescribeCdnDomainByCertificateResponse describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainByCertificateWithOptions(request, runtime);
    }

    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigsWithOptions(DescribeCdnDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDomainConfigs", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDomainConfigsResponse());
    }

    public DescribeCdnDomainConfigsResponse describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainConfigsWithOptions(request, runtime);
    }

    public DescribeCdnDomainDetailResponse describeCdnDomainDetailWithOptions(DescribeCdnDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDomainDetail", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDomainDetailResponse());
    }

    public DescribeCdnDomainDetailResponse describeCdnDomainDetail(DescribeCdnDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainDetailWithOptions(request, runtime);
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogsWithOptions(DescribeCdnDomainLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDomainLogs", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDomainLogsResponse());
    }

    public DescribeCdnDomainLogsResponse describeCdnDomainLogs(DescribeCdnDomainLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainLogsWithOptions(request, runtime);
    }

    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfigWithOptions(DescribeCdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnDomainStagingConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnDomainStagingConfigResponse());
    }

    public DescribeCdnDomainStagingConfigResponse describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnDomainStagingConfigWithOptions(request, runtime);
    }

    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainListWithOptions(DescribeCdnHttpsDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnHttpsDomainList", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnHttpsDomainListResponse());
    }

    public DescribeCdnHttpsDomainListResponse describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnHttpsDomainListWithOptions(request, runtime);
    }

    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIspWithOptions(DescribeCdnRegionAndIspRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnRegionAndIsp", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnRegionAndIspResponse());
    }

    public DescribeCdnRegionAndIspResponse describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnRegionAndIspWithOptions(request, runtime);
    }

    public DescribeCdnReportResponse describeCdnReportWithOptions(DescribeCdnReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnReport", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnReportResponse());
    }

    public DescribeCdnReportResponse describeCdnReport(DescribeCdnReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnReportWithOptions(request, runtime);
    }

    public DescribeCdnReportListResponse describeCdnReportListWithOptions(DescribeCdnReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnReportList", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnReportListResponse());
    }

    public DescribeCdnReportListResponse describeCdnReportList(DescribeCdnReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnReportListWithOptions(request, runtime);
    }

    public DescribeCdnServiceResponse describeCdnServiceWithOptions(DescribeCdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnService", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnServiceResponse());
    }

    public DescribeCdnServiceResponse describeCdnService(DescribeCdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnServiceWithOptions(request, runtime);
    }

    public DescribeCdnSubListResponse describeCdnSubListWithOptions(DescribeCdnSubListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnSubList", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnSubListResponse());
    }

    public DescribeCdnSubListResponse describeCdnSubList(DescribeCdnSubListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnSubListWithOptions(request, runtime);
    }

    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistoryWithOptions(DescribeCdnUserBillHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserBillHistory", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserBillHistoryResponse());
    }

    public DescribeCdnUserBillHistoryResponse describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillHistoryWithOptions(request, runtime);
    }

    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPredictionWithOptions(DescribeCdnUserBillPredictionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserBillPrediction", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserBillPredictionResponse());
    }

    public DescribeCdnUserBillPredictionResponse describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillPredictionWithOptions(request, runtime);
    }

    public DescribeCdnUserBillTypeResponse describeCdnUserBillTypeWithOptions(DescribeCdnUserBillTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserBillType", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserBillTypeResponse());
    }

    public DescribeCdnUserBillTypeResponse describeCdnUserBillType(DescribeCdnUserBillTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserBillTypeWithOptions(request, runtime);
    }

    public DescribeCdnUserConfigsResponse describeCdnUserConfigsWithOptions(DescribeCdnUserConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserConfigs", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserConfigsResponse());
    }

    public DescribeCdnUserConfigsResponse describeCdnUserConfigs(DescribeCdnUserConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserConfigsWithOptions(request, runtime);
    }

    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFuncWithOptions(DescribeCdnUserDomainsByFuncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserDomainsByFunc", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserDomainsByFuncResponse());
    }

    public DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserDomainsByFuncWithOptions(request, runtime);
    }

    public DescribeCdnUserQuotaResponse describeCdnUserQuotaWithOptions(DescribeCdnUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserQuota", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserQuotaResponse());
    }

    public DescribeCdnUserQuotaResponse describeCdnUserQuota(DescribeCdnUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserQuotaWithOptions(request, runtime);
    }

    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackageWithOptions(DescribeCdnUserResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnUserResourcePackage", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnUserResourcePackageResponse());
    }

    public DescribeCdnUserResourcePackageResponse describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnUserResourcePackageWithOptions(request, runtime);
    }

    public DescribeCdnWafDomainResponse describeCdnWafDomainWithOptions(DescribeCdnWafDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCdnWafDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCdnWafDomainResponse());
    }

    public DescribeCdnWafDomainResponse describeCdnWafDomain(DescribeCdnWafDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCdnWafDomainWithOptions(request, runtime);
    }

    public DescribeCertificateInfoByIDResponse describeCertificateInfoByIDWithOptions(DescribeCertificateInfoByIDRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCertificateInfoByID", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeCertificateInfoByIDResponse());
    }

    public DescribeCertificateInfoByIDResponse describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCertificateInfoByIDWithOptions(request, runtime);
    }

    public DescribeConfigOfVersionResponse describeConfigOfVersionWithOptions(DescribeConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConfigOfVersion", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConfigOfVersionResponse());
    }

    public DescribeConfigOfVersionResponse describeConfigOfVersion(DescribeConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigOfVersionWithOptions(request, runtime);
    }

    public DescribeCustomLogConfigResponse describeCustomLogConfigWithOptions(DescribeCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomLogConfig", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeCustomLogConfigResponse());
    }

    public DescribeCustomLogConfigResponse describeCustomLogConfig(DescribeCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLogConfigWithOptions(request, runtime);
    }

    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTimeWithOptions(DescribeDomainAverageResponseTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainAverageResponseTime", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainAverageResponseTimeResponse());
    }

    public DescribeDomainAverageResponseTimeResponse describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainAverageResponseTimeWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataResponse describeDomainBpsDataWithOptions(DescribeDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainBpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainBpsDataResponse());
    }

    public DescribeDomainBpsDataResponse describeDomainBpsData(DescribeDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayerWithOptions(DescribeDomainBpsDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainBpsDataByLayer", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainBpsDataByLayerResponse());
    }

    public DescribeDomainBpsDataByLayerResponse describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStampWithOptions(DescribeDomainBpsDataByTimeStampRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainBpsDataByTimeStamp", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainBpsDataByTimeStampResponse());
    }

    public DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainBpsDataByTimeStampWithOptions(request, runtime);
    }

    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLogWithOptions(DescribeDomainCcActivityLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainCcActivityLog", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainCcActivityLogResponse());
    }

    public DescribeDomainCcActivityLogResponse describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCcActivityLogWithOptions(request, runtime);
    }

    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfoWithOptions(DescribeDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainCertificateInfo", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainCertificateInfoResponse());
    }

    public DescribeDomainCertificateInfoResponse describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfigWithOptions(DescribeDomainCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainCustomLogConfig", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainCustomLogConfigResponse());
    }

    public DescribeDomainCustomLogConfigResponse describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCustomLogConfigWithOptions(request, runtime);
    }

    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayerWithOptions(DescribeDomainDetailDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainDetailDataByLayer", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainDetailDataByLayerResponse());
    }

    public DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainDetailDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainFileSizeProportionDataResponse describeDomainFileSizeProportionDataWithOptions(DescribeDomainFileSizeProportionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainFileSizeProportionData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainFileSizeProportionDataResponse());
    }

    public DescribeDomainFileSizeProportionDataResponse describeDomainFileSizeProportionData(DescribeDomainFileSizeProportionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainFileSizeProportionDataWithOptions(request, runtime);
    }

    public DescribeDomainHitRateDataResponse describeDomainHitRateDataWithOptions(DescribeDomainHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainHitRateData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainHitRateDataResponse());
    }

    public DescribeDomainHitRateDataResponse describeDomainHitRateData(DescribeDomainHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeDataWithOptions(DescribeDomainHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainHttpCodeData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainHttpCodeDataResponse());
    }

    public DescribeDomainHttpCodeDataResponse describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayerWithOptions(DescribeDomainHttpCodeDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainHttpCodeDataByLayer", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainHttpCodeDataByLayerResponse());
    }

    public DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainHttpCodeDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainISPDataResponse describeDomainISPDataWithOptions(DescribeDomainISPDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainISPData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainISPDataResponse());
    }

    public DescribeDomainISPDataResponse describeDomainISPData(DescribeDomainISPDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainISPDataWithOptions(request, runtime);
    }

    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsDataWithOptions(DescribeDomainMax95BpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainMax95BpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainMax95BpsDataResponse());
    }

    public DescribeDomainMax95BpsDataResponse describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainMax95BpsDataWithOptions(request, runtime);
    }

    public DescribeDomainNamesOfVersionResponse describeDomainNamesOfVersionWithOptions(DescribeDomainNamesOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainNamesOfVersion", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainNamesOfVersionResponse());
    }

    public DescribeDomainNamesOfVersionResponse describeDomainNamesOfVersion(DescribeDomainNamesOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNamesOfVersionWithOptions(request, runtime);
    }

    public DescribeDomainPathDataResponse describeDomainPathDataWithOptions(DescribeDomainPathDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainPathData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainPathDataResponse());
    }

    public DescribeDomainPathDataResponse describeDomainPathData(DescribeDomainPathDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainPathDataWithOptions(request, runtime);
    }

    public DescribeDomainPvDataResponse describeDomainPvDataWithOptions(DescribeDomainPvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainPvData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainPvDataResponse());
    }

    public DescribeDomainPvDataResponse describeDomainPvData(DescribeDomainPvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainPvDataWithOptions(request, runtime);
    }

    public DescribeDomainQpsDataResponse describeDomainQpsDataWithOptions(DescribeDomainQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQpsDataResponse());
    }

    public DescribeDomainQpsDataResponse describeDomainQpsData(DescribeDomainQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayerWithOptions(DescribeDomainQpsDataByLayerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainQpsDataByLayer", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainQpsDataByLayerResponse());
    }

    public DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainQpsDataByLayerWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsDataWithOptions(DescribeDomainRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeBpsData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealTimeBpsDataResponse());
    }

    public DescribeDomainRealTimeBpsDataResponse describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateDataWithOptions(DescribeDomainRealTimeByteHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeByteHitRateData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealTimeByteHitRateDataResponse());
    }

    public DescribeDomainRealTimeByteHitRateDataResponse describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeByteHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailDataWithOptions(DescribeDomainRealTimeDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeDetailData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealTimeDetailDataResponse());
    }

    public DescribeDomainRealTimeDetailDataResponse describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeDetailDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeDataWithOptions(DescribeDomainRealTimeHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeHttpCodeData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeDomainRealTimeHttpCodeDataResponse describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDeliveryWithOptions(DescribeDomainRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealtimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealtimeLogDeliveryResponse());
    }

    public DescribeDomainRealtimeLogDeliveryResponse describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsDataWithOptions(DescribeDomainRealTimeQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeQpsData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealTimeQpsDataResponse());
    }

    public DescribeDomainRealTimeQpsDataResponse describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateDataWithOptions(DescribeDomainRealTimeReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeReqHitRateData", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDomainRealTimeReqHitRateDataResponse());
    }

    public DescribeDomainRealTimeReqHitRateDataResponse describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsDataWithOptions(DescribeDomainRealTimeSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeSrcBpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRealTimeSrcBpsDataResponse());
    }

    public DescribeDomainRealTimeSrcBpsDataResponse describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeDataWithOptions(DescribeDomainRealTimeSrcHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeSrcHttpCodeData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRealTimeSrcHttpCodeDataResponse());
    }

    public DescribeDomainRealTimeSrcHttpCodeDataResponse describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficDataWithOptions(DescribeDomainRealTimeSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeSrcTrafficData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRealTimeSrcTrafficDataResponse());
    }

    public DescribeDomainRealTimeSrcTrafficDataResponse describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficDataWithOptions(DescribeDomainRealTimeTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRealTimeTrafficData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRealTimeTrafficDataResponse());
    }

    public DescribeDomainRealTimeTrafficDataResponse describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainRegionDataResponse describeDomainRegionDataWithOptions(DescribeDomainRegionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRegionData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRegionDataResponse());
    }

    public DescribeDomainRegionDataResponse describeDomainRegionData(DescribeDomainRegionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateDataWithOptions(DescribeDomainReqHitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainReqHitRateData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainReqHitRateDataResponse());
    }

    public DescribeDomainReqHitRateDataResponse describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainReqHitRateDataWithOptions(request, runtime);
    }

    public DescribeDomainsBySourceResponse describeDomainsBySourceWithOptions(DescribeDomainsBySourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainsBySource", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsBySourceResponse());
    }

    public DescribeDomainsBySourceResponse describeDomainsBySource(DescribeDomainsBySourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsBySourceWithOptions(request, runtime);
    }

    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsDataWithOptions(DescribeDomainSrcBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSrcBpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSrcBpsDataResponse());
    }

    public DescribeDomainSrcBpsDataResponse describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcBpsDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeDataWithOptions(DescribeDomainSrcHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSrcHttpCodeData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSrcHttpCodeDataResponse());
    }

    public DescribeDomainSrcHttpCodeDataResponse describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsDataWithOptions(DescribeDomainSrcQpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSrcQpsData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSrcQpsDataResponse());
    }

    public DescribeDomainSrcQpsDataResponse describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcQpsDataWithOptions(request, runtime);
    }

    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisitWithOptions(DescribeDomainSrcTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSrcTopUrlVisit", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSrcTopUrlVisitResponse());
    }

    public DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficDataWithOptions(DescribeDomainSrcTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSrcTrafficData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSrcTrafficDataResponse());
    }

    public DescribeDomainSrcTrafficDataResponse describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSrcTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDayWithOptions(DescribeDomainsUsageByDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainsUsageByDay", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsUsageByDayResponse());
    }

    public DescribeDomainsUsageByDayResponse describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsUsageByDayWithOptions(request, runtime);
    }

    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisitWithOptions(DescribeDomainTopClientIpVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainTopClientIpVisit", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainTopClientIpVisitResponse());
    }

    public DescribeDomainTopClientIpVisitResponse describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopClientIpVisitWithOptions(request, runtime);
    }

    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisitWithOptions(DescribeDomainTopReferVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainTopReferVisit", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainTopReferVisitResponse());
    }

    public DescribeDomainTopReferVisitResponse describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopReferVisitWithOptions(request, runtime);
    }

    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisitWithOptions(DescribeDomainTopUrlVisitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainTopUrlVisit", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainTopUrlVisitResponse());
    }

    public DescribeDomainTopUrlVisitResponse describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTopUrlVisitWithOptions(request, runtime);
    }

    public DescribeDomainTrafficDataResponse describeDomainTrafficDataWithOptions(DescribeDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainTrafficData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainTrafficDataResponse());
    }

    public DescribeDomainTrafficDataResponse describeDomainTrafficData(DescribeDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeDomainUsageDataResponse describeDomainUsageDataWithOptions(DescribeDomainUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainUsageData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainUsageDataResponse());
    }

    public DescribeDomainUsageDataResponse describeDomainUsageData(DescribeDomainUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeDomainUvDataResponse describeDomainUvDataWithOptions(DescribeDomainUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainUvData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainUvDataResponse());
    }

    public DescribeDomainUvDataResponse describeDomainUvData(DescribeDomainUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainUvDataWithOptions(request, runtime);
    }

    public DescribeEsExceptionDataResponse describeEsExceptionDataWithOptions(DescribeEsExceptionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEsExceptionData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEsExceptionDataResponse());
    }

    public DescribeEsExceptionDataResponse describeEsExceptionData(DescribeEsExceptionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEsExceptionDataWithOptions(request, runtime);
    }

    public DescribeEsExecuteDataResponse describeEsExecuteDataWithOptions(DescribeEsExecuteDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEsExecuteData", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEsExecuteDataResponse());
    }

    public DescribeEsExecuteDataResponse describeEsExecuteData(DescribeEsExecuteDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEsExecuteDataWithOptions(request, runtime);
    }

    public DescribeFCTriggerResponse describeFCTriggerWithOptions(DescribeFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFCTrigger", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeFCTriggerResponse());
    }

    public DescribeFCTriggerResponse describeFCTrigger(DescribeFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFCTriggerWithOptions(request, runtime);
    }

    public DescribeIllegalUrlExportTaskResponse describeIllegalUrlExportTaskWithOptions(DescribeIllegalUrlExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIllegalUrlExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIllegalUrlExportTaskResponse());
    }

    public DescribeIllegalUrlExportTaskResponse describeIllegalUrlExportTask(DescribeIllegalUrlExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIllegalUrlExportTaskWithOptions(request, runtime);
    }

    public DescribeIpInfoResponse describeIpInfoWithOptions(DescribeIpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpInfo", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpInfoResponse());
    }

    public DescribeIpInfoResponse describeIpInfo(DescribeIpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpInfoWithOptions(request, runtime);
    }

    public DescribeL2VipsByDomainResponse describeL2VipsByDomainWithOptions(DescribeL2VipsByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeL2VipsByDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeL2VipsByDomainResponse());
    }

    public DescribeL2VipsByDomainResponse describeL2VipsByDomain(DescribeL2VipsByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeL2VipsByDomainWithOptions(request, runtime);
    }

    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspServiceWithOptions(DescribeRangeDataByLocateAndIspServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRangeDataByLocateAndIspService", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRangeDataByLocateAndIspServiceResponse());
    }

    public DescribeRangeDataByLocateAndIspServiceResponse describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRangeDataByLocateAndIspServiceWithOptions(request, runtime);
    }

    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAccWithOptions(DescribeRealtimeDeliveryAccRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRealtimeDeliveryAcc", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRealtimeDeliveryAccResponse());
    }

    public DescribeRealtimeDeliveryAccResponse describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRealtimeDeliveryAccWithOptions(request, runtime);
    }

    public DescribeRefreshQuotaResponse describeRefreshQuotaWithOptions(DescribeRefreshQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRefreshQuota", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRefreshQuotaResponse());
    }

    public DescribeRefreshQuotaResponse describeRefreshQuota(DescribeRefreshQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshQuotaWithOptions(request, runtime);
    }

    public DescribeRefreshTaskByIdResponse describeRefreshTaskByIdWithOptions(DescribeRefreshTaskByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRefreshTaskById", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRefreshTaskByIdResponse());
    }

    public DescribeRefreshTaskByIdResponse describeRefreshTaskById(DescribeRefreshTaskByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshTaskByIdWithOptions(request, runtime);
    }

    public DescribeRefreshTasksResponse describeRefreshTasksWithOptions(DescribeRefreshTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRefreshTasks", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRefreshTasksResponse());
    }

    public DescribeRefreshTasksResponse describeRefreshTasks(DescribeRefreshTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRefreshTasksWithOptions(request, runtime);
    }

    public DescribeStagingIpResponse describeStagingIpWithOptions(DescribeStagingIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStagingIp", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStagingIpResponse());
    }

    public DescribeStagingIpResponse describeStagingIp(DescribeStagingIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStagingIpWithOptions(request, runtime);
    }

    public DescribeTagResourcesResponse describeTagResourcesWithOptions(DescribeTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTagResources", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagResourcesResponse());
    }

    public DescribeTagResourcesResponse describeTagResources(DescribeTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagResourcesWithOptions(request, runtime);
    }

    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlowWithOptions(DescribeTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTopDomainsByFlow", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTopDomainsByFlowResponse());
    }

    public DescribeTopDomainsByFlowResponse describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCountWithOptions(DescribeUserCertificateExpireCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserCertificateExpireCount", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserCertificateExpireCountResponse());
    }

    public DescribeUserCertificateExpireCountResponse describeUserCertificateExpireCount(DescribeUserCertificateExpireCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserCertificateExpireCountWithOptions(request, runtime);
    }

    public DescribeUserConfigsResponse describeUserConfigsWithOptions(DescribeUserConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserConfigs", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserConfigsResponse());
    }

    public DescribeUserConfigsResponse describeUserConfigs(DescribeUserConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserConfigsWithOptions(request, runtime);
    }

    public DescribeUserDomainsResponse describeUserDomainsWithOptions(DescribeUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserDomains", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserDomainsResponse());
    }

    public DescribeUserDomainsResponse describeUserDomains(DescribeUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserDomainsWithOptions(request, runtime);
    }

    public DescribeUserTagsResponse describeUserTagsWithOptions(DescribeUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserTags", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserTagsResponse());
    }

    public DescribeUserTagsResponse describeUserTags(DescribeUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserTagsWithOptions(request, runtime);
    }

    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTaskWithOptions(DescribeUserUsageDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserUsageDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserUsageDataExportTaskResponse());
    }

    public DescribeUserUsageDataExportTaskResponse describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserUsageDataExportTaskWithOptions(request, runtime);
    }

    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTaskWithOptions(DescribeUserUsageDetailDataExportTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserUsageDetailDataExportTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserUsageDetailDataExportTaskResponse());
    }

    public DescribeUserUsageDetailDataExportTaskResponse describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserUsageDetailDataExportTaskWithOptions(request, runtime);
    }

    public DescribeUserVipsByDomainResponse describeUserVipsByDomainWithOptions(DescribeUserVipsByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserVipsByDomain", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeUserVipsByDomainResponse());
    }

    public DescribeUserVipsByDomainResponse describeUserVipsByDomain(DescribeUserVipsByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserVipsByDomainWithOptions(request, runtime);
    }

    public DescribeVerifyContentResponse describeVerifyContentWithOptions(DescribeVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVerifyContent", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVerifyContentResponse());
    }

    public DescribeVerifyContentResponse describeVerifyContent(DescribeVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVerifyContentWithOptions(request, runtime);
    }

    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDeliveryWithOptions(DisableRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableRealtimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new DisableRealtimeLogDeliveryResponse());
    }

    public DisableRealtimeLogDeliveryResponse disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDeliveryWithOptions(EnableRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableRealtimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new EnableRealtimeLogDeliveryResponse());
    }

    public EnableRealtimeLogDeliveryResponse enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigIdWithOptions(ListDomainsByLogConfigIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDomainsByLogConfigId", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ListDomainsByLogConfigIdResponse());
    }

    public ListDomainsByLogConfigIdResponse listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDomainsByLogConfigIdWithOptions(request, runtime);
    }

    public ListFCTriggerResponse listFCTriggerWithOptions(ListFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFCTrigger", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ListFCTriggerResponse());
    }

    public ListFCTriggerResponse listFCTrigger(ListFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFCTriggerWithOptions(request, runtime);
    }

    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomainsWithOptions(ListRealtimeLogDeliveryDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRealtimeLogDeliveryDomains", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ListRealtimeLogDeliveryDomainsResponse());
    }

    public ListRealtimeLogDeliveryDomainsResponse listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfosWithOptions(ListRealtimeLogDeliveryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRealtimeLogDeliveryInfos", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ListRealtimeLogDeliveryInfosResponse());
    }

    public ListRealtimeLogDeliveryInfosResponse listRealtimeLogDeliveryInfos(ListRealtimeLogDeliveryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public ListUserCustomLogConfigResponse listUserCustomLogConfigWithOptions(ListUserCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserCustomLogConfig", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ListUserCustomLogConfigResponse());
    }

    public ListUserCustomLogConfigResponse listUserCustomLogConfig(ListUserCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserCustomLogConfigWithOptions(request, runtime);
    }

    public ModifyCdnDomainResponse modifyCdnDomainWithOptions(ModifyCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCdnDomainResponse());
    }

    public ModifyCdnDomainResponse modifyCdnDomain(ModifyCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCdnDomainWithOptions(request, runtime);
    }

    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByPropertyWithOptions(ModifyCdnDomainSchdmByPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCdnDomainSchdmByProperty", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCdnDomainSchdmByPropertyResponse());
    }

    public ModifyCdnDomainSchdmByPropertyResponse modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCdnDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public ModifyDomainCustomLogConfigResponse modifyDomainCustomLogConfigWithOptions(ModifyDomainCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomainCustomLogConfig", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyDomainCustomLogConfigResponse());
    }

    public ModifyDomainCustomLogConfigResponse modifyDomainCustomLogConfig(ModifyDomainCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainCustomLogConfigWithOptions(request, runtime);
    }

    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDeliveryWithOptions(ModifyRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRealtimeLogDelivery", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyRealtimeLogDeliveryResponse());
    }

    public ModifyRealtimeLogDeliveryResponse modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ModifyUserCustomLogConfigResponse modifyUserCustomLogConfigWithOptions(ModifyUserCustomLogConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserCustomLogConfig", "2018-05-10", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyUserCustomLogConfigResponse());
    }

    public ModifyUserCustomLogConfigResponse modifyUserCustomLogConfig(ModifyUserCustomLogConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserCustomLogConfigWithOptions(request, runtime);
    }

    public OpenCdnServiceResponse openCdnServiceWithOptions(OpenCdnServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenCdnService", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new OpenCdnServiceResponse());
    }

    public OpenCdnServiceResponse openCdnService(OpenCdnServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openCdnServiceWithOptions(request, runtime);
    }

    public PublishStagingConfigToProductionResponse publishStagingConfigToProductionWithOptions(PublishStagingConfigToProductionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishStagingConfigToProduction", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new PublishStagingConfigToProductionResponse());
    }

    public PublishStagingConfigToProductionResponse publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishStagingConfigToProductionWithOptions(request, runtime);
    }

    public PushObjectCacheResponse pushObjectCacheWithOptions(PushObjectCacheRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushObjectCache", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new PushObjectCacheResponse());
    }

    public PushObjectCacheResponse pushObjectCache(PushObjectCacheRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushObjectCacheWithOptions(request, runtime);
    }

    public RefreshObjectCachesResponse refreshObjectCachesWithOptions(RefreshObjectCachesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshObjectCaches", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshObjectCachesResponse());
    }

    public RefreshObjectCachesResponse refreshObjectCaches(RefreshObjectCachesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshObjectCachesWithOptions(request, runtime);
    }

    public RollbackStagingConfigResponse rollbackStagingConfigWithOptions(RollbackStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackStagingConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackStagingConfigResponse());
    }

    public RollbackStagingConfigResponse rollbackStagingConfig(RollbackStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackStagingConfigWithOptions(request, runtime);
    }

    public SetCcConfigResponse setCcConfigWithOptions(SetCcConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCcConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetCcConfigResponse());
    }

    public SetCcConfigResponse setCcConfig(SetCcConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCcConfigWithOptions(request, runtime);
    }

    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificateWithOptions(SetCdnDomainCSRCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCdnDomainCSRCertificate", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetCdnDomainCSRCertificateResponse());
    }

    public SetCdnDomainCSRCertificateResponse setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCdnDomainCSRCertificateWithOptions(request, runtime);
    }

    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfigWithOptions(SetCdnDomainStagingConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCdnDomainStagingConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetCdnDomainStagingConfigResponse());
    }

    public SetCdnDomainStagingConfigResponse setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCdnDomainStagingConfigWithOptions(request, runtime);
    }

    public SetConfigOfVersionResponse setConfigOfVersionWithOptions(SetConfigOfVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetConfigOfVersion", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetConfigOfVersionResponse());
    }

    public SetConfigOfVersionResponse setConfigOfVersion(SetConfigOfVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setConfigOfVersionWithOptions(request, runtime);
    }

    public SetDomainGreenManagerConfigResponse setDomainGreenManagerConfigWithOptions(SetDomainGreenManagerConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainGreenManagerConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainGreenManagerConfigResponse());
    }

    public SetDomainGreenManagerConfigResponse setDomainGreenManagerConfig(SetDomainGreenManagerConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainGreenManagerConfigWithOptions(request, runtime);
    }

    public SetDomainServerCertificateResponse setDomainServerCertificateWithOptions(SetDomainServerCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainServerCertificate", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainServerCertificateResponse());
    }

    public SetDomainServerCertificateResponse setDomainServerCertificate(SetDomainServerCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainServerCertificateWithOptions(request, runtime);
    }

    public SetErrorPageConfigResponse setErrorPageConfigWithOptions(SetErrorPageConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetErrorPageConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetErrorPageConfigResponse());
    }

    public SetErrorPageConfigResponse setErrorPageConfig(SetErrorPageConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setErrorPageConfigWithOptions(request, runtime);
    }

    public SetFileCacheExpiredConfigResponse setFileCacheExpiredConfigWithOptions(SetFileCacheExpiredConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetFileCacheExpiredConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetFileCacheExpiredConfigResponse());
    }

    public SetFileCacheExpiredConfigResponse setFileCacheExpiredConfig(SetFileCacheExpiredConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setFileCacheExpiredConfigWithOptions(request, runtime);
    }

    public SetForceRedirectConfigResponse setForceRedirectConfigWithOptions(SetForceRedirectConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetForceRedirectConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetForceRedirectConfigResponse());
    }

    public SetForceRedirectConfigResponse setForceRedirectConfig(SetForceRedirectConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setForceRedirectConfigWithOptions(request, runtime);
    }

    public SetForwardSchemeConfigResponse setForwardSchemeConfigWithOptions(SetForwardSchemeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetForwardSchemeConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetForwardSchemeConfigResponse());
    }

    public SetForwardSchemeConfigResponse setForwardSchemeConfig(SetForwardSchemeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setForwardSchemeConfigWithOptions(request, runtime);
    }

    public SetHttpErrorPageConfigResponse setHttpErrorPageConfigWithOptions(SetHttpErrorPageConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetHttpErrorPageConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetHttpErrorPageConfigResponse());
    }

    public SetHttpErrorPageConfigResponse setHttpErrorPageConfig(SetHttpErrorPageConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpErrorPageConfigWithOptions(request, runtime);
    }

    public SetHttpHeaderConfigResponse setHttpHeaderConfigWithOptions(SetHttpHeaderConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetHttpHeaderConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetHttpHeaderConfigResponse());
    }

    public SetHttpHeaderConfigResponse setHttpHeaderConfig(SetHttpHeaderConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpHeaderConfigWithOptions(request, runtime);
    }

    public SetHttpsOptionConfigResponse setHttpsOptionConfigWithOptions(SetHttpsOptionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetHttpsOptionConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetHttpsOptionConfigResponse());
    }

    public SetHttpsOptionConfigResponse setHttpsOptionConfig(SetHttpsOptionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setHttpsOptionConfigWithOptions(request, runtime);
    }

    public SetIgnoreQueryStringConfigResponse setIgnoreQueryStringConfigWithOptions(SetIgnoreQueryStringConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetIgnoreQueryStringConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetIgnoreQueryStringConfigResponse());
    }

    public SetIgnoreQueryStringConfigResponse setIgnoreQueryStringConfig(SetIgnoreQueryStringConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIgnoreQueryStringConfigWithOptions(request, runtime);
    }

    public SetIpAllowListConfigResponse setIpAllowListConfigWithOptions(SetIpAllowListConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetIpAllowListConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetIpAllowListConfigResponse());
    }

    public SetIpAllowListConfigResponse setIpAllowListConfig(SetIpAllowListConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIpAllowListConfigWithOptions(request, runtime);
    }

    public SetIpBlackListConfigResponse setIpBlackListConfigWithOptions(SetIpBlackListConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetIpBlackListConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetIpBlackListConfigResponse());
    }

    public SetIpBlackListConfigResponse setIpBlackListConfig(SetIpBlackListConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setIpBlackListConfigWithOptions(request, runtime);
    }

    public SetOptimizeConfigResponse setOptimizeConfigWithOptions(SetOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetOptimizeConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetOptimizeConfigResponse());
    }

    public SetOptimizeConfigResponse setOptimizeConfig(SetOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOptimizeConfigWithOptions(request, runtime);
    }

    public SetPageCompressConfigResponse setPageCompressConfigWithOptions(SetPageCompressConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetPageCompressConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetPageCompressConfigResponse());
    }

    public SetPageCompressConfigResponse setPageCompressConfig(SetPageCompressConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPageCompressConfigWithOptions(request, runtime);
    }

    public SetRangeConfigResponse setRangeConfigWithOptions(SetRangeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRangeConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetRangeConfigResponse());
    }

    public SetRangeConfigResponse setRangeConfig(SetRangeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRangeConfigWithOptions(request, runtime);
    }

    public SetRefererConfigResponse setRefererConfigWithOptions(SetRefererConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRefererConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetRefererConfigResponse());
    }

    public SetRefererConfigResponse setRefererConfig(SetRefererConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRefererConfigWithOptions(request, runtime);
    }

    public SetRemoveQueryStringConfigResponse setRemoveQueryStringConfigWithOptions(SetRemoveQueryStringConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRemoveQueryStringConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetRemoveQueryStringConfigResponse());
    }

    public SetRemoveQueryStringConfigResponse setRemoveQueryStringConfig(SetRemoveQueryStringConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRemoveQueryStringConfigWithOptions(request, runtime);
    }

    public SetReqAuthConfigResponse setReqAuthConfigWithOptions(SetReqAuthConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetReqAuthConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetReqAuthConfigResponse());
    }

    public SetReqAuthConfigResponse setReqAuthConfig(SetReqAuthConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setReqAuthConfigWithOptions(request, runtime);
    }

    public SetReqHeaderConfigResponse setReqHeaderConfigWithOptions(SetReqHeaderConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetReqHeaderConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetReqHeaderConfigResponse());
    }

    public SetReqHeaderConfigResponse setReqHeaderConfig(SetReqHeaderConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setReqHeaderConfigWithOptions(request, runtime);
    }

    public SetSourceHostConfigResponse setSourceHostConfigWithOptions(SetSourceHostConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetSourceHostConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetSourceHostConfigResponse());
    }

    public SetSourceHostConfigResponse setSourceHostConfig(SetSourceHostConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSourceHostConfigWithOptions(request, runtime);
    }

    public SetWaitingRoomConfigResponse setWaitingRoomConfigWithOptions(SetWaitingRoomConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetWaitingRoomConfig", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new SetWaitingRoomConfigResponse());
    }

    public SetWaitingRoomConfigResponse setWaitingRoomConfig(SetWaitingRoomConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setWaitingRoomConfigWithOptions(request, runtime);
    }

    public StartCdnDomainResponse startCdnDomainWithOptions(StartCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new StartCdnDomainResponse());
    }

    public StartCdnDomainResponse startCdnDomain(StartCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCdnDomainWithOptions(request, runtime);
    }

    public StopCdnDomainResponse stopCdnDomainWithOptions(StopCdnDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopCdnDomain", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new StopCdnDomainResponse());
    }

    public StopCdnDomainResponse stopCdnDomain(StopCdnDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCdnDomainWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateCdnDeliverTaskResponse updateCdnDeliverTaskWithOptions(UpdateCdnDeliverTaskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCdnDeliverTaskShrinkRequest request = new UpdateCdnDeliverTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deliver)) {
            request.deliverShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deliver, "Deliver", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedule)) {
            request.scheduleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedule, "Schedule", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCdnDeliverTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCdnDeliverTaskResponse());
    }

    public UpdateCdnDeliverTaskResponse updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCdnDeliverTaskWithOptions(request, runtime);
    }

    public UpdateCdnSubTaskResponse updateCdnSubTaskWithOptions(UpdateCdnSubTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCdnSubTask", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCdnSubTaskResponse());
    }

    public UpdateCdnSubTaskResponse updateCdnSubTask(UpdateCdnSubTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCdnSubTaskWithOptions(request, runtime);
    }

    public UpdateFCTriggerResponse updateFCTriggerWithOptions(UpdateFCTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFCTrigger", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFCTriggerResponse());
    }

    public UpdateFCTriggerResponse updateFCTrigger(UpdateFCTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFCTriggerWithOptions(request, runtime);
    }

    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyDomainOwner", "2018-05-10", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyDomainOwnerResponse());
    }

    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }
}
