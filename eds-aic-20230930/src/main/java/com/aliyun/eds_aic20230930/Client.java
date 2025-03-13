// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930;

import com.aliyun.tea.*;
import com.aliyun.eds_aic20230930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eds-aic", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  You can attach to an ADB key pair only to cloud phone instances in the Running state.</p>
     * <ul>
     * <li>After you attach an ADB key pair, make sure the private key of the ADB key pair is copied to the ~/.android directory (macOS or Linux operating systems) or the C:\Users\Username.android directory (Windows operating systems). In addition, you must run the adb kill-server command to restart the ADB process to ensure correct ADB connection. Otherwise, ADB connection may fail due to authentication exceptions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an Android Debug Bridge (ADB) key pair to one or more cloud phone instances.</p>
     * 
     * @param request AttachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPairWithOptions(AttachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AttachKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AttachKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can attach to an ADB key pair only to cloud phone instances in the Running state.</p>
     * <ul>
     * <li>After you attach an ADB key pair, make sure the private key of the ADB key pair is copied to the ~/.android directory (macOS or Linux operating systems) or the C:\Users\Username.android directory (Windows operating systems). In addition, you must run the adb kill-server command to restart the ADB process to ensure correct ADB connection. Otherwise, ADB connection may fail due to authentication exceptions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches an Android Debug Bridge (ADB) key pair to one or more cloud phone instances.</p>
     * 
     * @param request AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    public AttachKeyPairResponse attachKeyPair(AttachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Instance states that support user assignment: Available, Shutting Down, Stopped, Starting, Backing Up, Restoring, Backup Failed, Restore Failed.
     * Instance states that support unassignment: Available, Shutting Down, Stopped, Starting, Backing Up, Restoring, Backup Failed, Restore Failed, Expired, Overdue, Deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorize/unauthorize Android instances for users.</p>
     * 
     * @param request AuthorizeAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeAndroidInstanceResponse
     */
    public AuthorizeAndroidInstanceResponse authorizeAndroidInstanceWithOptions(AuthorizeAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserId)) {
            query.put("AuthorizeUserId", request.authorizeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserId)) {
            query.put("UnAuthorizeUserId", request.unAuthorizeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeAndroidInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AuthorizeAndroidInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Instance states that support user assignment: Available, Shutting Down, Stopped, Starting, Backing Up, Restoring, Backup Failed, Restore Failed.
     * Instance states that support unassignment: Available, Shutting Down, Stopped, Starting, Backing Up, Restoring, Backup Failed, Restore Failed, Expired, Overdue, Deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorize/unauthorize Android instances for users.</p>
     * 
     * @param request AuthorizeAndroidInstanceRequest
     * @return AuthorizeAndroidInstanceResponse
     */
    public AuthorizeAndroidInstanceResponse authorizeAndroidInstance(AuthorizeAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to upload only backup files generated by cloud phones to Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates and uploads backup files.</p>
     * 
     * @param request BackupFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackupFileResponse
     */
    public BackupFileResponse backupFileWithOptions(BackupFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupAll)) {
            query.put("BackupAll", request.backupAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileName)) {
            query.put("BackupFileName", request.backupFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFilePath)) {
            query.put("BackupFilePath", request.backupFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceAppList)) {
            query.put("SourceAppList", request.sourceAppList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePathList)) {
            query.put("SourceFilePathList", request.sourceFilePathList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackupFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BackupFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BackupFileResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to upload only backup files generated by cloud phones to Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates and uploads backup files.</p>
     * 
     * @param request BackupFileRequest
     * @return BackupFileResponse
     */
    public BackupFileResponse backupFile(BackupFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.backupFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves connection tickets in bulk.</p>
     * 
     * @param request BatchGetAcpConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetAcpConnectionTicketResponse
     */
    public BatchGetAcpConnectionTicketResponse batchGetAcpConnectionTicketWithOptions(BatchGetAcpConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTasks)) {
            query.put("InstanceTasks", request.instanceTasks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetAcpConnectionTicket"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetAcpConnectionTicketResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BatchGetAcpConnectionTicketResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves connection tickets in bulk.</p>
     * 
     * @param request BatchGetAcpConnectionTicketRequest
     * @return BatchGetAcpConnectionTicketResponse
     */
    public BatchGetAcpConnectionTicketResponse batchGetAcpConnectionTicket(BatchGetAcpConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetAcpConnectionTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check the resource inventory.</p>
     * 
     * @param request CheckResourceStockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResourceStockResponse
     */
    public CheckResourceStockResponse checkResourceStockWithOptions(CheckResourceStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acpSpecId)) {
            query.put("AcpSpecId", request.acpSpecId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourceStock"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourceStockResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckResourceStockResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Check the resource inventory.</p>
     * 
     * @param request CheckResourceStockRequest
     * @return CheckResourceStockResponse
     */
    public CheckResourceStockResponse checkResourceStock(CheckResourceStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResourceStockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before creating an instance group, ensure you understand the <a href="https://help.aliyun.com/document_detail/2807121.html">billing methods</a> supported by Cloud Phone.</p>
     * <ul>
     * <li>If the billing method of an instance group is PrePaid, AutoPay is set to false by default. In this case, you need to go to <a href="https://usercenter2-intl.aliyun.com/order/list">Expenses and Costs</a> to manually complete the payment.</li>
     * <li>You can also set AutoPay to true based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates pay-as-you-go or subscription instance groups.</p>
     * 
     * @param request CreateAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndroidInstanceGroupResponse
     */
    public CreateAndroidInstanceGroupResponse createAndroidInstanceGroupWithOptions(CreateAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIpv6)) {
            query.put("EnableIpv6", request.enableIpv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuAcceleration)) {
            query.put("GpuAcceleration", request.gpuAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupName)) {
            query.put("InstanceGroupName", request.instanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupSpec)) {
            query.put("InstanceGroupSpec", request.instanceGroupSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6Bandwidth)) {
            query.put("Ipv6Bandwidth", request.ipv6Bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfInstances)) {
            query.put("NumberOfInstances", request.numberOfInstances);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndroidInstanceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAndroidInstanceGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before creating an instance group, ensure you understand the <a href="https://help.aliyun.com/document_detail/2807121.html">billing methods</a> supported by Cloud Phone.</p>
     * <ul>
     * <li>If the billing method of an instance group is PrePaid, AutoPay is set to false by default. In this case, you need to go to <a href="https://usercenter2-intl.aliyun.com/order/list">Expenses and Costs</a> to manually complete the payment.</li>
     * <li>You can also set AutoPay to true based on your business requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates pay-as-you-go or subscription instance groups.</p>
     * 
     * @param request CreateAndroidInstanceGroupRequest
     * @return CreateAndroidInstanceGroupResponse
     */
    public CreateAndroidInstanceGroupResponse createAndroidInstanceGroup(CreateAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>Before you proceed, log on to the <a href="https://eds.console.aliyun.com/osshelp">Elastic Desktop Service (EDS) Enterprise console</a> and follow the on-screen instructions to upload the application file to Application Center to obtain the values of request parameters <code>FileName</code>, <code>FilePath</code>, and <code>OssAppUrl</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Android application.</p>
     * 
     * @param tmpReq CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppShrinkRequest request = new CreateAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customAppInfo)) {
            request.customAppInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customAppInfo, "CustomAppInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAppInfoShrink)) {
            query.put("CustomAppInfo", request.customAppInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            query.put("IconUrl", request.iconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installParam)) {
            query.put("InstallParam", request.installParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAppUrl)) {
            query.put("OssAppUrl", request.ossAppUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAppResponse());
        }

    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>Before you proceed, log on to the <a href="https://eds.console.aliyun.com/osshelp">Elastic Desktop Service (EDS) Enterprise console</a> and follow the on-screen instructions to upload the application file to Application Center to obtain the values of request parameters <code>FileName</code>, <code>FilePath</code>, and <code>OssAppUrl</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Android application.</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Custom Image</p>
     * 
     * @param request CreateCustomImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImageWithOptions(CreateCustomImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateCustomImageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Create Custom Image</p>
     * 
     * @param request CreateCustomImageRequest
     * @return CreateCustomImageResponse
     */
    public CreateCustomImageResponse createCustomImage(CreateCustomImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In addition to using the CreateKeyPair operation to generate a key pair, you can also create one by using the ADB tool and upload it to the Cloud Phone console. The usage of this key pair is identical to that of a system-generated key pair.
     * Each tenant can create up to 500 key pairs.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Android Debug Bridge (ADB) key pair. The system retains the public key and provides a PEM-encoded private key in PKCS#8 format, adhering to the ADB connection specification. You must securely store the private key.</p>
     * 
     * @param request CreateKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>In addition to using the CreateKeyPair operation to generate a key pair, you can also create one by using the ADB tool and upload it to the Cloud Phone console. The usage of this key pair is identical to that of a system-generated key pair.
     * Each tenant can create up to 500 key pairs.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Android Debug Bridge (ADB) key pair. The system retains the public key and provides a PEM-encoded private key in PKCS#8 format, adhering to the ADB connection specification. You must securely store the private key.</p>
     * 
     * @param request CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a policy.</p>
     * 
     * @param tmpReq CreatePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyGroupResponse
     */
    public CreatePolicyGroupResponse createPolicyGroupWithOptions(CreatePolicyGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePolicyGroupShrinkRequest request = new CreatePolicyGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.netRedirectPolicy)) {
            request.netRedirectPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.netRedirectPolicy, "NetRedirectPolicy", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            body.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            body.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            body.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            body.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockResolution)) {
            body.put("LockResolution", request.lockResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netRedirectPolicyShrink)) {
            body.put("NetRedirectPolicy", request.netRedirectPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionHeight)) {
            body.put("ResolutionHeight", request.resolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionWidth)) {
            body.put("ResolutionWidth", request.resolutionWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePolicyGroupResponse());
        }

    }

    /**
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
     * <p>You can call this operation to create a screenshot of a cloud phone instance and upload it to the default Object Storage Service (OSS) bucket. The operation returns a task ID, which you can use with the DescribeTasks operation to get the download link for the screenshot.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a screenshot of a cloud phone instance.</p>
     * 
     * @param request CreateScreenshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScreenshotResponse
     */
    public CreateScreenshotResponse createScreenshotWithOptions(CreateScreenshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipCheckPolicyConfig)) {
            query.put("SkipCheckPolicyConfig", request.skipCheckPolicyConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScreenshot"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScreenshotResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateScreenshotResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a screenshot of a cloud phone instance and upload it to the default Object Storage Service (OSS) bucket. The operation returns a task ID, which you can use with the DescribeTasks operation to get the download link for the screenshot.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a screenshot of a cloud phone instance.</p>
     * 
     * @param request CreateScreenshotRequest
     * @return CreateScreenshotResponse
     */
    public CreateScreenshotResponse createScreenshot(CreateScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScreenshotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete only pay-as-you-go instance groups.
     * You can delete subscription instance groups only after they expire.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete an instance group.</p>
     * 
     * @param request DeleteAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAndroidInstanceGroupResponse
     */
    public DeleteAndroidInstanceGroupResponse deleteAndroidInstanceGroupWithOptions(DeleteAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAndroidInstanceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAndroidInstanceGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can delete only pay-as-you-go instance groups.
     * You can delete subscription instance groups only after they expire.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete an instance group.</p>
     * 
     * @param request DeleteAndroidInstanceGroupRequest
     * @return DeleteAndroidInstanceGroupResponse
     */
    public DeleteAndroidInstanceGroupResponse deleteAndroidInstanceGroup(DeleteAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application. Before you delete an application, make sure that the application is not installed on any instances.</p>
     * 
     * @param request DeleteAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppsResponse
     */
    public DeleteAppsResponse deleteAppsWithOptions(DeleteAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApps"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAppsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application. Before you delete an application, make sure that the application is not installed on any instances.</p>
     * 
     * @param request DeleteAppsRequest
     * @return DeleteAppsResponse
     */
    public DeleteAppsResponse deleteApps(DeleteAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot delete an image that is currently in use by an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
     * 
     * @param tmpReq DeleteImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImagesResponse
     */
    public DeleteImagesResponse deleteImagesWithOptions(DeleteImagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteImagesShrinkRequest request = new DeleteImagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imageIds)) {
            request.imageIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imageIds, "ImageIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageIdsShrink)) {
            body.put("ImageIds", request.imageIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImages"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImagesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteImagesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You cannot delete an image that is currently in use by an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
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
     * <p>  If a cloud phone instance is currently associated with the ADB key pair you intend to delete, the ADB key pair cannot be deleted.</p>
     * <ul>
     * <li>Once an ADB key pair is deleted, it cannot be retrieved or queried by using the DescribeKeyPairs operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Android Debug Bridge (ADB) key pairs.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairIds)) {
            query.put("KeyPairIds", request.keyPairIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteKeyPairsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  If a cloud phone instance is currently associated with the ADB key pair you intend to delete, the ADB key pair cannot be deleted.</p>
     * <ul>
     * <li>Once an ADB key pair is deleted, it cannot be retrieved or queried by using the DescribeKeyPairs operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Android Debug Bridge (ADB) key pairs.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy.</p>
     * 
     * @param request DeletePolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroupWithOptions(DeletePolicyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            query.put("PolicyGroupIds", request.policyGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeletePolicyGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy.</p>
     * 
     * @param request DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     */
    public DeletePolicyGroupResponse deletePolicyGroup(DeletePolicyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance group.</p>
     * 
     * @param request DescribeAndroidInstanceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAndroidInstanceGroupsResponse
     */
    public DescribeAndroidInstanceGroupsResponse describeAndroidInstanceGroupsWithOptions(DescribeAndroidInstanceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupName)) {
            query.put("InstanceGroupName", request.instanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAndroidInstanceGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAndroidInstanceGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAndroidInstanceGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance group.</p>
     * 
     * @param request DescribeAndroidInstanceGroupsRequest
     * @return DescribeAndroidInstanceGroupsResponse
     */
    public DescribeAndroidInstanceGroupsResponse describeAndroidInstanceGroups(DescribeAndroidInstanceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAndroidInstanceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries cloud phone instances.</p>
     * 
     * @param request DescribeAndroidInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAndroidInstancesResponse
     */
    public DescribeAndroidInstancesResponse describeAndroidInstancesWithOptions(DescribeAndroidInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceName)) {
            query.put("AndroidInstanceName", request.androidInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupName)) {
            query.put("InstanceGroupName", request.instanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
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
            new TeaPair("action", "DescribeAndroidInstances"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAndroidInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAndroidInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries cloud phone instances.</p>
     * 
     * @param request DescribeAndroidInstancesRequest
     * @return DescribeAndroidInstancesResponse
     */
    public DescribeAndroidInstancesResponse describeAndroidInstances(DescribeAndroidInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAndroidInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries applications.</p>
     * 
     * @param request DescribeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installationStatus)) {
            query.put("InstallationStatus", request.installationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MD5)) {
            query.put("MD5", request.MD5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeAppsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries applications.</p>
     * 
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to query only backup files generated by cloud phones that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries backup files.</p>
     * 
     * @param request DescribeBackupFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupFilesResponse
     */
    public DescribeBackupFilesResponse describeBackupFilesWithOptions(DescribeBackupFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceId)) {
            query.put("AndroidInstanceId", request.androidInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceName)) {
            query.put("AndroidInstanceName", request.androidInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupAll)) {
            query.put("BackupAll", request.backupAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileId)) {
            query.put("BackupFileId", request.backupFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileName)) {
            query.put("BackupFileName", request.backupFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupFiles"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupFilesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeBackupFilesResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to query only backup files generated by cloud phones that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries backup files.</p>
     * 
     * @param request DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     */
    public DescribeBackupFilesResponse describeBackupFiles(DescribeBackupFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries images.</p>
     * 
     * @param request DescribeImageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageListResponse
     */
    public DescribeImageListResponse describeImageListWithOptions(DescribeImageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imagePackageType)) {
            query.put("ImagePackageType", request.imagePackageType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageList"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeImageListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries images.</p>
     * 
     * @param request DescribeImageListRequest
     * @return DescribeImageListResponse
     */
    public DescribeImageListResponse describeImageList(DescribeImageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution results of commands.</p>
     * 
     * @param request DescribeInvocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvocationsResponse
     */
    public DescribeInvocationsResponse describeInvocationsWithOptions(DescribeInvocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invocationId)) {
            query.put("InvocationId", request.invocationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvocations"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvocationsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeInvocationsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution results of commands.</p>
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
     * <p>Queries one or more key pairs.</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairIds)) {
            query.put("KeyPairIds", request.keyPairIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
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
            new TeaPair("action", "DescribeKeyPairs"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyPairsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeKeyPairsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more key pairs.</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query available regions.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRegionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Query available regions.</p>
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
     * <p>Query available specifications.</p>
     * 
     * @param request DescribeSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSpecResponse
     */
    public DescribeSpecResponse describeSpecWithOptions(DescribeSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matrixSpec)) {
            query.put("MatrixSpec", request.matrixSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleMode)) {
            query.put("SaleMode", request.saleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specIds)) {
            query.put("SpecIds", request.specIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specStatus)) {
            query.put("SpecStatus", request.specStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSpec"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSpecResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeSpecResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Query available specifications.</p>
     * 
     * @param request DescribeSpecRequest
     * @return DescribeSpecResponse
     */
    public DescribeSpecResponse describeSpec(DescribeSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the DescribeTasks operation to query the tasks created for one or more cloud phone instances.</p>
     * <ul>
     * <li>The system currently supports various tasks, including starting, stopping, restarting, and resetting cloud phone instances; backing up and restoring data; installing apps; and executing remote commands.</li>
     * <li>You can use the Level field to specify the type of task. If Level is set to 1, it represents a batch task. If Level is set to 2, it represents an instance-level task.
     * <strong>Example</strong>
     * Assume you restart two cloud phone instances with the instance IDs acp-25nt4kk9whhok\<em>\</em>\<em>\</em> and acp-j2taq887orj8l\<em>\</em>\<em>\</em>, and the returned request ID is B8ED2BA9-0C6A-5643-818F-B5D60A64\<em>\</em>\<em>\</em>. If you want to check the operation outcomes of the two cloud phone instances, you can call the DescribeTasks operation. You need to set the InvokeId request parameter to B8ED2BA9-0C6A-5643-818F-B5D60A64\<em>\</em>\<em>\</em>. If you only want to check the cloud phone instance with the ID acp-25nt4kk9whhok\<em>\</em>\<em>\</em>, you must set the ParentTaskId request parameter to the ID of the batch task and the AndroidInstanceId request parameter to acp-25nt4kk9whhok\<em>\</em>\<em>\</em> when calling the DescribeTasks operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tasks created for a cloud phone instance.</p>
     * 
     * @param request DescribeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeId)) {
            query.put("InvokeId", request.invokeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.param)) {
            query.put("Param", request.param);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskId)) {
            query.put("ParentTaskId", request.parentTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatuses)) {
            query.put("TaskStatuses", request.taskStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypes)) {
            query.put("TaskTypes", request.taskTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeTasksResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  You can call the DescribeTasks operation to query the tasks created for one or more cloud phone instances.</p>
     * <ul>
     * <li>The system currently supports various tasks, including starting, stopping, restarting, and resetting cloud phone instances; backing up and restoring data; installing apps; and executing remote commands.</li>
     * <li>You can use the Level field to specify the type of task. If Level is set to 1, it represents a batch task. If Level is set to 2, it represents an instance-level task.
     * <strong>Example</strong>
     * Assume you restart two cloud phone instances with the instance IDs acp-25nt4kk9whhok\<em>\</em>\<em>\</em> and acp-j2taq887orj8l\<em>\</em>\<em>\</em>, and the returned request ID is B8ED2BA9-0C6A-5643-818F-B5D60A64\<em>\</em>\<em>\</em>. If you want to check the operation outcomes of the two cloud phone instances, you can call the DescribeTasks operation. You need to set the InvokeId request parameter to B8ED2BA9-0C6A-5643-818F-B5D60A64\<em>\</em>\<em>\</em>. If you only want to check the cloud phone instance with the ID acp-25nt4kk9whhok\<em>\</em>\<em>\</em>, you must set the ParentTaskId request parameter to the ID of the batch task and the AndroidInstanceId request parameter to acp-25nt4kk9whhok\<em>\</em>\<em>\</em> when calling the DescribeTasks operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries tasks created for a cloud phone instance.</p>
     * 
     * @param request DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you detach an ADB key pair from a cloud phone instance, the ADB connection will fail. This occurs because the system can no longer authenticate using a valid ADB public key, leading to authentication errors.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches an Android Debug Bridge (ADB) key pair from one or more cloud phone instances.</p>
     * 
     * @param request DetachKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPairWithOptions(DetachKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetachKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetachKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>  After you detach an ADB key pair from a cloud phone instance, the ADB connection will fail. This occurs because the system can no longer authenticate using a valid ADB public key, leading to authentication errors.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches an Android Debug Bridge (ADB) key pair from one or more cloud phone instances.</p>
     * 
     * @param request DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    public DetachKeyPairResponse detachKeyPair(DetachKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例断开连接</p>
     * 
     * @param request DisconnectAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisconnectAndroidInstanceResponse
     */
    public DisconnectAndroidInstanceResponse disconnectAndroidInstanceWithOptions(DisconnectAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisconnectAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DisconnectAndroidInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DisconnectAndroidInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>实例断开连接</p>
     * 
     * @param request DisconnectAndroidInstanceRequest
     * @return DisconnectAndroidInstanceResponse
     */
    public DisconnectAndroidInstanceResponse disconnectAndroidInstance(DisconnectAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disconnectAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you distribute an image in supported regions, the distribution cannot be canceled.</p>
     * 
     * <b>summary</b> : 
     * <p>Distributes an image.</p>
     * 
     * @param request DistributeImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DistributeImageResponse
     */
    public DistributeImageResponse distributeImageWithOptions(DistributeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributeRegionList)) {
            body.put("DistributeRegionList", request.distributeRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DistributeImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DistributeImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DistributeImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After you distribute an image in supported regions, the distribution cannot be canceled.</p>
     * 
     * <b>summary</b> : 
     * <p>Distributes an image.</p>
     * 
     * @param request DistributeImageRequest
     * @return DistributeImageResponse
     */
    public DistributeImageResponse distributeImage(DistributeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.distributeImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation only allows you to scale down an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Downgrades an instance group. Currently, this operation allows you to only delete specific cloud phone instances from an instance group.</p>
     * 
     * @param request DowngradeAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeAndroidInstanceGroupResponse
     */
    public DowngradeAndroidInstanceGroupResponse downgradeAndroidInstanceGroupWithOptions(DowngradeAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DowngradeAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeAndroidInstanceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DowngradeAndroidInstanceGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation only allows you to scale down an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Downgrades an instance group. Currently, this operation allows you to only delete specific cloud phone instances from an instance group.</p>
     * 
     * @param request DowngradeAndroidInstanceGroupRequest
     * @return DowngradeAndroidInstanceGroupResponse
     */
    public DowngradeAndroidInstanceGroupResponse downgradeAndroidInstanceGroup(DowngradeAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downgradeAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>结束协同</p>
     * 
     * @param request EndCoordinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndCoordinationResponse
     */
    public EndCoordinationResponse endCoordinationWithOptions(EndCoordinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coordinatorUserId)) {
            query.put("CoordinatorUserId", request.coordinatorUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndCoordination"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new EndCoordinationResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new EndCoordinationResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>结束协同</p>
     * 
     * @param request EndCoordinationRequest
     * @return EndCoordinationResponse
     */
    public EndCoordinationResponse endCoordination(EndCoordinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endCoordinationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to retrieve files or folders from cloud phone instances and save them directly to OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Pulls a file from a cloud phone instance and stores it in Object Storage Service (OSS).</p>
     * 
     * @param request FetchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchFileResponse
     */
    public FetchFileResponse fetchFileWithOptions(FetchFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePath)) {
            query.put("SourceFilePath", request.sourceFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrl)) {
            query.put("UploadUrl", request.uploadUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FetchFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FetchFileResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to retrieve files or folders from cloud phone instances and save them directly to OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Pulls a file from a cloud phone instance and stores it in Object Storage Service (OSS).</p>
     * 
     * @param request FetchFileRequest
     * @return FetchFileResponse
     */
    public FetchFileResponse fetchFile(FetchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取协同码</p>
     * 
     * @param request GenerateCoordinationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCoordinationCodeResponse
     */
    public GenerateCoordinationCodeResponse generateCoordinationCodeWithOptions(GenerateCoordinationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCoordinationCode"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCoordinationCodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenerateCoordinationCodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取协同码</p>
     * 
     * @param request GenerateCoordinationCodeRequest
     * @return GenerateCoordinationCodeResponse
     */
    public GenerateCoordinationCodeResponse generateCoordinationCode(GenerateCoordinationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCoordinationCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To avoid authorization errors that could cause ADB connection failures, you must import the public key of an ADB key pair.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports the public key of an Android Debug Bridge (ADB) key pair.</p>
     * 
     * @param request ImportKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBody)) {
            query.put("PublicKeyBody", request.publicKeyBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ImportKeyPairResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>To avoid authorization errors that could cause ADB connection failures, you must import the public key of an ADB key pair.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports the public key of an Android Debug Bridge (ADB) key pair.</p>
     * 
     * @param request ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation runs asynchronously. To check the installation result, you can query the installation history for the app.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an app on multiple cloud phone instances at the same time.</p>
     * 
     * @param request InstallAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAppResponse
     */
    public InstallAppResponse installAppWithOptions(InstallAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIdList)) {
            query.put("InstanceGroupIdList", request.instanceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InstallAppResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation runs asynchronously. To check the installation result, you can query the installation history for the app.</p>
     * 
     * <b>summary</b> : 
     * <p>Installs an app on multiple cloud phone instances at the same time.</p>
     * 
     * @param request InstallAppRequest
     * @return InstallAppResponse
     */
    public InstallAppResponse installApp(InstallAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies.</p>
     * 
     * @param request ListPolicyGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyGroupsResponse
     */
    public ListPolicyGroupsResponse listPolicyGroupsWithOptions(ListPolicyGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupIds)) {
            body.put("PolicyGroupIds", request.policyGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPolicyGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries policies.</p>
     * 
     * @param request ListPolicyGroupsRequest
     * @return ListPolicyGroupsResponse
     */
    public ListPolicyGroupsResponse listPolicyGroups(ListPolicyGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies attributes of a cloud phone instance. Currently, this operation allows you to modify only the name of a cloud phone instance.</p>
     * 
     * @param request ModifyAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAndroidInstanceResponse
     */
    public ModifyAndroidInstanceResponse modifyAndroidInstanceWithOptions(ModifyAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceId)) {
            query.put("AndroidInstanceId", request.androidInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAndroidInstanceName)) {
            query.put("NewAndroidInstanceName", request.newAndroidInstanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAndroidInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAndroidInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies attributes of a cloud phone instance. Currently, this operation allows you to modify only the name of a cloud phone instance.</p>
     * 
     * @param request ModifyAndroidInstanceRequest
     * @return ModifyAndroidInstanceResponse
     */
    public ModifyAndroidInstanceResponse modifyAndroidInstance(ModifyAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies attributes of an instance group.</p>
     * 
     * @param request ModifyAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAndroidInstanceGroupResponse
     */
    public ModifyAndroidInstanceGroupResponse modifyAndroidInstanceGroupWithOptions(ModifyAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newInstanceGroupName)) {
            query.put("NewInstanceGroupName", request.newInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            query.put("PolicyGroupId", request.policyGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAndroidInstanceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAndroidInstanceGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies attributes of an instance group.</p>
     * 
     * @param request ModifyAndroidInstanceGroupRequest
     * @return ModifyAndroidInstanceGroupResponse
     */
    public ModifyAndroidInstanceGroupResponse modifyAndroidInstanceGroup(ModifyAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAndroidInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify attributes of an application.</p>
     * 
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            query.put("IconUrl", request.iconUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyAppResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modify attributes of an application.</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the billing method. Currently, this operation only allows you to change the billing method from pay-as-you-go to subscription.</p>
     * 
     * @param request ModifyInstanceChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceChargeTypeResponse
     */
    public ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeWithOptions(ModifyInstanceChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
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
            new TeaPair("action", "ModifyInstanceChargeType"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceChargeTypeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyInstanceChargeTypeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the billing method. Currently, this operation only allows you to change the billing method from pay-as-you-go to subscription.</p>
     * 
     * @param request ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
    public ModifyInstanceChargeTypeResponse modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies Android Debug Bridge (ADB) key pairs.</p>
     * 
     * @param request ModifyKeyPairNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyKeyPairNameResponse
     */
    public ModifyKeyPairNameResponse modifyKeyPairNameWithOptions(ModifyKeyPairNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newKeyPairName)) {
            query.put("NewKeyPairName", request.newKeyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyKeyPairName"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyKeyPairNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyKeyPairNameResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies Android Debug Bridge (ADB) key pairs.</p>
     * 
     * @param request ModifyKeyPairNameRequest
     * @return ModifyKeyPairNameResponse
     */
    public ModifyKeyPairNameResponse modifyKeyPairName(ModifyKeyPairNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyKeyPairNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a policy.</p>
     * 
     * @param tmpReq ModifyPolicyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyGroupResponse
     */
    public ModifyPolicyGroupResponse modifyPolicyGroupWithOptions(ModifyPolicyGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPolicyGroupShrinkRequest request = new ModifyPolicyGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.netRedirectPolicy)) {
            request.netRedirectPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.netRedirectPolicy, "NetRedirectPolicy", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cameraRedirect)) {
            body.put("CameraRedirect", request.cameraRedirect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clipboard)) {
            body.put("Clipboard", request.clipboard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html5FileTransfer)) {
            body.put("Html5FileTransfer", request.html5FileTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localDrive)) {
            body.put("LocalDrive", request.localDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockResolution)) {
            body.put("LockResolution", request.lockResolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netRedirectPolicyShrink)) {
            body.put("NetRedirectPolicy", request.netRedirectPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupId)) {
            body.put("PolicyGroupId", request.policyGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyGroupName)) {
            body.put("PolicyGroupName", request.policyGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionHeight)) {
            body.put("ResolutionHeight", request.resolutionHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolutionWidth)) {
            body.put("ResolutionWidth", request.resolutionWidth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyPolicyGroupResponse());
        }

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
     * <b>summary</b> : 
     * <p>Operates apps in a cloud phone, such as opening, closing, and reopening apps.</p>
     * 
     * @param request OperateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppResponse
     */
    public OperateAppResponse operateAppWithOptions(OperateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new OperateAppResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Operates apps in a cloud phone, such as opening, closing, and reopening apps.</p>
     * 
     * @param request OperateAppRequest
     * @return OperateAppResponse
     */
    public OperateAppResponse operateApp(OperateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you restart a cloud phone instance, make sure it is in one of the following states: <strong>Available, Abnormal, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts one or more cloud phone instances.</p>
     * 
     * @param request RebootAndroidInstancesInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootAndroidInstancesInGroupResponse
     */
    public RebootAndroidInstancesInGroupResponse rebootAndroidInstancesInGroupWithOptions(RebootAndroidInstancesInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootAndroidInstancesInGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RebootAndroidInstancesInGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RebootAndroidInstancesInGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you restart a cloud phone instance, make sure it is in one of the following states: <strong>Available, Abnormal, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts one or more cloud phone instances.</p>
     * 
     * @param request RebootAndroidInstancesInGroupRequest
     * @return RebootAndroidInstancesInGroupResponse
     */
    public RebootAndroidInstancesInGroupResponse rebootAndroidInstancesInGroup(RebootAndroidInstancesInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootAndroidInstancesInGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to restore only backup files generated by cloud phones that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores backup files.</p>
     * 
     * @param request RecoveryFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoveryFileResponse
     */
    public RecoveryFileResponse recoveryFileWithOptions(RecoveryFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupAll)) {
            query.put("BackupAll", request.backupAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFileId)) {
            query.put("BackupFileId", request.backupFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupFilePath)) {
            query.put("BackupFilePath", request.backupFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoveryFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RecoveryFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RecoveryFileResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to restore only backup files generated by cloud phones that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores backup files.</p>
     * 
     * @param request RecoveryFileRequest
     * @return RecoveryFileResponse
     */
    public RecoveryFileResponse recoveryFile(RecoveryFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoveryFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews instance groups.</p>
     * 
     * @param request RenewAndroidInstanceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAndroidInstanceGroupsResponse
     */
    public RenewAndroidInstanceGroupsResponse renewAndroidInstanceGroupsWithOptions(RenewAndroidInstanceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            query.put("InstanceGroupIds", request.instanceGroupIds);
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
            new TeaPair("action", "RenewAndroidInstanceGroups"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAndroidInstanceGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RenewAndroidInstanceGroupsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Renews instance groups.</p>
     * 
     * @param request RenewAndroidInstanceGroupsRequest
     * @return RenewAndroidInstanceGroupsResponse
     */
    public RenewAndroidInstanceGroupsResponse renewAndroidInstanceGroups(RenewAndroidInstanceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAndroidInstanceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you reset a cloud phone instance, make sure it is in one of the following states: <strong>Available, Stopped, Abnormal, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets one or more cloud phone instances.</p>
     * 
     * @param request ResetAndroidInstancesInGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAndroidInstancesInGroupResponse
     */
    public ResetAndroidInstancesInGroupResponse resetAndroidInstancesInGroupWithOptions(ResetAndroidInstancesInGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAndroidInstancesInGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAndroidInstancesInGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetAndroidInstancesInGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you reset a cloud phone instance, make sure it is in one of the following states: <strong>Available, Stopped, Abnormal, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets one or more cloud phone instances.</p>
     * 
     * @param request ResetAndroidInstancesInGroupRequest
     * @return ResetAndroidInstancesInGroupResponse
     */
    public ResetAndroidInstancesInGroupResponse resetAndroidInstancesInGroup(ResetAndroidInstancesInGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAndroidInstancesInGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a command on a cloud phone instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCommand"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RunCommandResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RunCommandResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Executes a command on a cloud phone instance.</p>
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
     * <p>Currently, this operation allows you to only push files or folders from OSS buckets to cloud phone instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes files from Object Storage Service (OSS) buckets to cloud phone instances.</p>
     * 
     * @param request SendFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendFileResponse
     */
    public SendFileResponse sendFileWithOptions(SendFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIdList)) {
            query.put("AndroidInstanceIdList", request.androidInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceFilePath)) {
            query.put("SourceFilePath", request.sourceFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadEndpoint)) {
            query.put("UploadEndpoint", request.uploadEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            query.put("UploadType", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadUrl)) {
            query.put("UploadUrl", request.uploadUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendFile"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SendFileResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SendFileResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to only push files or folders from OSS buckets to cloud phone instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes files from Object Storage Service (OSS) buckets to cloud phone instances.</p>
     * 
     * @param request SendFileRequest
     * @return SendFileResponse
     */
    public SendFileResponse sendFile(SendFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the desired cloud phone instance is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the authentication status for cloud phone instances. If you enable Android Debug Bridge (ADB) authentication for cloud phone instances, the system will verify the validity of the ADB key pairs provided by end users when they connect to the instances over ADB. To ensure successful authentication and a proper connection, we recommend that you attach ADB key pairs to cloud phone instances. If you disable ADB authentication for cloud phone instances, the system will no longer verify the validity of any ADB key pairs. As a result, end users can connect to the cloud phone instances over ADB without authentication, provided the network connection is functioning properly.</p>
     * 
     * @param request SetAdbSecureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAdbSecureResponse
     */
    public SetAdbSecureResponse setAdbSecureWithOptions(SetAdbSecureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAdbSecure"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetAdbSecureResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetAdbSecureResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the desired cloud phone instance is in the Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the authentication status for cloud phone instances. If you enable Android Debug Bridge (ADB) authentication for cloud phone instances, the system will verify the validity of the ADB key pairs provided by end users when they connect to the instances over ADB. To ensure successful authentication and a proper connection, we recommend that you attach ADB key pairs to cloud phone instances. If you disable ADB authentication for cloud phone instances, the system will no longer verify the validity of any ADB key pairs. As a result, end users can connect to the cloud phone instances over ADB without authentication, provided the network connection is functioning properly.</p>
     * 
     * @param request SetAdbSecureRequest
     * @return SetAdbSecureResponse
     */
    public SetAdbSecureResponse setAdbSecure(SetAdbSecureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAdbSecureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only supports starting when the instance is in the <strong>Stopped, Backup Failed, or Recovery Failed</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Start instances.</p>
     * 
     * @param request StartAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAndroidInstanceResponse
     */
    public StartAndroidInstanceResponse startAndroidInstanceWithOptions(StartAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartAndroidInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartAndroidInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Only supports starting when the instance is in the <strong>Stopped, Backup Failed, or Recovery Failed</strong> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Start instances.</p>
     * 
     * @param request StartAndroidInstanceRequest
     * @return StartAndroidInstanceResponse
     */
    public StartAndroidInstanceResponse startAndroidInstance(StartAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you stop a cloud phone instance, make sure it is in one of the following states: <strong>Available, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a cloud phone instance.</p>
     * 
     * @param request StopAndroidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAndroidInstanceResponse
     */
    public StopAndroidInstanceResponse stopAndroidInstanceWithOptions(StopAndroidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.androidInstanceIds)) {
            query.put("AndroidInstanceIds", request.androidInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAndroidInstance"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StopAndroidInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StopAndroidInstanceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you stop a cloud phone instance, make sure it is in one of the following states: <strong>Available, Backup failure, and Restoration failure</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a cloud phone instance.</p>
     * 
     * @param request StopAndroidInstanceRequest
     * @return StopAndroidInstanceResponse
     */
    public StopAndroidInstanceResponse stopAndroidInstance(StopAndroidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAndroidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls an app from multiple cloud phone instances. This operation runs asynchronously. You can check the result of the task by using the task ID.</p>
     * 
     * @param request UninstallAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAppResponse
     */
    public UninstallAppResponse uninstallAppWithOptions(UninstallAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            query.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIdList)) {
            query.put("InstanceGroupIdList", request.instanceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallApp"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAppResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UninstallAppResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls an app from multiple cloud phone instances. This operation runs asynchronously. You can check the result of the task by using the task ID.</p>
     * 
     * @param request UninstallAppRequest
     * @return UninstallAppResponse
     */
    public UninstallAppResponse uninstallApp(UninstallAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of a custom image.</p>
     * 
     * @param request UpdateCustomImageNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomImageNameResponse
     */
    public UpdateCustomImageNameResponse updateCustomImageNameWithOptions(UpdateCustomImageNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomImageName"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomImageNameResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateCustomImageNameResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the name of a custom image.</p>
     * 
     * @param request UpdateCustomImageNameRequest
     * @return UpdateCustomImageNameResponse
     */
    public UpdateCustomImageNameResponse updateCustomImageName(UpdateCustomImageNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomImageNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure the image is in the Available state and the region of the image is included in the region list of the desired instance group. In addition, the instance group itself is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the image of an instance group.</p>
     * 
     * @param request UpdateInstanceGroupImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceGroupImageResponse
     */
    public UpdateInstanceGroupImageResponse updateInstanceGroupImageWithOptions(UpdateInstanceGroupImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupIds)) {
            body.put("InstanceGroupIds", request.instanceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceGroupImage"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceGroupImageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateInstanceGroupImageResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure the image is in the Available state and the region of the image is included in the region list of the desired instance group. In addition, the instance group itself is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the image of an instance group.</p>
     * 
     * @param request UpdateInstanceGroupImageRequest
     * @return UpdateInstanceGroupImageResponse
     */
    public UpdateInstanceGroupImageResponse updateInstanceGroupImage(UpdateInstanceGroupImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceGroupImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to only increase the size of an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an instance group. Currently, this operation allows you to only increase the number of instances in an instance group.</p>
     * 
     * @param request UpgradeAndroidInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAndroidInstanceGroupResponse
     */
    public UpgradeAndroidInstanceGroupResponse upgradeAndroidInstanceGroupWithOptions(UpgradeAndroidInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.increaseNumberOfInstance)) {
            query.put("IncreaseNumberOfInstance", request.increaseNumberOfInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceGroupId)) {
            query.put("InstanceGroupId", request.instanceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAndroidInstanceGroup"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAndroidInstanceGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeAndroidInstanceGroupResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation allows you to only increase the size of an instance group.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades an instance group. Currently, this operation allows you to only increase the number of instances in an instance group.</p>
     * 
     * @param request UpgradeAndroidInstanceGroupRequest
     * @return UpgradeAndroidInstanceGroupResponse
     */
    public UpgradeAndroidInstanceGroupResponse upgradeAndroidInstanceGroup(UpgradeAndroidInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeAndroidInstanceGroupWithOptions(request, runtime);
    }
}
