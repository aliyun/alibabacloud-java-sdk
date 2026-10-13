// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626;

import com.aliyun.tea.*;
import com.aliyun.nas20170626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou-finance", "nas.cn-hangzhou-dg-a01.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "nas.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "nas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "nas.aliyuncs.com"),
            new TeaPair("cn-fujian", "nas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "nas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "nas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "nas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "nas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "nas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "nas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "nas.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "nas.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "nas.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>This operation supports only CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a client to the blacklist in Cloud Parallel File Storage (CPFS) to evict its write requests, which serves as an I/O fencing mechanism.</p>
     * 
     * @deprecated OpenAPI AddClientToBlackList is deprecated
     * 
     * @param request AddClientToBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    // Deprecated
    public AddClientToBlackListResponse addClientToBlackListWithOptions(AddClientToBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

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
            new TeaPair("action", "AddClientToBlackList"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClientToBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a client to the blacklist in Cloud Parallel File Storage (CPFS) to evict its write requests, which serves as an I/O fencing mechanism.</p>
     * 
     * @deprecated OpenAPI AddClientToBlackList is deprecated
     * 
     * @param request AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    // Deprecated
    public AddClientToBlackListResponse addClientToBlackList(AddClientToBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClientToBlackListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Only Advanced Extreme NAS file systems support this operation. Before you call this operation, complete the following preparations:</p>
     * <ul>
     * <li>An Advanced Extreme NAS file system is created. When you call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li>FileSystemType: extreme</li>
     * <li>StorageType: advance</li>
     * </ul>
     * </li>
     * <li>An automatic snapshot policy is created. For more information, see <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createautosnapshotpolicy">CreateAutoSnapshotPolicy</a>.</li>
     * <li>The AliyunNASManageENIRole authorization is completed in the console. Before creating an Extreme NAS file system, associate the AliyunNASManageENIRole service-linked role with File Storage NAS to allow File Storage NAS to manage network interface controllers (NICs). For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.
     * <strong>Operation description</strong>
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies an automatic snapshot policy to one or more file systems.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicyWithOptions(ApplyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
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
     * <p><em>Before you begin</em>*
     * Only Advanced Extreme NAS file systems support this operation. Before you call this operation, complete the following preparations:</p>
     * <ul>
     * <li>An Advanced Extreme NAS file system is created. When you call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li>FileSystemType: extreme</li>
     * <li>StorageType: advance</li>
     * </ul>
     * </li>
     * <li>An automatic snapshot policy is created. For more information, see <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createautosnapshotpolicy">CreateAutoSnapshotPolicy</a>.</li>
     * <li>The AliyunNASManageENIRole authorization is completed in the console. Before creating an Extreme NAS file system, associate the AliyunNASManageENIRole service-linked role with File Storage NAS to allow File Storage NAS to manage network interface controllers (NICs). For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.
     * <strong>Operation description</strong>
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Each file system can have only one automatic snapshot policy applied.</li>
     * <li>An automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If the target file system already has an automatic snapshot policy applied, calling the ApplyAutoSnapshotPolicy operation replaces the current automatic snapshot policy of the file system.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies an automatic snapshot policy to one or more file systems.</p>
     * 
     * @param request ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    public ApplyAutoSnapshotPolicyResponse applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add automatic update configurations only for data flows in the <code>Running</code> state.</li>
     * <li>You can add up to five automatic update configurations for a data flow.</li>
     * <li>It generally takes 2 to 5 minutes to create an automatic update configuration. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to query the data flow status.</li>
     * <li>Automatic updates depend on EventBridge to collect object modification events from the source OSS storage. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.<blockquote>
     * <p>The event buses and event rules that CPFS creates in EventBridge contain the description <code>Create for cpfs auto refresh</code>. Do not modify or delete these event buses or event rules. Otherwise, automatic updates cannot work properly.</p>
     * </blockquote>
     * </li>
     * <li>Automatic updates apply to prefixes specified by the RefreshPath parameter. When CPFS configures automatic synchronization for a prefix in a data flow, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object modification occurs within the prefix of the source OSS bucket, an OSS event is generated in EventBridge and processed by the CPFS data flow.</li>
     * <li>After you configure automatic updates (AutoRefresh), when data changes in the source storage, the changed metadata is automatically synchronized to the CPFS file system. The changed data is loaded on demand when a user accesses the file, or you can start a data stream task to load the data.</li>
     * <li>The automatic update interval (AutoRefreshInterval) specifies the interval at which CPFS checks whether data updates exist within the prefix of the source OSS bucket. If data updates exist, an automatic synchronization task is started. When the frequency of object modification events in the source OSS bucket exceeds the processing capability of the CPFS data flow, automatic update tasks accumulate, metadata updates are delayed, and the data flow status changes to Misconfigured. To resolve this issue, upgrade the data flow specifications or reduce the modification frequency in OSS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures automatic updates for a specified data flow.</p>
     * 
     * @param request ApplyDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyDataFlowAutoRefreshResponse
     */
    public ApplyDataFlowAutoRefreshResponse applyDataFlowAutoRefreshWithOptions(ApplyDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshs)) {
            query.put("AutoRefreshs", request.autoRefreshs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add automatic update configurations only for data flows in the <code>Running</code> state.</li>
     * <li>You can add up to five automatic update configurations for a data flow.</li>
     * <li>It generally takes 2 to 5 minutes to create an automatic update configuration. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to query the data flow status.</li>
     * <li>Automatic updates depend on EventBridge to collect object modification events from the source OSS storage. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.<blockquote>
     * <p>The event buses and event rules that CPFS creates in EventBridge contain the description <code>Create for cpfs auto refresh</code>. Do not modify or delete these event buses or event rules. Otherwise, automatic updates cannot work properly.</p>
     * </blockquote>
     * </li>
     * <li>Automatic updates apply to prefixes specified by the RefreshPath parameter. When CPFS configures automatic synchronization for a prefix in a data flow, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object modification occurs within the prefix of the source OSS bucket, an OSS event is generated in EventBridge and processed by the CPFS data flow.</li>
     * <li>After you configure automatic updates (AutoRefresh), when data changes in the source storage, the changed metadata is automatically synchronized to the CPFS file system. The changed data is loaded on demand when a user accesses the file, or you can start a data stream task to load the data.</li>
     * <li>The automatic update interval (AutoRefreshInterval) specifies the interval at which CPFS checks whether data updates exist within the prefix of the source OSS bucket. If data updates exist, an automatic synchronization task is started. When the frequency of object modification events in the source OSS bucket exceeds the processing capability of the CPFS data flow, automatic update tasks accumulate, metadata updates are delayed, and the data flow status changes to Misconfigured. To resolve this issue, upgrade the data flow specifications or reduce the modification frequency in OSS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures automatic updates for a specified data flow.</p>
     * 
     * @param request ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    public ApplyDataFlowAutoRefreshResponse applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a Virtual Storage Channel (VSC) device with a file system.</p>
     * 
     * @param request AttachVscToFilesystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVscToFilesystemsResponse
     */
    public AttachVscToFilesystemsResponse attachVscToFilesystemsWithOptions(AttachVscToFilesystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleChain)) {
            query.put("RoleChain", request.roleChain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVscToFilesystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVscToFilesystemsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates a Virtual Storage Channel (VSC) device with a file system.</p>
     * 
     * @param request AttachVscToFilesystemsRequest
     * @return AttachVscToFilesystemsResponse
     */
    public AttachVscToFilesystemsResponse attachVscToFilesystems(AttachVscToFilesystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVscToFilesystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the automatic snapshot policy that is created for a file system.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicyWithOptions(CancelAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the automatic snapshot policy that is created for a file system.</p>
     * 
     * @param request CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    public CancelAutoSnapshotPolicyResponse cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAutoSnapshotPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Data flows are supported only by CPFS 2.2.0 and later. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel the automatic update configuration only for data flows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Canceling the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the cancel automatic update task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the automatic update configuration for a specified data flow.</p>
     * 
     * @param request CancelDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowAutoRefreshResponse
     */
    public CancelDataFlowAutoRefreshResponse cancelDataFlowAutoRefreshWithOptions(CancelDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshPath)) {
            query.put("RefreshPath", request.refreshPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Data flows are supported only by CPFS 2.2.0 and later. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel the automatic update configuration only for data flows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Canceling the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the cancel automatic update task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the automatic update configuration for a specified data flow.</p>
     * 
     * @param request CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    public CancelDataFlowAutoRefreshResponse cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisite resource creation process</em>*
     * Before you cancel a data flow streaming subtask, create the following resources in order:</p>
     * <ol>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> to create a data flow.</li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.</li>
     * <li>Create a data flow streaming subtask: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowsubtask-bmcpfs">CreateDataFlowSubTask</a> to create a streaming subtask.<blockquote>
     * <p>CPFS for Lingjun file systems must be created in the console.
     * <strong>Operation description</strong></p>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later are supported. You can view the version information on the file system details page in the console.</li>
     * <li>Prerequisites: A CPFS for Lingjun file system is created, the DataFlow is in the Running state, the DataFlowTask is in the Executing state, and the DataFlowSubTask is in the CREATED or RUNNING state.</li>
     * <li>You can cancel a data flow streaming subtask only when it is in the CREATED or RUNNING state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data flow streaming subtask.</p>
     * 
     * @param request CancelDataFlowSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowSubTaskResponse
     */
    public CancelDataFlowSubTaskResponse cancelDataFlowSubTaskWithOptions(CancelDataFlowSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowSubTaskId)) {
            query.put("DataFlowSubTaskId", request.dataFlowSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowTaskId)) {
            query.put("DataFlowTaskId", request.dataFlowTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowSubTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisite resource creation process</em>*
     * Before you cancel a data flow streaming subtask, create the following resources in order:</p>
     * <ol>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> to create a data flow.</li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.</li>
     * <li>Create a data flow streaming subtask: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowsubtask-bmcpfs">CreateDataFlowSubTask</a> to create a streaming subtask.<blockquote>
     * <p>CPFS for Lingjun file systems must be created in the console.
     * <strong>Operation description</strong></p>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later are supported. You can view the version information on the file system details page in the console.</li>
     * <li>Prerequisites: A CPFS for Lingjun file system is created, the DataFlow is in the Running state, the DataFlowTask is in the Executing state, and the DataFlowSubTask is in the CREATED or RUNNING state.</li>
     * <li>You can cancel a data flow streaming subtask only when it is in the CREATED or RUNNING state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data flow streaming subtask.</p>
     * 
     * @param request CancelDataFlowSubTaskRequest
     * @return CancelDataFlowSubTaskResponse
     */
    public CancelDataFlowSubTaskResponse cancelDataFlowSubTask(CancelDataFlowSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each layer are in the required state:</p>
     * <ol>
     * <li>Create a file system: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a CPFS file system.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a mount target: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createmounttarget-cpfs">CreateMountTarget</a> to create a mount target.<ul>
     * <li>State requirement: The mount target is in the Active state.</li>
     * </ul>
     * </li>
     * <li>Create a fileset: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfileset-cpfs">CreateFileset</a> to create a fileset.<ul>
     * <li>State requirement: The fileset is created.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a data flow task.
     * <strong>Operation description</strong></li>
     * </ol>
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flow tasks. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flow tasks in the <code>Pending</code> state can be canceled.</li>
     * <li>Canceling a data flow task typically takes 5 to 10 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status.</li>
     * <li>If a streaming data flow task contains running streaming subtasks, the streaming task cannot be canceled. Otherwise, the InvalidStatus.ResourceMismatch error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data flow batch task or streaming task that is in the Pending or Executing state.</p>
     * 
     * @param request CancelDataFlowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDataFlowTaskResponse
     */
    public CancelDataFlowTaskResponse cancelDataFlowTaskWithOptions(CancelDataFlowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDataFlowTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDataFlowTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each layer are in the required state:</p>
     * <ol>
     * <li>Create a file system: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a CPFS file system.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a mount target: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createmounttarget-cpfs">CreateMountTarget</a> to create a mount target.<ul>
     * <li>State requirement: The mount target is in the Active state.</li>
     * </ul>
     * </li>
     * <li>Create a fileset: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfileset-cpfs">CreateFileset</a> to create a fileset.<ul>
     * <li>State requirement: The fileset is created.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a data flow task.
     * <strong>Operation description</strong></li>
     * </ol>
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flow tasks. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flow tasks in the <code>Pending</code> state can be canceled.</li>
     * <li>Canceling a data flow task typically takes 5 to 10 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status.</li>
     * <li>If a streaming data flow task contains running streaming subtasks, the streaming task cannot be canceled. Otherwise, the InvalidStatus.ResourceMismatch error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data flow batch task or streaming task that is in the Pending or Executing state.</p>
     * 
     * @param request CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    public CancelDataFlowTaskResponse cancelDataFlowTask(CancelDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the directory quota of a file system.</p>
     * 
     * @param request CancelDirQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelDirQuotaResponse
     */
    public CancelDirQuotaResponse cancelDirQuotaWithOptions(CancelDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelDirQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelDirQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the directory quota of a file system.</p>
     * 
     * @param request CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    public CancelDirQuotaResponse cancelDirQuota(CancelDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelDirQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS for Lingjun 2.7.0 and later support quota cancellation.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation applies only to CPFS for Lingjun file systems of version 2.7.0 or later.</li>
     * <li>The file system ID must start with <code>bmcpfs-</code>.</li>
     * <li>Before you call this operation, make sure that a quota has been configured for the target fileset by calling the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-setfilesetquota-bmcpfs">SetFilesetQuota</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the quota configured for a fileset.</p>
     * 
     * @param request CancelFilesetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelFilesetQuotaResponse
     */
    public CancelFilesetQuotaResponse cancelFilesetQuotaWithOptions(CancelFilesetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelFilesetQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelFilesetQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS for Lingjun 2.7.0 and later support quota cancellation.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation applies only to CPFS for Lingjun file systems of version 2.7.0 or later.</li>
     * <li>The file system ID must start with <code>bmcpfs-</code>.</li>
     * <li>Before you call this operation, make sure that a quota has been configured for the target fileset by calling the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-setfilesetquota-bmcpfs">SetFilesetQuota</a> operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels the quota configured for a fileset.</p>
     * 
     * @param request CancelFilesetQuotaRequest
     * @return CancelFilesetQuotaResponse
     */
    public CancelFilesetQuotaResponse cancelFilesetQuota(CancelFilesetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelFilesetQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data retrieval task that is in the active state.</p>
     * 
     * @param request CancelLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelLifecycleRetrieveJobResponse
     */
    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJobWithOptions(CancelLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a data retrieval task that is in the active state.</p>
     * 
     * @param request CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    public CancelLifecycleRetrieveJobResponse cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can cancel only tasks that are in the Running state. The cancel operation does not take effect on tasks that have reached a final state (PartialSuccess, Success, Fail, or Cancelled).</li>
     * <li>When you cancel a running permanent deletion task, files that have already been permanently deleted cannot be recovered.</li>
     * <li>When you cancel a running file restoration task, restored files can be queried in the file system, and unrestored files can be queried in the recycle bin.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running task in the recycle bin.</p>
     * 
     * @param request CancelRecycleBinJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRecycleBinJobResponse
     */
    public CancelRecycleBinJobResponse cancelRecycleBinJobWithOptions(CancelRecycleBinJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRecycleBinJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRecycleBinJobResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can cancel only tasks that are in the Running state. The cancel operation does not take effect on tasks that have reached a final state (PartialSuccess, Success, Fail, or Cancelled).</li>
     * <li>When you cancel a running permanent deletion task, files that have already been permanently deleted cannot be recovered.</li>
     * <li>When you cancel a running file restoration task, restored files can be queried in the file system, and unrestored files can be queried in the recycle bin.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels a running task in the recycle bin.</p>
     * 
     * @param request CancelRecycleBinJobRequest
     * @return CancelRecycleBinJobResponse
     */
    public CancelRecycleBinJobResponse cancelRecycleBinJob(CancelRecycleBinJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRecycleBinJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a file system instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a file system instance belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A maximum of 20 permission groups can be created per Alibaba Cloud account in a single region.</li>
     * <li>A maximum of 300 rules can be added to a permission group.</li>
     * <li>Only permission groups of the VPC network type can be created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupType)) {
            query.put("AccessGroupType", request.accessGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessGroup"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <ul>
     * <li>A maximum of 20 permission groups can be created per Alibaba Cloud account in a single region.</li>
     * <li>A maximum of 300 rules can be added to a permission group.</li>
     * <li>Only permission groups of the VPC network type can be created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission group.</p>
     * 
     * @param request CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    public CreateAccessGroupResponse createAccessGroup(CreateAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you invoke the CreateAccessPoint operation to create an access point, some resources are generated asynchronously. After the CreateAccessPoint operation succeeds, execute the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the access point status. Mount the file system only after the access point status becomes <strong>Active</strong>. Otherwise, the mount may fail.</li>
     * <li>Only General-purpose NAS NFS file systems support this feature.</li>
     * <li>If you enable the RAM policy (EnabledRam), configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage access points</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point.</p>
     * 
     * @param request CreateAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessPointResponse
     */
    public CreateAccessPointResponse createAccessPointWithOptions(CreateAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointName)) {
            query.put("AccessPointName", request.accessPointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agenticSpaceId)) {
            query.put("AgenticSpaceId", request.agenticSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledRam)) {
            query.put("EnabledRam", request.enabledRam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerGroupId)) {
            query.put("OwnerGroupId", request.ownerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixGroupId)) {
            query.put("PosixGroupId", request.posixGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixSecondaryGroupIds)) {
            query.put("PosixSecondaryGroupIds", request.posixSecondaryGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posixUserId)) {
            query.put("PosixUserId", request.posixUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDirectory)) {
            query.put("RootDirectory", request.rootDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswId)) {
            query.put("VswId", request.vswId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you invoke the CreateAccessPoint operation to create an access point, some resources are generated asynchronously. After the CreateAccessPoint operation succeeds, execute the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the access point status. Mount the file system only after the access point status becomes <strong>Active</strong>. Otherwise, the mount may fail.</li>
     * <li>Only General-purpose NAS NFS file systems support this feature.</li>
     * <li>If you enable the RAM policy (EnabledRam), configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage access points</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point.</p>
     * 
     * @param request CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    public CreateAccessPointResponse createAccessPoint(CreateAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can add up to 300 rules to a permission group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission rule for a permission group.</p>
     * 
     * @param request CreateAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessRuleResponse
     */
    public CreateAccessRuleResponse createAccessRuleWithOptions(CreateAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6SourceCidrIp)) {
            query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessType)) {
            query.put("UserAccessType", request.userAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessRule"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>You can add up to 300 rules to a permission group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a permission rule for a permission group.</p>
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
     * <p><em>Before you begin</em>*
     * Complete the following preparations before calling this operation:</p>
     * <ol>
     * <li><strong>An Agentic file system is created</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>To modify the Agentic space configuration, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-modifyagenticspace">ModifyAgenticSpace</a> operation.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Agentic space.</p>
     * 
     * @param request CreateAgenticSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgenticSpaceResponse
     */
    public CreateAgenticSpaceResponse createAgenticSpaceWithOptions(CreateAgenticSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.azone)) {
            query.put("Azone", request.azone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemPath)) {
            query.put("FileSystemPath", request.fileSystemPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            query.put("Quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgenticSpace"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgenticSpaceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Complete the following preparations before calling this operation:</p>
     * <ol>
     * <li><strong>An Agentic file system is created</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>To modify the Agentic space configuration, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-modifyagenticspace">ModifyAgenticSpace</a> operation.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Agentic space.</p>
     * 
     * @param request CreateAgenticSpaceRequest
     * @return CreateAgenticSpaceResponse
     */
    public CreateAgenticSpaceResponse createAgenticSpace(CreateAgenticSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgenticSpaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy.</p>
     * 
     * @param request CreateAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoSnapshotPolicyResponse
     */
    public CreateAutoSnapshotPolicyResponse createAutoSnapshotPolicyWithOptions(CreateAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyName)) {
            query.put("AutoSnapshotPolicyName", request.autoSnapshotPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdays)) {
            query.put("RepeatWeekdays", request.repeatWeekdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoints)) {
            query.put("TimePoints", request.timePoints);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic snapshot policy.</p>
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
     * <p>Creates an access point for a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point for a CPFS for Lingjun file system.</p>
     * 
     * @param request CreateCpfsAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCpfsAccessPointResponse
     */
    public CreateCpfsAccessPointResponse createCpfsAccessPointWithOptions(CreateCpfsAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDirectory)) {
            query.put("RootDirectory", request.rootDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCpfsAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCpfsAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an access point for a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access point for a CPFS for Lingjun file system.</p>
     * 
     * @param request CreateCpfsAccessPointRequest
     * @return CreateCpfsAccessPointResponse
     */
    public CreateCpfsAccessPointResponse createCpfsAccessPoint(CreateCpfsAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCpfsAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to the following products:<table>
     * <thead>
     * <tr>
     * <th>Product</th>
     * <th>File system ID format</th>
     * <th>Minimum version that supports data flows</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><strong>General-purpose CPFS</strong></td>
     * <td>Starts with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em></td>
     * <td>2.2.0 or later</td>
     * </tr>
     * <tr>
     * <td><strong>CPFS for Lingjun</strong></td>
     * <td>Starts with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em></td>
     * <td>2.4.0 or later</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>General-purpose CPFS and CPFS for Lingjun share the same set of API operations but differ in parameter values and feature support. Refer to the corresponding section based on the product type you use.</p>
     * </blockquote>
     * </li>
     * <li>Basic operations<ul>
     * <li>You can create a data flow only when the General-purpose CPFS or CPFS for Lingjun file system is in the Running state.</li>
     * <li>A maximum of <strong>10</strong> data flows can be created for a single General-purpose CPFS or CPFS for Lingjun file system.</li>
     * <li>Creating a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to check whether the data flow is created.</li>
     * </ul>
     * </li>
     * <li>Permissions.
     *   When you create a data flow, Cloud Parallel File Storage obtains the <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code> service-linked roles. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>Usage notes for General-purpose CPFS.
     *    This section applies to General-purpose CPFS whose file system IDs start with <code>cpfs-</code>.<ul>
     * <li>Billing<ul>
     * <li>Creating a data flow incurs fees based on the data flow bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing of General-purpose CPFS</a>.</li>
     * <li>When you use auto-refresh, EventBridge collects object modification events from the source OSS storage, which incurs fees. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">EventBridge billing</a>.</li>
     * </ul>
     * </li>
     * <li>Data stream specifications<ul>
     * <li>The data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1200 MB/s, and 1500 MB/s. The data stream bandwidth refers to the maximum transfer bandwidth that the data stream can achieve during data import or export.</li>
     * <li>Creating a data flow consumes one vSwitch IP address used by the Cloud Parallel File Storage mount target. Make sure that sufficient vSwitch IP resources are available.</li>
     * <li>Inventory check: Setting DryRun to true checks whether the resources required to create a data stream of the specified specification are available.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination of a data flow is a Fileset in the General-purpose CPFS file system. A Fileset is a new directory tree structure in the General-purpose CPFS file system. It is a small file system within the parent file system and has an independent inode space and management capability.</li>
     * <li>The Fileset must already exist when you create a data flow and cannot be nested with other Filesets. Only one data flow can be created on a Fileset, corresponding to one source storage.</li>
     * <li>The maximum number of files in a Fileset is 1 million. If the number of files imported from an OSS bucket exceeds this limit, creating new files returns a <code>no space</code> error.<blockquote>
     * <p>If data already exists in the Fileset, the existing data in the Fileset is cleared and replaced with data synchronized from OSS after the data flow is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Automatic synchronization<ul>
     * <li>After automatic synchronization (AutoRefresh) is configured, when data in the source storage changes, the changed metadata is automatically synchronized to the Cloud Parallel File Storage file system. The changed data is loaded on demand when a user accesses the file, or loaded by starting a data stream node.</li>
     * <li>Automatic synchronization relies on EventBridge to collect object modification events from the source OSS storage. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The scope of automatic synchronization is a prefix, specified by the RefreshPath parameter. A maximum of 5 automatic synchronization folders can be configured for a data stream.</li>
     * <li>The automatic synchronization interval (AutoRefreshInterval) specifies the synchronization interval that Cloud Parallel File Storage sets for checking whether data updates exist in the specified prefix of the source OSS bucket. If data updates exist, an automatic synchronization node is started. When the frequency of object modification events in the source OSS exceeds the processing capacity of the Cloud Parallel File Storage data stream, automatic synchronization nodes accumulate, metadata updates are delayed, and the data stream status changes to <code>Misconfigured</code>. You can increase the data stream specification or reduce the OSS modification frequency to resolve this issue.</li>
     * <li>When automatic synchronization is configured for a prefix in a Cloud Parallel File Storage data stream, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object modification occurs in the prefix of the source OSS bucket, an OSS event is generated in EventBridge and processed by the Cloud Parallel File Storage data stream.<blockquote>
     * <p>The event bus and event rules created by Cloud Parallel File Storage in EventBridge have the description <code>Create for cpfs auto refresh</code>. Do not modify or delete the event bus or event rules. Otherwise, automatic synchronization does not work Normal.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The data stream source storage (SourceStorage) must be an OSS bucket.</li>
     * <li>Cloud Parallel File Storage data streams support both encrypted and non-encrypted access to OSS. If you select encrypted (SSL) access to OSS, confirm that the encryption in transit of the OSS bucket supports encrypted access.</li>
     * <li>If data streams of multiple Cloud Parallel File Storage file systems, or multiple data streams of the same Cloud Parallel File Storage file system, use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple Cloud Parallel File Storage file systems export data to the same source.</li>
     * <li>Cross-region OSS data streams are not supported. The OSS bucket must be in the same region as the Cloud Parallel File Storage file system.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the Cloud Parallel File Storage data stream can access the data in the bucket. Do not delete or modify this tag while the data stream is in use. Otherwise, the Cloud Parallel File Storage data stream cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Usage notes for CPFS for Lingjun.
     *    This section applies to CPFS for Lingjun whose file system IDs start with <code>bmcpfs-</code>.<ul>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support both encrypted and non-encrypted access to OSS. If you select encrypted (SSL) access to OSS, make sure that the encryption in transit of the OSS bucket supports encrypted access.</li>
     * <li>If data flows of multiple CPFS for Lingjun file systems, or multiple data flows of the same CPFS for Lingjun file system, use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple CPFS for Lingjun file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the CPFS for Lingjun file system.</li>
     * <li>CPFS for Lingjun 2.6.0 or later supports creating data flows with cross-account OSS.</li>
     * <li>The account ID parameter is required only when you use cross-account OSS.</li>
     * <li>When you use cross-account OSS, authorize the accounts first. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Cross-account data flow authorization</a>.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the CPFS for Lingjun data flow can access the data in the bucket. Do not delete or modify this tag while the data flow is in use. Otherwise, the CPFS for Lingjun data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Data flow restrictions on file systems.<ul>
     * <li>In the file system path associated with a data flow, you cannot rename a non-empty directory. Otherwise, a Permission Denied or directory not empty error is returned.</li>
     * <li>Use special characters in directory and file names with caution. The following characters are supported: uppercase and lowercase letters, digits, exclamation marks (!), hyphens (-), underscores (_), periods (.), asterisks (*), and parentheses (()).</li>
     * <li>Excessively long paths are not supported. The maximum path length supported by data flows is 1023 characters.</li>
     * </ul>
     * </li>
     * <li>Data flow import restrictions.<ul>
     * <li>After a symlink file is imported to CPFS for Lingjun, it is converted to a regular file that contains data, and the symlink information is lost.</li>
     * <li>If the OSS bucket has multiple versions, only the latest version is copied.</li>
     * <li>File names or subdirectory names longer than 255 bytes are not supported.</li>
     * </ul>
     * </li>
     * <li>Data flow export restrictions<ul>
     * <li>After a symlink file is synchronized to OSS, the file that the symlink points to is not synchronized. Instead, the symlink becomes a regular empty object with no data.</li>
     * <li>A hardlink file is synchronized to OSS as a regular file.</li>
     * <li>Socket, Device, and Pipe files are converted to regular empty objects with no data when exported to an OSS bucket.</li>
     * <li>Directory paths longer than 1023 characters are not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data flow between a CPFS file system (General-purpose or CPFS for Lingjun) and source storage.</p>
     * 
     * @param request CreateDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowResponse
     */
    public CreateDataFlowResponse createDataFlowWithOptions(CreateDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshs)) {
            query.put("AutoRefreshs", request.autoRefreshs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemPath)) {
            query.put("FileSystemPath", request.fileSystemPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSecurityType)) {
            query.put("SourceSecurityType", request.sourceSecurityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceStorage)) {
            query.put("SourceStorage", request.sourceStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceStoragePath)) {
            query.put("SourceStoragePath", request.sourceStoragePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to the following products:<table>
     * <thead>
     * <tr>
     * <th>Product</th>
     * <th>File system ID format</th>
     * <th>Minimum version that supports data flows</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><strong>General-purpose CPFS</strong></td>
     * <td>Starts with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em></td>
     * <td>2.2.0 or later</td>
     * </tr>
     * <tr>
     * <td><strong>CPFS for Lingjun</strong></td>
     * <td>Starts with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em></td>
     * <td>2.4.0 or later</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>General-purpose CPFS and CPFS for Lingjun share the same set of API operations but differ in parameter values and feature support. Refer to the corresponding section based on the product type you use.</p>
     * </blockquote>
     * </li>
     * <li>Basic operations<ul>
     * <li>You can create a data flow only when the General-purpose CPFS or CPFS for Lingjun file system is in the Running state.</li>
     * <li>A maximum of <strong>10</strong> data flows can be created for a single General-purpose CPFS or CPFS for Lingjun file system.</li>
     * <li>Creating a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to check whether the data flow is created.</li>
     * </ul>
     * </li>
     * <li>Permissions.
     *   When you create a data flow, Cloud Parallel File Storage obtains the <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code> service-linked roles. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>Usage notes for General-purpose CPFS.
     *    This section applies to General-purpose CPFS whose file system IDs start with <code>cpfs-</code>.<ul>
     * <li>Billing<ul>
     * <li>Creating a data flow incurs fees based on the data flow bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing of General-purpose CPFS</a>.</li>
     * <li>When you use auto-refresh, EventBridge collects object modification events from the source OSS storage, which incurs fees. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">EventBridge billing</a>.</li>
     * </ul>
     * </li>
     * <li>Data stream specifications<ul>
     * <li>The data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1200 MB/s, and 1500 MB/s. The data stream bandwidth refers to the maximum transfer bandwidth that the data stream can achieve during data import or export.</li>
     * <li>Creating a data flow consumes one vSwitch IP address used by the Cloud Parallel File Storage mount target. Make sure that sufficient vSwitch IP resources are available.</li>
     * <li>Inventory check: Setting DryRun to true checks whether the resources required to create a data stream of the specified specification are available.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination of a data flow is a Fileset in the General-purpose CPFS file system. A Fileset is a new directory tree structure in the General-purpose CPFS file system. It is a small file system within the parent file system and has an independent inode space and management capability.</li>
     * <li>The Fileset must already exist when you create a data flow and cannot be nested with other Filesets. Only one data flow can be created on a Fileset, corresponding to one source storage.</li>
     * <li>The maximum number of files in a Fileset is 1 million. If the number of files imported from an OSS bucket exceeds this limit, creating new files returns a <code>no space</code> error.<blockquote>
     * <p>If data already exists in the Fileset, the existing data in the Fileset is cleared and replaced with data synchronized from OSS after the data flow is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Automatic synchronization<ul>
     * <li>After automatic synchronization (AutoRefresh) is configured, when data in the source storage changes, the changed metadata is automatically synchronized to the Cloud Parallel File Storage file system. The changed data is loaded on demand when a user accesses the file, or loaded by starting a data stream node.</li>
     * <li>Automatic synchronization relies on EventBridge to collect object modification events from the source OSS storage. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The scope of automatic synchronization is a prefix, specified by the RefreshPath parameter. A maximum of 5 automatic synchronization folders can be configured for a data stream.</li>
     * <li>The automatic synchronization interval (AutoRefreshInterval) specifies the synchronization interval that Cloud Parallel File Storage sets for checking whether data updates exist in the specified prefix of the source OSS bucket. If data updates exist, an automatic synchronization node is started. When the frequency of object modification events in the source OSS exceeds the processing capacity of the Cloud Parallel File Storage data stream, automatic synchronization nodes accumulate, metadata updates are delayed, and the data stream status changes to <code>Misconfigured</code>. You can increase the data stream specification or reduce the OSS modification frequency to resolve this issue.</li>
     * <li>When automatic synchronization is configured for a prefix in a Cloud Parallel File Storage data stream, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object modification occurs in the prefix of the source OSS bucket, an OSS event is generated in EventBridge and processed by the Cloud Parallel File Storage data stream.<blockquote>
     * <p>The event bus and event rules created by Cloud Parallel File Storage in EventBridge have the description <code>Create for cpfs auto refresh</code>. Do not modify or delete the event bus or event rules. Otherwise, automatic synchronization does not work Normal.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The data stream source storage (SourceStorage) must be an OSS bucket.</li>
     * <li>Cloud Parallel File Storage data streams support both encrypted and non-encrypted access to OSS. If you select encrypted (SSL) access to OSS, confirm that the encryption in transit of the OSS bucket supports encrypted access.</li>
     * <li>If data streams of multiple Cloud Parallel File Storage file systems, or multiple data streams of the same Cloud Parallel File Storage file system, use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple Cloud Parallel File Storage file systems export data to the same source.</li>
     * <li>Cross-region OSS data streams are not supported. The OSS bucket must be in the same region as the Cloud Parallel File Storage file system.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the Cloud Parallel File Storage data stream can access the data in the bucket. Do not delete or modify this tag while the data stream is in use. Otherwise, the Cloud Parallel File Storage data stream cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Usage notes for CPFS for Lingjun.
     *    This section applies to CPFS for Lingjun whose file system IDs start with <code>bmcpfs-</code>.<ul>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as source storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support both encrypted and non-encrypted access to OSS. If you select encrypted (SSL) access to OSS, make sure that the encryption in transit of the OSS bucket supports encrypted access.</li>
     * <li>If data flows of multiple CPFS for Lingjun file systems, or multiple data flows of the same CPFS for Lingjun file system, use the same OSS bucket as source storage, enable versioning for the OSS bucket to prevent data conflicts when multiple CPFS for Lingjun file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the CPFS for Lingjun file system.</li>
     * <li>CPFS for Lingjun 2.6.0 or later supports creating data flows with cross-account OSS.</li>
     * <li>The account ID parameter is required only when you use cross-account OSS.</li>
     * <li>When you use cross-account OSS, authorize the accounts first. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Cross-account data flow authorization</a>.<blockquote>
     * <p>Before creating a data flow, set a tag (key: cpfs-dataflow, value: true) on the source OSS bucket so that the CPFS for Lingjun data flow can access the data in the bucket. Do not delete or modify this tag while the data flow is in use. Otherwise, the CPFS for Lingjun data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Data flow restrictions on file systems.<ul>
     * <li>In the file system path associated with a data flow, you cannot rename a non-empty directory. Otherwise, a Permission Denied or directory not empty error is returned.</li>
     * <li>Use special characters in directory and file names with caution. The following characters are supported: uppercase and lowercase letters, digits, exclamation marks (!), hyphens (-), underscores (_), periods (.), asterisks (*), and parentheses (()).</li>
     * <li>Excessively long paths are not supported. The maximum path length supported by data flows is 1023 characters.</li>
     * </ul>
     * </li>
     * <li>Data flow import restrictions.<ul>
     * <li>After a symlink file is imported to CPFS for Lingjun, it is converted to a regular file that contains data, and the symlink information is lost.</li>
     * <li>If the OSS bucket has multiple versions, only the latest version is copied.</li>
     * <li>File names or subdirectory names longer than 255 bytes are not supported.</li>
     * </ul>
     * </li>
     * <li>Data flow export restrictions<ul>
     * <li>After a symlink file is synchronized to OSS, the file that the symlink points to is not synchronized. Instead, the symlink becomes a regular empty object with no data.</li>
     * <li>A hardlink file is synchronized to OSS as a regular file.</li>
     * <li>Socket, Device, and Pipe files are converted to regular empty objects with no data when exported to an OSS bucket.</li>
     * <li>Directory paths longer than 1023 characters are not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data flow between a CPFS file system (General-purpose or CPFS for Lingjun) and source storage.</p>
     * 
     * @param request CreateDataFlowRequest
     * @return CreateDataFlowResponse
     */
    public CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each level are in the required state:</p>
     * <ol>
     * <li>Create a file system: Create a CPFS for Lingjun file system in the console.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.<ul>
     * <li>State requirement: The data flow task is in the Executing state.
     * <strong>Operation description</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>You can create subtasks only for data flow streaming tasks that are in the Executing state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowsubtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * <li>When the data flow task type is a streaming task, the Executing state only indicates that you can create streaming import or streaming export tasks. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a subtask for a data flow streaming task.</p>
     * 
     * @param request CreateDataFlowSubTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowSubTaskResponse
     */
    public CreateDataFlowSubTaskResponse createDataFlowSubTaskWithOptions(CreateDataFlowSubTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowTaskId)) {
            query.put("DataFlowTaskId", request.dataFlowTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstFilePath)) {
            query.put("DstFilePath", request.dstFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcFilePath)) {
            query.put("SrcFilePath", request.srcFilePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlowSubTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowSubTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each level are in the required state:</p>
     * <ol>
     * <li>Create a file system: Create a CPFS for Lingjun file system in the console.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.<ul>
     * <li>State requirement: The data flow task is in the Executing state.
     * <strong>Operation description</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>You can create subtasks only for data flow streaming tasks that are in the Executing state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowsubtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * <li>When the data flow task type is a streaming task, the Executing state only indicates that you can create streaming import or streaming export tasks. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a subtask for a data flow streaming task.</p>
     * 
     * @param request CreateDataFlowSubTaskRequest
     * @return CreateDataFlowSubTaskResponse
     */
    public CreateDataFlowSubTaskResponse createDataFlowSubTask(CreateDataFlowSubTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowSubTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Notes on CPFS<ul>
     * <li>Only CPFS 2.2.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you manually run a data flow task, the automatic data update task of the data flow is interrupted and waits.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS does not exceed 1,023 characters.</li>
     * </ul>
     * </li>
     * <li>Notes on CPFS for Lingjun<ul>
     * <li>Only CPFS for Lingjun 2.4.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS for Lingjun does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports two task types: batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task type overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data flow task.</p>
     * 
     * @param request CreateDataFlowTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataFlowTaskResponse
     */
    public CreateDataFlowTaskResponse createDataFlowTaskWithOptions(CreateDataFlowTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictPolicy)) {
            query.put("ConflictPolicy", request.conflictPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createDirIfNotExist)) {
            query.put("CreateDirIfNotExist", request.createDirIfNotExist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directory)) {
            query.put("Directory", request.directory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstDirectory)) {
            query.put("DstDirectory", request.dstDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryList)) {
            query.put("EntryList", request.entryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includes)) {
            query.put("Includes", request.includes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTaskId)) {
            query.put("SrcTaskId", request.srcTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferFileListPath)) {
            query.put("TransferFileListPath", request.transferFileListPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataFlowTask"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataFlowTaskResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Notes on CPFS<ul>
     * <li>Only CPFS 2.2.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you manually run a data flow task, the automatic data update task of the data flow is interrupted and waits.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS does not exceed 1,023 characters.</li>
     * </ul>
     * </li>
     * <li>Notes on CPFS for Lingjun<ul>
     * <li>Only CPFS for Lingjun 2.4.0 and later support data flow. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status. The time required for a task depends on the amount of data to be imported or exported. For large amounts of data, split the data into multiple tasks.</li>
     * <li>You can create a data flow task only on a data flow in the Running state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the file to be exported from CPFS for Lingjun does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports two task types: batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task type overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data flow task.</p>
     * 
     * @param request CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    public CreateDataFlowTaskResponse createDataFlowTask(CreateDataFlowTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataFlowTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS protocol file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory in a file system.</p>
     * 
     * @param request CreateDirRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDirResponse
     */
    public CreateDirResponse createDirWithOptions(CreateDirRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerGroupId)) {
            query.put("OwnerGroupId", request.ownerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            query.put("Permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursion)) {
            query.put("Recursion", request.recursion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootDirectory)) {
            query.put("RootDirectory", request.rootDirectory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDir"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS protocol file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory in a file system.</p>
     * 
     * @param request CreateDirRequest
     * @return CreateDirResponse
     */
    public CreateDirResponse createDir(CreateDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is available only to specific users.</li>
     * <li>Only General-purpose NAS file systems that use the SMB Protocol Type and have access control enabled are supported. Alibaba Cloud Key Management Service (KMS) must also be activated.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before calling this API to create a file, complete the following four steps:</p>
     * <ol>
     * <li><strong>Create an SMB General-purpose NAS file system</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation with ProtocolType set to SMB to create a General-purpose NAS file system that supports the SMB protocol.</li>
     * <li><strong>Activate KMS</strong>: Activate KMS by using one of the following methods:<ul>
     * <li>Call the Kms.OpenKmsService API operation.</li>
     * <li>Go to the <a href="https://common-buy.aliyun.com/?commodityCode=kms#/open">console activation page</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Enable SMB ACL</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablesmbacl">EnableSmbAcl</a> operation to enable the SMB ACL feature. Recommended configuration:<ul>
     * <li>AuthMethod=NTLM</li>
     * <li>AuthCenter=EDS</li>
     * <li>This configuration does not require an AD domain Keytab and is easier to use.</li>
     * </ul>
     * </li>
     * <li><strong>Call CreateFile</strong>: After completing the preceding steps, call this operation to create a directory or file.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory or file.</p>
     * 
     * @param request CreateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccessInheritable)) {
            query.put("OwnerAccessInheritable", request.ownerAccessInheritable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is available only to specific users.</li>
     * <li>Only General-purpose NAS file systems that use the SMB Protocol Type and have access control enabled are supported. Alibaba Cloud Key Management Service (KMS) must also be activated.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before calling this API to create a file, complete the following four steps:</p>
     * <ol>
     * <li><strong>Create an SMB General-purpose NAS file system</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation with ProtocolType set to SMB to create a General-purpose NAS file system that supports the SMB protocol.</li>
     * <li><strong>Activate KMS</strong>: Activate KMS by using one of the following methods:<ul>
     * <li>Call the Kms.OpenKmsService API operation.</li>
     * <li>Go to the <a href="https://common-buy.aliyun.com/?commodityCode=kms#/open">console activation page</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Enable SMB ACL</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablesmbacl">EnableSmbAcl</a> operation to enable the SMB ACL feature. Recommended configuration:<ul>
     * <li>AuthMethod=NTLM</li>
     * <li>AuthCenter=EDS</li>
     * <li>This configuration does not require an AD domain Keytab and is easier to use.</li>
     * </ul>
     * </li>
     * <li><strong>Call CreateFile</strong>: After completing the preceding steps, call this operation to create a directory or file.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory or file.</p>
     * 
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.aliyun.com/price/product?#/nas/">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.alibabacloud.com/zh/product/nas/pricing?_p_lc=1&spm=a2796.7960336.8215766810.64.414bb91aiZQiRG&spm=a2c4g.11186623.help-menu-27516.d_5_1_4_2_0.572a1880hEiKCk">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.</li>
     * </ul>
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
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            query.put("EncryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsKeyId)) {
            query.put("KmsKeyId", request.kmsKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundancyType)) {
            query.put("RedundancyType", request.redundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundancyVSwitchIds)) {
            query.put("RedundancyVSwitchIds", request.redundancyVSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileSystem"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.aliyun.com/price/product?#/nas/">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before you call this operation, make sure that you fully understand the billing and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.alibabacloud.com/zh/product/nas/pricing?_p_lc=1&spm=a2796.7960336.8215766810.64.414bb91aiZQiRG&spm=a2c4g.11186623.help-menu-27516.d_5_1_4_2_0.572a1880hEiKCk">Pricing</a>.</li>
     * <li>To create a file system instance, complete real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the NAS service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for File Storage NAS</a>.</li>
     * </ul>
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
     * <b>description</b> :
     * <ul>
     * <li>Usage notes for CPFS.<ul>
     * <li>Only CPFS 2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 10 filesets can be created for a single CPFS file system.</li>
     * <li>The parent directory must be an existing directory.</li>
     * <li>The maximum depth of a fileset path is 8 levels, with the root directory / as level 0. For example, a fileset path of /test/aaa/ccc/ has a depth of 3 levels.</li>
     * <li>Nesting filesets within a fileset is not supported. If a parent directory is already specified as a fileset, its subdirectories cannot be specified as filesets.</li>
     * <li>A fileset supports a maximum of 1,000,000 files. If the number of files exceeds this limit, adding new files returns a <code>no space</code> error message.</li>
     * </ul>
     * </li>
     * <li>Usage notes for CPFS for Lingjun<ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 500 filesets can be created for a single CPFS file system.</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Renaming a fileset path is not supported, and the path cannot be a symbolic link.</li>
     * <li>The maximum depth of a fileset path is 8 levels, with the root directory / as level 0. For example, a fileset path of /test/aaa/ccc/ has a depth of 3 levels.</li>
     * <li>If the fileset path contains multiple directory levels, the parent directory must be an existing directory.</li>
     * <li>Nesting filesets within a fileset is not supported. If a parent directory is already specified as a fileset, its subdirectories cannot be specified as filesets. Only one quota is supported for each fileset path.</li>
     * <li>The minimum capacity quota for a fileset is 10 GiB, and the capacity can be increased in increments of 1 GiB.</li>
     * <li>A fileset supports a maximum of 10,000,000,000 files or directories, with a minimum of 10,000 and an increment of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>Quota statistics have a 15-minute delay. The current actual usage takes effect after 15 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a fileset.</p>
     * 
     * @param request CreateFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFilesetWithOptions(CreateFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemPath)) {
            query.put("FileSystemPath", request.fileSystemPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            query.put("Quota", request.quota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Usage notes for CPFS.<ul>
     * <li>Only CPFS 2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 10 filesets can be created for a single CPFS file system.</li>
     * <li>The parent directory must be an existing directory.</li>
     * <li>The maximum depth of a fileset path is 8 levels, with the root directory / as level 0. For example, a fileset path of /test/aaa/ccc/ has a depth of 3 levels.</li>
     * <li>Nesting filesets within a fileset is not supported. If a parent directory is already specified as a fileset, its subdirectories cannot be specified as filesets.</li>
     * <li>A fileset supports a maximum of 1,000,000 files. If the number of files exceeds this limit, adding new files returns a <code>no space</code> error message.</li>
     * </ul>
     * </li>
     * <li>Usage notes for CPFS for Lingjun<ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 500 filesets can be created for a single CPFS file system.</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Renaming a fileset path is not supported, and the path cannot be a symbolic link.</li>
     * <li>The maximum depth of a fileset path is 8 levels, with the root directory / as level 0. For example, a fileset path of /test/aaa/ccc/ has a depth of 3 levels.</li>
     * <li>If the fileset path contains multiple directory levels, the parent directory must be an existing directory.</li>
     * <li>Nesting filesets within a fileset is not supported. If a parent directory is already specified as a fileset, its subdirectories cannot be specified as filesets. Only one quota is supported for each fileset path.</li>
     * <li>The minimum capacity quota for a fileset is 10 GiB, and the capacity can be increased in increments of 1 GiB.</li>
     * <li>A fileset supports a maximum of 10,000,000,000 files or directories, with a minimum of 10,000 and an increment of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>Quota statistics have a 15-minute delay. The current actual usage takes effect after 15 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a fileset.</p>
     * 
     * @param request CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    public CreateFilesetResponse createFileset(CreateFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFilesetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an LDAP configuration.</p>
     * 
     * @deprecated OpenAPI CreateLDAPConfig is deprecated
     * 
     * @param request CreateLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateLDAPConfigResponse createLDAPConfigWithOptions(CreateLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindDN)) {
            query.put("BindDN", request.bindDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchBase)) {
            query.put("SearchBase", request.searchBase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLDAPConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an LDAP configuration.</p>
     * 
     * @deprecated OpenAPI CreateLDAPConfig is deprecated
     * 
     * @param request CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public CreateLDAPConfigResponse createLDAPConfig(CreateLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems and CPFS for Lingjun support creating lifecycle management policies.</li>
     * <li>Each CPFS for Lingjun file system supports up to 10 Auto-type and 100 OnDemand-type lifecycle management policies.</li>
     * <li>Up to 20 lifecycle management policies for General-purpose NAS can be created in each region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a lifecycle management policy.</p>
     * 
     * @param request CreateLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLifecyclePolicyResponse
     */
    public CreateLifecyclePolicyResponse createLifecyclePolicyWithOptions(CreateLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteRules)) {
            query.put("DeleteRules", request.deleteRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyType)) {
            query.put("LifecyclePolicyType", request.lifecyclePolicyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleRuleName)) {
            query.put("LifecycleRuleName", request.lifecycleRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retrieveRules)) {
            query.put("RetrieveRules", request.retrieveRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRules)) {
            query.put("TransitRules", request.transitRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems and CPFS for Lingjun support creating lifecycle management policies.</li>
     * <li>Each CPFS for Lingjun file system supports up to 10 Auto-type and 100 OnDemand-type lifecycle management policies.</li>
     * <li>Up to 20 lifecycle management policies for General-purpose NAS can be created in each region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a lifecycle management policy.</p>
     * 
     * @param request CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    public CreateLifecyclePolicyResponse createLifecyclePolicy(CreateLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can have up to 20 running data retrieval tasks in the same region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data retrieval task.</p>
     * 
     * @param request CreateLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLifecycleRetrieveJobResponse
     */
    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJobWithOptions(CreateLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can have up to 20 running data retrieval tasks in the same region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a data retrieval task.</p>
     * 
     * @param request CreateLifecycleRetrieveJobRequest
     * @return CreateLifecycleRetrieveJobResponse
     */
    public CreateLifecycleRetrieveJobResponse createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delivers system logs of a General-purpose NAS file system to log analysis.</p>
     * 
     * @param request CreateLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogAnalysisResponse
     */
    public CreateLogAnalysisResponse createLogAnalysisWithOptions(CreateLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delivers system logs of a General-purpose NAS file system to log analysis.</p>
     * 
     * @param request CreateLogAnalysisRequest
     * @return CreateLogAnalysisResponse
     */
    public CreateLogAnalysisResponse createLogAnalysis(CreateLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call the CreateMountTarget operation to create a mount target, some resources are generated asynchronously. After the CreateMountTarget operation succeeds, call the DescribeMountTargets operation to query the mount target status. Mount the file system only after the mount target status changes to <strong>Active</strong>. Otherwise, the mount operation may fail.</li>
     * <li>Calling this operation triggers the automatic creation of the service-linked role required for the operation. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTargetWithOptions(CreateMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIpv6)) {
            query.put("EnableIpv6", request.enableIpv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
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
            new TeaPair("action", "CreateMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call the CreateMountTarget operation to create a mount target, some resources are generated asynchronously. After the CreateMountTarget operation succeeds, call the DescribeMountTargets operation to query the mount target status. Mount the file system only after the mount target status changes to <strong>Active</strong>. Otherwise, the mount operation may fail.</li>
     * <li>Calling this operation triggers the automatic creation of the service-linked role required for the operation. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * </li>
     * <li><p>Before you begin</p>
     * <p>The target CPFS file system must be in the Running state, and a protocol service must have been created.</p>
     * </li>
     * <li><p>Other information</p>
     * <ul>
     * <li>The VPC CIDR block of the protocol service export must not overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple exports on the same protocol service must not overlap with each other.</li>
     * <li>You can create up to 10 export directories for a single protocol service.</li>
     * <li>Creating a protocol service export directory consumes IP addresses from the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an export directory for a protocol service.</p>
     * 
     * @param request CreateProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtocolMountTargetResponse
     */
    public CreateProtocolMountTargetResponse createProtocolMountTargetWithOptions(CreateProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * </li>
     * <li><p>Before you begin</p>
     * <p>The target CPFS file system must be in the Running state, and a protocol service must have been created.</p>
     * </li>
     * <li><p>Other information</p>
     * <ul>
     * <li>The VPC CIDR block of the protocol service export must not overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple exports on the same protocol service must not overlap with each other.</li>
     * <li>You can create up to 10 export directories for a single protocol service.</li>
     * <li>Creating a protocol service export directory consumes IP addresses from the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an export directory for a protocol service.</p>
     * 
     * @param request CreateProtocolMountTargetRequest
     * @return CreateProtocolMountTargetResponse
     */
    public CreateProtocolMountTargetResponse createProtocolMountTarget(CreateProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation applies only to CPFS file systems.</p>
     * </li>
     * <li><p>Only CPFS 2.3.0 and later support protocol services. You can call the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation to query the version of a file system.</p>
     * </li>
     * <li><p>Protocol service specifications.
     * Protocol services include two Protocol Types: General and Cache. Compared with the General type, the Cache type provides hot spot data caching. When the cache is hit, the bandwidth of the Cache type protocol service can exceed the bandwidth of the CPFS file system and reach the maximum bandwidth configured for the protocol service.</p>
     * <ul>
     * <li>General: Provides NFS protocol access and <a href="https://help.aliyun.com/document_detail/427175.html">folder-level mount targets</a> for CPFS. You do not need to configure a POSIX client cluster management. This feature is free of charge.</li>
     * <li>Cache: Provides server-side in-memory caching based on the LRU policy on top of the General type. When data is cached in memory, CPFS can provide higher internal network bandwidth. The Cache type protocol service is available in two specifications: Cache L1 and Cache L2, which differ in internal network bandwidth and memory cache size.<blockquote>
     * <p> The Cache type protocol service is a paid service and is in invitational preview. For information about the billing of the Cache type protocol service, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, join the DingTalk user group (group ID: 31045006299) to communicate with CPFS engineers.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Protocol type.
     * Only NFSv3 is supported.</p>
     * </li>
     * <li><p>Before you begin.
     * The CPFS file system must be created and in the Running state.</p>
     * </li>
     * <li><p>Other information.</p>
     * <ul>
     * <li>Only one protocol service can be created for each CPFS file system.</li>
     * <li>Creating a protocol service consumes IP addresses on the specified vSwitch (up to 32 IP addresses). Make sure that the vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation process takes approximately 5 to 10 minutes.</p>
     * 
     * @param request CreateProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProtocolServiceResponse
     */
    public CreateProtocolServiceResponse createProtocolServiceWithOptions(CreateProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolSpec)) {
            query.put("ProtocolSpec", request.protocolSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
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
            new TeaPair("action", "CreateProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation applies only to CPFS file systems.</p>
     * </li>
     * <li><p>Only CPFS 2.3.0 and later support protocol services. You can call the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation to query the version of a file system.</p>
     * </li>
     * <li><p>Protocol service specifications.
     * Protocol services include two Protocol Types: General and Cache. Compared with the General type, the Cache type provides hot spot data caching. When the cache is hit, the bandwidth of the Cache type protocol service can exceed the bandwidth of the CPFS file system and reach the maximum bandwidth configured for the protocol service.</p>
     * <ul>
     * <li>General: Provides NFS protocol access and <a href="https://help.aliyun.com/document_detail/427175.html">folder-level mount targets</a> for CPFS. You do not need to configure a POSIX client cluster management. This feature is free of charge.</li>
     * <li>Cache: Provides server-side in-memory caching based on the LRU policy on top of the General type. When data is cached in memory, CPFS can provide higher internal network bandwidth. The Cache type protocol service is available in two specifications: Cache L1 and Cache L2, which differ in internal network bandwidth and memory cache size.<blockquote>
     * <p> The Cache type protocol service is a paid service and is in invitational preview. For information about the billing of the Cache type protocol service, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, join the DingTalk user group (group ID: 31045006299) to communicate with CPFS engineers.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Protocol type.
     * Only NFSv3 is supported.</p>
     * </li>
     * <li><p>Before you begin.
     * The CPFS file system must be created and in the Running state.</p>
     * </li>
     * <li><p>Other information.</p>
     * <ul>
     * <li>Only one protocol service can be created for each CPFS file system.</li>
     * <li>Creating a protocol service consumes IP addresses on the specified vSwitch (up to 32 IP addresses). Make sure that the vSwitch has sufficient IP address resources.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a protocol service for a Cloud Parallel File Storage (CPFS) file system. The creation process takes approximately 5 to 10 minutes.</p>
     * 
     * @param request CreateProtocolServiceRequest
     * @return CreateProtocolServiceResponse
     */
    public CreateProtocolServiceResponse createProtocolService(CreateProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>The recycle bin must be enabled.</li>
     * <li>Mount the file system by using NFS or SMB (you must use an ECS instance in the same VPC to mount the file system), and then delete the target file from the mount directory to move it to the recycle bin.</li>
     * <li>When you permanently delete a directory, the contents in the directory are recursively deleted.</li>
     * <li>Only one permanent deletion task can be run at a time for a single file system. While a file or directory is being permanently deleted, you cannot initiate a new restoration or cleanup task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to permanently delete a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinDeleteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecycleBinDeleteJobResponse
     */
    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJobWithOptions(CreateRecycleBinDeleteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecycleBinDeleteJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecycleBinDeleteJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>The recycle bin must be enabled.</li>
     * <li>Mount the file system by using NFS or SMB (you must use an ECS instance in the same VPC to mount the file system), and then delete the target file from the mount directory to move it to the recycle bin.</li>
     * <li>When you permanently delete a directory, the contents in the directory are recursively deleted.</li>
     * <li>Only one permanent deletion task can be run at a time for a single file system. While a file or directory is being permanently deleted, you cannot initiate a new restoration or cleanup task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task to permanently delete a file or directory from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    public CreateRecycleBinDeleteJobResponse createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinDeleteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>A single file system can run only one file restoration or cleanup task at a time. While a file is being restored, you cannot initiate a new file restoration or cleanup task.</li>
     * <li>A single restoration task can restore only one file or directory. Restoring a specified directory recursively restores all files in the directory.</li>
     * <li>After a file is restored, data reorganization is performed. Read request performance slightly decreases during data reorganization.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores a file from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinRestoreJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRecycleBinRestoreJobResponse
     */
    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJobWithOptions(CreateRecycleBinRestoreJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRecycleBinRestoreJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRecycleBinRestoreJobResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>A single file system can run only one file restoration or cleanup task at a time. While a file is being restored, you cannot initiate a new file restoration or cleanup task.</li>
     * <li>A single restoration task can restore only one file or directory. Restoring a specified directory recursively restores all files in the directory.</li>
     * <li>After a file is restored, data reorganization is performed. Read request performance slightly decreases during data reorganization.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Restores a file from the recycle bin.</p>
     * 
     * @param request CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    public CreateRecycleBinRestoreJobResponse createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRecycleBinRestoreJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.40a34bbe4vbvKY">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.40a34bbe4vbvKY">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroupWithOptions(DeleteAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessGroup"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing permission group.</p>
     * 
     * @param request DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    public DeleteAccessGroupResponse deleteAccessGroup(DeleteAccessGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only NFS protocol file systems of General-purpose NAS support this feature.</li>
     * <li>After you delete an access point, all I/O operations that are accessing the folder through the access point are immediately interrupted. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access point.</p>
     * 
     * @param request DeleteAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessPointResponse
     */
    public DeleteAccessPointResponse deleteAccessPointWithOptions(DeleteAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only NFS protocol file systems of General-purpose NAS support this feature.</li>
     * <li>After you delete an access point, all I/O operations that are accessing the folder through the access point are immediately interrupted. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access point.</p>
     * 
     * @param request DeleteAccessPointRequest
     * @return DeleteAccessPointResponse
     */
    public DeleteAccessPointResponse deleteAccessPoint(DeleteAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission rule from a permission group.</p>
     * 
     * @param request DeleteAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessRuleResponse
     */
    public DeleteAccessRuleResponse deleteAccessRuleWithOptions(DeleteAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessRule"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission rule from a permission group.</p>
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
     * <p>Applicable to agentic file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Agentic space.</p>
     * 
     * @param request DeleteAgenticSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgenticSpaceResponse
     */
    public DeleteAgenticSpaceResponse deleteAgenticSpaceWithOptions(DeleteAgenticSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agenticSpaceId)) {
            query.put("AgenticSpaceId", request.agenticSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgenticSpace"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAgenticSpaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Applicable to agentic file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Agentic space.</p>
     * 
     * @param request DeleteAgenticSpaceRequest
     * @return DeleteAgenticSpaceResponse
     */
    public DeleteAgenticSpaceResponse deleteAgenticSpace(DeleteAgenticSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAgenticSpaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.</li>
     * </ul>
     * 
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
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * @param request DeleteCpfsAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCpfsAccessPointResponse
     */
    public DeleteCpfsAccessPointResponse deleteCpfsAccessPointWithOptions(DeleteCpfsAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

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
            new TeaPair("action", "DeleteCpfsAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCpfsAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * @param request DeleteCpfsAccessPointRequest
     * @return DeleteCpfsAccessPointResponse
     */
    public DeleteCpfsAccessPointResponse deleteCpfsAccessPoint(DeleteCpfsAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCpfsAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can delete only dataflows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a dataflow is deleted, the related resources are released and cannot be recovered. To use a dataflow again, create a new one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataflow.</p>
     * 
     * @param request DeleteDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataFlowResponse
     */
    public DeleteDataFlowResponse deleteDataFlowWithOptions(DeleteDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can delete only dataflows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a dataflow is deleted, the related resources are released and cannot be recovered. To use a dataflow again, create a new one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataflow.</p>
     * 
     * @param request DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    public DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete a file system only when the number of mount targets on the file system is 0.</li>
     * <li>You can delete a file system only when no lifecycle policy is created for the file system.</li>
     * <li>After a file system is deleted, the data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file system.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileSystem"),
            new TeaPair("version", "2017-06-26"),
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
     * <li>You can delete a file system only when the number of mount targets on the file system is 0.</li>
     * <li>You can delete a file system only when no lifecycle policy is created for the file system.</li>
     * <li>After a file system is deleted, the data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file system.</p>
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
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support fileset deletion. After a fileset is deleted, all data in the directory is permanently deleted and cannot be recovered. Proceed with caution.</li>
     * <li>If deletion protection is enabled, you must disable deletion protection before you can delete the fileset.</li>
     * <li>All filesets on the target file system must be in the CREATED desired state before you can perform the delete operation.</li>
     * <li>Deleting a CPFS general-purpose fileset immediately releases disk space. Deleting a CPFS for Lingjun fileset gradually releases disk space. Deleted data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a fileset.</p>
     * 
     * @param request DeleteFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFilesetWithOptions(DeleteFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support fileset deletion. After a fileset is deleted, all data in the directory is permanently deleted and cannot be recovered. Proceed with caution.</li>
     * <li>If deletion protection is enabled, you must disable deletion protection before you can delete the fileset.</li>
     * <li>All filesets on the target file system must be in the CREATED desired state before you can perform the delete operation.</li>
     * <li>Deleting a CPFS general-purpose fileset immediately releases disk space. Deleting a CPFS for Lingjun fileset gradually releases disk space. Deleted data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a fileset.</p>
     * 
     * @param request DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    public DeleteFilesetResponse deleteFileset(DeleteFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFilesetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes LDAP settings.</p>
     * 
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated
     * 
     * @param request DeleteLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteLDAPConfigResponse deleteLDAPConfigWithOptions(DeleteLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLDAPConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes LDAP settings.</p>
     * 
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated
     * 
     * @param request DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public DeleteLDAPConfigResponse deleteLDAPConfig(DeleteLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle management policy.</p>
     * 
     * @param request DeleteLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLifecyclePolicyResponse
     */
    public DeleteLifecyclePolicyResponse deleteLifecyclePolicyWithOptions(DeleteLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lifecycle management policy.</p>
     * 
     * @param request DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     */
    public DeleteLifecyclePolicyResponse deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops log analysis for a General-purpose NAS file system.</p>
     * 
     * @param request DeleteLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogAnalysisResponse
     */
    public DeleteLogAnalysisResponse deleteLogAnalysisWithOptions(DeleteLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops log analysis for a General-purpose NAS file system.</p>
     * 
     * @param request DeleteLogAnalysisRequest
     * @return DeleteLogAnalysisResponse
     */
    public DeleteLogAnalysisResponse deleteLogAnalysis(DeleteLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a mount target is deleted, it cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTargetWithOptions(DeleteMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a mount target is deleted, it cannot be recovered. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an export directory of a protocol service.</p>
     * 
     * @param request DeleteProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtocolMountTargetResponse
     */
    public DeleteProtocolMountTargetResponse deleteProtocolMountTargetWithOptions(DeleteProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an export directory of a protocol service.</p>
     * 
     * @param request DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    public DeleteProtocolMountTargetResponse deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to CPFS file systems.</li>
     * <li>When you delete a protocol service, all export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protocol service from a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request DeleteProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProtocolServiceResponse
     */
    public DeleteProtocolServiceResponse deleteProtocolServiceWithOptions(DeleteProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to CPFS file systems.</li>
     * <li>When you delete a protocol service, all export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a protocol service from a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    public DeleteProtocolServiceResponse deleteProtocolService(DeleteProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified snapshot or cancels an ongoing snapshot creation task.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified snapshot or cancels an ongoing snapshot creation task.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries permission group information.</p>
     * 
     * @param request DescribeAccessGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessGroupsResponse
     */
    public DescribeAccessGroupsResponse describeAccessGroupsWithOptions(DescribeAccessGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useUTCDateTime)) {
            query.put("UseUTCDateTime", request.useUTCDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessGroups"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries permission group information.</p>
     * 
     * @param request DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     */
    public DescribeAccessGroupsResponse describeAccessGroups(DescribeAccessGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an access point.</p>
     * 
     * @param request DescribeAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessPointResponse
     */
    public DescribeAccessPointResponse describeAccessPointWithOptions(DescribeAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an access point.</p>
     * 
     * @param request DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    public DescribeAccessPointResponse describeAccessPoint(DescribeAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access point information.</p>
     * 
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use NAS::2017-06-26::ListAccessPoints instead.
     * 
     * @param request DescribeAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeAccessPointsResponse describeAccessPointsWithOptions(DescribeAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessPoints"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access point information.</p>
     * 
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use NAS::2017-06-26::ListAccessPoints instead.
     * 
     * @param request DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeAccessPointsResponse describeAccessPoints(DescribeAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the description of a permission rule.</p>
     * 
     * @param request DescribeAccessRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessRulesResponse
     */
    public DescribeAccessRulesResponse describeAccessRulesWithOptions(DescribeAccessRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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
            new TeaPair("action", "DescribeAccessRules"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the description of a permission rule.</p>
     * 
     * @param request DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    public DescribeAccessRulesResponse describeAccessRules(DescribeAccessRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Applies to Agentic file systems.</p>
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, create resources in the following order:</p>
     * <ol>
     * <li><strong>Create an Agentic file system</strong>: When you call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. For more information, see the console.</li>
     * </ul>
     * </li>
     * <li><strong>Query the AgenticSpace list</strong>: After the file system is created and its status changes to Running, call the DescribeAgenticSpaces operation to query the AgenticSpace list under the file system.<ul>
     * <li>If Agentic spaces are created under the file system, the complete list is returned.</li>
     * <li>If no Agentic spaces are created under the file system, an empty list is returned.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries Agentic spaces.</p>
     * 
     * @param request DescribeAgenticSpacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAgenticSpacesResponse
     */
    public DescribeAgenticSpacesResponse describeAgenticSpacesWithOptions(DescribeAgenticSpacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "DescribeAgenticSpaces"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAgenticSpacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Applies to Agentic file systems.</p>
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, create resources in the following order:</p>
     * <ol>
     * <li><strong>Create an Agentic file system</strong>: When you call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. For more information, see the console.</li>
     * </ul>
     * </li>
     * <li><strong>Query the AgenticSpace list</strong>: After the file system is created and its status changes to Running, call the DescribeAgenticSpaces operation to query the AgenticSpace list under the file system.<ul>
     * <li>If Agentic spaces are created under the file system, the complete list is returned.</li>
     * <li>If no Agentic spaces are created under the file system, an empty list is returned.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries Agentic spaces.</p>
     * 
     * @param request DescribeAgenticSpacesRequest
     * @return DescribeAgenticSpacesResponse
     */
    public DescribeAgenticSpacesResponse describeAgenticSpaces(DescribeAgenticSpacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgenticSpacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic snapshot policies that have been created.</p>
     * 
     * @param request DescribeAutoSnapshotPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPoliciesWithOptions(DescribeAutoSnapshotPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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
            new TeaPair("action", "DescribeAutoSnapshotPolicies"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic snapshot policies that have been created.</p>
     * 
     * @param request DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    public DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of automatic snapshot tasks.</p>
     * 
     * @param request DescribeAutoSnapshotTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoSnapshotTasksResponse
     */
    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasksWithOptions(DescribeAutoSnapshotTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyIds)) {
            query.put("AutoSnapshotPolicyIds", request.autoSnapshotPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemIds)) {
            query.put("FileSystemIds", request.fileSystemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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
            new TeaPair("action", "DescribeAutoSnapshotTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoSnapshotTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of automatic snapshot tasks.</p>
     * 
     * @param request DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    public DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoSnapshotTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>This operation applies only to CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of blacklisted clients in the Cloud Parallel File Storage (CPFS) service.</p>
     * 
     * @deprecated OpenAPI DescribeBlackListClients is deprecated
     * 
     * @param request DescribeBlackListClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeBlackListClientsResponse describeBlackListClientsWithOptions(DescribeBlackListClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

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
            new TeaPair("action", "DescribeBlackListClients"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlackListClientsResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>This operation applies only to CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of blacklisted clients in the Cloud Parallel File Storage (CPFS) service.</p>
     * 
     * @deprecated OpenAPI DescribeBlackListClients is deprecated
     * 
     * @param request DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeBlackListClientsResponse describeBlackListClients(DescribeBlackListClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlackListClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of clients mounted to an access point of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of clients mounted to an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request DescribeCpfsAccessPointMountedClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCpfsAccessPointMountedClientsResponse
     */
    public DescribeCpfsAccessPointMountedClientsResponse describeCpfsAccessPointMountedClientsWithOptions(DescribeCpfsAccessPointMountedClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCpfsAccessPointMountedClients"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCpfsAccessPointMountedClientsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of clients mounted to an access point of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of clients mounted to an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request DescribeCpfsAccessPointMountedClientsRequest
     * @return DescribeCpfsAccessPointMountedClientsResponse
     */
    public DescribeCpfsAccessPointMountedClientsResponse describeCpfsAccessPointMountedClients(DescribeCpfsAccessPointMountedClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCpfsAccessPointMountedClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries access points of CPFS for Lingjun.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access points of CPFS for Lingjun.</p>
     * 
     * @param request DescribeCpfsAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCpfsAccessPointsResponse
     */
    public DescribeCpfsAccessPointsResponse describeCpfsAccessPointsWithOptions(DescribeCpfsAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCpfsAccessPoints"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCpfsAccessPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries access points of CPFS for Lingjun.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access points of CPFS for Lingjun.</p>
     * 
     * @param request DescribeCpfsAccessPointsRequest
     * @return DescribeCpfsAccessPointsResponse
     */
    public DescribeCpfsAccessPointsResponse describeCpfsAccessPoints(DescribeCpfsAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCpfsAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supported only by CPFS for Lingjun 2.6.0 and later. You can view the version information on the file system details page in the console.
     * <strong>Before you begin</strong>
     * Before you call this operation to query data flow subtasks, you must create resources and start tasks in the following order:</p>
     * <ol>
     * <li><strong>Create a bmcpfs file system</strong>: You must create a CPFS for Lingjun file system in the console and wait until its status changes to Running.</li>
     * <li><strong>Create a data flow rule</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> operation on the file system to establish a data flow channel.</li>
     * <li><strong>Start a data flow task</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> operation to create and start a data flow task. The task status must be Running.</li>
     * <li><strong>Query the subtask list</strong>: Subtasks are automatically generated during the execution of a data flow task. Call the DescribeDataFlowSubTasks operation to query the list of these subtasks.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the batch subtasks of a data flow.</p>
     * 
     * @param request DescribeDataFlowSubTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowSubTasksResponse
     */
    public DescribeDataFlowSubTasksResponse describeDataFlowSubTasksWithOptions(DescribeDataFlowSubTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "DescribeDataFlowSubTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowSubTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supported only by CPFS for Lingjun 2.6.0 and later. You can view the version information on the file system details page in the console.
     * <strong>Before you begin</strong>
     * Before you call this operation to query data flow subtasks, you must create resources and start tasks in the following order:</p>
     * <ol>
     * <li><strong>Create a bmcpfs file system</strong>: You must create a CPFS for Lingjun file system in the console and wait until its status changes to Running.</li>
     * <li><strong>Create a data flow rule</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> operation on the file system to establish a data flow channel.</li>
     * <li><strong>Start a data flow task</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> operation to create and start a data flow task. The task status must be Running.</li>
     * <li><strong>Query the subtask list</strong>: Subtasks are automatically generated during the execution of a data flow task. Call the DescribeDataFlowSubTasks operation to query the list of these subtasks.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the batch subtasks of a data flow.</p>
     * 
     * @param request DescribeDataFlowSubTasksRequest
     * @return DescribeDataFlowSubTasksResponse
     */
    public DescribeDataFlowSubTasksResponse describeDataFlowSubTasks(DescribeDataFlowSubTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowSubTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support querying data flow tasks. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of data flow tasks.</p>
     * 
     * @param request DescribeDataFlowTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowTasksResponse
     */
    public DescribeDataFlowTasksResponse describeDataFlowTasksWithOptions(DescribeDataFlowTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withReports)) {
            query.put("WithReports", request.withReports);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataFlowTasks"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support querying data flow tasks. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of data flow tasks.</p>
     * 
     * @param request DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    public DescribeDataFlowTasksResponse describeDataFlowTasks(DescribeDataFlowTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds, DataFlowIds, SourceStorage, ThroughputList, and Status require exact match. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined queries are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries data flow information of a CPFS file system.</p>
     * 
     * @param request DescribeDataFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataFlowsResponse
     */
    public DescribeDataFlowsResponse describeDataFlowsWithOptions(DescribeDataFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "DescribeDataFlows"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataFlowsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds, DataFlowIds, SourceStorage, ThroughputList, and Status require exact match. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined queries are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries data flow information of a CPFS file system.</p>
     * 
     * @param request DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    public DescribeDataFlowsResponse describeDataFlows(DescribeDataFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataFlowsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of each directory quota in a file system.</p>
     * 
     * @param request DescribeDirQuotasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDirQuotasResponse
     */
    public DescribeDirQuotasResponse describeDirQuotasWithOptions(DescribeDirQuotasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirQuotas"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirQuotasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of each directory quota in a file system.</p>
     * 
     * @param request DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    public DescribeDirQuotasResponse describeDirQuotas(DescribeDirQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirQuotasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the statistics information of file systems under the current account.</p>
     * 
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.
     * 
     * @param request DescribeFileSystemStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFileSystemStatisticsResponse describeFileSystemStatisticsWithOptions(DescribeFileSystemStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeFileSystemStatistics"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileSystemStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the statistics information of file systems under the current account.</p>
     * 
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.
     * 
     * @param request DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFileSystemStatisticsResponse describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file system information.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystemsWithOptions(DescribeFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileSystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file system information.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support filesets. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds requires an exact match, while FileSystemPath and Description support fuzzy match.</li>
     * <li>Combination queries are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of created filesets.</p>
     * 
     * @param request DescribeFilesetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilesetsResponse
     */
    public DescribeFilesetsResponse describeFilesetsWithOptions(DescribeFilesetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            query.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilesets"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilesetsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support filesets. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys (Filters), FsetIds requires an exact match, while FileSystemPath and Description support fuzzy match.</li>
     * <li>Combination queries are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of created filesets.</p>
     * 
     * @param request DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    public DescribeFilesetsResponse describeFilesets(DescribeFilesetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun file systems are supported.</li>
     * <li>This is a batch operation that allows you to query up to 20 file systems at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of HpnZones associated with file systems. When compute nodes are located in an associated HpnZone, access to the file system achieves optimal performance.</p>
     * 
     * @param tmpReq DescribeFilesystemsAssociatedHpnZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilesystemsAssociatedHpnZonesResponse
     */
    public DescribeFilesystemsAssociatedHpnZonesResponse describeFilesystemsAssociatedHpnZonesWithOptions(DescribeFilesystemsAssociatedHpnZonesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeFilesystemsAssociatedHpnZonesShrinkRequest request = new DescribeFilesystemsAssociatedHpnZonesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filesystems)) {
            request.filesystemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filesystems, "Filesystems", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filesystemsShrink)) {
            query.put("Filesystems", request.filesystemsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilesystemsAssociatedHpnZones"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilesystemsAssociatedHpnZonesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun file systems are supported.</li>
     * <li>This is a batch operation that allows you to query up to 20 file systems at a time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of HpnZones associated with file systems. When compute nodes are located in an associated HpnZone, access to the file system achieves optimal performance.</p>
     * 
     * @param request DescribeFilesystemsAssociatedHpnZonesRequest
     * @return DescribeFilesystemsAssociatedHpnZonesResponse
     */
    public DescribeFilesystemsAssociatedHpnZonesResponse describeFilesystemsAssociatedHpnZones(DescribeFilesystemsAssociatedHpnZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesystemsAssociatedHpnZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch execution is supported. In batch execution mode, only one VscId can be associated with multiple FileSystemIds. This means the ResourceIds.VscId values must be the same.</li>
     * <li>To query the association results between file systems and virtual storage channels, call AttachVscToFilesystems to complete the association first. You can call ListVscs of Lingjun Intelligent Computing eflo-controller/2022-12-15 to query VscIds. If no virtual storage channel has been created, call CreateVsc to create one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual storage channel information associated with file systems.</p>
     * 
     * @param request DescribeFilesystemsVscAttachInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    public DescribeFilesystemsVscAttachInfoResponse describeFilesystemsVscAttachInfoWithOptions(DescribeFilesystemsVscAttachInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleChain)) {
            query.put("RoleChain", request.roleChain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFilesystemsVscAttachInfo"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFilesystemsVscAttachInfoResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch execution is supported. In batch execution mode, only one VscId can be associated with multiple FileSystemIds. This means the ResourceIds.VscId values must be the same.</li>
     * <li>To query the association results between file systems and virtual storage channels, call AttachVscToFilesystems to complete the association first. You can call ListVscs of Lingjun Intelligent Computing eflo-controller/2022-12-15 to query VscIds. If no virtual storage channel has been created, call CreateVsc to create one.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the virtual storage channel information associated with file systems.</p>
     * 
     * @param request DescribeFilesystemsVscAttachInfoRequest
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    public DescribeFilesystemsVscAttachInfoResponse describeFilesystemsVscAttachInfo(DescribeFilesystemsVscAttachInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFilesystemsVscAttachInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of lifecycle management policies.</p>
     * 
     * @param request DescribeLifecyclePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLifecyclePoliciesResponse
     */
    public DescribeLifecyclePoliciesResponse describeLifecyclePoliciesWithOptions(DescribeLifecyclePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLifecyclePolicies"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecyclePoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of lifecycle management policies.</p>
     * 
     * @param request DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    public DescribeLifecyclePoliciesResponse describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecyclePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution logs of a lifecycle policy. You can query the logs generated within the last 90 days or up to 1,000 log entries. Only CPFS for Lingjun is supported.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Make sure that the file system specified by FileSystemId is a CPFS for Lingjun file system.</li>
     * <li>Before you call this operation, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describelifecyclepolicies">DescribeLifecyclePolicies</a> to query and obtain a valid LifecyclePolicyId.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of a lifecycle policy. You can query the logs generated within the last 90 days or up to 1,000 log entries. Only CPFS for Lingjun is supported.</p>
     * 
     * @param request DescribeLifecyclePolicyLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLifecyclePolicyLogsResponse
     */
    public DescribeLifecyclePolicyLogsResponse describeLifecyclePolicyLogsWithOptions(DescribeLifecyclePolicyLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
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
            new TeaPair("action", "DescribeLifecyclePolicyLogs"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLifecyclePolicyLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution logs of a lifecycle policy. You can query the logs generated within the last 90 days or up to 1,000 log entries. Only CPFS for Lingjun is supported.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Make sure that the file system specified by FileSystemId is a CPFS for Lingjun file system.</li>
     * <li>Before you call this operation, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describelifecyclepolicies">DescribeLifecyclePolicies</a> to query and obtain a valid LifecyclePolicyId.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of a lifecycle policy. You can query the logs generated within the last 90 days or up to 1,000 log entries. Only CPFS for Lingjun is supported.</p>
     * 
     * @param request DescribeLifecyclePolicyLogsRequest
     * @return DescribeLifecyclePolicyLogsResponse
     */
    public DescribeLifecyclePolicyLogsResponse describeLifecyclePolicyLogs(DescribeLifecyclePolicyLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLifecyclePolicyLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the log analysis configurations in log analysis.</p>
     * 
     * @param request DescribeLogAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogAnalysisResponse
     */
    public DescribeLogAnalysisResponse describeLogAnalysisWithOptions(DescribeLogAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogAnalysis"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the log analysis configurations in log analysis.</p>
     * 
     * @param request DescribeLogAnalysisRequest
     * @return DescribeLogAnalysisResponse
     */
    public DescribeLogAnalysisResponse describeLogAnalysis(DescribeLogAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount target information.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargetsWithOptions(DescribeMountTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dualStackMountTargetDomain)) {
            query.put("DualStackMountTargetDomain", request.dualStackMountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
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
            new TeaPair("action", "DescribeMountTargets"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries mount target information.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this operation.</li>
     * <li>The client list displays client IP addresses that have read or write access to the file system within the last minute. Some mounted client IP addresses that have not accessed the file system may not appear in this list.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of mounted clients.</p>
     * 
     * @param request DescribeMountedClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountedClientsResponse
     */
    public DescribeMountedClientsResponse describeMountedClientsWithOptions(DescribeMountedClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMountedClients"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountedClientsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this operation.</li>
     * <li>The client list displays client IP addresses that have read or write access to the file system within the last minute. Some mounted client IP addresses that have not accessed the file system may not appear in this list.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of mounted clients.</p>
     * 
     * @param request DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    public DescribeMountedClientsResponse describeMountedClients(DescribeMountedClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountedClientsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the NFS ACL feature is enabled for a specified file system.</p>
     * 
     * @param request DescribeNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNfsAclResponse
     */
    public DescribeNfsAclResponse describeNfsAclWithOptions(DescribeNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNfsAclResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the NFS ACL feature is enabled for a specified file system.</p>
     * 
     * @param request DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    public DescribeNfsAclResponse describeNfsAcl(DescribeNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directories of a protocol service.</p>
     * 
     * @param request DescribeProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProtocolMountTargetResponse
     */
    public DescribeProtocolMountTargetResponse describeProtocolMountTargetWithOptions(DescribeProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceIds)) {
            query.put("ProtocolServiceIds", request.protocolServiceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directories of a protocol service.</p>
     * 
     * @param request DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    public DescribeProtocolMountTargetResponse describeProtocolMountTarget(DescribeProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries protocol service information.</p>
     * 
     * @param request DescribeProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProtocolServiceResponse
     */
    public DescribeProtocolServiceResponse describeProtocolServiceWithOptions(DescribeProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceIds)) {
            query.put("ProtocolServiceIds", request.protocolServiceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries protocol service information.</p>
     * 
     * @param request DescribeProtocolServiceRequest
     * @return DescribeProtocolServiceResponse
     */
    public DescribeProtocolServiceResponse describeProtocolService(DescribeProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProtocolServiceWithOptions(request, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
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
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, ensure that the KMS service is activated in the target region. You can activate it by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or through the console. This restriction also applies to unencrypted file systems where EncryptType=0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SMB AD ACL feature.</p>
     * 
     * @param request DescribeSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmbAclResponse
     */
    public DescribeSmbAclResponse describeSmbAclWithOptions(DescribeSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmbAclResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, ensure that the KMS service is activated in the target region. You can activate it by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or through the console. This restriction also applies to unencrypted file systems where EncryptType=0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SMB AD ACL feature.</p>
     * 
     * @param request DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    public DescribeSmbAclResponse describeSmbAcl(DescribeSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about one or more snapshots of a specified file system.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotIds)) {
            query.put("SnapshotIds", request.snapshotIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotType)) {
            query.put("SnapshotType", request.snapshotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about one or more snapshots of a specified file system.</p>
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
     * <p>Queries the list of storage plans.</p>
     * 
     * @param request DescribeStoragePackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStoragePackagesResponse
     */
    public DescribeStoragePackagesResponse describeStoragePackagesWithOptions(DescribeStoragePackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.useUTCDateTime)) {
            query.put("UseUTCDateTime", request.useUTCDateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStoragePackages"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStoragePackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of storage plans.</p>
     * 
     * @param request DescribeStoragePackagesRequest
     * @return DescribeStoragePackagesResponse
     */
    public DescribeStoragePackagesResponse describeStoragePackages(DescribeStoragePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStoragePackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all zones in a region and the file system types supported by each zone.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>Queries all zones in a region and the file system types supported by each zone.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a Virtual Storage Channel (VSC) device from a file system.</p>
     * 
     * @param request DetachVscFromFilesystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVscFromFilesystemsResponse
     */
    public DetachVscFromFilesystemsResponse detachVscFromFilesystemsWithOptions(DetachVscFromFilesystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleChain)) {
            query.put("RoleChain", request.roleChain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVscFromFilesystems"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVscFromFilesystemsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch operations are supported. In batch mode, only one VscId can be associated with multiple FileSystemId values. This means the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a Virtual Storage Channel (VSC) device from a file system.</p>
     * 
     * @param request DetachVscFromFilesystemsRequest
     * @return DetachVscFromFilesystemsResponse
     */
    public DetachVscFromFilesystemsResponse detachVscFromFilesystems(DetachVscFromFilesystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVscFromFilesystemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Disabling the recycle bin permanently deletes all files in the recycle bin.</li>
     * <li>After a disabled recycle bin is re-enabled, the recycle bin is empty. Files deleted before the recycle bin was re-enabled cannot be recovered.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the recycle bin feature for a General-purpose NAS file system and deletes all data in the recycle bin.</p>
     * 
     * @param request DisableAndCleanRecycleBinRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAndCleanRecycleBinResponse
     */
    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBinWithOptions(DisableAndCleanRecycleBinRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAndCleanRecycleBin"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAndCleanRecycleBinResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Disabling the recycle bin permanently deletes all files in the recycle bin.</li>
     * <li>After a disabled recycle bin is re-enabled, the recycle bin is empty. Files deleted before the recycle bin was re-enabled cannot be recovered.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the recycle bin feature for a General-purpose NAS file system and deletes all data in the recycle bin.</p>
     * 
     * @param request DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    public DisableAndCleanRecycleBinResponse disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAndCleanRecycleBinWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables EBS Lens.</p>
     * 
     * @param request DisableDataInsightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDataInsightResponse
     */
    public DisableDataInsightResponse disableDataInsightWithOptions(DisableDataInsightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDataInsight"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDataInsightResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables EBS Lens.</p>
     * 
     * @param request DisableDataInsightRequest
     * @return DisableDataInsightResponse
     */
    public DisableDataInsightResponse disableDataInsight(DisableDataInsightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDataInsightWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the NFS ACL feature.</p>
     * 
     * @param request DisableNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableNfsAclResponse
     */
    public DisableNfsAclResponse disableNfsAclWithOptions(DisableNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableNfsAclResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the NFS ACL feature.</p>
     * 
     * @param request DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    public DisableNfsAclResponse disableNfsAcl(DisableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, make sure that Key Management Service (KMS) is activated in the target region. You can activate KMS by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or by using the console. The file system protocol type must be SMB. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to verify the file system protocol type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the SMB AD ACL feature.</p>
     * 
     * @param request DisableSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSmbAclResponse
     */
    public DisableSmbAclResponse disableSmbAclWithOptions(DisableSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSmbAclResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, make sure that Key Management Service (KMS) is activated in the target region. You can activate KMS by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or by using the console. The file system protocol type must be SMB. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to verify the file system protocol type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the SMB AD ACL feature.</p>
     * 
     * @param request DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    public DisableSmbAclResponse disableSmbAcl(DisableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables EBS Lens.</p>
     * 
     * @param request EnableDataInsightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDataInsightResponse
     */
    public EnableDataInsightResponse enableDataInsightWithOptions(EnableDataInsightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDataInsight"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDataInsightResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables EBS Lens.</p>
     * 
     * @param request EnableDataInsightRequest
     * @return EnableDataInsightResponse
     */
    public EnableDataInsightResponse enableDataInsight(EnableDataInsightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDataInsightWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the NFS ACL feature.</p>
     * 
     * @param request EnableNfsAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableNfsAclResponse
     */
    public EnableNfsAclResponse enableNfsAclWithOptions(EnableNfsAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableNfsAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableNfsAclResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the NFS ACL feature.</p>
     * 
     * @param request EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    public EnableNfsAclResponse enableNfsAcl(EnableNfsAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableNfsAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the recycle bin feature.</p>
     * 
     * @param request EnableRecycleBinRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableRecycleBinResponse
     */
    public EnableRecycleBinResponse enableRecycleBinWithOptions(EnableRecycleBinRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedDays)) {
            query.put("ReservedDays", request.reservedDays);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableRecycleBin"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableRecycleBinResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the recycle bin feature.</p>
     * 
     * @param request EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    public EnableRecycleBinResponse enableRecycleBin(EnableRecycleBinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableRecycleBinWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By connecting the mount target of an SMB file system to an AD domain, you can implement user identity authentication management and file-level access permissions control in the AD domain. Before you mount and use an SMB file system as an AD domain user, you must register a service for the SMB file system in the AD domain, generate a keytab file, and upload the file to the NAS console to enable the SMB ACL feature. <a href="https://help.aliyun.com/document_detail/154930.html">Generate a keytab file</a>.</li>
     * <li>Before you begin: Before invoking this operation, confirm that Key Management Service (KMS) is activated in the target area. You can invoke the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> operation or activate KMS in the console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the SMB AD ACL feature.</p>
     * 
     * @param request EnableSmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSmbAclResponse
     */
    public EnableSmbAclResponse enableSmbAclWithOptions(EnableSmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytab)) {
            query.put("Keytab", request.keytab);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytabMd5)) {
            query.put("KeytabMd5", request.keytabMd5);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSmbAclResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By connecting the mount target of an SMB file system to an AD domain, you can implement user identity authentication management and file-level access permissions control in the AD domain. Before you mount and use an SMB file system as an AD domain user, you must register a service for the SMB file system in the AD domain, generate a keytab file, and upload the file to the NAS console to enable the SMB ACL feature. <a href="https://help.aliyun.com/document_detail/154930.html">Generate a keytab file</a>.</li>
     * <li>Before you begin: Before invoking this operation, confirm that Key Management Service (KMS) is activated in the target area. You can invoke the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> operation or activate KMS in the console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables the SMB AD ACL feature.</p>
     * 
     * @param request EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    public EnableSmbAclResponse enableSmbAcl(EnableSmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSmbAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Applies to agentic-type file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an Agentic space.</p>
     * 
     * @param request GetAgenticSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgenticSpaceResponse
     */
    public GetAgenticSpaceResponse getAgenticSpaceWithOptions(GetAgenticSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agenticSpaceId)) {
            query.put("AgenticSpaceId", request.agenticSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgenticSpace"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgenticSpaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Applies to agentic-type file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an Agentic space.</p>
     * 
     * @param request GetAgenticSpaceRequest
     * @return GetAgenticSpaceResponse
     */
    public GetAgenticSpaceResponse getAgenticSpace(GetAgenticSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgenticSpaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a specified directory contains Infrequent Access (IA) storage class or Archive storage class files, or queries whether a specified file is an IA storage class or Archive storage class file.</p>
     * 
     * @param request GetDirectoryOrFilePropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectoryOrFilePropertiesResponse
     */
    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFilePropertiesWithOptions(GetDirectoryOrFilePropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectoryOrFileProperties"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryOrFilePropertiesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a specified directory contains Infrequent Access (IA) storage class or Archive storage class files, or queries whether a specified file is an IA storage class or Archive storage class file.</p>
     * 
     * @param request GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    public GetDirectoryOrFilePropertiesResponse getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryOrFilePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support Filesets. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a created Fileset.</p>
     * 
     * @param request GetFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFilesetResponse
     */
    public GetFilesetResponse getFilesetWithOptions(GetFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support Filesets. You can view the version information on the file system details page in the console.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a created Fileset.</p>
     * 
     * @param request GetFilesetRequest
     * @return GetFilesetResponse
     */
    public GetFilesetResponse getFileset(GetFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFilesetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the export directory information of a protocol service.
     * <strong>Before you begin</strong>
     * Before you call this operation, make sure that each dependent resource in the following three-layer resource model already exists:</p>
     * <ol>
     * <li><strong>File system (FileSystem)</strong>: Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to obtain the FileSystemId.</li>
     * <li><strong>Protocol service (ProtocolService)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to obtain the ProtocolServiceId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> to create one.</li>
     * <li><strong>Export directory (ProtocolMountTarget)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create an export directory and obtain the ExportId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the ExportId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directory information of a protocol service.</p>
     * 
     * @param request GetProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProtocolMountTargetResponse
     */
    public GetProtocolMountTargetResponse getProtocolMountTargetWithOptions(GetProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the export directory information of a protocol service.
     * <strong>Before you begin</strong>
     * Before you call this operation, make sure that each dependent resource in the following three-layer resource model already exists:</p>
     * <ol>
     * <li><strong>File system (FileSystem)</strong>: Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to obtain the FileSystemId.</li>
     * <li><strong>Protocol service (ProtocolService)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to obtain the ProtocolServiceId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> to create one.</li>
     * <li><strong>Export directory (ProtocolMountTarget)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create an export directory and obtain the ExportId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the ExportId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the export directory information of a protocol service.</p>
     * 
     * @param request GetProtocolMountTargetRequest
     * @return GetProtocolMountTargetResponse
     */
    public GetProtocolMountTargetResponse getProtocolMountTarget(GetProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recycle bin configuration of a specified General-purpose NAS file system.</p>
     * 
     * @param request GetRecycleBinAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecycleBinAttributeResponse
     */
    public GetRecycleBinAttributeResponse getRecycleBinAttributeWithOptions(GetRecycleBinAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecycleBinAttribute"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecycleBinAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recycle bin configuration of a specified General-purpose NAS file system.</p>
     * 
     * @param request GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    public GetRecycleBinAttributeResponse getRecycleBinAttribute(GetRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access point information.</p>
     * 
     * @param request ListAccessPointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessPointsResponse
     */
    public ListAccessPointsResponse listAccessPointsWithOptions(ListAccessPointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
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
            new TeaPair("action", "ListAccessPoints"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessPointsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access point information.</p>
     * 
     * @param request ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    public ListAccessPointsResponse listAccessPoints(ListAccessPointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessPointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the directory structure of EBS Lens.</p>
     * 
     * @param request ListDataInsightDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataInsightDirectoriesResponse
     */
    public ListDataInsightDirectoriesResponse listDataInsightDirectoriesWithOptions(ListDataInsightDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDir)) {
            query.put("ParentDir", request.parentDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataInsightDirectories"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataInsightDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the directory structure of EBS Lens.</p>
     * 
     * @param request ListDataInsightDirectoriesRequest
     * @return ListDataInsightDirectoriesResponse
     */
    public ListDataInsightDirectoriesResponse listDataInsightDirectories(ListDataInsightDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataInsightDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of IA storage class files and subdirectories that contain IA storage class files under a specified directory in a General-purpose NAS file system.</p>
     * 
     * @param request ListDirectoriesAndFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDirectoriesAndFilesResponse
     */
    public ListDirectoriesAndFilesResponse listDirectoriesAndFilesWithOptions(ListDirectoriesAndFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryOnly)) {
            query.put("DirectoryOnly", request.directoryOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectoriesAndFiles"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectoriesAndFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of IA storage class files and subdirectories that contain IA storage class files under a specified directory in a General-purpose NAS file system.</p>
     * 
     * @param request ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    public ListDirectoriesAndFilesResponse listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of created data retrieval tasks.</p>
     * 
     * @param request ListLifecycleRetrieveJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLifecycleRetrieveJobsResponse
     */
    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobsWithOptions(ListLifecycleRetrieveJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLifecycleRetrieveJobs"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLifecycleRetrieveJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of created data retrieval tasks.</p>
     * 
     * @param request ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    public ListLifecycleRetrieveJobsResponse listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLifecycleRetrieveJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.
     * <strong>Before you begin</strong>
     * Before calling this operation, make sure that the recycle bin feature is enabled for the file system. If the recycle bin is not enabled, this operation cannot return the list of recently deleted directories.
     * <strong>Enable the recycle bin</strong>
     * To enable the recycle bin feature, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablerecyclebin">EnableRecycleBin</a> operation. After the recycle bin is enabled, deleted directories in the file system are moved to the recycle bin. You can call this operation to query the list of recently deleted directories.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries directories on which delete operations were recently performed.</p>
     * 
     * @param request ListRecentlyRecycledDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectoriesWithOptions(ListRecentlyRecycledDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentlyRecycledDirectories"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentlyRecycledDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.
     * <strong>Before you begin</strong>
     * Before calling this operation, make sure that the recycle bin feature is enabled for the file system. If the recycle bin is not enabled, this operation cannot return the list of recently deleted directories.
     * <strong>Enable the recycle bin</strong>
     * To enable the recycle bin feature, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablerecyclebin">EnableRecycleBin</a> operation. After the recycle bin is enabled, deleted directories in the file system are moved to the recycle bin. You can call this operation to query the list of recently deleted directories.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries directories on which delete operations were recently performed.</p>
     * 
     * @param request ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    public ListRecentlyRecycledDirectoriesResponse listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentlyRecycledDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can query up to 50 most recently executed tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about one or more tasks in the recycle bin.</p>
     * 
     * @param request ListRecycleBinJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecycleBinJobsResponse
     */
    public ListRecycleBinJobsResponse listRecycleBinJobsWithOptions(ListRecycleBinJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecycleBinJobs"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecycleBinJobsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can query up to 50 most recently executed tasks.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries information about one or more tasks in the recycle bin.</p>
     * 
     * @param request ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    public ListRecycleBinJobsResponse listRecycleBinJobs(ListRecycleBinJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycleBinJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries deleted files or directories.</p>
     * 
     * @param request ListRecycledDirectoriesAndFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFilesWithOptions(ListRecycledDirectoriesAndFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecycledDirectoriesAndFiles"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecycledDirectoriesAndFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries deleted files or directories.</p>
     * 
     * @param request ListRecycledDirectoriesAndFilesRequest
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    public ListRecycledDirectoriesAndFilesResponse listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecycledDirectoriesAndFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
            new TeaPair("version", "2017-06-26"),
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
     * <p>Queries a list of tags.</p>
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
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group.</p>
     * 
     * @param request ModifyAccessGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessGroupResponse
     */
    public ModifyAccessGroupResponse modifyAccessGroupWithOptions(ModifyAccessGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessGroup"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission group.</p>
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
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies access point information.</p>
     * 
     * @param request ModifyAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessPointResponse
     */
    public ModifyAccessPointResponse modifyAccessPointWithOptions(ModifyAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroup)) {
            query.put("AccessGroup", request.accessGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointName)) {
            query.put("AccessPointName", request.accessPointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabledRam)) {
            query.put("EnabledRam", request.enabledRam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies access point information.</p>
     * 
     * @param request ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    public ModifyAccessPointResponse modifyAccessPoint(ModifyAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission rule in a permission group.</p>
     * 
     * @param request ModifyAccessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccessRuleResponse
     */
    public ModifyAccessRuleResponse modifyAccessRuleWithOptions(ModifyAccessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessRuleId)) {
            query.put("AccessRuleId", request.accessRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6SourceCidrIp)) {
            query.put("Ipv6SourceCidrIp", request.ipv6SourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RWAccessType)) {
            query.put("RWAccessType", request.RWAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessType)) {
            query.put("UserAccessType", request.userAccessType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccessRule"),
            new TeaPair("version", "2017-06-26"),
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
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a permission rule in a permission group.</p>
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
     * <p><em>Prerequisites</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>Call ModifyAgenticSpace to modify the Agentic space configurations.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Agentic space.</p>
     * 
     * @param request ModifyAgenticSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAgenticSpaceResponse
     */
    public ModifyAgenticSpaceResponse modifyAgenticSpaceWithOptions(ModifyAgenticSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agenticSpaceId)) {
            query.put("AgenticSpaceId", request.agenticSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAgenticSpace"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAgenticSpaceResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>Call ModifyAgenticSpace to modify the Agentic space configurations.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Agentic space.</p>
     * 
     * @param request ModifyAgenticSpaceRequest
     * @return ModifyAgenticSpaceResponse
     */
    public ModifyAgenticSpaceResponse modifyAgenticSpace(ModifyAgenticSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAgenticSpaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an automatic snapshot policy. After you modify an automatic snapshot policy, file systems to which the policy has been applied immediately execute the modified policy.</p>
     * 
     * @param request ModifyAutoSnapshotPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoSnapshotPolicyResponse
     */
    public ModifyAutoSnapshotPolicyResponse modifyAutoSnapshotPolicyWithOptions(ModifyAutoSnapshotPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyId)) {
            query.put("AutoSnapshotPolicyId", request.autoSnapshotPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSnapshotPolicyName)) {
            query.put("AutoSnapshotPolicyName", request.autoSnapshotPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatWeekdays)) {
            query.put("RepeatWeekdays", request.repeatWeekdays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retentionDays)) {
            query.put("RetentionDays", request.retentionDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoints)) {
            query.put("TimePoints", request.timePoints);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoSnapshotPolicy"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an automatic snapshot policy. After you modify an automatic snapshot policy, file systems to which the policy has been applied immediately execute the modified policy.</p>
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
     * <p>Modifies an access point of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request ModifyCpfsAccessPointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCpfsAccessPointResponse
     */
    public ModifyCpfsAccessPointResponse modifyCpfsAccessPointWithOptions(ModifyCpfsAccessPointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessPointId)) {
            query.put("AccessPointId", request.accessPointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

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
            new TeaPair("action", "ModifyCpfsAccessPoint"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCpfsAccessPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies an access point of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an access point of a CPFS for Lingjun file system.</p>
     * 
     * @param request ModifyCpfsAccessPointRequest
     * @return ModifyCpfsAccessPointResponse
     */
    public ModifyCpfsAccessPointResponse modifyCpfsAccessPoint(ModifyCpfsAccessPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCpfsAccessPointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data streams.</li>
     * <li>You can modify the properties of a data stream only when the data stream is in the <code>Running (Normal)</code> state.</li>
     * <li>Modifying a data stream typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the data stream modification.</li>
     * <li>CPFS data stream specifications:<ul>
     * <li>Data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data stream bandwidth specifies the maximum transmission bandwidth that the data stream can achieve during data import or export.</li>
     * <li>Inventory check: If you set DryRun to true, you can check whether the resources required to modify the data stream to the specified specification are sufficient.</li>
     * </ul>
     * </li>
     * <li>CPFS billing
     * Modifying the data stream bandwidth (Throughput) incurs data stream bandwidth fees. Familiarize yourself with the billable methods of CPFS in advance. For details, see <a href="https://help.aliyun.com/document_detail/111858.html">CPFS billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a data flow.</p>
     * 
     * @param request ModifyDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataFlowResponse
     */
    public ModifyDataFlowResponse modifyDataFlowWithOptions(ModifyDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.throughput)) {
            query.put("Throughput", request.throughput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data streams.</li>
     * <li>You can modify the properties of a data stream only when the data stream is in the <code>Running (Normal)</code> state.</li>
     * <li>Modifying a data stream typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the data stream modification.</li>
     * <li>CPFS data stream specifications:<ul>
     * <li>Data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data stream bandwidth specifies the maximum transmission bandwidth that the data stream can achieve during data import or export.</li>
     * <li>Inventory check: If you set DryRun to true, you can check whether the resources required to modify the data stream to the specified specification are sufficient.</li>
     * </ul>
     * </li>
     * <li>CPFS billing
     * Modifying the data stream bandwidth (Throughput) incurs data stream bandwidth fees. Familiarize yourself with the billable methods of CPFS in advance. For details, see <a href="https://help.aliyun.com/document_detail/111858.html">CPFS billing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a data flow.</p>
     * 
     * @param request ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    public ModifyDataFlowResponse modifyDataFlow(ModifyDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the automatic update configuration of a dataflow only when the dataflow is in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Modifying the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the automatic update task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the automatic update configuration of a dataflow.</p>
     * 
     * @param request ModifyDataFlowAutoRefreshRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataFlowAutoRefreshResponse
     */
    public ModifyDataFlowAutoRefreshResponse modifyDataFlowAutoRefreshWithOptions(ModifyDataFlowAutoRefreshRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshInterval)) {
            query.put("AutoRefreshInterval", request.autoRefreshInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRefreshPolicy)) {
            query.put("AutoRefreshPolicy", request.autoRefreshPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataFlowAutoRefresh"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataFlowAutoRefreshResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the automatic update configuration of a dataflow only when the dataflow is in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Modifying the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the automatic update task.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the automatic update configuration of a dataflow.</p>
     * 
     * @param request ModifyDataFlowAutoRefreshRequest
     * @return ModifyDataFlowAutoRefreshResponse
     */
    public ModifyDataFlowAutoRefreshResponse modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataFlowAutoRefreshWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param tmpReq ModifyFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyFileSystemShrinkRequest request = new ModifyFileSystemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoUpgradeConfig)) {
            request.autoUpgradeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoUpgradeConfig, "AutoUpgradeConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.options)) {
            request.optionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.options, "Options", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUpgradeConfigShrink)) {
            query.put("AutoUpgradeConfig", request.autoUpgradeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsShrink)) {
            query.put("Options", request.optionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileSystem"),
            new TeaPair("version", "2017-06-26"),
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
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support modifying fileset information.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a fileset.</p>
     * 
     * @param request ModifyFilesetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFilesetResponse
     */
    public ModifyFilesetResponse modifyFilesetWithOptions(ModifyFilesetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileset"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFilesetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.7.0 and later support modifying fileset information.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information of a fileset.</p>
     * 
     * @param request ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    public ModifyFilesetResponse modifyFileset(ModifyFilesetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFilesetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the LDAP configuration.</p>
     * 
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated
     * 
     * @param request ModifyLDAPConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public ModifyLDAPConfigResponse modifyLDAPConfigWithOptions(ModifyLDAPConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindDN)) {
            query.put("BindDN", request.bindDN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchBase)) {
            query.put("SearchBase", request.searchBase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URI)) {
            query.put("URI", request.URI);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLDAPConfig"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLDAPConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the LDAP configuration.</p>
     * 
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated
     * 
     * @param request ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    // Deprecated
    public ModifyLDAPConfigResponse modifyLDAPConfig(ModifyLDAPConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLDAPConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle management policy.</p>
     * 
     * @param request ModifyLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLifecyclePolicyResponse
     */
    public ModifyLifecyclePolicyResponse modifyLifecyclePolicyWithOptions(ModifyLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyName)) {
            query.put("LifecyclePolicyName", request.lifecyclePolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecycleRuleName)) {
            query.put("LifecycleRuleName", request.lifecycleRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLifecyclePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a lifecycle management policy.</p>
     * 
     * @param request ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    public ModifyLifecyclePolicyResponse modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only mount target information of General-purpose NAS or Extreme NAS file systems can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies mount target information.</p>
     * 
     * @param request ModifyMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMountTargetResponse
     */
    public ModifyMountTargetResponse modifyMountTargetWithOptions(ModifyMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessGroupName)) {
            query.put("AccessGroupName", request.accessGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessPointAccessOnly)) {
            query.put("AccessPointAccessOnly", request.accessPointAccessOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dualStackMountTargetDomain)) {
            query.put("DualStackMountTargetDomain", request.dualStackMountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetDomain)) {
            query.put("MountTargetDomain", request.mountTargetDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only mount target information of General-purpose NAS or Extreme NAS file systems can be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies mount target information.</p>
     * 
     * @param request ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    public ModifyMountTargetResponse modifyMountTarget(ModifyMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Status prerequisite: Before calling this operation, the export directory corresponding to ExportId must be in the AVAILABLE state. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the status and wait until the creation is complete before retrying.</li>
     * <li>Dependency chain:<ol>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> (with FileSystemType set to cpfs) to obtain the CPFS file system.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to verify that the protocol service is in the Running state.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to verify that the export directory is in the AVAILABLE state.</li>
     * <li>If no export directory exists, call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create one first.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the export directory parameters of a protocol service. You can modify only the permission group and description. The VPC ID and vSwitch ID cannot be modified. To change them, delete the export directory and create a new one.</p>
     * 
     * @param request ModifyProtocolMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProtocolMountTargetResponse
     */
    public ModifyProtocolMountTargetResponse modifyProtocolMountTargetWithOptions(ModifyProtocolMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtocolMountTarget"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtocolMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Status prerequisite: Before calling this operation, the export directory corresponding to ExportId must be in the AVAILABLE state. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the status and wait until the creation is complete before retrying.</li>
     * <li>Dependency chain:<ol>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> (with FileSystemType set to cpfs) to obtain the CPFS file system.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to verify that the protocol service is in the Running state.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to verify that the export directory is in the AVAILABLE state.</li>
     * <li>If no export directory exists, call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create one first.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the export directory parameters of a protocol service. You can modify only the permission group and description. The VPC ID and vSwitch ID cannot be modified. To change them, delete the export directory and create a new one.</p>
     * 
     * @param request ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    public ModifyProtocolMountTargetResponse modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>This operation allows you to modify the description of a protocol service.</li>
     * <li>You can obtain the protocol service ID (ProtocolServiceId) in the following ways:<ul>
     * <li>From the response of the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> operation after you create a protocol service.</li>
     * <li>From the response of the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation that queries existing protocol services.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a protocol service. You can modify the description of a protocol service.</p>
     * 
     * @param request ModifyProtocolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyProtocolServiceResponse
     */
    public ModifyProtocolServiceResponse modifyProtocolServiceWithOptions(ModifyProtocolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolServiceId)) {
            query.put("ProtocolServiceId", request.protocolServiceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyProtocolService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyProtocolServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>This operation allows you to modify the description of a protocol service.</li>
     * <li>You can obtain the protocol service ID (ProtocolServiceId) in the following ways:<ul>
     * <li>From the response of the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> operation after you create a protocol service.</li>
     * <li>From the response of the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation that queries existing protocol services.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a protocol service. You can modify the description of a protocol service.</p>
     * 
     * @param request ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    public ModifyProtocolServiceResponse modifyProtocolService(ModifyProtocolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyProtocolServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Make sure that Key Management Service (KMS) is activated in the target region before you call this operation. Call sequence: Activate KMS → Call EnableSmbAcl to initialize → Call ModifySmbAcl.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the SMB AD ACL feature.</p>
     * 
     * @param request ModifySmbAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySmbAclResponse
     */
    public ModifySmbAclResponse modifySmbAclWithOptions(ModifySmbAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAnonymousAccess)) {
            query.put("EnableAnonymousAccess", request.enableAnonymousAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptData)) {
            query.put("EncryptData", request.encryptData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.homeDirPath)) {
            query.put("HomeDirPath", request.homeDirPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytab)) {
            query.put("Keytab", request.keytab);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keytabMd5)) {
            query.put("KeytabMd5", request.keytabMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectUnencryptedAccess)) {
            query.put("RejectUnencryptedAccess", request.rejectUnencryptedAccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superAdminSid)) {
            query.put("SuperAdminSid", request.superAdminSid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySmbAcl"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySmbAclResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin: Make sure that Key Management Service (KMS) is activated in the target region before you call this operation. Call sequence: Activate KMS → Call EnableSmbAcl to initialize → Call ModifySmbAcl.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the SMB AD ACL feature.</p>
     * 
     * @param request ModifySmbAclRequest
     * @return ModifySmbAclResponse
     */
    public ModifySmbAclResponse modifySmbAcl(ModifySmbAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySmbAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Apsara File Storage NAS (NAS) service.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenNASServiceResponse
     */
    public OpenNASServiceResponse openNASServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenNASService"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenNASServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Apsara File Storage NAS (NAS) service.</p>
     * @return OpenNASServiceResponse
     */
    public OpenNASServiceResponse openNASService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openNASServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a client from the blacklist in Cloud Parallel File Storage (CPFS) to resume its write requests.</p>
     * 
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated
     * 
     * @param request RemoveClientFromBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    // Deprecated
    public RemoveClientFromBlackListResponse removeClientFromBlackListWithOptions(RemoveClientFromBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIP)) {
            query.put("ClientIP", request.clientIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

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
            new TeaPair("action", "RemoveClientFromBlackList"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClientFromBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only CPFS parallel file systems.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a client from the blacklist in Cloud Parallel File Storage (CPFS) to resume its write requests.</p>
     * 
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated
     * 
     * @param request RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    // Deprecated
    public RemoveClientFromBlackListResponse removeClientFromBlackList(RemoveClientFromBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClientFromBlackListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a file system to the state of a historical snapshot.</p>
     * 
     * @param request ResetFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetFileSystemResponse
     */
    public ResetFileSystemResponse resetFileSystemWithOptions(ResetFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a file system to the state of a historical snapshot.</p>
     * 
     * @param request ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    public ResetFileSystemResponse resetFileSystem(ResetFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries a data retrieval task that is in the failed state.</p>
     * 
     * @param request RetryLifecycleRetrieveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryLifecycleRetrieveJobResponse
     */
    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJobWithOptions(RetryLifecycleRetrieveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryLifecycleRetrieveJob"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryLifecycleRetrieveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Retries a data retrieval task that is in the failed state.</p>
     * 
     * @param request RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    public RetryLifecycleRetrieveJobResponse retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryLifecycleRetrieveJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set <code>StorageType=Agentic</code>.<ul>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for an Agentic space.</p>
     * 
     * @param request SetAgenticSpaceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAgenticSpaceQuotaResponse
     */
    public SetAgenticSpaceQuotaResponse setAgenticSpaceQuotaWithOptions(SetAgenticSpaceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agenticSpaceId)) {
            query.put("AgenticSpaceId", request.agenticSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCountLimit)) {
            query.put("FileCountLimit", request.fileCountLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeLimit)) {
            query.put("SizeLimit", request.sizeLimit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAgenticSpaceQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAgenticSpaceQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain an AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> operation to create a file system, set <code>StorageType=Agentic</code>.<ul>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Check the console for details.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for an Agentic space.</p>
     * 
     * @param request SetAgenticSpaceQuotaRequest
     * @return SetAgenticSpaceQuotaResponse
     */
    public SetAgenticSpaceQuotaResponse setAgenticSpaceQuota(SetAgenticSpaceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAgenticSpaceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a directory quota for a file system.</p>
     * 
     * @param request SetDirQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDirQuotaResponse
     */
    public SetDirQuotaResponse setDirQuotaWithOptions(SetDirQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileCountLimit)) {
            query.put("FileCountLimit", request.fileCountLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaType)) {
            query.put("QuotaType", request.quotaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeLimit)) {
            query.put("SizeLimit", request.sizeLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDirQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDirQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a directory quota for a file system.</p>
     * 
     * @param request SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    public SetDirQuotaResponse setDirQuota(SetDirQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDirQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support setting quotas for filesets.</li>
     * <li>The minimum fileset capacity quota is 10 GiB, and the capacity can be increased in increments of 1 GiB.</li>
     * <li>A fileset supports up to 10 billion files or directories. The minimum value is 10,000, and the value can be increased in increments of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>You must specify at least one of the capacity limit and the file count limit.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a quota for a fileset.</p>
     * 
     * @param request SetFilesetQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetFilesetQuotaResponse
     */
    public SetFilesetQuotaResponse setFilesetQuotaWithOptions(SetFilesetQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCountLimit)) {
            query.put("FileCountLimit", request.fileCountLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fsetId)) {
            query.put("FsetId", request.fsetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeLimit)) {
            query.put("SizeLimit", request.sizeLimit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFilesetQuota"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFilesetQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support setting quotas for filesets.</li>
     * <li>The minimum fileset capacity quota is 10 GiB, and the capacity can be increased in increments of 1 GiB.</li>
     * <li>A fileset supports up to 10 billion files or directories. The minimum value is 10,000, and the value can be increased in increments of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>You must specify at least one of the capacity limit and the file count limit.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a quota for a fileset.</p>
     * 
     * @param request SetFilesetQuotaRequest
     * @return SetFilesetQuotaResponse
     */
    public SetFilesetQuotaResponse setFilesetQuota(SetFilesetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setFilesetQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can enable only a data flow that is in the <code>Stopped</code> state.</li>
     * <li>If DryRun is set to <code>true</code>, you can check whether sufficient resources are available to enable a data flow of the specified specifications. If inventory resources are insufficient, the data flow cannot be enabled.</li>
     * <li>Enabling a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the data flow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a data flow.</p>
     * 
     * @param request StartDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDataFlowResponse
     */
    public StartDataFlowResponse startDataFlowWithOptions(StartDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can enable only a data flow that is in the <code>Stopped</code> state.</li>
     * <li>If DryRun is set to <code>true</code>, you can check whether sufficient resources are available to enable a data flow of the specified specifications. If inventory resources are insufficient, the data flow cannot be enabled.</li>
     * <li>Enabling a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the data flow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a data flow.</p>
     * 
     * @param request StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    public StartDataFlowResponse startDataFlow(StartDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Starts the execution of a lifecycle management policy.
     * This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts the execution of a lifecycle management policy.</p>
     * 
     * @param request StartLifecyclePolicyExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartLifecyclePolicyExecutionResponse
     */
    public StartLifecyclePolicyExecutionResponse startLifecyclePolicyExecutionWithOptions(StartLifecyclePolicyExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartLifecyclePolicyExecution"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLifecyclePolicyExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Starts the execution of a lifecycle management policy.
     * This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts the execution of a lifecycle management policy.</p>
     * 
     * @param request StartLifecyclePolicyExecutionRequest
     * @return StartLifecyclePolicyExecutionResponse
     */
    public StartLifecyclePolicyExecutionResponse startLifecyclePolicyExecution(StartLifecyclePolicyExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLifecyclePolicyExecutionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can disable only a dataflow in the <code>Running</code> state.</li>
     * <li>After a dataflow is disabled, you cannot create dataflow tasks for it. If automatic update is configured, data updates on the source are not synchronized to CPFS.</li>
     * <li>After a dataflow is disabled, the dataflow bandwidth is no longer billed because resources are reclaimed. However, re-enabling the dataflow may fail due to insufficient inventory.</li>
     * <li>Disabling a dataflow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> to query the dataflow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a dataflow.</p>
     * 
     * @param request StopDataFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDataFlowResponse
     */
    public StopDataFlowResponse stopDataFlowWithOptions(StopDataFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFlowId)) {
            query.put("DataFlowId", request.dataFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDataFlow"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDataFlowResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can disable only a dataflow in the <code>Running</code> state.</li>
     * <li>After a dataflow is disabled, you cannot create dataflow tasks for it. If automatic update is configured, data updates on the source are not synchronized to CPFS.</li>
     * <li>After a dataflow is disabled, the dataflow bandwidth is no longer billed because resources are reclaimed. However, re-enabling the dataflow may fail due to insufficient inventory.</li>
     * <li>Disabling a dataflow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> to query the dataflow status.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a dataflow.</p>
     * 
     * @param request StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    public StopDataFlowResponse stopDataFlow(StopDataFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stops the execution of a lifecycle policy.
     * This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the execution of a lifecycle policy.</p>
     * 
     * @param request StopLifecyclePolicyExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopLifecyclePolicyExecutionResponse
     */
    public StopLifecyclePolicyExecutionResponse stopLifecyclePolicyExecutionWithOptions(StopLifecyclePolicyExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLifecyclePolicyExecution"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLifecyclePolicyExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Stops the execution of a lifecycle policy.
     * This operation is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops the execution of a lifecycle policy.</p>
     * 
     * @param request StopLifecyclePolicyExecutionRequest
     * @return StopLifecyclePolicyExecutionResponse
     */
    public StopLifecyclePolicyExecutionResponse stopLifecyclePolicyExecution(StopLifecyclePolicyExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLifecyclePolicyExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to specified resources. File systems and access points are supported.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("version", "2017-06-26"),
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
     * <p>Creates and attaches tags to specified resources. File systems and access points are supported.</p>
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
     * <p>Deletes the tags of a specified resource.</p>
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
            new TeaPair("version", "2017-06-26"),
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
     * <p>Deletes the tags of a specified resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the rules of a lifecycle management policy. Only CPFS for Lingjun is supported.
     * UpdateLifecyclePolicy uses overwrite semantics. If an optional parameter is left empty, the corresponding field is deleted. To append lifecycle rules, first call the DescribeLifecyclePolicies operation to obtain the current lifecycle rule configurations, append the new lifecycle rule configurations, and then call the UpdateLifecyclePolicy operation to update the lifecycle rule configurations.</p>
     * 
     * @param request UpdateLifecyclePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLifecyclePolicyResponse
     */
    public UpdateLifecyclePolicyResponse updateLifecyclePolicyWithOptions(UpdateLifecyclePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteRules)) {
            query.put("DeleteRules", request.deleteRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lifecyclePolicyId)) {
            query.put("LifecyclePolicyId", request.lifecyclePolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paths)) {
            query.put("Paths", request.paths);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retrieveRules)) {
            query.put("RetrieveRules", request.retrieveRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRules)) {
            query.put("TransitRules", request.transitRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLifecyclePolicy"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLifecyclePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the rules of a lifecycle management policy. Only CPFS for Lingjun is supported.
     * UpdateLifecyclePolicy uses overwrite semantics. If an optional parameter is left empty, the corresponding field is deleted. To append lifecycle rules, first call the DescribeLifecyclePolicies operation to obtain the current lifecycle rule configurations, append the new lifecycle rule configurations, and then call the UpdateLifecyclePolicy operation to update the lifecycle rule configurations.</p>
     * 
     * @param request UpdateLifecyclePolicyRequest
     * @return UpdateLifecyclePolicyResponse
     */
    public UpdateLifecyclePolicyResponse updateLifecyclePolicy(UpdateLifecyclePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLifecyclePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the retention period of data in a recycle bin.</p>
     * 
     * @param request UpdateRecycleBinAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecycleBinAttributeResponse
     */
    public UpdateRecycleBinAttributeResponse updateRecycleBinAttributeWithOptions(UpdateRecycleBinAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecycleBinAttribute"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecycleBinAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the retention period of data in a recycle bin.</p>
     * 
     * @param request UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    public UpdateRecycleBinAttributeResponse updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecycleBinAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Extreme NAS file systems and CPFS file systems can be scaled up.</li>
     * <li>General-purpose NAS file systems scale up automatically on demand. You do not need to call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales up the storage capacity of an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request UpgradeFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeFileSystemResponse
     */
    public UpgradeFileSystemResponse upgradeFileSystemWithOptions(UpgradeFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeFileSystem"),
            new TeaPair("version", "2017-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeFileSystemResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Extreme NAS file systems and CPFS file systems can be scaled up.</li>
     * <li>General-purpose NAS file systems scale up automatically on demand. You do not need to call this operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Scales up the storage capacity of an Extreme NAS file system or a Cloud Parallel File Storage (CPFS) file system.</p>
     * 
     * @param request UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    public UpgradeFileSystemResponse upgradeFileSystem(UpgradeFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFileSystemWithOptions(request, runtime);
    }
}
