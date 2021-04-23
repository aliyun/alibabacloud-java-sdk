// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101;

import com.aliyun.tea.*;
import com.aliyun.live20161101.models.*;
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
            new TeaPair("cn-qingdao", "live.aliyuncs.com"),
            new TeaPair("cn-beijing", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "live.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "live.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "live.aliyuncs.com"),
            new TeaPair("eu-central-1", "live.aliyuncs.com"),
            new TeaPair("ap-south-1", "live.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "live.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "live.aliyuncs.com"),
            new TeaPair("cn-chengdu", "live.aliyuncs.com"),
            new TeaPair("cn-edge-1", "live.aliyuncs.com"),
            new TeaPair("cn-fujian", "live.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "live.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "live.aliyuncs.com"),
            new TeaPair("cn-hongkong", "live.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "live.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "live.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "live.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "live.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "live.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "live.aliyuncs.com"),
            new TeaPair("cn-wuhan", "live.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "live.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "live.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "live.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "live.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "live.aliyuncs.com"),
            new TeaPair("eu-west-1", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "live.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "live.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("live", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddCasterComponentResponse addCasterComponentWithOptions(AddCasterComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterComponent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterComponentResponse());
    }

    public AddCasterComponentResponse addCasterComponent(AddCasterComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterComponentWithOptions(request, runtime);
    }

    public AddCasterEpisodeResponse addCasterEpisodeWithOptions(AddCasterEpisodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterEpisode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterEpisodeResponse());
    }

    public AddCasterEpisodeResponse addCasterEpisode(AddCasterEpisodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterEpisodeWithOptions(request, runtime);
    }

    public AddCasterEpisodeGroupResponse addCasterEpisodeGroupWithOptions(AddCasterEpisodeGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterEpisodeGroup", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterEpisodeGroupResponse());
    }

    public AddCasterEpisodeGroupResponse addCasterEpisodeGroup(AddCasterEpisodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterEpisodeGroupWithOptions(request, runtime);
    }

    public AddCasterEpisodeGroupContentResponse addCasterEpisodeGroupContentWithOptions(AddCasterEpisodeGroupContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterEpisodeGroupContent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterEpisodeGroupContentResponse());
    }

    public AddCasterEpisodeGroupContentResponse addCasterEpisodeGroupContent(AddCasterEpisodeGroupContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterEpisodeGroupContentWithOptions(request, runtime);
    }

    public AddCasterLayoutResponse addCasterLayoutWithOptions(AddCasterLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterLayoutResponse());
    }

    public AddCasterLayoutResponse addCasterLayout(AddCasterLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterLayoutWithOptions(request, runtime);
    }

    public AddCasterProgramResponse addCasterProgramWithOptions(AddCasterProgramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterProgram", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterProgramResponse());
    }

    public AddCasterProgramResponse addCasterProgram(AddCasterProgramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterProgramWithOptions(request, runtime);
    }

    public AddCasterVideoResourceResponse addCasterVideoResourceWithOptions(AddCasterVideoResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCasterVideoResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCasterVideoResourceResponse());
    }

    public AddCasterVideoResourceResponse addCasterVideoResource(AddCasterVideoResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCasterVideoResourceWithOptions(request, runtime);
    }

    public AddCustomLiveStreamTranscodeResponse addCustomLiveStreamTranscodeWithOptions(AddCustomLiveStreamTranscodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCustomLiveStreamTranscode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddCustomLiveStreamTranscodeResponse());
    }

    public AddCustomLiveStreamTranscodeResponse addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCustomLiveStreamTranscodeWithOptions(request, runtime);
    }

    public AddDRMCertificateResponse addDRMCertificateWithOptions(AddDRMCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDRMCertificate", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddDRMCertificateResponse());
    }

    public AddDRMCertificateResponse addDRMCertificate(AddDRMCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDRMCertificateWithOptions(request, runtime);
    }

    public AddLiveAppRecordConfigResponse addLiveAppRecordConfigWithOptions(AddLiveAppRecordConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveAppRecordConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveAppRecordConfigResponse());
    }

    public AddLiveAppRecordConfigResponse addLiveAppRecordConfig(AddLiveAppRecordConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveAppRecordConfigWithOptions(request, runtime);
    }

    public AddLiveAppSnapshotConfigResponse addLiveAppSnapshotConfigWithOptions(AddLiveAppSnapshotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveAppSnapshotConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveAppSnapshotConfigResponse());
    }

    public AddLiveAppSnapshotConfigResponse addLiveAppSnapshotConfig(AddLiveAppSnapshotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveAppSnapshotConfigWithOptions(request, runtime);
    }

    public AddLiveASRConfigResponse addLiveASRConfigWithOptions(AddLiveASRConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveASRConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveASRConfigResponse());
    }

    public AddLiveASRConfigResponse addLiveASRConfig(AddLiveASRConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveASRConfigWithOptions(request, runtime);
    }

    public AddLiveAudioAuditConfigResponse addLiveAudioAuditConfigWithOptions(AddLiveAudioAuditConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveAudioAuditConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveAudioAuditConfigResponse());
    }

    public AddLiveAudioAuditConfigResponse addLiveAudioAuditConfig(AddLiveAudioAuditConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public AddLiveAudioAuditNotifyConfigResponse addLiveAudioAuditNotifyConfigWithOptions(AddLiveAudioAuditNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveAudioAuditNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveAudioAuditNotifyConfigResponse());
    }

    public AddLiveAudioAuditNotifyConfigResponse addLiveAudioAuditNotifyConfig(AddLiveAudioAuditNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public AddLiveDetectNotifyConfigResponse addLiveDetectNotifyConfigWithOptions(AddLiveDetectNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveDetectNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveDetectNotifyConfigResponse());
    }

    public AddLiveDetectNotifyConfigResponse addLiveDetectNotifyConfig(AddLiveDetectNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public AddLiveDomainResponse addLiveDomainWithOptions(AddLiveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveDomain", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveDomainResponse());
    }

    public AddLiveDomainResponse addLiveDomain(AddLiveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveDomainWithOptions(request, runtime);
    }

    public AddLiveDomainMappingResponse addLiveDomainMappingWithOptions(AddLiveDomainMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveDomainMapping", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveDomainMappingResponse());
    }

    public AddLiveDomainMappingResponse addLiveDomainMapping(AddLiveDomainMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveDomainMappingWithOptions(request, runtime);
    }

    public AddLiveDomainPlayMappingResponse addLiveDomainPlayMappingWithOptions(AddLiveDomainPlayMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveDomainPlayMapping", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveDomainPlayMappingResponse());
    }

    public AddLiveDomainPlayMappingResponse addLiveDomainPlayMapping(AddLiveDomainPlayMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveDomainPlayMappingWithOptions(request, runtime);
    }

    public AddLivePullStreamInfoConfigResponse addLivePullStreamInfoConfigWithOptions(AddLivePullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLivePullStreamInfoConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLivePullStreamInfoConfigResponse());
    }

    public AddLivePullStreamInfoConfigResponse addLivePullStreamInfoConfig(AddLivePullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLivePullStreamInfoConfigWithOptions(request, runtime);
    }

    public AddLiveRecordNotifyConfigResponse addLiveRecordNotifyConfigWithOptions(AddLiveRecordNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveRecordNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveRecordNotifyConfigResponse());
    }

    public AddLiveRecordNotifyConfigResponse addLiveRecordNotifyConfig(AddLiveRecordNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public AddLiveRecordVodConfigResponse addLiveRecordVodConfigWithOptions(AddLiveRecordVodConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveRecordVodConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveRecordVodConfigResponse());
    }

    public AddLiveRecordVodConfigResponse addLiveRecordVodConfig(AddLiveRecordVodConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveRecordVodConfigWithOptions(request, runtime);
    }

    public AddLiveSnapshotDetectPornConfigResponse addLiveSnapshotDetectPornConfigWithOptions(AddLiveSnapshotDetectPornConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveSnapshotDetectPornConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveSnapshotDetectPornConfigResponse());
    }

    public AddLiveSnapshotDetectPornConfigResponse addLiveSnapshotDetectPornConfig(AddLiveSnapshotDetectPornConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public AddLiveStreamTranscodeResponse addLiveStreamTranscodeWithOptions(AddLiveStreamTranscodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLiveStreamTranscode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddLiveStreamTranscodeResponse());
    }

    public AddLiveStreamTranscodeResponse addLiveStreamTranscode(AddLiveStreamTranscodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLiveStreamTranscodeWithOptions(request, runtime);
    }

    public AddMultiRateConfigResponse addMultiRateConfigWithOptions(AddMultiRateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMultiRateConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddMultiRateConfigResponse());
    }

    public AddMultiRateConfigResponse addMultiRateConfig(AddMultiRateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMultiRateConfigWithOptions(request, runtime);
    }

    public AddPlaylistItemsResponse addPlaylistItemsWithOptions(AddPlaylistItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPlaylistItems", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddPlaylistItemsResponse());
    }

    public AddPlaylistItemsResponse addPlaylistItems(AddPlaylistItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPlaylistItemsWithOptions(request, runtime);
    }

    public AddRtsLiveStreamTranscodeResponse addRtsLiveStreamTranscodeWithOptions(AddRtsLiveStreamTranscodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRtsLiveStreamTranscode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddRtsLiveStreamTranscodeResponse());
    }

    public AddRtsLiveStreamTranscodeResponse addRtsLiveStreamTranscode(AddRtsLiveStreamTranscodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRtsLiveStreamTranscodeWithOptions(request, runtime);
    }

    public AddStudioLayoutResponse addStudioLayoutWithOptions(AddStudioLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddStudioLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddStudioLayoutResponse());
    }

    public AddStudioLayoutResponse addStudioLayout(AddStudioLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addStudioLayoutWithOptions(request, runtime);
    }

    public AddTrancodeSEIResponse addTrancodeSEIWithOptions(AddTrancodeSEIRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTrancodeSEI", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddTrancodeSEIResponse());
    }

    public AddTrancodeSEIResponse addTrancodeSEI(AddTrancodeSEIRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTrancodeSEIWithOptions(request, runtime);
    }

    public AllowPushStreamResponse allowPushStreamWithOptions(AllowPushStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllowPushStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new AllowPushStreamResponse());
    }

    public AllowPushStreamResponse allowPushStream(AllowPushStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allowPushStreamWithOptions(request, runtime);
    }

    public ApplyBoardTokenResponse applyBoardTokenWithOptions(ApplyBoardTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyBoardToken", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyBoardTokenResponse());
    }

    public ApplyBoardTokenResponse applyBoardToken(ApplyBoardTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyBoardTokenWithOptions(request, runtime);
    }

    public ApplyRecordTokenResponse applyRecordTokenWithOptions(ApplyRecordTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyRecordToken", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyRecordTokenResponse());
    }

    public ApplyRecordTokenResponse applyRecordToken(ApplyRecordTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyRecordTokenWithOptions(request, runtime);
    }

    public BatchDeleteLiveDomainConfigsResponse batchDeleteLiveDomainConfigsWithOptions(BatchDeleteLiveDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteLiveDomainConfigs", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteLiveDomainConfigsResponse());
    }

    public BatchDeleteLiveDomainConfigsResponse batchDeleteLiveDomainConfigs(BatchDeleteLiveDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteLiveDomainConfigsWithOptions(request, runtime);
    }

    public BatchSetLiveDomainConfigsResponse batchSetLiveDomainConfigsWithOptions(BatchSetLiveDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetLiveDomainConfigs", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetLiveDomainConfigsResponse());
    }

    public BatchSetLiveDomainConfigsResponse batchSetLiveDomainConfigs(BatchSetLiveDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetLiveDomainConfigsWithOptions(request, runtime);
    }

    public CheckServiceForRoleResponse checkServiceForRoleWithOptions(CheckServiceForRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceForRole", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceForRoleResponse());
    }

    public CheckServiceForRoleResponse checkServiceForRole(CheckServiceForRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceForRoleWithOptions(request, runtime);
    }

    public CloseLiveShiftResponse closeLiveShiftWithOptions(CloseLiveShiftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseLiveShift", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CloseLiveShiftResponse());
    }

    public CloseLiveShiftResponse closeLiveShift(CloseLiveShiftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeLiveShiftWithOptions(request, runtime);
    }

    public CompleteBoardResponse completeBoardWithOptions(CompleteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteBoard", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteBoardResponse());
    }

    public CompleteBoardResponse completeBoard(CompleteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeBoardWithOptions(request, runtime);
    }

    public CompleteBoardRecordResponse completeBoardRecordWithOptions(CompleteBoardRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteBoardRecord", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteBoardRecordResponse());
    }

    public CompleteBoardRecordResponse completeBoardRecord(CompleteBoardRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeBoardRecordWithOptions(request, runtime);
    }

    public ControlHtmlResourceResponse controlHtmlResourceWithOptions(ControlHtmlResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ControlHtmlResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ControlHtmlResourceResponse());
    }

    public ControlHtmlResourceResponse controlHtmlResource(ControlHtmlResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.controlHtmlResourceWithOptions(request, runtime);
    }

    public CopyCasterResponse copyCasterWithOptions(CopyCasterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyCaster", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CopyCasterResponse());
    }

    public CopyCasterResponse copyCaster(CopyCasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyCasterWithOptions(request, runtime);
    }

    public CopyCasterSceneConfigResponse copyCasterSceneConfigWithOptions(CopyCasterSceneConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyCasterSceneConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CopyCasterSceneConfigResponse());
    }

    public CopyCasterSceneConfigResponse copyCasterSceneConfig(CopyCasterSceneConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyCasterSceneConfigWithOptions(request, runtime);
    }

    public CreateBoardResponse createBoardWithOptions(CreateBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBoard", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBoardResponse());
    }

    public CreateBoardResponse createBoard(CreateBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBoardWithOptions(request, runtime);
    }

    public CreateCasterResponse createCasterWithOptions(CreateCasterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCaster", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCasterResponse());
    }

    public CreateCasterResponse createCaster(CreateCasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCasterWithOptions(request, runtime);
    }

    public CreateLiveRealTimeLogDeliveryResponse createLiveRealTimeLogDeliveryWithOptions(CreateLiveRealTimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLiveRealTimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new CreateLiveRealTimeLogDeliveryResponse());
    }

    public CreateLiveRealTimeLogDeliveryResponse createLiveRealTimeLogDelivery(CreateLiveRealTimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFilesWithOptions(CreateLiveStreamRecordIndexFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLiveStreamRecordIndexFiles", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLiveStreamRecordIndexFilesResponse());
    }

    public CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveStreamRecordIndexFilesWithOptions(request, runtime);
    }

    public CreateMixStreamResponse createMixStreamWithOptions(CreateMixStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMixStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMixStreamResponse());
    }

    public CreateMixStreamResponse createMixStream(CreateMixStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMixStreamWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRoom", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public DeleteBoardResponse deleteBoardWithOptions(DeleteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBoard", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBoardResponse());
    }

    public DeleteBoardResponse deleteBoard(DeleteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBoardWithOptions(request, runtime);
    }

    public DeleteCasterResponse deleteCasterWithOptions(DeleteCasterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCaster", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterResponse());
    }

    public DeleteCasterResponse deleteCaster(DeleteCasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterWithOptions(request, runtime);
    }

    public DeleteCasterComponentResponse deleteCasterComponentWithOptions(DeleteCasterComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterComponent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterComponentResponse());
    }

    public DeleteCasterComponentResponse deleteCasterComponent(DeleteCasterComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterComponentWithOptions(request, runtime);
    }

    public DeleteCasterEpisodeResponse deleteCasterEpisodeWithOptions(DeleteCasterEpisodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterEpisode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterEpisodeResponse());
    }

    public DeleteCasterEpisodeResponse deleteCasterEpisode(DeleteCasterEpisodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterEpisodeWithOptions(request, runtime);
    }

    public DeleteCasterEpisodeGroupResponse deleteCasterEpisodeGroupWithOptions(DeleteCasterEpisodeGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterEpisodeGroup", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterEpisodeGroupResponse());
    }

    public DeleteCasterEpisodeGroupResponse deleteCasterEpisodeGroup(DeleteCasterEpisodeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterEpisodeGroupWithOptions(request, runtime);
    }

    public DeleteCasterLayoutResponse deleteCasterLayoutWithOptions(DeleteCasterLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterLayoutResponse());
    }

    public DeleteCasterLayoutResponse deleteCasterLayout(DeleteCasterLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterLayoutWithOptions(request, runtime);
    }

    public DeleteCasterProgramResponse deleteCasterProgramWithOptions(DeleteCasterProgramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterProgram", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterProgramResponse());
    }

    public DeleteCasterProgramResponse deleteCasterProgram(DeleteCasterProgramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterProgramWithOptions(request, runtime);
    }

    public DeleteCasterSceneConfigResponse deleteCasterSceneConfigWithOptions(DeleteCasterSceneConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterSceneConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterSceneConfigResponse());
    }

    public DeleteCasterSceneConfigResponse deleteCasterSceneConfig(DeleteCasterSceneConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterSceneConfigWithOptions(request, runtime);
    }

    public DeleteCasterVideoResourceResponse deleteCasterVideoResourceWithOptions(DeleteCasterVideoResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCasterVideoResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCasterVideoResourceResponse());
    }

    public DeleteCasterVideoResourceResponse deleteCasterVideoResource(DeleteCasterVideoResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCasterVideoResourceWithOptions(request, runtime);
    }

    public DeleteHtmlResourceResponse deleteHtmlResourceWithOptions(DeleteHtmlResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHtmlResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHtmlResourceResponse());
    }

    public DeleteHtmlResourceResponse deleteHtmlResource(DeleteHtmlResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHtmlResourceWithOptions(request, runtime);
    }

    public DeleteLiveAppRecordConfigResponse deleteLiveAppRecordConfigWithOptions(DeleteLiveAppRecordConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveAppRecordConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveAppRecordConfigResponse());
    }

    public DeleteLiveAppRecordConfigResponse deleteLiveAppRecordConfig(DeleteLiveAppRecordConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveAppRecordConfigWithOptions(request, runtime);
    }

    public DeleteLiveAppSnapshotConfigResponse deleteLiveAppSnapshotConfigWithOptions(DeleteLiveAppSnapshotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveAppSnapshotConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveAppSnapshotConfigResponse());
    }

    public DeleteLiveAppSnapshotConfigResponse deleteLiveAppSnapshotConfig(DeleteLiveAppSnapshotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveAppSnapshotConfigWithOptions(request, runtime);
    }

    public DeleteLiveASRConfigResponse deleteLiveASRConfigWithOptions(DeleteLiveASRConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveASRConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveASRConfigResponse());
    }

    public DeleteLiveASRConfigResponse deleteLiveASRConfig(DeleteLiveASRConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveASRConfigWithOptions(request, runtime);
    }

    public DeleteLiveAudioAuditConfigResponse deleteLiveAudioAuditConfigWithOptions(DeleteLiveAudioAuditConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveAudioAuditConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveAudioAuditConfigResponse());
    }

    public DeleteLiveAudioAuditConfigResponse deleteLiveAudioAuditConfig(DeleteLiveAudioAuditConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public DeleteLiveAudioAuditNotifyConfigResponse deleteLiveAudioAuditNotifyConfigWithOptions(DeleteLiveAudioAuditNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveAudioAuditNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveAudioAuditNotifyConfigResponse());
    }

    public DeleteLiveAudioAuditNotifyConfigResponse deleteLiveAudioAuditNotifyConfig(DeleteLiveAudioAuditNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveDetectNotifyConfigResponse deleteLiveDetectNotifyConfigWithOptions(DeleteLiveDetectNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveDetectNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveDetectNotifyConfigResponse());
    }

    public DeleteLiveDetectNotifyConfigResponse deleteLiveDetectNotifyConfig(DeleteLiveDetectNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveDomainResponse deleteLiveDomainWithOptions(DeleteLiveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveDomain", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveDomainResponse());
    }

    public DeleteLiveDomainResponse deleteLiveDomain(DeleteLiveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveDomainWithOptions(request, runtime);
    }

    public DeleteLiveDomainMappingResponse deleteLiveDomainMappingWithOptions(DeleteLiveDomainMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveDomainMapping", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveDomainMappingResponse());
    }

    public DeleteLiveDomainMappingResponse deleteLiveDomainMapping(DeleteLiveDomainMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveDomainMappingWithOptions(request, runtime);
    }

    public DeleteLiveDomainPlayMappingResponse deleteLiveDomainPlayMappingWithOptions(DeleteLiveDomainPlayMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveDomainPlayMapping", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveDomainPlayMappingResponse());
    }

    public DeleteLiveDomainPlayMappingResponse deleteLiveDomainPlayMapping(DeleteLiveDomainPlayMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveDomainPlayMappingWithOptions(request, runtime);
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse deleteLiveLazyPullStreamInfoConfigWithOptions(DeleteLiveLazyPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveLazyPullStreamInfoConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveLazyPullStreamInfoConfigResponse());
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse deleteLiveLazyPullStreamInfoConfig(DeleteLiveLazyPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveLazyPullStreamInfoConfigWithOptions(request, runtime);
    }

    public DeleteLivePullStreamInfoConfigResponse deleteLivePullStreamInfoConfigWithOptions(DeleteLivePullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLivePullStreamInfoConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLivePullStreamInfoConfigResponse());
    }

    public DeleteLivePullStreamInfoConfigResponse deleteLivePullStreamInfoConfig(DeleteLivePullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLivePullStreamInfoConfigWithOptions(request, runtime);
    }

    public DeleteLiveRealtimeLogDeliveryResponse deleteLiveRealtimeLogDeliveryWithOptions(DeleteLiveRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteLiveRealtimeLogDeliveryResponse());
    }

    public DeleteLiveRealtimeLogDeliveryResponse deleteLiveRealtimeLogDelivery(DeleteLiveRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteLiveRealTimeLogLogstoreResponse deleteLiveRealTimeLogLogstoreWithOptions(DeleteLiveRealTimeLogLogstoreRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveRealTimeLogLogstore", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteLiveRealTimeLogLogstoreResponse());
    }

    public DeleteLiveRealTimeLogLogstoreResponse deleteLiveRealTimeLogLogstore(DeleteLiveRealTimeLogLogstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveRealTimeLogLogstoreWithOptions(request, runtime);
    }

    public DeleteLiveRecordNotifyConfigResponse deleteLiveRecordNotifyConfigWithOptions(DeleteLiveRecordNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveRecordNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveRecordNotifyConfigResponse());
    }

    public DeleteLiveRecordNotifyConfigResponse deleteLiveRecordNotifyConfig(DeleteLiveRecordNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveRecordVodConfigResponse deleteLiveRecordVodConfigWithOptions(DeleteLiveRecordVodConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveRecordVodConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveRecordVodConfigResponse());
    }

    public DeleteLiveRecordVodConfigResponse deleteLiveRecordVodConfig(DeleteLiveRecordVodConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveRecordVodConfigWithOptions(request, runtime);
    }

    public DeleteLiveSnapshotDetectPornConfigResponse deleteLiveSnapshotDetectPornConfigWithOptions(DeleteLiveSnapshotDetectPornConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveSnapshotDetectPornConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveSnapshotDetectPornConfigResponse());
    }

    public DeleteLiveSnapshotDetectPornConfigResponse deleteLiveSnapshotDetectPornConfig(DeleteLiveSnapshotDetectPornConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse deleteLiveStreamsNotifyUrlConfigWithOptions(DeleteLiveStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveStreamsNotifyUrlConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveStreamsNotifyUrlConfigResponse());
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse deleteLiveStreamsNotifyUrlConfig(DeleteLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public DeleteLiveStreamTranscodeResponse deleteLiveStreamTranscodeWithOptions(DeleteLiveStreamTranscodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLiveStreamTranscode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveStreamTranscodeResponse());
    }

    public DeleteLiveStreamTranscodeResponse deleteLiveStreamTranscode(DeleteLiveStreamTranscodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveStreamTranscodeWithOptions(request, runtime);
    }

    public DeleteMixStreamResponse deleteMixStreamWithOptions(DeleteMixStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMixStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMixStreamResponse());
    }

    public DeleteMixStreamResponse deleteMixStream(DeleteMixStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMixStreamWithOptions(request, runtime);
    }

    public DeleteMultiRateConfigResponse deleteMultiRateConfigWithOptions(DeleteMultiRateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMultiRateConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMultiRateConfigResponse());
    }

    public DeleteMultiRateConfigResponse deleteMultiRateConfig(DeleteMultiRateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMultiRateConfigWithOptions(request, runtime);
    }

    public DeletePlaylistResponse deletePlaylistWithOptions(DeletePlaylistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePlaylist", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePlaylistResponse());
    }

    public DeletePlaylistResponse deletePlaylist(DeletePlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePlaylistWithOptions(request, runtime);
    }

    public DeletePlaylistItemsResponse deletePlaylistItemsWithOptions(DeletePlaylistItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePlaylistItems", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePlaylistItemsResponse());
    }

    public DeletePlaylistItemsResponse deletePlaylistItems(DeletePlaylistItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePlaylistItemsWithOptions(request, runtime);
    }

    public DeleteRoomResponse deleteRoomWithOptions(DeleteRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRoom", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRoomResponse());
    }

    public DeleteRoomResponse deleteRoom(DeleteRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoomWithOptions(request, runtime);
    }

    public DeleteStudioLayoutResponse deleteStudioLayoutWithOptions(DeleteStudioLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStudioLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStudioLayoutResponse());
    }

    public DeleteStudioLayoutResponse deleteStudioLayout(DeleteStudioLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStudioLayoutWithOptions(request, runtime);
    }

    public DescribeBoardEventsResponse describeBoardEventsWithOptions(DescribeBoardEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBoardEvents", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBoardEventsResponse());
    }

    public DescribeBoardEventsResponse describeBoardEvents(DescribeBoardEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBoardEventsWithOptions(request, runtime);
    }

    public DescribeBoardsResponse describeBoardsWithOptions(DescribeBoardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBoards", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBoardsResponse());
    }

    public DescribeBoardsResponse describeBoards(DescribeBoardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBoardsWithOptions(request, runtime);
    }

    public DescribeBoardSnapshotResponse describeBoardSnapshotWithOptions(DescribeBoardSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBoardSnapshot", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBoardSnapshotResponse());
    }

    public DescribeBoardSnapshotResponse describeBoardSnapshot(DescribeBoardSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBoardSnapshotWithOptions(request, runtime);
    }

    public DescribeCasterChannelsResponse describeCasterChannelsWithOptions(DescribeCasterChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterChannels", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterChannelsResponse());
    }

    public DescribeCasterChannelsResponse describeCasterChannels(DescribeCasterChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterChannelsWithOptions(request, runtime);
    }

    public DescribeCasterComponentsResponse describeCasterComponentsWithOptions(DescribeCasterComponentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterComponents", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterComponentsResponse());
    }

    public DescribeCasterComponentsResponse describeCasterComponents(DescribeCasterComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterComponentsWithOptions(request, runtime);
    }

    public DescribeCasterConfigResponse describeCasterConfigWithOptions(DescribeCasterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterConfigResponse());
    }

    public DescribeCasterConfigResponse describeCasterConfig(DescribeCasterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterConfigWithOptions(request, runtime);
    }

    public DescribeCasterLayoutsResponse describeCasterLayoutsWithOptions(DescribeCasterLayoutsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterLayouts", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterLayoutsResponse());
    }

    public DescribeCasterLayoutsResponse describeCasterLayouts(DescribeCasterLayoutsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterLayoutsWithOptions(request, runtime);
    }

    public DescribeCasterProgramResponse describeCasterProgramWithOptions(DescribeCasterProgramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterProgram", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterProgramResponse());
    }

    public DescribeCasterProgramResponse describeCasterProgram(DescribeCasterProgramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterProgramWithOptions(request, runtime);
    }

    public DescribeCasterRtcInfoResponse describeCasterRtcInfoWithOptions(DescribeCasterRtcInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterRtcInfo", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterRtcInfoResponse());
    }

    public DescribeCasterRtcInfoResponse describeCasterRtcInfo(DescribeCasterRtcInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterRtcInfoWithOptions(request, runtime);
    }

    public DescribeCastersResponse describeCastersWithOptions(DescribeCastersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasters", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCastersResponse());
    }

    public DescribeCastersResponse describeCasters(DescribeCastersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCastersWithOptions(request, runtime);
    }

    public DescribeCasterSceneAudioResponse describeCasterSceneAudioWithOptions(DescribeCasterSceneAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterSceneAudio", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterSceneAudioResponse());
    }

    public DescribeCasterSceneAudioResponse describeCasterSceneAudio(DescribeCasterSceneAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterSceneAudioWithOptions(request, runtime);
    }

    public DescribeCasterScenesResponse describeCasterScenesWithOptions(DescribeCasterScenesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterScenes", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterScenesResponse());
    }

    public DescribeCasterScenesResponse describeCasterScenes(DescribeCasterScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterScenesWithOptions(request, runtime);
    }

    public DescribeCasterStreamUrlResponse describeCasterStreamUrlWithOptions(DescribeCasterStreamUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterStreamUrl", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterStreamUrlResponse());
    }

    public DescribeCasterStreamUrlResponse describeCasterStreamUrl(DescribeCasterStreamUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterStreamUrlWithOptions(request, runtime);
    }

    public DescribeCasterSyncGroupResponse describeCasterSyncGroupWithOptions(DescribeCasterSyncGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterSyncGroup", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterSyncGroupResponse());
    }

    public DescribeCasterSyncGroupResponse describeCasterSyncGroup(DescribeCasterSyncGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterSyncGroupWithOptions(request, runtime);
    }

    public DescribeCasterVideoResourcesResponse describeCasterVideoResourcesWithOptions(DescribeCasterVideoResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCasterVideoResources", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCasterVideoResourcesResponse());
    }

    public DescribeCasterVideoResourcesResponse describeCasterVideoResources(DescribeCasterVideoResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCasterVideoResourcesWithOptions(request, runtime);
    }

    public DescribeDomainUsageDataResponse describeDomainUsageDataWithOptions(DescribeDomainUsageDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainUsageData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainUsageDataResponse());
    }

    public DescribeDomainUsageDataResponse describeDomainUsageData(DescribeDomainUsageDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainUsageDataWithOptions(request, runtime);
    }

    public DescribeDRMCertListResponse describeDRMCertListWithOptions(DescribeDRMCertListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDRMCertList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDRMCertListResponse());
    }

    public DescribeDRMCertListResponse describeDRMCertList(DescribeDRMCertListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDRMCertListWithOptions(request, runtime);
    }

    public DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomListWithOptions(DescribeForbidPushStreamRoomListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeForbidPushStreamRoomList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeForbidPushStreamRoomListResponse());
    }

    public DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomList(DescribeForbidPushStreamRoomListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeForbidPushStreamRoomListWithOptions(request, runtime);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse describeHlsLiveStreamRealTimeBpsDataWithOptions(DescribeHlsLiveStreamRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHlsLiveStreamRealTimeBpsData", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeHlsLiveStreamRealTimeBpsDataResponse());
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse describeHlsLiveStreamRealTimeBpsData(DescribeHlsLiveStreamRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHlsLiveStreamRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeHtmlResourceResponse describeHtmlResourceWithOptions(DescribeHtmlResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHtmlResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHtmlResourceResponse());
    }

    public DescribeHtmlResourceResponse describeHtmlResource(DescribeHtmlResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHtmlResourceWithOptions(request, runtime);
    }

    public DescribeLiveAsrConfigResponse describeLiveAsrConfigWithOptions(DescribeLiveAsrConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveAsrConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveAsrConfigResponse());
    }

    public DescribeLiveAsrConfigResponse describeLiveAsrConfig(DescribeLiveAsrConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveAsrConfigWithOptions(request, runtime);
    }

    public DescribeLiveAudioAuditConfigResponse describeLiveAudioAuditConfigWithOptions(DescribeLiveAudioAuditConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveAudioAuditConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveAudioAuditConfigResponse());
    }

    public DescribeLiveAudioAuditConfigResponse describeLiveAudioAuditConfig(DescribeLiveAudioAuditConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public DescribeLiveAudioAuditNotifyConfigResponse describeLiveAudioAuditNotifyConfigWithOptions(DescribeLiveAudioAuditNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveAudioAuditNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveAudioAuditNotifyConfigResponse());
    }

    public DescribeLiveAudioAuditNotifyConfigResponse describeLiveAudioAuditNotifyConfig(DescribeLiveAudioAuditNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveCertificateDetailResponse describeLiveCertificateDetailWithOptions(DescribeLiveCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveCertificateDetail", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveCertificateDetailResponse());
    }

    public DescribeLiveCertificateDetailResponse describeLiveCertificateDetail(DescribeLiveCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveCertificateDetailWithOptions(request, runtime);
    }

    public DescribeLiveCertificateListResponse describeLiveCertificateListWithOptions(DescribeLiveCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveCertificateList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveCertificateListResponse());
    }

    public DescribeLiveCertificateListResponse describeLiveCertificateList(DescribeLiveCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveCertificateListWithOptions(request, runtime);
    }

    public DescribeLiveDetectNotifyConfigResponse describeLiveDetectNotifyConfigWithOptions(DescribeLiveDetectNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDetectNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDetectNotifyConfigResponse());
    }

    public DescribeLiveDetectNotifyConfigResponse describeLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveDetectPornDataResponse describeLiveDetectPornDataWithOptions(DescribeLiveDetectPornDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDetectPornData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDetectPornDataResponse());
    }

    public DescribeLiveDetectPornDataResponse describeLiveDetectPornData(DescribeLiveDetectPornDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDetectPornDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainBpsDataResponse describeLiveDomainBpsDataWithOptions(DescribeLiveDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainBpsData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainBpsDataResponse());
    }

    public DescribeLiveDomainBpsDataResponse describeLiveDomainBpsData(DescribeLiveDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse describeLiveDomainBpsDataByTimeStampWithOptions(DescribeLiveDomainBpsDataByTimeStampRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainBpsDataByTimeStamp", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainBpsDataByTimeStampResponse());
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse describeLiveDomainBpsDataByTimeStamp(DescribeLiveDomainBpsDataByTimeStampRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainBpsDataByTimeStampWithOptions(request, runtime);
    }

    public DescribeLiveDomainCertificateInfoResponse describeLiveDomainCertificateInfoWithOptions(DescribeLiveDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainCertificateInfo", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainCertificateInfoResponse());
    }

    public DescribeLiveDomainCertificateInfoResponse describeLiveDomainCertificateInfo(DescribeLiveDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeLiveDomainConfigsResponse describeLiveDomainConfigsWithOptions(DescribeLiveDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainConfigs", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainConfigsResponse());
    }

    public DescribeLiveDomainConfigsResponse describeLiveDomainConfigs(DescribeLiveDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainConfigsWithOptions(request, runtime);
    }

    public DescribeLiveDomainDetailResponse describeLiveDomainDetailWithOptions(DescribeLiveDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainDetail", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainDetailResponse());
    }

    public DescribeLiveDomainDetailResponse describeLiveDomainDetail(DescribeLiveDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainDetailWithOptions(request, runtime);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse describeLiveDomainFrameRateAndBitRateDataWithOptions(DescribeLiveDomainFrameRateAndBitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainFrameRateAndBitRateData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainFrameRateAndBitRateDataResponse());
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse describeLiveDomainFrameRateAndBitRateData(DescribeLiveDomainFrameRateAndBitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainFrameRateAndBitRateDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainLimitResponse describeLiveDomainLimitWithOptions(DescribeLiveDomainLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainLimit", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainLimitResponse());
    }

    public DescribeLiveDomainLimitResponse describeLiveDomainLimit(DescribeLiveDomainLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainLimitWithOptions(request, runtime);
    }

    public DescribeLiveDomainMappingResponse describeLiveDomainMappingWithOptions(DescribeLiveDomainMappingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainMapping", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLiveDomainMappingResponse());
    }

    public DescribeLiveDomainMappingResponse describeLiveDomainMapping(DescribeLiveDomainMappingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainMappingWithOptions(request, runtime);
    }

    public DescribeLiveDomainOnlineUserNumResponse describeLiveDomainOnlineUserNumWithOptions(DescribeLiveDomainOnlineUserNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainOnlineUserNum", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainOnlineUserNumResponse());
    }

    public DescribeLiveDomainOnlineUserNumResponse describeLiveDomainOnlineUserNum(DescribeLiveDomainOnlineUserNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainOnlineUserNumWithOptions(request, runtime);
    }

    public DescribeLiveDomainPushBpsDataResponse describeLiveDomainPushBpsDataWithOptions(DescribeLiveDomainPushBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainPushBpsData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainPushBpsDataResponse());
    }

    public DescribeLiveDomainPushBpsDataResponse describeLiveDomainPushBpsData(DescribeLiveDomainPushBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainPushBpsDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainPushTrafficDataResponse describeLiveDomainPushTrafficDataWithOptions(DescribeLiveDomainPushTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainPushTrafficData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainPushTrafficDataResponse());
    }

    public DescribeLiveDomainPushTrafficDataResponse describeLiveDomainPushTrafficData(DescribeLiveDomainPushTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainPushTrafficDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainPvUvDataResponse describeLiveDomainPvUvDataWithOptions(DescribeLiveDomainPvUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainPvUvData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainPvUvDataResponse());
    }

    public DescribeLiveDomainPvUvDataResponse describeLiveDomainPvUvData(DescribeLiveDomainPvUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainPvUvDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeBpsDataResponse describeLiveDomainRealTimeBpsDataWithOptions(DescribeLiveDomainRealTimeBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainRealTimeBpsData", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLiveDomainRealTimeBpsDataResponse());
    }

    public DescribeLiveDomainRealTimeBpsDataResponse describeLiveDomainRealTimeBpsData(DescribeLiveDomainRealTimeBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse describeLiveDomainRealTimeHttpCodeDataWithOptions(DescribeLiveDomainRealTimeHttpCodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainRealTimeHttpCodeData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse describeLiveDomainRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse describeLiveDomainRealtimeLogDeliveryWithOptions(DescribeLiveDomainRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLiveDomainRealtimeLogDeliveryResponse());
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse describeLiveDomainRealtimeLogDelivery(DescribeLiveDomainRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse describeLiveDomainRealTimeTrafficDataWithOptions(DescribeLiveDomainRealTimeTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainRealTimeTrafficData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainRealTimeTrafficDataResponse());
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse describeLiveDomainRealTimeTrafficData(DescribeLiveDomainRealTimeTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRecordDataResponse describeLiveDomainRecordDataWithOptions(DescribeLiveDomainRecordDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainRecordData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainRecordDataResponse());
    }

    public DescribeLiveDomainRecordDataResponse describeLiveDomainRecordData(DescribeLiveDomainRecordDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainRecordDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainSnapshotDataResponse describeLiveDomainSnapshotDataWithOptions(DescribeLiveDomainSnapshotDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainSnapshotData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainSnapshotDataResponse());
    }

    public DescribeLiveDomainSnapshotDataResponse describeLiveDomainSnapshotData(DescribeLiveDomainSnapshotDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainSnapshotDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainStreamTranscodeDataResponse describeLiveDomainStreamTranscodeDataWithOptions(DescribeLiveDomainStreamTranscodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainStreamTranscodeData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainStreamTranscodeDataResponse());
    }

    public DescribeLiveDomainStreamTranscodeDataResponse describeLiveDomainStreamTranscodeData(DescribeLiveDomainStreamTranscodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainStreamTranscodeDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainTimeShiftDataResponse describeLiveDomainTimeShiftDataWithOptions(DescribeLiveDomainTimeShiftDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainTimeShiftData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainTimeShiftDataResponse());
    }

    public DescribeLiveDomainTimeShiftDataResponse describeLiveDomainTimeShiftData(DescribeLiveDomainTimeShiftDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainTimeShiftDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficDataWithOptions(DescribeLiveDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainTrafficData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainTrafficDataResponse());
    }

    public DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficData(DescribeLiveDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainTranscodeDataResponse describeLiveDomainTranscodeDataWithOptions(DescribeLiveDomainTranscodeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveDomainTranscodeData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveDomainTranscodeDataResponse());
    }

    public DescribeLiveDomainTranscodeDataResponse describeLiveDomainTranscodeData(DescribeLiveDomainTranscodeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveDomainTranscodeDataWithOptions(request, runtime);
    }

    public DescribeLiveLazyPullStreamConfigResponse describeLiveLazyPullStreamConfigWithOptions(DescribeLiveLazyPullStreamConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveLazyPullStreamConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveLazyPullStreamConfigResponse());
    }

    public DescribeLiveLazyPullStreamConfigResponse describeLiveLazyPullStreamConfig(DescribeLiveLazyPullStreamConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveLazyPullStreamConfigWithOptions(request, runtime);
    }

    public DescribeLivePullStreamConfigResponse describeLivePullStreamConfigWithOptions(DescribeLivePullStreamConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLivePullStreamConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLivePullStreamConfigResponse());
    }

    public DescribeLivePullStreamConfigResponse describeLivePullStreamConfig(DescribeLivePullStreamConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLivePullStreamConfigWithOptions(request, runtime);
    }

    public DescribeLiveRealtimeDeliveryAccResponse describeLiveRealtimeDeliveryAccWithOptions(DescribeLiveRealtimeDeliveryAccRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveRealtimeDeliveryAcc", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveRealtimeDeliveryAccResponse());
    }

    public DescribeLiveRealtimeDeliveryAccResponse describeLiveRealtimeDeliveryAcc(DescribeLiveRealtimeDeliveryAccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveRealtimeDeliveryAccWithOptions(request, runtime);
    }

    public DescribeLiveRealtimeLogAuthorizedResponse describeLiveRealtimeLogAuthorizedWithOptions(DescribeLiveRealtimeLogAuthorizedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveRealtimeLogAuthorized", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLiveRealtimeLogAuthorizedResponse());
    }

    public DescribeLiveRealtimeLogAuthorizedResponse describeLiveRealtimeLogAuthorized(DescribeLiveRealtimeLogAuthorizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveRealtimeLogAuthorizedWithOptions(request, runtime);
    }

    public DescribeLiveRecordConfigResponse describeLiveRecordConfigWithOptions(DescribeLiveRecordConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveRecordConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveRecordConfigResponse());
    }

    public DescribeLiveRecordConfigResponse describeLiveRecordConfig(DescribeLiveRecordConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveRecordConfigWithOptions(request, runtime);
    }

    public DescribeLiveRecordNotifyConfigResponse describeLiveRecordNotifyConfigWithOptions(DescribeLiveRecordNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveRecordNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveRecordNotifyConfigResponse());
    }

    public DescribeLiveRecordNotifyConfigResponse describeLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigsWithOptions(DescribeLiveRecordVodConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveRecordVodConfigs", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveRecordVodConfigsResponse());
    }

    public DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigs(DescribeLiveRecordVodConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveRecordVodConfigsWithOptions(request, runtime);
    }

    public DescribeLiveShiftConfigsResponse describeLiveShiftConfigsWithOptions(DescribeLiveShiftConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveShiftConfigs", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveShiftConfigsResponse());
    }

    public DescribeLiveShiftConfigsResponse describeLiveShiftConfigs(DescribeLiveShiftConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveShiftConfigsWithOptions(request, runtime);
    }

    public DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfigWithOptions(DescribeLiveSnapshotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveSnapshotConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveSnapshotConfigResponse());
    }

    public DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfig(DescribeLiveSnapshotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveSnapshotConfigWithOptions(request, runtime);
    }

    public DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfigWithOptions(DescribeLiveSnapshotDetectPornConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveSnapshotDetectPornConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveSnapshotDetectPornConfigResponse());
    }

    public DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfig(DescribeLiveSnapshotDetectPornConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamBitRateDataResponse describeLiveStreamBitRateDataWithOptions(DescribeLiveStreamBitRateDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamBitRateData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamBitRateDataResponse());
    }

    public DescribeLiveStreamBitRateDataResponse describeLiveStreamBitRateData(DescribeLiveStreamBitRateDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamBitRateDataWithOptions(request, runtime);
    }

    public DescribeLiveStreamCountResponse describeLiveStreamCountWithOptions(DescribeLiveStreamCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamCount", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLiveStreamCountResponse());
    }

    public DescribeLiveStreamCountResponse describeLiveStreamCount(DescribeLiveStreamCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamCountWithOptions(request, runtime);
    }

    public DescribeLiveStreamDelayConfigResponse describeLiveStreamDelayConfigWithOptions(DescribeLiveStreamDelayConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamDelayConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamDelayConfigResponse());
    }

    public DescribeLiveStreamDelayConfigResponse describeLiveStreamDelayConfig(DescribeLiveStreamDelayConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamDelayConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamHistoryUserNumResponse describeLiveStreamHistoryUserNumWithOptions(DescribeLiveStreamHistoryUserNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamHistoryUserNum", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamHistoryUserNumResponse());
    }

    public DescribeLiveStreamHistoryUserNumResponse describeLiveStreamHistoryUserNum(DescribeLiveStreamHistoryUserNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamHistoryUserNumWithOptions(request, runtime);
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse describeLiveStreamOptimizedFeatureConfigWithOptions(DescribeLiveStreamOptimizedFeatureConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamOptimizedFeatureConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamOptimizedFeatureConfigResponse());
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse describeLiveStreamOptimizedFeatureConfig(DescribeLiveStreamOptimizedFeatureConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamOptimizedFeatureConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordContentResponse describeLiveStreamRecordContentWithOptions(DescribeLiveStreamRecordContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamRecordContent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamRecordContentResponse());
    }

    public DescribeLiveStreamRecordContentResponse describeLiveStreamRecordContent(DescribeLiveStreamRecordContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamRecordContentWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFileWithOptions(DescribeLiveStreamRecordIndexFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamRecordIndexFile", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamRecordIndexFileResponse());
    }

    public DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFile(DescribeLiveStreamRecordIndexFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamRecordIndexFileWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFilesWithOptions(DescribeLiveStreamRecordIndexFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamRecordIndexFiles", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamRecordIndexFilesResponse());
    }

    public DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFiles(DescribeLiveStreamRecordIndexFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamRecordIndexFilesWithOptions(request, runtime);
    }

    public DescribeLiveStreamsBlockListResponse describeLiveStreamsBlockListWithOptions(DescribeLiveStreamsBlockListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamsBlockList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamsBlockListResponse());
    }

    public DescribeLiveStreamsBlockListResponse describeLiveStreamsBlockList(DescribeLiveStreamsBlockListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamsBlockListWithOptions(request, runtime);
    }

    public DescribeLiveStreamsControlHistoryResponse describeLiveStreamsControlHistoryWithOptions(DescribeLiveStreamsControlHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamsControlHistory", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamsControlHistoryResponse());
    }

    public DescribeLiveStreamsControlHistoryResponse describeLiveStreamsControlHistory(DescribeLiveStreamsControlHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamsControlHistoryWithOptions(request, runtime);
    }

    public DescribeLiveStreamSnapshotInfoResponse describeLiveStreamSnapshotInfoWithOptions(DescribeLiveStreamSnapshotInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamSnapshotInfo", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamSnapshotInfoResponse());
    }

    public DescribeLiveStreamSnapshotInfoResponse describeLiveStreamSnapshotInfo(DescribeLiveStreamSnapshotInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamSnapshotInfoWithOptions(request, runtime);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse describeLiveStreamsNotifyUrlConfigWithOptions(DescribeLiveStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamsNotifyUrlConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamsNotifyUrlConfigResponse());
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse describeLiveStreamsNotifyUrlConfig(DescribeLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineListWithOptions(DescribeLiveStreamsOnlineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamsOnlineList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamsOnlineListResponse());
    }

    public DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineList(DescribeLiveStreamsOnlineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamsOnlineListWithOptions(request, runtime);
    }

    public DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishListWithOptions(DescribeLiveStreamsPublishListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamsPublishList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamsPublishListResponse());
    }

    public DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishList(DescribeLiveStreamsPublishListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamsPublishListWithOptions(request, runtime);
    }

    public DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfoWithOptions(DescribeLiveStreamTranscodeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamTranscodeInfo", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamTranscodeInfoResponse());
    }

    public DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfo(DescribeLiveStreamTranscodeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamTranscodeInfoWithOptions(request, runtime);
    }

    public DescribeLiveStreamTranscodeStreamNumResponse describeLiveStreamTranscodeStreamNumWithOptions(DescribeLiveStreamTranscodeStreamNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveStreamTranscodeStreamNum", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveStreamTranscodeStreamNumResponse());
    }

    public DescribeLiveStreamTranscodeStreamNumResponse describeLiveStreamTranscodeStreamNum(DescribeLiveStreamTranscodeStreamNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveStreamTranscodeStreamNumWithOptions(request, runtime);
    }

    public DescribeLiveTagResourcesResponse describeLiveTagResourcesWithOptions(DescribeLiveTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveTagResources", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveTagResourcesResponse());
    }

    public DescribeLiveTagResourcesResponse describeLiveTagResources(DescribeLiveTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveTagResourcesWithOptions(request, runtime);
    }

    public DescribeLiveTopDomainsByFlowResponse describeLiveTopDomainsByFlowWithOptions(DescribeLiveTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveTopDomainsByFlow", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveTopDomainsByFlowResponse());
    }

    public DescribeLiveTopDomainsByFlowResponse describeLiveTopDomainsByFlow(DescribeLiveTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeLiveUserDomainsResponse describeLiveUserDomainsWithOptions(DescribeLiveUserDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveUserDomains", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveUserDomainsResponse());
    }

    public DescribeLiveUserDomainsResponse describeLiveUserDomains(DescribeLiveUserDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveUserDomainsWithOptions(request, runtime);
    }

    public DescribeLiveUserTagsResponse describeLiveUserTagsWithOptions(DescribeLiveUserTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveUserTags", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveUserTagsResponse());
    }

    public DescribeLiveUserTagsResponse describeLiveUserTags(DescribeLiveUserTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveUserTagsWithOptions(request, runtime);
    }

    public DescribeLiveVerifyContentResponse describeLiveVerifyContentWithOptions(DescribeLiveVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLiveVerifyContent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLiveVerifyContentResponse());
    }

    public DescribeLiveVerifyContentResponse describeLiveVerifyContent(DescribeLiveVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLiveVerifyContentWithOptions(request, runtime);
    }

    public DescribeMixStreamListResponse describeMixStreamListWithOptions(DescribeMixStreamListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMixStreamList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMixStreamListResponse());
    }

    public DescribeMixStreamListResponse describeMixStreamList(DescribeMixStreamListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMixStreamListWithOptions(request, runtime);
    }

    public DescribeRecordResponse describeRecordWithOptions(DescribeRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecord", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordResponse());
    }

    public DescribeRecordResponse describeRecord(DescribeRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordWithOptions(request, runtime);
    }

    public DescribeRecordsResponse describeRecordsWithOptions(DescribeRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecords", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordsResponse());
    }

    public DescribeRecordsResponse describeRecords(DescribeRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordsWithOptions(request, runtime);
    }

    public DescribeRoomKickoutUserListResponse describeRoomKickoutUserListWithOptions(DescribeRoomKickoutUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoomKickoutUserList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoomKickoutUserListResponse());
    }

    public DescribeRoomKickoutUserListResponse describeRoomKickoutUserList(DescribeRoomKickoutUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoomKickoutUserListWithOptions(request, runtime);
    }

    public DescribeRoomListResponse describeRoomListWithOptions(DescribeRoomListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoomList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoomListResponse());
    }

    public DescribeRoomListResponse describeRoomList(DescribeRoomListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoomListWithOptions(request, runtime);
    }

    public DescribeRoomStatusResponse describeRoomStatusWithOptions(DescribeRoomStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRoomStatus", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRoomStatusResponse());
    }

    public DescribeRoomStatusResponse describeRoomStatus(DescribeRoomStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRoomStatusWithOptions(request, runtime);
    }

    public DescribeStudioLayoutsResponse describeStudioLayoutsWithOptions(DescribeStudioLayoutsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStudioLayouts", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStudioLayoutsResponse());
    }

    public DescribeStudioLayoutsResponse describeStudioLayouts(DescribeStudioLayoutsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStudioLayoutsWithOptions(request, runtime);
    }

    public DescribeUpBpsPeakDataResponse describeUpBpsPeakDataWithOptions(DescribeUpBpsPeakDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUpBpsPeakData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUpBpsPeakDataResponse());
    }

    public DescribeUpBpsPeakDataResponse describeUpBpsPeakData(DescribeUpBpsPeakDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpBpsPeakDataWithOptions(request, runtime);
    }

    public DescribeUpBpsPeakOfLineResponse describeUpBpsPeakOfLineWithOptions(DescribeUpBpsPeakOfLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUpBpsPeakOfLine", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUpBpsPeakOfLineResponse());
    }

    public DescribeUpBpsPeakOfLineResponse describeUpBpsPeakOfLine(DescribeUpBpsPeakOfLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpBpsPeakOfLineWithOptions(request, runtime);
    }

    public DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamDataWithOptions(DescribeUpPeakPublishStreamDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUpPeakPublishStreamData", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUpPeakPublishStreamDataResponse());
    }

    public DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamData(DescribeUpPeakPublishStreamDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUpPeakPublishStreamDataWithOptions(request, runtime);
    }

    public DisableLiveRealtimeLogDeliveryResponse disableLiveRealtimeLogDeliveryWithOptions(DisableLiveRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableLiveRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new DisableLiveRealtimeLogDeliveryResponse());
    }

    public DisableLiveRealtimeLogDeliveryResponse disableLiveRealtimeLogDelivery(DisableLiveRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EditHtmlResourceResponse editHtmlResourceWithOptions(EditHtmlResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditHtmlResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new EditHtmlResourceResponse());
    }

    public EditHtmlResourceResponse editHtmlResource(EditHtmlResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editHtmlResourceWithOptions(request, runtime);
    }

    public EditPlaylistResponse editPlaylistWithOptions(EditPlaylistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditPlaylist", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new EditPlaylistResponse());
    }

    public EditPlaylistResponse editPlaylist(EditPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editPlaylistWithOptions(request, runtime);
    }

    public EffectCasterUrgentResponse effectCasterUrgentWithOptions(EffectCasterUrgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EffectCasterUrgent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new EffectCasterUrgentResponse());
    }

    public EffectCasterUrgentResponse effectCasterUrgent(EffectCasterUrgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectCasterUrgentWithOptions(request, runtime);
    }

    public EffectCasterVideoResourceResponse effectCasterVideoResourceWithOptions(EffectCasterVideoResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EffectCasterVideoResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new EffectCasterVideoResourceResponse());
    }

    public EffectCasterVideoResourceResponse effectCasterVideoResource(EffectCasterVideoResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.effectCasterVideoResourceWithOptions(request, runtime);
    }

    public EnableLiveRealtimeLogDeliveryResponse enableLiveRealtimeLogDeliveryWithOptions(EnableLiveRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableLiveRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new EnableLiveRealtimeLogDeliveryResponse());
    }

    public EnableLiveRealtimeLogDeliveryResponse enableLiveRealtimeLogDelivery(EnableLiveRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ForbidLiveStreamResponse forbidLiveStreamWithOptions(ForbidLiveStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ForbidLiveStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ForbidLiveStreamResponse());
    }

    public ForbidLiveStreamResponse forbidLiveStream(ForbidLiveStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forbidLiveStreamWithOptions(request, runtime);
    }

    public ForbidPushStreamResponse forbidPushStreamWithOptions(ForbidPushStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ForbidPushStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ForbidPushStreamResponse());
    }

    public ForbidPushStreamResponse forbidPushStream(ForbidPushStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forbidPushStreamWithOptions(request, runtime);
    }

    public GetMultiRateConfigResponse getMultiRateConfigWithOptions(GetMultiRateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMultiRateConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMultiRateConfigResponse());
    }

    public GetMultiRateConfigResponse getMultiRateConfig(GetMultiRateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMultiRateConfigWithOptions(request, runtime);
    }

    public GetMultiRateConfigListResponse getMultiRateConfigListWithOptions(GetMultiRateConfigListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMultiRateConfigList", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMultiRateConfigListResponse());
    }

    public GetMultiRateConfigListResponse getMultiRateConfigList(GetMultiRateConfigListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMultiRateConfigListWithOptions(request, runtime);
    }

    public JoinBoardResponse joinBoardWithOptions(JoinBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinBoard", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new JoinBoardResponse());
    }

    public JoinBoardResponse joinBoard(JoinBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinBoardWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryResponse listLiveRealtimeLogDeliveryWithOptions(ListLiveRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLiveRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListLiveRealtimeLogDeliveryResponse());
    }

    public ListLiveRealtimeLogDeliveryResponse listLiveRealtimeLogDelivery(ListLiveRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse listLiveRealtimeLogDeliveryDomainsWithOptions(ListLiveRealtimeLogDeliveryDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLiveRealtimeLogDeliveryDomains", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListLiveRealtimeLogDeliveryDomainsResponse());
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse listLiveRealtimeLogDeliveryDomains(ListLiveRealtimeLogDeliveryDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryInfosResponse listLiveRealtimeLogDeliveryInfosWithOptions(ListLiveRealtimeLogDeliveryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLiveRealtimeLogDeliveryInfos", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListLiveRealtimeLogDeliveryInfosResponse());
    }

    public ListLiveRealtimeLogDeliveryInfosResponse listLiveRealtimeLogDeliveryInfos(ListLiveRealtimeLogDeliveryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public ListPlaylistResponse listPlaylistWithOptions(ListPlaylistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPlaylist", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPlaylistResponse());
    }

    public ListPlaylistResponse listPlaylist(ListPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPlaylistWithOptions(request, runtime);
    }

    public ListPlaylistItemsResponse listPlaylistItemsWithOptions(ListPlaylistItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPlaylistItems", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPlaylistItemsResponse());
    }

    public ListPlaylistItemsResponse listPlaylistItems(ListPlaylistItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPlaylistItemsWithOptions(request, runtime);
    }

    public ModifyCasterComponentResponse modifyCasterComponentWithOptions(ModifyCasterComponentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCasterComponent", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCasterComponentResponse());
    }

    public ModifyCasterComponentResponse modifyCasterComponent(ModifyCasterComponentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCasterComponentWithOptions(request, runtime);
    }

    public ModifyCasterEpisodeResponse modifyCasterEpisodeWithOptions(ModifyCasterEpisodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCasterEpisode", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCasterEpisodeResponse());
    }

    public ModifyCasterEpisodeResponse modifyCasterEpisode(ModifyCasterEpisodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCasterEpisodeWithOptions(request, runtime);
    }

    public ModifyCasterLayoutResponse modifyCasterLayoutWithOptions(ModifyCasterLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCasterLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCasterLayoutResponse());
    }

    public ModifyCasterLayoutResponse modifyCasterLayout(ModifyCasterLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCasterLayoutWithOptions(request, runtime);
    }

    public ModifyCasterProgramResponse modifyCasterProgramWithOptions(ModifyCasterProgramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCasterProgram", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCasterProgramResponse());
    }

    public ModifyCasterProgramResponse modifyCasterProgram(ModifyCasterProgramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCasterProgramWithOptions(request, runtime);
    }

    public ModifyCasterVideoResourceResponse modifyCasterVideoResourceWithOptions(ModifyCasterVideoResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCasterVideoResource", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCasterVideoResourceResponse());
    }

    public ModifyCasterVideoResourceResponse modifyCasterVideoResource(ModifyCasterVideoResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCasterVideoResourceWithOptions(request, runtime);
    }

    public ModifyLiveDomainSchdmByPropertyResponse modifyLiveDomainSchdmByPropertyWithOptions(ModifyLiveDomainSchdmByPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLiveDomainSchdmByProperty", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLiveDomainSchdmByPropertyResponse());
    }

    public ModifyLiveDomainSchdmByPropertyResponse modifyLiveDomainSchdmByProperty(ModifyLiveDomainSchdmByPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLiveDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public ModifyLiveRealtimeLogDeliveryResponse modifyLiveRealtimeLogDeliveryWithOptions(ModifyLiveRealtimeLogDeliveryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLiveRealtimeLogDelivery", "2016-11-01", "HTTPS", "GET", "AK", "json", req, runtime), new ModifyLiveRealtimeLogDeliveryResponse());
    }

    public ModifyLiveRealtimeLogDeliveryResponse modifyLiveRealtimeLogDelivery(ModifyLiveRealtimeLogDeliveryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ModifyStudioLayoutResponse modifyStudioLayoutWithOptions(ModifyStudioLayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStudioLayout", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStudioLayoutResponse());
    }

    public ModifyStudioLayoutResponse modifyStudioLayout(ModifyStudioLayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStudioLayoutWithOptions(request, runtime);
    }

    public OpenLiveShiftResponse openLiveShiftWithOptions(OpenLiveShiftRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenLiveShift", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new OpenLiveShiftResponse());
    }

    public OpenLiveShiftResponse openLiveShift(OpenLiveShiftRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openLiveShiftWithOptions(request, runtime);
    }

    public RealTimeRecordCommandResponse realTimeRecordCommandWithOptions(RealTimeRecordCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RealTimeRecordCommand", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new RealTimeRecordCommandResponse());
    }

    public RealTimeRecordCommandResponse realTimeRecordCommand(RealTimeRecordCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.realTimeRecordCommandWithOptions(request, runtime);
    }

    public RealTimeSnapshotCommandResponse realTimeSnapshotCommandWithOptions(RealTimeSnapshotCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RealTimeSnapshotCommand", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new RealTimeSnapshotCommandResponse());
    }

    public RealTimeSnapshotCommandResponse realTimeSnapshotCommand(RealTimeSnapshotCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.realTimeSnapshotCommandWithOptions(request, runtime);
    }

    public ResumeLiveStreamResponse resumeLiveStreamWithOptions(ResumeLiveStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeLiveStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeLiveStreamResponse());
    }

    public ResumeLiveStreamResponse resumeLiveStream(ResumeLiveStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeLiveStreamWithOptions(request, runtime);
    }

    public SendRoomNotificationResponse sendRoomNotificationWithOptions(SendRoomNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendRoomNotification", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendRoomNotificationResponse());
    }

    public SendRoomNotificationResponse sendRoomNotification(SendRoomNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendRoomNotificationWithOptions(request, runtime);
    }

    public SendRoomUserNotificationResponse sendRoomUserNotificationWithOptions(SendRoomUserNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendRoomUserNotification", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendRoomUserNotificationResponse());
    }

    public SendRoomUserNotificationResponse sendRoomUserNotification(SendRoomUserNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendRoomUserNotificationWithOptions(request, runtime);
    }

    public SetBoardCallbackResponse setBoardCallbackWithOptions(SetBoardCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetBoardCallback", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetBoardCallbackResponse());
    }

    public SetBoardCallbackResponse setBoardCallback(SetBoardCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setBoardCallbackWithOptions(request, runtime);
    }

    public SetCasterChannelResponse setCasterChannelWithOptions(SetCasterChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCasterChannel", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetCasterChannelResponse());
    }

    public SetCasterChannelResponse setCasterChannel(SetCasterChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCasterChannelWithOptions(request, runtime);
    }

    public SetCasterConfigResponse setCasterConfigWithOptions(SetCasterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCasterConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetCasterConfigResponse());
    }

    public SetCasterConfigResponse setCasterConfig(SetCasterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCasterConfigWithOptions(request, runtime);
    }

    public SetCasterSceneConfigResponse setCasterSceneConfigWithOptions(SetCasterSceneConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCasterSceneConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetCasterSceneConfigResponse());
    }

    public SetCasterSceneConfigResponse setCasterSceneConfig(SetCasterSceneConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCasterSceneConfigWithOptions(request, runtime);
    }

    public SetCasterSyncGroupResponse setCasterSyncGroupWithOptions(SetCasterSyncGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCasterSyncGroup", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetCasterSyncGroupResponse());
    }

    public SetCasterSyncGroupResponse setCasterSyncGroup(SetCasterSyncGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCasterSyncGroupWithOptions(request, runtime);
    }

    public SetLiveDomainCertificateResponse setLiveDomainCertificateWithOptions(SetLiveDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLiveDomainCertificate", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetLiveDomainCertificateResponse());
    }

    public SetLiveDomainCertificateResponse setLiveDomainCertificate(SetLiveDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLiveDomainCertificateWithOptions(request, runtime);
    }

    public SetLiveLazyPullStreamInfoConfigResponse setLiveLazyPullStreamInfoConfigWithOptions(SetLiveLazyPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLiveLazyPullStreamInfoConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetLiveLazyPullStreamInfoConfigResponse());
    }

    public SetLiveLazyPullStreamInfoConfigResponse setLiveLazyPullStreamInfoConfig(SetLiveLazyPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLiveLazyPullStreamInfoConfigWithOptions(request, runtime);
    }

    public SetLiveStreamDelayConfigResponse setLiveStreamDelayConfigWithOptions(SetLiveStreamDelayConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLiveStreamDelayConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetLiveStreamDelayConfigResponse());
    }

    public SetLiveStreamDelayConfigResponse setLiveStreamDelayConfig(SetLiveStreamDelayConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLiveStreamDelayConfigWithOptions(request, runtime);
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setLiveStreamOptimizedFeatureConfigWithOptions(SetLiveStreamOptimizedFeatureConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLiveStreamOptimizedFeatureConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetLiveStreamOptimizedFeatureConfigResponse());
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setLiveStreamOptimizedFeatureConfig(SetLiveStreamOptimizedFeatureConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLiveStreamOptimizedFeatureConfigWithOptions(request, runtime);
    }

    public SetLiveStreamsNotifyUrlConfigResponse setLiveStreamsNotifyUrlConfigWithOptions(SetLiveStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetLiveStreamsNotifyUrlConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetLiveStreamsNotifyUrlConfigResponse());
    }

    public SetLiveStreamsNotifyUrlConfigResponse setLiveStreamsNotifyUrlConfig(SetLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public StartBoardRecordResponse startBoardRecordWithOptions(StartBoardRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartBoardRecord", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartBoardRecordResponse());
    }

    public StartBoardRecordResponse startBoardRecord(StartBoardRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBoardRecordWithOptions(request, runtime);
    }

    public StartCasterResponse startCasterWithOptions(StartCasterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCaster", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartCasterResponse());
    }

    public StartCasterResponse startCaster(StartCasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCasterWithOptions(request, runtime);
    }

    public StartCasterSceneResponse startCasterSceneWithOptions(StartCasterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCasterScene", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartCasterSceneResponse());
    }

    public StartCasterSceneResponse startCasterScene(StartCasterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCasterSceneWithOptions(request, runtime);
    }

    public StartLiveDomainResponse startLiveDomainWithOptions(StartLiveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartLiveDomain", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartLiveDomainResponse());
    }

    public StartLiveDomainResponse startLiveDomain(StartLiveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLiveDomainWithOptions(request, runtime);
    }

    public StartLiveIndexResponse startLiveIndexWithOptions(StartLiveIndexRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartLiveIndex", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartLiveIndexResponse());
    }

    public StartLiveIndexResponse startLiveIndex(StartLiveIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startLiveIndexWithOptions(request, runtime);
    }

    public StartPlaylistResponse startPlaylistWithOptions(StartPlaylistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartPlaylist", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartPlaylistResponse());
    }

    public StartPlaylistResponse startPlaylist(StartPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startPlaylistWithOptions(request, runtime);
    }

    public StopCasterResponse stopCasterWithOptions(StopCasterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopCaster", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopCasterResponse());
    }

    public StopCasterResponse stopCaster(StopCasterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCasterWithOptions(request, runtime);
    }

    public StopCasterSceneResponse stopCasterSceneWithOptions(StopCasterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopCasterScene", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopCasterSceneResponse());
    }

    public StopCasterSceneResponse stopCasterScene(StopCasterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCasterSceneWithOptions(request, runtime);
    }

    public StopLiveDomainResponse stopLiveDomainWithOptions(StopLiveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLiveDomain", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopLiveDomainResponse());
    }

    public StopLiveDomainResponse stopLiveDomain(StopLiveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveDomainWithOptions(request, runtime);
    }

    public StopLiveIndexResponse stopLiveIndexWithOptions(StopLiveIndexRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLiveIndex", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopLiveIndexResponse());
    }

    public StopLiveIndexResponse stopLiveIndex(StopLiveIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveIndexWithOptions(request, runtime);
    }

    public StopPlaylistResponse stopPlaylistWithOptions(StopPlaylistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopPlaylist", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new StopPlaylistResponse());
    }

    public StopPlaylistResponse stopPlaylist(StopPlaylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopPlaylistWithOptions(request, runtime);
    }

    public TagLiveResourcesResponse tagLiveResourcesWithOptions(TagLiveResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagLiveResources", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new TagLiveResourcesResponse());
    }

    public TagLiveResourcesResponse tagLiveResources(TagLiveResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagLiveResourcesWithOptions(request, runtime);
    }

    public UnTagLiveResourcesResponse unTagLiveResourcesWithOptions(UnTagLiveResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnTagLiveResources", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnTagLiveResourcesResponse());
    }

    public UnTagLiveResourcesResponse unTagLiveResources(UnTagLiveResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unTagLiveResourcesWithOptions(request, runtime);
    }

    public UpdateBoardResponse updateBoardWithOptions(UpdateBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateBoard", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateBoardResponse());
    }

    public UpdateBoardResponse updateBoard(UpdateBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBoardWithOptions(request, runtime);
    }

    public UpdateBoardCallbackResponse updateBoardCallbackWithOptions(UpdateBoardCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateBoardCallback", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateBoardCallbackResponse());
    }

    public UpdateBoardCallbackResponse updateBoardCallback(UpdateBoardCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBoardCallbackWithOptions(request, runtime);
    }

    public UpdateCasterSceneAudioResponse updateCasterSceneAudioWithOptions(UpdateCasterSceneAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCasterSceneAudio", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCasterSceneAudioResponse());
    }

    public UpdateCasterSceneAudioResponse updateCasterSceneAudio(UpdateCasterSceneAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCasterSceneAudioWithOptions(request, runtime);
    }

    public UpdateCasterSceneConfigResponse updateCasterSceneConfigWithOptions(UpdateCasterSceneConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCasterSceneConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCasterSceneConfigResponse());
    }

    public UpdateCasterSceneConfigResponse updateCasterSceneConfig(UpdateCasterSceneConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCasterSceneConfigWithOptions(request, runtime);
    }

    public UpdateLiveAppSnapshotConfigResponse updateLiveAppSnapshotConfigWithOptions(UpdateLiveAppSnapshotConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveAppSnapshotConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveAppSnapshotConfigResponse());
    }

    public UpdateLiveAppSnapshotConfigResponse updateLiveAppSnapshotConfig(UpdateLiveAppSnapshotConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveAppSnapshotConfigWithOptions(request, runtime);
    }

    public UpdateLiveASRConfigResponse updateLiveASRConfigWithOptions(UpdateLiveASRConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveASRConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveASRConfigResponse());
    }

    public UpdateLiveASRConfigResponse updateLiveASRConfig(UpdateLiveASRConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveASRConfigWithOptions(request, runtime);
    }

    public UpdateLiveAudioAuditConfigResponse updateLiveAudioAuditConfigWithOptions(UpdateLiveAudioAuditConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveAudioAuditConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveAudioAuditConfigResponse());
    }

    public UpdateLiveAudioAuditConfigResponse updateLiveAudioAuditConfig(UpdateLiveAudioAuditConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public UpdateLiveAudioAuditNotifyConfigResponse updateLiveAudioAuditNotifyConfigWithOptions(UpdateLiveAudioAuditNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveAudioAuditNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveAudioAuditNotifyConfigResponse());
    }

    public UpdateLiveAudioAuditNotifyConfigResponse updateLiveAudioAuditNotifyConfig(UpdateLiveAudioAuditNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public UpdateLiveDetectNotifyConfigResponse updateLiveDetectNotifyConfigWithOptions(UpdateLiveDetectNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveDetectNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveDetectNotifyConfigResponse());
    }

    public UpdateLiveDetectNotifyConfigResponse updateLiveDetectNotifyConfig(UpdateLiveDetectNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public UpdateLiveRecordNotifyConfigResponse updateLiveRecordNotifyConfigWithOptions(UpdateLiveRecordNotifyConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveRecordNotifyConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveRecordNotifyConfigResponse());
    }

    public UpdateLiveRecordNotifyConfigResponse updateLiveRecordNotifyConfig(UpdateLiveRecordNotifyConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public UpdateLiveSnapshotDetectPornConfigResponse updateLiveSnapshotDetectPornConfigWithOptions(UpdateLiveSnapshotDetectPornConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveSnapshotDetectPornConfig", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveSnapshotDetectPornConfigResponse());
    }

    public UpdateLiveSnapshotDetectPornConfigResponse updateLiveSnapshotDetectPornConfig(UpdateLiveSnapshotDetectPornConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public UpdateLiveTopLevelDomainResponse updateLiveTopLevelDomainWithOptions(UpdateLiveTopLevelDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLiveTopLevelDomain", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveTopLevelDomainResponse());
    }

    public UpdateLiveTopLevelDomainResponse updateLiveTopLevelDomain(UpdateLiveTopLevelDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveTopLevelDomainWithOptions(request, runtime);
    }

    public UpdateMixStreamResponse updateMixStreamWithOptions(UpdateMixStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMixStream", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMixStreamResponse());
    }

    public UpdateMixStreamResponse updateMixStream(UpdateMixStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMixStreamWithOptions(request, runtime);
    }

    public VerifyLiveDomainOwnerResponse verifyLiveDomainOwnerWithOptions(VerifyLiveDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyLiveDomainOwner", "2016-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyLiveDomainOwnerResponse());
    }

    public VerifyLiveDomainOwnerResponse verifyLiveDomainOwner(VerifyLiveDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyLiveDomainOwnerWithOptions(request, runtime);
    }
}
