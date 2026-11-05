// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620;

import com.aliyun.tea.*;
import com.aliyun.dfs20180620.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dfs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Adds compute instances to a mount point.</p>
     * 
     * @param tmpReq AttachVscMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVscMountPointResponse
     */
    public AttachVscMountPointResponse attachVscMountPointWithOptions(AttachVscMountPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachVscMountPointShrinkRequest request = new AttachVscMountPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vscIds)) {
            request.vscIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vscIds, "VscIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAssumeRoleChkServerPerm)) {
            query.put("UseAssumeRoleChkServerPerm", request.useAssumeRoleChkServerPerm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscIdsShrink)) {
            query.put("VscIds", request.vscIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscName)) {
            query.put("VscName", request.vscName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscType)) {
            query.put("VscType", request.vscType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVscMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVscMountPointResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Adds compute instances to a mount point.</p>
     * 
     * @param request AttachVscMountPointRequest
     * @return AttachVscMountPointResponse
     */
    public AttachVscMountPointResponse attachVscMountPoint(AttachVscMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVscMountPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, only one VSC can be associated with multiple mount points. Specifically, the values of AttachInfos.InstanceId or AttachInfos.VscId must be equal.</p>
     * 
     * <b>summary</b> : 
     * <p>Mounts multiple VSC mount points.</p>
     * 
     * @param tmpReq AttachVscToMountPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVscToMountPointsResponse
     */
    public AttachVscToMountPointsResponse attachVscToMountPointsWithOptions(AttachVscToMountPointsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachVscToMountPointsShrinkRequest request = new AttachVscToMountPointsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attachInfos)) {
            request.attachInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attachInfos, "AttachInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachInfosShrink)) {
            query.put("AttachInfos", request.attachInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAssumeRoleChkServerPerm)) {
            query.put("UseAssumeRoleChkServerPerm", request.useAssumeRoleChkServerPerm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVscToMountPoints"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVscToMountPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, only one VSC can be associated with multiple mount points. Specifically, the values of AttachInfos.InstanceId or AttachInfos.VscId must be equal.</p>
     * 
     * <b>summary</b> : 
     * <p>Mounts multiple VSC mount points.</p>
     * 
     * @param request AttachVscToMountPointsRequest
     * @return AttachVscToMountPointsResponse
     */
    public AttachVscToMountPointsResponse attachVscToMountPoints(AttachVscToMountPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVscToMountPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a VSC mount point alias with a file system.</p>
     * 
     * @param request BindVscMountPointAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindVscMountPointAliasResponse
     */
    public BindVscMountPointAliasResponse bindVscMountPointAliasWithOptions(BindVscMountPointAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliasPrefix)) {
            query.put("AliasPrefix", request.aliasPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindVscMountPointAlias"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindVscMountPointAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a VSC mount point alias with a file system.</p>
     * 
     * @param request BindVscMountPointAliasRequest
     * @return BindVscMountPointAliasResponse
     */
    public BindVscMountPointAliasResponse bindVscMountPointAlias(BindVscMountPointAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindVscMountPointAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access group.</p>
     * 
     * @param request CreateAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroupWithOptions(CreateAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessGroup"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access group.</p>
     * 
     * @param request CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access group rule.</p>
     * 
     * @param request CreateAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRuleWithOptions(CreateAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkSegment)) {
            query.put("NetworkSegment", request.networkSegment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessRule"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access group rule.</p>
     * 
     * @param request CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRule(CreateAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you create a file system, learn about the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=a2c4g.11186623.0.0.476a13d7VQohVH#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a file system.</p>
     * 
     * @param request CreateFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystemWithOptions(CreateFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataRedundancyType)) {
            query.put("DataRedundancyType", request.dataRedundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedClusterId)) {
            query.put("DedicatedClusterId", request.dedicatedClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemName)) {
            query.put("FileSystemName", request.fileSystemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meteringMode)) {
            query.put("MeteringMode", request.meteringMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNumber)) {
            query.put("PartitionNumber", request.partitionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedThroughputInMiBps)) {
            query.put("ProvisionedThroughputInMiBps", request.provisionedThroughputInMiBps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceCapacity)) {
            query.put("SpaceCapacity", request.spaceCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSetName)) {
            query.put("StorageSetName", request.storageSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughputMode)) {
            query.put("ThroughputMode", request.throughputMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileSystem"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you create a file system, learn about the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=a2c4g.11186623.0.0.476a13d7VQohVH#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a file system.</p>
     * 
     * @param request CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMountPointResponse
     */
    public CreateMountPointResponse createMountPointWithOptions(CreateMountPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usePerformanceMode)) {
            query.put("UsePerformanceMode", request.usePerformanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountPointRequest
     * @return CreateMountPointResponse
     */
    public CreateMountPointResponse createMountPoint(CreateMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateQosPolicy</p>
     * 
     * @param tmpReq CreateQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQosPolicyResponse
     */
    public CreateQosPolicyResponse createQosPolicyWithOptions(CreateQosPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateQosPolicyShrinkRequest request = new CreateQosPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flowIds)) {
            request.flowIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flowIds, "FlowIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reqTags)) {
            request.reqTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reqTags, "ReqTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.zoneIds)) {
            request.zoneIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.zoneIds, "ZoneIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federationId)) {
            query.put("FederationId", request.federationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowIdsShrink)) {
            query.put("FlowIds", request.flowIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIOBandWidth)) {
            query.put("MaxIOBandWidth", request.maxIOBandWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIOps)) {
            query.put("MaxIOps", request.maxIOps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMetaQps)) {
            query.put("MaxMetaQps", request.maxMetaQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTagsShrink)) {
            query.put("ReqTags", request.reqTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIdsShrink)) {
            query.put("ZoneIds", request.zoneIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("storageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQosPolicy"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQosPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateQosPolicy</p>
     * 
     * @param request CreateQosPolicyRequest
     * @return CreateQosPolicyResponse
     */
    public CreateQosPolicyResponse createQosPolicy(CreateQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>File system permission management in Apsara File Storage for HDFS relies on the users and groups of files. You must manage user and group mappings by calling API operations. For more information about the directory and file access permissions of Apsara File Storage for HDFS file systems, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>The number of users and groups in a single file system is subject to the following limits:<ul>
     * <li>A single file system can have a maximum of 1,000 users.</li>
     * <li>A single file system can have a maximum of 30 groups.</li>
     * <li>Each user can belong to a maximum of 10 groups.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a user and group mapping for an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param tmpReq CreateUserGroupsMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupsMappingResponse
     */
    public CreateUserGroupsMappingResponse createUserGroupsMappingWithOptions(CreateUserGroupsMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserGroupsMappingShrinkRequest request = new CreateUserGroupsMappingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupNames)) {
            request.groupNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupNames, "GroupNames", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroupsMapping"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupsMappingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>File system permission management in Apsara File Storage for HDFS relies on the users and groups of files. You must manage user and group mappings by calling API operations. For more information about the directory and file access permissions of Apsara File Storage for HDFS file systems, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>The number of users and groups in a single file system is subject to the following limits:<ul>
     * <li>A single file system can have a maximum of 1,000 users.</li>
     * <li>A single file system can have a maximum of 30 groups.</li>
     * <li>Each user can belong to a maximum of 10 groups.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a user and group mapping for an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param request CreateUserGroupsMappingRequest
     * @return CreateUserGroupsMappingResponse
     */
    public CreateUserGroupsMappingResponse createUserGroupsMapping(CreateUserGroupsMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupsMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a VSC mount target.</p>
     * 
     * @param tmpReq CreateVscMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVscMountPointResponse
     */
    public CreateVscMountPointResponse createVscMountPointWithOptions(CreateVscMountPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVscMountPointShrinkRequest request = new CreateVscMountPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVscMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVscMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a VSC mount target.</p>
     * 
     * @param request CreateVscMountPointRequest
     * @return CreateVscMountPointResponse
     */
    public CreateVscMountPointResponse createVscMountPoint(CreateVscMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVscMountPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroupWithOptions(DeleteAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessGroup"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a permission group rule.</p>
     * 
     * @param request DeleteAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRuleWithOptions(DeleteAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessRule"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a permission group rule.</p>
     * 
     * @param request DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRule(DeleteAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete a file system instance only when the number of mount targets for the file system is 0.</li>
     * <li>Once a file system instance is deleted, its data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystemWithOptions(DeleteFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileSystem"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete a file system instance only when the number of mount targets for the file system is 0.</li>
     * <li>Once a file system instance is deleted, its data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>API Guide</h3>
     * <p>After a mount target is deleted, it cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a mount target.</p>
     * 
     * @param request DeleteMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMountPointResponse
     */
    public DeleteMountPointResponse deleteMountPointWithOptions(DeleteMountPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMountPointResponse());
    }

    /**
     * <b>description</b> :
     * <h3>API Guide</h3>
     * <p>After a mount target is deleted, it cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a mount target.</p>
     * 
     * @param request DeleteMountPointRequest
     * @return DeleteMountPointResponse
     */
    public DeleteMountPointResponse deleteMountPoint(DeleteMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteQosPolicy</p>
     * 
     * @param request DeleteQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQosPolicyResponse
     */
    public DeleteQosPolicyResponse deleteQosPolicyWithOptions(DeleteQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federationId)) {
            query.put("FederationId", request.federationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosPolicyId)) {
            query.put("QosPolicyId", request.qosPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQosPolicy"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQosPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteQosPolicy</p>
     * 
     * @param request DeleteQosPolicyRequest
     * @return DeleteQosPolicyResponse
     */
    public DeleteQosPolicyResponse deleteQosPolicy(DeleteQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQosPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>Permission management for Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by using OpenAPI. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>You cannot delete users and groups from a file system. You can only delete the mappings between users and groups. Once a user or group is added to a file system in any way, it cannot be deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the mappings between users and groups for an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param tmpReq DeleteUserGroupsMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupsMappingResponse
     */
    public DeleteUserGroupsMappingResponse deleteUserGroupsMappingWithOptions(DeleteUserGroupsMappingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteUserGroupsMappingShrinkRequest request = new DeleteUserGroupsMappingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupNames)) {
            request.groupNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupNames, "GroupNames", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroupsMapping"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupsMappingResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>Permission management for Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by using OpenAPI. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>You cannot delete users and groups from a file system. You can only delete the mappings between users and groups. Once a user or group is added to a file system in any way, it cannot be deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the mappings between users and groups for an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param request DeleteUserGroupsMappingRequest
     * @return DeleteUserGroupsMappingResponse
     */
    public DeleteUserGroupsMappingResponse deleteUserGroupsMapping(DeleteUserGroupsMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupsMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an existing VSC mount point.</p>
     * 
     * @param request DeleteVscMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVscMountPointResponse
     */
    public DeleteVscMountPointResponse deleteVscMountPointWithOptions(DeleteVscMountPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVscMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVscMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an existing VSC mount point.</p>
     * 
     * @param request DeleteVscMountPointRequest
     * @return DeleteVscMountPointResponse
     */
    public DeleteVscMountPointResponse deleteVscMountPoint(DeleteVscMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVscMountPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supports only one-to-many mappings from a storage resource (MountPointId) to multiple compute resources (InstanceId and VscId), and one-to-many mappings from a compute resource (InstanceId and VscId) to multiple storage resources (MountPointId).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the mount information of VSCs in batches.</p>
     * 
     * @param tmpReq DescribeMountPointsVscAttachInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountPointsVscAttachInfoResponse
     */
    public DescribeMountPointsVscAttachInfoResponse describeMountPointsVscAttachInfoWithOptions(DescribeMountPointsVscAttachInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeMountPointsVscAttachInfoShrinkRequest request = new DescribeMountPointsVscAttachInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryInfos)) {
            request.queryInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryInfos, "QueryInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryInfosShrink)) {
            query.put("QueryInfos", request.queryInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAssumeRoleChkServerPerm)) {
            query.put("UseAssumeRoleChkServerPerm", request.useAssumeRoleChkServerPerm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMountPointsVscAttachInfo"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountPointsVscAttachInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supports only one-to-many mappings from a storage resource (MountPointId) to multiple compute resources (InstanceId and VscId), and one-to-many mappings from a compute resource (InstanceId and VscId) to multiple storage resources (MountPointId).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the mount information of VSCs in batches.</p>
     * 
     * @param request DescribeMountPointsVscAttachInfoRequest
     * @return DescribeMountPointsVscAttachInfoResponse
     */
    public DescribeMountPointsVscAttachInfoResponse describeMountPointsVscAttachInfo(DescribeMountPointsVscAttachInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountPointsVscAttachInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available Alibaba Cloud regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available Alibaba Cloud regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of VSC mount points.</p>
     * 
     * @param request DescribeVscMountPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVscMountPointsResponse
     */
    public DescribeVscMountPointsResponse describeVscMountPointsWithOptions(DescribeVscMountPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscId)) {
            query.put("VscId", request.vscId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVscMountPoints"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVscMountPointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of VSC mount points.</p>
     * 
     * @param request DescribeVscMountPointsRequest
     * @return DescribeVscMountPointsResponse
     */
    public DescribeVscMountPointsResponse describeVscMountPoints(DescribeVscMountPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVscMountPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unmounts multiple VSC mount points.</p>
     * 
     * @param tmpReq DetachVscFromMountPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVscFromMountPointsResponse
     */
    public DetachVscFromMountPointsResponse detachVscFromMountPointsWithOptions(DetachVscFromMountPointsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachVscFromMountPointsShrinkRequest request = new DetachVscFromMountPointsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detachInfos)) {
            request.detachInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detachInfos, "DetachInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detachInfosShrink)) {
            query.put("DetachInfos", request.detachInfosShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAssumeRoleChkServerPerm)) {
            query.put("UseAssumeRoleChkServerPerm", request.useAssumeRoleChkServerPerm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVscFromMountPoints"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVscFromMountPointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unmounts multiple VSC mount points.</p>
     * 
     * @param request DetachVscFromMountPointsRequest
     * @return DetachVscFromMountPointsResponse
     */
    public DetachVscFromMountPointsResponse detachVscFromMountPoints(DetachVscFromMountPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVscFromMountPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates compute instances from a mount point.</p>
     * 
     * @param tmpReq DetachVscMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVscMountPointResponse
     */
    public DetachVscMountPointResponse detachVscMountPointWithOptions(DetachVscMountPointRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachVscMountPointShrinkRequest request = new DetachVscMountPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vscIds)) {
            request.vscIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vscIds, "VscIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAssumeRoleChkServerPerm)) {
            query.put("UseAssumeRoleChkServerPerm", request.useAssumeRoleChkServerPerm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vscIdsShrink)) {
            query.put("VscIds", request.vscIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVscMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVscMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates compute instances from a mount point.</p>
     * 
     * @param request DetachVscMountPointRequest
     * @return DetachVscMountPointResponse
     */
    public DetachVscMountPointResponse detachVscMountPoint(DetachVscMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVscMountPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about an access group.</p>
     * 
     * @param request GetAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessGroupResponse
     */
    public GetAccessGroupResponse getAccessGroupWithOptions(GetAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessGroup"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about an access group.</p>
     * 
     * @param request GetAccessGroupRequest
     * @return GetAccessGroupResponse
     */
    public GetAccessGroupResponse getAccessGroup(GetAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query permission group rule information.</p>
     * 
     * @param request GetAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessRuleResponse
     */
    public GetAccessRuleResponse getAccessRuleWithOptions(GetAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessRule"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query permission group rule information.</p>
     * 
     * @param request GetAccessRuleRequest
     * @return GetAccessRuleResponse
     */
    public GetAccessRuleResponse getAccessRule(GetAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file system information.</p>
     * 
     * @param request GetFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileSystemResponse
     */
    public GetFileSystemResponse getFileSystemWithOptions(GetFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileSystem"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file system information.</p>
     * 
     * @param request GetFileSystemRequest
     * @return GetFileSystemResponse
     */
    public GetFileSystemResponse getFileSystem(GetFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a mount point.</p>
     * 
     * @param request GetMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMountPointResponse
     */
    public GetMountPointResponse getMountPointWithOptions(GetMountPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a mount point.</p>
     * 
     * @param request GetMountPointRequest
     * @return GetMountPointResponse
     */
    public GetMountPointResponse getMountPoint(GetMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMountPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information for each zone in a specified region.</p>
     * 
     * @param request GetRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegionResponse
     */
    public GetRegionResponse getRegionWithOptions(GetRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegion"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information for each zone in a specified region.</p>
     * 
     * @param request GetRegionRequest
     * @return GetRegionResponse
     */
    public GetRegionResponse getRegion(GetRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of access groups in batches.</p>
     * 
     * @param request ListAccessGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessGroupsResponse
     */
    public ListAccessGroupsResponse listAccessGroupsWithOptions(ListAccessGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOffset)) {
            query.put("StartOffset", request.startOffset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessGroups"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of access groups in batches.</p>
     * 
     * @param request ListAccessGroupsRequest
     * @return ListAccessGroupsResponse
     */
    public ListAccessGroupsResponse listAccessGroups(ListAccessGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access group rules.</p>
     * 
     * @param request ListAccessRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessRulesResponse
     */
    public ListAccessRulesResponse listAccessRulesWithOptions(ListAccessRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOffset)) {
            query.put("StartOffset", request.startOffset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessRules"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries access group rules.</p>
     * 
     * @param request ListAccessRulesRequest
     * @return ListAccessRulesResponse
     */
    public ListAccessRulesResponse listAccessRules(ListAccessRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Federation</p>
     * 
     * @param request ListFederationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFederationsResponse
     */
    public ListFederationsResponse listFederationsWithOptions(ListFederationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federationId)) {
            query.put("FederationId", request.federationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFederations"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFederationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Federation</p>
     * 
     * @param request ListFederationsRequest
     * @return ListFederationsResponse
     */
    public ListFederationsResponse listFederations(ListFederationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFederationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of multiple file systems.</p>
     * 
     * @param request ListFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileSystemsResponse
     */
    public ListFileSystemsResponse listFileSystemsWithOptions(ListFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOffset)) {
            query.put("StartOffset", request.startOffset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileSystems"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of multiple file systems.</p>
     * 
     * @param request ListFileSystemsRequest
     * @return ListFileSystemsResponse
     */
    public ListFileSystemsResponse listFileSystems(ListFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount point information in batches.</p>
     * 
     * @param request ListMountPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMountPointsResponse
     */
    public ListMountPointsResponse listMountPointsWithOptions(ListMountPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOffset)) {
            query.put("StartOffset", request.startOffset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMountPoints"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMountPointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount point information in batches.</p>
     * 
     * @param request ListMountPointsRequest
     * @return ListMountPointsResponse
     */
    public ListMountPointsResponse listMountPoints(ListMountPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMountPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询QosPolicies</p>
     * 
     * @param request ListQosPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQosPoliciesResponse
     */
    public ListQosPoliciesResponse listQosPoliciesWithOptions(ListQosPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federationId)) {
            query.put("FederationId", request.federationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQosPolicies"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQosPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询QosPolicies</p>
     * 
     * @param request ListQosPoliciesRequest
     * @return ListQosPoliciesResponse
     */
    public ListQosPoliciesResponse listQosPolicies(ListQosPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQosPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The permission management of Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by calling API operations. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.
     * The number of users and groups in a single file system is subject to the following limits:</p>
     * <ul>
     * <li>A single file system supports up to 1,000 users.</li>
     * <li>A single file system supports up to 30 groups.</li>
     * <li>Each user can belong to up to 10 groups.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the user and group mappings of an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param request ListUserGroupsMappingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsMappingsResponse
     */
    public ListUserGroupsMappingsResponse listUserGroupsMappingsWithOptions(ListUserGroupsMappingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filesystemId)) {
            query.put("FilesystemId", request.filesystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsMappings"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsMappingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The permission management of Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by calling API operations. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.
     * The number of users and groups in a single file system is subject to the following limits:</p>
     * <ul>
     * <li>A single file system supports up to 1,000 users.</li>
     * <li>A single file system supports up to 30 groups.</li>
     * <li>Each user can belong to up to 10 groups.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the user and group mappings of an Apsara File Storage for HDFS file system instance.</p>
     * 
     * @param request ListUserGroupsMappingsRequest
     * @return ListUserGroupsMappingsResponse
     */
    public ListUserGroupsMappingsResponse listUserGroupsMappings(ListUserGroupsMappingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsMappingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a permission group.</p>
     * 
     * @param request ModifyAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroupWithOptions(ModifyAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessGroup"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a permission group.</p>
     * 
     * @param request ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroup(ModifyAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group rule.</p>
     * 
     * @param request ModifyAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRuleWithOptions(ModifyAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessRule"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group rule.</p>
     * 
     * @param request ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRule(ModifyAccessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before modifying a file system, review the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.3fbc281fRrtedx#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemName)) {
            query.put("FileSystemName", request.fileSystemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meteringMode)) {
            query.put("MeteringMode", request.meteringMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedThroughputInMiBps)) {
            query.put("ProvisionedThroughputInMiBps", request.provisionedThroughputInMiBps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceCapacity)) {
            query.put("SpaceCapacity", request.spaceCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughputMode)) {
            query.put("ThroughputMode", request.throughputMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileSystem"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before modifying a file system, review the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.3fbc281fRrtedx#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a mount point.</p>
     * 
     * @param request ModifyMountPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMountPointResponse
     */
    public ModifyMountPointResponse modifyMountPointWithOptions(ModifyMountPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupId)) {
            query.put("AccessGroupId", request.accessGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountPointId)) {
            query.put("MountPointId", request.mountPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMountPoint"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMountPointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a mount point.</p>
     * 
     * @param request ModifyMountPointRequest
     * @return ModifyMountPointResponse
     */
    public ModifyMountPointResponse modifyMountPoint(ModifyMountPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMountPointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyQosPolicy</p>
     * 
     * @param request ModifyQosPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyQosPolicyResponse
     */
    public ModifyQosPolicyResponse modifyQosPolicyWithOptions(ModifyQosPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federationId)) {
            query.put("FederationId", request.federationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputRegionId)) {
            query.put("InputRegionId", request.inputRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIOBandWidth)) {
            query.put("MaxIOBandWidth", request.maxIOBandWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIOps)) {
            query.put("MaxIOps", request.maxIOps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMetaQps)) {
            query.put("MaxMetaQps", request.maxMetaQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosPolicyId)) {
            query.put("QosPolicyId", request.qosPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyQosPolicy"),
            new TeaPair("version", "2018-06-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyQosPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyQosPolicy</p>
     * 
     * @param request ModifyQosPolicyRequest
     * @return ModifyQosPolicyResponse
     */
    public ModifyQosPolicyResponse modifyQosPolicy(ModifyQosPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyQosPolicyWithOptions(request, runtime);
    }
}
