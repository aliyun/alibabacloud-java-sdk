// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930;

import com.aliyun.tea.*;
import com.aliyun.ecd20200930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ecd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>If you do not create any cloud computer in a convenience office network within 15 days, the office network is automatically locked and virtual private cloud (VPC) resources are released. If you want to resume the office network, you can call this operation to unlock the office network.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks a convenience office network that is automatically locked due to a long idle period of time.</p>
     * 
     * @param request ActivateOfficeSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateOfficeSiteResponse
     */
    public ActivateOfficeSiteResponse activateOfficeSiteWithOptions(ActivateOfficeSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateOfficeSiteResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you do not create any cloud computer in a convenience office network within 15 days, the office network is automatically locked and virtual private cloud (VPC) resources are released. If you want to resume the office network, you can call this operation to unlock the office network.</p>
     * 
     * <b>summary</b> : 
     * <p>Unlocks a convenience office network that is automatically locked due to a long idle period of time.</p>
     * 
     * @param request ActivateOfficeSiteRequest
     * @return ActivateOfficeSiteResponse
     */
    public ActivateOfficeSiteResponse activateOfficeSite(ActivateOfficeSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateOfficeSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加桌面超卖用户组</p>
     * 
     * @param request AddDesktopOversoldUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDesktopOversoldUserGroupResponse
     */
    public AddDesktopOversoldUserGroupResponse addDesktopOversoldUserGroupWithOptions(AddDesktopOversoldUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDesktopOversoldUserGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDesktopOversoldUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加桌面超卖用户组</p>
     * 
     * @param request AddDesktopOversoldUserGroupRequest
     * @return AddDesktopOversoldUserGroupResponse
     */
    public AddDesktopOversoldUserGroupResponse addDesktopOversoldUserGroup(AddDesktopOversoldUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDesktopOversoldUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each device can be registered in only one Alibaba Cloud account. If you register a device that has been registered in another Alibaba Cloud account, an error is reported.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds trusted devices.</p>
     * 
     * @param request AddDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDevicesResponse
     */
    public AddDevicesResponse addDevicesWithOptions(AddDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIds)) {
            query.put("DeviceIds", request.deviceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDevices"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDevicesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each device can be registered in only one Alibaba Cloud account. If you register a device that has been registered in another Alibaba Cloud account, an error is reported.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds trusted devices.</p>
     * 
     * @param request AddDevicesRequest
     * @return AddDevicesResponse
     */
    public AddDevicesResponse addDevices(AddDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to share a specific folder with other users. You can also configure the folder permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Shares a folder of a cloud disk with other users.</p>
     * 
     * @param tmpReq AddFilePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFilePermissionResponse
     */
    public AddFilePermissionResponse addFilePermissionWithOptions(AddFilePermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddFilePermissionShrinkRequest request = new AddFilePermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.memberList)) {
            request.memberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.memberList, "MemberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberListShrink)) {
            query.put("MemberList", request.memberListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFilePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFilePermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to share a specific folder with other users. You can also configure the folder permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Shares a folder of a cloud disk with other users.</p>
     * 
     * @param request AddFilePermissionRequest
     * @return AddFilePermissionResponse
     */
    public AddFilePermissionResponse addFilePermission(AddFilePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFilePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds authorized end users of a desktop group.</p>
     * 
     * @param request AddUserToDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToDesktopGroupResponse
     */
    public AddUserToDesktopGroupResponse addUserToDesktopGroupWithOptions(AddUserToDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIds)) {
            query.put("DesktopGroupIds", request.desktopGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToDesktopGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds authorized end users of a desktop group.</p>
     * 
     * @param request AddUserToDesktopGroupRequest
     * @return AddUserToDesktopGroupResponse
     */
    public AddUserToDesktopGroupResponse addUserToDesktopGroup(AddUserToDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户到超卖用户组</p>
     * 
     * @param request AddUserToDesktopOversoldUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToDesktopOversoldUserGroupResponse
     */
    public AddUserToDesktopOversoldUserGroupResponse addUserToDesktopOversoldUserGroupWithOptions(AddUserToDesktopOversoldUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addUserAmount)) {
            query.put("AddUserAmount", request.addUserAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToDesktopOversoldUserGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToDesktopOversoldUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加用户到超卖用户组</p>
     * 
     * @param request AddUserToDesktopOversoldUserGroupRequest
     * @return AddUserToDesktopOversoldUserGroupResponse
     */
    public AddUserToDesktopOversoldUserGroupResponse addUserToDesktopOversoldUserGroup(AddUserToDesktopOversoldUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToDesktopOversoldUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can also associate an automatic snapshot policy with a cloud desktop in the Elastic Desktop Service (EDS) console. To do so, perform the following steps: 1. Log on to the EDS console. 2. Choose Desktops and Groups &gt; Desktops in the left-side navigation pane. 3. Find the cloud desktop that you want to manage on the Cloud Desktops page and choose More &gt; Change Automatic Snapshot Policy in the Actions column. 4. Configure a policy for the cloud desktop as prompted in the Change Automatic Snapshot Policy panel.
     * After you associate an automatic snapshot policy with the cloud desktop, the system creates snapshots for the cloud desktop based on the policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Apply an automatic snapshot policy to cloud computers. After the automatic snapshot policy is applied to the cloud computers, Elastic Desktop Service automatically creates snapshots for the cloud computers based on the time specified in the automatic snapshot policy.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can also associate an automatic snapshot policy with a cloud desktop in the Elastic Desktop Service (EDS) console. To do so, perform the following steps: 1. Log on to the EDS console. 2. Choose Desktops and Groups &gt; Desktops in the left-side navigation pane. 3. Find the cloud desktop that you want to manage on the Cloud Desktops page and choose More &gt; Change Automatic Snapshot Policy in the Actions column. 4. Configure a policy for the cloud desktop as prompted in the Change Automatic Snapshot Policy panel.
     * After you associate an automatic snapshot policy with the cloud desktop, the system creates snapshots for the cloud desktop based on the policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Apply an automatic snapshot policy to cloud computers. After the automatic snapshot policy is applied to the cloud computers, Elastic Desktop Service automatically creates snapshots for the cloud computers based on the time specified in the automatic snapshot policy.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for the coordinate permissions.</p>
     * 
     * @param request ApplyCoordinatePrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCoordinatePrivilegeResponse
     */
    public ApplyCoordinatePrivilegeResponse applyCoordinatePrivilegeWithOptions(ApplyCoordinatePrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coId)) {
            query.put("CoId", request.coId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCoordinatePrivilege"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCoordinatePrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for the coordinate permissions.</p>
     * 
     * @param request ApplyCoordinatePrivilegeRequest
     * @return ApplyCoordinatePrivilegeResponse
     */
    public ApplyCoordinatePrivilegeResponse applyCoordinatePrivilege(ApplyCoordinatePrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCoordinatePrivilegeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for coordination monitoring. This operation is mainly used in administrator assistance scenarios and education scenarios.</p>
     * 
     * @param request ApplyCoordinationForMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCoordinationForMonitoringResponse
     */
    public ApplyCoordinationForMonitoringResponse applyCoordinationForMonitoringWithOptions(ApplyCoordinationForMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coordinatePolicyType)) {
            query.put("CoordinatePolicyType", request.coordinatePolicyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiatorType)) {
            query.put("InitiatorType", request.initiatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCandidates)) {
            query.put("ResourceCandidates", request.resourceCandidates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCoordinationForMonitoring"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCoordinationForMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for coordination monitoring. This operation is mainly used in administrator assistance scenarios and education scenarios.</p>
     * 
     * @param request ApplyCoordinationForMonitoringRequest
     * @return ApplyCoordinationForMonitoringResponse
     */
    public ApplyCoordinationForMonitoringResponse applyCoordinationForMonitoring(ApplyCoordinationForMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCoordinationForMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers for which you want to allow image updates must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Allows you to upgrade images.</p>
     * 
     * @param request ApproveFotaUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveFotaUpdateResponse
     */
    public ApproveFotaUpdateResponse approveFotaUpdateWithOptions(ApproveFotaUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveFotaUpdate"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveFotaUpdateResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers for which you want to allow image updates must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Allows you to upgrade images.</p>
     * 
     * @param request ApproveFotaUpdateRequest
     * @return ApproveFotaUpdateResponse
     */
    public ApproveFotaUpdateResponse approveFotaUpdate(ApproveFotaUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveFotaUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a premium bandwidth plan to an office network. A premium bandwidth plan is used together with only one office network.</p>
     * 
     * @param request AssociateNetworkPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateNetworkPackageResponse
     */
    public AssociateNetworkPackageResponse associateNetworkPackageWithOptions(AssociateNetworkPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateNetworkPackage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateNetworkPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a premium bandwidth plan to an office network. A premium bandwidth plan is used together with only one office network.</p>
     * 
     * @param request AssociateNetworkPackageRequest
     * @return AssociateNetworkPackageResponse
     */
    public AssociateNetworkPackageResponse associateNetworkPackage(AssociateNetworkPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateNetworkPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>A CEN instance is created.</li>
     * <li>The office network is an advanced office network, and the account system type is convenient account.<blockquote>
     * <p> The office network is added to the CEN instance when you create the instance. An office network can be added to only one CEN instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an advanced office network to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AttachCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachCenResponse
     */
    public AttachCenResponse attachCenWithOptions(AttachCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachCenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>A CEN instance is created.</li>
     * <li>The office network is an advanced office network, and the account system type is convenient account.<blockquote>
     * <p> The office network is added to the CEN instance when you create the instance. An office network can be added to only one CEN instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Binds an advanced office network to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request AttachCenRequest
     * @return AttachCenResponse
     */
    public AttachCenResponse attachCen(AttachCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachCenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a hardware client to a user.</p>
     * 
     * @param request AttachEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachEndUserResponse
     */
    public AttachEndUserResponse attachEndUserWithOptions(AttachEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEndUser"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEndUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a hardware client to a user.</p>
     * 
     * @param request AttachEndUserRequest
     * @return AttachEndUserResponse
     */
    public AttachEndUserResponse attachEndUser(AttachEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an automatic snapshot policy for cloud computers.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAutoSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an automatic snapshot policy for cloud computers.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a file sharing task.</p>
     * 
     * @param request CancelCdsFileShareLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCdsFileShareLinkResponse
     */
    public CancelCdsFileShareLinkResponse cancelCdsFileShareLinkWithOptions(CancelCdsFileShareLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            query.put("ShareId", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCdsFileShareLink"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCdsFileShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a file sharing task.</p>
     * 
     * @param request CancelCdsFileShareLinkRequest
     * @return CancelCdsFileShareLinkResponse
     */
    public CancelCdsFileShareLinkResponse cancelCdsFileShareLink(CancelCdsFileShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCdsFileShareLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels monitoring on stream collaboration.</p>
     * 
     * @param request CancelCoordinationForMonitoringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCoordinationForMonitoringResponse
     */
    public CancelCoordinationForMonitoringResponse cancelCoordinationForMonitoringWithOptions(CancelCoordinationForMonitoringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coIds)) {
            query.put("CoIds", request.coIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCoordinationForMonitoring"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCoordinationForMonitoringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels monitoring on stream collaboration.</p>
     * 
     * @param request CancelCoordinationForMonitoringRequest
     * @return CancelCoordinationForMonitoringResponse
     */
    public CancelCoordinationForMonitoringResponse cancelCoordinationForMonitoring(CancelCoordinationForMonitoringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCoordinationForMonitoringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the operation of copying an image to another region.</p>
     * 
     * @param request CancelCopyImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCopyImageResponse
     */
    public CancelCopyImageResponse cancelCopyImageWithOptions(CancelCopyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCopyImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCopyImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the operation of copying an image to another region.</p>
     * 
     * @param request CancelCopyImageRequest
     * @return CancelCopyImageResponse
     */
    public CancelCopyImageResponse cancelCopyImage(CancelCopyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCopyImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Clones an existing policy.</p>
     * 
     * @param request ClonePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClonePolicyGroupResponse
     */
    public ClonePolicyGroupResponse clonePolicyGroupWithOptions(ClonePolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClonePolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClonePolicyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Clones an existing policy.</p>
     * 
     * @param request ClonePolicyGroupRequest
     * @return ClonePolicyGroupResponse
     */
    public ClonePolicyGroupResponse clonePolicyGroup(ClonePolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clonePolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Completes a file uploading task.</p>
     * 
     * @param request CompleteCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteCdsFileResponse
     */
    public CompleteCdsFileResponse completeCdsFileWithOptions(CompleteCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("UploadId", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteCdsFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Completes a file uploading task.</p>
     * 
     * @param request CompleteCdsFileRequest
     * @return CompleteCdsFileResponse
     */
    public CompleteCdsFileResponse completeCdsFile(CompleteCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a conditional forwarder and trust relationship for a high-definition experience (HDX)-based office network (formerly workspace). You can call the operation to configure a trust relationship for an enterprise Active Directory (AD) office network.</p>
     * 
     * @param request ConfigADConnectorTrustRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigADConnectorTrustResponse
     */
    public ConfigADConnectorTrustResponse configADConnectorTrustWithOptions(ConfigADConnectorTrustRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsLicenseDomain)) {
            query.put("RdsLicenseDomain", request.rdsLicenseDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustKey)) {
            query.put("TrustKey", request.trustKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigADConnectorTrust"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigADConnectorTrustResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a conditional forwarder and trust relationship for a high-definition experience (HDX)-based office network (formerly workspace). You can call the operation to configure a trust relationship for an enterprise Active Directory (AD) office network.</p>
     * 
     * @param request ConfigADConnectorTrustRequest
     * @return ConfigADConnectorTrustResponse
     */
    public ConfigADConnectorTrustResponse configADConnectorTrust(ConfigADConnectorTrustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configADConnectorTrustWithOptions(request, runtime);
    }

    /**
     * @param request ConfigADConnectorUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigADConnectorUserResponse
     */
    public ConfigADConnectorUserResponse configADConnectorUserWithOptions(ConfigADConnectorUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigADConnectorUser"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigADConnectorUserResponse());
    }

    /**
     * @param request ConfigADConnectorUserRequest
     * @return ConfigADConnectorUserResponse
     */
    public ConfigADConnectorUserResponse configADConnectorUser(ConfigADConnectorUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configADConnectorUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a file or a directory.</p>
     * 
     * @param request CopyCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyCdsFileResponse
     */
    public CopyCdsFileResponse copyCdsFileWithOptions(CopyCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRename)) {
            query.put("AutoRename", request.autoRename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileReceiverId)) {
            query.put("FileReceiverId", request.fileReceiverId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileReceiverType)) {
            query.put("FileReceiverType", request.fileReceiverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyCdsFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a file or a directory.</p>
     * 
     * @param request CopyCdsFileRequest
     * @return CopyCdsFileResponse
     */
    public CopyCdsFileResponse copyCdsFile(CopyCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copy an image to another region. If you want to share an image across regions, you can call this operation to copy the image to the destination region and then share the image.</p>
     * 
     * @param request CopyImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyImageResponse
     */
    public CopyImageResponse copyImageWithOptions(CopyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationDescription)) {
            query.put("DestinationDescription", request.destinationDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationImageName)) {
            query.put("DestinationImageName", request.destinationImageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionId)) {
            query.put("DestinationRegionId", request.destinationRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copy an image to another region. If you want to share an image across regions, you can call this operation to copy the image to the destination region and then share the image.</p>
     * 
     * @param request CopyImageRequest
     * @return CopyImageResponse
     */
    public CopyImageResponse copyImage(CopyImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An AD directory is used to connect to an enterprise\&quot;s existing Active Directory and is suitable for large-scale cloud computer deployment. You are charged directory fees when you connect your AD to cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory of the Active Directory (AD) type.</p>
     * 
     * @param request CreateADConnectorDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateADConnectorDirectoryResponse
     */
    public CreateADConnectorDirectoryResponse createADConnectorDirectoryWithOptions(CreateADConnectorDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateADConnectorDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateADConnectorDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>An AD directory is used to connect to an enterprise\&quot;s existing Active Directory and is suitable for large-scale cloud computer deployment. You are charged directory fees when you connect your AD to cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory of the Active Directory (AD) type.</p>
     * 
     * @param request CreateADConnectorDirectoryRequest
     * @return CreateADConnectorDirectoryResponse
     */
    public CreateADConnectorDirectoryResponse createADConnectorDirectory(CreateADConnectorDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createADConnectorDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create an enterprise AD office network, the system automatically creates an AD connector to connect to an enterprise AD. You are charged for the AD connector. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.
     * After you call this operation to create an AD office network, you must perform the following steps to complete AD domain setting:</p>
     * <ol>
     * <li>Configure a conditional forwarder in a Domain Name System (DNS) server.</li>
     * <li>Configure a trust relationship in an AD domain controller and call the <a href="https://help.aliyun.com/document_detail/311258.html">ConfigADConnectorTrust</a> operation to configure the trust relationship with the AD office network.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> operation to query a list of organizational units (OUs) of the AD domain, and call the <a href="https://help.aliyun.com/document_detail/311262.html">ConfigADConnectorUser</a> operation to specify an OU and administrator for the AD office network.<blockquote>
     * <p> When you create the AD office network, take note of the DomainUserName and DomainPassword parameters. If you specify the parameters, you need to only configure a conditional forwarder. If you do not specify the parameters, you must configure a conditional forwarder, trust relationship, and OU as prompted.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214469.html">Create and manage enterprise AD office networks</a>.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates an enterprise Active Directory (AD) office network (formerly workspace). Elastic Desktop Service supports the following types of accounts: convenience accounts and enterprise AD accounts.</p>
     * 
     * @param request CreateADConnectorOfficeSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateADConnectorOfficeSiteResponse
     */
    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSiteWithOptions(CreateADConnectorOfficeSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupDCHostname)) {
            query.put("BackupDCHostname", request.backupDCHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupDns)) {
            query.put("BackupDns", request.backupDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateADConnectorOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateADConnectorOfficeSiteResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create an enterprise AD office network, the system automatically creates an AD connector to connect to an enterprise AD. You are charged for the AD connector. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.
     * After you call this operation to create an AD office network, you must perform the following steps to complete AD domain setting:</p>
     * <ol>
     * <li>Configure a conditional forwarder in a Domain Name System (DNS) server.</li>
     * <li>Configure a trust relationship in an AD domain controller and call the <a href="https://help.aliyun.com/document_detail/311258.html">ConfigADConnectorTrust</a> operation to configure the trust relationship with the AD office network.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> operation to query a list of organizational units (OUs) of the AD domain, and call the <a href="https://help.aliyun.com/document_detail/311262.html">ConfigADConnectorUser</a> operation to specify an OU and administrator for the AD office network.<blockquote>
     * <p> When you create the AD office network, take note of the DomainUserName and DomainPassword parameters. If you specify the parameters, you need to only configure a conditional forwarder. If you do not specify the parameters, you must configure a conditional forwarder, trust relationship, and OU as prompted.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214469.html">Create and manage enterprise AD office networks</a>.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates an enterprise Active Directory (AD) office network (formerly workspace). Elastic Desktop Service supports the following types of accounts: convenience accounts and enterprise AD accounts.</p>
     * 
     * @param request CreateADConnectorOfficeSiteRequest
     * @return CreateADConnectorOfficeSiteResponse
     */
    public CreateADConnectorOfficeSiteResponse createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createADConnectorOfficeSiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Apsara File Storage NAS (NAS) file system and mount the file system to the workspace in which a desktop group resides.</p>
     * 
     * @param request CreateAndBindNasFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndBindNasFileSystemResponse
     */
    public CreateAndBindNasFileSystemResponse createAndBindNasFileSystemWithOptions(CreateAndBindNasFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemName)) {
            query.put("FileSystemName", request.fileSystemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndBindNasFileSystem"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndBindNasFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Apsara File Storage NAS (NAS) file system and mount the file system to the workspace in which a desktop group resides.</p>
     * 
     * @param request CreateAndBindNasFileSystemRequest
     * @return CreateAndBindNasFileSystemResponse
     */
    public CreateAndBindNasFileSystemResponse createAndBindNasFileSystem(CreateAndBindNasFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndBindNasFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to create an automatic snapshot policy based on a CRON expression. Then, the system automatically creates snapshots of a cloud desktop based on the policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy. WUYING WorkSpace automatically creates snapshots based on the time specified by the cron expression in the automatic snapshot policy.</p>
     * 
     * @param request CreateAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to create an automatic snapshot policy based on a CRON expression. Then, the system automatically creates snapshots of a cloud desktop based on the policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy. WUYING WorkSpace automatically creates snapshots based on the time specified by the cron expression in the automatic snapshot policy.</p>
     * 
     * @param request CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Cloud computer templates include system templates and custom templates. A system template is the default template provided by Alibaba Cloud. You can call this operation to create a custom template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom cloud computer template.</p>
     * 
     * @param request CreateBundleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBundleResponse
     */
    public CreateBundleResponse createBundleWithOptions(CreateBundleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleName)) {
            query.put("BundleName", request.bundleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBundle"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBundleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Cloud computer templates include system templates and custom templates. A system template is the default template provided by Alibaba Cloud. You can call this operation to create a custom template.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom cloud computer template.</p>
     * 
     * @param request CreateBundleRequest
     * @return CreateBundleResponse
     */
    public CreateBundleResponse createBundle(CreateBundleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBundleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the RAM permissions are authenticated, you can call the CreateCdsFile operation to obtain the upload URL of a file and upload the file to a cloud disk.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a file to a cloud disk.</p>
     * 
     * @param request CreateCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCdsFileResponse
     */
    public CreateCdsFileResponse createCdsFileWithOptions(CreateCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictPolicy)) {
            query.put("ConflictPolicy", request.conflictPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileHash)) {
            query.put("FileHash", request.fileHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileLength)) {
            query.put("FileLength", request.fileLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFileId)) {
            query.put("ParentFileId", request.parentFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdsFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the RAM permissions are authenticated, you can call the CreateCdsFile operation to obtain the upload URL of a file and upload the file to a cloud disk.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a file to a cloud disk.</p>
     * 
     * @param request CreateCdsFileRequest
     * @return CreateCdsFileResponse
     */
    public CreateCdsFileResponse createCdsFile(CreateCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a file sharing task.</p>
     * 
     * @param request CreateCdsFileShareLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCdsFileShareLinkResponse
     */
    public CreateCdsFileShareLinkResponse createCdsFileShareLinkWithOptions(CreateCdsFileShareLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDownload)) {
            query.put("DisableDownload", request.disableDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disablePreview)) {
            query.put("DisablePreview", request.disablePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSave)) {
            query.put("DisableSave", request.disableSave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadLimit)) {
            query.put("DownloadLimit", request.downloadLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIds)) {
            query.put("FileIds", request.fileIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewLimit)) {
            query.put("PreviewLimit", request.previewLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveLimit)) {
            query.put("SaveLimit", request.saveLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareName)) {
            query.put("ShareName", request.shareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharePwd)) {
            query.put("SharePwd", request.sharePwd);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCdsFileShareLink"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCdsFileShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a file sharing task.</p>
     * 
     * @param request CreateCdsFileShareLinkRequest
     * @return CreateCdsFileShareLinkResponse
     */
    public CreateCdsFileShareLinkResponse createCdsFileShareLink(CreateCdsFileShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCdsFileShareLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud disk.</p>
     * 
     * @param request CreateCloudDriveServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudDriveServiceResponse
     */
    public CreateCloudDriveServiceResponse createCloudDriveServiceWithOptions(CreateCloudDriveServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdsChargeType)) {
            query.put("CdsChargeType", request.cdsChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSize)) {
            query.put("MaxSize", request.maxSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteType)) {
            query.put("OfficeSiteType", request.officeSiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            query.put("UserCount", request.userCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMaxSize)) {
            query.put("UserMaxSize", request.userMaxSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudDriveService"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudDriveServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud disk.</p>
     * 
     * @param request CreateCloudDriveServiceRequest
     * @return CreateCloudDriveServiceResponse
     */
    public CreateCloudDriveServiceResponse createCloudDriveService(CreateCloudDriveServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudDriveServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates the users of a cloud disk.</p>
     * 
     * @param request CreateCloudDriveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudDriveUsersResponse
     */
    public CreateCloudDriveUsersResponse createCloudDriveUsersWithOptions(CreateCloudDriveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMaxSize)) {
            query.put("UserMaxSize", request.userMaxSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudDriveUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudDriveUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates the users of a cloud disk.</p>
     * 
     * @param request CreateCloudDriveUsersRequest
     * @return CreateCloudDriveUsersResponse
     */
    public CreateCloudDriveUsersResponse createCloudDriveUsers(CreateCloudDriveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudDriveUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create a desktop group, make sure that the following operations are complete:</p>
     * <ul>
     * <li>You are familiar with the features, usage limits, and scaling policies of desktop groups. For more information, see <a href="https://help.aliyun.com/document_detail/290959.html">Overview</a> of desktop groups.</li>
     * <li>Resources, such as workspaces, users, desktop templates, and policies, are created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud computer pool (formerly desktop group).</p>
     * 
     * @param request CreateDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDesktopGroupResponse
     */
    public CreateDesktopGroupResponse createDesktopGroupWithOptions(CreateDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allClassifyUsers)) {
            query.put("AllClassifyUsers", request.allClassifyUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowAutoSetup)) {
            query.put("AllowAutoSetup", request.allowAutoSetup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowBufferCount)) {
            query.put("AllowBufferCount", request.allowBufferCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindAmount)) {
            query.put("BindAmount", request.bindAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyDesktopsCount)) {
            query.put("BuyDesktopsCount", request.buyDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("Classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectDuration)) {
            query.put("ConnectDuration", request.connectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultInitDesktopCount)) {
            query.put("DefaultInitDesktopCount", request.defaultInitDesktopCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupVersion)) {
            query.put("GroupVersion", request.groupVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleDisconnectDuration)) {
            query.put("IdleDisconnectDuration", request.idleDisconnectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadPolicy)) {
            query.put("LoadPolicy", request.loadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDesktopsCount)) {
            query.put("MaxDesktopsCount", request.maxDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDesktopsCount)) {
            query.put("MinDesktopsCount", request.minDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownType)) {
            query.put("OwnType", request.ownType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileFollowSwitch)) {
            query.put("ProfileFollowSwitch", request.profileFollowSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratioThreshold)) {
            query.put("RatioThreshold", request.ratioThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategyId)) {
            query.put("ScaleStrategyId", request.scaleStrategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopDuration)) {
            query.put("StopDuration", request.stopDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeEncryptionEnabled)) {
            query.put("VolumeEncryptionEnabled", request.volumeEncryptionEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeEncryptionKey)) {
            query.put("VolumeEncryptionKey", request.volumeEncryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDesktopGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create a desktop group, make sure that the following operations are complete:</p>
     * <ul>
     * <li>You are familiar with the features, usage limits, and scaling policies of desktop groups. For more information, see <a href="https://help.aliyun.com/document_detail/290959.html">Overview</a> of desktop groups.</li>
     * <li>Resources, such as workspaces, users, desktop templates, and policies, are created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud computer pool (formerly desktop group).</p>
     * 
     * @param request CreateDesktopGroupRequest
     * @return CreateDesktopGroupResponse
     */
    public CreateDesktopGroupResponse createDesktopGroup(CreateDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建桌面超卖组</p>
     * 
     * @param request CreateDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDesktopOversoldGroupResponse
     */
    public CreateDesktopOversoldGroupResponse createDesktopOversoldGroupWithOptions(CreateDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrenceCount)) {
            query.put("ConcurrenceCount", request.concurrenceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleDisconnectDuration)) {
            query.put("IdleDisconnectDuration", request.idleDisconnectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldUserCount)) {
            query.put("OversoldUserCount", request.oversoldUserCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldWarn)) {
            query.put("OversoldWarn", request.oversoldWarn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopDuration)) {
            query.put("StopDuration", request.stopDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            query.put("SystemDiskSize", request.systemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建桌面超卖组</p>
     * 
     * @param request CreateDesktopOversoldGroupRequest
     * @return CreateDesktopOversoldGroupResponse
     */
    public CreateDesktopOversoldGroupResponse createDesktopOversoldGroup(CreateDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you create cloud computers, complete the following preparations:</p>
     * <ul>
     * <li>An office network (formerly called workspace) and users are created. For more information, see:<ul>
     * <li>Convenience office network: <a href="https://help.aliyun.com/document_detail/215416.html">CreateSimpleOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/437832.html">CreateUsers</a>.</li>
     * <li>Active Directory (AD) office network: <a href="https://help.aliyun.com/document_detail/215417.html">CreateADConnectorOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/188619.html">Create an AD user</a>.</li>
     * </ul>
     * </li>
     * <li>Make sure a cloud computer template exists. If no cloud computer template exists, call the <a href="https://help.aliyun.com/document_detail/188883.html">CreateBundle</a> operation to create a template.</li>
     * <li>Make sure a policy exists. If no policy exists, call the <a href="https://help.aliyun.com/document_detail/188889.html">CreatePolicyGroup</a> operation to create a policy.
     * If you want the cloud computers to automatically execute a custom command script, you can use the <code>UserCommands</code> field to configure a custom command.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates cloud computers. If you specify end users when you create cloud computers, the cloud computers are assigned to the end users after the cloud computers are created.</p>
     * 
     * @param request CreateDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDesktopsResponse
     */
    public CreateDesktopsResponse createDesktopsWithOptions(CreateDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleModels)) {
            query.put("BundleModels", request.bundleModels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopMemberIp)) {
            query.put("DesktopMemberIp", request.desktopMemberIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopNameSuffix)) {
            query.put("DesktopNameSuffix", request.desktopNameSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTimers)) {
            query.put("DesktopTimers", request.desktopTimers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostname)) {
            query.put("Hostname", request.hostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monthDesktopSetting)) {
            query.put("MonthDesktopSetting", request.monthDesktopSetting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAssignMode)) {
            query.put("UserAssignMode", request.userAssignMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCommands)) {
            query.put("UserCommands", request.userCommands);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeEncryptionEnabled)) {
            query.put("VolumeEncryptionEnabled", request.volumeEncryptionEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeEncryptionKey)) {
            query.put("VolumeEncryptionKey", request.volumeEncryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you create cloud computers, complete the following preparations:</p>
     * <ul>
     * <li>An office network (formerly called workspace) and users are created. For more information, see:<ul>
     * <li>Convenience office network: <a href="https://help.aliyun.com/document_detail/215416.html">CreateSimpleOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/437832.html">CreateUsers</a>.</li>
     * <li>Active Directory (AD) office network: <a href="https://help.aliyun.com/document_detail/215417.html">CreateADConnectorOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/188619.html">Create an AD user</a>.</li>
     * </ul>
     * </li>
     * <li>Make sure a cloud computer template exists. If no cloud computer template exists, call the <a href="https://help.aliyun.com/document_detail/188883.html">CreateBundle</a> operation to create a template.</li>
     * <li>Make sure a policy exists. If no policy exists, call the <a href="https://help.aliyun.com/document_detail/188889.html">CreatePolicyGroup</a> operation to create a policy.
     * If you want the cloud computers to automatically execute a custom command script, you can use the <code>UserCommands</code> field to configure a custom command.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates cloud computers. If you specify end users when you create cloud computers, the cloud computers are assigned to the end users after the cloud computers are created.</p>
     * 
     * @param request CreateDesktopsRequest
     * @return CreateDesktopsResponse
     */
    public CreateDesktopsResponse createDesktops(CreateDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the disk encryption feature and adds the service-linked role that is encrypted by Cloud Drive Service to a Resource Access Management (RAM) user.</p>
     * 
     * @param request CreateDiskEncryptionServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiskEncryptionServiceResponse
     */
    public CreateDiskEncryptionServiceResponse createDiskEncryptionServiceWithOptions(CreateDiskEncryptionServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiskEncryptionService"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskEncryptionServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the disk encryption feature and adds the service-linked role that is encrypted by Cloud Drive Service to a Resource Access Management (RAM) user.</p>
     * 
     * @param request CreateDiskEncryptionServiceRequest
     * @return CreateDiskEncryptionServiceResponse
     */
    public CreateDiskEncryptionServiceResponse createDiskEncryptionService(CreateDiskEncryptionServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskEncryptionServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom image based on a deployed cloud computer. Then, you can use the custom image to create cloud computers that have the same configurations. This prevents the repeated settings when you create cloud computers.</p>
     * 
     * @param request CreateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageResponse
     */
    public CreateImageResponse createImageWithOptions(CreateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCleanUserdata)) {
            query.put("AutoCleanUserdata", request.autoCleanUserdata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageResourceType)) {
            query.put("ImageResourceType", request.imageResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom image based on a deployed cloud computer. Then, you can use the custom image to create cloud computers that have the same configurations. This prevents the repeated settings when you create cloud computers.</p>
     * 
     * @param request CreateImageRequest
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    /**
     * @param request CreateNASFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNASFileSystemResponse
     */
    public CreateNASFileSystemResponse createNASFileSystemWithOptions(CreateNASFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNASFileSystem"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNASFileSystemResponse());
    }

    /**
     * @param request CreateNASFileSystemRequest
     * @return CreateNASFileSystemResponse
     */
    public CreateNASFileSystemResponse createNASFileSystem(CreateNASFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNASFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a premium bandwidth plan for an office network.</p>
     * 
     * @param request CreateNetworkPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkPackageResponse
     */
    public CreateNetworkPackageResponse createNetworkPackageWithOptions(CreateNetworkPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkPackage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a premium bandwidth plan for an office network.</p>
     * 
     * @param request CreateNetworkPackageRequest
     * @return CreateNetworkPackageResponse
     */
    public CreateNetworkPackageResponse createNetworkPackage(CreateNetworkPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A policy is a set of security rules that are used to control security configurations when end users use cloud desktops. A policy contains basic features, such as USB redirection and watermarking, and other features, such as security group control. For more information, see <a href="https://help.aliyun.com/document_detail/189345.html">Policy overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a policy.</p>
     * 
     * @param request CreatePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminAccess)) {
            query.put("AdminAccess", request.adminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appContentProtection)) {
            query.put("AppContentProtection", request.appContentProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeAccessPolicyRule)) {
            query.put("AuthorizeAccessPolicyRule", request.authorizeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeSecurityPolicyRule)) {
            query.put("AuthorizeSecurityPolicyRule", request.authorizeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            query.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveRule)) {
            query.put("DomainResolveRule", request.domainResolveRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveRuleType)) {
            query.put("DomainResolveRuleType", request.domainResolveRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserApplyAdminCoordinate)) {
            query.put("EndUserApplyAdminCoordinate", request.endUserApplyAdminCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserGroupCoordinate)) {
            query.put("EndUserGroupCoordinate", request.endUserGroupCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5Access)) {
            query.put("Html5Access", request.html5Access);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            query.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetCommunicationProtocol)) {
            query.put("InternetCommunicationProtocol", request.internetCommunicationProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            query.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxReconnectTime)) {
            query.put("MaxReconnectTime", request.maxReconnectTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netRedirect)) {
            query.put("NetRedirect", request.netRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLogin)) {
            query.put("PreemptLogin", request.preemptLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLoginUser)) {
            query.put("PreemptLoginUser", request.preemptLoginUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.printerRedirection)) {
            query.put("PrinterRedirection", request.printerRedirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordContent)) {
            query.put("RecordContent", request.recordContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordContentExpires)) {
            query.put("RecordContentExpires", request.recordContentExpires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recording)) {
            query.put("Recording", request.recording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingAudio)) {
            query.put("RecordingAudio", request.recordingAudio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingDuration)) {
            query.put("RecordingDuration", request.recordingDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingEndTime)) {
            query.put("RecordingEndTime", request.recordingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingExpires)) {
            query.put("RecordingExpires", request.recordingExpires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFps)) {
            query.put("RecordingFps", request.recordingFps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingStartTime)) {
            query.put("RecordingStartTime", request.recordingStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingUserNotify)) {
            query.put("RecordingUserNotify", request.recordingUserNotify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingUserNotifyMessage)) {
            query.put("RecordingUserNotifyMessage", request.recordingUserNotifyMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteCoordinate)) {
            query.put("RemoteCoordinate", request.remoteCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeValue)) {
            query.put("ScopeValue", request.scopeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbRedirect)) {
            query.put("UsbRedirect", request.usbRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbSupplyRedirectRule)) {
            query.put("UsbSupplyRedirectRule", request.usbSupplyRedirectRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoRedirect)) {
            query.put("VideoRedirect", request.videoRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visualQuality)) {
            query.put("VisualQuality", request.visualQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkAntiCam)) {
            query.put("WatermarkAntiCam", request.watermarkAntiCam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkColor)) {
            query.put("WatermarkColor", request.watermarkColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkDegree)) {
            query.put("WatermarkDegree", request.watermarkDegree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFontSize)) {
            query.put("WatermarkFontSize", request.watermarkFontSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFontStyle)) {
            query.put("WatermarkFontStyle", request.watermarkFontStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkPower)) {
            query.put("WatermarkPower", request.watermarkPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkRowAmount)) {
            query.put("WatermarkRowAmount", request.watermarkRowAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkSecurity)) {
            query.put("WatermarkSecurity", request.watermarkSecurity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparency)) {
            query.put("WatermarkTransparency", request.watermarkTransparency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparencyValue)) {
            query.put("WatermarkTransparencyValue", request.watermarkTransparencyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>A policy is a set of security rules that are used to control security configurations when end users use cloud desktops. A policy contains basic features, such as USB redirection and watermarking, and other features, such as security group control. For more information, see <a href="https://help.aliyun.com/document_detail/189345.html">Policy overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a policy.</p>
     * 
     * @param request CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroup(CreatePolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you create a RAM directory, complete the following preparations:</p>
     * <ul>
     * <li>Call the <code>CreateVpc</code> operation to create a virtual private cloud (VPC) in a region supported by Elastic Desktop Service.</li>
     * <li>Call the <code>CreateVSwitch</code> operation to create a vSwitch in the VPC. The vSwitch is in a zone that is supported by Elastic Desktop Service. You can call the <a href="https://help.aliyun.com/document_detail/196648.html">DescribeZones</a> operation to obtain the most recent zone list for a region supported by Elastic Desktop Service</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Resource Access Management (RAM) directory.</p>
     * 
     * @param request CreateRAMDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRAMDirectoryResponse
     */
    public CreateRAMDirectoryResponse createRAMDirectoryWithOptions(CreateRAMDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRAMDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRAMDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you create a RAM directory, complete the following preparations:</p>
     * <ul>
     * <li>Call the <code>CreateVpc</code> operation to create a virtual private cloud (VPC) in a region supported by Elastic Desktop Service.</li>
     * <li>Call the <code>CreateVSwitch</code> operation to create a vSwitch in the VPC. The vSwitch is in a zone that is supported by Elastic Desktop Service. You can call the <a href="https://help.aliyun.com/document_detail/196648.html">DescribeZones</a> operation to obtain the most recent zone list for a region supported by Elastic Desktop Service</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Resource Access Management (RAM) directory.</p>
     * 
     * @param request CreateRAMDirectoryRequest
     * @return CreateRAMDirectoryResponse
     */
    public CreateRAMDirectoryResponse createRAMDirectory(CreateRAMDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRAMDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an office network of the convenience account type. Elastic Desktop Service supports the following types of accounts: convenience accounts and enterprise AD accounts.</p>
     * 
     * @param request CreateSimpleOfficeSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimpleOfficeSiteResponse
     */
    public CreateSimpleOfficeSiteResponse createSimpleOfficeSiteWithOptions(CreateSimpleOfficeSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudBoxOfficeSite)) {
            query.put("CloudBoxOfficeSite", request.cloudBoxOfficeSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInternetAccess)) {
            query.put("EnableInternetAccess", request.enableInternetAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyZeroDevice)) {
            query.put("NeedVerifyZeroDevice", request.needVerifyZeroDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcType)) {
            query.put("VpcType", request.vpcType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimpleOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimpleOfficeSiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an office network of the convenience account type. Elastic Desktop Service supports the following types of accounts: convenience accounts and enterprise AD accounts.</p>
     * 
     * @param request CreateSimpleOfficeSiteRequest
     * @return CreateSimpleOfficeSiteResponse
     */
    public CreateSimpleOfficeSiteResponse createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimpleOfficeSiteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a snapshot for a disk of a cloud computer to back up or restore the data on the disk.</p>
     * 
     * @param request CreateSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDiskType)) {
            query.put("SourceDiskType", request.sourceDiskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a snapshot for a disk of a cloud computer to back up or restore the data on the disk.</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automatic snapshot policy.</p>
     * 
     * @param request DeleteAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicyWithOptions(DeleteAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automatic snapshot policy.</p>
     * 
     * @param request DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    public DeleteAutoSnapshotPolicyResponse deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom cloud computer templates.</p>
     * 
     * @param request DeleteBundlesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBundlesResponse
     */
    public DeleteBundlesResponse deleteBundlesWithOptions(DeleteBundlesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBundles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBundlesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom cloud computer templates.</p>
     * 
     * @param request DeleteBundlesRequest
     * @return DeleteBundlesResponse
     */
    public DeleteBundlesResponse deleteBundles(DeleteBundlesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBundlesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a file from a cloud disk in Cloud Drive Service.</p>
     * 
     * @param request DeleteCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCdsFileResponse
     */
    public DeleteCdsFileResponse deleteCdsFileWithOptions(DeleteCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCdsFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a file from a cloud disk in Cloud Drive Service.</p>
     * 
     * @param request DeleteCdsFileRequest
     * @return DeleteCdsFileResponse
     */
    public DeleteCdsFileResponse deleteCdsFile(DeleteCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes team spaces.</p>
     * 
     * @param request DeleteCloudDriveGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudDriveGroupsResponse
     */
    public DeleteCloudDriveGroupsResponse deleteCloudDriveGroupsWithOptions(DeleteCloudDriveGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudDriveGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudDriveGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes team spaces.</p>
     * 
     * @param request DeleteCloudDriveGroupsRequest
     * @return DeleteCloudDriveGroupsResponse
     */
    public DeleteCloudDriveGroupsResponse deleteCloudDriveGroups(DeleteCloudDriveGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudDriveGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除无影网盘中的终端用户</p>
     * 
     * @param request DeleteCloudDriveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudDriveUsersResponse
     */
    public DeleteCloudDriveUsersResponse deleteCloudDriveUsersWithOptions(DeleteCloudDriveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudDriveUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudDriveUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除无影网盘中的终端用户</p>
     * 
     * @param request DeleteCloudDriveUsersRequest
     * @return DeleteCloudDriveUsersResponse
     */
    public DeleteCloudDriveUsersResponse deleteCloudDriveUsers(DeleteCloudDriveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudDriveUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a desktop group, make sure that cloud desktops in the desktop group are not connected and no users are authorized to use the cloud desktops.</p>
     * <ul>
     * <li>You cannot delete a subscription desktop group when cloud desktops in the group are in valid period.</li>
     * <li>If you delete a pay-as-you-go desktop group, cloud desktops in the group are deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a desktop group.</p>
     * 
     * @param request DeleteDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDesktopGroupResponse
     */
    public DeleteDesktopGroupResponse deleteDesktopGroupWithOptions(DeleteDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDesktopGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you delete a desktop group, make sure that cloud desktops in the desktop group are not connected and no users are authorized to use the cloud desktops.</p>
     * <ul>
     * <li>You cannot delete a subscription desktop group when cloud desktops in the group are in valid period.</li>
     * <li>If you delete a pay-as-you-go desktop group, cloud desktops in the group are deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases a desktop group.</p>
     * 
     * @param request DeleteDesktopGroupRequest
     * @return DeleteDesktopGroupResponse
     */
    public DeleteDesktopGroupResponse deleteDesktopGroup(DeleteDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases pay-as-you-go cloud computers or expired subscription cloud computers.</p>
     * 
     * @param request DeleteDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDesktopsResponse
     */
    public DeleteDesktopsResponse deleteDesktopsWithOptions(DeleteDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases pay-as-you-go cloud computers or expired subscription cloud computers.</p>
     * 
     * @param request DeleteDesktopsRequest
     * @return DeleteDesktopsResponse
     */
    public DeleteDesktopsResponse deleteDesktops(DeleteDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to manage client devices.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes trusted devices.</p>
     * 
     * @param request DeleteDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDevicesResponse
     */
    public DeleteDevicesResponse deleteDevicesWithOptions(DeleteDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIds)) {
            query.put("DeviceIds", request.deviceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevices"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to manage client devices.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes trusted devices.</p>
     * 
     * @param request DeleteDevicesRequest
     * @return DeleteDevicesResponse
     */
    public DeleteDevicesResponse deleteDevices(DeleteDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete a directory that has a cloud computer or is used by a cloud computer.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more directories.</p>
     * 
     * @param request DeleteDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDirectoriesResponse
     */
    public DeleteDirectoriesResponse deleteDirectoriesWithOptions(DeleteDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDirectories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete a directory that has a cloud computer or is used by a cloud computer.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more directories.</p>
     * 
     * @param request DeleteDirectoriesRequest
     * @return DeleteDirectoriesResponse
     */
    public DeleteDirectoriesResponse deleteDirectories(DeleteDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDirectoriesWithOptions(request, runtime);
    }

    /**
     * @param request DeleteEduRoomRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEduRoomResponse
     */
    public DeleteEduRoomResponse deleteEduRoomWithOptions(DeleteEduRoomRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eduRoomId)) {
            query.put("EduRoomId", request.eduRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEduRoom"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEduRoomResponse());
    }

    /**
     * @param request DeleteEduRoomRequest
     * @return DeleteEduRoomResponse
     */
    public DeleteEduRoomResponse deleteEduRoom(DeleteEduRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEduRoomWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Images include system images and custom images. System images cannot be deleted.</p>
     * <ul>
     * <li>If an image that you want to delete is referenced by a cloud computer template, call the <a href="https://help.aliyun.com/document_detail/436972.html">DeleteBundles</a> operation to delete the cloud computer template before you delete the image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more custom images.</p>
     * 
     * @param request DeleteImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImagesResponse
     */
    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteCascadedBundle)) {
            query.put("DeleteCascadedBundle", request.deleteCascadedBundle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Images include system images and custom images. System images cannot be deleted.</p>
     * <ul>
     * <li>If an image that you want to delete is referenced by a cloud computer template, call the <a href="https://help.aliyun.com/document_detail/436972.html">DeleteBundles</a> operation to delete the cloud computer template before you delete the image.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more custom images.</p>
     * 
     * @param request DeleteImagesRequest
     * @return DeleteImagesResponse
     */
    public DeleteImagesResponse deleteImages(DeleteImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an Apsara File Storage NAS (NAS) file system, make sure that the data you want to retain is backed up.</p>
     * <blockquote>
     * <p>Warning: If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes NAS file systems.</p>
     * 
     * @param request DeleteNASFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNASFileSystemsResponse
     */
    public DeleteNASFileSystemsResponse deleteNASFileSystemsWithOptions(DeleteNASFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNASFileSystems"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNASFileSystemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an Apsara File Storage NAS (NAS) file system, make sure that the data you want to retain is backed up.</p>
     * <blockquote>
     * <p>Warning: If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes NAS file systems.</p>
     * 
     * @param request DeleteNASFileSystemsRequest
     * @return DeleteNASFileSystemsResponse
     */
    public DeleteNASFileSystemsResponse deleteNASFileSystems(DeleteNASFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNASFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more premium bandwidth plans.</p>
     * 
     * @param request DeleteNetworkPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkPackagesResponse
     */
    public DeleteNetworkPackagesResponse deleteNetworkPackagesWithOptions(DeleteNetworkPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more premium bandwidth plans.</p>
     * 
     * @param request DeleteNetworkPackagesRequest
     * @return DeleteNetworkPackagesResponse
     */
    public DeleteNetworkPackagesResponse deleteNetworkPackages(DeleteNetworkPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkPackagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an office network, make sure that the following operations are complete:</p>
     * <ul>
     * <li>All cloud computers in the office network are released.</li>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p> Resources and data on cloud computers in an office network cannot be restored after you delete it. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes office networks (formerly workspaces).</p>
     * 
     * @param request DeleteOfficeSitesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOfficeSitesResponse
     */
    public DeleteOfficeSitesResponse deleteOfficeSitesWithOptions(DeleteOfficeSitesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOfficeSites"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOfficeSitesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an office network, make sure that the following operations are complete:</p>
     * <ul>
     * <li>All cloud computers in the office network are released.</li>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p> Resources and data on cloud computers in an office network cannot be restored after you delete it. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes office networks (formerly workspaces).</p>
     * 
     * @param request DeleteOfficeSitesRequest
     * @return DeleteOfficeSitesResponse
     */
    public DeleteOfficeSitesResponse deleteOfficeSites(DeleteOfficeSitesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOfficeSitesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more custom policies.</p>
     * 
     * @param request DeletePolicyGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyGroupsResponse
     */
    public DeletePolicyGroupsResponse deletePolicyGroupsWithOptions(DeletePolicyGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more custom policies.</p>
     * 
     * @param request DeletePolicyGroupsRequest
     * @return DeletePolicyGroupsResponse
     */
    public DeletePolicyGroupsResponse deletePolicyGroups(DeletePolicyGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the IDs of the snapshots that you specify do not exist, requests are ignored.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more snapshots.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the IDs of the snapshots that you specify do not exist, requests are ignored.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more snapshots.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If an MFA device is deleted, the device is unbound, reset, and disabled. When an Active Directory (AD) user wants to connect to the cloud desktop that is bound to the MFA device, the AD user must bind a new MFA device.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete virtual multi-factor authentication (MFA) devices.</p>
     * 
     * @param request DeleteVirtualMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualMFADeviceResponse
     */
    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualMFADeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>If an MFA device is deleted, the device is unbound, reset, and disabled. When an Active Directory (AD) user wants to connect to the cloud desktop that is bound to the MFA device, the AD user must bind a new MFA device.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete virtual multi-factor authentication (MFA) devices.</p>
     * 
     * @param request DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access control list (ACL) of an office network or a cloud computer.</p>
     * 
     * @param request DescribeAclEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclEntriesResponse
     */
    public DescribeAclEntriesResponse describeAclEntriesWithOptions(DescribeAclEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclEntries"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access control list (ACL) of an office network or a cloud computer.</p>
     * 
     * @param request DescribeAclEntriesRequest
     * @return DescribeAclEntriesResponse
     */
    public DescribeAclEntriesResponse describeAclEntries(DescribeAclEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclEntriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can view an automatic snapshot policy that is associated with a cloud desktop in the Elastic Desktop Service (EDS) console. To view the automatic snapshot policy, you can go to the EDS console, choose Deployment &gt; Snapshots in the left-side navigation pane, and then view an automatic snapshot policy on the Snapshots page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic snapshot policy.</p>
     * 
     * @param request DescribeAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoSnapshotPolicyResponse
     */
    public DescribeAutoSnapshotPolicyResponse describeAutoSnapshotPolicyWithOptions(DescribeAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can view an automatic snapshot policy that is associated with a cloud desktop in the Elastic Desktop Service (EDS) console. To view the automatic snapshot policy, you can go to the EDS console, choose Deployment &gt; Snapshots in the left-side navigation pane, and then view an automatic snapshot policy on the Snapshots page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic snapshot policy.</p>
     * 
     * @param request DescribeAutoSnapshotPolicyRequest
     * @return DescribeAutoSnapshotPolicyResponse
     */
    public DescribeAutoSnapshotPolicyResponse describeAutoSnapshotPolicy(DescribeAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cloud computer templates.</p>
     * 
     * @param request DescribeBundlesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBundlesResponse
     */
    public DescribeBundlesResponse describeBundlesWithOptions(DescribeBundlesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleType)) {
            query.put("BundleType", request.bundleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkStock)) {
            query.put("CheckStock", request.checkStock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuCount)) {
            query.put("CpuCount", request.cpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTypeFamily)) {
            query.put("DesktopTypeFamily", request.desktopTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fotaChannel)) {
            query.put("FotaChannel", request.fotaChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromDesktopGroup)) {
            query.put("FromDesktopGroup", request.fromDesktopGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCount)) {
            query.put("GpuCount", request.gpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            query.put("MemorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedBundle)) {
            query.put("SelectedBundle", request.selectedBundle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionType)) {
            query.put("SessionType", request.sessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportMultiSession)) {
            query.put("SupportMultiSession", request.supportMultiSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volumeEncryptionEnabled)) {
            query.put("VolumeEncryptionEnabled", request.volumeEncryptionEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBundles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBundlesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cloud computer templates.</p>
     * 
     * @param request DescribeBundlesRequest
     * @return DescribeBundlesResponse
     */
    public DescribeBundlesResponse describeBundles(DescribeBundlesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBundlesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file sharing links of a cloud disk in Cloud Drive Service.</p>
     * 
     * @param request DescribeCdsFileShareLinksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCdsFileShareLinksResponse
     */
    public DescribeCdsFileShareLinksResponse describeCdsFileShareLinksWithOptions(DescribeCdsFileShareLinksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creators)) {
            query.put("Creators", request.creators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            query.put("ShareId", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareName)) {
            query.put("ShareName", request.shareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCdsFileShareLinks"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCdsFileShareLinksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file sharing links of a cloud disk in Cloud Drive Service.</p>
     * 
     * @param request DescribeCdsFileShareLinksRequest
     * @return DescribeCdsFileShareLinksResponse
     */
    public DescribeCdsFileShareLinksResponse describeCdsFileShareLinks(DescribeCdsFileShareLinksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCdsFileShareLinksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all Cloud Enterprise Network (CEN) instances within an Alibaba Cloud account.</p>
     * 
     * @param request DescribeCensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCensWithOptions(DescribeCensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCens"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all Cloud Enterprise Network (CEN) instances within an Alibaba Cloud account.</p>
     * 
     * @param request DescribeCensRequest
     * @return DescribeCensResponse
     */
    public DescribeCensResponse describeCens(DescribeCensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCensWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can audit the operation logs of regular users to improve security. The operation logs record events such as desktop startup, shutdown, and session disconnection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the operation logs of end users. For example, the logs record the events that end users start and stop cloud desktops, and disconnect desktop sessions.</p>
     * 
     * @param request DescribeClientEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClientEventsResponse
     */
    public DescribeClientEventsResponse describeClientEventsWithOptions(DescribeClientEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIp)) {
            query.put("DesktopIp", request.desktopIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypes)) {
            query.put("EventTypes", request.eventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClientEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClientEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can audit the operation logs of regular users to improve security. The operation logs record events such as desktop startup, shutdown, and session disconnection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the operation logs of end users. For example, the logs record the events that end users start and stop cloud desktops, and disconnect desktop sessions.</p>
     * 
     * @param request DescribeClientEventsRequest
     * @return DescribeClientEventsResponse
     */
    public DescribeClientEventsResponse describeClientEvents(DescribeClientEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClientEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of authorized team spaces.</p>
     * 
     * @param request DescribeCloudDriveGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudDriveGroupsResponse
     */
    public DescribeCloudDriveGroupsResponse describeCloudDriveGroupsWithOptions(DescribeCloudDriveGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveStatus)) {
            query.put("DriveStatus", request.driveStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveType)) {
            query.put("DriveType", request.driveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentGroupId)) {
            query.put("ParentGroupId", request.parentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDriveGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDriveGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of authorized team spaces.</p>
     * 
     * @param request DescribeCloudDriveGroupsRequest
     * @return DescribeCloudDriveGroupsResponse
     */
    public DescribeCloudDriveGroupsResponse describeCloudDriveGroups(DescribeCloudDriveGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDriveGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询pds用户权限</p>
     * 
     * @param request DescribeCloudDrivePermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudDrivePermissionsResponse
     */
    public DescribeCloudDrivePermissionsResponse describeCloudDrivePermissionsWithOptions(DescribeCloudDrivePermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDrivePermissions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDrivePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询pds用户权限</p>
     * 
     * @param request DescribeCloudDrivePermissionsRequest
     * @return DescribeCloudDrivePermissionsResponse
     */
    public DescribeCloudDrivePermissionsResponse describeCloudDrivePermissions(DescribeCloudDrivePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDrivePermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有无影网盘终端用户的信息</p>
     * 
     * @param request DescribeCloudDriveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudDriveUsersResponse
     */
    public DescribeCloudDriveUsersResponse describeCloudDriveUsersWithOptions(DescribeCloudDriveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDriveUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDriveUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有无影网盘终端用户的信息</p>
     * 
     * @param request DescribeCloudDriveUsersRequest
     * @return DescribeCloudDriveUsersResponse
     */
    public DescribeCloudDriveUsersResponse describeCloudDriveUsers(DescribeCloudDriveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDriveUsersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCustomizedListHeadersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomizedListHeadersResponse
     */
    public DescribeCustomizedListHeadersResponse describeCustomizedListHeadersWithOptions(DescribeCustomizedListHeadersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomizedListHeaders"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomizedListHeadersResponse());
    }

    /**
     * @param request DescribeCustomizedListHeadersRequest
     * @return DescribeCustomizedListHeadersResponse
     */
    public DescribeCustomizedListHeadersResponse describeCustomizedListHeaders(DescribeCustomizedListHeadersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomizedListHeadersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sessions in a desktop group.</p>
     * 
     * @param request DescribeDesktopGroupSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopGroupSessionsResponse
     */
    public DescribeDesktopGroupSessionsResponse describeDesktopGroupSessionsWithOptions(DescribeDesktopGroupSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownType)) {
            query.put("OwnType", request.ownType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionStatus)) {
            query.put("SessionStatus", request.sessionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopGroupSessions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopGroupSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sessions in a desktop group.</p>
     * 
     * @param request DescribeDesktopGroupSessionsRequest
     * @return DescribeDesktopGroupSessionsResponse
     */
    public DescribeDesktopGroupSessionsResponse describeDesktopGroupSessions(DescribeDesktopGroupSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopGroupSessionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of desktop groups.</p>
     * 
     * @param request DescribeDesktopGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopGroupsResponse
     */
    public DescribeDesktopGroupsResponse describeDesktopGroupsWithOptions(DescribeDesktopGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedEndUserIds)) {
            query.put("ExcludedEndUserIds", request.excludedEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownType)) {
            query.put("OwnType", request.ownType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of desktop groups.</p>
     * 
     * @param request DescribeDesktopGroupsRequest
     * @return DescribeDesktopGroupsResponse
     */
    public DescribeDesktopGroupsResponse describeDesktopGroups(DescribeDesktopGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about cloud computers.</p>
     * 
     * @param request DescribeDesktopInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopInfoResponse
     */
    public DescribeDesktopInfoResponse describeDesktopInfoWithOptions(DescribeDesktopInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information about cloud computers.</p>
     * 
     * @param request DescribeDesktopInfoRequest
     * @return DescribeDesktopInfoResponse
     */
    public DescribeDesktopInfoResponse describeDesktopInfo(DescribeDesktopInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组</p>
     * 
     * @param request DescribeDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopOversoldGroupResponse
     */
    public DescribeDesktopOversoldGroupResponse describeDesktopOversoldGroupWithOptions(DescribeDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupIds)) {
            query.put("OversoldGroupIds", request.oversoldGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组</p>
     * 
     * @param request DescribeDesktopOversoldGroupRequest
     * @return DescribeDesktopOversoldGroupResponse
     */
    public DescribeDesktopOversoldGroupResponse describeDesktopOversoldGroup(DescribeDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组用户</p>
     * 
     * @param request DescribeDesktopOversoldUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopOversoldUserResponse
     */
    public DescribeDesktopOversoldUserResponse describeDesktopOversoldUserWithOptions(DescribeDesktopOversoldUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDesktopIds)) {
            query.put("UserDesktopIds", request.userDesktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopOversoldUser"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopOversoldUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组用户</p>
     * 
     * @param request DescribeDesktopOversoldUserRequest
     * @return DescribeDesktopOversoldUserResponse
     */
    public DescribeDesktopOversoldUserResponse describeDesktopOversoldUser(DescribeDesktopOversoldUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopOversoldUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖用户组</p>
     * 
     * @param request DescribeDesktopOversoldUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopOversoldUserGroupResponse
     */
    public DescribeDesktopOversoldUserGroupResponse describeDesktopOversoldUserGroupWithOptions(DescribeDesktopOversoldUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopOversoldUserGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopOversoldUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖用户组</p>
     * 
     * @param request DescribeDesktopOversoldUserGroupRequest
     * @return DescribeDesktopOversoldUserGroupResponse
     */
    public DescribeDesktopOversoldUserGroupResponse describeDesktopOversoldUserGroup(DescribeDesktopOversoldUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopOversoldUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can only query data within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed session information of a cloud computer.</p>
     * 
     * @param request DescribeDesktopSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopSessionsResponse
     */
    public DescribeDesktopSessionsResponse describeDesktopSessionsWithOptions(DescribeDesktopSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkOsSession)) {
            query.put("CheckOsSession", request.checkOsSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionStatus)) {
            query.put("SessionStatus", request.sessionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPayType)) {
            query.put("SubPayType", request.subPayType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopSessions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can only query data within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed session information of a cloud computer.</p>
     * 
     * @param request DescribeDesktopSessionsRequest
     * @return DescribeDesktopSessionsResponse
     */
    public DescribeDesktopSessionsResponse describeDesktopSessions(DescribeDesktopSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopSessionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When no values are specified for the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters for a cloud desktop, all types of cloud desktops are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the instance types of cloud computers.</p>
     * 
     * @param request DescribeDesktopTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopTypesResponse
     */
    public DescribeDesktopTypesResponse describeDesktopTypesWithOptions(DescribeDesktopTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appliedScope)) {
            query.put("AppliedScope", request.appliedScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuCount)) {
            query.put("CpuCount", request.cpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIdForModify)) {
            query.put("DesktopGroupIdForModify", request.desktopGroupIdForModify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIdForModify)) {
            query.put("DesktopIdForModify", request.desktopIdForModify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTypeId)) {
            query.put("DesktopTypeId", request.desktopTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCount)) {
            query.put("GpuCount", request.gpuCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeFamily)) {
            query.put("InstanceTypeFamily", request.instanceTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memorySize)) {
            query.put("MemorySize", request.memorySize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopTypes"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopTypesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When no values are specified for the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters for a cloud desktop, all types of cloud desktops are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the instance types of cloud computers.</p>
     * 
     * @param request DescribeDesktopTypesRequest
     * @return DescribeDesktopTypesResponse
     */
    public DescribeDesktopTypesResponse describeDesktopTypes(DescribeDesktopTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of the cloud desktop.</p>
     * 
     * @param request DescribeDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopsResponse
     */
    public DescribeDesktopsResponse describeDesktopsWithOptions(DescribeDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatus)) {
            query.put("DesktopStatus", request.desktopStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatusList)) {
            query.put("DesktopStatusList", request.desktopStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedEndUserId)) {
            query.put("ExcludedEndUserId", request.excludedEndUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fillResourceGroup)) {
            query.put("FillResourceGroup", request.fillResourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDesktopGroup)) {
            query.put("FilterDesktopGroup", request.filterDesktopGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuInstanceGroupId)) {
            query.put("GpuInstanceGroupId", request.gpuInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managementFlag)) {
            query.put("ManagementFlag", request.managementFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyDesktopGroup)) {
            query.put("OnlyDesktopGroup", request.onlyDesktopGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osTypes)) {
            query.put("OsTypes", request.osTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qosRuleId)) {
            query.put("QosRuleId", request.qosRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryFotaUpdate)) {
            query.put("QueryFotaUpdate", request.queryFotaUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotPolicyId)) {
            query.put("SnapshotPolicyId", request.snapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPayType)) {
            query.put("SubPayType", request.subPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of the cloud desktop.</p>
     * 
     * @param request DescribeDesktopsRequest
     * @return DescribeDesktopsResponse
     */
    public DescribeDesktopsResponse describeDesktops(DescribeDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud computers in a cloud computer pool by billing method.</p>
     * 
     * @param request DescribeDesktopsInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDesktopsInGroupResponse
     */
    public DescribeDesktopsInGroupResponse describeDesktopsInGroupWithOptions(DescribeDesktopsInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDeleted)) {
            query.put("IgnoreDeleted", request.ignoreDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDesktopsInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDesktopsInGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud computers in a cloud computer pool by billing method.</p>
     * 
     * @param request DescribeDesktopsInGroupRequest
     * @return DescribeDesktopsInGroupResponse
     */
    public DescribeDesktopsInGroupResponse describeDesktopsInGroup(DescribeDesktopsInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDesktopsInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of trusted devices.</p>
     * 
     * @param request DescribeDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDevicesResponse
     */
    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDevices"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of trusted devices.</p>
     * 
     * @param request DescribeDevicesRequest
     * @return DescribeDevicesResponse
     */
    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of directories.</p>
     * 
     * @param request DescribeDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDirectoriesResponse
     */
    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryStatus)) {
            query.put("DirectoryStatus", request.directoryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryType)) {
            query.put("DirectoryType", request.directoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirectories"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirectoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of directories.</p>
     * 
     * @param request DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFlowMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowMetricResponse
     */
    public DescribeFlowMetricResponse describeFlowMetricWithOptions(DescribeFlowMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowMetric"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowMetricResponse());
    }

    /**
     * @param request DescribeFlowMetricRequest
     * @return DescribeFlowMetricResponse
     */
    public DescribeFlowMetricResponse describeFlowMetric(DescribeFlowMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the traffic data in the last 90 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud computer-level traffic statistics of a single office network.</p>
     * 
     * @param request DescribeFlowStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowStatisticResponse
     */
    public DescribeFlowStatisticResponse describeFlowStatisticWithOptions(DescribeFlowStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowStatistic"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the traffic data in the last 90 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud computer-level traffic statistics of a single office network.</p>
     * 
     * @param request DescribeFlowStatisticRequest
     * @return DescribeFlowStatisticResponse
     */
    public DescribeFlowStatisticResponse describeFlowStatistic(DescribeFlowStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the cloud computers whose images can be and are pending to be updated to the specified version.</p>
     * 
     * @param request DescribeFotaPendingDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFotaPendingDesktopsResponse
     */
    public DescribeFotaPendingDesktopsResponse describeFotaPendingDesktopsWithOptions(DescribeFotaPendingDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFotaPendingDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFotaPendingDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the cloud computers whose images can be and are pending to be updated to the specified version.</p>
     * 
     * @param request DescribeFotaPendingDesktopsRequest
     * @return DescribeFotaPendingDesktopsResponse
     */
    public DescribeFotaPendingDesktopsResponse describeFotaPendingDesktops(DescribeFotaPendingDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFotaPendingDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of update tasks.</p>
     * 
     * @param request DescribeFotaTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFotaTasksResponse
     */
    public DescribeFotaTasksResponse describeFotaTasksWithOptions(DescribeFotaTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fotaStatus)) {
            query.put("FotaStatus", request.fotaStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFotaTasks"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFotaTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of update tasks.</p>
     * 
     * @param request DescribeFotaTasksRequest
     * @return DescribeFotaTasksResponse
     */
    public DescribeFotaTasksResponse describeFotaTasks(DescribeFotaTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFotaTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications and their processes of an end user.</p>
     * 
     * @param request DescribeGuestApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGuestApplicationsResponse
     */
    public DescribeGuestApplicationsResponse describeGuestApplicationsWithOptions(DescribeGuestApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGuestApplications"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGuestApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications and their processes of an end user.</p>
     * 
     * @param request DescribeGuestApplicationsRequest
     * @return DescribeGuestApplicationsResponse
     */
    public DescribeGuestApplicationsResponse describeGuestApplications(DescribeGuestApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGuestApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the image modification records of cloud computers.</p>
     * 
     * @param request DescribeImageModifiedRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageModifiedRecordsResponse
     */
    public DescribeImageModifiedRecordsResponse describeImageModifiedRecordsWithOptions(DescribeImageModifiedRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageModifiedRecords"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageModifiedRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the image modification records of cloud computers.</p>
     * 
     * @param request DescribeImageModifiedRecordsRequest
     * @return DescribeImageModifiedRecordsResponse
     */
    public DescribeImageModifiedRecordsResponse describeImageModifiedRecords(DescribeImageModifiedRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageModifiedRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/436982.html">ModifyImagePermission</a> operation to share an image with another cloud computer user or unshare an image. You can call the DescribeImagePermission operation to obtain the Alibaba Cloud accounts with which the current image is shared.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recipient Alibaba Cloud accounts with which an image is shared.</p>
     * 
     * @param request DescribeImagePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImagePermissionResponse
     */
    public DescribeImagePermissionResponse describeImagePermissionWithOptions(DescribeImagePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImagePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagePermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/436982.html">ModifyImagePermission</a> operation to share an image with another cloud computer user or unshare an image. You can call the DescribeImagePermission operation to obtain the Alibaba Cloud accounts with which the current image is shared.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recipient Alibaba Cloud accounts with which an image is shared.</p>
     * 
     * @param request DescribeImagePermissionRequest
     * @return DescribeImagePermissionResponse
     */
    public DescribeImagePermissionResponse describeImagePermission(DescribeImagePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about images.</p>
     * 
     * @param request DescribeImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImagesResponse
     */
    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopInstanceType)) {
            query.put("DesktopInstanceType", request.desktopInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fotaVersion)) {
            query.put("FotaVersion", request.fotaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCategory)) {
            query.put("GpuCategory", request.gpuCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            query.put("GpuDriverVersion", request.gpuDriverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageStatus)) {
            query.put("ImageStatus", request.imageStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageType)) {
            query.put("LanguageType", request.languageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionType)) {
            query.put("SessionType", request.sessionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about images.</p>
     * 
     * @param request DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you run a command, it may not succeed. You can call this operation to query the execution result.</p>
     * <ul>
     * <li>You can query the information about execution in the last two weeks. A maximum of 100,000 lines of execution information can be retained.</li>
     * </ul>
     * 
     * @param request DescribeInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandType)) {
            query.put("CommandType", request.commandType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            query.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOutput)) {
            query.put("IncludeOutput", request.includeOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeStatus)) {
            query.put("InvokeStatus", request.invokeStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you run a command, it may not succeed. You can call this operation to query the execution result.</p>
     * <ul>
     * <li>You can query the information about execution in the last two weeks. A maximum of 100,000 lines of execution information can be retained.</li>
     * </ul>
     * 
     * @param request DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocations(DescribeInvocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvocationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Key Management Service (KMS) keys of users. The first time you call this operation, you can try to create a service key for Elastic Desktop Service (EDS) and call the operation to return results.</p>
     * 
     * @param request DescribeKmsKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKmsKeysResponse
     */
    public DescribeKmsKeysResponse describeKmsKeysWithOptions(DescribeKmsKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKmsKeys"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKmsKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Key Management Service (KMS) keys of users. The first time you call this operation, you can try to create a service key for Elastic Desktop Service (EDS) and call the operation to return results.</p>
     * 
     * @param request DescribeKmsKeysRequest
     * @return DescribeKmsKeysResponse
     */
    public DescribeKmsKeysResponse describeKmsKeys(DescribeKmsKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKmsKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Apsara File Storage NAS (NAS) file systems.</p>
     * 
     * @param request DescribeNASFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNASFileSystemsResponse
     */
    public DescribeNASFileSystemsResponse describeNASFileSystemsWithOptions(DescribeNASFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchCompatibleProfile)) {
            query.put("MatchCompatibleProfile", request.matchCompatibleProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNASFileSystems"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNASFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Apsara File Storage NAS (NAS) file systems.</p>
     * 
     * @param request DescribeNASFileSystemsRequest
     * @return DescribeNASFileSystemsResponse
     */
    public DescribeNASFileSystemsResponse describeNASFileSystems(DescribeNASFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNASFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more premium bandwidth plans.</p>
     * 
     * @param request DescribeNetworkPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkPackagesResponse
     */
    public DescribeNetworkPackagesResponse describeNetworkPackagesWithOptions(DescribeNetworkPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more premium bandwidth plans.</p>
     * 
     * @param request DescribeNetworkPackagesRequest
     * @return DescribeNetworkPackagesResponse
     */
    public DescribeNetworkPackagesResponse describeNetworkPackages(DescribeNetworkPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkPackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries office network properties, including office network ID, name, status, and creation time.</p>
     * 
     * @param request DescribeOfficeSitesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOfficeSitesResponse
     */
    public DescribeOfficeSitesResponse describeOfficeSitesWithOptions(DescribeOfficeSitesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteType)) {
            query.put("OfficeSiteType", request.officeSiteType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOfficeSites"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOfficeSitesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries office network properties, including office network ID, name, status, and creation time.</p>
     * 
     * @param request DescribeOfficeSitesRequest
     * @return DescribeOfficeSitesResponse
     */
    public DescribeOfficeSitesResponse describeOfficeSites(DescribeOfficeSitesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOfficeSitesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more policies.</p>
     * 
     * @param request DescribePolicyGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyGroupsResponse
     */
    public DescribePolicyGroupsResponse describePolicyGroupsWithOptions(DescribePolicyGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more policies.</p>
     * 
     * @param request DescribePolicyGroupsRequest
     * @return DescribePolicyGroupsResponse
     */
    public DescribePolicyGroupsResponse describePolicyGroups(DescribePolicyGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The request parameters vary based on the type of desktop resources whose price you want to query. Take note of the following items:</p>
     * <ul>
     * <li>If you set ResourceType to OfficeSite, you must specify InstanceType.</li>
     * <li>If you set ResourceType to Bandwidth, the pay-by-data-transfer metering method is used for network billing.</li>
     * <li>If you set ResourceType to Desktop, you must specify InstanceType, RootDiskSizeGib, and UserDiskSizeGib. You can specify OsType, PeriodUnit, Period, and Amount based on your business requirements.<blockquote>
     * <p>Before you call this operation to query the prices of cloud desktops by setting ResourceType to Desktop, you must know the desktop types and disk sizes that EDS provides. The disk sizes vary based on the desktop types. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud desktop types</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price information of desktop resources in Elastic Desktop Service (EDS).</p>
     * 
     * @param request DescribePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleModels)) {
            query.put("BundleModels", request.bundleModels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduCdsEnable)) {
            query.put("EduCdsEnable", request.eduCdsEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduCdsSize)) {
            query.put("EduCdsSize", request.eduCdsSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduCommittedTime)) {
            query.put("EduCommittedTime", request.eduCommittedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduDesktopBundleId)) {
            query.put("EduDesktopBundleId", request.eduDesktopBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduDesktopNum)) {
            query.put("EduDesktopNum", request.eduDesktopNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduRoomClassify)) {
            query.put("EduRoomClassify", request.eduRoomClassify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduStudentBundleId)) {
            query.put("EduStudentBundleId", request.eduStudentBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduStudentNum)) {
            query.put("EduStudentNum", request.eduStudentNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduTeacherBundleId)) {
            query.put("EduTeacherBundleId", request.eduTeacherBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eduTeacherNum)) {
            query.put("EduTeacherNum", request.eduTeacherNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupDesktopCount)) {
            query.put("GroupDesktopCount", request.groupDesktopCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hardwareVersion)) {
            query.put("HardwareVersion", request.hardwareVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageSize)) {
            query.put("PackageSize", request.packageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spPeriodInfo)) {
            query.put("SpPeriodInfo", request.spPeriodInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spPrice)) {
            query.put("SpPrice", request.spPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spType)) {
            query.put("SpType", request.spType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The request parameters vary based on the type of desktop resources whose price you want to query. Take note of the following items:</p>
     * <ul>
     * <li>If you set ResourceType to OfficeSite, you must specify InstanceType.</li>
     * <li>If you set ResourceType to Bandwidth, the pay-by-data-transfer metering method is used for network billing.</li>
     * <li>If you set ResourceType to Desktop, you must specify InstanceType, RootDiskSizeGib, and UserDiskSizeGib. You can specify OsType, PeriodUnit, Period, and Amount based on your business requirements.<blockquote>
     * <p>Before you call this operation to query the prices of cloud desktops by setting ResourceType to Desktop, you must know the desktop types and disk sizes that EDS provides. The disk sizes vary based on the desktop types. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud desktop types</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price information of desktop resources in Elastic Desktop Service (EDS).</p>
     * 
     * @param request DescribePriceRequest
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于创建超卖组</p>
     * 
     * @param request DescribePriceForCreateDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceForCreateDesktopOversoldGroupResponse
     */
    public DescribePriceForCreateDesktopOversoldGroupResponse describePriceForCreateDesktopOversoldGroupWithOptions(DescribePriceForCreateDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrenceCount)) {
            query.put("ConcurrenceCount", request.concurrenceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldUserCount)) {
            query.put("OversoldUserCount", request.oversoldUserCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            query.put("SystemDiskSize", request.systemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePriceForCreateDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceForCreateDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于创建超卖组</p>
     * 
     * @param request DescribePriceForCreateDesktopOversoldGroupRequest
     * @return DescribePriceForCreateDesktopOversoldGroupResponse
     */
    public DescribePriceForCreateDesktopOversoldGroupResponse describePriceForCreateDesktopOversoldGroup(DescribePriceForCreateDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceForCreateDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于变配超卖组</p>
     * 
     * @param request DescribePriceForModifyDesktopOversoldGroupSaleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceForModifyDesktopOversoldGroupSaleResponse
     */
    public DescribePriceForModifyDesktopOversoldGroupSaleResponse describePriceForModifyDesktopOversoldGroupSaleWithOptions(DescribePriceForModifyDesktopOversoldGroupSaleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrenceCount)) {
            query.put("ConcurrenceCount", request.concurrenceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldUserCount)) {
            query.put("OversoldUserCount", request.oversoldUserCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePriceForModifyDesktopOversoldGroupSale"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceForModifyDesktopOversoldGroupSaleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于变配超卖组</p>
     * 
     * @param request DescribePriceForModifyDesktopOversoldGroupSaleRequest
     * @return DescribePriceForModifyDesktopOversoldGroupSaleResponse
     */
    public DescribePriceForModifyDesktopOversoldGroupSaleResponse describePriceForModifyDesktopOversoldGroupSale(DescribePriceForModifyDesktopOversoldGroupSaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceForModifyDesktopOversoldGroupSaleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于续费超卖组</p>
     * 
     * @param request DescribePriceForRenewDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceForRenewDesktopOversoldGroupResponse
     */
    public DescribePriceForRenewDesktopOversoldGroupResponse describePriceForRenewDesktopOversoldGroupWithOptions(DescribePriceForRenewDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePriceForRenewDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceForRenewDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询价格用于续费超卖组</p>
     * 
     * @param request DescribePriceForRenewDesktopOversoldGroupRequest
     * @return DescribePriceForRenewDesktopOversoldGroupResponse
     */
    public DescribePriceForRenewDesktopOversoldGroupResponse describePriceForRenewDesktopOversoldGroup(DescribePriceForRenewDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceForRenewDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRecordingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordingsResponse
     */
    public DescribeRecordingsResponse describeRecordingsWithOptions(DescribeRecordingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSignedUrl)) {
            query.put("NeedSignedUrl", request.needSignedUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signedUrlExpireMinutes)) {
            query.put("SignedUrlExpireMinutes", request.signedUrlExpireMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordings"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordingsResponse());
    }

    /**
     * @param request DescribeRecordingsRequest
     * @return DescribeRecordingsResponse
     */
    public DescribeRecordingsResponse describeRecordings(DescribeRecordingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Alibaba Cloud regions that are available for Elastic Desktop Service (EDS).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-09-30"),
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
     * <p>Queries the Alibaba Cloud regions that are available for Elastic Desktop Service (EDS).</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This is a central operation and can be called only by using services in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can query session statistics for the past hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the session statistics of a region.</p>
     * 
     * @param request DescribeSessionStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSessionStatisticResponse
     */
    public DescribeSessionStatisticResponse describeSessionStatisticWithOptions(DescribeSessionStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRegionId)) {
            query.put("SearchRegionId", request.searchRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSessionStatistic"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSessionStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This is a central operation and can be called only by using services in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can query session statistics for the past hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the session statistics of a region.</p>
     * 
     * @param request DescribeSessionStatisticRequest
     * @return DescribeSessionStatisticResponse
     */
    public DescribeSessionStatisticResponse describeSessionStatistic(DescribeSessionStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSessionStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the snapshots that are created based on a cloud computer and the details of the snapshots.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotType)) {
            query.put("SnapshotType", request.snapshotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDiskType)) {
            query.put("SourceDiskType", request.sourceDiskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the snapshots that are created based on a cloud computer and the details of the snapshots.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组中用户连接数据</p>
     * 
     * @param request DescribeUserConnectTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserConnectTimeResponse
     */
    public DescribeUserConnectTimeResponse describeUserConnectTimeWithOptions(DescribeUserConnectTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDesktopId)) {
            query.put("UserDesktopId", request.userDesktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserConnectTime"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserConnectTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询超卖组中用户连接数据</p>
     * 
     * @param request DescribeUserConnectTimeRequest
     * @return DescribeUserConnectTimeResponse
     */
    public DescribeUserConnectTimeResponse describeUserConnectTime(DescribeUserConnectTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserConnectTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connection records of an authorized user to cloud computers in a cloud computer pool.</p>
     * 
     * @param request DescribeUserConnectionRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserConnectionRecordsResponse
     */
    public DescribeUserConnectionRecordsResponse describeUserConnectionRecordsWithOptions(DescribeUserConnectionRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectDurationFrom)) {
            query.put("ConnectDurationFrom", request.connectDurationFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectDurationTo)) {
            query.put("ConnectDurationTo", request.connectDurationTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectEndTimeFrom)) {
            query.put("ConnectEndTimeFrom", request.connectEndTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectEndTimeTo)) {
            query.put("ConnectEndTimeTo", request.connectEndTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectStartTimeFrom)) {
            query.put("ConnectStartTimeFrom", request.connectStartTimeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectStartTimeTo)) {
            query.put("ConnectStartTimeTo", request.connectStartTimeTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserType)) {
            query.put("EndUserType", request.endUserType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserConnectionRecords"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserConnectionRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connection records of an authorized user to cloud computers in a cloud computer pool.</p>
     * 
     * @param request DescribeUserConnectionRecordsRequest
     * @return DescribeUserConnectionRecordsResponse
     */
    public DescribeUserConnectionRecordsResponse describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserConnectionRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of the user profile management (UPM) directory blacklist and whitelist.</p>
     * 
     * @param request DescribeUserProfilePathRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserProfilePathRulesResponse
     */
    public DescribeUserProfilePathRulesResponse describeUserProfilePathRulesWithOptions(DescribeUserProfilePathRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserProfilePathRules"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserProfilePathRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of the user profile management (UPM) directory blacklist and whitelist.</p>
     * 
     * @param request DescribeUserProfilePathRulesRequest
     * @return DescribeUserProfilePathRulesResponse
     */
    public DescribeUserProfilePathRulesResponse describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserProfilePathRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about authorized users in a cloud computer pool, including the usernames, email addresses, mobile numbers, and cloud computer IDs.</p>
     * 
     * @param request DescribeUsersInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersInGroupResponse
     */
    public DescribeUsersInGroupResponse describeUsersInGroupWithOptions(DescribeUsersInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectState)) {
            query.put("ConnectState", request.connectState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUserDetail)) {
            query.put("QueryUserDetail", request.queryUserDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsersInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersInGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about authorized users in a cloud computer pool, including the usernames, email addresses, mobile numbers, and cloud computer IDs.</p>
     * 
     * @param request DescribeUsersInGroupRequest
     * @return DescribeUsersInGroupResponse
     */
    public DescribeUsersInGroupResponse describeUsersInGroup(DescribeUsersInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsersInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the passwords of authorized users of a cloud computer.</p>
     * 
     * @param request DescribeUsersPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersPasswordResponse
     */
    public DescribeUsersPasswordResponse describeUsersPasswordWithOptions(DescribeUsersPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsersPassword"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the passwords of authorized users of a cloud computer.</p>
     * 
     * @param request DescribeUsersPasswordRequest
     * @return DescribeUsersPasswordResponse
     */
    public DescribeUsersPasswordResponse describeUsersPassword(DescribeUsersPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsersPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries multi-factor authentication (MFA) devices that are bound to an Active Directory (AD) account.</p>
     * 
     * @param request DescribeVirtualMFADevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualMFADevicesResponse
     */
    public DescribeVirtualMFADevicesResponse describeVirtualMFADevicesWithOptions(DescribeVirtualMFADevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualMFADevices"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualMFADevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries multi-factor authentication (MFA) devices that are bound to an Active Directory (AD) account.</p>
     * 
     * @param request DescribeVirtualMFADevicesRequest
     * @return DescribeVirtualMFADevicesResponse
     */
    public DescribeVirtualMFADevicesResponse describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualMFADevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the zones in a region in which Elastic Desktop Service is supported.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneType)) {
            query.put("ZoneType", request.zoneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the zones in a region in which Elastic Desktop Service is supported.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an advanced office network from a CEN instance.</p>
     * 
     * @param request DetachCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachCenResponse
     */
    public DetachCenResponse detachCenWithOptions(DetachCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachCenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds an advanced office network from a CEN instance.</p>
     * 
     * @param request DetachCenRequest
     * @return DetachCenResponse
     */
    public DetachCenResponse detachCen(DetachCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachCenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a hardware client from a user.</p>
     * 
     * @param request DetachEndUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachEndUserResponse
     */
    public DetachEndUserResponse detachEndUserWithOptions(DetachEndUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachEndUser"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachEndUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a hardware client from a user.</p>
     * 
     * @param request DetachEndUserRequest
     * @return DetachEndUserResponse
     */
    public DetachEndUserResponse detachEndUser(DetachEndUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachEndUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables cloud desktops in a desktop group.</p>
     * 
     * @param request DisableDesktopsInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDesktopsInGroupResponse
     */
    public DisableDesktopsInGroupResponse disableDesktopsInGroupWithOptions(DisableDesktopsInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDesktopsInGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDesktopsInGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables cloud desktops in a desktop group.</p>
     * 
     * @param request DisableDesktopsInGroupRequest
     * @return DisableDesktopsInGroupResponse
     */
    public DisableDesktopsInGroupResponse disableDesktopsInGroup(DisableDesktopsInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDesktopsInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disconnects from desktop sessions.</p>
     * 
     * @param request DisconnectDesktopSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisconnectDesktopSessionsResponse
     */
    public DisconnectDesktopSessionsResponse disconnectDesktopSessionsWithOptions(DisconnectDesktopSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.preCheck)) {
            query.put("PreCheck", request.preCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessions)) {
            query.put("Sessions", request.sessions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisconnectDesktopSessions"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisconnectDesktopSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disconnects from desktop sessions.</p>
     * 
     * @param request DisconnectDesktopSessionsRequest
     * @return DisconnectDesktopSessionsResponse
     */
    public DisconnectDesktopSessionsResponse disconnectDesktopSessions(DisconnectDesktopSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disconnectDesktopSessionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a premium bandwidth plan from an office network.</p>
     * 
     * @param request DissociateNetworkPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateNetworkPackageResponse
     */
    public DissociateNetworkPackageResponse dissociateNetworkPackageWithOptions(DissociateNetworkPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateNetworkPackage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateNetworkPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a premium bandwidth plan from an office network.</p>
     * 
     * @param request DissociateNetworkPackageRequest
     * @return DissociateNetworkPackageResponse
     */
    public DissociateNetworkPackageResponse dissociateNetworkPackage(DissociateNetworkPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateNetworkPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports events that occur on a cloud desktop from an Alibaba Cloud Workspace client.</p>
     * 
     * @param request ExportClientEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportClientEventsResponse
     */
    public ExportClientEventsResponse exportClientEventsWithOptions(ExportClientEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventTypes)) {
            query.put("EventTypes", request.eventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportClientEvents"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportClientEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports events that occur on a cloud desktop from an Alibaba Cloud Workspace client.</p>
     * 
     * @param request ExportClientEventsRequest
     * @return ExportClientEventsResponse
     */
    public ExportClientEventsResponse exportClientEvents(ExportClientEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportClientEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports cloud computer pools. The list of cloud computer pools is saved as an XLSX file. Each entry of cloud computer pool data includes the ID and name of the cloud computer pool, the ID and name of the office network, the cloud computer pool template, and the name of the security policy.</p>
     * 
     * @param request ExportDesktopGroupInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportDesktopGroupInfoResponse
     */
    public ExportDesktopGroupInfoResponse exportDesktopGroupInfoWithOptions(ExportDesktopGroupInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDesktopGroupInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDesktopGroupInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports cloud computer pools. The list of cloud computer pools is saved as an XLSX file. Each entry of cloud computer pool data includes the ID and name of the cloud computer pool, the ID and name of the office network, the cloud computer pool template, and the name of the security policy.</p>
     * 
     * @param request ExportDesktopGroupInfoRequest
     * @return ExportDesktopGroupInfoResponse
     */
    public ExportDesktopGroupInfoResponse exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDesktopGroupInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer list exported by calling this operation is saved as a CSV file. Each entry of data of a cloud computer includes the following fields:</p>
     * <ul>
     * <li>Cloud computer ID and name</li>
     * <li>Office network ID and name</li>
     * <li>The instance type, OS and protocol of the cloud computer</li>
     * <li>System disk and data disk of the cloud computer</li>
     * <li>The status</li>
     * <li>Purchase method</li>
     * <li>The time when the cloud computer expires</li>
     * <li>Remaining duration and total duration</li>
     * <li>Number of assigned users and number of current users</li>
     * <li>Office network type</li>
     * <li>The time when the cloud computer was created</li>
     * <li>Tags</li>
     * <li>Encryption status</li>
     * <li>IP</li>
     * <li>The hostname</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Exports a cloud computer list as a CSV file.</p>
     * 
     * @param request ExportDesktopListInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportDesktopListInfoResponse
     */
    public ExportDesktopListInfoResponse exportDesktopListInfoWithOptions(ExportDesktopListInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopName)) {
            query.put("DesktopName", request.desktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatus)) {
            query.put("DesktopStatus", request.desktopStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.langType)) {
            query.put("LangType", request.langType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportDesktopListInfo"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportDesktopListInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer list exported by calling this operation is saved as a CSV file. Each entry of data of a cloud computer includes the following fields:</p>
     * <ul>
     * <li>Cloud computer ID and name</li>
     * <li>Office network ID and name</li>
     * <li>The instance type, OS and protocol of the cloud computer</li>
     * <li>System disk and data disk of the cloud computer</li>
     * <li>The status</li>
     * <li>Purchase method</li>
     * <li>The time when the cloud computer expires</li>
     * <li>Remaining duration and total duration</li>
     * <li>Number of assigned users and number of current users</li>
     * <li>Office network type</li>
     * <li>The time when the cloud computer was created</li>
     * <li>Tags</li>
     * <li>Encryption status</li>
     * <li>IP</li>
     * <li>The hostname</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Exports a cloud computer list as a CSV file.</p>
     * 
     * @param request ExportDesktopListInfoRequest
     * @return ExportDesktopListInfoResponse
     */
    public ExportDesktopListInfoResponse exportDesktopListInfo(ExportDesktopListInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportDesktopListInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about an asynchronous task based on the value of the AsyncTaskId parameter that you obtain by calling the CopyCdsFile operation.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTaskWithOptions(GetAsyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncTaskId)) {
            query.put("AsyncTaskId", request.asyncTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about an asynchronous task based on the value of the AsyncTaskId parameter that you obtain by calling the CopyCdsFile operation.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTask(GetAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the credential that is used to connect to a cloud desktop.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionTicket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the credential that is used to connect to a cloud desktop.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the credentials of the stream collaboration</p>
     * 
     * @param request GetCoordinateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCoordinateTicketResponse
     */
    public GetCoordinateTicketResponse getCoordinateTicketWithOptions(GetCoordinateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coId)) {
            query.put("CoId", request.coId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCoordinateTicket"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCoordinateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the credentials of the stream collaboration</p>
     * 
     * @param request GetCoordinateTicketRequest
     * @return GetCoordinateTicketResponse
     */
    public GetCoordinateTicketResponse getCoordinateTicket(GetCoordinateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCoordinateTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a cloud computer pool.</p>
     * 
     * @param request GetDesktopGroupDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDesktopGroupDetailResponse
     */
    public GetDesktopGroupDetailResponse getDesktopGroupDetailWithOptions(GetDesktopGroupDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDesktopGroupDetail"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDesktopGroupDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a cloud computer pool.</p>
     * 
     * @param request GetDesktopGroupDetailRequest
     * @return GetDesktopGroupDetailResponse
     */
    public GetDesktopGroupDetailResponse getDesktopGroupDetail(GetDesktopGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDesktopGroupDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether single sign-on (SSO) is enabled for a workspace.</p>
     * 
     * @param request GetOfficeSiteSsoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOfficeSiteSsoStatusResponse
     */
    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatusWithOptions(GetOfficeSiteSsoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOfficeSiteSsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOfficeSiteSsoStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether single sign-on (SSO) is enabled for a workspace.</p>
     * 
     * @param request GetOfficeSiteSsoStatusRequest
     * @return GetOfficeSiteSsoStatusResponse
     */
    public GetOfficeSiteSsoStatusResponse getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the metadata of a Security Assertion Markup Language (SAML) 2.0-based service provider (SP).</p>
     * 
     * @param request GetSpMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpMetadataResponse
     */
    public GetSpMetadataResponse getSpMetadataWithOptions(GetSpMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpMetadata"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpMetadataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the metadata of a Security Assertion Markup Language (SAML) 2.0-based service provider (SP).</p>
     * 
     * @param request GetSpMetadataRequest
     * @return GetSpMetadataResponse
     */
    public GetSpMetadataResponse getSpMetadata(GetSpMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSpMetadataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Hibernating a cloud desktop is in private preview. If you want to try this feature, submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Hibernates cloud desktops.</p>
     * 
     * @param request HibernateDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HibernateDesktopsResponse
     */
    public HibernateDesktopsResponse hibernateDesktopsWithOptions(HibernateDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HibernateDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HibernateDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Hibernating a cloud desktop is in private preview. If you want to try this feature, submit a ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Hibernates cloud desktops.</p>
     * 
     * @param request HibernateDesktopsRequest
     * @return HibernateDesktopsResponse
     */
    public HibernateDesktopsResponse hibernateDesktops(HibernateDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.hibernateDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the files in a cloud disk.</p>
     * 
     * @param tmpReq ListCdsFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCdsFilesResponse
     */
    public ListCdsFilesResponse listCdsFilesWithOptions(ListCdsFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCdsFilesShrinkRequest request = new ListCdsFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFileId)) {
            query.put("ParentFileId", request.parentFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCdsFiles"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCdsFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the files in a cloud disk.</p>
     * 
     * @param request ListCdsFilesRequest
     * @return ListCdsFilesResponse
     */
    public ListCdsFilesResponse listCdsFiles(ListCdsFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCdsFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you use an AD directory to connect to an AD system, you can call this operation to obtain the user information in the AD system.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the user information in the AD system if you use an AD directory to connect to an AD system.</p>
     * 
     * @param request ListDirectoryUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDirectoryUsersResponse
     */
    public ListDirectoryUsersResponse listDirectoryUsersWithOptions(ListDirectoryUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUPath)) {
            query.put("OUPath", request.OUPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectoryUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectoryUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you use an AD directory to connect to an AD system, you can call this operation to obtain the user information in the AD system.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the user information in the AD system if you use an AD directory to connect to an AD system.</p>
     * 
     * @param request ListDirectoryUsersRequest
     * @return ListDirectoryUsersResponse
     */
    public ListDirectoryUsersResponse listDirectoryUsers(ListDirectoryUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectoryUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about shared files of cloud disks.</p>
     * 
     * @param request ListFilePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilePermissionResponse
     */
    public ListFilePermissionResponse listFilePermissionWithOptions(ListFilePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFilePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about shared files of cloud disks.</p>
     * 
     * @param request ListFilePermissionRequest
     * @return ListFilePermissionResponse
     */
    public ListFilePermissionResponse listFilePermission(ListFilePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an office network, including its status, cloud computer quantity, virtual private cloud (VPC) type, and more.</p>
     * 
     * @param request ListOfficeSiteOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOfficeSiteOverviewResponse
     */
    public ListOfficeSiteOverviewResponse listOfficeSiteOverviewWithOptions(ListOfficeSiteOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceRefresh)) {
            query.put("ForceRefresh", request.forceRefresh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRange)) {
            query.put("QueryRange", request.queryRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfficeSiteOverview"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfficeSiteOverviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an office network, including its status, cloud computer quantity, virtual private cloud (VPC) type, and more.</p>
     * 
     * @param request ListOfficeSiteOverviewRequest
     * @return ListOfficeSiteOverviewResponse
     */
    public ListOfficeSiteOverviewResponse listOfficeSiteOverview(ListOfficeSiteOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOfficeSiteOverviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Active Directory (AD) users after an enterprise AD office network (formerly workspace) interconnects to an AD domain.</p>
     * 
     * @param request ListOfficeSiteUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOfficeSiteUsersResponse
     */
    public ListOfficeSiteUsersResponse listOfficeSiteUsersWithOptions(ListOfficeSiteUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUPath)) {
            query.put("OUPath", request.OUPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOfficeSiteUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOfficeSiteUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Active Directory (AD) users after an enterprise AD office network (formerly workspace) interconnects to an AD domain.</p>
     * 
     * @param request ListOfficeSiteUsersRequest
     * @return ListOfficeSiteUsersResponse
     */
    public ListOfficeSiteUsersResponse listOfficeSiteUsers(ListOfficeSiteUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOfficeSiteUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must use at least one of the following parameters in the request to determine the object that you want to query: <code>ResourceId.N</code>, <code>Tag.N.Key</code>, and <code>Tag.N.Value</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of cloud computers.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must use at least one of the following parameters in the request to determine the object that you want to query: <code>ResourceId.N</code>, <code>Tag.N.Key</code>, and <code>Tag.N.Value</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of cloud computers.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the organizational units (OUs) of an Active Directory (AD) domain that is connected to an enterprise AD office network (formerly workspace).</p>
     * 
     * @param request ListUserAdOrganizationUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserAdOrganizationUnitsResponse
     */
    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnitsWithOptions(ListUserAdOrganizationUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAdOrganizationUnits"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAdOrganizationUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the organizational units (OUs) of an Active Directory (AD) domain that is connected to an enterprise AD office network (formerly workspace).</p>
     * 
     * @param request ListUserAdOrganizationUnitsRequest
     * @return ListUserAdOrganizationUnitsResponse
     */
    public ListUserAdOrganizationUnitsResponse listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserAdOrganizationUnitsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a virtual MFA device is locked, its status changes to LOCKED. The Active Directory (AD) user who uses the virtual MFA device is unable to pass MFA and is therefore unable to log on to the client. You can call the <a href="https://help.aliyun.com/document_detail/206212.html">UnlockVirtualMFADevice</a> operation to unlock the device.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a multi-factor authentication (MFA) device that is in the NORMAL state.</p>
     * 
     * @param request LockVirtualMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockVirtualMFADeviceResponse
     */
    public LockVirtualMFADeviceResponse lockVirtualMFADeviceWithOptions(LockVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockVirtualMFADeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a virtual MFA device is locked, its status changes to LOCKED. The Active Directory (AD) user who uses the virtual MFA device is unable to pass MFA and is therefore unable to log on to the client. You can call the <a href="https://help.aliyun.com/document_detail/206212.html">UnlockVirtualMFADevice</a> operation to unlock the device.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a multi-factor authentication (MFA) device that is in the NORMAL state.</p>
     * 
     * @param request LockVirtualMFADeviceRequest
     * @return LockVirtualMFADeviceResponse
     */
    public LockVirtualMFADeviceResponse lockVirtualMFADevice(LockVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockVirtualMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates cloud computers from the current office network (formerly called workspace) to the new office network.</p>
     * 
     * @param request MigrateDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateDesktopsResponse
     */
    public MigrateDesktopsResponse migrateDesktopsWithOptions(MigrateDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetOfficeSiteId)) {
            query.put("TargetOfficeSiteId", request.targetOfficeSiteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Migrates cloud computers from the current office network (formerly called workspace) to the new office network.</p>
     * 
     * @param request MigrateDesktopsRequest
     * @return MigrateDesktopsResponse
     */
    public MigrateDesktopsResponse migrateDesktops(MigrateDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the protocols of images to Adaptive Streaming Protocol (ASP).</p>
     * 
     * @param request MigrateImageProtocolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateImageProtocolResponse
     */
    public MigrateImageProtocolResponse migrateImageProtocolWithOptions(MigrateImageProtocolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProtocolType)) {
            query.put("TargetProtocolType", request.targetProtocolType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateImageProtocol"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateImageProtocolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the protocols of images to Adaptive Streaming Protocol (ASP).</p>
     * 
     * @param request MigrateImageProtocolRequest
     * @return MigrateImageProtocolResponse
     */
    public MigrateImageProtocolResponse migrateImageProtocol(MigrateImageProtocolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateImageProtocolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the following domain name- and Domain Name System (DNS)-related parameters only for Active Directory (AD) directories that are in the ERROR or REGISTERING state: <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Active Directory (AD) directory.</p>
     * 
     * @param request ModifyADConnectorDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyADConnectorDirectoryResponse
     */
    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectoryWithOptions(ModifyADConnectorDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyADConnectorDirectory"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyADConnectorDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the following domain name- and Domain Name System (DNS)-related parameters only for Active Directory (AD) directories that are in the ERROR or REGISTERING state: <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Active Directory (AD) directory.</p>
     * 
     * @param request ModifyADConnectorDirectoryRequest
     * @return ModifyADConnectorDirectoryResponse
     */
    public ModifyADConnectorDirectoryResponse modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyADConnectorDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify parameters of domain names and Domain Name System (DNS) for enterprise AD office networks that are in the <code>ERROR</code> or <code>REGISTERED</code> state. The parameters include <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress.N</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic properties of an enterprise Active Directory (AD) office network, such as the office network name and domain names of the enterprise AD subdomains.</p>
     * 
     * @param request ModifyADConnectorOfficeSiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyADConnectorOfficeSiteResponse
     */
    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSiteWithOptions(ModifyADConnectorOfficeSiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adHostname)) {
            query.put("AdHostname", request.adHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupDCHostname)) {
            query.put("BackupDCHostname", request.backupDCHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupDns)) {
            query.put("BackupDns", request.backupDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsAddress)) {
            query.put("DnsAddress", request.dnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainPassword)) {
            query.put("DomainPassword", request.domainPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUserName)) {
            query.put("DomainUserName", request.domainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OUName)) {
            query.put("OUName", request.OUName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainDnsAddress)) {
            query.put("SubDomainDnsAddress", request.subDomainDnsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomainName)) {
            query.put("SubDomainName", request.subDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyADConnectorOfficeSite"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyADConnectorOfficeSiteResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify parameters of domain names and Domain Name System (DNS) for enterprise AD office networks that are in the <code>ERROR</code> or <code>REGISTERED</code> state. The parameters include <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress.N</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic properties of an enterprise Active Directory (AD) office network, such as the office network name and domain names of the enterprise AD subdomains.</p>
     * 
     * @param request ModifyADConnectorOfficeSiteRequest
     * @return ModifyADConnectorOfficeSiteResponse
     */
    public ModifyADConnectorOfficeSiteResponse modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyADConnectorOfficeSiteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can set different Internet access control policies at different granularities to achieve the effect of composite policies. For example, you can disable the Internet access on the office network granularity and enable the Internet access on specific cloud computer granularity. The effect is that all cloud computers in the office network except the specified cloud computers are not allowed to access the Internet.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the Internet access control policy on the office network or cloud computer granularity.</p>
     * 
     * @param request ModifyAclEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAclEntriesResponse
     */
    public ModifyAclEntriesResponse modifyAclEntriesWithOptions(ModifyAclEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAclEntries"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAclEntriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can set different Internet access control policies at different granularities to achieve the effect of composite policies. For example, you can disable the Internet access on the office network granularity and enable the Internet access on specific cloud computer granularity. The effect is that all cloud computers in the office network except the specified cloud computers are not allowed to access the Internet.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the Internet access control policy on the office network or cloud computer granularity.</p>
     * 
     * @param request ModifyAclEntriesRequest
     * @return ModifyAclEntriesResponse
     */
    public ModifyAclEntriesResponse modifyAclEntries(ModifyAclEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAclEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of an automatic snapshot policy, such as the policy name and snapshot retention period.</p>
     * 
     * @param request ModifyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicy"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoSnapshotPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of an automatic snapshot policy, such as the policy name and snapshot retention period.</p>
     * 
     * @param request ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only custom desktop templates can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom cloud computer template.</p>
     * 
     * @param request ModifyBundleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBundleResponse
     */
    public ModifyBundleResponse modifyBundleWithOptions(ModifyBundleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bundleId)) {
            query.put("BundleId", request.bundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bundleName)) {
            query.put("BundleName", request.bundleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBundle"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBundleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only custom desktop templates can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom cloud computer template.</p>
     * 
     * @param request ModifyBundleRequest
     * @return ModifyBundleResponse
     */
    public ModifyBundleResponse modifyBundle(ModifyBundleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBundleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the files in a cloud disk.</p>
     * 
     * @param request ModifyCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdsFileResponse
     */
    public ModifyCdsFileResponse modifyCdsFileWithOptions(ModifyCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictPolicy)) {
            query.put("ConflictPolicy", request.conflictPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdsFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the files in a cloud disk.</p>
     * 
     * @param request ModifyCdsFileRequest
     * @return ModifyCdsFileResponse
     */
    public ModifyCdsFileResponse modifyCdsFile(ModifyCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the link for file sharing.</p>
     * 
     * @param request ModifyCdsFileShareLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCdsFileShareLinkResponse
     */
    public ModifyCdsFileShareLinkResponse modifyCdsFileShareLinkWithOptions(ModifyCdsFileShareLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDownload)) {
            query.put("DisableDownload", request.disableDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disablePreview)) {
            query.put("DisablePreview", request.disablePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSave)) {
            query.put("DisableSave", request.disableSave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadCount)) {
            query.put("DownloadCount", request.downloadCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadLimit)) {
            query.put("DownloadLimit", request.downloadLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            query.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewCount)) {
            query.put("PreviewCount", request.previewCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewLimit)) {
            query.put("PreviewLimit", request.previewLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportCount)) {
            query.put("ReportCount", request.reportCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveCount)) {
            query.put("SaveCount", request.saveCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveLimit)) {
            query.put("SaveLimit", request.saveLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            query.put("ShareId", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareName)) {
            query.put("ShareName", request.shareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharePwd)) {
            query.put("SharePwd", request.sharePwd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPreviewCount)) {
            query.put("VideoPreviewCount", request.videoPreviewCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCdsFileShareLink"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCdsFileShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the link for file sharing.</p>
     * 
     * @param request ModifyCdsFileShareLinkRequest
     * @return ModifyCdsFileShareLinkResponse
     */
    public ModifyCdsFileShareLinkResponse modifyCdsFileShareLink(ModifyCdsFileShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCdsFileShareLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies team spaces.</p>
     * 
     * @param request ModifyCloudDriveGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudDriveGroupsResponse
     */
    public ModifyCloudDriveGroupsResponse modifyCloudDriveGroupsWithOptions(ModifyCloudDriveGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSize)) {
            query.put("TotalSize", request.totalSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudDriveGroups"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudDriveGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies team spaces.</p>
     * 
     * @param request ModifyCloudDriveGroupsRequest
     * @return ModifyCloudDriveGroupsResponse
     */
    public ModifyCloudDriveGroupsResponse modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudDriveGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the user permissions on Cloud Drive Service, and configures users who have the download permissions and upload and download permissions. By default, the users that are not configured the preceding permissions only have the upload permissions.</p>
     * 
     * @param request ModifyCloudDrivePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudDrivePermissionResponse
     */
    public ModifyCloudDrivePermissionResponse modifyCloudDrivePermissionWithOptions(ModifyCloudDrivePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadEndUserIds)) {
            query.put("DownloadEndUserIds", request.downloadEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadUploadEndUserIds)) {
            query.put("DownloadUploadEndUserIds", request.downloadUploadEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudDrivePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudDrivePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the user permissions on Cloud Drive Service, and configures users who have the download permissions and upload and download permissions. By default, the users that are not configured the preceding permissions only have the upload permissions.</p>
     * 
     * @param request ModifyCloudDrivePermissionRequest
     * @return ModifyCloudDrivePermissionResponse
     */
    public ModifyCloudDrivePermissionResponse modifyCloudDrivePermission(ModifyCloudDrivePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudDrivePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改无影网盘终端用户的属性</p>
     * 
     * @param request ModifyCloudDriveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudDriveUsersResponse
     */
    public ModifyCloudDriveUsersResponse modifyCloudDriveUsersWithOptions(ModifyCloudDriveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMaxSize)) {
            query.put("UserMaxSize", request.userMaxSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudDriveUsers"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudDriveUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改无影网盘终端用户的属性</p>
     * 
     * @param request ModifyCloudDriveUsersRequest
     * @return ModifyCloudDriveUsersResponse
     */
    public ModifyCloudDriveUsersResponse modifyCloudDriveUsers(ModifyCloudDriveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudDriveUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the layouts of cloud computer list headers, such as the required fields and the display and hide settings.</p>
     * 
     * @param request ModifyCustomizedListHeadersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomizedListHeadersResponse
     */
    public ModifyCustomizedListHeadersResponse modifyCustomizedListHeadersWithOptions(ModifyCustomizedListHeadersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.headers)) {
            query.put("Headers", request.headers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomizedListHeaders"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomizedListHeadersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the layouts of cloud computer list headers, such as the required fields and the display and hide settings.</p>
     * 
     * @param request ModifyCustomizedListHeadersRequest
     * @return ModifyCustomizedListHeadersResponse
     */
    public ModifyCustomizedListHeadersResponse modifyCustomizedListHeaders(ModifyCustomizedListHeadersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomizedListHeadersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing methods of cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the cloud computers whose billing method you want to change are in the Running or Stopped state and you have no overdue payments in your Alibaba Cloud account.</li>
     * <li>After the order payment is completed, the system starts to change the billing method of the cloud computers. During the change, you cannot perform operations, such as starting or stopping the cloud computers, and changing configurations of the cloud computers.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of cloud computers to subscription or pay-as-you-go.</p>
     * 
     * @param request ModifyDesktopChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopChargeTypeResponse
     */
    public ModifyDesktopChargeTypeResponse modifyDesktopChargeTypeWithOptions(ModifyDesktopChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDuration)) {
            query.put("UseDuration", request.useDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopChargeType"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopChargeTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing methods of cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the cloud computers whose billing method you want to change are in the Running or Stopped state and you have no overdue payments in your Alibaba Cloud account.</li>
     * <li>After the order payment is completed, the system starts to change the billing method of the cloud computers. During the change, you cannot perform operations, such as starting or stopping the cloud computers, and changing configurations of the cloud computers.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of cloud computers to subscription or pay-as-you-go.</p>
     * 
     * @param request ModifyDesktopChargeTypeRequest
     * @return ModifyDesktopChargeTypeResponse
     */
    public ModifyDesktopChargeTypeResponse modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a cloud computer pool is created, the system creates a specific number of cloud computers in the pool based on the auto scaling policy and user connections. Cloud computers are created by using the same cloud computer template and security policy. You can modify the configurations of the pool, including the pool name, cloud computer template, and policy, in different business scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a cloud computer pool.</p>
     * 
     * @param request ModifyDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopGroupResponse
     */
    public ModifyDesktopGroupResponse modifyDesktopGroupWithOptions(ModifyDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowAutoSetup)) {
            query.put("AllowAutoSetup", request.allowAutoSetup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowBufferCount)) {
            query.put("AllowBufferCount", request.allowBufferCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindAmount)) {
            query.put("BindAmount", request.bindAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyDesktopsCount)) {
            query.put("BuyDesktopsCount", request.buyDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classify)) {
            query.put("Classify", request.classify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectDuration)) {
            query.put("ConnectDuration", request.connectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupName)) {
            query.put("DesktopGroupName", request.desktopGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSessionConfig)) {
            query.put("DisableSessionConfig", request.disableSessionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleDisconnectDuration)) {
            query.put("IdleDisconnectDuration", request.idleDisconnectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadPolicy)) {
            query.put("LoadPolicy", request.loadPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDesktopsCount)) {
            query.put("MaxDesktopsCount", request.maxDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDesktopsCount)) {
            query.put("MinDesktopsCount", request.minDesktopsCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownBundleId)) {
            query.put("OwnBundleId", request.ownBundleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            query.put("PolicyGroupIds", request.policyGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileFollowSwitch)) {
            query.put("ProfileFollowSwitch", request.profileFollowSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratioThreshold)) {
            query.put("RatioThreshold", request.ratioThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleStrategyId)) {
            query.put("ScaleStrategyId", request.scaleStrategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopDuration)) {
            query.put("StopDuration", request.stopDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a cloud computer pool is created, the system creates a specific number of cloud computers in the pool based on the auto scaling policy and user connections. Cloud computers are created by using the same cloud computer template and security policy. You can modify the configurations of the pool, including the pool name, cloud computer template, and policy, in different business scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a cloud computer pool.</p>
     * 
     * @param request ModifyDesktopGroupRequest
     * @return ModifyDesktopGroupResponse
     */
    public ModifyDesktopGroupResponse modifyDesktopGroup(ModifyDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The Windows cloud computer whose hostname you want to modify must be in an AD office network. After the hostname is modified, the cloud computer is re-created.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the hostname of a Windows cloud computer in the Active Directory (AD) office network.</p>
     * 
     * @param request ModifyDesktopHostNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopHostNameResponse
     */
    public ModifyDesktopHostNameResponse modifyDesktopHostNameWithOptions(ModifyDesktopHostNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newHostName)) {
            query.put("NewHostName", request.newHostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopHostName"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopHostNameResponse());
    }

    /**
     * <b>description</b> :
     * <p>The Windows cloud computer whose hostname you want to modify must be in an AD office network. After the hostname is modified, the cloud computer is re-created.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the hostname of a Windows cloud computer in the Active Directory (AD) office network.</p>
     * 
     * @param request ModifyDesktopHostNameRequest
     * @return ModifyDesktopHostNameResponse
     */
    public ModifyDesktopHostNameResponse modifyDesktopHostName(ModifyDesktopHostNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopHostNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a cloud computer to a new name.</p>
     * 
     * @param request ModifyDesktopNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopNameResponse
     */
    public ModifyDesktopNameResponse modifyDesktopNameWithOptions(ModifyDesktopNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDesktopName)) {
            query.put("NewDesktopName", request.newDesktopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopName"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a cloud computer to a new name.</p>
     * 
     * @param request ModifyDesktopNameRequest
     * @return ModifyDesktopNameResponse
     */
    public ModifyDesktopNameResponse modifyDesktopName(ModifyDesktopNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖组</p>
     * 
     * @param request ModifyDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopOversoldGroupResponse
     */
    public ModifyDesktopOversoldGroupResponse modifyDesktopOversoldGroupWithOptions(ModifyDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrenceCount)) {
            query.put("ConcurrenceCount", request.concurrenceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleDisconnectDuration)) {
            query.put("IdleDisconnectDuration", request.idleDisconnectDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepDuration)) {
            query.put("KeepDuration", request.keepDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldUserCount)) {
            query.put("OversoldUserCount", request.oversoldUserCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldWarn)) {
            query.put("OversoldWarn", request.oversoldWarn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopDuration)) {
            query.put("StopDuration", request.stopDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖组</p>
     * 
     * @param request ModifyDesktopOversoldGroupRequest
     * @return ModifyDesktopOversoldGroupResponse
     */
    public ModifyDesktopOversoldGroupResponse modifyDesktopOversoldGroup(ModifyDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖组售卖数据</p>
     * 
     * @param request ModifyDesktopOversoldGroupSaleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopOversoldGroupSaleResponse
     */
    public ModifyDesktopOversoldGroupSaleResponse modifyDesktopOversoldGroupSaleWithOptions(ModifyDesktopOversoldGroupSaleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrenceCount)) {
            query.put("ConcurrenceCount", request.concurrenceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldUserCount)) {
            query.put("OversoldUserCount", request.oversoldUserCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopOversoldGroupSale"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopOversoldGroupSaleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖组售卖数据</p>
     * 
     * @param request ModifyDesktopOversoldGroupSaleRequest
     * @return ModifyDesktopOversoldGroupSaleResponse
     */
    public ModifyDesktopOversoldGroupSaleResponse modifyDesktopOversoldGroupSale(ModifyDesktopOversoldGroupSaleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopOversoldGroupSaleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖用户组</p>
     * 
     * @param request ModifyDesktopOversoldUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopOversoldUserGroupResponse
     */
    public ModifyDesktopOversoldUserGroupResponse modifyDesktopOversoldUserGroupWithOptions(ModifyDesktopOversoldUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopOversoldUserGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopOversoldUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改桌面超卖用户组</p>
     * 
     * @param request ModifyDesktopOversoldUserGroupRequest
     * @return ModifyDesktopOversoldUserGroupResponse
     */
    public ModifyDesktopOversoldUserGroupResponse modifyDesktopOversoldUserGroup(ModifyDesktopOversoldUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopOversoldUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Changing the configurations of a cloud computer includes changing the instance type of the cloud computer and scaling up the disks of the cloud computer.</p>
     * <ul>
     * <li>Before you change the configurations of a cloud computer, you must understand the instance types and disk sizes supported by cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud computer types</a>. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the instance types supported by cloud computers.</li>
     * <li>You must change at least one of the following configurations: instance type, system disk size, and data disk size of the cloud computer. You must specify at least one of the following parameters: <code>DesktopType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>. Take note of the following items:<ul>
     * <li>The instance type of a cloud computer includes the configurations of vCPUs, memory, and GPUs. You can only change an instance type to another. You cannot change only one of the configurations.</li>
     * <li>You cannot change a cloud computer between the General Office type and the non-General Office type. You cannot yet change a cloud computer between the Graphics type and the non-Graphics type.</li>
     * <li>The system disk and data disks of a cloud computer can only be scaled up and cannot be scaled down.</li>
     * <li>If the billing method of the cloud computer is subscription, the system calculates the price difference based on the configuration difference between the original cloud computer and the new cloud computer. You must make up for the price difference or receive a refund for the price difference.</li>
     * <li>We recommend that you do not change the configurations of a cloud computer twice within 5 minutes.</li>
     * <li>When you change the configurations of a cloud computer, the cloud computer must be in the Stopped state.</li>
     * </ul>
     * </li>
     * <li>After you change the configurations of a cloud computer, the personal data on the cloud computer is not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the instance type of a cloud computer and scales up the disks of the cloud computer.</p>
     * 
     * @param request ModifyDesktopSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopSpecResponse
     */
    public ModifyDesktopSpecResponse modifyDesktopSpecWithOptions(ModifyDesktopSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopType)) {
            query.put("DesktopType", request.desktopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpecs)) {
            query.put("ResourceSpecs", request.resourceSpecs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskSizeGib)) {
            query.put("RootDiskSizeGib", request.rootDiskSizeGib);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskSizeGib)) {
            query.put("UserDiskSizeGib", request.userDiskSizeGib);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopSpec"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>Changing the configurations of a cloud computer includes changing the instance type of the cloud computer and scaling up the disks of the cloud computer.</p>
     * <ul>
     * <li>Before you change the configurations of a cloud computer, you must understand the instance types and disk sizes supported by cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud computer types</a>. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the instance types supported by cloud computers.</li>
     * <li>You must change at least one of the following configurations: instance type, system disk size, and data disk size of the cloud computer. You must specify at least one of the following parameters: <code>DesktopType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>. Take note of the following items:<ul>
     * <li>The instance type of a cloud computer includes the configurations of vCPUs, memory, and GPUs. You can only change an instance type to another. You cannot change only one of the configurations.</li>
     * <li>You cannot change a cloud computer between the General Office type and the non-General Office type. You cannot yet change a cloud computer between the Graphics type and the non-Graphics type.</li>
     * <li>The system disk and data disks of a cloud computer can only be scaled up and cannot be scaled down.</li>
     * <li>If the billing method of the cloud computer is subscription, the system calculates the price difference based on the configuration difference between the original cloud computer and the new cloud computer. You must make up for the price difference or receive a refund for the price difference.</li>
     * <li>We recommend that you do not change the configurations of a cloud computer twice within 5 minutes.</li>
     * <li>When you change the configurations of a cloud computer, the cloud computer must be in the Stopped state.</li>
     * </ul>
     * </li>
     * <li>After you change the configurations of a cloud computer, the personal data on the cloud computer is not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the instance type of a cloud computer and scales up the disks of the cloud computer.</p>
     * 
     * @param request ModifyDesktopSpecRequest
     * @return ModifyDesktopSpecResponse
     */
    public ModifyDesktopSpecResponse modifyDesktopSpec(ModifyDesktopSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies scheduled tasks on cloud computers, such as starting, stopping, restarting, and resetting cloud computers on schedule.</p>
     * 
     * @param request ModifyDesktopTimerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopTimerResponse
     */
    public ModifyDesktopTimerResponse modifyDesktopTimerWithOptions(ModifyDesktopTimerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopTimers)) {
            query.put("DesktopTimers", request.desktopTimers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDesktopTimers)) {
            query.put("UseDesktopTimers", request.useDesktopTimers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopTimer"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies scheduled tasks on cloud computers, such as starting, stopping, restarting, and resetting cloud computers on schedule.</p>
     * 
     * @param request ModifyDesktopTimerRequest
     * @return ModifyDesktopTimerResponse
     */
    public ModifyDesktopTimerResponse modifyDesktopTimer(ModifyDesktopTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopTimerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud desktops that you want to restart by calling this operation must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the policies that are configured for a cloud desktop.</p>
     * 
     * @param request ModifyDesktopsPolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesktopsPolicyGroupResponse
     */
    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroupWithOptions(ModifyDesktopsPolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            query.put("PolicyGroupIds", request.policyGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesktopsPolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesktopsPolicyGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud desktops that you want to restart by calling this operation must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the policies that are configured for a cloud desktop.</p>
     * 
     * @param request ModifyDesktopsPolicyGroupRequest
     * @return ModifyDesktopsPolicyGroupResponse
     */
    public ModifyDesktopsPolicyGroupResponse modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesktopsPolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the configurations, such as the desktop type and disk size, of a cloud desktop.</p>
     * <ul>
     * <li>Before you call this operation, you must know the cloud desktop types and the disk sizes for each type of cloud desktop that Elastic Desktop Service (EDS) provides.</li>
     * <li>When you change the configurations of a cloud desktop, you must change the desktop type or the size of the system disk or data disk. You must configure at least one of the following parameters: DesktopType, RootDiskSizeGib, and UserDiskSizeGib. Take note of the following items:
     * 1\. Desktop types include the specifications of vCPUs, memory, and GPUs. You can change only the desktop type, instead of one of the specifications.
     * 2\. You cannot change a cloud desktop from the General Office type to a non-General Office type, or from a non-General Office type to the General Office type. You cannot change a cloud desktop from the Graphics type to a non-Graphics type, or from a non-Graphics type to the Graphics type.
     * 3\. You can only increase the sizes of system and data disks. You cannot decrease the sizes of system and data disks.
     * 4\. If your cloud desktop uses the subscription billing method, the price difference is calculated based on the price before and after configuration changes. You may receive a refund, or must pay for the price difference.
     * 5\. If you need to change the configurations of a cloud desktop multiple times, we recommend that you wait at least 5 minutes between consecutive operations on the cloud desktop.
     * 6\. The cloud desktop for which you want to change the desktop type must be in the Stopped state.</li>
     * <li>The changes do not affect your personal data on the cloud desktop.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of a cloud desktop, including the number of vCPUs, memory size, and disk size.</p>
     * 
     * @param request ModifyDiskSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDiskSpecResponse
     */
    public ModifyDiskSpecResponse modifyDiskSpecWithOptions(ModifyDiskSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDiskPerformanceLevel)) {
            query.put("RootDiskPerformanceLevel", request.rootDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDiskPerformanceLevel)) {
            query.put("UserDiskPerformanceLevel", request.userDiskPerformanceLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDiskSpec"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDiskSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the configurations, such as the desktop type and disk size, of a cloud desktop.</p>
     * <ul>
     * <li>Before you call this operation, you must know the cloud desktop types and the disk sizes for each type of cloud desktop that Elastic Desktop Service (EDS) provides.</li>
     * <li>When you change the configurations of a cloud desktop, you must change the desktop type or the size of the system disk or data disk. You must configure at least one of the following parameters: DesktopType, RootDiskSizeGib, and UserDiskSizeGib. Take note of the following items:
     * 1\. Desktop types include the specifications of vCPUs, memory, and GPUs. You can change only the desktop type, instead of one of the specifications.
     * 2\. You cannot change a cloud desktop from the General Office type to a non-General Office type, or from a non-General Office type to the General Office type. You cannot change a cloud desktop from the Graphics type to a non-Graphics type, or from a non-Graphics type to the Graphics type.
     * 3\. You can only increase the sizes of system and data disks. You cannot decrease the sizes of system and data disks.
     * 4\. If your cloud desktop uses the subscription billing method, the price difference is calculated based on the price before and after configuration changes. You may receive a refund, or must pay for the price difference.
     * 5\. If you need to change the configurations of a cloud desktop multiple times, we recommend that you wait at least 5 minutes between consecutive operations on the cloud desktop.
     * 6\. The cloud desktop for which you want to change the desktop type must be in the Stopped state.</li>
     * <li>The changes do not affect your personal data on the cloud desktop.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of a cloud desktop, including the number of vCPUs, memory size, and disk size.</p>
     * 
     * @param request ModifyDiskSpecRequest
     * @return ModifyDiskSpecResponse
     */
    public ModifyDiskSpecResponse modifyDiskSpec(ModifyDiskSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDiskSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The cloud computer must be in the Running state.</p>
     * <ul>
     * <li>After you call this operation, the assignment result is immediately returned. You can call the <a href="https://help.aliyun.com/document_detail/436815.html">DescribeDesktops</a> operation to query the assignment of the cloud computer. The value of the <code>ManagementFlags</code> response parameter indicates the assignment of the cloud computer. A value of <code>ASSIGNING</code> indicates that the cloud computer is being assigned, and other values indicate that the cloud computer is assigned.</li>
     * <li>We recommend that you check the assignment every 2 to 5 seconds and perform the checks within 50 seconds. Typically, 1 to 5 seconds are required to complete the assignment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Assigns a cloud computer to end users and removes all original end users of the cloud computer.</p>
     * 
     * @param request ModifyEntitlementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEntitlementResponse
     */
    public ModifyEntitlementResponse modifyEntitlementWithOptions(ModifyEntitlementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEntitlement"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEntitlementResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The cloud computer must be in the Running state.</p>
     * <ul>
     * <li>After you call this operation, the assignment result is immediately returned. You can call the <a href="https://help.aliyun.com/document_detail/436815.html">DescribeDesktops</a> operation to query the assignment of the cloud computer. The value of the <code>ManagementFlags</code> response parameter indicates the assignment of the cloud computer. A value of <code>ASSIGNING</code> indicates that the cloud computer is being assigned, and other values indicate that the cloud computer is assigned.</li>
     * <li>We recommend that you check the assignment every 2 to 5 seconds and perform the checks within 50 seconds. Typically, 1 to 5 seconds are required to complete the assignment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Assigns a cloud computer to end users and removes all original end users of the cloud computer.</p>
     * 
     * @param request ModifyEntitlementRequest
     * @return ModifyEntitlementResponse
     */
    public ModifyEntitlementResponse modifyEntitlement(ModifyEntitlementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEntitlementWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the attributes of only custom images that are in the Available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an image, including the name and description of the image.</p>
     * 
     * @param request ModifyImageAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyImageAttributeResponse
     */
    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageAttribute"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the attributes of only custom images that are in the Available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of an image, including the name and description of the image.</p>
     * 
     * @param request ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Security of shared images</h3>
     * <p>Elastic Desktop Service cannot guarantee the integrity and security of shared images. When you use a shared image, you must make sure that the image comes from a trusted sharer or account, and you are legally responsible for using the shared image.</p>
     * <h3><a href="#"></a>Quota and billing</h3>
     * <ul>
     * <li>A shared image does not count against the image quotas of principals to which the image is shared.</li>
     * <li>After a principal uses a shared image to create a cloud computer, the sharer is not charged for the shared image.</li>
     * <li>You are not charged for shared images.</li>
     * </ul>
     * <h3><a href="#"></a>Supported sharing behaviors</h3>
     * <ul>
     * <li>You can share custom images with other Alibaba Cloud accounts.</li>
     * <li>You can share custom images between accounts in the China site (aliyun.com) and the international site (alibabacloud.com).</li>
     * </ul>
     * <h3><a href="#"></a>Unsupported sharing behaviors</h3>
     * <ul>
     * <li>You cannot share images that are shared by other Alibaba Cloud accounts.</li>
     * <li>You cannot share encrypted images.</li>
     * <li>You cannot share images across regions. If you want to share an image across regions, you must copy the image to the destination region and then share the image. For more information, see <a href="https://help.aliyun.com/document_detail/436978.html">CopyImage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares an image with other Alibaba Cloud accounts, or unshares an image from the recipient Alibaba Cloud accounts.</p>
     * 
     * @param request ModifyImagePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyImagePermissionResponse
     */
    public ModifyImagePermissionResponse modifyImagePermissionWithOptions(ModifyImagePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addAccount)) {
            query.put("AddAccount", request.addAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeAccount)) {
            query.put("RemoveAccount", request.removeAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImagePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImagePermissionResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Security of shared images</h3>
     * <p>Elastic Desktop Service cannot guarantee the integrity and security of shared images. When you use a shared image, you must make sure that the image comes from a trusted sharer or account, and you are legally responsible for using the shared image.</p>
     * <h3><a href="#"></a>Quota and billing</h3>
     * <ul>
     * <li>A shared image does not count against the image quotas of principals to which the image is shared.</li>
     * <li>After a principal uses a shared image to create a cloud computer, the sharer is not charged for the shared image.</li>
     * <li>You are not charged for shared images.</li>
     * </ul>
     * <h3><a href="#"></a>Supported sharing behaviors</h3>
     * <ul>
     * <li>You can share custom images with other Alibaba Cloud accounts.</li>
     * <li>You can share custom images between accounts in the China site (aliyun.com) and the international site (alibabacloud.com).</li>
     * </ul>
     * <h3><a href="#"></a>Unsupported sharing behaviors</h3>
     * <ul>
     * <li>You cannot share images that are shared by other Alibaba Cloud accounts.</li>
     * <li>You cannot share encrypted images.</li>
     * <li>You cannot share images across regions. If you want to share an image across regions, you must copy the image to the destination region and then share the image. For more information, see <a href="https://help.aliyun.com/document_detail/436978.html">CopyImage</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shares an image with other Alibaba Cloud accounts, or unshares an image from the recipient Alibaba Cloud accounts.</p>
     * 
     * @param request ModifyImagePermissionRequest
     * @return ModifyImagePermissionResponse
     */
    public ModifyImagePermissionResponse modifyImagePermission(ModifyImagePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImagePermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, the mount target does not need to be changed. If the mount target is deleted by misoperation, you must specify a new mount target for the NAS file system in the workspace. You can call the <a href="https://help.aliyun.com/document_detail/62621.html">CreateMountTarget</a> operation to create a mount target.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the mount target of an Apsara File Storage NAS (NAS) file system.</p>
     * 
     * @param request ModifyNASDefaultMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNASDefaultMountTargetResponse
     */
    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTargetWithOptions(ModifyNASDefaultMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNASDefaultMountTarget"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNASDefaultMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, the mount target does not need to be changed. If the mount target is deleted by misoperation, you must specify a new mount target for the NAS file system in the workspace. You can call the <a href="https://help.aliyun.com/document_detail/62621.html">CreateMountTarget</a> operation to create a mount target.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the mount target of an Apsara File Storage NAS (NAS) file system.</p>
     * 
     * @param request ModifyNASDefaultMountTargetRequest
     * @return ModifyNASDefaultMountTargetResponse
     */
    public ModifyNASDefaultMountTargetResponse modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNASDefaultMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the bandwidth of a premium bandwidth plan.</p>
     * 
     * @param request ModifyNetworkPackageBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNetworkPackageBandwidthResponse
     */
    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidthWithOptions(ModifyNetworkPackageBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkPackageBandwidth"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkPackageBandwidthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the bandwidth of a premium bandwidth plan.</p>
     * 
     * @param request ModifyNetworkPackageBandwidthRequest
     * @return ModifyNetworkPackageBandwidthResponse
     */
    public ModifyNetworkPackageBandwidthResponse modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkPackageBandwidthWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to temporarily disable the Internet access of your cloud computer after the Internet access is enabled for your cloud computer, you can disable the premium bandwidth plan and restore it as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores or disables a premium bandwidth plan.</p>
     * 
     * @param request ModifyNetworkPackageEnabledRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNetworkPackageEnabledResponse
     */
    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabledWithOptions(ModifyNetworkPackageEnabledRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkPackageEnabled"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkPackageEnabledResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you want to temporarily disable the Internet access of your cloud computer after the Internet access is enabled for your cloud computer, you can disable the premium bandwidth plan and restore it as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores or disables a premium bandwidth plan.</p>
     * 
     * @param request ModifyNetworkPackageEnabledRequest
     * @return ModifyNetworkPackageEnabledResponse
     */
    public ModifyNetworkPackageEnabledResponse modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkPackageEnabledWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic properties of an office network, including the name and local administrator permission settings.</p>
     * 
     * @param request ModifyOfficeSiteAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfficeSiteAttributeResponse
     */
    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttributeWithOptions(ModifyOfficeSiteAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAccessType)) {
            query.put("DesktopAccessType", request.desktopAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAdminAccess)) {
            query.put("EnableAdminAccess", request.enableAdminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyLoginRisk)) {
            query.put("NeedVerifyLoginRisk", request.needVerifyLoginRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needVerifyZeroDevice)) {
            query.put("NeedVerifyZeroDevice", request.needVerifyZeroDevice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteName)) {
            query.put("OfficeSiteName", request.officeSiteName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteAttribute"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic properties of an office network, including the name and local administrator permission settings.</p>
     * 
     * @param request ModifyOfficeSiteAttributeRequest
     * @return ModifyOfficeSiteAttributeResponse
     */
    public ModifyOfficeSiteAttributeResponse modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOfficeSiteAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the communication between cloud computers in an office network (formerly workspace). If you enable the communication between cloud computers in an office network, the cloud computers can access each other.</p>
     * 
     * @param request ModifyOfficeSiteCrossDesktopAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfficeSiteCrossDesktopAccessResponse
     */
    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccessWithOptions(ModifyOfficeSiteCrossDesktopAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCrossDesktopAccess)) {
            query.put("EnableCrossDesktopAccess", request.enableCrossDesktopAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteCrossDesktopAccess"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteCrossDesktopAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the communication between cloud computers in an office network (formerly workspace). If you enable the communication between cloud computers in an office network, the cloud computers can access each other.</p>
     * 
     * @param request ModifyOfficeSiteCrossDesktopAccessRequest
     * @return ModifyOfficeSiteCrossDesktopAccessResponse
     */
    public ModifyOfficeSiteCrossDesktopAccessResponse modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOfficeSiteCrossDesktopAccessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables multi-factor authentication (MFA) for an enterprise Active Directory (AD) office network (formerly workspace).</p>
     * 
     * @param request ModifyOfficeSiteMfaEnabledRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOfficeSiteMfaEnabledResponse
     */
    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabledWithOptions(ModifyOfficeSiteMfaEnabledRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mfaEnabled)) {
            query.put("MfaEnabled", request.mfaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOfficeSiteMfaEnabled"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOfficeSiteMfaEnabledResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables multi-factor authentication (MFA) for an enterprise Active Directory (AD) office network (formerly workspace).</p>
     * 
     * @param request ModifyOfficeSiteMfaEnabledRequest
     * @return ModifyOfficeSiteMfaEnabledResponse
     */
    public ModifyOfficeSiteMfaEnabledResponse modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOfficeSiteMfaEnabledWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a policy.</p>
     * 
     * @param request ModifyPolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyGroupResponse
     */
    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminAccess)) {
            query.put("AdminAccess", request.adminAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appContentProtection)) {
            query.put("AppContentProtection", request.appContentProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeAccessPolicyRule)) {
            query.put("AuthorizeAccessPolicyRule", request.authorizeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeSecurityPolicyRule)) {
            query.put("AuthorizeSecurityPolicyRule", request.authorizeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            query.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            query.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveRule)) {
            query.put("DomainResolveRule", request.domainResolveRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveRuleType)) {
            query.put("DomainResolveRuleType", request.domainResolveRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserApplyAdminCoordinate)) {
            query.put("EndUserApplyAdminCoordinate", request.endUserApplyAdminCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserGroupCoordinate)) {
            query.put("EndUserGroupCoordinate", request.endUserGroupCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5Access)) {
            query.put("Html5Access", request.html5Access);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            query.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetCommunicationProtocol)) {
            query.put("InternetCommunicationProtocol", request.internetCommunicationProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            query.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxReconnectTime)) {
            query.put("MaxReconnectTime", request.maxReconnectTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netRedirect)) {
            query.put("NetRedirect", request.netRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLogin)) {
            query.put("PreemptLogin", request.preemptLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preemptLoginUser)) {
            query.put("PreemptLoginUser", request.preemptLoginUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.printerRedirection)) {
            query.put("PrinterRedirection", request.printerRedirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordContent)) {
            query.put("RecordContent", request.recordContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordContentExpires)) {
            query.put("RecordContentExpires", request.recordContentExpires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recording)) {
            query.put("Recording", request.recording);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingAudio)) {
            query.put("RecordingAudio", request.recordingAudio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingDuration)) {
            query.put("RecordingDuration", request.recordingDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingEndTime)) {
            query.put("RecordingEndTime", request.recordingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingExpires)) {
            query.put("RecordingExpires", request.recordingExpires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingFps)) {
            query.put("RecordingFps", request.recordingFps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingStartTime)) {
            query.put("RecordingStartTime", request.recordingStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingUserNotify)) {
            query.put("RecordingUserNotify", request.recordingUserNotify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordingUserNotifyMessage)) {
            query.put("RecordingUserNotifyMessage", request.recordingUserNotifyMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remoteCoordinate)) {
            query.put("RemoteCoordinate", request.remoteCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeAccessPolicyRule)) {
            query.put("RevokeAccessPolicyRule", request.revokeAccessPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeSecurityPolicyRule)) {
            query.put("RevokeSecurityPolicyRule", request.revokeSecurityPolicyRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeValue)) {
            query.put("ScopeValue", request.scopeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbRedirect)) {
            query.put("UsbRedirect", request.usbRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usbSupplyRedirectRule)) {
            query.put("UsbSupplyRedirectRule", request.usbSupplyRedirectRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoRedirect)) {
            query.put("VideoRedirect", request.videoRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visualQuality)) {
            query.put("VisualQuality", request.visualQuality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermark)) {
            query.put("Watermark", request.watermark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkAntiCam)) {
            query.put("WatermarkAntiCam", request.watermarkAntiCam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkColor)) {
            query.put("WatermarkColor", request.watermarkColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkDegree)) {
            query.put("WatermarkDegree", request.watermarkDegree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFontSize)) {
            query.put("WatermarkFontSize", request.watermarkFontSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkFontStyle)) {
            query.put("WatermarkFontStyle", request.watermarkFontStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkPower)) {
            query.put("WatermarkPower", request.watermarkPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkRowAmount)) {
            query.put("WatermarkRowAmount", request.watermarkRowAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkSecurity)) {
            query.put("WatermarkSecurity", request.watermarkSecurity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparency)) {
            query.put("WatermarkTransparency", request.watermarkTransparency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkTransparencyValue)) {
            query.put("WatermarkTransparencyValue", request.watermarkTransparencyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkType)) {
            query.put("WatermarkType", request.watermarkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a policy.</p>
     * 
     * @param request ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     */
    public ModifyPolicyGroupResponse modifyPolicyGroup(ModifyPolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify end users only for cloud computers that are in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions on cloud desktops to end users, or revokes the permissions from the end users.</p>
     * 
     * @param request ModifyUserEntitlementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserEntitlementResponse
     */
    public ModifyUserEntitlementResponse modifyUserEntitlementWithOptions(ModifyUserEntitlementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizeDesktopId)) {
            query.put("AuthorizeDesktopId", request.authorizeDesktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revokeDesktopId)) {
            query.put("RevokeDesktopId", request.revokeDesktopId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserEntitlement"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserEntitlementResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify end users only for cloud computers that are in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants permissions on cloud desktops to end users, or revokes the permissions from the end users.</p>
     * 
     * @param request ModifyUserEntitlementRequest
     * @return ModifyUserEntitlementResponse
     */
    public ModifyUserEntitlementResponse modifyUserEntitlement(ModifyUserEntitlementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserEntitlementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the end users of a cloud computer pool into new end users.</p>
     * 
     * @param request ModifyUserToDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserToDesktopGroupResponse
     */
    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroupWithOptions(ModifyUserToDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEndUserIds)) {
            query.put("NewEndUserIds", request.newEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldEndUserIds)) {
            query.put("OldEndUserIds", request.oldEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserToDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserToDesktopGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the end users of a cloud computer pool into new end users.</p>
     * 
     * @param request ModifyUserToDesktopGroupRequest
     * @return ModifyUserToDesktopGroupResponse
     */
    public ModifyUserToDesktopGroupResponse modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserToDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Move files or folders.</p>
     * 
     * @param request MoveCdsFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveCdsFileResponse
     */
    public MoveCdsFileResponse moveCdsFileWithOptions(MoveCdsFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictPolicy)) {
            query.put("ConflictPolicy", request.conflictPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveCdsFile"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveCdsFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Move files or folders.</p>
     * 
     * @param request MoveCdsFileRequest
     * @return MoveCdsFileResponse
     */
    public MoveCdsFileResponse moveCdsFile(MoveCdsFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveCdsFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to restart must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Restart cloud computers.</p>
     * 
     * @param request RebootDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootDesktopsResponse
     */
    public RebootDesktopsResponse rebootDesktopsWithOptions(RebootDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to restart must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Restart cloud computers.</p>
     * 
     * @param request RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    public RebootDesktopsResponse rebootDesktops(RebootDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you change the image of a cloud computer, take note of the following limits:</p>
     * <ul>
     * <li>You can select an image whose OS is different from the OS of the original image. The image change feature is not supported in the following regions: China (Hong Kong), Australia (Sydney), Singapore, and Japan (Tokyo).</li>
     * <li>GPU images and non-GPU images cannot be exchanged. Graphical cloud computers can only use GPU-accelerated images. Non-graphical cloud computers can only use non-GPU-accelerated images.
     * After the image is changed, the system uses the new image to initialize the system disk of the cloud computer. This has the following impacts:</li>
     * <li>Data in the system disk of the original cloud computer is cleared. Snapshots that are created based on the system disk of the original cloud computer can no longer be used. The system automatically deletes the snapshots.</li>
     * <li>If the OS of the image is changed, the data in the data disks of the original cloud computer is cleared, and the snapshots that are created based on the data disks of the original cloud computer can no longer be used. The system automatically deletes the snapshots. If the OS of the image is not changed, the data in the data disks of the original cloud computer is retained, and the snapshots that are created based on the data disks of the original cloud computer can still be used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recreates cloud computers.</p>
     * 
     * @param request RebuildDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebuildDesktopsResponse
     */
    public RebuildDesktopsResponse rebuildDesktopsWithOptions(RebuildDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebuildDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebuildDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you change the image of a cloud computer, take note of the following limits:</p>
     * <ul>
     * <li>You can select an image whose OS is different from the OS of the original image. The image change feature is not supported in the following regions: China (Hong Kong), Australia (Sydney), Singapore, and Japan (Tokyo).</li>
     * <li>GPU images and non-GPU images cannot be exchanged. Graphical cloud computers can only use GPU-accelerated images. Non-graphical cloud computers can only use non-GPU-accelerated images.
     * After the image is changed, the system uses the new image to initialize the system disk of the cloud computer. This has the following impacts:</li>
     * <li>Data in the system disk of the original cloud computer is cleared. Snapshots that are created based on the system disk of the original cloud computer can no longer be used. The system automatically deletes the snapshots.</li>
     * <li>If the OS of the image is changed, the data in the data disks of the original cloud computer is cleared, and the snapshots that are created based on the data disks of the original cloud computer can no longer be used. The system automatically deletes the snapshots. If the OS of the image is not changed, the data in the data disks of the original cloud computer is retained, and the snapshots that are created based on the data disks of the original cloud computer can still be used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Recreates cloud computers.</p>
     * 
     * @param request RebuildDesktopsRequest
     * @return RebuildDesktopsResponse
     */
    public RebuildDesktopsResponse rebuildDesktops(RebuildDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebuildDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the file sharing feature of a folder in a cloud disk.</p>
     * 
     * @param tmpReq RemoveFilePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFilePermissionResponse
     */
    public RemoveFilePermissionResponse removeFilePermissionWithOptions(RemoveFilePermissionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveFilePermissionShrinkRequest request = new RemoveFilePermissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.memberList)) {
            request.memberListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.memberList, "MemberList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cdsId)) {
            query.put("CdsId", request.cdsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberListShrink)) {
            query.put("MemberList", request.memberListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFilePermission"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFilePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the file sharing feature of a folder in a cloud disk.</p>
     * 
     * @param request RemoveFilePermissionRequest
     * @return RemoveFilePermissionResponse
     */
    public RemoveFilePermissionResponse removeFilePermission(RemoveFilePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFilePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes authorized users of cloud computer pools. The removed users can no longer connect to cloud computers in the cloud computer pool.</p>
     * 
     * @param request RemoveUserFromDesktopGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromDesktopGroupResponse
     */
    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroupWithOptions(RemoveUserFromDesktopGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIds)) {
            query.put("DesktopGroupIds", request.desktopGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromDesktopGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromDesktopGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes authorized users of cloud computer pools. The removed users can no longer connect to cloud computers in the cloud computer pool.</p>
     * 
     * @param request RemoveUserFromDesktopGroupRequest
     * @return RemoveUserFromDesktopGroupResponse
     */
    public RemoveUserFromDesktopGroupResponse removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromDesktopGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除超卖用户组用户</p>
     * 
     * @param request RemoveUserFromDesktopOversoldUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromDesktopOversoldUserGroupResponse
     */
    public RemoveUserFromDesktopOversoldUserGroupResponse removeUserFromDesktopOversoldUserGroupWithOptions(RemoveUserFromDesktopOversoldUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDesktopId)) {
            query.put("UserDesktopId", request.userDesktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromDesktopOversoldUserGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromDesktopOversoldUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除超卖用户组用户</p>
     * 
     * @param request RemoveUserFromDesktopOversoldUserGroupRequest
     * @return RemoveUserFromDesktopOversoldUserGroupResponse
     */
    public RemoveUserFromDesktopOversoldUserGroupResponse removeUserFromDesktopOversoldUserGroup(RemoveUserFromDesktopOversoldUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromDesktopOversoldUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>续费桌面超卖组</p>
     * 
     * @param request RenewDesktopOversoldGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewDesktopOversoldGroupResponse
     */
    public RenewDesktopOversoldGroupResponse renewDesktopOversoldGroupWithOptions(RenewDesktopOversoldGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.oversoldGroupId)) {
            query.put("OversoldGroupId", request.oversoldGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewDesktopOversoldGroup"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDesktopOversoldGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>续费桌面超卖组</p>
     * 
     * @param request RenewDesktopOversoldGroupRequest
     * @return RenewDesktopOversoldGroupResponse
     */
    public RenewDesktopOversoldGroupResponse renewDesktopOversoldGroup(RenewDesktopOversoldGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewDesktopOversoldGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renew subscription cloud computers.</p>
     * 
     * @param request RenewDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewDesktopsResponse
     */
    public RenewDesktopsResponse renewDesktopsWithOptions(RenewDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewDesktopsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renew subscription cloud computers.</p>
     * 
     * @param request RenewDesktopsRequest
     * @return RenewDesktopsResponse
     */
    public RenewDesktopsResponse renewDesktops(RenewDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews premium bandwidth plans.</p>
     * 
     * @param request RenewNetworkPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewNetworkPackagesResponse
     */
    public RenewNetworkPackagesResponse renewNetworkPackagesWithOptions(RenewNetworkPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPackageId)) {
            query.put("NetworkPackageId", request.networkPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewNetworkPackages"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewNetworkPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews premium bandwidth plans.</p>
     * 
     * @param request RenewNetworkPackagesRequest
     * @return RenewNetworkPackagesResponse
     */
    public RenewNetworkPackagesResponse renewNetworkPackages(RenewNetworkPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewNetworkPackagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to reset only cloud computers in a cloud computer pool.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets cloud computers.</p>
     * 
     * @param request ResetDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDesktopsResponse
     */
    public ResetDesktopsResponse resetDesktopsWithOptions(ResetDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupIds)) {
            query.put("DesktopGroupIds", request.desktopGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetScope)) {
            query.put("ResetScope", request.resetScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to reset only cloud computers in a cloud computer pool.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets cloud computers.</p>
     * 
     * @param request ResetDesktopsRequest
     * @return ResetDesktopsResponse
     */
    public ResetDesktopsResponse resetDesktops(ResetDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, you do not need to modify the mount target of the NAS file system. If the mount target is disabled, you need to reset the mount target of the NAS file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the mount target of an Apsara File Storage NAS (NAS) file system.</p>
     * 
     * @param request ResetNASDefaultMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetNASDefaultMountTargetResponse
     */
    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTargetWithOptions(ResetNASDefaultMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetNASDefaultMountTarget"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetNASDefaultMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, you do not need to modify the mount target of the NAS file system. If the mount target is disabled, you need to reset the mount target of the NAS file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the mount target of an Apsara File Storage NAS (NAS) file system.</p>
     * 
     * @param request ResetNASDefaultMountTargetRequest
     * @return ResetNASDefaultMountTargetResponse
     */
    public ResetNASDefaultMountTargetResponse resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetNASDefaultMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following operations are performed:</p>
     * <ul>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p>The disk restoration operation is irreversible. After you call this operation, the disk is restored to the status at the point in time when the snapshot was created. Data that is generated between the snapshot creation time and the current time is lost. Before you restore the disk based on the snapshot, make sure that you back up data.</p>
     * </blockquote>
     * </li>
     * <li>The cloud computer to which the disk belongs is stopped.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores the data of a disk from a snapshot.</p>
     * 
     * @param request ResetSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetSnapshotResponse
     */
    public ResetSnapshotResponse resetSnapshotWithOptions(ResetSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSnapshot"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following operations are performed:</p>
     * <ul>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p>The disk restoration operation is irreversible. After you call this operation, the disk is restored to the status at the point in time when the snapshot was created. Data that is generated between the snapshot creation time and the current time is lost. Before you restore the disk based on the snapshot, make sure that you back up data.</p>
     * </blockquote>
     * </li>
     * <li>The cloud computer to which the disk belongs is stopped.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores the data of a disk from a snapshot.</p>
     * 
     * @param request ResetSnapshotRequest
     * @return ResetSnapshotResponse
     */
    public ResetSnapshotResponse resetSnapshot(ResetSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the coordinate permissions.</p>
     * 
     * @param request RevokeCoordinatePrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeCoordinatePrivilegeResponse
     */
    public RevokeCoordinatePrivilegeResponse revokeCoordinatePrivilegeWithOptions(RevokeCoordinatePrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coId)) {
            query.put("CoId", request.coId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeCoordinatePrivilege"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeCoordinatePrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the coordinate permissions.</p>
     * 
     * @param request RevokeCoordinatePrivilegeRequest
     * @return RevokeCoordinatePrivilegeResponse
     */
    public RevokeCoordinatePrivilegeResponse revokeCoordinatePrivilege(RevokeCoordinatePrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeCoordinatePrivilegeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the RunCommand operation to run scripts only on Windows cloud desktops.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs a PowerShell or batch (.bat) script on Windows cloud desktops.</p>
     * 
     * @param request RunCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandContent)) {
            query.put("CommandContent", request.commandContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentEncoding)) {
            query.put("ContentEncoding", request.contentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use the RunCommand operation to run scripts only on Windows cloud desktops.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs a PowerShell or batch (.bat) script on Windows cloud desktops.</p>
     * 
     * @param request RunCommandRequest
     * @return RunCommandResponse
     */
    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must call this operation to obtain the verification code that is required when you bind an advanced office network to a CEN instance that belongs to another Alibaba Cloud account. After you call this operation, the system sends a verification code to the email address associated with the Alibaba Cloud account to which the CEN instance belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the verification code that is required when you bind an advanced office network to a Cloud Enterprise Network (CEN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request SendVerifyCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendVerifyCodeResponse
     */
    public SendVerifyCodeResponse sendVerifyCodeWithOptions(SendVerifyCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCodeAction)) {
            query.put("VerifyCodeAction", request.verifyCodeAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerifyCode"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerifyCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must call this operation to obtain the verification code that is required when you bind an advanced office network to a CEN instance that belongs to another Alibaba Cloud account. After you call this operation, the system sends a verification code to the email address associated with the Alibaba Cloud account to which the CEN instance belongs.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the verification code that is required when you bind an advanced office network to a Cloud Enterprise Network (CEN) instance that belongs to another Alibaba Cloud account.</p>
     * 
     * @param request SendVerifyCodeRequest
     * @return SendVerifyCodeResponse
     */
    public SendVerifyCodeResponse sendVerifyCode(SendVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerifyCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an auto scaling policy for a multi-session cloud computer. Elastic Desktop Service allows multiple end users to share a cloud computer in a multi-session cloud computer pool. This helps save costs.</p>
     * 
     * @param request SetDesktopGroupScaleTimerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDesktopGroupScaleTimerResponse
     */
    public SetDesktopGroupScaleTimerResponse setDesktopGroupScaleTimerWithOptions(SetDesktopGroupScaleTimerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleTimerInfos)) {
            query.put("ScaleTimerInfos", request.scaleTimerInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDesktopGroupScaleTimer"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDesktopGroupScaleTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an auto scaling policy for a multi-session cloud computer. Elastic Desktop Service allows multiple end users to share a cloud computer in a multi-session cloud computer pool. This helps save costs.</p>
     * 
     * @param request SetDesktopGroupScaleTimerRequest
     * @return SetDesktopGroupScaleTimerResponse
     */
    public SetDesktopGroupScaleTimerResponse setDesktopGroupScaleTimer(SetDesktopGroupScaleTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDesktopGroupScaleTimerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a scheduled task for a cloud computer pool, such as starting, stopping, restarting or resting cloud computers in the pool.</p>
     * 
     * @param request SetDesktopGroupTimerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDesktopGroupTimerResponse
     */
    public SetDesktopGroupTimerResponse setDesktopGroupTimerWithOptions(SetDesktopGroupTimerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timerType)) {
            query.put("TimerType", request.timerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDesktopGroupTimer"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDesktopGroupTimerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a scheduled task for a cloud computer pool, such as starting, stopping, restarting or resting cloud computers in the pool.</p>
     * 
     * @param request SetDesktopGroupTimerRequest
     * @return SetDesktopGroupTimerResponse
     */
    public SetDesktopGroupTimerResponse setDesktopGroupTimer(SetDesktopGroupTimerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDesktopGroupTimerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a scheduled task for a cloud computer pool. For example, you enable or disable the scheduled task.</p>
     * 
     * @param request SetDesktopGroupTimerStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDesktopGroupTimerStatusResponse
     */
    public SetDesktopGroupTimerStatusResponse setDesktopGroupTimerStatusWithOptions(SetDesktopGroupTimerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timerType)) {
            query.put("TimerType", request.timerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDesktopGroupTimerStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDesktopGroupTimerStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a scheduled task for a cloud computer pool. For example, you enable or disable the scheduled task.</p>
     * 
     * @param request SetDesktopGroupTimerStatusRequest
     * @return SetDesktopGroupTimerStatusResponse
     */
    public SetDesktopGroupTimerStatusResponse setDesktopGroupTimerStatus(SetDesktopGroupTimerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDesktopGroupTimerStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置桌面维护模式</p>
     * 
     * @param request SetDesktopMaintenanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDesktopMaintenanceResponse
     */
    public SetDesktopMaintenanceResponse setDesktopMaintenanceWithOptions(SetDesktopMaintenanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDesktopMaintenance"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDesktopMaintenanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置桌面维护模式</p>
     * 
     * @param request SetDesktopMaintenanceRequest
     * @return SetDesktopMaintenanceResponse
     */
    public SetDesktopMaintenanceResponse setDesktopMaintenance(SetDesktopMaintenanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDesktopMaintenanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for AD directories, not for RAM directories.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the single sign-on (SSO) status of an Active Directory (AD) directory.</p>
     * 
     * @param request SetDirectorySsoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDirectorySsoStatusResponse
     */
    public SetDirectorySsoStatusResponse setDirectorySsoStatusWithOptions(SetDirectorySsoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSso)) {
            query.put("EnableSso", request.enableSso);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDirectorySsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDirectorySsoStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for AD directories, not for RAM directories.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the single sign-on (SSO) status of an Active Directory (AD) directory.</p>
     * 
     * @param request SetDirectorySsoStatusRequest
     * @return SetDirectorySsoStatusResponse
     */
    public SetDirectorySsoStatusResponse setDirectorySsoStatus(SetDirectorySsoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDirectorySsoStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads the metadata of a Security Assertion Markup Language (SAML) 2.0-based identity provider (IdP).</p>
     * 
     * @param request SetIdpMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdpMetadataResponse
     */
    public SetIdpMetadataResponse setIdpMetadataWithOptions(SetIdpMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpMetadata)) {
            query.put("IdpMetadata", request.idpMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdpMetadata"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdpMetadataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads the metadata of a Security Assertion Markup Language (SAML) 2.0-based identity provider (IdP).</p>
     * 
     * @param request SetIdpMetadataRequest
     * @return SetIdpMetadataResponse
     */
    public SetIdpMetadataResponse setIdpMetadata(SetIdpMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdpMetadataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables single sign-on (SSO) for a workspace.</p>
     * 
     * @param request SetOfficeSiteSsoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetOfficeSiteSsoStatusResponse
     */
    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatusWithOptions(SetOfficeSiteSsoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableSso)) {
            query.put("EnableSso", request.enableSso);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetOfficeSiteSsoStatus"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetOfficeSiteSsoStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables single sign-on (SSO) for a workspace.</p>
     * 
     * @param request SetOfficeSiteSsoStatusRequest
     * @return SetOfficeSiteSsoStatusResponse
     */
    public SetOfficeSiteSsoStatusResponse setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setOfficeSiteSsoStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures directories in the blacklist and whitelist based on the user profile management (UPM) feature.</p>
     * 
     * @param tmpReq SetUserProfilePathRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserProfilePathRulesResponse
     */
    public SetUserProfilePathRulesResponse setUserProfilePathRulesWithOptions(SetUserProfilePathRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetUserProfilePathRulesShrinkRequest request = new SetUserProfilePathRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userProfilePathRule)) {
            request.userProfilePathRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userProfilePathRule, "UserProfilePathRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProfilePathRuleShrink)) {
            query.put("UserProfilePathRule", request.userProfilePathRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProfileRuleType)) {
            query.put("UserProfileRuleType", request.userProfileRuleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserProfilePathRules"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserProfilePathRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures directories in the blacklist and whitelist based on the user profile management (UPM) feature.</p>
     * 
     * @param request SetUserProfilePathRulesRequest
     * @return SetUserProfilePathRulesResponse
     */
    public SetUserProfilePathRulesResponse setUserProfilePathRules(SetUserProfilePathRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserProfilePathRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to start must be in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts stopped cloud computers. After the API operation is successfully called, the cloud computers enter the Running state.</p>
     * 
     * @param request StartDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDesktopsResponse
     */
    public StartDesktopsResponse startDesktopsWithOptions(StartDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to start must be in the Stopped state.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts stopped cloud computers. After the API operation is successfully called, the cloud computers enter the Running state.</p>
     * 
     * @param request StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    public StartDesktopsResponse startDesktops(StartDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to stop must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop cloud computers that are in the Running state. After the operation is successfully called, the cloud computers enter the Stopped state.</p>
     * 
     * @param request StopDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDesktopsResponse
     */
    public StopDesktopsResponse stopDesktopsWithOptions(StopDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stoppedMode)) {
            query.put("StoppedMode", request.stoppedMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDesktopsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to stop must be in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop cloud computers that are in the Running state. After the operation is successfully called, the cloud computers enter the Stopped state.</p>
     * 
     * @param request StopDesktopsRequest
     * @return StopDesktopsResponse
     */
    public StopDesktopsResponse stopDesktops(StopDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDesktopsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you stop a one-time execution of a command, the command continues to run on the cloud desktops where it has started to run, and will not run on the cloud desktops where it has not started to run.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a Cloud Assistant command that is running on one or more cloud desktops.</p>
     * 
     * @param request StopInvocationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInvocationResponse
     */
    public StopInvocationResponse stopInvocationWithOptions(StopInvocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInvocation"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInvocationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you stop a one-time execution of a command, the command continues to run on the cloud desktops where it has started to run, and will not run on the cloud desktops where it has not started to run.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a Cloud Assistant command that is running on one or more cloud desktops.</p>
     * 
     * @param request StopInvocationRequest
     * @return StopInvocationResponse
     */
    public StopInvocationResponse stopInvocation(StopInvocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInvocationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If TagKey is specified, the new TagValue value overrides the original TagValue value.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to cloud computers. This allows you to filter and manage cloud computers by tag.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>If TagKey is specified, the new TagValue value overrides the original TagValue value.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to cloud computers. This allows you to filter and manage cloud computers by tag.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑用户桌面</p>
     * 
     * @param request UnbindUserDesktopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindUserDesktopResponse
     */
    public UnbindUserDesktopResponse unbindUserDesktopWithOptions(UnbindUserDesktopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopAgentIds)) {
            query.put("DesktopAgentIds", request.desktopAgentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopGroupId)) {
            query.put("DesktopGroupId", request.desktopGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDesktopIds)) {
            query.put("UserDesktopIds", request.userDesktopIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindUserDesktop"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindUserDesktopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑用户桌面</p>
     * 
     * @param request UnbindUserDesktopRequest
     * @return UnbindUserDesktopResponse
     */
    public UnbindUserDesktopResponse unbindUserDesktop(UnbindUserDesktopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindUserDesktopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a virtual multi-factor authentication (MFA) device that is in the LOCKED state.</p>
     * 
     * @param request UnlockVirtualMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockVirtualMFADeviceResponse
     */
    public UnlockVirtualMFADeviceResponse unlockVirtualMFADeviceWithOptions(UnlockVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockVirtualMFADevice"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockVirtualMFADeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a virtual multi-factor authentication (MFA) device that is in the LOCKED state.</p>
     * 
     * @param request UnlockVirtualMFADeviceRequest
     * @return UnlockVirtualMFADeviceResponse
     */
    public UnlockVirtualMFADeviceResponse unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockVirtualMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from cloud computers. After you remove a tag, if the tag is not added to a cloud computer, the tag is automatically deleted.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from cloud computers. After you remove a tag, if the tag is not added to a cloud computer, the tag is automatically deleted.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to manage each image update task. This operation is valid only when the auto-update switch in the image update module for global image updates is turned off. If the auto-update switch is turned on, the switches for each image update task are always turned on. If you want to turn on or off the auto-update switch, go to the Elastic Desktop Service console and choose <strong>Operations &gt; Image Updates</strong> in the left-side navigation pane.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the auto-push feature for an image update task.</p>
     * 
     * @param request UpdateFotaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFotaTaskResponse
     */
    public UpdateFotaTaskResponse updateFotaTaskWithOptions(UpdateFotaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUid)) {
            query.put("TaskUid", request.taskUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            query.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFotaTask"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFotaTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to manage each image update task. This operation is valid only when the auto-update switch in the image update module for global image updates is turned off. If the auto-update switch is turned on, the switches for each image update task are always turned on. If you want to turn on or off the auto-update switch, go to the Elastic Desktop Service console and choose <strong>Operations &gt; Image Updates</strong> in the left-side navigation pane.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the auto-push feature for an image update task.</p>
     * 
     * @param request UpdateFotaTaskRequest
     * @return UpdateFotaTaskResponse
     */
    public UpdateFotaTaskResponse updateFotaTask(UpdateFotaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFotaTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can upload only Windows images.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Uploads your custom Windows image.</p>
     * 
     * @param request UploadImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadImageResponse
     */
    public UploadImageResponse uploadImageWithOptions(UploadImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSecurityCheck)) {
            query.put("EnableSecurityCheck", request.enableSecurityCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuCategory)) {
            query.put("GpuCategory", request.gpuCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverType)) {
            query.put("GpuDriverType", request.gpuDriverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseType)) {
            query.put("LicenseType", request.licenseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectPath)) {
            query.put("OssObjectPath", request.ossObjectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadImage"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadImageResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can upload only Windows images.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Uploads your custom Windows image.</p>
     * 
     * @param request UploadImageRequest
     * @return UploadImageResponse
     */
    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the ID of a Cloud Enterprise Network (CEN) instance and the ID of the Alibaba Cloud account to which the instance belongs and checks whether a CIDR block conflict exists between the routes of the instance and the IPv4 CIDR blocks of the associated office network.</p>
     * 
     * @param request VerifyCenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyCenResponse
     */
    public VerifyCenResponse verifyCenWithOptions(VerifyCenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            query.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyCen"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyCenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies the ID of a Cloud Enterprise Network (CEN) instance and the ID of the Alibaba Cloud account to which the instance belongs and checks whether a CIDR block conflict exists between the routes of the instance and the IPv4 CIDR blocks of the associated office network.</p>
     * 
     * @param request VerifyCenRequest
     * @return VerifyCenResponse
     */
    public VerifyCenResponse verifyCen(VerifyCenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyCenWithOptions(request, runtime);
    }

    /**
     * @param request WakeupDesktopsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WakeupDesktopsResponse
     */
    public WakeupDesktopsResponse wakeupDesktopsWithOptions(WakeupDesktopsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desktopId)) {
            query.put("DesktopId", request.desktopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WakeupDesktops"),
            new TeaPair("version", "2020-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WakeupDesktopsResponse());
    }

    /**
     * @param request WakeupDesktopsRequest
     * @return WakeupDesktopsResponse
     */
    public WakeupDesktopsResponse wakeupDesktops(WakeupDesktopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.wakeupDesktopsWithOptions(request, runtime);
    }
}
