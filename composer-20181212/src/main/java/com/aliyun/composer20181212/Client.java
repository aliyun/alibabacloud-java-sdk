// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212;

import com.aliyun.tea.*;
import com.aliyun.composer20181212.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("composer", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTemplates", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTemplate", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public GroupInvokeFlowResponse groupInvokeFlowWithOptions(GroupInvokeFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GroupInvokeFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new GroupInvokeFlowResponse());
    }

    public GroupInvokeFlowResponse groupInvokeFlow(GroupInvokeFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.groupInvokeFlowWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public GetVersionResponse getVersionWithOptions(GetVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetVersion", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new GetVersionResponse());
    }

    public GetVersionResponse getVersion(GetVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVersionWithOptions(request, runtime);
    }

    public ListVersionsResponse listVersionsWithOptions(ListVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVersions", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new ListVersionsResponse());
    }

    public ListVersionsResponse listVersions(ListVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVersionsWithOptions(request, runtime);
    }

    public UpdateFlowResponse updateFlowWithOptions(UpdateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFlowResponse());
    }

    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowWithOptions(request, runtime);
    }

    public CloneFlowResponse cloneFlowWithOptions(CloneFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloneFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new CloneFlowResponse());
    }

    public CloneFlowResponse cloneFlow(CloneFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneFlowWithOptions(request, runtime);
    }

    public GetFlowResponse getFlowWithOptions(GetFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new GetFlowResponse());
    }

    public GetFlowResponse getFlow(GetFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowWithOptions(request, runtime);
    }

    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFlows", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new ListFlowsResponse());
    }

    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DisableFlowResponse disableFlowWithOptions(DisableFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new DisableFlowResponse());
    }

    public DisableFlowResponse disableFlow(DisableFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableFlowWithOptions(request, runtime);
    }

    public EnableFlowResponse enableFlowWithOptions(EnableFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new EnableFlowResponse());
    }

    public EnableFlowResponse enableFlow(EnableFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableFlowWithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public InvokeFlowResponse invokeFlowWithOptions(InvokeFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeFlow", "HTTPS", "POST", "2018-12-12", "AK", null, TeaModel.buildMap(request), runtime), new InvokeFlowResponse());
    }

    public InvokeFlowResponse invokeFlow(InvokeFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeFlowWithOptions(request, runtime);
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
