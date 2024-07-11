// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618;

import com.aliyun.tea.*;
import com.aliyun.mts20140618.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>description</b> :
     * <p>You can call this operation to activate a media workflow that has been deactivated. After you activate a media workflow, you cannot modify the workflow information, such as the name, topology, or trigger mode. A media workflow is activated by default after it is created.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates a media workflow.</p>
     * 
     * @param request ActivateMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateMediaWorkflowResponse
     */
    public ActivateMediaWorkflowResponse activateMediaWorkflowWithOptions(ActivateMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to activate a media workflow that has been deactivated. After you activate a media workflow, you cannot modify the workflow information, such as the name, topology, or trigger mode. A media workflow is activated by default after it is created.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Activates a media workflow.</p>
     * 
     * @param request ActivateMediaWorkflowRequest
     * @return ActivateMediaWorkflowResponse
     */
    public ActivateMediaWorkflowResponse activateMediaWorkflow(ActivateMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to process videos that are uploaded to Object Storage Service (OSS) but not processed. This way, you do not need to upload the videos to OSS again. If you have configured media workflows, OSS automatically notifies ApsaraVideo Media Processing (MPS) when a media file is uploaded to OSS. MPS automatically finds the corresponding workflow in the Active state based on the specified OSS bucket and object. Therefore, in most cases, you do not need to manually call the AddMedia operation to process the media file.</p>
     * <ul>
     * <li>Media information is automatically obtained only when the specified media workflow is in the Active state. If no media workflow is specified or the specified media workflow is not in the Active state, media information is not obtained.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a media file.</p>
     * 
     * @param request AddMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMediaResponse
     */
    public AddMediaResponse addMediaWithOptions(AddMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileURL)) {
            query.put("FileURL", request.fileURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputUnbind)) {
            query.put("InputUnbind", request.inputUnbind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowUserData)) {
            query.put("MediaWorkflowUserData", request.mediaWorkflowUserData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overrideParams)) {
            query.put("OverrideParams", request.overrideParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMedia"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMediaResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to process videos that are uploaded to Object Storage Service (OSS) but not processed. This way, you do not need to upload the videos to OSS again. If you have configured media workflows, OSS automatically notifies ApsaraVideo Media Processing (MPS) when a media file is uploaded to OSS. MPS automatically finds the corresponding workflow in the Active state based on the specified OSS bucket and object. Therefore, in most cases, you do not need to manually call the AddMedia operation to process the media file.</p>
     * <ul>
     * <li>Media information is automatically obtained only when the specified media workflow is in the Active state. If no media workflow is specified or the specified media workflow is not in the Active state, media information is not obtained.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a media file.</p>
     * 
     * @param request AddMediaRequest
     * @return AddMediaResponse
     */
    public AddMediaResponse addMedia(AddMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add only one tag. To add multiple tags at a time, you can call the <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a media file.</p>
     * 
     * @param request AddMediaTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMediaTagResponse
     */
    public AddMediaTagResponse addMediaTagWithOptions(AddMediaTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMediaTag"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMediaTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add only one tag. To add multiple tags at a time, you can call the <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a media file.</p>
     * 
     * @param request AddMediaTagRequest
     * @return AddMediaTagResponse
     */
    public AddMediaTagResponse addMediaTag(AddMediaTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to define the topology, activities, and dependencies of a media workflow. The topology is represented by a directed acyclic graph (DAG) in the console. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Workflow activities</a>. You can view and run the workflows that are created by calling this operation in the ApsaraVideo Media Processing (MPS) console.</p>
     * <ul>
     * <li>MPS media workflows can be automatically triggered only by using the prefix of the file path. Automatic triggering by using the suffix is not supported. For more information about the trigger rules, see <a href="https://help.aliyun.com/document_detail/68574.html">Workflow triggering rules for files</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a media workflow.</p>
     * 
     * @param request AddMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMediaWorkflowResponse
     */
    public AddMediaWorkflowResponse addMediaWorkflowWithOptions(AddMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topology)) {
            query.put("Topology", request.topology);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerMode)) {
            query.put("TriggerMode", request.triggerMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to define the topology, activities, and dependencies of a media workflow. The topology is represented by a directed acyclic graph (DAG) in the console. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Workflow activities</a>. You can view and run the workflows that are created by calling this operation in the ApsaraVideo Media Processing (MPS) console.</p>
     * <ul>
     * <li>MPS media workflows can be automatically triggered only by using the prefix of the file path. Automatic triggering by using the suffix is not supported. For more information about the trigger rules, see <a href="https://help.aliyun.com/document_detail/68574.html">Workflow triggering rules for files</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a media workflow.</p>
     * 
     * @param request AddMediaWorkflowRequest
     * @return AddMediaWorkflowResponse
     */
    public AddMediaWorkflowResponse addMediaWorkflow(AddMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request AddPipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPipelineResponse
     */
    public AddPipelineResponse addPipelineWithOptions(AddPipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            query.put("NotifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speedLevel)) {
            query.put("SpeedLevel", request.speedLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPipeline"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPipelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request AddPipelineRequest
     * @return AddPipelineResponse
     */
    public AddPipelineResponse addPipeline(AddPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加labelVersion、knowledgeConfig配置</p>
     * 
     * @param request AddSmarttagTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSmarttagTemplateResponse
     */
    public AddSmarttagTemplateResponse addSmarttagTemplateWithOptions(AddSmarttagTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyseTypes)) {
            query.put("AnalyseTypes", request.analyseTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceCategoryIds)) {
            query.put("FaceCategoryIds", request.faceCategoryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceCustomParamsConfig)) {
            query.put("FaceCustomParamsConfig", request.faceCustomParamsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordConfig)) {
            query.put("KeywordConfig", request.keywordConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeConfig)) {
            query.put("KnowledgeConfig", request.knowledgeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelType)) {
            query.put("LabelType", request.labelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelVersion)) {
            query.put("LabelVersion", request.labelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.landmarkGroupIds)) {
            query.put("LandmarkGroupIds", request.landmarkGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectGroupIds)) {
            query.put("ObjectGroupIds", request.objectGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSmarttagTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSmarttagTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加labelVersion、knowledgeConfig配置</p>
     * 
     * @param request AddSmarttagTemplateRequest
     * @return AddSmarttagTemplateResponse
     */
    public AddSmarttagTemplateResponse addSmarttagTemplate(AddSmarttagTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSmarttagTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you need to set transcoding parameters such as those related to the container format, video stream, and audio stream. If you do not specify some parameters, streams that are generated by using the template do not contain the information specified by those parameters.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom transcoding template. You need to configure the information such as the container format, video stream settings, and audio stream settings.</p>
     * 
     * @param request AddTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTemplateResponse
     */
    public AddTemplateResponse addTemplateWithOptions(AddTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muxConfig)) {
            query.put("MuxConfig", request.muxConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transConfig)) {
            query.put("TransConfig", request.transConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you need to set transcoding parameters such as those related to the container format, video stream, and audio stream. If you do not specify some parameters, streams that are generated by using the template do not contain the information specified by those parameters.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom transcoding template. You need to configure the information such as the container format, video stream settings, and audio stream settings.</p>
     * 
     * @param request AddTemplateRequest
     * @return AddTemplateResponse
     */
    public AddTemplateResponse addTemplate(AddTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a watermark template by calling this operation, you can specify the watermark template and watermark asset when you <a href="https://help.aliyun.com/document_detail/29226.html">submit a transcoding job</a>. This allows you to add watermark information to the output video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a watermark template.</p>
     * 
     * @param request AddWaterMarkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWaterMarkTemplateResponse
     */
    public AddWaterMarkTemplateResponse addWaterMarkTemplateWithOptions(AddWaterMarkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWaterMarkTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWaterMarkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create a watermark template by calling this operation, you can specify the watermark template and watermark asset when you <a href="https://help.aliyun.com/document_detail/29226.html">submit a transcoding job</a>. This allows you to add watermark information to the output video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a watermark template.</p>
     * 
     * @param request AddWaterMarkTemplateRequest
     * @return AddWaterMarkTemplateResponse
     */
    public AddWaterMarkTemplateResponse addWaterMarkTemplate(AddWaterMarkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWaterMarkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an input media bucket, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an input media bucket.</p>
     * 
     * @param request BindInputBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindInputBucketResponse
     */
    public BindInputBucketResponse bindInputBucketWithOptions(BindInputBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referer)) {
            query.put("Referer", request.referer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindInputBucket"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindInputBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an input media bucket, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an input media bucket.</p>
     * 
     * @param request BindInputBucketRequest
     * @return BindInputBucketResponse
     */
    public BindInputBucketResponse bindInputBucket(BindInputBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindInputBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an output media bucket to the media library, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an output media bucket to the media library.</p>
     * 
     * @param request BindOutputBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindOutputBucketResponse
     */
    public BindOutputBucketResponse bindOutputBucketWithOptions(BindOutputBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindOutputBucket"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindOutputBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to bind an output media bucket to the media library, you must create a media bucket. For more information, see <a href="https://help.aliyun.com/document_detail/42430.html">Add media buckets</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds an output media bucket to the media library.</p>
     * 
     * @param request BindOutputBucketRequest
     * @return BindOutputBucketResponse
     */
    public BindOutputBucketResponse bindOutputBucket(BindOutputBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindOutputBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel a transcoding job only if the job is in the Submitted state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a transcoding job.</p>
     * 
     * @param request CancelJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelJobResponse
     */
    public CancelJobResponse cancelJobWithOptions(CancelJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel a transcoding job only if the job is in the Submitted state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a transcoding job.</p>
     * 
     * @param request CancelJobRequest
     * @return CancelJobResponse
     */
    public CancelJobResponse cancelJob(CancelJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelJobWithOptions(request, runtime);
    }

    /**
     * @param request CreateCustomEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomEntityResponse
     */
    public CreateCustomEntityResponse createCustomEntityWithOptions(CreateCustomEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityInfo)) {
            query.put("CustomEntityInfo", request.customEntityInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityName)) {
            query.put("CustomEntityName", request.customEntityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomEntity"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomEntityResponse());
    }

    /**
     * @param request CreateCustomEntityRequest
     * @return CreateCustomEntityResponse
     */
    public CreateCustomEntityResponse createCustomEntity(CreateCustomEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomEntityWithOptions(request, runtime);
    }

    /**
     * @param request CreateCustomGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomGroupResponse
     */
    public CreateCustomGroupResponse createCustomGroupWithOptions(CreateCustomGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupDescription)) {
            query.put("CustomGroupDescription", request.customGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupName)) {
            query.put("CustomGroupName", request.customGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomGroup"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomGroupResponse());
    }

    /**
     * @param request CreateCustomGroupRequest
     * @return CreateCustomGroupResponse
     */
    public CreateCustomGroupResponse createCustomGroup(CreateCustomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a job to create a video or text fingerprint library. You can use a text fingerprint library to store fingerprints for text.</p>
     * <ul>
     * <li>You can submit a job of creating a text fingerprint library only in the China (Shanghai) region.</li>
     * <li>By default, you can submit up to 10 jobs of creating a video fingerprint library to an ApsaraVideo Media Processing (MPS) queue at a time. If you submit more than 10 jobs at a time, the call may fail.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of creating a media fingerprint library.</p>
     * 
     * @param request CreateFpShotDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFpShotDBResponse
     */
    public CreateFpShotDBResponse createFpShotDBWithOptions(CreateFpShotDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFpShotDB"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFpShotDBResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a job to create a video or text fingerprint library. You can use a text fingerprint library to store fingerprints for text.</p>
     * <ul>
     * <li>You can submit a job of creating a text fingerprint library only in the China (Shanghai) region.</li>
     * <li>By default, you can submit up to 10 jobs of creating a video fingerprint library to an ApsaraVideo Media Processing (MPS) queue at a time. If you submit more than 10 jobs at a time, the call may fail.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of creating a media fingerprint library.</p>
     * 
     * @param request CreateFpShotDBRequest
     * @return CreateFpShotDBResponse
     */
    public CreateFpShotDBResponse createFpShotDB(CreateFpShotDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFpShotDBWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The time when the media workflow was created.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a media workflow.</p>
     * 
     * @param request DeactivateMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactivateMediaWorkflowResponse
     */
    public DeactivateMediaWorkflowResponse deactivateMediaWorkflowWithOptions(DeactivateMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactivateMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactivateMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>The time when the media workflow was created.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a media workflow.</p>
     * 
     * @param request DeactivateMediaWorkflowRequest
     * @return DeactivateMediaWorkflowResponse
     */
    public DeactivateMediaWorkflowResponse deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactivateMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom entity from a custom library.</p>
     * 
     * @param request DeleteCustomEntityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomEntityResponse
     */
    public DeleteCustomEntityResponse deleteCustomEntityWithOptions(DeleteCustomEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityId)) {
            query.put("CustomEntityId", request.customEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomEntity"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomEntityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom entity from a custom library.</p>
     * 
     * @param request DeleteCustomEntityRequest
     * @return DeleteCustomEntityResponse
     */
    public DeleteCustomEntityResponse deleteCustomEntity(DeleteCustomEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomEntityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a custom image library.</p>
     * 
     * @param request DeleteCustomGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomGroupResponse
     */
    public DeleteCustomGroupResponse deleteCustomGroupWithOptions(DeleteCustomGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomGroup"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a custom image library.</p>
     * 
     * @param request DeleteCustomGroupRequest
     * @return DeleteCustomGroupResponse
     */
    public DeleteCustomGroupResponse deleteCustomGroup(DeleteCustomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomGroupWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCustomViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomViewResponse
     */
    public DeleteCustomViewResponse deleteCustomViewWithOptions(DeleteCustomViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityId)) {
            query.put("CustomEntityId", request.customEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customViewId)) {
            query.put("CustomViewId", request.customViewId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomView"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomViewResponse());
    }

    /**
     * @param request DeleteCustomViewRequest
     * @return DeleteCustomViewResponse
     */
    public DeleteCustomViewResponse deleteCustomView(DeleteCustomViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to logically delete a media file. The media file can no longer be processed, but the corresponding objects in the input and output Object Storage Service (OSS) buckets are retained.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes media files from ApsaraVideo Media Processing (MPS).</p>
     * 
     * @param request DeleteMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaResponse
     */
    public DeleteMediaResponse deleteMediaWithOptions(DeleteMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMedia"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to logically delete a media file. The media file can no longer be processed, but the corresponding objects in the input and output Object Storage Service (OSS) buckets are retained.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes media files from ApsaraVideo Media Processing (MPS).</p>
     * 
     * @param request DeleteMediaRequest
     * @return DeleteMediaResponse
     */
    public DeleteMediaResponse deleteMedia(DeleteMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove only one tag at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a tag for a media file.</p>
     * 
     * @param request DeleteMediaTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaTagResponse
     */
    public DeleteMediaTagResponse deleteMediaTagWithOptions(DeleteMediaTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMediaTag"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaTagResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove only one tag at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a tag for a media file.</p>
     * 
     * @param request DeleteMediaTagRequest
     * @return DeleteMediaTagResponse
     */
    public DeleteMediaTagResponse deleteMediaTag(DeleteMediaTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you delete or disable a workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media workflow. This does not affect workflow instances that are running.</p>
     * 
     * @param request DeleteMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediaWorkflowResponse
     */
    public DeleteMediaWorkflowResponse deleteMediaWorkflowWithOptions(DeleteMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you delete or disable a workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media workflow. This does not affect workflow instances that are running.</p>
     * 
     * @param request DeleteMediaWorkflowRequest
     * @return DeleteMediaWorkflowResponse
     */
    public DeleteMediaWorkflowResponse deleteMediaWorkflow(DeleteMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one MPS queue at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request DeletePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipelineWithOptions(DeletePipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePipeline"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePipelineResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one MPS queue at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePipelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one template at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteSmarttagTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSmarttagTemplateResponse
     */
    public DeleteSmarttagTemplateResponse deleteSmarttagTemplateWithOptions(DeleteSmarttagTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSmarttagTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSmarttagTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete only one template at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteSmarttagTemplateRequest
     * @return DeleteSmarttagTemplateResponse
     */
    public DeleteSmarttagTemplateResponse deleteSmarttagTemplate(DeleteSmarttagTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSmarttagTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be deleted if it is being used by a job that has been submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom transcoding template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be deleted if it is being used by a job that has been submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom transcoding template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A watermark template cannot be deleted if it is being used by a submitted job.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a watermark template.</p>
     * 
     * @param request DeleteWaterMarkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWaterMarkTemplateResponse
     */
    public DeleteWaterMarkTemplateResponse deleteWaterMarkTemplateWithOptions(DeleteWaterMarkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waterMarkTemplateId)) {
            query.put("WaterMarkTemplateId", request.waterMarkTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWaterMarkTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWaterMarkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>A watermark template cannot be deleted if it is being used by a submitted job.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a watermark template.</p>
     * 
     * @param request DeleteWaterMarkTemplateRequest
     * @return DeleteWaterMarkTemplateResponse
     */
    public DeleteWaterMarkTemplateResponse deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWaterMarkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The moderation results are synchronously returned after the moderation is complete.</p>
     * <ul>
     * <li>You can use the image and text moderation feature only in the China (Beijing), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Reviews images and text and returns the review results.</p>
     * 
     * @param request ImAuditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImAuditResponse
     */
    public ImAuditResponse imAuditWithOptions(ImAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contents)) {
            query.put("Contents", request.contents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenes)) {
            query.put("Scenes", request.scenes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImAudit"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImAuditResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The moderation results are synchronously returned after the moderation is complete.</p>
     * <ul>
     * <li>You can use the image and text moderation feature only in the China (Beijing), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Reviews images and text and returns the review results.</p>
     * 
     * @param request ImAuditRequest
     * @return ImAuditResponse
     */
    public ImAuditResponse imAudit(ImAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.imAuditWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to import multiple text files to a text fingerprint library at a time. The system extracts fingerprints from the text files and saves the fingerprints to the text fingerprint library.</p>
     * <ul>
     * <li>You can call this operation only in the China (Shanghai) region.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of importing text files to a text fingerprint library.</p>
     * 
     * @param request ImportFpShotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportFpShotJobResponse
     */
    public ImportFpShotJobResponse importFpShotJobWithOptions(ImportFpShotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fpDBId)) {
            query.put("FpDBId", request.fpDBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fpImportConfig)) {
            query.put("FpImportConfig", request.fpImportConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportFpShotJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportFpShotJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to import multiple text files to a text fingerprint library at a time. The system extracts fingerprints from the text files and saves the fingerprints to the text fingerprint library.</p>
     * <ul>
     * <li>You can call this operation only in the China (Shanghai) region.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of importing text files to a text fingerprint library.</p>
     * 
     * @param request ImportFpShotJobRequest
     * @return ImportFpShotJobResponse
     */
    public ImportFpShotJobResponse importFpShotJob(ImportFpShotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importFpShotJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A maximum of 100 media buckets can be returned.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all media buckets bound to the media library.</p>
     * 
     * @param request ListAllMediaBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllMediaBucketResponse
     */
    public ListAllMediaBucketResponse listAllMediaBucketWithOptions(ListAllMediaBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllMediaBucket"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllMediaBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>A maximum of 100 media buckets can be returned.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all media buckets bound to the media library.</p>
     * 
     * @param request ListAllMediaBucketRequest
     * @return ListAllMediaBucketResponse
     */
    public ListAllMediaBucketResponse listAllMediaBucket(ListAllMediaBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllMediaBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities in a custom library.</p>
     * 
     * @param request ListCustomEntitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomEntitiesResponse
     */
    public ListCustomEntitiesResponse listCustomEntitiesWithOptions(ListCustomEntitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomEntities"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomEntitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of entities in a custom library.</p>
     * 
     * @param request ListCustomEntitiesRequest
     * @return ListCustomEntitiesResponse
     */
    public ListCustomEntitiesResponse listCustomEntities(ListCustomEntitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomEntitiesWithOptions(request, runtime);
    }

    /**
     * @param request ListCustomGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomGroupsResponse
     */
    public ListCustomGroupsResponse listCustomGroupsWithOptions(ListCustomGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomGroups"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomGroupsResponse());
    }

    /**
     * @param request ListCustomGroupsRequest
     * @return ListCustomGroupsResponse
     */
    public ListCustomGroupsResponse listCustomGroups(ListCustomGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a figure or a figure library to query the corresponding information. If neither the figure ID nor figure library ID is specified, the operation returns the information about all figures and faces in all figure libraries within the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all figures and faces in a specific figure library.</p>
     * 
     * @param request ListCustomPersonsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomPersonsResponse
     */
    public ListCustomPersonsResponse listCustomPersonsWithOptions(ListCustomPersonsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomPersons"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomPersonsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a figure or a figure library to query the corresponding information. If neither the figure ID nor figure library ID is specified, the operation returns the information about all figures and faces in all figure libraries within the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all figures and faces in a specific figure library.</p>
     * 
     * @param request ListCustomPersonsRequest
     * @return ListCustomPersonsResponse
     */
    public ListCustomPersonsResponse listCustomPersons(ListCustomPersonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomPersonsWithOptions(request, runtime);
    }

    /**
     * @param request ListCustomViewsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomViewsResponse
     */
    public ListCustomViewsResponse listCustomViewsWithOptions(ListCustomViewsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityId)) {
            query.put("CustomEntityId", request.customEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomViews"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomViewsResponse());
    }

    /**
     * @param request ListCustomViewsRequest
     * @return ListCustomViewsResponse
     */
    public ListCustomViewsResponse listCustomViews(ListCustomViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomViewsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status and information about the media fingerprint libraries based on the specified IDs.</p>
     * <ul>
     * <li>You can query text fingerprint libraries only in the China (Shanghai) region.</li>
     * <li>You can call this operation to query up to 10 media fingerprint libraries.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media fingerprint libraries.</p>
     * 
     * @param request ListFpShotDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFpShotDBResponse
     */
    public ListFpShotDBResponse listFpShotDBWithOptions(ListFpShotDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fpDBIds)) {
            query.put("FpDBIds", request.fpDBIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFpShotDB"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFpShotDBResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status and information about the media fingerprint libraries based on the specified IDs.</p>
     * <ul>
     * <li>You can query text fingerprint libraries only in the China (Shanghai) region.</li>
     * <li>You can call this operation to query up to 10 media fingerprint libraries.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media fingerprint libraries.</p>
     * 
     * @param request ListFpShotDBRequest
     * @return ListFpShotDBResponse
     */
    public ListFpShotDBResponse listFpShotDB(ListFpShotDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFpShotDBWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query media files in a specific media fingerprint library based on the library ID. This operation supports paged queries.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files in a media fingerprint library.</p>
     * 
     * @param request ListFpShotFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFpShotFilesResponse
     */
    public ListFpShotFilesResponse listFpShotFilesWithOptions(ListFpShotFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fpDBId)) {
            query.put("FpDBId", request.fpDBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFpShotFiles"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFpShotFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query media files in a specific media fingerprint library based on the library ID. This operation supports paged queries.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), China (Shanghai), and Singapore regions.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files in a media fingerprint library.</p>
     * 
     * @param request ListFpShotFilesRequest
     * @return ListFpShotFilesResponse
     */
    public ListFpShotFilesResponse listFpShotFiles(ListFpShotFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFpShotFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Shanghai) region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries jobs of importing text files to a text fingerprint library.</p>
     * 
     * @param request ListFpShotImportJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFpShotImportJobResponse
     */
    public ListFpShotImportJobResponse listFpShotImportJobWithOptions(ListFpShotImportJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFpShotImportJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFpShotImportJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only in the China (Shanghai) region.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries jobs of importing text files to a text fingerprint library.</p>
     * 
     * @param request ListFpShotImportJobRequest
     * @return ListFpShotImportJobResponse
     */
    public ListFpShotImportJobResponse listFpShotImportJob(ListFpShotImportJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFpShotImportJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  By default, the returned transcoding jobs are sorted by CreationTime in descending order.</p>
     * <ul>
     * <li>You can call this operation to return transcoding jobs of the last 90 days. The jobs are returned based on the specified time range.</li>
     * <li>You can filter query results by configuring request parameters such as job status, creation time interval, and ApsaraVideo Media Processing (MPS) queue for transcoding.</li>
     * <li>By default, MPS does not allow you to access data across regions within the same account. Before you call this operation, make sure that the region that you specify is the same as the region of the transcoding jobs to be queried. Otherwise, this operation may fail to be called, or invalid information may be returned.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Traverses transcoding jobs</p>
     * 
     * @param request ListJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobResponse
     */
    public ListJobResponse listJobWithOptions(ListJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfJobCreatedTimeRange)) {
            query.put("EndOfJobCreatedTimeRange", request.endOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfJobCreatedTimeRange)) {
            query.put("StartOfJobCreatedTimeRange", request.startOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  By default, the returned transcoding jobs are sorted by CreationTime in descending order.</p>
     * <ul>
     * <li>You can call this operation to return transcoding jobs of the last 90 days. The jobs are returned based on the specified time range.</li>
     * <li>You can filter query results by configuring request parameters such as job status, creation time interval, and ApsaraVideo Media Processing (MPS) queue for transcoding.</li>
     * <li>By default, MPS does not allow you to access data across regions within the same account. Before you call this operation, make sure that the region that you specify is the same as the region of the transcoding jobs to be queried. Otherwise, this operation may fail to be called, or invalid information may be returned.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Traverses transcoding jobs</p>
     * 
     * @param request ListJobRequest
     * @return ListJobResponse
     */
    public ListJobResponse listJob(ListJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns execution instances only in the recent 90 days.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution instances of a media workflow.</p>
     * 
     * @param request ListMediaWorkflowExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaWorkflowExecutionsResponse
     */
    public ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutionsWithOptions(ListMediaWorkflowExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputFileURL)) {
            query.put("InputFileURL", request.inputFileURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowName)) {
            query.put("MediaWorkflowName", request.mediaWorkflowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaWorkflowExecutions"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaWorkflowExecutionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation returns execution instances only in the recent 90 days.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution instances of a media workflow.</p>
     * 
     * @param request ListMediaWorkflowExecutionsRequest
     * @return ListMediaWorkflowExecutionsResponse
     */
    public ListMediaWorkflowExecutionsResponse listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaWorkflowExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The time when the job was created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the template analysis job and returns a list of available preset templates when the template analysis job is complete.</p>
     * 
     * @param request QueryAnalysisJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAnalysisJobListResponse
     */
    public QueryAnalysisJobListResponse queryAnalysisJobListWithOptions(QueryAnalysisJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisJobIds)) {
            query.put("AnalysisJobIds", request.analysisJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAnalysisJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAnalysisJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The time when the job was created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the template analysis job and returns a list of available preset templates when the template analysis job is complete.</p>
     * 
     * @param request QueryAnalysisJobListRequest
     * @return QueryAnalysisJobListResponse
     */
    public QueryAnalysisJobListResponse queryAnalysisJobList(QueryAnalysisJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAnalysisJobListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询版权水印提取任务</p>
     * 
     * @param request QueryCopyrightExtractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCopyrightExtractJobResponse
     */
    public QueryCopyrightExtractJobResponse queryCopyrightExtractJobWithOptions(QueryCopyrightExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCopyrightExtractJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCopyrightExtractJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询版权水印提取任务</p>
     * 
     * @param request QueryCopyrightExtractJobRequest
     * @return QueryCopyrightExtractJobResponse
     */
    public QueryCopyrightExtractJobResponse queryCopyrightExtractJob(QueryCopyrightExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCopyrightExtractJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频版权水印任务</p>
     * 
     * @param request QueryCopyrightJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCopyrightJobResponse
     */
    public QueryCopyrightJobResponse queryCopyrightJobWithOptions(QueryCopyrightJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCopyrightJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCopyrightJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频版权水印任务</p>
     * 
     * @param request QueryCopyrightJobRequest
     * @return QueryCopyrightJobResponse
     */
    public QueryCopyrightJobResponse queryCopyrightJob(QueryCopyrightJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCopyrightJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of clearing or deleting a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of clearing or deleting a media fingerprint library.</p>
     * 
     * @param request QueryFpDBDeleteJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFpDBDeleteJobListResponse
     */
    public QueryFpDBDeleteJobListResponse queryFpDBDeleteJobListWithOptions(QueryFpDBDeleteJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFpDBDeleteJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFpDBDeleteJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of clearing or deleting a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of clearing or deleting a media fingerprint library.</p>
     * 
     * @param request QueryFpDBDeleteJobListRequest
     * @return QueryFpDBDeleteJobListResponse
     */
    public QueryFpDBDeleteJobListResponse queryFpDBDeleteJobList(QueryFpDBDeleteJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFpDBDeleteJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of deleting media files from a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of deleting media files from a media fingerprint library.</p>
     * 
     * @param request QueryFpFileDeleteJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFpFileDeleteJobListResponse
     */
    public QueryFpFileDeleteJobListResponse queryFpFileDeleteJobListWithOptions(QueryFpFileDeleteJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFpFileDeleteJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFpFileDeleteJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the specified jobs of deleting media files from a media fingerprint library based on the job IDs. If you do not specify job IDs, the system returns the latest 20 jobs that are submitted.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 500 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the jobs of deleting media files from a media fingerprint library.</p>
     * 
     * @param request QueryFpFileDeleteJobListRequest
     * @return QueryFpFileDeleteJobListResponse
     */
    public QueryFpFileDeleteJobListResponse queryFpFileDeleteJobList(QueryFpFileDeleteJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFpFileDeleteJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After a media fingerprint analysis job is submitted, the media fingerprinting service compares the fingerprints of the job input with those of the media files in the media fingerprint library. You can call this operation to query the job results.</p>
     * <ul>
     * <li>You can query the results of a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media fingerprint analysis jobs. You can call this operation to query video fingerprint analysis jobs and text fingerprint analysis jobs.</p>
     * 
     * @param request QueryFpShotJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFpShotJobListResponse
     */
    public QueryFpShotJobListResponse queryFpShotJobListWithOptions(QueryFpShotJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfJobCreatedTimeRange)) {
            query.put("EndOfJobCreatedTimeRange", request.endOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfJobCreatedTimeRange)) {
            query.put("StartOfJobCreatedTimeRange", request.startOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFpShotJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFpShotJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After a media fingerprint analysis job is submitted, the media fingerprinting service compares the fingerprints of the job input with those of the media files in the media fingerprint library. You can call this operation to query the job results.</p>
     * <ul>
     * <li>You can query the results of a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media fingerprint analysis jobs. You can call this operation to query video fingerprint analysis jobs and text fingerprint analysis jobs.</p>
     * 
     * @param request QueryFpShotJobListRequest
     * @return QueryFpShotJobListResponse
     */
    public QueryFpShotJobListResponse queryFpShotJobList(QueryFpShotJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFpShotJobListWithOptions(request, runtime);
    }

    /**
     * @param request QueryIProductionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryIProductionJobResponse
     */
    public QueryIProductionJobResponse queryIProductionJobWithOptions(QueryIProductionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIProductionJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIProductionJobResponse());
    }

    /**
     * @param request QueryIProductionJobRequest
     * @return QueryIProductionJobResponse
     */
    public QueryIProductionJobResponse queryIProductionJob(QueryIProductionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryIProductionJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  By default, returned jobs are sorted in descending order by CreationTime.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 transcoding jobs at a time.</li>
     * <li>If you do not set the JobIds parameter, the <code>InvalidParameter</code> error code is returned.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding jobs at a time by job ID.</p>
     * 
     * @param request QueryJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryJobListResponse
     */
    public QueryJobListResponse queryJobListWithOptions(QueryJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  By default, returned jobs are sorted in descending order by CreationTime.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 transcoding jobs at a time.</li>
     * <li>If you do not set the JobIds parameter, the <code>InvalidParameter</code> error code is returned.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries transcoding jobs at a time by job ID.</p>
     * 
     * @param request QueryJobListRequest
     * @return QueryJobListResponse
     */
    public QueryJobListResponse queryJobList(QueryJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a content moderation job.</p>
     * 
     * @param request QueryMediaCensorJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaCensorJobDetailResponse
     */
    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetailWithOptions(QueryMediaCensorJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaCensorJobDetail"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaCensorJobDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a content moderation job.</p>
     * 
     * @param request QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    public QueryMediaCensorJobDetailResponse queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaCensorJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the content moderation jobs within three months.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries content moderation jobs.</p>
     * 
     * @param request QueryMediaCensorJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaCensorJobListResponse
     */
    public QueryMediaCensorJobListResponse queryMediaCensorJobListWithOptions(QueryMediaCensorJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfJobCreatedTimeRange)) {
            query.put("EndOfJobCreatedTimeRange", request.endOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfJobCreatedTimeRange)) {
            query.put("StartOfJobCreatedTimeRange", request.startOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaCensorJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaCensorJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the content moderation jobs within three months.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries content moderation jobs.</p>
     * 
     * @param request QueryMediaCensorJobListRequest
     * @return QueryMediaCensorJobListResponse
     */
    public QueryMediaCensorJobListResponse queryMediaCensorJobList(QueryMediaCensorJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaCensorJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  In asynchronous mode, the media information can be retrieved only after the Message Service (MNS) callback of <strong>submitting a media information job</strong> is returned. If you have not retrieved the media information for a long period, the job may have failed.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 media information analysis jobs at a time.</li>
     * <li>By default, returned jobs are sorted in descending order by CreationTime.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of media information analysis jobs.</p>
     * 
     * @param request QueryMediaInfoJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaInfoJobListResponse
     */
    public QueryMediaInfoJobListResponse queryMediaInfoJobListWithOptions(QueryMediaInfoJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaInfoJobIds)) {
            query.put("MediaInfoJobIds", request.mediaInfoJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaInfoJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaInfoJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  In asynchronous mode, the media information can be retrieved only after the Message Service (MNS) callback of <strong>submitting a media information job</strong> is returned. If you have not retrieved the media information for a long period, the job may have failed.</p>
     * <ul>
     * <li>You can call this operation to query up to 10 media information analysis jobs at a time.</li>
     * <li>By default, returned jobs are sorted in descending order by CreationTime.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of media information analysis jobs.</p>
     * 
     * @param request QueryMediaInfoJobListRequest
     * @return QueryMediaInfoJobListResponse
     */
    public QueryMediaInfoJobListResponse queryMediaInfoJobList(QueryMediaInfoJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaInfoJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media files at a time.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files based on media file IDs.</p>
     * 
     * @param request QueryMediaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaListResponse
     */
    public QueryMediaListResponse queryMediaListWithOptions(QueryMediaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeMediaInfo)) {
            query.put("IncludeMediaInfo", request.includeMediaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePlayList)) {
            query.put("IncludePlayList", request.includePlayList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSnapshotList)) {
            query.put("IncludeSnapshotList", request.includeSnapshotList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSummaryList)) {
            query.put("IncludeSummaryList", request.includeSummaryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media files at a time.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files based on media file IDs.</p>
     * 
     * @param request QueryMediaListRequest
     * @return QueryMediaListResponse
     */
    public QueryMediaListResponse queryMediaList(QueryMediaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 media files at a time.</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation to add media files.</li>
     * <li>You can call this operation to query only media files that are processed in a workflow. To obtain comprehensive information about a media file that is newly uploaded to OSS, you can call this operation after the corresponding workflow is complete. To query media files that are not processed in a workflow, you must call the <a href="https://help.aliyun.com/document_detail/29220.html">SubmitMediaInfoJob</a> operation to submit a media information analysis job. After the job is complete, you can query the information about the media files.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files based on their Object Storage Service (OSS) URLs.</p>
     * 
     * @param request QueryMediaListByURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaListByURLResponse
     */
    public QueryMediaListByURLResponse queryMediaListByURLWithOptions(QueryMediaListByURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileURLs)) {
            query.put("FileURLs", request.fileURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMediaInfo)) {
            query.put("IncludeMediaInfo", request.includeMediaInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePlayList)) {
            query.put("IncludePlayList", request.includePlayList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSnapshotList)) {
            query.put("IncludeSnapshotList", request.includeSnapshotList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSummaryList)) {
            query.put("IncludeSummaryList", request.includeSummaryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaListByURL"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaListByURLResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 media files at a time.</p>
     * <ul>
     * <li>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/44458.html">AddMedia</a> operation to add media files.</li>
     * <li>You can call this operation to query only media files that are processed in a workflow. To obtain comprehensive information about a media file that is newly uploaded to OSS, you can call this operation after the corresponding workflow is complete. To query media files that are not processed in a workflow, you must call the <a href="https://help.aliyun.com/document_detail/29220.html">SubmitMediaInfoJob</a> operation to submit a media information analysis job. After the job is complete, you can query the information about the media files.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media files based on their Object Storage Service (OSS) URLs.</p>
     * 
     * @param request QueryMediaListByURLRequest
     * @return QueryMediaListByURLResponse
     */
    public QueryMediaListByURLResponse queryMediaListByURL(QueryMediaListByURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaListByURLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query a maximum of 10 media workflow execution instances at a time.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the workflow pipeline is enabled. Otherwise, the workflow may not run as expected. For example, the following exceptions may occur: the workflow node is invalid and jobs created in the workflow cannot be executed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media workflow execution instances.</p>
     * 
     * @param request QueryMediaWorkflowExecutionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaWorkflowExecutionListResponse
     */
    public QueryMediaWorkflowExecutionListResponse queryMediaWorkflowExecutionListWithOptions(QueryMediaWorkflowExecutionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runIds)) {
            query.put("RunIds", request.runIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaWorkflowExecutionList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaWorkflowExecutionListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query a maximum of 10 media workflow execution instances at a time.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the workflow pipeline is enabled. Otherwise, the workflow may not run as expected. For example, the following exceptions may occur: the workflow node is invalid and jobs created in the workflow cannot be executed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media workflow execution instances.</p>
     * 
     * @param request QueryMediaWorkflowExecutionListRequest
     * @return QueryMediaWorkflowExecutionListResponse
     */
    public QueryMediaWorkflowExecutionListResponse queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaWorkflowExecutionListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media workflows at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries registered media workflows.</p>
     * 
     * @param request QueryMediaWorkflowListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMediaWorkflowListResponse
     */
    public QueryMediaWorkflowListResponse queryMediaWorkflowListWithOptions(QueryMediaWorkflowListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowIds)) {
            query.put("MediaWorkflowIds", request.mediaWorkflowIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaWorkflowList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaWorkflowListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 media workflows at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries registered media workflows.</p>
     * 
     * @param request QueryMediaWorkflowListRequest
     * @return QueryMediaWorkflowListResponse
     */
    public QueryMediaWorkflowListResponse queryMediaWorkflowList(QueryMediaWorkflowListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMediaWorkflowListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 MPS queues at a time.</p>
     * <ul>
     * <li>If <code>&quot;Code&quot;: &quot;InvalidIdentity.ServiceDisabled&quot;,&quot;Message&quot;: &quot;The request identity was not allowed operated.&quot;,&quot;Recommend&quot;</code> is returned after you call this operation, check whether the RAM user that you use is assigned the AliyunMTSDefaultRole role to obtain the permissions on MPS and whether your Alibaba Cloud account has overdue payments.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an ApsaraVideo Media Processing (MPS) queue by using the ID of the queue.</p>
     * 
     * @param request QueryPipelineListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPipelineListResponse
     */
    public QueryPipelineListResponse queryPipelineListWithOptions(QueryPipelineListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIds)) {
            query.put("PipelineIds", request.pipelineIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPipelineList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPipelineListResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query up to 10 MPS queues at a time.</p>
     * <ul>
     * <li>If <code>&quot;Code&quot;: &quot;InvalidIdentity.ServiceDisabled&quot;,&quot;Message&quot;: &quot;The request identity was not allowed operated.&quot;,&quot;Recommend&quot;</code> is returned after you call this operation, check whether the RAM user that you use is assigned the AliyunMTSDefaultRole role to obtain the permissions on MPS and whether your Alibaba Cloud account has overdue payments.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an ApsaraVideo Media Processing (MPS) queue by using the ID of the queue.</p>
     * 
     * @param request QueryPipelineListRequest
     * @return QueryPipelineListResponse
     */
    public QueryPipelineListResponse queryPipelineList(QueryPipelineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPipelineListWithOptions(request, runtime);
    }

    /**
     * @param request QuerySmarttagJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmarttagJobResponse
     */
    public QuerySmarttagJobResponse querySmarttagJobWithOptions(QuerySmarttagJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmarttagJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmarttagJobResponse());
    }

    /**
     * @param request QuerySmarttagJobRequest
     * @return QuerySmarttagJobResponse
     */
    public QuerySmarttagJobResponse querySmarttagJob(QuerySmarttagJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmarttagJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to query the information about a smart tagging template, you must specify the template ID. Otherwise, the operation returns the information about all the templates that are created by the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the analysis template of a smart tagging job.</p>
     * 
     * @param request QuerySmarttagTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmarttagTemplateListResponse
     */
    public QuerySmarttagTemplateListResponse querySmarttagTemplateListWithOptions(QuerySmarttagTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmarttagTemplateList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmarttagTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to query the information about a smart tagging template, you must specify the template ID. Otherwise, the operation returns the information about all the templates that are created by the current RAM user.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the analysis template of a smart tagging job.</p>
     * 
     * @param request QuerySmarttagTemplateListRequest
     * @return QuerySmarttagTemplateListResponse
     */
    public QuerySmarttagTemplateListResponse querySmarttagTemplateList(QuerySmarttagTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmarttagTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The status of the snapshot jobs that you want to query.</p>
     * <ul>
     * <li><strong>Submitted</strong>: The job was submitted.</li>
     * <li><strong>Snapshoting</strong>: The job is being processed.</li>
     * <li><strong>Success</strong>: The job was successfully processed.</li>
     * <li><strong>Fail</strong>: The job failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries snapshot jobs.</p>
     * 
     * @param request QuerySnapshotJobListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySnapshotJobListResponse
     */
    public QuerySnapshotJobListResponse querySnapshotJobListWithOptions(QuerySnapshotJobListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endOfJobCreatedTimeRange)) {
            query.put("EndOfJobCreatedTimeRange", request.endOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumPageSize)) {
            query.put("MaximumPageSize", request.maximumPageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotJobIds)) {
            query.put("SnapshotJobIds", request.snapshotJobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOfJobCreatedTimeRange)) {
            query.put("StartOfJobCreatedTimeRange", request.startOfJobCreatedTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySnapshotJobList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySnapshotJobListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The status of the snapshot jobs that you want to query.</p>
     * <ul>
     * <li><strong>Submitted</strong>: The job was submitted.</li>
     * <li><strong>Snapshoting</strong>: The job is being processed.</li>
     * <li><strong>Success</strong>: The job was successfully processed.</li>
     * <li><strong>Fail</strong>: The job failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries snapshot jobs.</p>
     * 
     * @param request QuerySnapshotJobListRequest
     * @return QuerySnapshotJobListResponse
     */
    public QuerySnapshotJobListResponse querySnapshotJobList(QuerySnapshotJobListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySnapshotJobListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The IDs of the transcoding templates that you want to query. You can query up to 10 transcoding templates at a time. Separate multiple IDs of custom transcoding templates with commas (,).</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query up to 10 transcoding templates at a time.</p>
     * 
     * @param request QueryTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTemplateListResponse
     */
    public QueryTemplateListResponse queryTemplateListWithOptions(QueryTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTemplateList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The IDs of the transcoding templates that you want to query. You can query up to 10 transcoding templates at a time. Separate multiple IDs of custom transcoding templates with commas (,).</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query up to 10 transcoding templates at a time.</p>
     * 
     * @param request QueryTemplateListRequest
     * @return QueryTemplateListResponse
     */
    public QueryTemplateListResponse queryTemplateList(QueryTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频溯源水印ab流任务</p>
     * 
     * @param request QueryTraceAbJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTraceAbJobResponse
     */
    public QueryTraceAbJobResponse queryTraceAbJobWithOptions(QueryTraceAbJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTraceAbJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTraceAbJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频溯源水印ab流任务</p>
     * 
     * @param request QueryTraceAbJobRequest
     * @return QueryTraceAbJobResponse
     */
    public QueryTraceAbJobResponse queryTraceAbJob(QueryTraceAbJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTraceAbJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询溯源水印提取任务</p>
     * 
     * @param request QueryTraceExtractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTraceExtractJobResponse
     */
    public QueryTraceExtractJobResponse queryTraceExtractJobWithOptions(QueryTraceExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTraceExtractJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTraceExtractJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询溯源水印提取任务</p>
     * 
     * @param request QueryTraceExtractJobRequest
     * @return QueryTraceExtractJobResponse
     */
    public QueryTraceExtractJobResponse queryTraceExtractJob(QueryTraceExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTraceExtractJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频溯源水印m3u8任务</p>
     * 
     * @param request QueryTraceM3u8JobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTraceM3u8JobResponse
     */
    public QueryTraceM3u8JobResponse queryTraceM3u8JobWithOptions(QueryTraceM3u8JobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTraceM3u8Job"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTraceM3u8JobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询视频溯源水印m3u8任务</p>
     * 
     * @param request QueryTraceM3u8JobRequest
     * @return QueryTraceM3u8JobResponse
     */
    public QueryTraceM3u8JobResponse queryTraceM3u8Job(QueryTraceM3u8JobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTraceM3u8JobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 watermark templates at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries watermark templates.</p>
     * 
     * @param request QueryWaterMarkTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWaterMarkTemplateListResponse
     */
    public QueryWaterMarkTemplateListResponse queryWaterMarkTemplateListWithOptions(QueryWaterMarkTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waterMarkTemplateIds)) {
            query.put("WaterMarkTemplateIds", request.waterMarkTemplateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWaterMarkTemplateList"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWaterMarkTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query up to 10 watermark templates at a time.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries watermark templates.</p>
     * 
     * @param request QueryWaterMarkTemplateListRequest
     * @return QueryWaterMarkTemplateListResponse
     */
    public QueryWaterMarkTemplateListResponse queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWaterMarkTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to register only one custom face at a time.</p>
     * <ul>
     * <li>A maximum of 10 images can be registered for a custom face.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a custom face.</p>
     * 
     * @param request RegisterCustomFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterCustomFaceResponse
     */
    public RegisterCustomFaceResponse registerCustomFaceWithOptions(RegisterCustomFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterCustomFace"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterCustomFaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to register only one custom face at a time.</p>
     * <ul>
     * <li>A maximum of 10 images can be registered for a custom face.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a custom face.</p>
     * 
     * @param request RegisterCustomFaceRequest
     * @return RegisterCustomFaceResponse
     */
    public RegisterCustomFaceResponse registerCustomFace(RegisterCustomFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerCustomFaceWithOptions(request, runtime);
    }

    /**
     * @param request RegisterCustomViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterCustomViewResponse
     */
    public RegisterCustomViewResponse registerCustomViewWithOptions(RegisterCustomViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithm)) {
            query.put("Algorithm", request.algorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customEntityId)) {
            query.put("CustomEntityId", request.customEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customGroupId)) {
            query.put("CustomGroupId", request.customGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterCustomView"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterCustomViewResponse());
    }

    /**
     * @param request RegisterCustomViewRequest
     * @return RegisterCustomViewResponse
     */
    public RegisterCustomViewResponse registerCustomView(RegisterCustomViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerCustomViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media workflows in the specified state. If you do not specify the state, all media workflows are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media workflows in the specified state.</p>
     * 
     * @param request SearchMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaWorkflowResponse
     */
    public SearchMediaWorkflowResponse searchMediaWorkflowWithOptions(SearchMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateList)) {
            query.put("StateList", request.stateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media workflows in the specified state. If you do not specify the state, all media workflows are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media workflows in the specified state.</p>
     * 
     * @param request SearchMediaWorkflowRequest
     * @return SearchMediaWorkflowResponse
     */
    public SearchMediaWorkflowResponse searchMediaWorkflow(SearchMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MPS queues in the specified state. If you do not specify the state, all MPS queues are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for ApsaraVideo Media Processing (MPS) queues in the specified state.</p>
     * 
     * @param request SearchPipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchPipelineResponse
     */
    public SearchPipelineResponse searchPipelineWithOptions(SearchPipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchPipeline"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchPipelineResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MPS queues in the specified state. If you do not specify the state, all MPS queues are queried by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for ApsaraVideo Media Processing (MPS) queues in the specified state.</p>
     * 
     * @param request SearchPipelineRequest
     * @return SearchPipelineResponse
     */
    public SearchPipelineResponse searchPipeline(SearchPipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchPipelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query custom transcoding templates in the specified state.</p>
     * 
     * @param request SearchTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTemplateResponse
     */
    public SearchTemplateResponse searchTemplateWithOptions(SearchTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to query custom transcoding templates in the specified state.</p>
     * 
     * @param request SearchTemplateRequest
     * @return SearchTemplateResponse
     */
    public SearchTemplateResponse searchTemplate(SearchTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The total number of returned entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for watermark templates.</p>
     * 
     * @param request SearchWaterMarkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchWaterMarkTemplateResponse
     */
    public SearchWaterMarkTemplateResponse searchWaterMarkTemplateWithOptions(SearchWaterMarkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchWaterMarkTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchWaterMarkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>The total number of returned entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for watermark templates.</p>
     * 
     * @param request SearchWaterMarkTemplateRequest
     * @return SearchWaterMarkTemplateResponse
     */
    public SearchWaterMarkTemplateResponse searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchWaterMarkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you call the SubmitAnalysisJob operation to submit a preset template analysis job, ApsaraVideo Media Processing (MPS) intelligently analyzes the input file of the job and recommends a suitable preset template. You can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a> operation to query the analysis result or enable asynchronous notifications to receive the analysis result.</p>
     * <ul>
     * <li>The analysis result is retained only for two weeks after it is generated. The analysis result is deleted after two weeks. If you use the recommended preset template in a transcoding job after two weeks, the job fails, and the <code>AnalysisResultNotFound</code> error code is returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a preset template analysis job.</p>
     * 
     * @param request SubmitAnalysisJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAnalysisJobResponse
     */
    public SubmitAnalysisJobResponse submitAnalysisJobWithOptions(SubmitAnalysisJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisConfig)) {
            query.put("AnalysisConfig", request.analysisConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAnalysisJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAnalysisJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you call the SubmitAnalysisJob operation to submit a preset template analysis job, ApsaraVideo Media Processing (MPS) intelligently analyzes the input file of the job and recommends a suitable preset template. You can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a> operation to query the analysis result or enable asynchronous notifications to receive the analysis result.</p>
     * <ul>
     * <li>The analysis result is retained only for two weeks after it is generated. The analysis result is deleted after two weeks. If you use the recommended preset template in a transcoding job after two weeks, the job fails, and the <code>AnalysisResultNotFound</code> error code is returned.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a preset template analysis job.</p>
     * 
     * @param request SubmitAnalysisJobRequest
     * @return SubmitAnalysisJobResponse
     */
    public SubmitAnalysisJobResponse submitAnalysisJob(SubmitAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAnalysisJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交版权水印提取任务</p>
     * 
     * @param request SubmitCopyrightExtractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCopyrightExtractJobResponse
     */
    public SubmitCopyrightExtractJobResponse submitCopyrightExtractJobWithOptions(SubmitCopyrightExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCopyrightExtractJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCopyrightExtractJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交版权水印提取任务</p>
     * 
     * @param request SubmitCopyrightExtractJobRequest
     * @return SubmitCopyrightExtractJobResponse
     */
    public SubmitCopyrightExtractJobResponse submitCopyrightExtractJob(SubmitCopyrightExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCopyrightExtractJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频版权水印</p>
     * 
     * @param request SubmitCopyrightJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitCopyrightJobResponse
     */
    public SubmitCopyrightJobResponse submitCopyrightJobWithOptions(SubmitCopyrightJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTime)) {
            query.put("TotalTime", request.totalTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitCopyrightJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitCopyrightJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频版权水印</p>
     * 
     * @param request SubmitCopyrightJobRequest
     * @return SubmitCopyrightJobResponse
     */
    public SubmitCopyrightJobResponse submitCopyrightJob(SubmitCopyrightJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCopyrightJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to clear or delete the specified media fingerprint library based on the library ID. If you clear a media fingerprint library, the content in the library is deleted, but the library is not deleted. If you delete a media fingerprint library, both the library and the content in the library are deleted. If you do not specify the operation type, the system clears the media fingerprint library by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of clearing or deleting a media fingerprint library.</p>
     * 
     * @param request SubmitFpDBDeleteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFpDBDeleteJobResponse
     */
    public SubmitFpDBDeleteJobResponse submitFpDBDeleteJobWithOptions(SubmitFpDBDeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delType)) {
            query.put("DelType", request.delType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fpDBId)) {
            query.put("FpDBId", request.fpDBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFpDBDeleteJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFpDBDeleteJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to clear or delete the specified media fingerprint library based on the library ID. If you clear a media fingerprint library, the content in the library is deleted, but the library is not deleted. If you delete a media fingerprint library, both the library and the content in the library are deleted. If you do not specify the operation type, the system clears the media fingerprint library by default.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of clearing or deleting a media fingerprint library.</p>
     * 
     * @param request SubmitFpDBDeleteJobRequest
     * @return SubmitFpDBDeleteJobResponse
     */
    public SubmitFpDBDeleteJobResponse submitFpDBDeleteJob(SubmitFpDBDeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFpDBDeleteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>You can call this operation to delete up to 200 media files from a media fingerprint library at a time.</li>
     * <li>This operation is available in the following regions: China (Beijing), China (Hangzhou), China (Shanghai), and Singapore.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of deleting media files from a media fingerprint library.</p>
     * 
     * @param request SubmitFpFileDeleteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFpFileDeleteJobResponse
     */
    public SubmitFpFileDeleteJobResponse submitFpFileDeleteJobWithOptions(SubmitFpFileDeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileIds)) {
            query.put("FileIds", request.fileIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fpDBId)) {
            query.put("FpDBId", request.fpDBId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKeys)) {
            query.put("PrimaryKeys", request.primaryKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFpFileDeleteJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFpFileDeleteJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>You can call this operation to delete up to 200 media files from a media fingerprint library at a time.</li>
     * <li>This operation is available in the following regions: China (Beijing), China (Hangzhou), China (Shanghai), and Singapore.</li>
     * </ul>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job of deleting media files from a media fingerprint library.</p>
     * 
     * @param request SubmitFpFileDeleteJobRequest
     * @return SubmitFpFileDeleteJobResponse
     */
    public SubmitFpFileDeleteJobResponse submitFpFileDeleteJob(SubmitFpFileDeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFpFileDeleteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a video, audio, image, or text fingerprint analysis job.</p>
     * <ul>
     * <li>This operation asynchronously submits a job. The query results may not have been generated when the response is returned. After the results are generated, an asynchronous message is returned.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * <li>The input file of the job must be in one of the following formats:<ul>
     * <li>Image formats: JPEG, PNG, and BMP.</li>
     * <li>Video formats: MP4, AVI, MKV, MPG, TS, MOV, FLV, MXF.</li>
     * <li>Video encoding formats: MPEG2, MPEG4, H264, HEVC, and WMV.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 150 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media fingerprint analysis job to query the media fingerprint repository for a media file with the identical or similar fingerprint as the input file.</p>
     * 
     * @param request SubmitFpShotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFpShotJobResponse
     */
    public SubmitFpShotJobResponse submitFpShotJobWithOptions(SubmitFpShotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fpShotConfig)) {
            query.put("FpShotConfig", request.fpShotConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFpShotJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFpShotJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to submit a video, audio, image, or text fingerprint analysis job.</p>
     * <ul>
     * <li>This operation asynchronously submits a job. The query results may not have been generated when the response is returned. After the results are generated, an asynchronous message is returned.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * <li>The input file of the job must be in one of the following formats:<ul>
     * <li>Image formats: JPEG, PNG, and BMP.</li>
     * <li>Video formats: MP4, AVI, MKV, MPG, TS, MOV, FLV, MXF.</li>
     * <li>Video encoding formats: MPEG2, MPEG4, H264, HEVC, and WMV.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 150 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media fingerprint analysis job to query the media fingerprint repository for a media file with the identical or similar fingerprint as the input file.</p>
     * 
     * @param request SubmitFpShotJobRequest
     * @return SubmitFpShotJobResponse
     */
    public SubmitFpShotJobResponse submitFpShotJob(SubmitFpShotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFpShotJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Jobs that are submitted by calling this operation run in an asynchronous manner. After a job is added to the ApsaraVideo Media Processing (MPS) queue, the job is scheduled to run. You can call the <a href="https://help.aliyun.com/document_detail/170217.html">QueryIProductionJob</a> operation or configure a callback to query the job result.</p>
     * <ul>
     * <li>Capabilities provided by the intelligent production feature vary based on the region. Before you call this operation to submit an intelligent production job, check whether the job is supported in the region in which your service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/43248.html">Regions and endpoints</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request SubmitIProductionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIProductionJobResponse
     */
    public SubmitIProductionJobResponse submitIProductionJobWithOptions(SubmitIProductionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleParams)) {
            query.put("ScheduleParams", request.scheduleParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIProductionJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIProductionJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Jobs that are submitted by calling this operation run in an asynchronous manner. After a job is added to the ApsaraVideo Media Processing (MPS) queue, the job is scheduled to run. You can call the <a href="https://help.aliyun.com/document_detail/170217.html">QueryIProductionJob</a> operation or configure a callback to query the job result.</p>
     * <ul>
     * <li>Capabilities provided by the intelligent production feature vary based on the region. Before you call this operation to submit an intelligent production job, check whether the job is supported in the region in which your service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/43248.html">Regions and endpoints</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * @param request SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    public SubmitIProductionJobResponse submitIProductionJob(SubmitIProductionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIProductionJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交图片版权水印任务</p>
     * 
     * @param request SubmitImageCopyrightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImageCopyrightResponse
     */
    public SubmitImageCopyrightResponse submitImageCopyrightWithOptions(SubmitImageCopyrightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImageCopyright"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImageCopyrightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交图片版权水印任务</p>
     * 
     * @param request SubmitImageCopyrightRequest
     * @return SubmitImageCopyrightResponse
     */
    public SubmitImageCopyrightResponse submitImageCopyright(SubmitImageCopyrightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImageCopyrightWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  SubmitJobs is an asynchronous operation. After you submit transcoding jobs, the jobs are added to an MPS queue to be scheduled and run. The transcoding jobs may not have been complete when the response is returned. After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/602836.html">QueryJobList</a> operation to query the job results. You can also associate a Message Service (MNS) queue or topic with the MPS queue to receive notifications on the jobs. For more information, see <a href="https://www.alibabacloud.com/help/zh/apsaravideo-for-media-processing/latest/receive-message-notifications">Receive notifications</a>.</p>
     * <ul>
     * <li>An input file can be up to 100 GB in size. If the size of the input file exceeds this limit, the job may fail.</li>
     * <li>If you use an <strong>intelligent preset template</strong> to transcode an input file, you must first call the <a href="https://help.aliyun.com/document_detail/29223.html">SubmitAnalysisJob</a> operation to submit a preset template analysis job. After the analysis job is complete, you can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a>operation to obtain the available preset templates for the input file. When you submit a transcoding job, set TemplateId to the ID of an available preset template. If you specify a preset template that is not in the available preset templates, the transcoding job fails.</li>
     * <li>If you use a <strong>static preset template</strong> to transcode an input file, you do not need to submit a preset template analysis job.</li>
     * <li>If you want to use multiple accounts in MPS, you can create Resource Access Management (RAM) users by using your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/42841.html">Create a RAM user and grant permissions to the RAM user</a>. If the Alibaba Cloud account that is used to query transcoding jobs is not the one that is used to submit the transcoding jobs, no data is returned.</li>
     * <li>For information about transcoding FAQ, see <a href="https://help.aliyun.com/document_detail/38986.html">FAQ about MPS</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits transcoding jobs. If the transcoding jobs and workflows created in the ApsaraVideo Media Processing (MPS) console cannot meet your business requirements, you can call the SubmitJobs operation to submit transcoding jobs. Specify transcoding parameters as required when you call the SubmitJobs operation.</p>
     * 
     * @param request SubmitJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitJobsResponse
     */
    public SubmitJobsResponse submitJobsWithOptions(SubmitJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputBucket)) {
            query.put("OutputBucket", request.outputBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputLocation)) {
            query.put("OutputLocation", request.outputLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputs)) {
            query.put("Outputs", request.outputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitJobs"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  SubmitJobs is an asynchronous operation. After you submit transcoding jobs, the jobs are added to an MPS queue to be scheduled and run. The transcoding jobs may not have been complete when the response is returned. After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/602836.html">QueryJobList</a> operation to query the job results. You can also associate a Message Service (MNS) queue or topic with the MPS queue to receive notifications on the jobs. For more information, see <a href="https://www.alibabacloud.com/help/zh/apsaravideo-for-media-processing/latest/receive-message-notifications">Receive notifications</a>.</p>
     * <ul>
     * <li>An input file can be up to 100 GB in size. If the size of the input file exceeds this limit, the job may fail.</li>
     * <li>If you use an <strong>intelligent preset template</strong> to transcode an input file, you must first call the <a href="https://help.aliyun.com/document_detail/29223.html">SubmitAnalysisJob</a> operation to submit a preset template analysis job. After the analysis job is complete, you can call the <a href="https://help.aliyun.com/document_detail/29224.html">QueryAnalysisJobList</a>operation to obtain the available preset templates for the input file. When you submit a transcoding job, set TemplateId to the ID of an available preset template. If you specify a preset template that is not in the available preset templates, the transcoding job fails.</li>
     * <li>If you use a <strong>static preset template</strong> to transcode an input file, you do not need to submit a preset template analysis job.</li>
     * <li>If you want to use multiple accounts in MPS, you can create Resource Access Management (RAM) users by using your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/42841.html">Create a RAM user and grant permissions to the RAM user</a>. If the Alibaba Cloud account that is used to query transcoding jobs is not the one that is used to submit the transcoding jobs, no data is returned.</li>
     * <li>For information about transcoding FAQ, see <a href="https://help.aliyun.com/document_detail/38986.html">FAQ about MPS</a>.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits transcoding jobs. If the transcoding jobs and workflows created in the ApsaraVideo Media Processing (MPS) console cannot meet your business requirements, you can call the SubmitJobs operation to submit transcoding jobs. Specify transcoding parameters as required when you call the SubmitJobs operation.</p>
     * 
     * @param request SubmitJobsRequest
     * @return SubmitJobsResponse
     */
    public SubmitJobsResponse submitJobs(SubmitJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue and then scheduled, queued, and run. You can call the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job result.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a content moderation job.</p>
     * 
     * @param request SubmitMediaCensorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaCensorJobResponse
     */
    public SubmitMediaCensorJobResponse submitMediaCensorJobWithOptions(SubmitMediaCensorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.barrages)) {
            query.put("Barrages", request.barrages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverImages)) {
            query.put("CoverImages", request.coverImages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUrl)) {
            query.put("ExternalUrl", request.externalUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoCensorConfig)) {
            query.put("VideoCensorConfig", request.videoCensorConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaCensorJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaCensorJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue and then scheduled, queued, and run. You can call the <a href="https://help.aliyun.com/document_detail/91779.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job result.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a content moderation job.</p>
     * 
     * @param request SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    public SubmitMediaCensorJobResponse submitMediaCensorJob(SubmitMediaCensorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaCensorJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you call the SubmitMediaInfoJob operation, ApsaraVideo Media Processing (MPS) analyzes the input media file and generates the analysis results. You can call the <a href="https://help.aliyun.com/document_detail/29221.html">QueryMediaInfoJobList</a> operation to query the analysis results.</p>
     * <blockquote>
     * <p>We recommend that you submit a media information analysis job after you confirm that the media file is uploaded to Object Storage Service (OSS). You can configure upload callbacks to be notified of the upload status of files.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media information analysis job.</p>
     * 
     * @param request SubmitMediaInfoJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaInfoJobResponse
     */
    public SubmitMediaInfoJobResponse submitMediaInfoJobWithOptions(SubmitMediaInfoJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaInfoJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaInfoJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you call the SubmitMediaInfoJob operation, ApsaraVideo Media Processing (MPS) analyzes the input media file and generates the analysis results. You can call the <a href="https://help.aliyun.com/document_detail/29221.html">QueryMediaInfoJobList</a> operation to query the analysis results.</p>
     * <blockquote>
     * <p>We recommend that you submit a media information analysis job after you confirm that the media file is uploaded to Object Storage Service (OSS). You can configure upload callbacks to be notified of the upload status of files.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media information analysis job.</p>
     * 
     * @param request SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    public SubmitMediaInfoJobResponse submitMediaInfoJob(SubmitMediaInfoJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaInfoJobWithOptions(request, runtime);
    }

    /**
     * @param request SubmitSmarttagJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSmarttagJobResponse
     */
    public SubmitSmarttagJobResponse submitSmarttagJobWithOptions(SubmitSmarttagJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentAddr)) {
            query.put("ContentAddr", request.contentAddr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSmarttagJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSmarttagJobResponse());
    }

    /**
     * @param request SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    public SubmitSmarttagJobResponse submitSmarttagJob(SubmitSmarttagJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmarttagJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only JPG images can be generated by calling this operation.</p>
     * <ul>
     * <li>Asynchronous mode: This operation may return a response before snapshots are captured. Snapshot jobs are queued in the background and asynchronously processed by ApsaraVideo Media Processing (MPS). If the <strong>Interval</strong> or <strong>Num</strong> parameter is set, the snapshot job is processed in asynchronous mode. For more information about FAQ about capturing snapshots, see <a href="https://help.aliyun.com/document_detail/60805.html">FAQ about taking snapshots</a>.</li>
     * <li>Notifications: When you submit a snapshot job, the <strong>PipelineId</strong> parameter is required. An asynchronous message is sent only after the notification feature is enabled for the MPS queue.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a snapshot job.</p>
     * 
     * @param request SubmitSnapshotJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJobWithOptions(SubmitSnapshotJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotConfig)) {
            query.put("SnapshotConfig", request.snapshotConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSnapshotJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSnapshotJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only JPG images can be generated by calling this operation.</p>
     * <ul>
     * <li>Asynchronous mode: This operation may return a response before snapshots are captured. Snapshot jobs are queued in the background and asynchronously processed by ApsaraVideo Media Processing (MPS). If the <strong>Interval</strong> or <strong>Num</strong> parameter is set, the snapshot job is processed in asynchronous mode. For more information about FAQ about capturing snapshots, see <a href="https://help.aliyun.com/document_detail/60805.html">FAQ about taking snapshots</a>.</li>
     * <li>Notifications: When you submit a snapshot job, the <strong>PipelineId</strong> parameter is required. An asynchronous message is sent only after the notification feature is enabled for the MPS queue.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a snapshot job.</p>
     * 
     * @param request SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    public SubmitSnapshotJobResponse submitSnapshotJob(SubmitSnapshotJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSnapshotJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频溯源水印ab流任务</p>
     * 
     * @param request SubmitTraceAbJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTraceAbJobResponse
     */
    public SubmitTraceAbJobResponse submitTraceAbJobWithOptions(SubmitTraceAbJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherBase64ed)) {
            query.put("CipherBase64ed", request.cipherBase64ed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTime)) {
            query.put("TotalTime", request.totalTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTraceAbJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTraceAbJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频溯源水印ab流任务</p>
     * 
     * @param request SubmitTraceAbJobRequest
     * @return SubmitTraceAbJobResponse
     */
    public SubmitTraceAbJobResponse submitTraceAbJob(SubmitTraceAbJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTraceAbJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交溯源水印提取任务</p>
     * 
     * @param request SubmitTraceExtractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTraceExtractJobResponse
     */
    public SubmitTraceExtractJobResponse submitTraceExtractJobWithOptions(SubmitTraceExtractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTraceExtractJob"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTraceExtractJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交溯源水印提取任务</p>
     * 
     * @param request SubmitTraceExtractJobRequest
     * @return SubmitTraceExtractJobResponse
     */
    public SubmitTraceExtractJobResponse submitTraceExtractJob(SubmitTraceExtractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTraceExtractJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频溯源水印m3u8文件任务</p>
     * 
     * @param request SubmitTraceM3u8JobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitTraceM3u8JobResponse
     */
    public SubmitTraceM3u8JobResponse submitTraceM3u8JobWithOptions(SubmitTraceM3u8JobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyUri)) {
            query.put("KeyUri", request.keyUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trace)) {
            query.put("Trace", request.trace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTraceM3u8Job"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTraceM3u8JobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交视频溯源水印m3u8文件任务</p>
     * 
     * @param request SubmitTraceM3u8JobRequest
     * @return SubmitTraceM3u8JobResponse
     */
    public SubmitTraceM3u8JobResponse submitTraceM3u8Job(SubmitTraceM3u8JobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTraceM3u8JobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The response parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>The description of the figure. The description can be up to 512 characters in length.</p>
     * 
     * @param request TagCustomPersonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagCustomPersonResponse
     */
    public TagCustomPersonResponse tagCustomPersonWithOptions(TagCustomPersonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryDescription)) {
            query.put("CategoryDescription", request.categoryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personDescription)) {
            query.put("PersonDescription", request.personDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personName)) {
            query.put("PersonName", request.personName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagCustomPerson"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagCustomPersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>The response parameters.</p>
     * 
     * <b>summary</b> : 
     * <p>The description of the figure. The description can be up to 512 characters in length.</p>
     * 
     * @param request TagCustomPersonRequest
     * @return TagCustomPersonResponse
     */
    public TagCustomPersonResponse tagCustomPerson(TagCustomPersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagCustomPersonWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation to unbind an input media bucket from the media library based on the name of the output media bucket.</p>
     * <h1>QPS limits</h1>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds an input media bucket from the media library.</p>
     * 
     * @param request UnbindInputBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindInputBucketResponse
     */
    public UnbindInputBucketResponse unbindInputBucketWithOptions(UnbindInputBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindInputBucket"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindInputBucketResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>You can call this operation to unbind an input media bucket from the media library based on the name of the output media bucket.</p>
     * <h1>QPS limits</h1>
     * <p>You can call this API operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds an input media bucket from the media library.</p>
     * 
     * @param request UnbindInputBucketRequest
     * @return UnbindInputBucketResponse
     */
    public UnbindInputBucketResponse unbindInputBucket(UnbindInputBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindInputBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The name of the output media bucket to be unbound. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS)</strong> console and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>Object Storage Service (OSS) console</strong> and click <strong>My OSS Paths</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to unbind an output media bucket from the media library based on the name of the output media bucket.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request UnbindOutputBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindOutputBucketResponse
     */
    public UnbindOutputBucketResponse unbindOutputBucketWithOptions(UnbindOutputBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindOutputBucket"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindOutputBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>The name of the output media bucket to be unbound. To obtain the media bucket name, you can log on to the <strong>ApsaraVideo Media Processing (MPS)</strong> console and choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane. Alternatively, you can log on to the <strong>Object Storage Service (OSS) console</strong> and click <strong>My OSS Paths</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to unbind an output media bucket from the media library based on the name of the output media bucket.</p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * @param request UnbindOutputBucketRequest
     * @return UnbindOutputBucketResponse
     */
    public UnbindOutputBucketResponse unbindOutputBucket(UnbindOutputBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindOutputBucketWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specific custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * 
     * @param request UnregisterCustomFaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnregisterCustomFaceResponse
     */
    public UnregisterCustomFaceResponse unregisterCustomFaceWithOptions(UnregisterCustomFaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceId)) {
            query.put("FaceId", request.faceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personId)) {
            query.put("PersonId", request.personId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnregisterCustomFace"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnregisterCustomFaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a specific custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped, and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom face, all the custom faces that are registered in a custom figure library, or a custom figure library.</p>
     * 
     * @param request UnregisterCustomFaceRequest
     * @return UnregisterCustomFaceResponse
     */
    public UnregisterCustomFaceResponse unregisterCustomFace(UnregisterCustomFaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unregisterCustomFaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The basic information that you can update by calling this operation includes the title, description, and category of a media file. This operation applies to a full update. You must set all the parameters unless you want to replace the value of a specific parameter with a NULL value.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about a media file.</p>
     * 
     * @param request UpdateMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaResponse
     */
    public UpdateMediaResponse updateMediaWithOptions(UpdateMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMedia"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The basic information that you can update by calling this operation includes the title, description, and category of a media file. This operation applies to a full update. You must set all the parameters unless you want to replace the value of a specific parameter with a NULL value.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information about a media file.</p>
     * 
     * @param request UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    public UpdateMediaResponse updateMedia(UpdateMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the category of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the category to which a media file belongs.</p>
     * 
     * @param request UpdateMediaCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaCategoryResponse
     */
    public UpdateMediaCategoryResponse updateMediaCategoryWithOptions(UpdateMediaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cateId)) {
            query.put("CateId", request.cateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaCategory"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the category of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the category to which a media file belongs.</p>
     * 
     * @param request UpdateMediaCategoryRequest
     * @return UpdateMediaCategoryResponse
     */
    public UpdateMediaCategoryResponse updateMediaCategory(UpdateMediaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the thumbnail of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h2>Limits on QPS</h2>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the thumbnail of a media file.</p>
     * 
     * @param request UpdateMediaCoverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaCoverResponse
     */
    public UpdateMediaCoverResponse updateMediaCoverWithOptions(UpdateMediaCoverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaCover"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaCoverResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to update only the thumbnail of a media file. For more information about how to update all the information about a media file, see <a href="https://help.aliyun.com/document_detail/44464.html">UpdateMedia</a>.</p>
     * <h2>Limits on QPS</h2>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the thumbnail of a media file.</p>
     * 
     * @param request UpdateMediaCoverRequest
     * @return UpdateMediaCoverResponse
     */
    public UpdateMediaCoverResponse updateMediaCover(UpdateMediaCoverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaCoverWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The published state indicates that the access control list (ACL) of media playback resources and snapshot files is set to inherit the ACL of the bucket to which they belong. The unpublished state indicates that the ACL of media playback resources and snapshot files is set to private.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the publishing status of a media file.</p>
     * 
     * @param request UpdateMediaPublishStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaPublishStateResponse
     */
    public UpdateMediaPublishStateResponse updateMediaPublishStateWithOptions(UpdateMediaPublishStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publish)) {
            query.put("Publish", request.publish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaPublishState"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaPublishStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>The published state indicates that the access control list (ACL) of media playback resources and snapshot files is set to inherit the ACL of the bucket to which they belong. The unpublished state indicates that the ACL of media playback resources and snapshot files is set to private.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the publishing status of a media file.</p>
     * 
     * @param request UpdateMediaPublishStateRequest
     * @return UpdateMediaPublishStateResponse
     */
    public UpdateMediaPublishStateResponse updateMediaPublishState(UpdateMediaPublishStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaPublishStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the topology of a media workflow. To update the trigger mode of a media workflow, call the <a href="https://help.aliyun.com/document_detail/70372.html">UpdateMediaWorkflowTriggerMode</a> operation.</p>
     * <ul>
     * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.
     * <warning>Deleting or deactivating a workflow will not affect tasks that have already been submitted. If a workflow is deleted or deactivated after a task has been submitted, tasks that are already in the processing queue will not be canceled and will be executed normally and charged the corresponding fees.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.&gt;</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the topology of a media workflow.</p>
     * 
     * @param request UpdateMediaWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaWorkflowResponse
     */
    public UpdateMediaWorkflowResponse updateMediaWorkflowWithOptions(UpdateMediaWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topology)) {
            query.put("Topology", request.topology);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerMode)) {
            query.put("TriggerMode", request.triggerMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaWorkflow"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the topology of a media workflow. To update the trigger mode of a media workflow, call the <a href="https://help.aliyun.com/document_detail/70372.html">UpdateMediaWorkflowTriggerMode</a> operation.</p>
     * <ul>
     * <li>After you delete or deactivate a media workflow, the workflow cannot be used. In this case, the workflow is not automatically triggered when you upload a file to the bucket specified by the workflow.
     * <warning>Deleting or deactivating a workflow will not affect tasks that have already been submitted. If a workflow is deleted or deactivated after a task has been submitted, tasks that are already in the processing queue will not be canceled and will be executed normally and charged the corresponding fees.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.&gt;</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the topology of a media workflow.</p>
     * 
     * @param request UpdateMediaWorkflowRequest
     * @return UpdateMediaWorkflowResponse
     */
    public UpdateMediaWorkflowResponse updateMediaWorkflow(UpdateMediaWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only to modify the trigger mode of a media workflow. To modify other information about the workflow, call the <a href="https://help.aliyun.com/document_detail/44438.html">UpdateMediaWorkflow</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the trigger mode of a media workflow.</p>
     * 
     * @param request UpdateMediaWorkflowTriggerModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaWorkflowTriggerModeResponse
     */
    public UpdateMediaWorkflowTriggerModeResponse updateMediaWorkflowTriggerModeWithOptions(UpdateMediaWorkflowTriggerModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaWorkflowId)) {
            query.put("MediaWorkflowId", request.mediaWorkflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerMode)) {
            query.put("TriggerMode", request.triggerMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMediaWorkflowTriggerMode"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaWorkflowTriggerModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only to modify the trigger mode of a media workflow. To modify other information about the workflow, call the <a href="https://help.aliyun.com/document_detail/44438.html">UpdateMediaWorkflow</a> operation.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the trigger mode of a media workflow.</p>
     * 
     * @param request UpdateMediaWorkflowTriggerModeRequest
     * @return UpdateMediaWorkflowTriggerModeResponse
     */
    public UpdateMediaWorkflowTriggerModeResponse updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaWorkflowTriggerModeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify the name, status, and notification settings of the specified MPS queue.</p>
     * <ul>
     * <li>If a paused MPS queue is selected in a workflow or a job, such as a video review or media fingerprint job, the workflow or job fails.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request UpdatePipelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipelineWithOptions(UpdatePipelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extendConfig)) {
            query.put("ExtendConfig", request.extendConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            query.put("NotifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePipeline"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePipelineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify the name, status, and notification settings of the specified MPS queue.</p>
     * <ul>
     * <li>If a paused MPS queue is selected in a workflow or a job, such as a video review or media fingerprint job, the workflow or job fails.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an ApsaraVideo Media Processing (MPS) queue.</p>
     * 
     * @param request UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePipelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新智能标签模板接口支持cpv</p>
     * 
     * @param request UpdateSmarttagTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSmarttagTemplateResponse
     */
    public UpdateSmarttagTemplateResponse updateSmarttagTemplateWithOptions(UpdateSmarttagTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyseTypes)) {
            query.put("AnalyseTypes", request.analyseTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceCategoryIds)) {
            query.put("FaceCategoryIds", request.faceCategoryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceCustomParamsConfig)) {
            query.put("FaceCustomParamsConfig", request.faceCustomParamsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordConfig)) {
            query.put("KeywordConfig", request.keywordConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeConfig)) {
            query.put("KnowledgeConfig", request.knowledgeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelType)) {
            query.put("LabelType", request.labelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelVersion)) {
            query.put("LabelVersion", request.labelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.landmarkGroupIds)) {
            query.put("LandmarkGroupIds", request.landmarkGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectGroupIds)) {
            query.put("ObjectGroupIds", request.objectGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSmarttagTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSmarttagTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新智能标签模板接口支持cpv</p>
     * 
     * @param request UpdateSmarttagTemplateRequest
     * @return UpdateSmarttagTemplateResponse
     */
    public UpdateSmarttagTemplateResponse updateSmarttagTemplate(UpdateSmarttagTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSmarttagTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be updated if it is being used by a job that has been submitted.The ID of the template. You can obtain the template ID from the response of the <a href="https://help.aliyun.com/document_detail/213306.html">AddTemplate</a> operation.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request UpdateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audio)) {
            query.put("Audio", request.audio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.muxConfig)) {
            query.put("MuxConfig", request.muxConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transConfig)) {
            query.put("TransConfig", request.transConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>A custom transcoding template cannot be updated if it is being used by a job that has been submitted.The ID of the template. You can obtain the template ID from the response of the <a href="https://help.aliyun.com/document_detail/213306.html">AddTemplate</a> operation.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the information about a watermark template based on the ID of the watermark template. For example, you can update the name and configurations of a watermark template.</p>
     * <ul>
     * <li>A watermark template cannot be updated if it is being used by a job that has been submitted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and configurations of the specified watermark template.</p>
     * 
     * @param request UpdateWaterMarkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWaterMarkTemplateResponse
     */
    public UpdateWaterMarkTemplateResponse updateWaterMarkTemplateWithOptions(UpdateWaterMarkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waterMarkTemplateId)) {
            query.put("WaterMarkTemplateId", request.waterMarkTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWaterMarkTemplate"),
            new TeaPair("version", "2014-06-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWaterMarkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to update the information about a watermark template based on the ID of the watermark template. For example, you can update the name and configurations of a watermark template.</p>
     * <ul>
     * <li>A watermark template cannot be updated if it is being used by a job that has been submitted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name and configurations of the specified watermark template.</p>
     * 
     * @param request UpdateWaterMarkTemplateRequest
     * @return UpdateWaterMarkTemplateResponse
     */
    public UpdateWaterMarkTemplateResponse updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWaterMarkTemplateWithOptions(request, runtime);
    }
}
