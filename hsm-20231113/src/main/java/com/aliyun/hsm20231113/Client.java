// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113;

import com.aliyun.tea.*;
import com.aliyun.hsm20231113.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hsm", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>  The region of the bucket must be the same as the region where the security audit feature is enabled.</p>
     * <ul>
     * <li>If the security audit feature is enabled, do not delete Object Storage Service (OSS) buckets. If you delete OSS buckets, audit logs fail to be delivered.</li>
     * <li>Only electronic virtual security modules (EVSMs) and general virtual security modules (GVSMs) within the Chinese mainland support the security audit feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the audit log feature and delivers audit logs to buckets.</p>
     * 
     * @param request ConfigAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigAuditLogResponse
     */
    public ConfigAuditLogResponse configAuditLogWithOptions(ConfigAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditAction)) {
            query.put("AuditAction", request.auditAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditOssBucket)) {
            query.put("AuditOssBucket", request.auditOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigAuditLog"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigAuditLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The region of the bucket must be the same as the region where the security audit feature is enabled.</p>
     * <ul>
     * <li>If the security audit feature is enabled, do not delete Object Storage Service (OSS) buckets. If you delete OSS buckets, audit logs fail to be delivered.</li>
     * <li>Only electronic virtual security modules (EVSMs) and general virtual security modules (GVSMs) within the Chinese mainland support the security audit feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the audit log feature and delivers audit logs to buckets.</p>
     * 
     * @param request ConfigAuditLogRequest
     * @return ConfigAuditLogResponse
     */
    public ConfigAuditLogResponse configAuditLog(ConfigAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configAuditLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the name and description of a backup.</p>
     * 
     * @param request ConfigBackupRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigBackupRemarkResponse
     */
    public ConfigBackupRemarkResponse configBackupRemarkWithOptions(ConfigBackupRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigBackupRemark"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigBackupRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the name and description of a backup.</p>
     * 
     * @param request ConfigBackupRemarkRequest
     * @return ConfigBackupRemarkResponse
     */
    public ConfigBackupRemarkResponse configBackupRemark(ConfigBackupRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configBackupRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only hardware security modules (HSMs) in the Chinese mainland support the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the execution mode of a backup task.</p>
     * 
     * @param request ConfigBackupTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigBackupTaskResponse
     */
    public ConfigBackupTaskResponse configBackupTaskWithOptions(ConfigBackupTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupHourInDay)) {
            query.put("BackupHourInDay", request.backupHourInDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupPeriod)) {
            query.put("BackupPeriod", request.backupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manual2PeriodicList)) {
            query.put("Manual2PeriodicList", request.manual2PeriodicList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodic2ManualList)) {
            query.put("Periodic2ManualList", request.periodic2ManualList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigBackupTask"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigBackupTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only hardware security modules (HSMs) in the Chinese mainland support the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the execution mode of a backup task.</p>
     * 
     * @param request ConfigBackupTaskRequest
     * @return ConfigBackupTaskResponse
     */
    public ConfigBackupTaskResponse configBackupTask(ConfigBackupTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configBackupTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to create a self-signed certificate and a cluster certificate on an Elastic Compute Service (ECS) instance, see <a href="https://help.aliyun.com/document_detail/293585.html">Create a NIST FIPS-validated GVSM cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a certificate for a cluster of hardware security modules (HSMs) outside the Chinese mainland.</p>
     * 
     * @param request ConfigClusterCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigClusterCertificateResponse
     */
    public ConfigClusterCertificateResponse configClusterCertificateWithOptions(ConfigClusterCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterCertificate)) {
            body.put("ClusterCertificate", request.clusterCertificate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuerCertificate)) {
            body.put("IssuerCertificate", request.issuerCertificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigClusterCertificate"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigClusterCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to create a self-signed certificate and a cluster certificate on an Elastic Compute Service (ECS) instance, see <a href="https://help.aliyun.com/document_detail/293585.html">Create a NIST FIPS-validated GVSM cluster</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a certificate for a cluster of hardware security modules (HSMs) outside the Chinese mainland.</p>
     * 
     * @param request ConfigClusterCertificateRequest
     * @return ConfigClusterCertificateResponse
     */
    public ConfigClusterCertificateResponse configClusterCertificate(ConfigClusterCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configClusterCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a cluster.</p>
     * 
     * @param request ConfigClusterNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigClusterNameResponse
     */
    public ConfigClusterNameResponse configClusterNameWithOptions(ConfigClusterNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigClusterName"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigClusterNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the name of a cluster.</p>
     * 
     * @param request ConfigClusterNameRequest
     * @return ConfigClusterNameResponse
     */
    public ConfigClusterNameResponse configClusterName(ConfigClusterNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configClusterNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to configure all vSwitches that are associated with a HSM cluster. You can only add new vSwitches. You cannot delete vSwitches.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a list of vSwitches that are associated with a hardware security module (HSM) cluster.</p>
     * 
     * @param tmpReq ConfigClusterSubnetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigClusterSubnetResponse
     */
    public ConfigClusterSubnetResponse configClusterSubnetWithOptions(ConfigClusterSubnetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigClusterSubnetShrinkRequest request = new ConfigClusterSubnetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIds)) {
            request.vSwitchIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIds, "VSwitchIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdsShrink)) {
            body.put("VSwitchIds", request.vSwitchIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigClusterSubnet"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigClusterSubnetResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to configure all vSwitches that are associated with a HSM cluster. You can only add new vSwitches. You cannot delete vSwitches.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a list of vSwitches that are associated with a hardware security module (HSM) cluster.</p>
     * 
     * @param request ConfigClusterSubnetRequest
     * @return ConfigClusterSubnetResponse
     */
    public ConfigClusterSubnetResponse configClusterSubnet(ConfigClusterSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configClusterSubnetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The IP address whitelist of a cluster has a higher priority than the IP address whitelist of a hardware security module (HSM) in the cluster. In cluster mode, we recommend that you create an IP address whitelist for your cluster. You do not need to create an IP address for the HSM in the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a cluster.</p>
     * 
     * @param request ConfigClusterWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigClusterWhitelistResponse
     */
    public ConfigClusterWhitelistResponse configClusterWhitelistWithOptions(ConfigClusterWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            body.put("Whitelist", request.whitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigClusterWhitelist"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigClusterWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>The IP address whitelist of a cluster has a higher priority than the IP address whitelist of a hardware security module (HSM) in the cluster. In cluster mode, we recommend that you create an IP address whitelist for your cluster. You do not need to create an IP address for the HSM in the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a cluster.</p>
     * 
     * @param request ConfigClusterWhitelistRequest
     * @return ConfigClusterWhitelistResponse
     */
    public ConfigClusterWhitelistResponse configClusterWhitelist(ConfigClusterWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configClusterWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an image.</p>
     * 
     * @param request ConfigImageRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigImageRemarkResponse
     */
    public ConfigImageRemarkResponse configImageRemarkWithOptions(ConfigImageRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigImageRemark"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigImageRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an image.</p>
     * 
     * @param request ConfigImageRemarkRequest
     * @return ConfigImageRemarkResponse
     */
    public ConfigImageRemarkResponse configImageRemark(ConfigImageRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configImageRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you add an HSM to a cluster, you cannot modify the VPC endpoint of the HSM.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the virtual private cloud (VPC) endpoint of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigInstanceIpAddressResponse
     */
    public ConfigInstanceIpAddressResponse configInstanceIpAddressWithOptions(ConfigInstanceIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigInstanceIpAddress"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigInstanceIpAddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you add an HSM to a cluster, you cannot modify the VPC endpoint of the HSM.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the virtual private cloud (VPC) endpoint of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceIpAddressRequest
     * @return ConfigInstanceIpAddressResponse
     */
    public ConfigInstanceIpAddressResponse configInstanceIpAddress(ConfigInstanceIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configInstanceIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigInstanceRemarkResponse
     */
    public ConfigInstanceRemarkResponse configInstanceRemarkWithOptions(ConfigInstanceRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigInstanceRemark"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigInstanceRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceRemarkRequest
     * @return ConfigInstanceRemarkResponse
     */
    public ConfigInstanceRemarkResponse configInstanceRemark(ConfigInstanceRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configInstanceRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure the IP address whitelist for HSMs that are not added to a cluster and are in the ACTIVE state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigInstanceWhitelistResponse
     */
    public ConfigInstanceWhitelistResponse configInstanceWhitelistWithOptions(ConfigInstanceWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whitelist)) {
            body.put("Whitelist", request.whitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigInstanceWhitelist"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigInstanceWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can configure the IP address whitelist for HSMs that are not added to a cluster and are in the ACTIVE state.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of a hardware security module (HSM).</p>
     * 
     * @param request ConfigInstanceWhitelistRequest
     * @return ConfigInstanceWhitelistResponse
     */
    public ConfigInstanceWhitelistResponse configInstanceWhitelist(ConfigInstanceWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configInstanceWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation requires that the destination region does not have the same image. This operation is available only for hardware security modules (HSMs) outside the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies an image to another region.</p>
     * 
     * @param request CopyImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyImageResponse
     */
    public CopyImageResponse copyImageWithOptions(CopyImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageUid)) {
            body.put("ImageUid", request.imageUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetRegionId)) {
            body.put("TargetRegionId", request.targetRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyImage"),
            new TeaPair("version", "2023-11-13"),
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
     * <b>description</b> :
     * <p>This operation requires that the destination region does not have the same image. This operation is available only for hardware security modules (HSMs) outside the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies an image to another region.</p>
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
     * <p>The master HSM that you specify to create a cluster must be in the ACTIVE state.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster by specifying a hardware security module (HSM) as the master HSM.</p>
     * 
     * @param request CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterInstanceId)) {
            body.put("MasterInstanceId", request.masterInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>The master HSM that you specify to create a cluster must be in the ACTIVE state.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster by specifying a hardware security module (HSM) as the master HSM.</p>
     * 
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete an HSM only if the cluster does not contain HSMs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a hardware security module (HSM) cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete an HSM only if the cluster does not contain HSMs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a hardware security module (HSM) cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions that are supported by Cloud Hardware Security Module.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2023-11-13"),
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
     * <p>Queries the regions that are supported by Cloud Hardware Security Module.</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户获取特定集群的管理证书。</li>
     * <li>返回的数据是经过base64编码的证书内容。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>下载集群托管证书</p>
     * 
     * @param request DownloadClusterManagedCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadClusterManagedCertResponse
     */
    public DownloadClusterManagedCertResponse downloadClusterManagedCertWithOptions(DownloadClusterManagedCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadClusterManagedCert"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadClusterManagedCertResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户获取特定集群的管理证书。</li>
     * <li>返回的数据是经过base64编码的证书内容。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>下载集群托管证书</p>
     * 
     * @param request DownloadClusterManagedCertRequest
     * @return DownloadClusterManagedCertResponse
     */
    public DownloadClusterManagedCertResponse downloadClusterManagedCert(DownloadClusterManagedCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadClusterManagedCertWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for backups in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a backup to a specified hardware security module (HSM).</p>
     * 
     * @param request EnableBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableBackupResponse
     */
    public EnableBackupResponse enableBackupWithOptions(EnableBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableBackup"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableBackupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for backups in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a backup to a specified hardware security module (HSM).</p>
     * 
     * @param request EnableBackupRequest
     * @return EnableBackupResponse
     */
    public EnableBackupResponse enableBackup(EnableBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBackupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the image for a specified hardware security module (HSM).</p>
     * 
     * @param request ExportImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportImage"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the image for a specified hardware security module (HSM).</p>
     * 
     * @param request ExportImageRequest
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the audit log feature in the current region.</p>
     * 
     * @param request GetAuditLogStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuditLogStatusResponse
     */
    public GetAuditLogStatusResponse getAuditLogStatusWithOptions(GetAuditLogStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.getOssBucket)) {
            query.put("GetOssBucket", request.getOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuditLogStatus"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuditLogStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the audit log feature in the current region.</p>
     * 
     * @param request GetAuditLogStatusRequest
     * @return GetAuditLogStatusResponse
     */
    public GetAuditLogStatusResponse getAuditLogStatus(GetAuditLogStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuditLogStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specified backup.</p>
     * 
     * @param request GetBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBackupResponse
     */
    public GetBackupResponse getBackupWithOptions(GetBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBackup"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBackupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a specified backup.</p>
     * 
     * @param request GetBackupRequest
     * @return GetBackupResponse
     */
    public GetBackupResponse getBackup(GetBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBackupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified cluster.</p>
     * 
     * @param request GetClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified cluster.</p>
     * 
     * @param request GetClusterRequest
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an image.</p>
     * 
     * @param request GetImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageResponse
     */
    public GetImageResponse getImageWithOptions(GetImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an image.</p>
     * 
     * @param request GetImageRequest
     * @return GetImageResponse
     */
    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified hardware security module (HSM).</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a specified hardware security module (HSM).</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an asynchronous task.</p>
     * 
     * @param request GetJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(GetJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an asynchronous task.</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes Cloud Hardware Security Module to deliver logs.</p>
     * 
     * @param request InitializeAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeAuditLogResponse
     */
    public InitializeAuditLogResponse initializeAuditLogWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeAuditLog"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeAuditLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes Cloud Hardware Security Module to deliver logs.</p>
     * @return InitializeAuditLogResponse
     */
    public InitializeAuditLogResponse initializeAuditLog() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeAuditLogWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The cluster is not initialized, but the master hardware security module (HSM) of the cluster is initialized.</p>
     * <ul>
     * <li>Two or more vSwitches are configured for the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes a cluster.</p>
     * 
     * @param request InitializeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeClusterResponse
     */
    public InitializeClusterResponse initializeClusterWithOptions(InitializeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The cluster is not initialized, but the master hardware security module (HSM) of the cluster is initialized.</p>
     * <ul>
     * <li>Two or more vSwitches are configured for the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initializes a cluster.</p>
     * 
     * @param request InitializeClusterRequest
     * @return InitializeClusterResponse
     */
    public InitializeClusterResponse initializeCluster(InitializeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can add the HSM to only the cluster that is in the INITIALIZED state.</p>
     * <ul>
     * <li>The HSM that you want to add to the cluster is enabled or disabled and is not initialized.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a hardware security module (HSM) to the current cluster.</p>
     * 
     * @param request JoinClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinClusterResponse
     */
    public JoinClusterResponse joinClusterWithOptions(JoinClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can add the HSM to only the cluster that is in the INITIALIZED state.</p>
     * <ul>
     * <li>The HSM that you want to add to the cluster is enabled or disabled and is not initialized.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a hardware security module (HSM) to the current cluster.</p>
     * 
     * @param request JoinClusterRequest
     * @return JoinClusterResponse
     */
    public JoinClusterResponse joinCluster(JoinClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If non-master HSMs exist in a cluster, the master HSM cannot be removed from the cluster.</p>
     * <ul>
     * <li>After the master HSM is removed from a cluster, the cluster enters the TO_DELETE state and cannot be restored to the available state. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a hardware security module (HSM) from the current cluster.</p>
     * 
     * @param request LeaveClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LeaveClusterResponse
     */
    public LeaveClusterResponse leaveClusterWithOptions(LeaveClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LeaveCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LeaveClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If non-master HSMs exist in a cluster, the master HSM cannot be removed from the cluster.</p>
     * <ul>
     * <li>After the master HSM is removed from a cluster, the cluster enters the TO_DELETE state and cannot be restored to the available state. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes a hardware security module (HSM) from the current cluster.</p>
     * 
     * @param request LeaveClusterRequest
     * @return LeaveClusterResponse
     */
    public LeaveClusterResponse leaveCluster(LeaveClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backups that meet the query conditions.</p>
     * 
     * @param request ListBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackupsWithOptions(ListBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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
            new TeaPair("action", "ListBackups"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBackupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backups that meet the query conditions.</p>
     * 
     * @param request ListBackupsRequest
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the clusters that meet the query conditions.</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the clusters that meet the query conditions.</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the images that meet the specified conditions.</p>
     * 
     * @param request ListImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
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
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the images that meet the specified conditions.</p>
     * 
     * @param request ListImagesRequest
     * @return ListImagesResponse
     */
    public ListImagesResponse listImages(ListImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hardware security modules (HSMs) that meet the query conditions.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantIsolationType)) {
            body.put("TenantIsolationType", request.tenantIsolationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hardware security modules (HSMs) that meet the query conditions.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource to a new resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a resource to a new resource group.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you disable an HSM, the relevant service operations fail. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a hardware security module (HSM).</p>
     * 
     * @param request PauseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseInstanceResponse
     */
    public PauseInstanceResponse pauseInstanceWithOptions(PauseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you disable an HSM, the relevant service operations fail. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a hardware security module (HSM).</p>
     * 
     * @param request PauseInstanceRequest
     * @return PauseInstanceResponse
     */
    public PauseInstanceResponse pauseInstance(PauseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>快速部署集群</p>
     * 
     * @param tmpReq QuickDeployClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuickDeployClusterResponse
     */
    public QuickDeployClusterResponse quickDeployClusterWithOptions(QuickDeployClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuickDeployClusterShrinkRequest request = new QuickDeployClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceList)) {
            request.instanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceList, "InstanceList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchIdList)) {
            request.vSwitchIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchIdList, "VSwitchIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.whiteList)) {
            request.whiteListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.whiteList, "WhiteList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certManaged)) {
            query.put("CertManaged", request.certManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceListShrink)) {
            query.put("InstanceList", request.instanceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdListShrink)) {
            query.put("VSwitchIdList", request.vSwitchIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListShrink)) {
            query.put("WhiteList", request.whiteListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuickDeployCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuickDeployClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>快速部署集群</p>
     * 
     * @param request QuickDeployClusterRequest
     * @return QuickDeployClusterResponse
     */
    public QuickDeployClusterResponse quickDeployCluster(QuickDeployClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.quickDeployClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for general virtual security modules (GVSMs) in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Initializes a hardware security module (HSM).</p>
     * 
     * @param request QuickInitInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuickInitInstanceResponse
     */
    public QuickInitInstanceResponse quickInitInstanceWithOptions(QuickInitInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuickInitInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuickInitInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for general virtual security modules (GVSMs) in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Initializes a hardware security module (HSM).</p>
     * 
     * @param request QuickInitInstanceRequest
     * @return QuickInitInstanceResponse
     */
    public QuickInitInstanceResponse quickInitInstance(QuickInitInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.quickInitInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for HSMs in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a backup from a hardware security module (HSM).</p>
     * 
     * @param request ResetBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetBackupResponse
     */
    public ResetBackupResponse resetBackupWithOptions(ResetBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetBackup"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetBackupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only for HSMs in the Chinese mainland.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a backup from a hardware security module (HSM).</p>
     * 
     * @param request ResetBackupRequest
     * @return ResetBackupResponse
     */
    public ResetBackupResponse resetBackup(ResetBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetBackupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After an HSM is reset, all related data is deleted and cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a hardware security module (HSM).</p>
     * 
     * @param request ResetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetInstanceResponse
     */
    public ResetInstanceResponse resetInstanceWithOptions(ResetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>After an HSM is reset, all related data is deleted and cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets a hardware security module (HSM).</p>
     * 
     * @param request ResetInstanceRequest
     * @return ResetInstanceResponse
     */
    public ResetInstanceResponse resetInstance(ResetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use images to restore only HSMs that are paused or disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores a hardware security module (HSM) by using an image.</p>
     * 
     * @param request RestoreInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstanceWithOptions(RestoreInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use images to restore only HSMs that are paused or disabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Restores a hardware security module (HSM) by using an image.</p>
     * 
     * @param request RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a disabled hardware security module (HSM).</p>
     * 
     * @param request ResumeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a disabled hardware security module (HSM).</p>
     * 
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于触发指定集群的管理证书轮转过程。通过提供<code>ClusterId</code>参数，可以指定需要进行证书轮转的集群。此操作有助于提高集群的安全性，建议定期执行。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>ClusterId</code>是有效的，并且用户具有对该集群的操作权限。</li>
     * <li>证书轮转可能会影响依赖于旧证书的服务，请在适当的时间窗口内执行此操作。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>轮转集群托管证书</p>
     * 
     * @param request RotateClusterManagedCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RotateClusterManagedCertResponse
     */
    public RotateClusterManagedCertResponse rotateClusterManagedCertWithOptions(RotateClusterManagedCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RotateClusterManagedCert"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RotateClusterManagedCertResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于触发指定集群的管理证书轮转过程。通过提供<code>ClusterId</code>参数，可以指定需要进行证书轮转的集群。此操作有助于提高集群的安全性，建议定期执行。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>ClusterId</code>是有效的，并且用户具有对该集群的操作权限。</li>
     * <li>证书轮转可能会影响依赖于旧证书的服务，请在适当的时间窗口内执行此操作。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>轮转集群托管证书</p>
     * 
     * @param request RotateClusterManagedCertRequest
     * @return RotateClusterManagedCertResponse
     */
    public RotateClusterManagedCertResponse rotateClusterManagedCert(RotateClusterManagedCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rotateClusterManagedCertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Promotes a slave hardware security module (HSM) to the master HSM within the cluster. Clusters that are manually synchronized in the Chinese Mainland do not support this operation.</p>
     * 
     * @param request SwitchClusterMasterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchClusterMasterResponse
     */
    public SwitchClusterMasterResponse switchClusterMasterWithOptions(SwitchClusterMasterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchClusterMaster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchClusterMasterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Promotes a slave hardware security module (HSM) to the master HSM within the cluster. Clusters that are manually synchronized in the Chinese Mainland do not support this operation.</p>
     * 
     * @param request SwitchClusterMasterRequest
     * @return SwitchClusterMasterResponse
     */
    public SwitchClusterMasterResponse switchClusterMaster(SwitchClusterMasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchClusterMasterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This operation is used for manually synchronizing data within clusters located in the Chinese Mainland. For clusters outside the Chinese Mainland, automatic data synchronization is supported, and this operation is unnecessary. If you attempt to use this operation, a 400 error code will be returned.</p>
     * <ul>
     * <li>The data synchronization takes approximately 5 minutes. To avoid service interruptions, we recommend performing this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the data of hardware security modules (HSMs) in a cluster.</p>
     * 
     * @param request SyncClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncClusterResponse
     */
    public SyncClusterResponse syncClusterWithOptions(SyncClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncCluster"),
            new TeaPair("version", "2023-11-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This operation is used for manually synchronizing data within clusters located in the Chinese Mainland. For clusters outside the Chinese Mainland, automatic data synchronization is supported, and this operation is unnecessary. If you attempt to use this operation, a 400 error code will be returned.</p>
     * <ul>
     * <li>The data synchronization takes approximately 5 minutes. To avoid service interruptions, we recommend performing this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the data of hardware security modules (HSMs) in a cluster.</p>
     * 
     * @param request SyncClusterRequest
     * @return SyncClusterResponse
     */
    public SyncClusterResponse syncCluster(SyncClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncClusterWithOptions(request, runtime);
    }
}
