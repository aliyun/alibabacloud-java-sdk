// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101;

import com.aliyun.tea.*;
import com.aliyun.live20161101.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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


    public AddLiveASRConfigResponse addLiveASRConfigWithOptions(AddLiveASRConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveASRConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveASRConfigResponse());
    }

    public AddLiveASRConfigResponse addLiveASRConfig(AddLiveASRConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveASRConfigWithOptions(request, runtime);
    }

    public DescribeLiveAsrConfigResponse describeLiveAsrConfigWithOptions(DescribeLiveAsrConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveAsrConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveAsrConfigResponse());
    }

    public DescribeLiveAsrConfigResponse describeLiveAsrConfig(DescribeLiveAsrConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveAsrConfigWithOptions(request, runtime);
    }

    public DeleteLiveASRConfigResponse deleteLiveASRConfigWithOptions(DeleteLiveASRConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveASRConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveASRConfigResponse());
    }

    public DeleteLiveASRConfigResponse deleteLiveASRConfig(DeleteLiveASRConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveASRConfigWithOptions(request, runtime);
    }

    public UpdateLiveASRConfigResponse updateLiveASRConfigWithOptions(UpdateLiveASRConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveASRConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveASRConfigResponse());
    }

    public UpdateLiveASRConfigResponse updateLiveASRConfig(UpdateLiveASRConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveASRConfigWithOptions(request, runtime);
    }

    public DeleteMixStreamResponse deleteMixStreamWithOptions(DeleteMixStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMixStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMixStreamResponse());
    }

    public DeleteMixStreamResponse deleteMixStream(DeleteMixStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMixStreamWithOptions(request, runtime);
    }

    public UpdateMixStreamResponse updateMixStreamWithOptions(UpdateMixStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMixStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMixStreamResponse());
    }

    public UpdateMixStreamResponse updateMixStream(UpdateMixStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMixStreamWithOptions(request, runtime);
    }

    public CreateMixStreamResponse createMixStreamWithOptions(CreateMixStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMixStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMixStreamResponse());
    }

    public CreateMixStreamResponse createMixStream(CreateMixStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMixStreamWithOptions(request, runtime);
    }

    public DescribeMixStreamListResponse describeMixStreamListWithOptions(DescribeMixStreamListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMixStreamList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMixStreamListResponse());
    }

    public DescribeMixStreamListResponse describeMixStreamList(DescribeMixStreamListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMixStreamListWithOptions(request, runtime);
    }

    public AddRtsLiveStreamTranscodeResponse addRtsLiveStreamTranscodeWithOptions(AddRtsLiveStreamTranscodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddRtsLiveStreamTranscode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddRtsLiveStreamTranscodeResponse());
    }

    public AddRtsLiveStreamTranscodeResponse addRtsLiveStreamTranscode(AddRtsLiveStreamTranscodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRtsLiveStreamTranscodeWithOptions(request, runtime);
    }

    public DescribeLiveDomainTimeShiftDataResponse describeLiveDomainTimeShiftDataWithOptions(DescribeLiveDomainTimeShiftDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainTimeShiftData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainTimeShiftDataResponse());
    }

    public DescribeLiveDomainTimeShiftDataResponse describeLiveDomainTimeShiftData(DescribeLiveDomainTimeShiftDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainTimeShiftDataWithOptions(request, runtime);
    }

    public DeleteHtmlResourceResponse deleteHtmlResourceWithOptions(DeleteHtmlResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHtmlResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHtmlResourceResponse());
    }

    public DeleteHtmlResourceResponse deleteHtmlResource(DeleteHtmlResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHtmlResourceWithOptions(request, runtime);
    }

    public DescribeHtmlResourceResponse describeHtmlResourceWithOptions(DescribeHtmlResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHtmlResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHtmlResourceResponse());
    }

    public DescribeHtmlResourceResponse describeHtmlResource(DescribeHtmlResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHtmlResourceWithOptions(request, runtime);
    }

    public ControlHtmlResourceResponse controlHtmlResourceWithOptions(ControlHtmlResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ControlHtmlResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ControlHtmlResourceResponse());
    }

    public ControlHtmlResourceResponse controlHtmlResource(ControlHtmlResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.controlHtmlResourceWithOptions(request, runtime);
    }

    public EditHtmlResourceResponse editHtmlResourceWithOptions(EditHtmlResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EditHtmlResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new EditHtmlResourceResponse());
    }

    public EditHtmlResourceResponse editHtmlResource(EditHtmlResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editHtmlResourceWithOptions(request, runtime);
    }

    public DescribeLiveUserTagsResponse describeLiveUserTagsWithOptions(DescribeLiveUserTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveUserTags", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveUserTagsResponse());
    }

    public DescribeLiveUserTagsResponse describeLiveUserTags(DescribeLiveUserTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveUserTagsWithOptions(request, runtime);
    }

    public UnTagLiveResourcesResponse unTagLiveResourcesWithOptions(UnTagLiveResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnTagLiveResources", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UnTagLiveResourcesResponse());
    }

    public UnTagLiveResourcesResponse unTagLiveResources(UnTagLiveResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagLiveResourcesWithOptions(request, runtime);
    }

    public TagLiveResourcesResponse tagLiveResourcesWithOptions(TagLiveResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagLiveResources", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new TagLiveResourcesResponse());
    }

    public TagLiveResourcesResponse tagLiveResources(TagLiveResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagLiveResourcesWithOptions(request, runtime);
    }

    public DescribeLiveTagResourcesResponse describeLiveTagResourcesWithOptions(DescribeLiveTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveTagResources", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveTagResourcesResponse());
    }

    public DescribeLiveTagResourcesResponse describeLiveTagResources(DescribeLiveTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveTagResourcesWithOptions(request, runtime);
    }

    public AddLiveAudioAuditConfigResponse addLiveAudioAuditConfigWithOptions(AddLiveAudioAuditConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveAudioAuditConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveAudioAuditConfigResponse());
    }

    public AddLiveAudioAuditConfigResponse addLiveAudioAuditConfig(AddLiveAudioAuditConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public DeleteLiveAudioAuditConfigResponse deleteLiveAudioAuditConfigWithOptions(DeleteLiveAudioAuditConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveAudioAuditConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveAudioAuditConfigResponse());
    }

    public DeleteLiveAudioAuditConfigResponse deleteLiveAudioAuditConfig(DeleteLiveAudioAuditConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public DescribeLiveAudioAuditConfigResponse describeLiveAudioAuditConfigWithOptions(DescribeLiveAudioAuditConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveAudioAuditConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveAudioAuditConfigResponse());
    }

    public DescribeLiveAudioAuditConfigResponse describeLiveAudioAuditConfig(DescribeLiveAudioAuditConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public UpdateLiveAudioAuditConfigResponse updateLiveAudioAuditConfigWithOptions(UpdateLiveAudioAuditConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveAudioAuditConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveAudioAuditConfigResponse());
    }

    public UpdateLiveAudioAuditConfigResponse updateLiveAudioAuditConfig(UpdateLiveAudioAuditConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveAudioAuditConfigWithOptions(request, runtime);
    }

    public AddLiveAudioAuditNotifyConfigResponse addLiveAudioAuditNotifyConfigWithOptions(AddLiveAudioAuditNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveAudioAuditNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveAudioAuditNotifyConfigResponse());
    }

    public AddLiveAudioAuditNotifyConfigResponse addLiveAudioAuditNotifyConfig(AddLiveAudioAuditNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveAudioAuditNotifyConfigResponse deleteLiveAudioAuditNotifyConfigWithOptions(DeleteLiveAudioAuditNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveAudioAuditNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveAudioAuditNotifyConfigResponse());
    }

    public DeleteLiveAudioAuditNotifyConfigResponse deleteLiveAudioAuditNotifyConfig(DeleteLiveAudioAuditNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveAudioAuditNotifyConfigResponse describeLiveAudioAuditNotifyConfigWithOptions(DescribeLiveAudioAuditNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveAudioAuditNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveAudioAuditNotifyConfigResponse());
    }

    public DescribeLiveAudioAuditNotifyConfigResponse describeLiveAudioAuditNotifyConfig(DescribeLiveAudioAuditNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public UpdateLiveAudioAuditNotifyConfigResponse updateLiveAudioAuditNotifyConfigWithOptions(UpdateLiveAudioAuditNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveAudioAuditNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveAudioAuditNotifyConfigResponse());
    }

    public UpdateLiveAudioAuditNotifyConfigResponse updateLiveAudioAuditNotifyConfig(UpdateLiveAudioAuditNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveAudioAuditNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveDomainPushTrafficDataResponse describeLiveDomainPushTrafficDataWithOptions(DescribeLiveDomainPushTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainPushTrafficData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainPushTrafficDataResponse());
    }

    public DescribeLiveDomainPushTrafficDataResponse describeLiveDomainPushTrafficData(DescribeLiveDomainPushTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainPushTrafficDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainPushBpsDataResponse describeLiveDomainPushBpsDataWithOptions(DescribeLiveDomainPushBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainPushBpsData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainPushBpsDataResponse());
    }

    public DescribeLiveDomainPushBpsDataResponse describeLiveDomainPushBpsData(DescribeLiveDomainPushBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainPushBpsDataWithOptions(request, runtime);
    }

    public SetCasterSyncGroupResponse setCasterSyncGroupWithOptions(SetCasterSyncGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCasterSyncGroup", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetCasterSyncGroupResponse());
    }

    public SetCasterSyncGroupResponse setCasterSyncGroup(SetCasterSyncGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCasterSyncGroupWithOptions(request, runtime);
    }

    public DescribeCasterSyncGroupResponse describeCasterSyncGroupWithOptions(DescribeCasterSyncGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterSyncGroup", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterSyncGroupResponse());
    }

    public DescribeCasterSyncGroupResponse describeCasterSyncGroup(DescribeCasterSyncGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterSyncGroupWithOptions(request, runtime);
    }

    public DescribeLiveDetectPornDataResponse describeLiveDetectPornDataWithOptions(DescribeLiveDetectPornDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDetectPornData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDetectPornDataResponse());
    }

    public DescribeLiveDetectPornDataResponse describeLiveDetectPornData(DescribeLiveDetectPornDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDetectPornDataWithOptions(request, runtime);
    }

    public DeleteLiveRealTimeLogLogstoreResponse deleteLiveRealTimeLogLogstoreWithOptions(DeleteLiveRealTimeLogLogstoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveRealTimeLogLogstore", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DeleteLiveRealTimeLogLogstoreResponse());
    }

    public DeleteLiveRealTimeLogLogstoreResponse deleteLiveRealTimeLogLogstore(DeleteLiveRealTimeLogLogstoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRealTimeLogLogstoreWithOptions(request, runtime);
    }

    public DisableLiveRealtimeLogDeliveryResponse disableLiveRealtimeLogDeliveryWithOptions(DisableLiveRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableLiveRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DisableLiveRealtimeLogDeliveryResponse());
    }

    public DisableLiveRealtimeLogDeliveryResponse disableLiveRealtimeLogDelivery(DisableLiveRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public EnableLiveRealtimeLogDeliveryResponse enableLiveRealtimeLogDeliveryWithOptions(EnableLiveRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableLiveRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new EnableLiveRealtimeLogDeliveryResponse());
    }

    public EnableLiveRealtimeLogDeliveryResponse enableLiveRealtimeLogDelivery(EnableLiveRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse listLiveRealtimeLogDeliveryDomainsWithOptions(ListLiveRealtimeLogDeliveryDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLiveRealtimeLogDeliveryDomains", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new ListLiveRealtimeLogDeliveryDomainsResponse());
    }

    public ListLiveRealtimeLogDeliveryDomainsResponse listLiveRealtimeLogDeliveryDomains(ListLiveRealtimeLogDeliveryDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryDomainsWithOptions(request, runtime);
    }

    public ModifyLiveRealtimeLogDeliveryResponse modifyLiveRealtimeLogDeliveryWithOptions(ModifyLiveRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLiveRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new ModifyLiveRealtimeLogDeliveryResponse());
    }

    public ModifyLiveRealtimeLogDeliveryResponse modifyLiveRealtimeLogDelivery(ModifyLiveRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeLiveRealtimeDeliveryAccResponse describeLiveRealtimeDeliveryAccWithOptions(DescribeLiveRealtimeDeliveryAccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveRealtimeDeliveryAcc", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveRealtimeDeliveryAccResponse());
    }

    public DescribeLiveRealtimeDeliveryAccResponse describeLiveRealtimeDeliveryAcc(DescribeLiveRealtimeDeliveryAccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveRealtimeDeliveryAccWithOptions(request, runtime);
    }

    public DescribeLiveRealtimeLogAuthorizedResponse describeLiveRealtimeLogAuthorizedWithOptions(DescribeLiveRealtimeLogAuthorizedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveRealtimeLogAuthorized", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLiveRealtimeLogAuthorizedResponse());
    }

    public DescribeLiveRealtimeLogAuthorizedResponse describeLiveRealtimeLogAuthorized(DescribeLiveRealtimeLogAuthorizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveRealtimeLogAuthorizedWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryResponse listLiveRealtimeLogDeliveryWithOptions(ListLiveRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLiveRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new ListLiveRealtimeLogDeliveryResponse());
    }

    public ListLiveRealtimeLogDeliveryResponse listLiveRealtimeLogDelivery(ListLiveRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public ListLiveRealtimeLogDeliveryInfosResponse listLiveRealtimeLogDeliveryInfosWithOptions(ListLiveRealtimeLogDeliveryInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLiveRealtimeLogDeliveryInfos", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new ListLiveRealtimeLogDeliveryInfosResponse());
    }

    public ListLiveRealtimeLogDeliveryInfosResponse listLiveRealtimeLogDeliveryInfos(ListLiveRealtimeLogDeliveryInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLiveRealtimeLogDeliveryInfosWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse describeLiveDomainRealtimeLogDeliveryWithOptions(DescribeLiveDomainRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLiveDomainRealtimeLogDeliveryResponse());
    }

    public DescribeLiveDomainRealtimeLogDeliveryResponse describeLiveDomainRealtimeLogDelivery(DescribeLiveDomainRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public DeleteLiveRealtimeLogDeliveryResponse deleteLiveRealtimeLogDeliveryWithOptions(DeleteLiveRealtimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveRealtimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DeleteLiveRealtimeLogDeliveryResponse());
    }

    public DeleteLiveRealtimeLogDeliveryResponse deleteLiveRealtimeLogDelivery(DeleteLiveRealtimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRealtimeLogDeliveryWithOptions(request, runtime);
    }

    public CreateLiveRealTimeLogDeliveryResponse createLiveRealTimeLogDeliveryWithOptions(CreateLiveRealTimeLogDeliveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLiveRealTimeLogDelivery", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new CreateLiveRealTimeLogDeliveryResponse());
    }

    public CreateLiveRealTimeLogDeliveryResponse createLiveRealTimeLogDelivery(CreateLiveRealTimeLogDeliveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveRealTimeLogDeliveryWithOptions(request, runtime);
    }

    public DescribeLiveDomainLimitResponse describeLiveDomainLimitWithOptions(DescribeLiveDomainLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainLimit", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainLimitResponse());
    }

    public DescribeLiveDomainLimitResponse describeLiveDomainLimit(DescribeLiveDomainLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainLimitWithOptions(request, runtime);
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse describeLiveDomainBpsDataByTimeStampWithOptions(DescribeLiveDomainBpsDataByTimeStampRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainBpsDataByTimeStamp", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainBpsDataByTimeStampResponse());
    }

    public DescribeLiveDomainBpsDataByTimeStampResponse describeLiveDomainBpsDataByTimeStamp(DescribeLiveDomainBpsDataByTimeStampRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainBpsDataByTimeStampWithOptions(request, runtime);
    }

    public DescribeLiveStreamTranscodeStreamNumResponse describeLiveStreamTranscodeStreamNumWithOptions(DescribeLiveStreamTranscodeStreamNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamTranscodeStreamNum", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamTranscodeStreamNumResponse());
    }

    public DescribeLiveStreamTranscodeStreamNumResponse describeLiveStreamTranscodeStreamNum(DescribeLiveStreamTranscodeStreamNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamTranscodeStreamNumWithOptions(request, runtime);
    }

    public UpdateLiveTopLevelDomainResponse updateLiveTopLevelDomainWithOptions(UpdateLiveTopLevelDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveTopLevelDomain", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveTopLevelDomainResponse());
    }

    public UpdateLiveTopLevelDomainResponse updateLiveTopLevelDomain(UpdateLiveTopLevelDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveTopLevelDomainWithOptions(request, runtime);
    }

    public DescribeLiveDomainCertificateInfoResponse describeLiveDomainCertificateInfoWithOptions(DescribeLiveDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainCertificateInfo", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainCertificateInfoResponse());
    }

    public DescribeLiveDomainCertificateInfoResponse describeLiveDomainCertificateInfo(DescribeLiveDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainCertificateInfoWithOptions(request, runtime);
    }

    public ModifyLiveDomainSchdmByPropertyResponse modifyLiveDomainSchdmByPropertyWithOptions(ModifyLiveDomainSchdmByPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyLiveDomainSchdmByProperty", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyLiveDomainSchdmByPropertyResponse());
    }

    public ModifyLiveDomainSchdmByPropertyResponse modifyLiveDomainSchdmByProperty(ModifyLiveDomainSchdmByPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLiveDomainSchdmByPropertyWithOptions(request, runtime);
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setLiveStreamOptimizedFeatureConfigWithOptions(SetLiveStreamOptimizedFeatureConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetLiveStreamOptimizedFeatureConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetLiveStreamOptimizedFeatureConfigResponse());
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setLiveStreamOptimizedFeatureConfig(SetLiveStreamOptimizedFeatureConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLiveStreamOptimizedFeatureConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse describeLiveStreamOptimizedFeatureConfigWithOptions(DescribeLiveStreamOptimizedFeatureConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamOptimizedFeatureConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamOptimizedFeatureConfigResponse());
    }

    public DescribeLiveStreamOptimizedFeatureConfigResponse describeLiveStreamOptimizedFeatureConfig(DescribeLiveStreamOptimizedFeatureConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamOptimizedFeatureConfigWithOptions(request, runtime);
    }

    public SetLiveStreamDelayConfigResponse setLiveStreamDelayConfigWithOptions(SetLiveStreamDelayConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetLiveStreamDelayConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetLiveStreamDelayConfigResponse());
    }

    public SetLiveStreamDelayConfigResponse setLiveStreamDelayConfig(SetLiveStreamDelayConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLiveStreamDelayConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamDelayConfigResponse describeLiveStreamDelayConfigWithOptions(DescribeLiveStreamDelayConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamDelayConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamDelayConfigResponse());
    }

    public DescribeLiveStreamDelayConfigResponse describeLiveStreamDelayConfig(DescribeLiveStreamDelayConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamDelayConfigWithOptions(request, runtime);
    }

    public DescribeLiveDomainOnlineUserNumResponse describeLiveDomainOnlineUserNumWithOptions(DescribeLiveDomainOnlineUserNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainOnlineUserNum", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainOnlineUserNumResponse());
    }

    public DescribeLiveDomainOnlineUserNumResponse describeLiveDomainOnlineUserNum(DescribeLiveDomainOnlineUserNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainOnlineUserNumWithOptions(request, runtime);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse describeLiveDomainFrameRateAndBitRateDataWithOptions(DescribeLiveDomainFrameRateAndBitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainFrameRateAndBitRateData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainFrameRateAndBitRateDataResponse());
    }

    public DescribeLiveDomainFrameRateAndBitRateDataResponse describeLiveDomainFrameRateAndBitRateData(DescribeLiveDomainFrameRateAndBitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainFrameRateAndBitRateDataWithOptions(request, runtime);
    }

    public SetBoardCallbackResponse setBoardCallbackWithOptions(SetBoardCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetBoardCallback", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetBoardCallbackResponse());
    }

    public SetBoardCallbackResponse setBoardCallback(SetBoardCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBoardCallbackWithOptions(request, runtime);
    }

    public DescribeRecordsResponse describeRecordsWithOptions(DescribeRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecords", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordsResponse());
    }

    public DescribeRecordsResponse describeRecords(DescribeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordsWithOptions(request, runtime);
    }

    public DescribeRecordResponse describeRecordWithOptions(DescribeRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecord", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordResponse());
    }

    public DescribeRecordResponse describeRecord(DescribeRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordWithOptions(request, runtime);
    }

    public CompleteBoardRecordResponse completeBoardRecordWithOptions(CompleteBoardRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompleteBoardRecord", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CompleteBoardRecordResponse());
    }

    public CompleteBoardRecordResponse completeBoardRecord(CompleteBoardRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeBoardRecordWithOptions(request, runtime);
    }

    public StartBoardRecordResponse startBoardRecordWithOptions(StartBoardRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartBoardRecord", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StartBoardRecordResponse());
    }

    public StartBoardRecordResponse startBoardRecord(StartBoardRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startBoardRecordWithOptions(request, runtime);
    }

    public ApplyRecordTokenResponse applyRecordTokenWithOptions(ApplyRecordTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyRecordToken", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ApplyRecordTokenResponse());
    }

    public ApplyRecordTokenResponse applyRecordToken(ApplyRecordTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyRecordTokenWithOptions(request, runtime);
    }

    public UpdateBoardCallbackResponse updateBoardCallbackWithOptions(UpdateBoardCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateBoardCallback", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateBoardCallbackResponse());
    }

    public UpdateBoardCallbackResponse updateBoardCallback(UpdateBoardCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBoardCallbackWithOptions(request, runtime);
    }

    public DescribeLiveDomainMappingResponse describeLiveDomainMappingWithOptions(DescribeLiveDomainMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainMapping", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLiveDomainMappingResponse());
    }

    public DescribeLiveDomainMappingResponse describeLiveDomainMapping(DescribeLiveDomainMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainMappingWithOptions(request, runtime);
    }

    public StopLiveIndexResponse stopLiveIndexWithOptions(StopLiveIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopLiveIndex", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StopLiveIndexResponse());
    }

    public StopLiveIndexResponse stopLiveIndex(StopLiveIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLiveIndexWithOptions(request, runtime);
    }

    public StartLiveIndexResponse startLiveIndexWithOptions(StartLiveIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartLiveIndex", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StartLiveIndexResponse());
    }

    public StartLiveIndexResponse startLiveIndex(StartLiveIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLiveIndexWithOptions(request, runtime);
    }

    public RealTimeSnapshotCommandResponse realTimeSnapshotCommandWithOptions(RealTimeSnapshotCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RealTimeSnapshotCommand", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new RealTimeSnapshotCommandResponse());
    }

    public RealTimeSnapshotCommandResponse realTimeSnapshotCommand(RealTimeSnapshotCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.realTimeSnapshotCommandWithOptions(request, runtime);
    }

    public DescribeLiveTopDomainsByFlowResponse describeLiveTopDomainsByFlowWithOptions(DescribeLiveTopDomainsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveTopDomainsByFlow", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveTopDomainsByFlowResponse());
    }

    public DescribeLiveTopDomainsByFlowResponse describeLiveTopDomainsByFlow(DescribeLiveTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeBpsDataResponse describeLiveDomainRealTimeBpsDataWithOptions(DescribeLiveDomainRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainRealTimeBpsData", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLiveDomainRealTimeBpsDataResponse());
    }

    public DescribeLiveDomainRealTimeBpsDataResponse describeLiveDomainRealTimeBpsData(DescribeLiveDomainRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainRealTimeBpsDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse describeLiveDomainRealTimeHttpCodeDataWithOptions(DescribeLiveDomainRealTimeHttpCodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainRealTimeHttpCodeData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainRealTimeHttpCodeDataResponse());
    }

    public DescribeLiveDomainRealTimeHttpCodeDataResponse describeLiveDomainRealTimeHttpCodeData(DescribeLiveDomainRealTimeHttpCodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainRealTimeHttpCodeDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse describeLiveDomainRealTimeTrafficDataWithOptions(DescribeLiveDomainRealTimeTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainRealTimeTrafficData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainRealTimeTrafficDataResponse());
    }

    public DescribeLiveDomainRealTimeTrafficDataResponse describeLiveDomainRealTimeTrafficData(DescribeLiveDomainRealTimeTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainRealTimeTrafficDataWithOptions(request, runtime);
    }

    public AddLiveDomainPlayMappingResponse addLiveDomainPlayMappingWithOptions(AddLiveDomainPlayMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveDomainPlayMapping", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveDomainPlayMappingResponse());
    }

    public AddLiveDomainPlayMappingResponse addLiveDomainPlayMapping(AddLiveDomainPlayMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveDomainPlayMappingWithOptions(request, runtime);
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse deleteLiveLazyPullStreamInfoConfigWithOptions(DeleteLiveLazyPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveLazyPullStreamInfoConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveLazyPullStreamInfoConfigResponse());
    }

    public DeleteLiveLazyPullStreamInfoConfigResponse deleteLiveLazyPullStreamInfoConfig(DeleteLiveLazyPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveLazyPullStreamInfoConfigWithOptions(request, runtime);
    }

    public DescribeLiveLazyPullStreamConfigResponse describeLiveLazyPullStreamConfigWithOptions(DescribeLiveLazyPullStreamConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveLazyPullStreamConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveLazyPullStreamConfigResponse());
    }

    public DescribeLiveLazyPullStreamConfigResponse describeLiveLazyPullStreamConfig(DescribeLiveLazyPullStreamConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveLazyPullStreamConfigWithOptions(request, runtime);
    }

    public SetLiveLazyPullStreamInfoConfigResponse setLiveLazyPullStreamInfoConfigWithOptions(SetLiveLazyPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetLiveLazyPullStreamInfoConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetLiveLazyPullStreamInfoConfigResponse());
    }

    public SetLiveLazyPullStreamInfoConfigResponse setLiveLazyPullStreamInfoConfig(SetLiveLazyPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLiveLazyPullStreamInfoConfigWithOptions(request, runtime);
    }

    public UpdateCasterSceneAudioResponse updateCasterSceneAudioWithOptions(UpdateCasterSceneAudioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCasterSceneAudio", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateCasterSceneAudioResponse());
    }

    public UpdateCasterSceneAudioResponse updateCasterSceneAudio(UpdateCasterSceneAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCasterSceneAudioWithOptions(request, runtime);
    }

    public SetCasterChannelResponse setCasterChannelWithOptions(SetCasterChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCasterChannel", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetCasterChannelResponse());
    }

    public SetCasterChannelResponse setCasterChannel(SetCasterChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCasterChannelWithOptions(request, runtime);
    }

    public DescribeCasterSceneAudioResponse describeCasterSceneAudioWithOptions(DescribeCasterSceneAudioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterSceneAudio", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterSceneAudioResponse());
    }

    public DescribeCasterSceneAudioResponse describeCasterSceneAudio(DescribeCasterSceneAudioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterSceneAudioWithOptions(request, runtime);
    }

    public DescribeCasterChannelsResponse describeCasterChannelsWithOptions(DescribeCasterChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterChannels", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterChannelsResponse());
    }

    public DescribeCasterChannelsResponse describeCasterChannels(DescribeCasterChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterChannelsWithOptions(request, runtime);
    }

    public UpdateBoardResponse updateBoardWithOptions(UpdateBoardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateBoard", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateBoardResponse());
    }

    public UpdateBoardResponse updateBoard(UpdateBoardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBoardWithOptions(request, runtime);
    }

    public JoinBoardResponse joinBoardWithOptions(JoinBoardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinBoard", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new JoinBoardResponse());
    }

    public JoinBoardResponse joinBoard(JoinBoardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinBoardWithOptions(request, runtime);
    }

    public DescribeBoardSnapshotResponse describeBoardSnapshotWithOptions(DescribeBoardSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBoardSnapshot", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBoardSnapshotResponse());
    }

    public DescribeBoardSnapshotResponse describeBoardSnapshot(DescribeBoardSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBoardSnapshotWithOptions(request, runtime);
    }

    public DescribeBoardsResponse describeBoardsWithOptions(DescribeBoardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBoards", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBoardsResponse());
    }

    public DescribeBoardsResponse describeBoards(DescribeBoardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBoardsWithOptions(request, runtime);
    }

    public DescribeBoardEventsResponse describeBoardEventsWithOptions(DescribeBoardEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBoardEvents", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBoardEventsResponse());
    }

    public DescribeBoardEventsResponse describeBoardEvents(DescribeBoardEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBoardEventsWithOptions(request, runtime);
    }

    public DeleteBoardResponse deleteBoardWithOptions(DeleteBoardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBoard", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBoardResponse());
    }

    public DeleteBoardResponse deleteBoard(DeleteBoardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBoardWithOptions(request, runtime);
    }

    public CreateBoardResponse createBoardWithOptions(CreateBoardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateBoard", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateBoardResponse());
    }

    public CreateBoardResponse createBoard(CreateBoardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBoardWithOptions(request, runtime);
    }

    public CompleteBoardResponse completeBoardWithOptions(CompleteBoardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CompleteBoard", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CompleteBoardResponse());
    }

    public CompleteBoardResponse completeBoard(CompleteBoardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeBoardWithOptions(request, runtime);
    }

    public ApplyBoardTokenResponse applyBoardTokenWithOptions(ApplyBoardTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyBoardToken", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ApplyBoardTokenResponse());
    }

    public ApplyBoardTokenResponse applyBoardToken(ApplyBoardTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyBoardTokenWithOptions(request, runtime);
    }

    public DescribeLiveStreamCountResponse describeLiveStreamCountWithOptions(DescribeLiveStreamCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamCount", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeLiveStreamCountResponse());
    }

    public DescribeLiveStreamCountResponse describeLiveStreamCount(DescribeLiveStreamCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamCountWithOptions(request, runtime);
    }

    public DescribeLiveCertificateDetailResponse describeLiveCertificateDetailWithOptions(DescribeLiveCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveCertificateDetail", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveCertificateDetailResponse());
    }

    public DescribeLiveCertificateDetailResponse describeLiveCertificateDetail(DescribeLiveCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveCertificateDetailWithOptions(request, runtime);
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse describeHlsLiveStreamRealTimeBpsDataWithOptions(DescribeHlsLiveStreamRealTimeBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHlsLiveStreamRealTimeBpsData", "HTTPS", "GET", "2016-11-01", "AK", TeaModel.buildMap(request), null, runtime), new DescribeHlsLiveStreamRealTimeBpsDataResponse());
    }

    public DescribeHlsLiveStreamRealTimeBpsDataResponse describeHlsLiveStreamRealTimeBpsData(DescribeHlsLiveStreamRealTimeBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHlsLiveStreamRealTimeBpsDataWithOptions(request, runtime);
    }

    public StopLiveDomainResponse stopLiveDomainWithOptions(StopLiveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopLiveDomain", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StopLiveDomainResponse());
    }

    public StopLiveDomainResponse stopLiveDomain(StopLiveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLiveDomainWithOptions(request, runtime);
    }

    public StartLiveDomainResponse startLiveDomainWithOptions(StartLiveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartLiveDomain", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StartLiveDomainResponse());
    }

    public StartLiveDomainResponse startLiveDomain(StartLiveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLiveDomainWithOptions(request, runtime);
    }

    public SetLiveDomainCertificateResponse setLiveDomainCertificateWithOptions(SetLiveDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetLiveDomainCertificate", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetLiveDomainCertificateResponse());
    }

    public SetLiveDomainCertificateResponse setLiveDomainCertificate(SetLiveDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLiveDomainCertificateWithOptions(request, runtime);
    }

    public BatchSetLiveDomainConfigsResponse batchSetLiveDomainConfigsWithOptions(BatchSetLiveDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchSetLiveDomainConfigs", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new BatchSetLiveDomainConfigsResponse());
    }

    public BatchSetLiveDomainConfigsResponse batchSetLiveDomainConfigs(BatchSetLiveDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetLiveDomainConfigsWithOptions(request, runtime);
    }

    public DescribeLiveCertificateListResponse describeLiveCertificateListWithOptions(DescribeLiveCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveCertificateList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveCertificateListResponse());
    }

    public DescribeLiveCertificateListResponse describeLiveCertificateList(DescribeLiveCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveCertificateListWithOptions(request, runtime);
    }

    public DeleteLiveDomainResponse deleteLiveDomainWithOptions(DeleteLiveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveDomain", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveDomainResponse());
    }

    public DeleteLiveDomainResponse deleteLiveDomain(DeleteLiveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveDomainWithOptions(request, runtime);
    }

    public DescribeLiveDomainConfigsResponse describeLiveDomainConfigsWithOptions(DescribeLiveDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainConfigs", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainConfigsResponse());
    }

    public DescribeLiveDomainConfigsResponse describeLiveDomainConfigs(DescribeLiveDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainConfigsWithOptions(request, runtime);
    }

    public AddLiveDomainResponse addLiveDomainWithOptions(AddLiveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveDomain", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveDomainResponse());
    }

    public AddLiveDomainResponse addLiveDomain(AddLiveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveDomainWithOptions(request, runtime);
    }

    public DescribeLiveDomainDetailResponse describeLiveDomainDetailWithOptions(DescribeLiveDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainDetail", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainDetailResponse());
    }

    public DescribeLiveDomainDetailResponse describeLiveDomainDetail(DescribeLiveDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainDetailWithOptions(request, runtime);
    }

    public BatchDeleteLiveDomainConfigsResponse batchDeleteLiveDomainConfigsWithOptions(BatchDeleteLiveDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDeleteLiveDomainConfigs", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new BatchDeleteLiveDomainConfigsResponse());
    }

    public BatchDeleteLiveDomainConfigsResponse batchDeleteLiveDomainConfigs(BatchDeleteLiveDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteLiveDomainConfigsWithOptions(request, runtime);
    }

    public DescribeRoomStatusResponse describeRoomStatusWithOptions(DescribeRoomStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRoomStatus", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRoomStatusResponse());
    }

    public DescribeRoomStatusResponse describeRoomStatus(DescribeRoomStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoomStatusWithOptions(request, runtime);
    }

    public DescribeRoomListResponse describeRoomListWithOptions(DescribeRoomListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRoomList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRoomListResponse());
    }

    public DescribeRoomListResponse describeRoomList(DescribeRoomListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoomListWithOptions(request, runtime);
    }

    public DescribeRoomKickoutUserListResponse describeRoomKickoutUserListWithOptions(DescribeRoomKickoutUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRoomKickoutUserList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRoomKickoutUserListResponse());
    }

    public DescribeRoomKickoutUserListResponse describeRoomKickoutUserList(DescribeRoomKickoutUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRoomKickoutUserListWithOptions(request, runtime);
    }

    public SendRoomUserNotificationResponse sendRoomUserNotificationWithOptions(SendRoomUserNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendRoomUserNotification", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SendRoomUserNotificationResponse());
    }

    public SendRoomUserNotificationResponse sendRoomUserNotification(SendRoomUserNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRoomUserNotificationWithOptions(request, runtime);
    }

    public DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomListWithOptions(DescribeForbidPushStreamRoomListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeForbidPushStreamRoomList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeForbidPushStreamRoomListResponse());
    }

    public DescribeForbidPushStreamRoomListResponse describeForbidPushStreamRoomList(DescribeForbidPushStreamRoomListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeForbidPushStreamRoomListWithOptions(request, runtime);
    }

    public SendRoomNotificationResponse sendRoomNotificationWithOptions(SendRoomNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendRoomNotification", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SendRoomNotificationResponse());
    }

    public SendRoomNotificationResponse sendRoomNotification(SendRoomNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRoomNotificationWithOptions(request, runtime);
    }

    public ForbidPushStreamResponse forbidPushStreamWithOptions(ForbidPushStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ForbidPushStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ForbidPushStreamResponse());
    }

    public ForbidPushStreamResponse forbidPushStream(ForbidPushStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forbidPushStreamWithOptions(request, runtime);
    }

    public DeleteRoomResponse deleteRoomWithOptions(DeleteRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRoom", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRoomResponse());
    }

    public DeleteRoomResponse deleteRoom(DeleteRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoomWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRoom", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public AllowPushStreamResponse allowPushStreamWithOptions(AllowPushStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllowPushStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AllowPushStreamResponse());
    }

    public AllowPushStreamResponse allowPushStream(AllowPushStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allowPushStreamWithOptions(request, runtime);
    }

    public DescribeLiveUserDomainsResponse describeLiveUserDomainsWithOptions(DescribeLiveUserDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveUserDomains", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveUserDomainsResponse());
    }

    public DescribeLiveUserDomainsResponse describeLiveUserDomains(DescribeLiveUserDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveUserDomainsWithOptions(request, runtime);
    }

    public DescribeCasterRtcInfoResponse describeCasterRtcInfoWithOptions(DescribeCasterRtcInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterRtcInfo", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterRtcInfoResponse());
    }

    public DescribeCasterRtcInfoResponse describeCasterRtcInfo(DescribeCasterRtcInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterRtcInfoWithOptions(request, runtime);
    }

    public DescribeUpBpsPeakDataResponse describeUpBpsPeakDataWithOptions(DescribeUpBpsPeakDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUpBpsPeakData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUpBpsPeakDataResponse());
    }

    public DescribeUpBpsPeakDataResponse describeUpBpsPeakData(DescribeUpBpsPeakDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpBpsPeakDataWithOptions(request, runtime);
    }

    public DescribeUpBpsPeakOfLineResponse describeUpBpsPeakOfLineWithOptions(DescribeUpBpsPeakOfLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUpBpsPeakOfLine", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUpBpsPeakOfLineResponse());
    }

    public DescribeUpBpsPeakOfLineResponse describeUpBpsPeakOfLine(DescribeUpBpsPeakOfLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpBpsPeakOfLineWithOptions(request, runtime);
    }

    public DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamDataWithOptions(DescribeUpPeakPublishStreamDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUpPeakPublishStreamData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUpPeakPublishStreamDataResponse());
    }

    public DescribeUpPeakPublishStreamDataResponse describeUpPeakPublishStreamData(DescribeUpPeakPublishStreamDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUpPeakPublishStreamDataWithOptions(request, runtime);
    }

    public DeleteLiveDomainMappingResponse deleteLiveDomainMappingWithOptions(DeleteLiveDomainMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveDomainMapping", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveDomainMappingResponse());
    }

    public DeleteLiveDomainMappingResponse deleteLiveDomainMapping(DeleteLiveDomainMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveDomainMappingWithOptions(request, runtime);
    }

    public AddLiveDomainMappingResponse addLiveDomainMappingWithOptions(AddLiveDomainMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveDomainMapping", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveDomainMappingResponse());
    }

    public AddLiveDomainMappingResponse addLiveDomainMapping(AddLiveDomainMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveDomainMappingWithOptions(request, runtime);
    }

    public AddCasterEpisodeGroupContentResponse addCasterEpisodeGroupContentWithOptions(AddCasterEpisodeGroupContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterEpisodeGroupContent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterEpisodeGroupContentResponse());
    }

    public AddCasterEpisodeGroupContentResponse addCasterEpisodeGroupContent(AddCasterEpisodeGroupContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterEpisodeGroupContentWithOptions(request, runtime);
    }

    public ModifyCasterProgramResponse modifyCasterProgramWithOptions(ModifyCasterProgramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCasterProgram", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCasterProgramResponse());
    }

    public ModifyCasterProgramResponse modifyCasterProgram(ModifyCasterProgramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCasterProgramWithOptions(request, runtime);
    }

    public ModifyCasterEpisodeResponse modifyCasterEpisodeWithOptions(ModifyCasterEpisodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCasterEpisode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCasterEpisodeResponse());
    }

    public ModifyCasterEpisodeResponse modifyCasterEpisode(ModifyCasterEpisodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCasterEpisodeWithOptions(request, runtime);
    }

    public DescribeCasterProgramResponse describeCasterProgramWithOptions(DescribeCasterProgramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterProgram", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterProgramResponse());
    }

    public DescribeCasterProgramResponse describeCasterProgram(DescribeCasterProgramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterProgramWithOptions(request, runtime);
    }

    public DeleteCasterProgramResponse deleteCasterProgramWithOptions(DeleteCasterProgramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterProgram", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterProgramResponse());
    }

    public DeleteCasterProgramResponse deleteCasterProgram(DeleteCasterProgramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterProgramWithOptions(request, runtime);
    }

    public DeleteCasterEpisodeGroupResponse deleteCasterEpisodeGroupWithOptions(DeleteCasterEpisodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterEpisodeGroup", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterEpisodeGroupResponse());
    }

    public DeleteCasterEpisodeGroupResponse deleteCasterEpisodeGroup(DeleteCasterEpisodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterEpisodeGroupWithOptions(request, runtime);
    }

    public DeleteCasterEpisodeResponse deleteCasterEpisodeWithOptions(DeleteCasterEpisodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterEpisode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterEpisodeResponse());
    }

    public DeleteCasterEpisodeResponse deleteCasterEpisode(DeleteCasterEpisodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterEpisodeWithOptions(request, runtime);
    }

    public AddCasterProgramResponse addCasterProgramWithOptions(AddCasterProgramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterProgram", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterProgramResponse());
    }

    public AddCasterProgramResponse addCasterProgram(AddCasterProgramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterProgramWithOptions(request, runtime);
    }

    public AddCasterEpisodeGroupResponse addCasterEpisodeGroupWithOptions(AddCasterEpisodeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterEpisodeGroup", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterEpisodeGroupResponse());
    }

    public AddCasterEpisodeGroupResponse addCasterEpisodeGroup(AddCasterEpisodeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterEpisodeGroupWithOptions(request, runtime);
    }

    public AddCasterEpisodeResponse addCasterEpisodeWithOptions(AddCasterEpisodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterEpisode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterEpisodeResponse());
    }

    public AddCasterEpisodeResponse addCasterEpisode(AddCasterEpisodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterEpisodeWithOptions(request, runtime);
    }

    public DescribeLiveDomainTranscodeDataResponse describeLiveDomainTranscodeDataWithOptions(DescribeLiveDomainTranscodeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainTranscodeData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainTranscodeDataResponse());
    }

    public DescribeLiveDomainTranscodeDataResponse describeLiveDomainTranscodeData(DescribeLiveDomainTranscodeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainTranscodeDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainSnapshotDataResponse describeLiveDomainSnapshotDataWithOptions(DescribeLiveDomainSnapshotDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainSnapshotData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainSnapshotDataResponse());
    }

    public DescribeLiveDomainSnapshotDataResponse describeLiveDomainSnapshotData(DescribeLiveDomainSnapshotDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainSnapshotDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainRecordDataResponse describeLiveDomainRecordDataWithOptions(DescribeLiveDomainRecordDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainRecordData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainRecordDataResponse());
    }

    public DescribeLiveDomainRecordDataResponse describeLiveDomainRecordData(DescribeLiveDomainRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainRecordDataWithOptions(request, runtime);
    }

    public RealTimeRecordCommandResponse realTimeRecordCommandWithOptions(RealTimeRecordCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RealTimeRecordCommand", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new RealTimeRecordCommandResponse());
    }

    public RealTimeRecordCommandResponse realTimeRecordCommand(RealTimeRecordCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.realTimeRecordCommandWithOptions(request, runtime);
    }

    public DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficDataWithOptions(DescribeLiveDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainTrafficData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainTrafficDataResponse());
    }

    public DescribeLiveDomainTrafficDataResponse describeLiveDomainTrafficData(DescribeLiveDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeLiveDomainBpsDataResponse describeLiveDomainBpsDataWithOptions(DescribeLiveDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDomainBpsData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDomainBpsDataResponse());
    }

    public DescribeLiveDomainBpsDataResponse describeLiveDomainBpsData(DescribeLiveDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDomainBpsDataWithOptions(request, runtime);
    }

    public AddTrancodeSEIResponse addTrancodeSEIWithOptions(AddTrancodeSEIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTrancodeSEI", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddTrancodeSEIResponse());
    }

    public AddTrancodeSEIResponse addTrancodeSEI(AddTrancodeSEIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTrancodeSEIWithOptions(request, runtime);
    }

    public DeleteCasterSceneConfigResponse deleteCasterSceneConfigWithOptions(DeleteCasterSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterSceneConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterSceneConfigResponse());
    }

    public DeleteCasterSceneConfigResponse deleteCasterSceneConfig(DeleteCasterSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterSceneConfigWithOptions(request, runtime);
    }

    public AddCustomLiveStreamTranscodeResponse addCustomLiveStreamTranscodeWithOptions(AddCustomLiveStreamTranscodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCustomLiveStreamTranscode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCustomLiveStreamTranscodeResponse());
    }

    public AddCustomLiveStreamTranscodeResponse addCustomLiveStreamTranscode(AddCustomLiveStreamTranscodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomLiveStreamTranscodeWithOptions(request, runtime);
    }

    public DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigsWithOptions(DescribeLiveRecordVodConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveRecordVodConfigs", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveRecordVodConfigsResponse());
    }

    public DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigs(DescribeLiveRecordVodConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveRecordVodConfigsWithOptions(request, runtime);
    }

    public DeleteLiveRecordVodConfigResponse deleteLiveRecordVodConfigWithOptions(DeleteLiveRecordVodConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveRecordVodConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveRecordVodConfigResponse());
    }

    public DeleteLiveRecordVodConfigResponse deleteLiveRecordVodConfig(DeleteLiveRecordVodConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRecordVodConfigWithOptions(request, runtime);
    }

    public AddLiveRecordVodConfigResponse addLiveRecordVodConfigWithOptions(AddLiveRecordVodConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveRecordVodConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveRecordVodConfigResponse());
    }

    public AddLiveRecordVodConfigResponse addLiveRecordVodConfig(AddLiveRecordVodConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveRecordVodConfigWithOptions(request, runtime);
    }

    public ModifyCasterComponentResponse modifyCasterComponentWithOptions(ModifyCasterComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCasterComponent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCasterComponentResponse());
    }

    public ModifyCasterComponentResponse modifyCasterComponent(ModifyCasterComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCasterComponentWithOptions(request, runtime);
    }

    public DescribeCasterComponentsResponse describeCasterComponentsWithOptions(DescribeCasterComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterComponents", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterComponentsResponse());
    }

    public DescribeCasterComponentsResponse describeCasterComponents(DescribeCasterComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterComponentsWithOptions(request, runtime);
    }

    public DeleteCasterComponentResponse deleteCasterComponentWithOptions(DeleteCasterComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterComponent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterComponentResponse());
    }

    public DeleteCasterComponentResponse deleteCasterComponent(DeleteCasterComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterComponentWithOptions(request, runtime);
    }

    public AddCasterComponentResponse addCasterComponentWithOptions(AddCasterComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterComponent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterComponentResponse());
    }

    public AddCasterComponentResponse addCasterComponent(AddCasterComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterComponentWithOptions(request, runtime);
    }

    public StopCasterResponse stopCasterWithOptions(StopCasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopCaster", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StopCasterResponse());
    }

    public StopCasterResponse stopCaster(StopCasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCasterWithOptions(request, runtime);
    }

    public StartCasterResponse startCasterWithOptions(StartCasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartCaster", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StartCasterResponse());
    }

    public StartCasterResponse startCaster(StartCasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCasterWithOptions(request, runtime);
    }

    public DescribeLiveStreamHistoryUserNumResponse describeLiveStreamHistoryUserNumWithOptions(DescribeLiveStreamHistoryUserNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamHistoryUserNum", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamHistoryUserNumResponse());
    }

    public DescribeLiveStreamHistoryUserNumResponse describeLiveStreamHistoryUserNum(DescribeLiveStreamHistoryUserNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamHistoryUserNumWithOptions(request, runtime);
    }

    public UpdateCasterSceneConfigResponse updateCasterSceneConfigWithOptions(UpdateCasterSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCasterSceneConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateCasterSceneConfigResponse());
    }

    public UpdateCasterSceneConfigResponse updateCasterSceneConfig(UpdateCasterSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCasterSceneConfigWithOptions(request, runtime);
    }

    public StopCasterSceneResponse stopCasterSceneWithOptions(StopCasterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopCasterScene", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StopCasterSceneResponse());
    }

    public StopCasterSceneResponse stopCasterScene(StopCasterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCasterSceneWithOptions(request, runtime);
    }

    public StartCasterSceneResponse startCasterSceneWithOptions(StartCasterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartCasterScene", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new StartCasterSceneResponse());
    }

    public StartCasterSceneResponse startCasterScene(StartCasterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCasterSceneWithOptions(request, runtime);
    }

    public SetCasterSceneConfigResponse setCasterSceneConfigWithOptions(SetCasterSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCasterSceneConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetCasterSceneConfigResponse());
    }

    public SetCasterSceneConfigResponse setCasterSceneConfig(SetCasterSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCasterSceneConfigWithOptions(request, runtime);
    }

    public SetCasterConfigResponse setCasterConfigWithOptions(SetCasterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetCasterConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetCasterConfigResponse());
    }

    public SetCasterConfigResponse setCasterConfig(SetCasterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCasterConfigWithOptions(request, runtime);
    }

    public ModifyCasterVideoResourceResponse modifyCasterVideoResourceWithOptions(ModifyCasterVideoResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCasterVideoResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCasterVideoResourceResponse());
    }

    public ModifyCasterVideoResourceResponse modifyCasterVideoResource(ModifyCasterVideoResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCasterVideoResourceWithOptions(request, runtime);
    }

    public ModifyCasterLayoutResponse modifyCasterLayoutWithOptions(ModifyCasterLayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCasterLayout", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCasterLayoutResponse());
    }

    public ModifyCasterLayoutResponse modifyCasterLayout(ModifyCasterLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCasterLayoutWithOptions(request, runtime);
    }

    public EffectCasterVideoResourceResponse effectCasterVideoResourceWithOptions(EffectCasterVideoResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EffectCasterVideoResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new EffectCasterVideoResourceResponse());
    }

    public EffectCasterVideoResourceResponse effectCasterVideoResource(EffectCasterVideoResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectCasterVideoResourceWithOptions(request, runtime);
    }

    public EffectCasterUrgentResponse effectCasterUrgentWithOptions(EffectCasterUrgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EffectCasterUrgent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new EffectCasterUrgentResponse());
    }

    public EffectCasterUrgentResponse effectCasterUrgent(EffectCasterUrgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.effectCasterUrgentWithOptions(request, runtime);
    }

    public DescribeCasterVideoResourcesResponse describeCasterVideoResourcesWithOptions(DescribeCasterVideoResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterVideoResources", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterVideoResourcesResponse());
    }

    public DescribeCasterVideoResourcesResponse describeCasterVideoResources(DescribeCasterVideoResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterVideoResourcesWithOptions(request, runtime);
    }

    public DescribeCasterStreamUrlResponse describeCasterStreamUrlWithOptions(DescribeCasterStreamUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterStreamUrl", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterStreamUrlResponse());
    }

    public DescribeCasterStreamUrlResponse describeCasterStreamUrl(DescribeCasterStreamUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterStreamUrlWithOptions(request, runtime);
    }

    public DescribeCasterScenesResponse describeCasterScenesWithOptions(DescribeCasterScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterScenes", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterScenesResponse());
    }

    public DescribeCasterScenesResponse describeCasterScenes(DescribeCasterScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterScenesWithOptions(request, runtime);
    }

    public DescribeCastersResponse describeCastersWithOptions(DescribeCastersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasters", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCastersResponse());
    }

    public DescribeCastersResponse describeCasters(DescribeCastersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCastersWithOptions(request, runtime);
    }

    public DescribeCasterLayoutsResponse describeCasterLayoutsWithOptions(DescribeCasterLayoutsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterLayouts", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterLayoutsResponse());
    }

    public DescribeCasterLayoutsResponse describeCasterLayouts(DescribeCasterLayoutsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterLayoutsWithOptions(request, runtime);
    }

    public DescribeCasterConfigResponse describeCasterConfigWithOptions(DescribeCasterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCasterConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCasterConfigResponse());
    }

    public DescribeCasterConfigResponse describeCasterConfig(DescribeCasterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCasterConfigWithOptions(request, runtime);
    }

    public DeleteCasterVideoResourceResponse deleteCasterVideoResourceWithOptions(DeleteCasterVideoResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterVideoResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterVideoResourceResponse());
    }

    public DeleteCasterVideoResourceResponse deleteCasterVideoResource(DeleteCasterVideoResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterVideoResourceWithOptions(request, runtime);
    }

    public DeleteCasterLayoutResponse deleteCasterLayoutWithOptions(DeleteCasterLayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCasterLayout", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterLayoutResponse());
    }

    public DeleteCasterLayoutResponse deleteCasterLayout(DeleteCasterLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterLayoutWithOptions(request, runtime);
    }

    public DeleteCasterResponse deleteCasterWithOptions(DeleteCasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCaster", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCasterResponse());
    }

    public DeleteCasterResponse deleteCaster(DeleteCasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCasterWithOptions(request, runtime);
    }

    public CreateCasterResponse createCasterWithOptions(CreateCasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCaster", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateCasterResponse());
    }

    public CreateCasterResponse createCaster(CreateCasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCasterWithOptions(request, runtime);
    }

    public CopyCasterSceneConfigResponse copyCasterSceneConfigWithOptions(CopyCasterSceneConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyCasterSceneConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CopyCasterSceneConfigResponse());
    }

    public CopyCasterSceneConfigResponse copyCasterSceneConfig(CopyCasterSceneConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyCasterSceneConfigWithOptions(request, runtime);
    }

    public CopyCasterResponse copyCasterWithOptions(CopyCasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyCaster", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CopyCasterResponse());
    }

    public CopyCasterResponse copyCaster(CopyCasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyCasterWithOptions(request, runtime);
    }

    public AddCasterVideoResourceResponse addCasterVideoResourceWithOptions(AddCasterVideoResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterVideoResource", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterVideoResourceResponse());
    }

    public AddCasterVideoResourceResponse addCasterVideoResource(AddCasterVideoResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterVideoResourceWithOptions(request, runtime);
    }

    public AddCasterLayoutResponse addCasterLayoutWithOptions(AddCasterLayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCasterLayout", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddCasterLayoutResponse());
    }

    public AddCasterLayoutResponse addCasterLayout(AddCasterLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCasterLayoutWithOptions(request, runtime);
    }

    public DescribeLivePullStreamConfigResponse describeLivePullStreamConfigWithOptions(DescribeLivePullStreamConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLivePullStreamConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLivePullStreamConfigResponse());
    }

    public DescribeLivePullStreamConfigResponse describeLivePullStreamConfig(DescribeLivePullStreamConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLivePullStreamConfigWithOptions(request, runtime);
    }

    public DeleteLivePullStreamInfoConfigResponse deleteLivePullStreamInfoConfigWithOptions(DeleteLivePullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLivePullStreamInfoConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLivePullStreamInfoConfigResponse());
    }

    public DeleteLivePullStreamInfoConfigResponse deleteLivePullStreamInfoConfig(DeleteLivePullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLivePullStreamInfoConfigWithOptions(request, runtime);
    }

    public AddLivePullStreamInfoConfigResponse addLivePullStreamInfoConfigWithOptions(AddLivePullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLivePullStreamInfoConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLivePullStreamInfoConfigResponse());
    }

    public AddLivePullStreamInfoConfigResponse addLivePullStreamInfoConfig(AddLivePullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLivePullStreamInfoConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamBitRateDataResponse describeLiveStreamBitRateDataWithOptions(DescribeLiveStreamBitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamBitRateData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamBitRateDataResponse());
    }

    public DescribeLiveStreamBitRateDataResponse describeLiveStreamBitRateData(DescribeLiveStreamBitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamBitRateDataWithOptions(request, runtime);
    }

    public AddLiveDetectNotifyConfigResponse addLiveDetectNotifyConfigWithOptions(AddLiveDetectNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveDetectNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveDetectNotifyConfigResponse());
    }

    public AddLiveDetectNotifyConfigResponse addLiveDetectNotifyConfig(AddLiveDetectNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public AddLiveSnapshotDetectPornConfigResponse addLiveSnapshotDetectPornConfigWithOptions(AddLiveSnapshotDetectPornConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveSnapshotDetectPornConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveSnapshotDetectPornConfigResponse());
    }

    public AddLiveSnapshotDetectPornConfigResponse addLiveSnapshotDetectPornConfig(AddLiveSnapshotDetectPornConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public DeleteLiveDetectNotifyConfigResponse deleteLiveDetectNotifyConfigWithOptions(DeleteLiveDetectNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveDetectNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveDetectNotifyConfigResponse());
    }

    public DeleteLiveDetectNotifyConfigResponse deleteLiveDetectNotifyConfig(DeleteLiveDetectNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveDetectNotifyConfigResponse describeLiveDetectNotifyConfigWithOptions(DescribeLiveDetectNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveDetectNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveDetectNotifyConfigResponse());
    }

    public DescribeLiveDetectNotifyConfigResponse describeLiveDetectNotifyConfig(DescribeLiveDetectNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveSnapshotDetectPornConfigResponse deleteLiveSnapshotDetectPornConfigWithOptions(DeleteLiveSnapshotDetectPornConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveSnapshotDetectPornConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveSnapshotDetectPornConfigResponse());
    }

    public DeleteLiveSnapshotDetectPornConfigResponse deleteLiveSnapshotDetectPornConfig(DeleteLiveSnapshotDetectPornConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfigWithOptions(DescribeLiveSnapshotDetectPornConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveSnapshotDetectPornConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveSnapshotDetectPornConfigResponse());
    }

    public DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfig(DescribeLiveSnapshotDetectPornConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public UpdateLiveDetectNotifyConfigResponse updateLiveDetectNotifyConfigWithOptions(UpdateLiveDetectNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveDetectNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveDetectNotifyConfigResponse());
    }

    public UpdateLiveDetectNotifyConfigResponse updateLiveDetectNotifyConfig(UpdateLiveDetectNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveDetectNotifyConfigWithOptions(request, runtime);
    }

    public UpdateLiveSnapshotDetectPornConfigResponse updateLiveSnapshotDetectPornConfigWithOptions(UpdateLiveSnapshotDetectPornConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveSnapshotDetectPornConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveSnapshotDetectPornConfigResponse());
    }

    public UpdateLiveSnapshotDetectPornConfigResponse updateLiveSnapshotDetectPornConfig(UpdateLiveSnapshotDetectPornConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveSnapshotDetectPornConfigWithOptions(request, runtime);
    }

    public AddLiveRecordNotifyConfigResponse addLiveRecordNotifyConfigWithOptions(AddLiveRecordNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveRecordNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveRecordNotifyConfigResponse());
    }

    public AddLiveRecordNotifyConfigResponse addLiveRecordNotifyConfig(AddLiveRecordNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse deleteLiveStreamsNotifyUrlConfigWithOptions(DeleteLiveStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveStreamsNotifyUrlConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveStreamsNotifyUrlConfigResponse());
    }

    public DeleteLiveStreamsNotifyUrlConfigResponse deleteLiveStreamsNotifyUrlConfig(DeleteLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public DeleteLiveRecordNotifyConfigResponse deleteLiveRecordNotifyConfigWithOptions(DeleteLiveRecordNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveRecordNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveRecordNotifyConfigResponse());
    }

    public DeleteLiveRecordNotifyConfigResponse deleteLiveRecordNotifyConfig(DeleteLiveRecordNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveRecordNotifyConfigResponse describeLiveRecordNotifyConfigWithOptions(DescribeLiveRecordNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveRecordNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveRecordNotifyConfigResponse());
    }

    public DescribeLiveRecordNotifyConfigResponse describeLiveRecordNotifyConfig(DescribeLiveRecordNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse describeLiveStreamsNotifyUrlConfigWithOptions(DescribeLiveStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsNotifyUrlConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsNotifyUrlConfigResponse());
    }

    public DescribeLiveStreamsNotifyUrlConfigResponse describeLiveStreamsNotifyUrlConfig(DescribeLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public UpdateLiveRecordNotifyConfigResponse updateLiveRecordNotifyConfigWithOptions(UpdateLiveRecordNotifyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveRecordNotifyConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveRecordNotifyConfigResponse());
    }

    public UpdateLiveRecordNotifyConfigResponse updateLiveRecordNotifyConfig(UpdateLiveRecordNotifyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveRecordNotifyConfigWithOptions(request, runtime);
    }

    public DescribeLiveStreamsBlockListResponse describeLiveStreamsBlockListWithOptions(DescribeLiveStreamsBlockListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsBlockList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsBlockListResponse());
    }

    public DescribeLiveStreamsBlockListResponse describeLiveStreamsBlockList(DescribeLiveStreamsBlockListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsBlockListWithOptions(request, runtime);
    }

    public DescribeLiveStreamOnlineUserNumResponse describeLiveStreamOnlineUserNumWithOptions(DescribeLiveStreamOnlineUserNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamOnlineUserNum", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamOnlineUserNumResponse());
    }

    public DescribeLiveStreamOnlineUserNumResponse describeLiveStreamOnlineUserNum(DescribeLiveStreamOnlineUserNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamOnlineUserNumWithOptions(request, runtime);
    }

    public DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishListWithOptions(DescribeLiveStreamsPublishListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsPublishList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsPublishListResponse());
    }

    public DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishList(DescribeLiveStreamsPublishListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsPublishListWithOptions(request, runtime);
    }

    public DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineListWithOptions(DescribeLiveStreamsOnlineListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsOnlineList", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsOnlineListResponse());
    }

    public DescribeLiveStreamsOnlineListResponse describeLiveStreamsOnlineList(DescribeLiveStreamsOnlineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsOnlineListWithOptions(request, runtime);
    }

    public DescribeLiveStreamsControlHistoryResponse describeLiveStreamsControlHistoryWithOptions(DescribeLiveStreamsControlHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsControlHistory", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsControlHistoryResponse());
    }

    public DescribeLiveStreamsControlHistoryResponse describeLiveStreamsControlHistory(DescribeLiveStreamsControlHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsControlHistoryWithOptions(request, runtime);
    }

    public AddLiveStreamTranscodeResponse addLiveStreamTranscodeWithOptions(AddLiveStreamTranscodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveStreamTranscode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveStreamTranscodeResponse());
    }

    public AddLiveStreamTranscodeResponse addLiveStreamTranscode(AddLiveStreamTranscodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveStreamTranscodeWithOptions(request, runtime);
    }

    public DeleteLiveStreamTranscodeResponse deleteLiveStreamTranscodeWithOptions(DeleteLiveStreamTranscodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveStreamTranscode", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveStreamTranscodeResponse());
    }

    public DeleteLiveStreamTranscodeResponse deleteLiveStreamTranscode(DeleteLiveStreamTranscodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveStreamTranscodeWithOptions(request, runtime);
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse describeLiveStreamsFrameRateAndBitRateDataWithOptions(DescribeLiveStreamsFrameRateAndBitRateDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamsFrameRateAndBitRateData", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamsFrameRateAndBitRateDataResponse());
    }

    public DescribeLiveStreamsFrameRateAndBitRateDataResponse describeLiveStreamsFrameRateAndBitRateData(DescribeLiveStreamsFrameRateAndBitRateDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamsFrameRateAndBitRateDataWithOptions(request, runtime);
    }

    public ForbidLiveStreamResponse forbidLiveStreamWithOptions(ForbidLiveStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ForbidLiveStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ForbidLiveStreamResponse());
    }

    public ForbidLiveStreamResponse forbidLiveStream(ForbidLiveStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forbidLiveStreamWithOptions(request, runtime);
    }

    public DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfoWithOptions(DescribeLiveStreamTranscodeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamTranscodeInfo", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamTranscodeInfoResponse());
    }

    public DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfo(DescribeLiveStreamTranscodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamTranscodeInfoWithOptions(request, runtime);
    }

    public SetLiveStreamsNotifyUrlConfigResponse setLiveStreamsNotifyUrlConfigWithOptions(SetLiveStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetLiveStreamsNotifyUrlConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new SetLiveStreamsNotifyUrlConfigResponse());
    }

    public SetLiveStreamsNotifyUrlConfigResponse setLiveStreamsNotifyUrlConfig(SetLiveStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLiveStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public ResumeLiveStreamResponse resumeLiveStreamWithOptions(ResumeLiveStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResumeLiveStream", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new ResumeLiveStreamResponse());
    }

    public ResumeLiveStreamResponse resumeLiveStream(ResumeLiveStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeLiveStreamWithOptions(request, runtime);
    }

    public AddLiveAppSnapshotConfigResponse addLiveAppSnapshotConfigWithOptions(AddLiveAppSnapshotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveAppSnapshotConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveAppSnapshotConfigResponse());
    }

    public AddLiveAppSnapshotConfigResponse addLiveAppSnapshotConfig(AddLiveAppSnapshotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveAppSnapshotConfigWithOptions(request, runtime);
    }

    public AddLiveAppRecordConfigResponse addLiveAppRecordConfigWithOptions(AddLiveAppRecordConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddLiveAppRecordConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new AddLiveAppRecordConfigResponse());
    }

    public AddLiveAppRecordConfigResponse addLiveAppRecordConfig(AddLiveAppRecordConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLiveAppRecordConfigWithOptions(request, runtime);
    }

    public DescribeLiveRecordConfigResponse describeLiveRecordConfigWithOptions(DescribeLiveRecordConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveRecordConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveRecordConfigResponse());
    }

    public DescribeLiveRecordConfigResponse describeLiveRecordConfig(DescribeLiveRecordConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveRecordConfigWithOptions(request, runtime);
    }

    public DeleteLiveAppSnapshotConfigResponse deleteLiveAppSnapshotConfigWithOptions(DeleteLiveAppSnapshotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveAppSnapshotConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveAppSnapshotConfigResponse());
    }

    public DeleteLiveAppSnapshotConfigResponse deleteLiveAppSnapshotConfig(DeleteLiveAppSnapshotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveAppSnapshotConfigWithOptions(request, runtime);
    }

    public DeleteLiveAppRecordConfigResponse deleteLiveAppRecordConfigWithOptions(DeleteLiveAppRecordConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteLiveAppRecordConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteLiveAppRecordConfigResponse());
    }

    public DeleteLiveAppRecordConfigResponse deleteLiveAppRecordConfig(DeleteLiveAppRecordConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLiveAppRecordConfigWithOptions(request, runtime);
    }

    public CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFilesWithOptions(CreateLiveStreamRecordIndexFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLiveStreamRecordIndexFiles", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateLiveStreamRecordIndexFilesResponse());
    }

    public CreateLiveStreamRecordIndexFilesResponse createLiveStreamRecordIndexFiles(CreateLiveStreamRecordIndexFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveStreamRecordIndexFilesWithOptions(request, runtime);
    }

    public DescribeLiveStreamSnapshotInfoResponse describeLiveStreamSnapshotInfoWithOptions(DescribeLiveStreamSnapshotInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamSnapshotInfo", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamSnapshotInfoResponse());
    }

    public DescribeLiveStreamSnapshotInfoResponse describeLiveStreamSnapshotInfo(DescribeLiveStreamSnapshotInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamSnapshotInfoWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFilesWithOptions(DescribeLiveStreamRecordIndexFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamRecordIndexFiles", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamRecordIndexFilesResponse());
    }

    public DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFiles(DescribeLiveStreamRecordIndexFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamRecordIndexFilesWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFileWithOptions(DescribeLiveStreamRecordIndexFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamRecordIndexFile", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamRecordIndexFileResponse());
    }

    public DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFile(DescribeLiveStreamRecordIndexFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamRecordIndexFileWithOptions(request, runtime);
    }

    public DescribeLiveStreamRecordContentResponse describeLiveStreamRecordContentWithOptions(DescribeLiveStreamRecordContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveStreamRecordContent", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveStreamRecordContentResponse());
    }

    public DescribeLiveStreamRecordContentResponse describeLiveStreamRecordContent(DescribeLiveStreamRecordContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveStreamRecordContentWithOptions(request, runtime);
    }

    public DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfigWithOptions(DescribeLiveSnapshotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeLiveSnapshotConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeLiveSnapshotConfigResponse());
    }

    public DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfig(DescribeLiveSnapshotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLiveSnapshotConfigWithOptions(request, runtime);
    }

    public UpdateLiveAppSnapshotConfigResponse updateLiveAppSnapshotConfigWithOptions(UpdateLiveAppSnapshotConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLiveAppSnapshotConfig", "HTTPS", "POST", "2016-11-01", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveAppSnapshotConfigResponse());
    }

    public UpdateLiveAppSnapshotConfigResponse updateLiveAppSnapshotConfig(UpdateLiveAppSnapshotConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveAppSnapshotConfigWithOptions(request, runtime);
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
}
