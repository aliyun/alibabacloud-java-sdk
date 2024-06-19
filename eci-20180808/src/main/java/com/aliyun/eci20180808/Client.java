// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808;

import com.aliyun.tea.*;
import com.aliyun.eci20180808.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eci", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You must specify the Alibaba Cloud Resource Name (ARN) of the RAM role of the Container Registry Enterprise Edition instance to grant the elastic container instance to assume the RAM role to push images.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous task to store a specified container in an elastic container instance as an image and pushes the image to an image repository of Alibaba Cloud Container Registry.</p>
     * 
     * @param request CommitContainerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommitContainerResponse
     */
    public CommitContainerResponse commitContainerWithOptions(CommitContainerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfo)) {
            query.put("AcrRegistryInfo", request.acrRegistryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arn)) {
            query.put("Arn", request.arn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerName)) {
            query.put("ContainerName", request.containerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitContainer"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitContainerResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must specify the Alibaba Cloud Resource Name (ARN) of the RAM role of the Container Registry Enterprise Edition instance to grant the elastic container instance to assume the RAM role to push images.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous task to store a specified container in an elastic container instance as an image and pushes the image to an image repository of Alibaba Cloud Container Registry.</p>
     * 
     * @param request CommitContainerRequest
     * @return CommitContainerResponse
     */
    public CommitContainerResponse commitContainer(CommitContainerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.commitContainerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You cannot directly use a DataCache across regions. You can call this operation to copy a DataCache from one region to another region. This operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>If you want to use a DataCache across regions and the DataCache exists in Region A, you can call this operation to quickly copy the DataCache to Region B.</li>
     * <li>If you directly pull data from a region outside China to a region inside the Chinese mainland when you create a DataCache, the data may be pulled at a slow speed due to network limits. In this case, you can create a DataCache in a region outside the Chinese mainland but inside China, such as the China (Hong Kong) region, and call this operation to copy the data to the region inside the Chinese mainland.<blockquote>
     * <p>The process of copying a DataCache is equivalent to copying a snapshot. You are charged for the traffic generated during the copy process and the storage of the generated DataCache.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Copies a DataCache from one region to another region.</p>
     * 
     * @param request CopyDataCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyDataCacheResponse
     */
    public CopyDataCacheResponse copyDataCacheWithOptions(CopyDataCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheId)) {
            query.put("DataCacheId", request.dataCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionId)) {
            query.put("DestinationRegionId", request.destinationRegionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyDataCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyDataCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>You cannot directly use a DataCache across regions. You can call this operation to copy a DataCache from one region to another region. This operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>If you want to use a DataCache across regions and the DataCache exists in Region A, you can call this operation to quickly copy the DataCache to Region B.</li>
     * <li>If you directly pull data from a region outside China to a region inside the Chinese mainland when you create a DataCache, the data may be pulled at a slow speed due to network limits. In this case, you can create a DataCache in a region outside the Chinese mainland but inside China, such as the China (Hong Kong) region, and call this operation to copy the data to the region inside the Chinese mainland.<blockquote>
     * <p>The process of copying a DataCache is equivalent to copying a snapshot. You are charged for the traffic generated during the copy process and the storage of the generated DataCache.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Copies a DataCache from one region to another region.</p>
     * 
     * @param request CopyDataCacheRequest
     * @return CopyDataCacheResponse
     */
    public CopyDataCacheResponse copyDataCache(CopyDataCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyDataCacheWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, the system automatically creates a service-linked role named AliyunServiceRoleForECI. You can assume the service-linked role to access relevant cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.
     * When you create an elastic container instance, you can configure features that are related to instances, images, and storage based on your business requirements. For information about parameters configured for the features and the description of the parameters, see the following documents:
     * <strong>Instances</strong>
     * You can use one of the following methods to create an elastic container instance:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">Specify the number of vCPUs and memory size to create an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">Specify ECS instance types to create an elastic container instance</a>
     * Both the preceding creation methods support the following features:</li>
     * <li><a href="https://help.aliyun.com/document_detail/157759.html">Create a preemptible elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/157290.html">Configure multiple zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146468.html">Configure multiple specifications</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146608.html">Use tags to manage elastic container instances</a>
     * <strong>Images</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/461311.html">Configure a container image</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141281.html">Use the image cache feature to accelerate the creation of an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/194250.html">Specify a Container Registry Enterprise Edition instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/378059.html">Use self-managed image repositories</a>
     * <strong>Networking</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/99146.html">Create and Associate an EIP</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/176237.html">Assign a security group</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/451282.html">Assign an IPv6 address to an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/190635.html">Configure maximum bandwidth</a>
     * <strong>Storage</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/144571.html">Mount a disk volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464075.html">Mount a NAS volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464076.html">Mount an OSS bucket to an elastic container instance as a volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464078.html">Mount an emptyDir volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464080.html">Mount a ConfigFile volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/204066.html">Increase the size of the temporary storage space</a>
     * <strong>Container configuration</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/94593.html">Configure startup commands and arguments for a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/99053.html">Use probes to perform health checks on a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141788.html">Obtain metadata by using environment variables</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462313.html">Configure a security context for an elastic container instance or a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462768.html">Configure the NTP service</a>
     * <strong>Logging and O\&amp;M</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/121973.html">Use environment variables to configure log collection</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/167801.html">Save core files to volumes</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an elastic container instance.</p>
     * 
     * @param request CreateContainerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContainerGroupResponse
     */
    public CreateContainerGroupResponse createContainerGroupWithOptions(CreateContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfo)) {
            query.put("AcrRegistryInfo", request.acrRegistryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeDeadlineSeconds)) {
            query.put("ActiveDeadlineSeconds", request.activeDeadlineSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateEip)) {
            query.put("AutoCreateEip", request.autoCreateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeCategory)) {
            query.put("ComputeCategory", request.computeCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerResourceView)) {
            query.put("ContainerResourceView", request.containerResourceView);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corePattern)) {
            query.put("CorePattern", request.corePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuArchitecture)) {
            query.put("CpuArchitecture", request.cpuArchitecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsCore)) {
            query.put("CpuOptionsCore", request.cpuOptionsCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsNuma)) {
            query.put("CpuOptionsNuma", request.cpuOptionsNuma);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuOptionsThreadsPerCore)) {
            query.put("CpuOptionsThreadsPerCore", request.cpuOptionsThreadsPerCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBucket)) {
            query.put("DataCacheBucket", request.dataCacheBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheBurstingEnabled)) {
            query.put("DataCacheBurstingEnabled", request.dataCacheBurstingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCachePL)) {
            query.put("DataCachePL", request.dataCachePL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheProvisionedIops)) {
            query.put("DataCacheProvisionedIops", request.dataCacheProvisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsPolicy)) {
            query.put("DnsPolicy", request.dnsPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.egressBandwidth)) {
            query.put("EgressBandwidth", request.egressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipBandwidth)) {
            query.put("EipBandwidth", request.eipBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipCommonBandwidthPackage)) {
            query.put("EipCommonBandwidthPackage", request.eipCommonBandwidthPackage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipISP)) {
            query.put("EipISP", request.eipISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixedIp)) {
            query.put("FixedIp", request.fixedIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fixedIpRetainHour)) {
            query.put("FixedIpRetainHour", request.fixedIpRetainHour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            query.put("GpuDriverVersion", request.gpuDriverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAliase)) {
            query.put("HostAliase", request.hostAliase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageAccelerateMode)) {
            query.put("ImageAccelerateMode", request.imageAccelerateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredential)) {
            query.put("ImageRegistryCredential", request.imageRegistryCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageSnapshotId)) {
            query.put("ImageSnapshotId", request.imageSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressBandwidth)) {
            query.put("IngressBandwidth", request.ingressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainer)) {
            query.put("InitContainer", request.initContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insecureRegistry)) {
            query.put("InsecureRegistry", request.insecureRegistry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6AddressCount)) {
            query.put("Ipv6AddressCount", request.ipv6AddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6GatewayBandwidth)) {
            query.put("Ipv6GatewayBandwidth", request.ipv6GatewayBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6GatewayBandwidthEnable)) {
            query.put("Ipv6GatewayBandwidthEnable", request.ipv6GatewayBandwidthEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ntpServer)) {
            query.put("NtpServer", request.ntpServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overheadReservationOption)) {
            query.put("OverheadReservationOption", request.overheadReservationOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plainHttpRegistry)) {
            query.put("PlainHttpRegistry", request.plainHttpRegistry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleStrategy)) {
            query.put("ScheduleStrategy", request.scheduleStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareProcessNamespace)) {
            query.put("ShareProcessNamespace", request.shareProcessNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictSpot)) {
            query.put("StrictSpot", request.strictSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfig)) {
            query.put("DnsConfig", request.dnsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostSecurityContext)) {
            query.put("HostSecurityContext", request.hostSecurityContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityContext)) {
            query.put("SecurityContext", request.securityContext);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContainerGroup"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContainerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, the system automatically creates a service-linked role named AliyunServiceRoleForECI. You can assume the service-linked role to access relevant cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.
     * When you create an elastic container instance, you can configure features that are related to instances, images, and storage based on your business requirements. For information about parameters configured for the features and the description of the parameters, see the following documents:
     * <strong>Instances</strong>
     * You can use one of the following methods to create an elastic container instance:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">Specify the number of vCPUs and memory size to create an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">Specify ECS instance types to create an elastic container instance</a>
     * Both the preceding creation methods support the following features:</li>
     * <li><a href="https://help.aliyun.com/document_detail/157759.html">Create a preemptible elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/157290.html">Configure multiple zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146468.html">Configure multiple specifications</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146608.html">Use tags to manage elastic container instances</a>
     * <strong>Images</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/461311.html">Configure a container image</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141281.html">Use the image cache feature to accelerate the creation of an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/194250.html">Specify a Container Registry Enterprise Edition instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/378059.html">Use self-managed image repositories</a>
     * <strong>Networking</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/99146.html">Create and Associate an EIP</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/176237.html">Assign a security group</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/451282.html">Assign an IPv6 address to an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/190635.html">Configure maximum bandwidth</a>
     * <strong>Storage</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/144571.html">Mount a disk volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464075.html">Mount a NAS volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464076.html">Mount an OSS bucket to an elastic container instance as a volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464078.html">Mount an emptyDir volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464080.html">Mount a ConfigFile volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/204066.html">Increase the size of the temporary storage space</a>
     * <strong>Container configuration</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/94593.html">Configure startup commands and arguments for a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/99053.html">Use probes to perform health checks on a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141788.html">Obtain metadata by using environment variables</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462313.html">Configure a security context for an elastic container instance or a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462768.html">Configure the NTP service</a>
     * <strong>Logging and O\&amp;M</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/121973.html">Use environment variables to configure log collection</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/167801.html">Save core files to volumes</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an elastic container instance.</p>
     * 
     * @param request CreateContainerGroupRequest
     * @return CreateContainerGroupResponse
     */
    public CreateContainerGroupResponse createContainerGroup(CreateContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContainerGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You are charged for the creation of image caches. We recommend that you learn the relevant billing information in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2503093.html">DataCaches</a>.</p>
     * <ul>
     * <li>Before you create an image cache, you must evaluate the size of the data to be cached. If the size of the data exceeds the specified cache size, the image cache fails to be created.</li>
     * <li>When a data cache is being created, the system automatically creates a temporary elastic container instance (ECI) and an enhanced SSD (ESSD) for the data cache. During the creation, do not delete the ECI and ESSD. Otherwise, the data cache fails to be created.</li>
     * <li>When a data cache is being created, a snapshot is generated for the data cache. Do not delete the snapshot. Otherwise, the data cache becomes invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a DataCache.</p>
     * 
     * @param request CreateDataCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataCacheResponse
     */
    public CreateDataCacheResponse createDataCacheWithOptions(CreateDataCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipCreateParam)) {
            query.put("EipCreateParam", request.eipCreateParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
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
            new TeaPair("action", "CreateDataCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You are charged for the creation of image caches. We recommend that you learn the relevant billing information in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2503093.html">DataCaches</a>.</p>
     * <ul>
     * <li>Before you create an image cache, you must evaluate the size of the data to be cached. If the size of the data exceeds the specified cache size, the image cache fails to be created.</li>
     * <li>When a data cache is being created, the system automatically creates a temporary elastic container instance (ECI) and an enhanced SSD (ESSD) for the data cache. During the creation, do not delete the ECI and ESSD. Otherwise, the data cache fails to be created.</li>
     * <li>When a data cache is being created, a snapshot is generated for the data cache. Do not delete the snapshot. Otherwise, the data cache becomes invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a DataCache.</p>
     * 
     * @param request CreateDataCacheRequest
     * @return CreateDataCacheResponse
     */
    public CreateDataCacheResponse createDataCache(CreateDataCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataCacheWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Precautions</strong>
     *     *   You are charged for creation of image caches. We recommend that you learn the relevant billing information in advance. For more information about billing of image caches, see <a href="https://help.aliyun.com/document_detail/447682.html">Image caches</a>.
     *     *   Before you create an image cache, you must estimate the total size of the images that you want to cache. If the total size of the images exceeds the specified cache size, the image cache cannot be created.
     *     *   When an image cache is being created, the system creates an intermediate elastic container instance and an intermediate enhanced SSD (ESSD) at performance level 1 (PL1). Do not delete the intermediate instance and the ESSD while the image cache is being created. If you delete the intermediate instance or the ESSD, the image cache cannot be created.
     *     *   A temporary local snapshot and a specific number of regular snapshots are generated during the creation of the image cache. Do not delete these snapshots. If you delete these snapshots, the image cache becomes invalid.
     *     *   If you use SDKs, SDK for Java 1.0.10 or later and SDK for Python 1.0.7 or later are supported.</p>
     * <ul>
     * <li><strong>Usage notes</strong><ul>
     * <li>For images that are created based on Container Registry Enterprise Edition instances and use custom domain names, if you want to configure password-free access to the image caches, you must use AcrRegistryInfo-related parameters to specify Container Registry instances. When you configure AcrRegistryInfo-related parameters, you must set the AcrRegistryInfo.N.InstanceId parameter.</li>
     * <li>If the image cache that you created will be used to create more than 1,000 elastic container instances at a time, we recommend that you use the StandardCopyCount and FlashCopyCount parameters to create multiple temporary local snapshots and regular snapshots of the image. The multiple snapshots are billed based on incremental data. If no incremental data exists on the multiple snapshots, you are not charged for the multiple snapshots.<blockquote>
     * <p> When you call the CreateImageCache operation to create an image cache, the system automatically creates a service-linked role named AliyunServiceRoleForECI. The role is used to access other Alibaba Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image cache. The image cache can accelerate image pulling and reduce the instance startup time when you create an elastic container instance later.</p>
     * 
     * @param request CreateImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCacheWithOptions(CreateImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfo)) {
            query.put("AcrRegistryInfo", request.acrRegistryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.annotations)) {
            query.put("Annotations", request.annotations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eliminationStrategy)) {
            query.put("EliminationStrategy", request.eliminationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flash)) {
            query.put("Flash", request.flash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashCopyCount)) {
            query.put("FlashCopyCount", request.flashCopyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheName)) {
            query.put("ImageCacheName", request.imageCacheName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheSize)) {
            query.put("ImageCacheSize", request.imageCacheSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredential)) {
            query.put("ImageRegistryCredential", request.imageRegistryCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insecureRegistry)) {
            query.put("InsecureRegistry", request.insecureRegistry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plainHttpRegistry)) {
            query.put("PlainHttpRegistry", request.plainHttpRegistry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardCopyCount)) {
            query.put("StandardCopyCount", request.standardCopyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Precautions</strong>
     *     *   You are charged for creation of image caches. We recommend that you learn the relevant billing information in advance. For more information about billing of image caches, see <a href="https://help.aliyun.com/document_detail/447682.html">Image caches</a>.
     *     *   Before you create an image cache, you must estimate the total size of the images that you want to cache. If the total size of the images exceeds the specified cache size, the image cache cannot be created.
     *     *   When an image cache is being created, the system creates an intermediate elastic container instance and an intermediate enhanced SSD (ESSD) at performance level 1 (PL1). Do not delete the intermediate instance and the ESSD while the image cache is being created. If you delete the intermediate instance or the ESSD, the image cache cannot be created.
     *     *   A temporary local snapshot and a specific number of regular snapshots are generated during the creation of the image cache. Do not delete these snapshots. If you delete these snapshots, the image cache becomes invalid.
     *     *   If you use SDKs, SDK for Java 1.0.10 or later and SDK for Python 1.0.7 or later are supported.</p>
     * <ul>
     * <li><strong>Usage notes</strong><ul>
     * <li>For images that are created based on Container Registry Enterprise Edition instances and use custom domain names, if you want to configure password-free access to the image caches, you must use AcrRegistryInfo-related parameters to specify Container Registry instances. When you configure AcrRegistryInfo-related parameters, you must set the AcrRegistryInfo.N.InstanceId parameter.</li>
     * <li>If the image cache that you created will be used to create more than 1,000 elastic container instances at a time, we recommend that you use the StandardCopyCount and FlashCopyCount parameters to create multiple temporary local snapshots and regular snapshots of the image. The multiple snapshots are billed based on incremental data. If no incremental data exists on the multiple snapshots, you are not charged for the multiple snapshots.<blockquote>
     * <p> When you call the CreateImageCache operation to create an image cache, the system automatically creates a service-linked role named AliyunServiceRoleForECI. The role is used to access other Alibaba Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an image cache. The image cache can accelerate image pulling and reduce the instance startup time when you create an elastic container instance later.</p>
     * 
     * @param request CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    public CreateImageCacheResponse createImageCache(CreateImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>O&amp;M tasks are classified into:</p>
     * <ul>
     * <li>coredump: After you enable coredump, the system generates a core dump file when a container unexpectedly stops. You can use the core dump file to analyze the exception and find out the cause of the problem. For more information, see <a href="https://help.aliyun.com/document_detail/167801.html">Enable coredump</a>.</li>
     * <li>tcpdump: After you enable tcpdump, the system captures network packets when a container unexpectedly stops. You can analyze the packets and locate network problems. For more information, see Enable <a href="https://help.aliyun.com/document_detail/429749.html">tcpdump</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an O&amp;M task.</p>
     * 
     * @param request CreateInstanceOpsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceOpsTaskResponse
     */
    public CreateInstanceOpsTaskResponse createInstanceOpsTaskWithOptions(CreateInstanceOpsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsType)) {
            query.put("OpsType", request.opsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsValue)) {
            query.put("OpsValue", request.opsValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceOpsTask"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceOpsTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>O&amp;M tasks are classified into:</p>
     * <ul>
     * <li>coredump: After you enable coredump, the system generates a core dump file when a container unexpectedly stops. You can use the core dump file to analyze the exception and find out the cause of the problem. For more information, see <a href="https://help.aliyun.com/document_detail/167801.html">Enable coredump</a>.</li>
     * <li>tcpdump: After you enable tcpdump, the system captures network packets when a container unexpectedly stops. You can analyze the packets and locate network problems. For more information, see Enable <a href="https://help.aliyun.com/document_detail/429749.html">tcpdump</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an O&amp;M task.</p>
     * 
     * @param request CreateInstanceOpsTaskRequest
     * @return CreateInstanceOpsTaskResponse
     */
    public CreateInstanceOpsTaskResponse createInstanceOpsTask(CreateInstanceOpsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceOpsTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual node, the system automatically creates a service-linked role AliyunServiceRoleForECIVnode. This way, you can use the service-linked role to access relevant cloud services such as Elastic Container Instance, Elastic Compute Service (ECS), and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/311014.html">Service-linked role for virtual nodes</a>.</p>
     * <ul>
     * <li>You are charged for virtual nodes based on number of virtual nodes that you use. Each virtual node has a resident node, which is equivalent to an ECI instance with 2 vCPU cores and 8 GiB memory. You are charged for virtual nodes based on elastic container instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VNode to connect self-managed Kubernetes clusters to elastic container instances.</p>
     * 
     * @param request CreateVirtualNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualNodeResponse
     */
    public CreateVirtualNodeResponse createVirtualNodeWithOptions(CreateVirtualNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDNS)) {
            query.put("ClusterDNS", request.clusterDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDomain)) {
            query.put("ClusterDomain", request.clusterDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customResources)) {
            query.put("CustomResources", request.customResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePublicNetwork)) {
            query.put("EnablePublicNetwork", request.enablePublicNetwork);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kubeConfig)) {
            query.put("KubeConfig", request.kubeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taint)) {
            query.put("Taint", request.taint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsBootstrapEnabled)) {
            query.put("TlsBootstrapEnabled", request.tlsBootstrapEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeName)) {
            query.put("VirtualNodeName", request.virtualNodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualNode"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual node, the system automatically creates a service-linked role AliyunServiceRoleForECIVnode. This way, you can use the service-linked role to access relevant cloud services such as Elastic Container Instance, Elastic Compute Service (ECS), and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/311014.html">Service-linked role for virtual nodes</a>.</p>
     * <ul>
     * <li>You are charged for virtual nodes based on number of virtual nodes that you use. Each virtual node has a resident node, which is equivalent to an ECI instance with 2 vCPU cores and 8 GiB memory. You are charged for virtual nodes based on elastic container instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a VNode to connect self-managed Kubernetes clusters to elastic container instances.</p>
     * 
     * @param request CreateVirtualNodeRequest
     * @return CreateVirtualNodeResponse
     */
    public CreateVirtualNodeResponse createVirtualNode(CreateVirtualNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a container group that you no longer need. Before you delete a container group, make sure that you understand the lifecycle of container groups. For more information, see <a href="https://help.aliyun.com/document_detail/122385.html">Lifecycle of an elastic container instance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a container group.</p>
     * 
     * @param request DeleteContainerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContainerGroupResponse
     */
    public DeleteContainerGroupResponse deleteContainerGroupWithOptions(DeleteContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContainerGroup"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContainerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a container group that you no longer need. Before you delete a container group, make sure that you understand the lifecycle of container groups. For more information, see <a href="https://help.aliyun.com/document_detail/122385.html">Lifecycle of an elastic container instance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a container group.</p>
     * 
     * @param request DeleteContainerGroupRequest
     * @return DeleteContainerGroupResponse
     */
    public DeleteContainerGroupResponse deleteContainerGroup(DeleteContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContainerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DataCache.</p>
     * 
     * @param request DeleteDataCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataCacheResponse
     */
    public DeleteDataCacheResponse deleteDataCacheWithOptions(DeleteDataCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheId)) {
            query.put("DataCacheId", request.dataCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DataCache.</p>
     * 
     * @param request DeleteDataCacheRequest
     * @return DeleteDataCacheResponse
     */
    public DeleteDataCacheResponse deleteDataCache(DeleteDataCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image cache.</p>
     * 
     * @param request DeleteImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCacheWithOptions(DeleteImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheId)) {
            query.put("ImageCacheId", request.imageCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImageCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an image cache.</p>
     * 
     * @param request DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    public DeleteImageCacheResponse deleteImageCache(DeleteImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual node.</p>
     * 
     * @param request DeleteVirtualNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualNodeResponse
     */
    public DeleteVirtualNodeResponse deleteVirtualNodeWithOptions(DeleteVirtualNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeId)) {
            query.put("VirtualNodeId", request.virtualNodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualNode"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual node.</p>
     * 
     * @param request DeleteVirtualNodeRequest
     * @return DeleteVirtualNodeResponse
     */
    public DeleteVirtualNodeResponse deleteVirtualNode(DeleteVirtualNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, you can use the InstanceType parameter to specify ECS instance types that fit your specific needs. To ensure that the elastic container instance can be created, you can call the DescribeAvailableResource operation to query which ECS instance types and instance families are available in the specified region and zone before you create the elastic container instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instance families that are available in a specified region and zone.</p>
     * 
     * @param request DescribeAvailableResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationResource)) {
            query.put("DestinationResource", request.destinationResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.spotResource)) {
            query.put("SpotResource", request.spotResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, you can use the InstanceType parameter to specify ECS instance types that fit your specific needs. To ensure that the elastic container instance can be created, you can call the DescribeAvailableResource operation to query which ECS instance types and instance families are available in the specified region and zone before you create the elastic container instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instance families that are available in a specified region and zone.</p>
     * 
     * @param request DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a CommitContainer task.</p>
     * 
     * @param request DescribeCommitContainerTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommitContainerTaskResponse
     */
    public DescribeCommitContainerTaskResponse describeCommitContainerTaskWithOptions(DescribeCommitContainerTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommitContainerTask"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommitContainerTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a CommitContainer task.</p>
     * 
     * @param request DescribeCommitContainerTaskRequest
     * @return DescribeCommitContainerTaskResponse
     */
    public DescribeCommitContainerTaskResponse describeCommitContainerTask(DescribeCommitContainerTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommitContainerTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the event information about multiple elastic container instances at a time. By default, the most recent 50 entries of events of each elastic container instance are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event information about multiple container groups at a time.</p>
     * 
     * @param request DescribeContainerGroupEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerGroupEventsResponse
     */
    public DescribeContainerGroupEventsResponse describeContainerGroupEventsWithOptions(DescribeContainerGroupEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupIds)) {
            query.put("ContainerGroupIds", request.containerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSource)) {
            query.put("EventSource", request.eventSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinceSecond)) {
            query.put("SinceSecond", request.sinceSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerGroupEvents"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerGroupEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the event information about multiple elastic container instances at a time. By default, the most recent 50 entries of events of each elastic container instance are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event information about multiple container groups at a time.</p>
     * 
     * @param request DescribeContainerGroupEventsRequest
     * @return DescribeContainerGroupEventsResponse
     */
    public DescribeContainerGroupEventsResponse describeContainerGroupEvents(DescribeContainerGroupEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  A maximum of 50 monitoring data entries can be returned. If the number of monitoring data entries exceeds this limit, an error message is returned.</p>
     * <ul>
     * <li>You can query real-time monitoring data (data generated within the last 5 minutes) and historical data (data generated more than 5 minutes ago). If the time range to query starts or ends later than the current time, historical monitoring data generated more than 5 minutes ago is returned.</li>
     * <li>The elastic container instance whose monitoring data you want to query must be created after April 3, 2019, 15:00 UTC+8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of an elastic container instance.</p>
     * 
     * @param request DescribeContainerGroupMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerGroupMetricResponse
     */
    public DescribeContainerGroupMetricResponse describeContainerGroupMetricWithOptions(DescribeContainerGroupMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerGroupMetric"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerGroupMetricResponse());
    }

    /**
     * <b>description</b> :
     * <p>  A maximum of 50 monitoring data entries can be returned. If the number of monitoring data entries exceeds this limit, an error message is returned.</p>
     * <ul>
     * <li>You can query real-time monitoring data (data generated within the last 5 minutes) and historical data (data generated more than 5 minutes ago). If the time range to query starts or ends later than the current time, historical monitoring data generated more than 5 minutes ago is returned.</li>
     * <li>The elastic container instance whose monitoring data you want to query must be created after April 3, 2019, 15:00 UTC+8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of an elastic container instance.</p>
     * 
     * @param request DescribeContainerGroupMetricRequest
     * @return DescribeContainerGroupMetricResponse
     */
    public DescribeContainerGroupMetricResponse describeContainerGroupMetric(DescribeContainerGroupMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation, you cannot use resource groups to control the permissions of a RAM user.</p>
     * <ul>
     * <li>You can create an elastic container instance by specifying vCPU and memory resource specifications or by specifying ECS instance types. When you call this operation to query the prices of elastic container instances, pass in specifications of the elastic container instances.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">vCPU and memory specifications</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">ECS instance types that are supported by Elastic Container Instance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of an elastic container instance.</p>
     * 
     * @param request DescribeContainerGroupPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerGroupPriceResponse
     */
    public DescribeContainerGroupPriceResponse describeContainerGroupPriceWithOptions(DescribeContainerGroupPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computeCategory)) {
            query.put("ComputeCategory", request.computeCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.spotDuration)) {
            query.put("SpotDuration", request.spotDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerGroupPrice"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerGroupPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation, you cannot use resource groups to control the permissions of a RAM user.</p>
     * <ul>
     * <li>You can create an elastic container instance by specifying vCPU and memory resource specifications or by specifying ECS instance types. When you call this operation to query the prices of elastic container instances, pass in specifications of the elastic container instances.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">vCPU and memory specifications</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">ECS instance types that are supported by Elastic Container Instance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of an elastic container instance.</p>
     * 
     * @param request DescribeContainerGroupPriceRequest
     * @return DescribeContainerGroupPriceResponse
     */
    public DescribeContainerGroupPriceResponse describeContainerGroupPrice(DescribeContainerGroupPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statuses of multiple container groups at a time.</p>
     * 
     * @param request DescribeContainerGroupStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerGroupStatusResponse
     */
    public DescribeContainerGroupStatusResponse describeContainerGroupStatusWithOptions(DescribeContainerGroupStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupIds)) {
            query.put("ContainerGroupIds", request.containerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinceSecond)) {
            query.put("SinceSecond", request.sinceSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerGroupStatus"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerGroupStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statuses of multiple container groups at a time.</p>
     * 
     * @param request DescribeContainerGroupStatusRequest
     * @return DescribeContainerGroupStatusResponse
     */
    public DescribeContainerGroupStatusResponse describeContainerGroupStatus(DescribeContainerGroupStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After an elastic container instance is terminated, its underlying computing resources are recycled. By default, other resources, such as elastic IP addresses (EIPs), that are created together with the instance are released together with the instance.</p>
     * <ul>
     * <li>The metadata of an instance in the final status (Failed, Succeeded, or Expired) is retained based on the following rules:<ul>
     * <li>All metadata information is retained within 1 hour since the instance enters the final status.</li>
     * <li>One hour after the instance enters the final status, only the latest 100 entries of metadata information in each region are retained.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about multiple elastic container instances at a time.</p>
     * 
     * @param request DescribeContainerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerGroupsResponse
     */
    public DescribeContainerGroupsResponse describeContainerGroupsWithOptions(DescribeContainerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computeCategory)) {
            query.put("ComputeCategory", request.computeCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupIds)) {
            query.put("ContainerGroupIds", request.containerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupName)) {
            query.put("ContainerGroupName", request.containerGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEvent)) {
            query.put("WithEvent", request.withEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerGroups"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After an elastic container instance is terminated, its underlying computing resources are recycled. By default, other resources, such as elastic IP addresses (EIPs), that are created together with the instance are released together with the instance.</p>
     * <ul>
     * <li>The metadata of an instance in the final status (Failed, Succeeded, or Expired) is retained based on the following rules:<ul>
     * <li>All metadata information is retained within 1 hour since the instance enters the final status.</li>
     * <li>One hour after the instance enters the final status, only the latest 100 entries of metadata information in each region are retained.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about multiple elastic container instances at a time.</p>
     * 
     * @param request DescribeContainerGroupsRequest
     * @return DescribeContainerGroupsResponse
     */
    public DescribeContainerGroupsResponse describeContainerGroups(DescribeContainerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a container in a container group.</p>
     * 
     * @param request DescribeContainerLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContainerLogResponse
     */
    public DescribeContainerLogResponse describeContainerLogWithOptions(DescribeContainerLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerName)) {
            query.put("ContainerName", request.containerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastTime)) {
            query.put("LastTime", request.lastTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitBytes)) {
            query.put("LimitBytes", request.limitBytes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sinceSeconds)) {
            query.put("SinceSeconds", request.sinceSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tail)) {
            query.put("Tail", request.tail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamps)) {
            query.put("Timestamps", request.timestamps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContainerLog"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContainerLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a container in a container group.</p>
     * 
     * @param request DescribeContainerLogRequest
     * @return DescribeContainerLogResponse
     */
    public DescribeContainerLogResponse describeContainerLog(DescribeContainerLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContainerLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about data caches.</p>
     * 
     * @param request DescribeDataCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataCachesResponse
     */
    public DescribeDataCachesResponse describeDataCachesWithOptions(DescribeDataCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheId)) {
            query.put("DataCacheId", request.dataCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "DescribeDataCaches"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about data caches.</p>
     * 
     * @param request DescribeDataCachesRequest
     * @return DescribeDataCachesResponse
     */
    public DescribeDataCachesResponse describeDataCaches(DescribeDataCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about image caches.</p>
     * 
     * @param request DescribeImageCachesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageCachesResponse
     */
    public DescribeImageCachesResponse describeImageCachesWithOptions(DescribeImageCachesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheId)) {
            query.put("ImageCacheId", request.imageCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheName)) {
            query.put("ImageCacheName", request.imageCacheName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageFullMatch)) {
            query.put("ImageFullMatch", request.imageFullMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageMatchCountRequest)) {
            query.put("ImageMatchCountRequest", request.imageMatchCountRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchImage)) {
            query.put("MatchImage", request.matchImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageCaches"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageCachesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about image caches.</p>
     * 
     * @param request DescribeImageCachesRequest
     * @return DescribeImageCachesResponse
     */
    public DescribeImageCachesResponse describeImageCaches(DescribeImageCachesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageCachesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about operations and maintenance tasks of an elastic container instance.</p>
     * 
     * @param request DescribeInstanceOpsRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceOpsRecordsResponse
     */
    public DescribeInstanceOpsRecordsResponse describeInstanceOpsRecordsWithOptions(DescribeInstanceOpsRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsType)) {
            query.put("OpsType", request.opsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceOpsRecords"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceOpsRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about operations and maintenance tasks of an elastic container instance.</p>
     * 
     * @param request DescribeInstanceOpsRecordsRequest
     * @return DescribeInstanceOpsRecordsResponse
     */
    public DescribeInstanceOpsRecordsResponse describeInstanceOpsRecords(DescribeInstanceOpsRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceOpsRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only the latest entry of monitoring data of each elastic container instance is returned.</p>
     * <ul>
     * <li>You can query only the monitoring data of elastic container instances that are created after April 3, 2019 15:00:00 UTC+8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of elastic container instances.</p>
     * 
     * @param request DescribeMultiContainerGroupMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMultiContainerGroupMetricResponse
     */
    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetricWithOptions(DescribeMultiContainerGroupMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupIds)) {
            query.put("ContainerGroupIds", request.containerGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
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
            new TeaPair("action", "DescribeMultiContainerGroupMetric"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMultiContainerGroupMetricResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only the latest entry of monitoring data of each elastic container instance is returned.</p>
     * <ul>
     * <li>You can query only the monitoring data of elastic container instances that are created after April 3, 2019 15:00:00 UTC+8.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of elastic container instances.</p>
     * 
     * @param request DescribeMultiContainerGroupMetricRequest
     * @return DescribeMultiContainerGroupMetricResponse
     */
    public DescribeMultiContainerGroupMetricResponse describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMultiContainerGroupMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions and zones in which Elastic Container Instance is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-08-08"),
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
     * <p>Queries the regions and zones in which Elastic Container Instance is available.</p>
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
     * <p>Queries information about virtual nodes.</p>
     * 
     * @param request DescribeVirtualNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVirtualNodesResponse
     */
    public DescribeVirtualNodesResponse describeVirtualNodesWithOptions(DescribeVirtualNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeIds)) {
            query.put("VirtualNodeIds", request.virtualNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeName)) {
            query.put("VirtualNodeName", request.virtualNodeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVirtualNodes"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVirtualNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about virtual nodes.</p>
     * 
     * @param request DescribeVirtualNodesRequest
     * @return DescribeVirtualNodesResponse
     */
    public DescribeVirtualNodesResponse describeVirtualNodes(DescribeVirtualNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVirtualNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs commands in a container.</p>
     * 
     * @param request ExecContainerCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecContainerCommandResponse
     */
    public ExecContainerCommandResponse execContainerCommandWithOptions(ExecContainerCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerName)) {
            query.put("ContainerName", request.containerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.stdin)) {
            query.put("Stdin", request.stdin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sync)) {
            query.put("Sync", request.sync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TTY)) {
            query.put("TTY", request.TTY);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecContainerCommand"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecContainerCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs commands in a container.</p>
     * 
     * @param request ExecContainerCommandRequest
     * @return ExecContainerCommandResponse
     */
    public ExecContainerCommandResponse execContainerCommand(ExecContainerCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execContainerCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户tag</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2018-08-08"),
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
     * <b>summary</b> : 
     * <p>查询用户tag</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation does not support resource group authentication.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the used amounts and upper limits of privileges and quotas that you have in a specified region.</p>
     * 
     * @param request ListUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsageResponse
     */
    public ListUsageResponse listUsageWithOptions(ListUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsage"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation does not support resource group authentication.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the used amounts and upper limits of privileges and quotas that you have in a specified region.</p>
     * 
     * @param request ListUsageRequest
     * @return ListUsageResponse
     */
    public ListUsageResponse listUsage(ListUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can scale up volumes by calling this operation. You cannot scale down volumes by calling this operation. Only volumes of Alibaba Cloud disks can be scaled up.</p>
     * 
     * <b>summary</b> : 
     * <p>Scales out volumes on an elastic container instance.</p>
     * 
     * @param request ResizeContainerGroupVolumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResizeContainerGroupVolumeResponse
     */
    public ResizeContainerGroupVolumeResponse resizeContainerGroupVolumeWithOptions(ResizeContainerGroupVolumeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSize)) {
            query.put("NewSize", request.newSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.volumeName)) {
            query.put("VolumeName", request.volumeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResizeContainerGroupVolume"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResizeContainerGroupVolumeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can scale up volumes by calling this operation. You cannot scale down volumes by calling this operation. Only volumes of Alibaba Cloud disks can be scaled up.</p>
     * 
     * <b>summary</b> : 
     * <p>Scales out volumes on an elastic container instance.</p>
     * 
     * @param request ResizeContainerGroupVolumeRequest
     * @return ResizeContainerGroupVolumeResponse
     */
    public ResizeContainerGroupVolumeResponse resizeContainerGroupVolume(ResizeContainerGroupVolumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeContainerGroupVolumeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only elastic container instances that are in the Pending or Running state can be restarted. Instances that are in the Succeeded or Failed state cannot be restarted.</p>
     * <ul>
     * <li>Elastic container instances that were created before 15:00:00 on March 7, 2019 cannot be restarted.</li>
     * <li>When an elastic container instance is being restarted, its status changes into Restarting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts an elastic container instance.</p>
     * 
     * @param request RestartContainerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartContainerGroupResponse
     */
    public RestartContainerGroupResponse restartContainerGroupWithOptions(RestartContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartContainerGroup"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartContainerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only elastic container instances that are in the Pending or Running state can be restarted. Instances that are in the Succeeded or Failed state cannot be restarted.</p>
     * <ul>
     * <li>Elastic container instances that were created before 15:00:00 on March 7, 2019 cannot be restarted.</li>
     * <li>When an elastic container instance is being restarted, its status changes into Restarting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restarts an elastic container instance.</p>
     * 
     * @param request RestartContainerGroupRequest
     * @return RestartContainerGroupResponse
     */
    public RestartContainerGroupResponse restartContainerGroup(RestartContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartContainerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打用户tag</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2018-08-08"),
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
     * <b>summary</b> : 
     * <p>打用户tag</p>
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
     * <p>去除用户tag</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
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
            new TeaPair("version", "2018-08-08"),
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
     * <p>去除用户tag</p>
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
     * <p>  Only elastic container instances that are in the Pending or Running state can be updated. After you call this operation to update an elastic container instance, the instance enters the Updating state.</p>
     * <ul>
     * <li>If the RestartPolicy parameter is set to Never for the elastic container instance that you are updating, the containers of the instance may fail. Exercise caution if you want to update the kind of instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an elastic container instance.</p>
     * 
     * @param request UpdateContainerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContainerGroupResponse
     */
    public UpdateContainerGroupResponse updateContainerGroupWithOptions(UpdateContainerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfo)) {
            query.put("AcrRegistryInfo", request.acrRegistryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.container)) {
            query.put("Container", request.container);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerGroupId)) {
            query.put("ContainerGroupId", request.containerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredential)) {
            query.put("ImageRegistryCredential", request.imageRegistryCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainer)) {
            query.put("InitContainer", request.initContainer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restartPolicy)) {
            query.put("RestartPolicy", request.restartPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            query.put("UpdateType", request.updateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dnsConfig)) {
            query.put("DnsConfig", request.dnsConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContainerGroup"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContainerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only elastic container instances that are in the Pending or Running state can be updated. After you call this operation to update an elastic container instance, the instance enters the Updating state.</p>
     * <ul>
     * <li>If the RestartPolicy parameter is set to Never for the elastic container instance that you are updating, the containers of the instance may fail. Exercise caution if you want to update the kind of instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates an elastic container instance.</p>
     * 
     * @param request UpdateContainerGroupRequest
     * @return UpdateContainerGroupResponse
     */
    public UpdateContainerGroupResponse updateContainerGroup(UpdateContainerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContainerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data cache.</p>
     * 
     * @param request UpdateDataCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataCacheResponse
     */
    public UpdateDataCacheResponse updateDataCacheWithOptions(UpdateDataCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCacheId)) {
            query.put("DataCacheId", request.dataCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            query.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipCreateParam)) {
            query.put("EipCreateParam", request.eipCreateParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
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
            new TeaPair("action", "UpdateDataCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataCacheResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data cache.</p>
     * 
     * @param request UpdateDataCacheRequest
     * @return UpdateDataCacheResponse
     */
    public UpdateDataCacheResponse updateDataCache(UpdateDataCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataCacheWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only image caches that are in the Ready or UpdateFailed state can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an image cache.</p>
     * 
     * @param request UpdateImageCacheRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageCacheResponse
     */
    public UpdateImageCacheResponse updateImageCacheWithOptions(UpdateImageCacheRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrRegistryInfo)) {
            query.put("AcrRegistryInfo", request.acrRegistryInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoMatchImageCache)) {
            query.put("AutoMatchImageCache", request.autoMatchImageCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipInstanceId)) {
            query.put("EipInstanceId", request.eipInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eliminationStrategy)) {
            query.put("EliminationStrategy", request.eliminationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flash)) {
            query.put("Flash", request.flash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flashCopyCount)) {
            query.put("FlashCopyCount", request.flashCopyCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheId)) {
            query.put("ImageCacheId", request.imageCacheId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheName)) {
            query.put("ImageCacheName", request.imageCacheName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCacheSize)) {
            query.put("ImageCacheSize", request.imageCacheSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRegistryCredential)) {
            query.put("ImageRegistryCredential", request.imageRegistryCredential);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardCopyCount)) {
            query.put("StandardCopyCount", request.standardCopyCount);
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
            new TeaPair("action", "UpdateImageCache"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageCacheResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only image caches that are in the Ready or UpdateFailed state can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an image cache.</p>
     * 
     * @param request UpdateImageCacheRequest
     * @return UpdateImageCacheResponse
     */
    public UpdateImageCacheResponse updateImageCache(UpdateImageCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageCacheWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Only virtual nodes that are in the Ready state can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates attributes of a virtual node.</p>
     * 
     * @param request UpdateVirtualNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVirtualNodeResponse
     */
    public UpdateVirtualNodeResponse updateVirtualNodeWithOptions(UpdateVirtualNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDNS)) {
            query.put("ClusterDNS", request.clusterDNS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDomain)) {
            query.put("ClusterDomain", request.clusterDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customResources)) {
            query.put("CustomResources", request.customResources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeId)) {
            query.put("VirtualNodeId", request.virtualNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodeName)) {
            query.put("VirtualNodeName", request.virtualNodeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVirtualNode"),
            new TeaPair("version", "2018-08-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVirtualNodeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Only virtual nodes that are in the Ready state can be updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates attributes of a virtual node.</p>
     * 
     * @param request UpdateVirtualNodeRequest
     * @return UpdateVirtualNodeResponse
     */
    public UpdateVirtualNodeResponse updateVirtualNode(UpdateVirtualNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVirtualNodeWithOptions(request, runtime);
    }
}
