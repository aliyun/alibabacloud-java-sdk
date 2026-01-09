// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207;

import com.aliyun.tea.*;
import com.aliyun.cloudfw20171207.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "cloudfw.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudfw.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudfw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>备份ACL</p>
     * 
     * @param request AddAclBackupDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAclBackupDataResponse
     */
    public AddAclBackupDataResponse addAclBackupDataWithOptions(AddAclBackupDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backUpTime)) {
            query.put("BackUpTime", request.backUpTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAclBackupData"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAclBackupDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>备份ACL</p>
     * 
     * @param request AddAclBackupDataRequest
     * @return AddAclBackupDataResponse
     */
    public AddAclBackupDataResponse addAclBackupData(AddAclBackupDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAclBackupDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddAddressBook operation to create an address book for access control. The address book can be an IP address book, an ECS tag-based address book, a port address book, or a domain address book.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an address book for access control. Supported address book types are IP address books, Elastic Compute Service (ECS) tag-based address books, port address books, and domain address books. An ECS tag-based address book includes the public IP addresses of the ECS instances that have specific tags.</p>
     * 
     * @param request AddAddressBookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAddressBookResponse
     */
    public AddAddressBookResponse addAddressBookWithOptions(AddAddressBookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ackClusterConnectorId)) {
            query.put("AckClusterConnectorId", request.ackClusterConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ackLabels)) {
            query.put("AckLabels", request.ackLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ackNamespaces)) {
            query.put("AckNamespaces", request.ackNamespaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressList)) {
            query.put("AddressList", request.addressList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoAddTagEcs)) {
            query.put("AutoAddTagEcs", request.autoAddTagEcs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("TagList", request.tagList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRelation)) {
            query.put("TagRelation", request.tagRelation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressBookResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddAddressBook operation to create an address book for access control. The address book can be an IP address book, an ECS tag-based address book, a port address book, or a domain address book.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an address book for access control. Supported address book types are IP address books, Elastic Compute Service (ECS) tag-based address books, port address books, and domain address books. An ECS tag-based address book includes the public IP addresses of the ECS instances that have specific tags.</p>
     * 
     * @param request AddAddressBookRequest
     * @return AddAddressBookResponse
     */
    public AddAddressBookResponse addAddressBook(AddAddressBookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAddressBookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddControlPolicy operation to create an access control policy to allow, block, or monitor traffic that reaches Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy.</p>
     * 
     * @param request AddControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddControlPolicyResponse
     */
    public AddControlPolicyResponse addControlPolicyWithOptions(AddControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the AddControlPolicy operation to create an access control policy to allow, block, or monitor traffic that reaches Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy.</p>
     * 
     * @param request AddControlPolicyRequest
     * @return AddControlPolicyResponse
     */
    public AddControlPolicyResponse addControlPolicy(AddControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加DNS防火墙ACL</p>
     * 
     * @param request AddDnsFirewallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnsFirewallPolicyResponse
     */
    public AddDnsFirewallPolicyResponse addDnsFirewallPolicyWithOptions(AddDnsFirewallPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDnsFirewallPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnsFirewallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加DNS防火墙ACL</p>
     * 
     * @param request AddDnsFirewallPolicyRequest
     * @return AddDnsFirewallPolicyResponse
     */
    public AddDnsFirewallPolicyResponse addDnsFirewallPolicy(AddDnsFirewallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnsFirewallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增域名解析实时任务</p>
     * 
     * @param request AddDomainResolveRealtimeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainResolveRealtimeTaskResponse
     */
    public AddDomainResolveRealtimeTaskResponse addDomainResolveRealtimeTaskWithOptions(AddDomainResolveRealtimeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomainResolveRealtimeTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainResolveRealtimeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增域名解析实时任务</p>
     * 
     * @param request AddDomainResolveRealtimeTaskRequest
     * @return AddDomainResolveRealtimeTaskResponse
     */
    public AddDomainResolveRealtimeTaskResponse addDomainResolveRealtimeTask(AddDomainResolveRealtimeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainResolveRealtimeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add members to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds members to Cloud Firewall.</p>
     * 
     * @param request AddInstanceMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInstanceMembersResponse
     */
    public AddInstanceMembersResponse addInstanceMembersWithOptions(AddInstanceMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add members to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds members to Cloud Firewall.</p>
     * 
     * @param request AddInstanceMembersRequest
     * @return AddInstanceMembersResponse
     */
    public AddInstanceMembersResponse addInstanceMembers(AddInstanceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addInstanceMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加私网DNS域名</p>
     * 
     * @param request AddPrivateDnsDomainNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrivateDnsDomainNameResponse
     */
    public AddPrivateDnsDomainNameResponse addPrivateDnsDomainNameWithOptions(AddPrivateDnsDomainNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceId)) {
            query.put("AccessInstanceId", request.accessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameList)) {
            query.put("DomainNameList", request.domainNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrivateDnsDomainName"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrivateDnsDomainNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加私网DNS域名</p>
     * 
     * @param request AddPrivateDnsDomainNameRequest
     * @return AddPrivateDnsDomainNameResponse
     */
    public AddPrivateDnsDomainNameResponse addPrivateDnsDomainName(AddPrivateDnsDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrivateDnsDomainNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.<br>Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy">Back up an access control policy</a>.<br>After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.<br>The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies all access control policies from a policy group of a source virtual private cloud (VPC) firewall to a policy group of a destination VPC firewall.</p>
     * 
     * @deprecated OpenAPI BatchCopyVpcFirewallControlPolicy is deprecated
     * 
     * @param request BatchCopyVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCopyVpcFirewallControlPolicyResponse
     */
    @Deprecated
    // Deprecated
    public BatchCopyVpcFirewallControlPolicyResponse batchCopyVpcFirewallControlPolicyWithOptions(BatchCopyVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceVpcFirewallId)) {
            query.put("SourceVpcFirewallId", request.sourceVpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVpcFirewallId)) {
            query.put("TargetVpcFirewallId", request.targetVpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCopyVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCopyVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the BatchCopyVpcFirewallControlPolicy operation to copy all access control policies from a policy group of a source VPC firewall to a policy group of a destination VPC firewall.<br>Before you call this operation, we recommend that you back up access control policies. For more information about how to back up an access control policy, see <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/back-up-and-roll-back-an-access-control-policy">Back up an access control policy</a>.<br>After you call this operation, all the access control policies in the policy group of the destination VPC firewall are replaced.<br>The policy groups of the source VPC firewall and the destination VPC firewall must belong to the same Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. When the number of calls to this operation per second exceeds the limit, throttling is triggered. Throttling may affect your business. We recommend that you take note of the limit on this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies all access control policies from a policy group of a source virtual private cloud (VPC) firewall to a policy group of a destination VPC firewall.</p>
     * 
     * @deprecated OpenAPI BatchCopyVpcFirewallControlPolicy is deprecated
     * 
     * @param request BatchCopyVpcFirewallControlPolicyRequest
     * @return BatchCopyVpcFirewallControlPolicyResponse
     */
    @Deprecated
    // Deprecated
    public BatchCopyVpcFirewallControlPolicyResponse batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCopyVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple access control policies for a virtual private cloud (VPC) firewall at a time.</p>
     * 
     * @param request BatchDeleteVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteVpcFirewallControlPolicyResponse
     */
    public BatchDeleteVpcFirewallControlPolicyResponse batchDeleteVpcFirewallControlPolicyWithOptions(BatchDeleteVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuidList)) {
            query.put("AclUuidList", request.aclUuidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple access control policies for a virtual private cloud (VPC) firewall at a time.</p>
     * 
     * @param request BatchDeleteVpcFirewallControlPolicyRequest
     * @return BatchDeleteVpcFirewallControlPolicyResponse
     */
    public BatchDeleteVpcFirewallControlPolicyResponse batchDeleteVpcFirewallControlPolicy(BatchDeleteVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空防火墙日志</p>
     * 
     * @param request ClearLogStoreStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearLogStoreStorageResponse
     */
    public ClearLogStoreStorageResponse clearLogStoreStorageWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearLogStoreStorage"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearLogStoreStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空防火墙日志</p>
     * @return ClearLogStoreStorageResponse
     */
    public ClearLogStoreStorageResponse clearLogStoreStorage() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearLogStoreStorageWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ACK集群连接器</p>
     * 
     * @param request CreateAckClusterConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAckClusterConnectorResponse
     */
    public CreateAckClusterConnectorResponse createAckClusterConnectorWithOptions(CreateAckClusterConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            query.put("ConnectorName", request.connectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVswitchId)) {
            query.put("PrimaryVswitchId", request.primaryVswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVswitchIp)) {
            query.put("PrimaryVswitchIp", request.primaryVswitchIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVswitchId)) {
            query.put("StandbyVswitchId", request.standbyVswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVswitchIp)) {
            query.put("StandbyVswitchIp", request.standbyVswitchIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAckClusterConnector"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAckClusterConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ACK集群连接器</p>
     * 
     * @param request CreateAckClusterConnectorRequest
     * @return CreateAckClusterConnectorResponse
     */
    public CreateAckClusterConnectorResponse createAckClusterConnector(CreateAckClusterConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAckClusterConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ACL检查</p>
     * 
     * @param request CreateAclCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAclCheckResponse
     */
    public CreateAclCheckResponse createAclCheckWithOptions(CreateAclCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclType)) {
            query.put("AclType", request.aclType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkNames)) {
            query.put("CheckNames", request.checkNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAclCheck"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAclCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ACL检查</p>
     * 
     * @param request CreateAclCheckRequest
     * @return CreateAclCheckResponse
     */
    public CreateAclCheckResponse createAclCheck(CreateAclCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAclCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a file download task.</p>
     * 
     * @param request CreateDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadTaskResponse
     */
    public CreateDownloadTaskResponse createDownloadTaskWithOptions(CreateDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskData)) {
            query.put("TaskData", request.taskData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDownloadTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDownloadTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a file download task.</p>
     * 
     * @param request CreateDownloadTaskRequest
     * @return CreateDownloadTaskResponse
     */
    public CreateDownloadTaskResponse createDownloadTask(CreateDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例资产同步任务</p>
     * 
     * @param request CreateInstanceSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceSyncTaskResponse
     */
    public CreateInstanceSyncTaskResponse createInstanceSyncTaskWithOptions(CreateInstanceSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceSyncTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceSyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例资产同步任务</p>
     * 
     * @param request CreateInstanceSyncTaskRequest
     * @return CreateInstanceSyncTaskResponse
     */
    public CreateInstanceSyncTaskResponse createInstanceSyncTask(CreateInstanceSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建IPS私网关联信息</p>
     * 
     * @param request CreateIpsPrivateAssocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIpsPrivateAssocResponse
     */
    public CreateIpsPrivateAssocResponse createIpsPrivateAssocWithOptions(CreateIpsPrivateAssocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIpsPrivateAssoc"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIpsPrivateAssocResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建IPS私网关联信息</p>
     * 
     * @param request CreateIpsPrivateAssocRequest
     * @return CreateIpsPrivateAssocResponse
     */
    public CreateIpsPrivateAssocResponse createIpsPrivateAssoc(CreateIpsPrivateAssocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIpsPrivateAssocWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy for a NAT firewall.</p>
     * 
     * @param request CreateNatFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNatFirewallControlPolicyResponse
     */
    public CreateNatFirewallControlPolicyResponse createNatFirewallControlPolicyWithOptions(CreateNatFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNatFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNatFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a policy that allows, denies, or monitors the traffic that passes through the NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy for a NAT firewall.</p>
     * 
     * @param request CreateNatFirewallControlPolicyRequest
     * @return CreateNatFirewallControlPolicyResponse
     */
    public CreateNatFirewallControlPolicyResponse createNatFirewallControlPolicy(CreateNatFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建NAT防火墙预检查</p>
     * 
     * @param request CreateNatFirewallPreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNatFirewallPreCheckResponse
     */
    public CreateNatFirewallPreCheckResponse createNatFirewallPreCheckWithOptions(CreateNatFirewallPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            body.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            body.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNatFirewallPreCheck"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNatFirewallPreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建NAT防火墙预检查</p>
     * 
     * @param request CreateNatFirewallPreCheckRequest
     * @return CreateNatFirewallPreCheckResponse
     */
    public CreateNatFirewallPreCheckResponse createNatFirewallPreCheck(CreateNatFirewallPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatFirewallPreCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建NAT防火墙资产同步任务</p>
     * 
     * @param request CreateNatFirewallSyncTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNatFirewallSyncTaskResponse
     */
    public CreateNatFirewallSyncTaskResponse createNatFirewallSyncTaskWithOptions(CreateNatFirewallSyncTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNatFirewallSyncTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNatFirewallSyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建NAT防火墙资产同步任务</p>
     * 
     * @param request CreateNatFirewallSyncTaskRequest
     * @return CreateNatFirewallSyncTaskResponse
     */
    public CreateNatFirewallSyncTaskResponse createNatFirewallSyncTask(CreateNatFirewallSyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatFirewallSyncTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建私网DNS终端节点</p>
     * 
     * @param request CreatePrivateDnsEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePrivateDnsEndpointResponse
     */
    public CreatePrivateDnsEndpointResponse createPrivateDnsEndpointWithOptions(CreatePrivateDnsEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceName)) {
            query.put("AccessInstanceName", request.accessInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryDns)) {
            query.put("PrimaryDns", request.primaryDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVSwitchId)) {
            query.put("PrimaryVSwitchId", request.primaryVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVSwitchIp)) {
            query.put("PrimaryVSwitchIp", request.primaryVSwitchIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateDnsType)) {
            query.put("PrivateDnsType", request.privateDnsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyDns)) {
            query.put("StandbyDns", request.standbyDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVSwitchId)) {
            query.put("StandbyVSwitchId", request.standbyVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVSwitchIp)) {
            query.put("StandbyVSwitchIp", request.standbyVSwitchIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePrivateDnsEndpoint"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePrivateDnsEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建私网DNS终端节点</p>
     * 
     * @param request CreatePrivateDnsEndpointRequest
     * @return CreatePrivateDnsEndpointResponse
     */
    public CreatePrivateDnsEndpointResponse createPrivateDnsEndpoint(CreatePrivateDnsEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPrivateDnsEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a NAT firewall.</p>
     * 
     * @param request CreateSecurityProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityProxyResponse
     */
    public CreateSecurityProxyResponse createSecurityProxyWithOptions(CreateSecurityProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitch)) {
            query.put("FirewallSwitch", request.firewallSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natRouteEntryList)) {
            query.put("NatRouteEntryList", request.natRouteEntryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyName)) {
            query.put("ProxyName", request.proxyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictMode)) {
            query.put("StrictMode", request.strictMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchAuto)) {
            query.put("VswitchAuto", request.vswitchAuto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchCidr)) {
            query.put("VswitchCidr", request.vswitchCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityProxy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityProxyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a NAT firewall.</p>
     * 
     * @param request CreateSecurityProxyRequest
     * @return CreateSecurityProxyResponse
     */
    public CreateSecurityProxyResponse createSecurityProxy(CreateSecurityProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityProxyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Cloud Firewall SLS Log Delivery</p>
     * 
     * @param request CreateSlsLogDispatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSlsLogDispatchResponse
     */
    public CreateSlsLogDispatchResponse createSlsLogDispatchWithOptions(CreateSlsLogDispatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            body.put("SlsRegionId", request.slsRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlsLogDispatch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlsLogDispatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Cloud Firewall SLS Log Delivery</p>
     * 
     * @param request CreateSlsLogDispatchRequest
     * @return CreateSlsLogDispatchResponse
     */
    public CreateSlsLogDispatchResponse createSlsLogDispatch(CreateSlsLogDispatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSlsLogDispatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC) firewall for a transit router.</p>
     * 
     * @param request CreateTrFirewallV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrFirewallV2Response
     */
    public CreateTrFirewallV2Response createTrFirewallV2WithOptions(CreateTrFirewallV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallDescription)) {
            query.put("FirewallDescription", request.firewallDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallName)) {
            query.put("FirewallName", request.firewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallSubnetCidr)) {
            query.put("FirewallSubnetCidr", request.firewallSubnetCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVpcCidr)) {
            query.put("FirewallVpcCidr", request.firewallVpcCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVpcId)) {
            query.put("FirewallVpcId", request.firewallVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVswitchId)) {
            query.put("FirewallVswitchId", request.firewallVswitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMode)) {
            query.put("RouteMode", request.routeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trAttachmentMasterCidr)) {
            query.put("TrAttachmentMasterCidr", request.trAttachmentMasterCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trAttachmentMasterZone)) {
            query.put("TrAttachmentMasterZone", request.trAttachmentMasterZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trAttachmentSlaveCidr)) {
            query.put("TrAttachmentSlaveCidr", request.trAttachmentSlaveCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trAttachmentSlaveZone)) {
            query.put("TrAttachmentSlaveZone", request.trAttachmentSlaveZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrFirewallV2"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrFirewallV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC) firewall for a transit router.</p>
     * 
     * @param request CreateTrFirewallV2Request
     * @return CreateTrFirewallV2Response
     */
    public CreateTrFirewallV2Response createTrFirewallV2(CreateTrFirewallV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrFirewallV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routing policy for a VPC firewall of a transit router.</p>
     * 
     * @param tmpReq CreateTrFirewallV2RoutePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTrFirewallV2RoutePolicyResponse
     */
    public CreateTrFirewallV2RoutePolicyResponse createTrFirewallV2RoutePolicyWithOptions(CreateTrFirewallV2RoutePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTrFirewallV2RoutePolicyShrinkRequest request = new CreateTrFirewallV2RoutePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destCandidateList)) {
            request.destCandidateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destCandidateList, "DestCandidateList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.srcCandidateList)) {
            request.srcCandidateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.srcCandidateList, "SrcCandidateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCandidateListShrink)) {
            query.put("DestCandidateList", request.destCandidateListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyDescription)) {
            query.put("PolicyDescription", request.policyDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCandidateListShrink)) {
            query.put("SrcCandidateList", request.srcCandidateListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrFirewallV2RoutePolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrFirewallV2RoutePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a routing policy for a VPC firewall of a transit router.</p>
     * 
     * @param request CreateTrFirewallV2RoutePolicyRequest
     * @return CreateTrFirewallV2RoutePolicyResponse
     */
    public CreateTrFirewallV2RoutePolicyResponse createTrFirewallV2RoutePolicy(CreateTrFirewallV2RoutePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrFirewallV2RoutePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallCenConfigure operation to create a VPC firewall. The VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. The VPC firewall cannot protect mutual access traffic between VBRs, between CCN instances, or between VBRs and CCN instances. For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC) firewall to protect traffic between a specified VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request CreateVpcFirewallCenConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallCenConfigureResponse
     */
    public CreateVpcFirewallCenConfigureResponse createVpcFirewallCenConfigureWithOptions(CreateVpcFirewallCenConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitch)) {
            query.put("FirewallSwitch", request.firewallSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVSwitchCidrBlock)) {
            query.put("FirewallVSwitchCidrBlock", request.firewallVSwitchCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVpcCidrBlock)) {
            query.put("FirewallVpcCidrBlock", request.firewallVpcCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVpcStandbyZoneId)) {
            query.put("FirewallVpcStandbyZoneId", request.firewallVpcStandbyZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallVpcZoneId)) {
            query.put("FirewallVpcZoneId", request.firewallVpcZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceId)) {
            query.put("NetworkInstanceId", request.networkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegion)) {
            query.put("VpcRegion", request.vpcRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallCenConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallCenConfigure operation to create a VPC firewall. The VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. The VPC firewall cannot protect mutual access traffic between VBRs, between CCN instances, or between VBRs and CCN instances. For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC) firewall to protect traffic between a specified VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request CreateVpcFirewallCenConfigureRequest
     * @return CreateVpcFirewallCenConfigureResponse
     */
    public CreateVpcFirewallCenConfigureResponse createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙手动配置</p>
     * 
     * @deprecated OpenAPI CreateVpcFirewallCenManualConfigure is deprecated
     * 
     * @param request CreateVpcFirewallCenManualConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallCenManualConfigureResponse
     */
    @Deprecated
    // Deprecated
    public CreateVpcFirewallCenManualConfigureResponse createVpcFirewallCenManualConfigureWithOptions(CreateVpcFirewallCenManualConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallCenManualConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallCenManualConfigureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙手动配置</p>
     * 
     * @deprecated OpenAPI CreateVpcFirewallCenManualConfigure is deprecated
     * 
     * @param request CreateVpcFirewallCenManualConfigureRequest
     * @return CreateVpcFirewallCenManualConfigureResponse
     */
    @Deprecated
    // Deprecated
    public CreateVpcFirewallCenManualConfigureResponse createVpcFirewallCenManualConfigure(CreateVpcFirewallCenManualConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallCenManualConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. The VPC firewall does not control the mutual access traffic between VPCs that reside in different regions or belong to different Alibaba Cloud accounts. The firewall also does not control the mutual access traffic between VPCs and virtual border routers (VBRs). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Virtual Private Cloud (VPC) firewall to protect traffic between two VPCs that are connected by using an Express Connect.</p>
     * 
     * @param request CreateVpcFirewallConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallConfigureResponse
     */
    public CreateVpcFirewallConfigureResponse createVpcFirewallConfigureWithOptions(CreateVpcFirewallConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitch)) {
            query.put("FirewallSwitch", request.firewallSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVpcCidrTableList)) {
            query.put("LocalVpcCidrTableList", request.localVpcCidrTableList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVpcId)) {
            query.put("LocalVpcId", request.localVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVpcRegion)) {
            query.put("LocalVpcRegion", request.localVpcRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcCidrTableList)) {
            query.put("PeerVpcCidrTableList", request.peerVpcCidrTableList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcId)) {
            query.put("PeerVpcId", request.peerVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcRegion)) {
            query.put("PeerVpcRegion", request.peerVpcRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. The VPC firewall does not control the mutual access traffic between VPCs that reside in different regions or belong to different Alibaba Cloud accounts. The firewall also does not control the mutual access traffic between VPCs and virtual border routers (VBRs). For more information, see <a href="https://help.aliyun.com/document_detail/172295.html">VPC firewall limits</a>.</p>
     * <h3><a href="#qps"></a>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Virtual Private Cloud (VPC) firewall to protect traffic between two VPCs that are connected by using an Express Connect.</p>
     * 
     * @param request CreateVpcFirewallConfigureRequest
     * @return CreateVpcFirewallConfigureResponse
     */
    public CreateVpcFirewallConfigureResponse createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallControlPolicy operation to create an access control policy in a specified policy group for a VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy in a specified policy group for a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request CreateVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallControlPolicyResponse
     */
    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicyWithOptions(CreateVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the CreateVpcFirewallControlPolicy operation to create an access control policy in a specified policy group for a VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access control policy in a specified policy group for a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request CreateVpcFirewallControlPolicyRequest
     * @return CreateVpcFirewallControlPolicyResponse
     */
    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙开墙前置任务</p>
     * 
     * @param request CreateVpcFirewallPrecheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallPrecheckResponse
     */
    public CreateVpcFirewallPrecheckResponse createVpcFirewallPrecheckWithOptions(CreateVpcFirewallPrecheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceType)) {
            query.put("NetworkInstanceType", request.networkInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallPrecheck"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallPrecheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙开墙前置任务</p>
     * 
     * @param request CreateVpcFirewallPrecheckRequest
     * @return CreateVpcFirewallPrecheckResponse
     */
    public CreateVpcFirewallPrecheckResponse createVpcFirewallPrecheck(CreateVpcFirewallPrecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallPrecheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙资产同步任务</p>
     * 
     * @param request CreateVpcFirewallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpcFirewallTaskResponse
     */
    public CreateVpcFirewallTaskResponse createVpcFirewallTaskWithOptions(CreateVpcFirewallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建VPC防火墙资产同步任务</p>
     * 
     * @param request CreateVpcFirewallTaskRequest
     * @return CreateVpcFirewallTaskResponse
     */
    public CreateVpcFirewallTaskResponse createVpcFirewallTask(CreateVpcFirewallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpcFirewallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ACK集群连接器</p>
     * 
     * @param request DeleteAckClusterConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAckClusterConnectorResponse
     */
    public DeleteAckClusterConnectorResponse deleteAckClusterConnectorWithOptions(DeleteAckClusterConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAckClusterConnector"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAckClusterConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ACK集群连接器</p>
     * 
     * @param request DeleteAckClusterConnectorRequest
     * @return DeleteAckClusterConnectorResponse
     */
    public DeleteAckClusterConnectorResponse deleteAckClusterConnector(DeleteAckClusterConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAckClusterConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ACL备份</p>
     * 
     * @param request DeleteAclBackupDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAclBackupDataResponse
     */
    public DeleteAclBackupDataResponse deleteAclBackupDataWithOptions(DeleteAclBackupDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backUpTime)) {
            query.put("BackUpTime", request.backUpTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAclBackupData"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAclBackupDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ACL备份</p>
     * 
     * @param request DeleteAclBackupDataRequest
     * @return DeleteAclBackupDataResponse
     */
    public DeleteAclBackupDataResponse deleteAclBackupData(DeleteAclBackupDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAclBackupDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteAddressBook operation to delete an address book for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an address book for access control.</p>
     * 
     * @param request DeleteAddressBookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAddressBookResponse
     */
    public DeleteAddressBookResponse deleteAddressBookWithOptions(DeleteAddressBookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupUuid)) {
            query.put("GroupUuid", request.groupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAddressBookResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteAddressBook operation to delete an address book for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an address book for access control.</p>
     * 
     * @param request DeleteAddressBookRequest
     * @return DeleteAddressBookResponse
     */
    public DeleteAddressBookResponse deleteAddressBook(DeleteAddressBookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAddressBookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteControlPolicy operation to delete an access control policy that applies to inbound or outbound traffic.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy.</p>
     * 
     * @param request DeleteControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteControlPolicyResponse
     */
    public DeleteControlPolicyResponse deleteControlPolicyWithOptions(DeleteControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteControlPolicy operation to delete an access control policy that applies to inbound or outbound traffic.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy.</p>
     * 
     * @param request DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    public DeleteControlPolicyResponse deleteControlPolicy(DeleteControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control policy template.</p>
     * 
     * @param request DeleteControlPolicyTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteControlPolicyTemplateResponse
     */
    public DeleteControlPolicyTemplateResponse deleteControlPolicyTemplateWithOptions(DeleteControlPolicyTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteControlPolicyTemplate"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteControlPolicyTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access control policy template.</p>
     * 
     * @param request DeleteControlPolicyTemplateRequest
     * @return DeleteControlPolicyTemplateResponse
     */
    public DeleteControlPolicyTemplateResponse deleteControlPolicyTemplate(DeleteControlPolicyTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteControlPolicyTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNS防火墙规则</p>
     * 
     * @param request DeleteDnsFirewallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDnsFirewallPolicyResponse
     */
    public DeleteDnsFirewallPolicyResponse deleteDnsFirewallPolicyWithOptions(DeleteDnsFirewallPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDnsFirewallPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDnsFirewallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DNS防火墙规则</p>
     * 
     * @param request DeleteDnsFirewallPolicyRequest
     * @return DeleteDnsFirewallPolicyResponse
     */
    public DeleteDnsFirewallPolicyResponse deleteDnsFirewallPolicy(DeleteDnsFirewallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDnsFirewallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete file download tasks and delete the files.
     * **
     * <strong>Warning</strong> Both tasks and involved files are deleted. You can no longer download the involved files by using the download links. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes file download tasks.</p>
     * 
     * @param request DeleteDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDownloadTaskResponse
     */
    public DeleteDownloadTaskResponse deleteDownloadTaskWithOptions(DeleteDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDownloadTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDownloadTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete file download tasks and delete the files.
     * **
     * <strong>Warning</strong> Both tasks and involved files are deleted. You can no longer download the involved files by using the download links. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes file download tasks.</p>
     * 
     * @param request DeleteDownloadTaskRequest
     * @return DeleteDownloadTaskResponse
     */
    public DeleteDownloadTaskResponse deleteDownloadTask(DeleteDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes routing policies for a virtual private cloud (VPC) firewall of a transit router.</p>
     * 
     * @param request DeleteFirewallV2RoutePoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFirewallV2RoutePoliciesResponse
     */
    public DeleteFirewallV2RoutePoliciesResponse deleteFirewallV2RoutePoliciesWithOptions(DeleteFirewallV2RoutePoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicyId)) {
            query.put("TrFirewallRoutePolicyId", request.trFirewallRoutePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFirewallV2RoutePolicies"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFirewallV2RoutePoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes routing policies for a virtual private cloud (VPC) firewall of a transit router.</p>
     * 
     * @param request DeleteFirewallV2RoutePoliciesRequest
     * @return DeleteFirewallV2RoutePoliciesResponse
     */
    public DeleteFirewallV2RoutePoliciesResponse deleteFirewallV2RoutePolicies(DeleteFirewallV2RoutePoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFirewallV2RoutePoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove up to 20 members from Cloud Firewall at a time. Separate multiple members with commas (,). After a member is removed, Cloud Firewall can no longer access the cloud resources of the member. Proceed with caution. Before you call this operation, call the <a href="https://help.aliyun.com/document_detail/271704.html">DescribeInstanceMembers</a> operation to obtain the information about the members that are added to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes members from Cloud Firewall.</p>
     * 
     * @param request DeleteInstanceMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceMembersResponse
     */
    public DeleteInstanceMembersResponse deleteInstanceMembersWithOptions(DeleteInstanceMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberUids)) {
            query.put("MemberUids", request.memberUids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove up to 20 members from Cloud Firewall at a time. Separate multiple members with commas (,). After a member is removed, Cloud Firewall can no longer access the cloud resources of the member. Proceed with caution. Before you call this operation, call the <a href="https://help.aliyun.com/document_detail/271704.html">DescribeInstanceMembers</a> operation to obtain the information about the members that are added to Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes members from Cloud Firewall.</p>
     * 
     * @param request DeleteInstanceMembersRequest
     * @return DeleteInstanceMembersResponse
     */
    public DeleteInstanceMembersResponse deleteInstanceMembers(DeleteInstanceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建IPS私网关联信息</p>
     * 
     * @param request DeleteIpsPrivateAssocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIpsPrivateAssocResponse
     */
    public DeleteIpsPrivateAssocResponse deleteIpsPrivateAssocWithOptions(DeleteIpsPrivateAssocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIpsPrivateAssoc"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIpsPrivateAssocResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建IPS私网关联信息</p>
     * 
     * @param request DeleteIpsPrivateAssocRequest
     * @return DeleteIpsPrivateAssocResponse
     */
    public DeleteIpsPrivateAssocResponse deleteIpsPrivateAssoc(DeleteIpsPrivateAssocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIpsPrivateAssocWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to delete an outbound access control policy that is created for a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request DeleteNatFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNatFirewallControlPolicyResponse
     */
    public DeleteNatFirewallControlPolicyResponse deleteNatFirewallControlPolicyWithOptions(DeleteNatFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNatFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNatFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to delete an outbound access control policy that is created for a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request DeleteNatFirewallControlPolicyRequest
     * @return DeleteNatFirewallControlPolicyResponse
     */
    public DeleteNatFirewallControlPolicyResponse deleteNatFirewallControlPolicy(DeleteNatFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes access control policies that are created for a NAT firewall at a time.</p>
     * 
     * @param request DeleteNatFirewallControlPolicyBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNatFirewallControlPolicyBatchResponse
     */
    public DeleteNatFirewallControlPolicyBatchResponse deleteNatFirewallControlPolicyBatchWithOptions(DeleteNatFirewallControlPolicyBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuidList)) {
            query.put("AclUuidList", request.aclUuidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNatFirewallControlPolicyBatch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNatFirewallControlPolicyBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes access control policies that are created for a NAT firewall at a time.</p>
     * 
     * @param request DeleteNatFirewallControlPolicyBatchRequest
     * @return DeleteNatFirewallControlPolicyBatchResponse
     */
    public DeleteNatFirewallControlPolicyBatchResponse deleteNatFirewallControlPolicyBatch(DeleteNatFirewallControlPolicyBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatFirewallControlPolicyBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清空私网DNS域名</p>
     * 
     * @param request DeletePrivateDnsAllDomainNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateDnsAllDomainNameResponse
     */
    public DeletePrivateDnsAllDomainNameResponse deletePrivateDnsAllDomainNameWithOptions(DeletePrivateDnsAllDomainNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceId)) {
            query.put("AccessInstanceId", request.accessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateDnsAllDomainName"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateDnsAllDomainNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清空私网DNS域名</p>
     * 
     * @param request DeletePrivateDnsAllDomainNameRequest
     * @return DeletePrivateDnsAllDomainNameResponse
     */
    public DeletePrivateDnsAllDomainNameResponse deletePrivateDnsAllDomainName(DeletePrivateDnsAllDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateDnsAllDomainNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除私网DNS域名</p>
     * 
     * @param request DeletePrivateDnsDomainNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateDnsDomainNameResponse
     */
    public DeletePrivateDnsDomainNameResponse deletePrivateDnsDomainNameWithOptions(DeletePrivateDnsDomainNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceId)) {
            query.put("AccessInstanceId", request.accessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameList)) {
            query.put("DomainNameList", request.domainNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateDnsDomainName"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateDnsDomainNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除私网DNS域名</p>
     * 
     * @param request DeletePrivateDnsDomainNameRequest
     * @return DeletePrivateDnsDomainNameResponse
     */
    public DeletePrivateDnsDomainNameResponse deletePrivateDnsDomainName(DeletePrivateDnsDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateDnsDomainNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除私网DNS终端节点</p>
     * 
     * @param request DeletePrivateDnsEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivateDnsEndpointResponse
     */
    public DeletePrivateDnsEndpointResponse deletePrivateDnsEndpointWithOptions(DeletePrivateDnsEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceId)) {
            query.put("AccessInstanceId", request.accessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivateDnsEndpoint"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivateDnsEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除私网DNS终端节点</p>
     * 
     * @param request DeletePrivateDnsEndpointRequest
     * @return DeletePrivateDnsEndpointResponse
     */
    public DeletePrivateDnsEndpointResponse deletePrivateDnsEndpoint(DeletePrivateDnsEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivateDnsEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a NAT firewall.</p>
     * 
     * @param request DeleteSecurityProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityProxyResponse
     */
    public DeleteSecurityProxyResponse deleteSecurityProxyWithOptions(DeleteSecurityProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityProxy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityProxyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a NAT firewall.</p>
     * 
     * @param request DeleteSecurityProxyRequest
     * @return DeleteSecurityProxyResponse
     */
    public DeleteSecurityProxyResponse deleteSecurityProxy(DeleteSecurityProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityProxyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request DeleteTrFirewallV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTrFirewallV2Response
     */
    public DeleteTrFirewallV2Response deleteTrFirewallV2WithOptions(DeleteTrFirewallV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrFirewallV2"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrFirewallV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request DeleteTrFirewallV2Request
     * @return DeleteTrFirewallV2Response
     */
    public DeleteTrFirewallV2Response deleteTrFirewallV2(DeleteTrFirewallV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTrFirewallV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallCenConfigure operation to delete a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteVpcFirewallCenConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcFirewallCenConfigureResponse
     */
    public DeleteVpcFirewallCenConfigureResponse deleteVpcFirewallCenConfigureWithOptions(DeleteVpcFirewallCenConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallIdList)) {
            query.put("VpcFirewallIdList", request.vpcFirewallIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallCenConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallCenConfigure operation to delete a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DeleteVpcFirewallCenConfigureRequest
     * @return DeleteVpcFirewallCenConfigureResponse
     */
    public DeleteVpcFirewallCenConfigureResponse deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallConfigure operation to delete a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall that controls traffic between two VPCs. The VPCs are connected by using an Express Connect circuit.</p>
     * 
     * @param request DeleteVpcFirewallConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcFirewallConfigureResponse
     */
    public DeleteVpcFirewallConfigureResponse deleteVpcFirewallConfigureWithOptions(DeleteVpcFirewallConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallIdList)) {
            query.put("VpcFirewallIdList", request.vpcFirewallIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallConfigure operation to delete a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC) firewall that controls traffic between two VPCs. The VPCs are connected by using an Express Connect circuit.</p>
     * 
     * @param request DeleteVpcFirewallConfigureRequest
     * @return DeleteVpcFirewallConfigureResponse
     */
    public DeleteVpcFirewallConfigureResponse deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcFirewallConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallControlPolicy operation to delete an access control policy from a specific policy group for a VPC firewall. Different access control policies are used for the VPC firewall that is used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewall that is used to protect each Express Connect circuit. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy from a specific policy group for a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DeleteVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpcFirewallControlPolicyResponse
     */
    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicyWithOptions(DeleteVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DeleteVpcFirewallControlPolicy operation to delete an access control policy from a specific policy group for a VPC firewall. Different access control policies are used for the VPC firewall that is used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewall that is used to protect each Express Connect circuit. </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access control policy from a specific policy group for a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DeleteVpcFirewallControlPolicyRequest
     * @return DeleteVpcFirewallControlPolicyResponse
     */
    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on the requests that are blocked by the access control list (ACL) feature.</p>
     * 
     * @param request DescribeACLProtectTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeACLProtectTrendResponse
     */
    public DescribeACLProtectTrendResponse describeACLProtectTrendWithOptions(DescribeACLProtectTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeACLProtectTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeACLProtectTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics on the requests that are blocked by the access control list (ACL) feature.</p>
     * 
     * @param request DescribeACLProtectTrendRequest
     * @return DescribeACLProtectTrendResponse
     */
    public DescribeACLProtectTrendResponse describeACLProtectTrend(DescribeACLProtectTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeACLProtectTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询AI流量分析开启状态</p>
     * 
     * @param request DescribeAITrafficAnalysisStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAITrafficAnalysisStatusResponse
     */
    public DescribeAITrafficAnalysisStatusResponse describeAITrafficAnalysisStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAITrafficAnalysisStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAITrafficAnalysisStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询AI流量分析开启状态</p>
     * @return DescribeAITrafficAnalysisStatusResponse
     */
    public DescribeAITrafficAnalysisStatusResponse describeAITrafficAnalysisStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAITrafficAnalysisStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例地域列表</p>
     * 
     * @param request DescribeAccessInstanceRegionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessInstanceRegionListResponse
     */
    public DescribeAccessInstanceRegionListResponse describeAccessInstanceRegionListWithOptions(DescribeAccessInstanceRegionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessInstanceRegionList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessInstanceRegionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例地域列表</p>
     * 
     * @param request DescribeAccessInstanceRegionListRequest
     * @return DescribeAccessInstanceRegionListResponse
     */
    public DescribeAccessInstanceRegionListResponse describeAccessInstanceRegionList(DescribeAccessInstanceRegionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessInstanceRegionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例任务</p>
     * 
     * @param request DescribeAccessInstanceTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessInstanceTaskResponse
     */
    public DescribeAccessInstanceTaskResponse describeAccessInstanceTaskWithOptions(DescribeAccessInstanceTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessInstanceTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessInstanceTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例任务</p>
     * 
     * @param request DescribeAccessInstanceTaskRequest
     * @return DescribeAccessInstanceTaskResponse
     */
    public DescribeAccessInstanceTaskResponse describeAccessInstanceTask(DescribeAccessInstanceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessInstanceTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例的交换机列表</p>
     * 
     * @param request DescribeAccessInstanceVSwitchListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessInstanceVSwitchListResponse
     */
    public DescribeAccessInstanceVSwitchListResponse describeAccessInstanceVSwitchListWithOptions(DescribeAccessInstanceVSwitchListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessInstanceVSwitchList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessInstanceVSwitchListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例的交换机列表</p>
     * 
     * @param request DescribeAccessInstanceVSwitchListRequest
     * @return DescribeAccessInstanceVSwitchListResponse
     */
    public DescribeAccessInstanceVSwitchListResponse describeAccessInstanceVSwitchList(DescribeAccessInstanceVSwitchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessInstanceVSwitchListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例VPC列表</p>
     * 
     * @param request DescribeAccessInstanceVpcListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessInstanceVpcListResponse
     */
    public DescribeAccessInstanceVpcListResponse describeAccessInstanceVpcListWithOptions(DescribeAccessInstanceVpcListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessInstanceVpcList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessInstanceVpcListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例VPC列表</p>
     * 
     * @param request DescribeAccessInstanceVpcListRequest
     * @return DescribeAccessInstanceVpcListResponse
     */
    public DescribeAccessInstanceVpcListResponse describeAccessInstanceVpcList(DescribeAccessInstanceVpcListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessInstanceVpcListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例支持的可用区列表</p>
     * 
     * @param request DescribeAccessInstanceZoneListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccessInstanceZoneListResponse
     */
    public DescribeAccessInstanceZoneListResponse describeAccessInstanceZoneListWithOptions(DescribeAccessInstanceZoneListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccessInstanceZoneList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccessInstanceZoneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询接入实例支持的可用区列表</p>
     * 
     * @param request DescribeAccessInstanceZoneListRequest
     * @return DescribeAccessInstanceZoneListResponse
     */
    public DescribeAccessInstanceZoneListResponse describeAccessInstanceZoneList(DescribeAccessInstanceZoneListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccessInstanceZoneListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定ACK集群连接器</p>
     * 
     * @param request DescribeAckClusterConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAckClusterConnectorResponse
     */
    public DescribeAckClusterConnectorResponse describeAckClusterConnectorWithOptions(DescribeAckClusterConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckClusterConnector"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckClusterConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定ACK集群连接器</p>
     * 
     * @param request DescribeAckClusterConnectorRequest
     * @return DescribeAckClusterConnectorResponse
     */
    public DescribeAckClusterConnectorResponse describeAckClusterConnector(DescribeAckClusterConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAckClusterConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询ACK集群连接器列表</p>
     * 
     * @param request DescribeAckClusterConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAckClusterConnectorsResponse
     */
    public DescribeAckClusterConnectorsResponse describeAckClusterConnectorsWithOptions(DescribeAckClusterConnectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            query.put("ConnectorName", request.connectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckClusterConnectors"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckClusterConnectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询ACK集群连接器列表</p>
     * 
     * @param request DescribeAckClusterConnectorsRequest
     * @return DescribeAckClusterConnectorsResponse
     */
    public DescribeAckClusterConnectorsResponse describeAckClusterConnectors(DescribeAckClusterConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAckClusterConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群命名空间</p>
     * 
     * @param request DescribeAckClusterNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAckClusterNamespacesResponse
     */
    public DescribeAckClusterNamespacesResponse describeAckClusterNamespacesWithOptions(DescribeAckClusterNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckClusterNamespaces"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckClusterNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群命名空间</p>
     * 
     * @param request DescribeAckClusterNamespacesRequest
     * @return DescribeAckClusterNamespacesResponse
     */
    public DescribeAckClusterNamespacesResponse describeAckClusterNamespaces(DescribeAckClusterNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAckClusterNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群标签</p>
     * 
     * @param request DescribeAckClusterPodLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAckClusterPodLabelsResponse
     */
    public DescribeAckClusterPodLabelsResponse describeAckClusterPodLabelsWithOptions(DescribeAckClusterPodLabelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckClusterPodLabels"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckClusterPodLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群标签</p>
     * 
     * @param request DescribeAckClusterPodLabelsRequest
     * @return DescribeAckClusterPodLabelsResponse
     */
    public DescribeAckClusterPodLabelsResponse describeAckClusterPodLabels(DescribeAckClusterPodLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAckClusterPodLabelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群，查询符合条件的ACK集群（例如指定集群类型、集群规格）列表信息</p>
     * 
     * @param request DescribeAckClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAckClustersResponse
     */
    public DescribeAckClustersResponse describeAckClustersWithOptions(DescribeAckClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            query.put("ClusterSpec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorStatus)) {
            query.put("ConnectorStatus", request.connectorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAckClusters"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAckClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云K8S容器服务（ACK）集群，查询符合条件的ACK集群（例如指定集群类型、集群规格）列表信息</p>
     * 
     * @param request DescribeAckClustersRequest
     * @return DescribeAckClustersResponse
     */
    public DescribeAckClustersResponse describeAckClusters(DescribeAckClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAckClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询访问控制应用</p>
     * 
     * @param request DescribeAclAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclAppsResponse
     */
    public DescribeAclAppsResponse describeAclAppsWithOptions(DescribeAclAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclApps"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询访问控制应用</p>
     * 
     * @param request DescribeAclAppsRequest
     * @return DescribeAclAppsResponse
     */
    public DescribeAclAppsResponse describeAclApps(DescribeAclAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ACL备份列表</p>
     * 
     * @param request DescribeAclBackupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclBackupListResponse
     */
    public DescribeAclBackupListResponse describeAclBackupListWithOptions(DescribeAclBackupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclBackupList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclBackupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ACL备份列表</p>
     * 
     * @param request DescribeAclBackupListRequest
     * @return DescribeAclBackupListResponse
     */
    public DescribeAclBackupListResponse describeAclBackupList(DescribeAclBackupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclBackupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询ACL检查详情</p>
     * 
     * @param request DescribeAclCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclCheckResponse
     */
    public DescribeAclCheckResponse describeAclCheckWithOptions(DescribeAclCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclCheck"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询ACL检查详情</p>
     * 
     * @param request DescribeAclCheckRequest
     * @return DescribeAclCheckResponse
     */
    public DescribeAclCheckResponse describeAclCheck(DescribeAclCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙预检查结果</p>
     * 
     * @param request DescribeAclCheckQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclCheckQuotaResponse
     */
    public DescribeAclCheckQuotaResponse describeAclCheckQuotaWithOptions(DescribeAclCheckQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclCheckQuota"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclCheckQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙预检查结果</p>
     * 
     * @param request DescribeAclCheckQuotaRequest
     * @return DescribeAclCheckQuotaResponse
     */
    public DescribeAclCheckQuotaResponse describeAclCheckQuota(DescribeAclCheckQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclCheckQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询ACL检查条目</p>
     * 
     * @param request DescribeAclChecksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclChecksResponse
     */
    public DescribeAclChecksResponse describeAclChecksWithOptions(DescribeAclChecksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclChecks"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclChecksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询ACL检查条目</p>
     * 
     * @param request DescribeAclChecksRequest
     * @return DescribeAclChecksResponse
     */
    public DescribeAclChecksResponse describeAclChecks(DescribeAclChecksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclChecksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取总ACL配置数</p>
     * 
     * @param request DescribeAclRuleCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclRuleCountResponse
     */
    public DescribeAclRuleCountResponse describeAclRuleCountWithOptions(DescribeAclRuleCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclRuleCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclRuleCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取总ACL配置数</p>
     * 
     * @param request DescribeAclRuleCountRequest
     * @return DescribeAclRuleCountResponse
     */
    public DescribeAclRuleCountResponse describeAclRuleCount(DescribeAclRuleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclRuleCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ACL白名单</p>
     * 
     * @param request DescribeAclWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAclWhitelistResponse
     */
    public DescribeAclWhitelistResponse describeAclWhitelistWithOptions(DescribeAclWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAclWhitelist"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAclWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ACL白名单</p>
     * 
     * @param request DescribeAclWhitelistRequest
     * @return DescribeAclWhitelistResponse
     */
    public DescribeAclWhitelistResponse describeAclWhitelist(DescribeAclWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAclWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details about an address book for an access control policy.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about an address book for an access control policy.</p>
     * 
     * @param request DescribeAddressBookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddressBookResponse
     */
    public DescribeAddressBookResponse describeAddressBookWithOptions(DescribeAddressBookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containPort)) {
            query.put("ContainPort", request.containPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddressBookResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details about an address book for an access control policy.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about an address book for an access control policy.</p>
     * 
     * @param request DescribeAddressBookRequest
     * @return DescribeAddressBookResponse
     */
    public DescribeAddressBookResponse describeAddressBook(DescribeAddressBookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddressBookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeAssetList operation to query the assets that are protected by Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the assets that are protected by Cloud Firewall.</p>
     * 
     * @param request DescribeAssetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetListResponse
     */
    public DescribeAssetListResponse describeAssetListWithOptions(DescribeAssetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceTag)) {
            query.put("NewResourceTag", request.newResourceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outStatistic)) {
            query.put("OutStatistic", request.outStatistic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchItem)) {
            query.put("SearchItem", request.searchItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveStatus)) {
            query.put("SensitiveStatus", request.sensitiveStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sgStatus)) {
            query.put("SgStatus", request.sgStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeAssetList operation to query the assets that are protected by Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the assets that are protected by Cloud Firewall.</p>
     * 
     * @param request DescribeAssetListRequest
     * @return DescribeAssetListResponse
     */
    public DescribeAssetListResponse describeAssetList(DescribeAssetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk levels of assets.</p>
     * 
     * @param request DescribeAssetRiskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetRiskListResponse
     */
    public DescribeAssetRiskListResponse describeAssetRiskListWithOptions(DescribeAssetRiskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipAddrList)) {
            query.put("IpAddrList", request.ipAddrList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetRiskList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetRiskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk levels of assets.</p>
     * 
     * @param request DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     */
    public DescribeAssetRiskListResponse describeAssetRiskList(DescribeAssetRiskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetRiskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the assets that are protected by Cloud Firewall.</p>
     * 
     * @param request DescribeAssetStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetStatisticResponse
     */
    public DescribeAssetStatisticResponse describeAssetStatisticWithOptions(DescribeAssetStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the assets that are protected by Cloud Firewall.</p>
     * 
     * @param request DescribeAssetStatisticRequest
     * @return DescribeAssetStatisticResponse
     */
    public DescribeAssetStatisticResponse describeAssetStatistic(DescribeAssetStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取敏感数据类别开关</p>
     * 
     * @param request DescribeAttackAppCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAttackAppCategoryResponse
     */
    public DescribeAttackAppCategoryResponse describeAttackAppCategoryWithOptions(DescribeAttackAppCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAttackAppCategory"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAttackAppCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取敏感数据类别开关</p>
     * 
     * @param request DescribeAttackAppCategoryRequest
     * @return DescribeAttackAppCategoryResponse
     */
    public DescribeAttackAppCategoryResponse describeAttackAppCategory(DescribeAttackAppCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAttackAppCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志分发状态</p>
     * 
     * @param request DescribeBatchSlsDispatchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBatchSlsDispatchStatusResponse
     */
    public DescribeBatchSlsDispatchStatusResponse describeBatchSlsDispatchStatusWithOptions(DescribeBatchSlsDispatchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBatchSlsDispatchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBatchSlsDispatchStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取日志分发状态</p>
     * 
     * @param request DescribeBatchSlsDispatchStatusRequest
     * @return DescribeBatchSlsDispatchStatusResponse
     */
    public DescribeBatchSlsDispatchStatusResponse describeBatchSlsDispatchStatus(DescribeBatchSlsDispatchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBatchSlsDispatchStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the firewall risk level.</p>
     * 
     * @deprecated OpenAPI DescribeCfwRiskLevelSummary is deprecated
     * 
     * @param request DescribeCfwRiskLevelSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCfwRiskLevelSummaryResponse
     */
    @Deprecated
    // Deprecated
    public DescribeCfwRiskLevelSummaryResponse describeCfwRiskLevelSummaryWithOptions(DescribeCfwRiskLevelSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCfwRiskLevelSummary"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCfwRiskLevelSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the firewall risk level.</p>
     * 
     * @deprecated OpenAPI DescribeCfwRiskLevelSummary is deprecated
     * 
     * @param request DescribeCfwRiskLevelSummaryRequest
     * @return DescribeCfwRiskLevelSummaryResponse
     */
    @Deprecated
    // Deprecated
    public DescribeCfwRiskLevelSummaryResponse describeCfwRiskLevelSummary(DescribeCfwRiskLevelSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCfwRiskLevelSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取清空授权信息</p>
     * 
     * @param request DescribeClearAuthInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClearAuthInfoResponse
     */
    public DescribeClearAuthInfoResponse describeClearAuthInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClearAuthInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClearAuthInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取清空授权信息</p>
     * @return DescribeClearAuthInfoResponse
     */
    public DescribeClearAuthInfoResponse describeClearAuthInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClearAuthInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已配置的目的IP</p>
     * 
     * @param request DescribeConfiguredDestinationIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfiguredDestinationIPResponse
     */
    public DescribeConfiguredDestinationIPResponse describeConfiguredDestinationIPWithOptions(DescribeConfiguredDestinationIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIP)) {
            query.put("DestinationIP", request.destinationIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationISP)) {
            query.put("DestinationISP", request.destinationISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegion)) {
            query.put("DestinationRegion", request.destinationRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfiguredDestinationIP"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfiguredDestinationIPResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取已配置的目的IP</p>
     * 
     * @param request DescribeConfiguredDestinationIPRequest
     * @return DescribeConfiguredDestinationIPResponse
     */
    public DescribeConfiguredDestinationIPResponse describeConfiguredDestinationIP(DescribeConfiguredDestinationIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfiguredDestinationIPWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已配置的域名</p>
     * 
     * @param request DescribeConfiguredDomainNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfiguredDomainNamesResponse
     */
    public DescribeConfiguredDomainNamesResponse describeConfiguredDomainNamesWithOptions(DescribeConfiguredDomainNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfiguredDomainNames"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfiguredDomainNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取已配置的域名</p>
     * 
     * @param request DescribeConfiguredDomainNamesRequest
     * @return DescribeConfiguredDomainNamesResponse
     */
    public DescribeConfiguredDomainNamesResponse describeConfiguredDomainNames(DescribeConfiguredDomainNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfiguredDomainNamesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeControlPolicy operation to query the details about access control policies by page.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all access control policies.</p>
     * 
     * @param request DescribeControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeControlPolicyResponse
     */
    public DescribeControlPolicyResponse describeControlPolicyWithOptions(DescribeControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeControlPolicy operation to query the details about access control policies by page.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about all access control policies.</p>
     * 
     * @param request DescribeControlPolicyRequest
     * @return DescribeControlPolicyResponse
     */
    public DescribeControlPolicyResponse describeControlPolicy(DescribeControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询访问控制策略的域名解析结果</p>
     * 
     * @param request DescribeControlPolicyDomainResolveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeControlPolicyDomainResolveResponse
     */
    public DescribeControlPolicyDomainResolveResponse describeControlPolicyDomainResolveWithOptions(DescribeControlPolicyDomainResolveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeControlPolicyDomainResolve"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeControlPolicyDomainResolveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询访问控制策略的域名解析结果</p>
     * 
     * @param request DescribeControlPolicyDomainResolveRequest
     * @return DescribeControlPolicyDomainResolveResponse
     */
    public DescribeControlPolicyDomainResolveResponse describeControlPolicyDomainResolve(DescribeControlPolicyDomainResolveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeControlPolicyDomainResolveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取已经创建的 NAT 防火墙</p>
     * 
     * @param request DescribeCreatedNatFirewallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCreatedNatFirewallResponse
     */
    public DescribeCreatedNatFirewallResponse describeCreatedNatFirewallWithOptions(DescribeCreatedNatFirewallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCreatedNatFirewall"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCreatedNatFirewallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取已经创建的 NAT 防火墙</p>
     * 
     * @param request DescribeCreatedNatFirewallRequest
     * @return DescribeCreatedNatFirewallResponse
     */
    public DescribeCreatedNatFirewallResponse describeCreatedNatFirewall(DescribeCreatedNatFirewallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreatedNatFirewallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取成员账号列表</p>
     * 
     * @param request DescribeCtrlInstanceMemberAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCtrlInstanceMemberAccountsResponse
     */
    public DescribeCtrlInstanceMemberAccountsResponse describeCtrlInstanceMemberAccountsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCtrlInstanceMemberAccounts"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCtrlInstanceMemberAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取成员账号列表</p>
     * @return DescribeCtrlInstanceMemberAccountsResponse
     */
    public DescribeCtrlInstanceMemberAccountsResponse describeCtrlInstanceMemberAccounts() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCtrlInstanceMemberAccountsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default intrusion prevention system (IPS) configurations.</p>
     * 
     * @param request DescribeDefaultIPSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDefaultIPSConfigResponse
     */
    public DescribeDefaultIPSConfigResponse describeDefaultIPSConfigWithOptions(DescribeDefaultIPSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDefaultIPSConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default intrusion prevention system (IPS) configurations.</p>
     * 
     * @param request DescribeDefaultIPSConfigRequest
     * @return DescribeDefaultIPSConfigResponse
     */
    public DescribeDefaultIPSConfigResponse describeDefaultIPSConfig(DescribeDefaultIPSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDefaultIPSConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取DNS防火墙ACL列表</p>
     * 
     * @param request DescribeDnsFirewallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsFirewallPolicyResponse
     */
    public DescribeDnsFirewallPolicyResponse describeDnsFirewallPolicyWithOptions(DescribeDnsFirewallPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsFirewallPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsFirewallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取DNS防火墙ACL列表</p>
     * 
     * @param request DescribeDnsFirewallPolicyRequest
     * @return DescribeDnsFirewallPolicyResponse
     */
    public DescribeDnsFirewallPolicyResponse describeDnsFirewallPolicy(DescribeDnsFirewallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsFirewallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the DNS record of a domain name. This operation can retrieve DNS records only from Alibaba Cloud DNS. Before you can call this operation, make sure that your domain name is hosted on Alibaba Cloud DNS.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Domain Name System (DNS) records.</p>
     * 
     * @deprecated OpenAPI DescribeDomainResolve is deprecated
     * 
     * @param request DescribeDomainResolveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainResolveResponse
     */
    @Deprecated
    // Deprecated
    public DescribeDomainResolveResponse describeDomainResolveWithOptions(DescribeDomainResolveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainResolve"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResolveResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the DNS record of a domain name. This operation can retrieve DNS records only from Alibaba Cloud DNS. Before you can call this operation, make sure that your domain name is hosted on Alibaba Cloud DNS.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Domain Name System (DNS) records.</p>
     * 
     * @deprecated OpenAPI DescribeDomainResolve is deprecated
     * 
     * @param request DescribeDomainResolveRequest
     * @return DescribeDomainResolveResponse
     */
    @Deprecated
    // Deprecated
    public DescribeDomainResolveResponse describeDomainResolve(DescribeDomainResolveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainResolveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file download tasks, including the task information and download URLs.</p>
     * 
     * @param request DescribeDownloadTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTaskWithOptions(DescribeDownloadTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file download tasks, including the task information and download URLs.</p>
     * 
     * @param request DescribeDownloadTaskRequest
     * @return DescribeDownloadTaskResponse
     */
    public DescribeDownloadTaskResponse describeDownloadTask(DescribeDownloadTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of download tasks. The type corresponds to the TaskType fields in the download task-related operations.</p>
     * 
     * @param request DescribeDownloadTaskTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadTaskTypeResponse
     */
    public DescribeDownloadTaskTypeResponse describeDownloadTaskTypeWithOptions(DescribeDownloadTaskTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadTaskType"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadTaskTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of download tasks. The type corresponds to the TaskType fields in the download task-related operations.</p>
     * 
     * @param request DescribeDownloadTaskTypeRequest
     * @return DescribeDownloadTaskTypeResponse
     */
    public DescribeDownloadTaskTypeResponse describeDownloadTaskType(DescribeDownloadTaskTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadTaskTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙DROP数据统计</p>
     * 
     * @deprecated OpenAPI DescribeFirewallDropStatistics is deprecated
     * 
     * @param request DescribeFirewallDropStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallDropStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFirewallDropStatisticsResponse describeFirewallDropStatisticsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallDropStatistics"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallDropStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙DROP数据统计</p>
     * 
     * @deprecated OpenAPI DescribeFirewallDropStatistics is deprecated
     * @return DescribeFirewallDropStatisticsResponse
     */
    @Deprecated
    // Deprecated
    public DescribeFirewallDropStatisticsResponse describeFirewallDropStatistics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallDropStatisticsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙任务</p>
     * 
     * @param request DescribeFirewallTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallTaskResponse
     */
    public DescribeFirewallTaskResponse describeFirewallTaskWithOptions(DescribeFirewallTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childInstanceId)) {
            query.put("ChildInstanceId", request.childInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallTask"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙任务</p>
     * 
     * @param request DescribeFirewallTaskRequest
     * @return DescribeFirewallTaskResponse
     */
    public DescribeFirewallTaskResponse describeFirewallTask(DescribeFirewallTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙创建的交换机</p>
     * 
     * @param request DescribeFirewallVSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallVSwitchResponse
     */
    public DescribeFirewallVSwitchResponse describeFirewallVSwitchWithOptions(DescribeFirewallVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            query.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallVSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallVSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙创建的交换机</p>
     * 
     * @param request DescribeFirewallVSwitchRequest
     * @return DescribeFirewallVSwitchResponse
     */
    public DescribeFirewallVSwitchResponse describeFirewallVSwitch(DescribeFirewallVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallVSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙交换机资源</p>
     * 
     * @param request DescribeFirewallVswitchResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFirewallVswitchResourcesResponse
     */
    public DescribeFirewallVswitchResourcesResponse describeFirewallVswitchResourcesWithOptions(DescribeFirewallVswitchResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFirewallVswitchResources"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFirewallVswitchResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙交换机资源</p>
     * 
     * @param request DescribeFirewallVswitchResourcesRequest
     * @return DescribeFirewallVswitchResourcesResponse
     */
    public DescribeFirewallVswitchResourcesResponse describeFirewallVswitchResources(DescribeFirewallVswitchResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirewallVswitchResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about members in Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about members in Cloud Firewall.</p>
     * 
     * @param request DescribeInstanceMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceMembersResponse
     */
    public DescribeInstanceMembersResponse describeInstanceMembersWithOptions(DescribeInstanceMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberDesc)) {
            query.put("MemberDesc", request.memberDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberDisplayName)) {
            query.put("MemberDisplayName", request.memberDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about members in Cloud Firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about members in Cloud Firewall.</p>
     * 
     * @param request DescribeInstanceMembersRequest
     * @return DescribeInstanceMembersResponse
     */
    public DescribeInstanceMembersResponse describeInstanceMembers(DescribeInstanceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例RD账号</p>
     * 
     * @param request DescribeInstanceRdAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceRdAccountsResponse
     */
    public DescribeInstanceRdAccountsResponse describeInstanceRdAccountsWithOptions(DescribeInstanceRdAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberDesc)) {
            query.put("MemberDesc", request.memberDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberDisplayName)) {
            query.put("MemberDisplayName", request.memberDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceRdAccounts"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceRdAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例RD账号</p>
     * 
     * @param request DescribeInstanceRdAccountsRequest
     * @return DescribeInstanceRdAccountsResponse
     */
    public DescribeInstanceRdAccountsResponse describeInstanceRdAccounts(DescribeInstanceRdAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceRdAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk levels of instances.</p>
     * 
     * @param request DescribeInstanceRiskLevelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceRiskLevelsResponse
     */
    public DescribeInstanceRiskLevelsResponse describeInstanceRiskLevelsWithOptions(DescribeInstanceRiskLevelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceRiskLevels"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceRiskLevelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the risk levels of instances.</p>
     * 
     * @param request DescribeInstanceRiskLevelsRequest
     * @return DescribeInstanceRiskLevelsResponse
     */
    public DescribeInstanceRiskLevelsResponse describeInstanceRiskLevels(DescribeInstanceRiskLevelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceRiskLevelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网方向删除会话趋势图</p>
     * 
     * @param request DescribeInternetDropTrafficTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetDropTrafficTrendResponse
     */
    public DescribeInternetDropTrafficTrendResponse describeInternetDropTrafficTrendWithOptions(DescribeInternetDropTrafficTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetDropTrafficTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetDropTrafficTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网方向删除会话趋势图</p>
     * 
     * @param request DescribeInternetDropTrafficTrendRequest
     * @return DescribeInternetDropTrafficTrendResponse
     */
    public DescribeInternetDropTrafficTrendResponse describeInternetDropTrafficTrend(DescribeInternetDropTrafficTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetDropTrafficTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放详情</p>
     * 
     * @param request DescribeInternetOpenDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetOpenDetailResponse
     */
    public DescribeInternetOpenDetailResponse describeInternetOpenDetailWithOptions(DescribeInternetOpenDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceId)) {
            query.put("AssetsInstanceId", request.assetsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceName)) {
            query.put("AssetsInstanceName", request.assetsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsType)) {
            query.put("AssetsType", request.assetsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIp)) {
            query.put("PublicIp", request.publicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNameFuzzy)) {
            query.put("ServiceNameFuzzy", request.serviceNameFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortList)) {
            query.put("SortList", request.sortList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suggestLevel)) {
            query.put("SuggestLevel", request.suggestLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetOpenDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetOpenDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放详情</p>
     * 
     * @param request DescribeInternetOpenDetailRequest
     * @return DescribeInternetOpenDetailResponse
     */
    public DescribeInternetOpenDetailResponse describeInternetOpenDetail(DescribeInternetOpenDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetOpenDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses that are open to the Internet.</p>
     * 
     * @param request DescribeInternetOpenIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetOpenIpResponse
     */
    public DescribeInternetOpenIpResponse describeInternetOpenIpWithOptions(DescribeInternetOpenIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceId)) {
            query.put("AssetsInstanceId", request.assetsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceName)) {
            query.put("AssetsInstanceName", request.assetsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsType)) {
            query.put("AssetsType", request.assetsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIp)) {
            query.put("PublicIp", request.publicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetOpenIp"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetOpenIpResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP addresses that are open to the Internet.</p>
     * 
     * @param request DescribeInternetOpenIpRequest
     * @return DescribeInternetOpenIpResponse
     */
    public DescribeInternetOpenIpResponse describeInternetOpenIp(DescribeInternetOpenIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetOpenIpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放端口</p>
     * 
     * @param request DescribeInternetOpenPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetOpenPortResponse
     */
    public DescribeInternetOpenPortResponse describeInternetOpenPortWithOptions(DescribeInternetOpenPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNameFuzzy)) {
            query.put("ServiceNameFuzzy", request.serviceNameFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suggestLevel)) {
            query.put("SuggestLevel", request.suggestLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetOpenPort"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetOpenPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放端口</p>
     * 
     * @param request DescribeInternetOpenPortRequest
     * @return DescribeInternetOpenPortResponse
     */
    public DescribeInternetOpenPortResponse describeInternetOpenPort(DescribeInternetOpenPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetOpenPortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放服务</p>
     * 
     * @param request DescribeInternetOpenServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetOpenServiceResponse
     */
    public DescribeInternetOpenServiceResponse describeInternetOpenServiceWithOptions(DescribeInternetOpenServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNameFuzzy)) {
            query.put("ServiceNameFuzzy", request.serviceNameFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suggestLevel)) {
            query.put("SuggestLevel", request.suggestLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetOpenService"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetOpenServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放服务</p>
     * 
     * @param request DescribeInternetOpenServiceRequest
     * @return DescribeInternetOpenServiceResponse
     */
    public DescribeInternetOpenServiceResponse describeInternetOpenService(DescribeInternetOpenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetOpenServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放统计</p>
     * 
     * @param request DescribeInternetOpenStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetOpenStatisticResponse
     */
    public DescribeInternetOpenStatisticResponse describeInternetOpenStatisticWithOptions(DescribeInternetOpenStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetOpenStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetOpenStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网开放统计</p>
     * 
     * @param request DescribeInternetOpenStatisticRequest
     * @return DescribeInternetOpenStatisticResponse
     */
    public DescribeInternetOpenStatisticResponse describeInternetOpenStatistic(DescribeInternetOpenStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetOpenStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网服务名称列表</p>
     * 
     * @param request DescribeInternetServiceNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetServiceNameListResponse
     */
    public DescribeInternetServiceNameListResponse describeInternetServiceNameListWithOptions(DescribeInternetServiceNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetServiceNameList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetServiceNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网服务名称列表</p>
     * 
     * @param request DescribeInternetServiceNameListRequest
     * @return DescribeInternetServiceNameListResponse
     */
    public DescribeInternetServiceNameListResponse describeInternetServiceNameList(DescribeInternetServiceNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetServiceNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网SLB</p>
     * 
     * @param request DescribeInternetSlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetSlbResponse
     */
    public DescribeInternetSlbResponse describeInternetSlbWithOptions(DescribeInternetSlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIp)) {
            query.put("PublicIp", request.publicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetSlb"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetSlbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网SLB</p>
     * 
     * @param request DescribeInternetSlbRequest
     * @return DescribeInternetSlbResponse
     */
    public DescribeInternetSlbResponse describeInternetSlb(DescribeInternetSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetSlbWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网流量时间TOP</p>
     * 
     * @param request DescribeInternetTimeTopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetTimeTopResponse
     */
    public DescribeInternetTimeTopResponse describeInternetTimeTopWithOptions(DescribeInternetTimeTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natIP)) {
            query.put("NatIP", request.natIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficTime)) {
            query.put("TrafficTime", request.trafficTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficType)) {
            query.put("TrafficType", request.trafficType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetTimeTop"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetTimeTopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网流量时间TOP</p>
     * 
     * @param request DescribeInternetTimeTopRequest
     * @return DescribeInternetTimeTopResponse
     */
    public DescribeInternetTimeTopResponse describeInternetTimeTop(DescribeInternetTimeTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetTimeTopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网流量TOP趋势图</p>
     * 
     * @param request DescribeInternetTrafficTopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetTrafficTopResponse
     */
    public DescribeInternetTrafficTopResponse describeInternetTrafficTopWithOptions(DescribeInternetTrafficTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleResult)) {
            query.put("RuleResult", request.ruleResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSource)) {
            query.put("RuleSource", request.ruleSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCountryName)) {
            query.put("ShowCountryName", request.showCountryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetTrafficTop"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetTrafficTopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取互联网流量TOP趋势图</p>
     * 
     * @param request DescribeInternetTrafficTopRequest
     * @return DescribeInternetTrafficTopResponse
     */
    public DescribeInternetTrafficTopResponse describeInternetTrafficTop(DescribeInternetTrafficTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetTrafficTopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of Internet traffic.</p>
     * 
     * @param request DescribeInternetTrafficTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetTrafficTrendResponse
     */
    public DescribeInternetTrafficTrendResponse describeInternetTrafficTrendWithOptions(DescribeInternetTrafficTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPrivateIP)) {
            query.put("SrcPrivateIP", request.srcPrivateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPublicIP)) {
            query.put("SrcPublicIP", request.srcPublicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficType)) {
            query.put("TrafficType", request.trafficType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetTrafficTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetTrafficTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trends of Internet traffic.</p>
     * 
     * @param request DescribeInternetTrafficTrendRequest
     * @return DescribeInternetTrafficTrendResponse
     */
    public DescribeInternetTrafficTrendResponse describeInternetTrafficTrend(DescribeInternetTrafficTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetTrafficTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ECS漏洞趋势</p>
     * 
     * @param request DescribeInvadeEcsTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvadeEcsTrendResponse
     */
    public DescribeInvadeEcsTrendResponse describeInvadeEcsTrendWithOptions(DescribeInvadeEcsTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvadeEcsTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvadeEcsTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ECS漏洞趋势</p>
     * 
     * @param request DescribeInvadeEcsTrendRequest
     * @return DescribeInvadeEcsTrendResponse
     */
    public DescribeInvadeEcsTrendResponse describeInvadeEcsTrend(DescribeInvadeEcsTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvadeEcsTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞事件详情</p>
     * 
     * @param request DescribeInvadeEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvadeEventDetailResponse
     */
    public DescribeInvadeEventDetailResponse describeInvadeEventDetailWithOptions(DescribeInvadeEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceId)) {
            query.put("AssetsInstanceId", request.assetsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventUuid)) {
            query.put("EventUuid", request.eventUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvadeEventDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvadeEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞事件详情</p>
     * 
     * @param request DescribeInvadeEventDetailRequest
     * @return DescribeInvadeEventDetailResponse
     */
    public DescribeInvadeEventDetailResponse describeInvadeEventDetail(DescribeInvadeEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvadeEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the breach awareness events of a firewall.</p>
     * 
     * @param request DescribeInvadeEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvadeEventListResponse
     */
    public DescribeInvadeEventListResponse describeInvadeEventListWithOptions(DescribeInvadeEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetsIP)) {
            query.put("AssetsIP", request.assetsIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceId)) {
            query.put("AssetsInstanceId", request.assetsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsInstanceName)) {
            query.put("AssetsInstanceName", request.assetsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventKey)) {
            query.put("EventKey", request.eventKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventUuid)) {
            query.put("EventUuid", request.eventUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isIgnore)) {
            query.put("IsIgnore", request.isIgnore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processStatusList)) {
            query.put("ProcessStatusList", request.processStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvadeEventList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvadeEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the breach awareness events of a firewall.</p>
     * 
     * @param request DescribeInvadeEventListRequest
     * @return DescribeInvadeEventListResponse
     */
    public DescribeInvadeEventListResponse describeInvadeEventList(DescribeInvadeEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvadeEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞名称列表</p>
     * 
     * @param request DescribeInvadeEventNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvadeEventNameListResponse
     */
    public DescribeInvadeEventNameListResponse describeInvadeEventNameListWithOptions(DescribeInvadeEventNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvadeEventNameList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvadeEventNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞名称列表</p>
     * 
     * @param request DescribeInvadeEventNameListRequest
     * @return DescribeInvadeEventNameListResponse
     */
    public DescribeInvadeEventNameListResponse describeInvadeEventNameList(DescribeInvadeEventNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvadeEventNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞事件统计</p>
     * 
     * @param request DescribeInvadeEventStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvadeEventStatisticResponse
     */
    public DescribeInvadeEventStatisticResponse describeInvadeEventStatisticWithOptions(DescribeInvadeEventStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvadeEventStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvadeEventStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取漏洞事件统计</p>
     * 
     * @param request DescribeInvadeEventStatisticRequest
     * @return DescribeInvadeEventStatisticResponse
     */
    public DescribeInvadeEventStatisticResponse describeInvadeEventStatistic(DescribeInvadeEventStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvadeEventStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询IPS私网关联信息</p>
     * 
     * @param request DescribeIpsPrivateAssocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIpsPrivateAssocResponse
     */
    public DescribeIpsPrivateAssocResponse describeIpsPrivateAssocWithOptions(DescribeIpsPrivateAssocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIp)) {
            query.put("PublicIp", request.publicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIpsPrivateAssoc"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIpsPrivateAssocResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询IPS私网关联信息</p>
     * 
     * @param request DescribeIpsPrivateAssocRequest
     * @return DescribeIpsPrivateAssocResponse
     */
    public DescribeIpsPrivateAssocResponse describeIpsPrivateAssoc(DescribeIpsPrivateAssocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIpsPrivateAssocWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ISP信息</p>
     * 
     * @param request DescribeIspInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIspInfoResponse
     */
    public DescribeIspInfoResponse describeIspInfoWithOptions(DescribeIspInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIspInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIspInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ISP信息</p>
     * 
     * @param request DescribeIspInfoRequest
     * @return DescribeIspInfoResponse
     */
    public DescribeIspInfoResponse describeIspInfo(DescribeIspInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIspInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取位置信息</p>
     * 
     * @param request DescribeLocationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLocationInfoResponse
     */
    public DescribeLocationInfoResponse describeLocationInfoWithOptions(DescribeLocationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLocationInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLocationInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取位置信息</p>
     * 
     * @param request DescribeLocationInfoRequest
     * @return DescribeLocationInfoResponse
     */
    public DescribeLocationInfoResponse describeLocationInfo(DescribeLocationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLocationInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Log Service Information</p>
     * 
     * @param request DescribeLogStoreInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogStoreInfoResponse
     */
    public DescribeLogStoreInfoResponse describeLogStoreInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogStoreInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogStoreInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Log Service Information</p>
     * @return DescribeLogStoreInfoResponse
     */
    public DescribeLogStoreInfoResponse describeLogStoreInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogStoreInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>免费版获取成员信息</p>
     * 
     * @param request DescribeMemberInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberInfoResponse
     */
    public DescribeMemberInfoResponse describeMemberInfoWithOptions(DescribeMemberInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>免费版获取成员信息</p>
     * 
     * @param request DescribeMemberInfoRequest
     * @return DescribeMemberInfoResponse
     */
    public DescribeMemberInfoResponse describeMemberInfo(DescribeMemberInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pagination status of NAT firewalls.</p>
     * 
     * @param request DescribeNatAclPageStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatAclPageStatusResponse
     */
    public DescribeNatAclPageStatusResponse describeNatAclPageStatusWithOptions(DescribeNatAclPageStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatAclPageStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatAclPageStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pagination status of NAT firewalls.</p>
     * 
     * @param request DescribeNatAclPageStatusRequest
     * @return DescribeNatAclPageStatusResponse
     */
    public DescribeNatAclPageStatusResponse describeNatAclPageStatus(DescribeNatAclPageStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatAclPageStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Nat防火墙分组列表</p>
     * 
     * @param request DescribeNatFirewallAclGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallAclGroupListResponse
     */
    public DescribeNatFirewallAclGroupListResponse describeNatFirewallAclGroupListWithOptions(DescribeNatFirewallAclGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallAclGroupList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallAclGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Nat防火墙分组列表</p>
     * 
     * @param request DescribeNatFirewallAclGroupListRequest
     * @return DescribeNatFirewallAclGroupListResponse
     */
    public DescribeNatFirewallAclGroupListResponse describeNatFirewallAclGroupList(DescribeNatFirewallAclGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallAclGroupListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all access control policies that are created for NAT firewalls.</p>
     * 
     * @param request DescribeNatFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallControlPolicyResponse
     */
    public DescribeNatFirewallControlPolicyResponse describeNatFirewallControlPolicyWithOptions(DescribeNatFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the information about all access control policies that are created for NAT firewalls by page.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all access control policies that are created for NAT firewalls.</p>
     * 
     * @param request DescribeNatFirewallControlPolicyRequest
     * @return DescribeNatFirewallControlPolicyResponse
     */
    public DescribeNatFirewallControlPolicyResponse describeNatFirewallControlPolicy(DescribeNatFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-nat防火墙拦截趋势</p>
     * 
     * @param request DescribeNatFirewallDropTrafficTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallDropTrafficTrendResponse
     */
    public DescribeNatFirewallDropTrafficTrendResponse describeNatFirewallDropTrafficTrendWithOptions(DescribeNatFirewallDropTrafficTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallDropTrafficTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallDropTrafficTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-nat防火墙拦截趋势</p>
     * 
     * @param request DescribeNatFirewallDropTrafficTrendRequest
     * @return DescribeNatFirewallDropTrafficTrendResponse
     */
    public DescribeNatFirewallDropTrafficTrendResponse describeNatFirewallDropTrafficTrend(DescribeNatFirewallDropTrafficTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallDropTrafficTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of NAT firewalls.</p>
     * 
     * @param request DescribeNatFirewallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallListResponse
     */
    public DescribeNatFirewallListResponse describeNatFirewallListWithOptions(DescribeNatFirewallListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyName)) {
            query.put("ProxyName", request.proxyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details of NAT firewalls.</p>
     * 
     * @param request DescribeNatFirewallListRequest
     * @return DescribeNatFirewallListResponse
     */
    public DescribeNatFirewallListResponse describeNatFirewallList(DescribeNatFirewallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * @param request DescribeNatFirewallPolicyPriorUsedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallPolicyPriorUsedResponse
     */
    public DescribeNatFirewallPolicyPriorUsedResponse describeNatFirewallPolicyPriorUsedWithOptions(DescribeNatFirewallPolicyPriorUsedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallPolicyPriorUsed"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallPolicyPriorUsedResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to query the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies that are created for a NAT firewall.</p>
     * 
     * @param request DescribeNatFirewallPolicyPriorUsedRequest
     * @return DescribeNatFirewallPolicyPriorUsedResponse
     */
    public DescribeNatFirewallPolicyPriorUsedResponse describeNatFirewallPolicyPriorUsed(DescribeNatFirewallPolicyPriorUsedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallPolicyPriorUsedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙预检查结果</p>
     * 
     * @param request DescribeNatFirewallPrecheckDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallPrecheckDetailResponse
     */
    public DescribeNatFirewallPrecheckDetailResponse describeNatFirewallPrecheckDetailWithOptions(DescribeNatFirewallPrecheckDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallPrecheckDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallPrecheckDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙预检查结果</p>
     * 
     * @param request DescribeNatFirewallPrecheckDetailRequest
     * @return DescribeNatFirewallPrecheckDetailResponse
     */
    public DescribeNatFirewallPrecheckDetailResponse describeNatFirewallPrecheckDetail(DescribeNatFirewallPrecheckDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallPrecheckDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取NAT防火墙配额</p>
     * 
     * @param request DescribeNatFirewallQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallQuotaResponse
     */
    public DescribeNatFirewallQuotaResponse describeNatFirewallQuotaWithOptions(DescribeNatFirewallQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallQuota"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取NAT防火墙配额</p>
     * 
     * @param request DescribeNatFirewallQuotaRequest
     * @return DescribeNatFirewallQuotaResponse
     */
    public DescribeNatFirewallQuotaResponse describeNatFirewallQuota(DescribeNatFirewallQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙时间点流量详情列表</p>
     * 
     * @param request DescribeNatFirewallTimeTopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallTimeTopResponse
     */
    public DescribeNatFirewallTimeTopResponse describeNatFirewallTimeTopWithOptions(DescribeNatFirewallTimeTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallTimeTop"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallTimeTopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询NAT防火墙时间点流量详情列表</p>
     * 
     * @param request DescribeNatFirewallTimeTopRequest
     * @return DescribeNatFirewallTimeTopResponse
     */
    public DescribeNatFirewallTimeTopResponse describeNatFirewallTimeTop(DescribeNatFirewallTimeTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallTimeTopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-NAT流量趋势</p>
     * 
     * @param request DescribeNatFirewallTrafficTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatFirewallTrafficTrendResponse
     */
    public DescribeNatFirewallTrafficTrendResponse describeNatFirewallTrafficTrendWithOptions(DescribeNatFirewallTrafficTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatFirewallTrafficTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatFirewallTrafficTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-NAT流量趋势</p>
     * 
     * @param request DescribeNatFirewallTrafficTrendRequest
     * @return DescribeNatFirewallTrafficTrendResponse
     */
    public DescribeNatFirewallTrafficTrendResponse describeNatFirewallTrafficTrend(DescribeNatFirewallTrafficTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatFirewallTrafficTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络实例列表</p>
     * 
     * @param request DescribeNetworkInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkInstanceListResponse
     */
    public DescribeNetworkInstanceListResponse describeNetworkInstanceListWithOptions(DescribeNetworkInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInstanceList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInstanceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络实例列表</p>
     * 
     * @param request DescribeNetworkInstanceListRequest
     * @return DescribeNetworkInstanceListResponse
     */
    public DescribeNetworkInstanceListResponse describeNetworkInstanceList(DescribeNetworkInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInstanceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络实例关系列表</p>
     * 
     * @param request DescribeNetworkInstanceRelationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkInstanceRelationListResponse
     */
    public DescribeNetworkInstanceRelationListResponse describeNetworkInstanceRelationListWithOptions(DescribeNetworkInstanceRelationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallConfigureStatus)) {
            query.put("FirewallConfigureStatus", request.firewallConfigureStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceId)) {
            query.put("NetworkInstanceId", request.networkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerNetworkInstanceId)) {
            query.put("PeerNetworkInstanceId", request.peerNetworkInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInstanceRelationList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInstanceRelationListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络实例关系列表</p>
     * 
     * @param request DescribeNetworkInstanceRelationListRequest
     * @return DescribeNetworkInstanceRelationListResponse
     */
    public DescribeNetworkInstanceRelationListResponse describeNetworkInstanceRelationList(DescribeNetworkInstanceRelationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInstanceRelationListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络流量TOP环比</p>
     * 
     * @param request DescribeNetworkTrafficTopRatioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkTrafficTopRatioResponse
     */
    public DescribeNetworkTrafficTopRatioResponse describeNetworkTrafficTopRatioWithOptions(DescribeNetworkTrafficTopRatioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetIP)) {
            query.put("AssetIP", request.assetIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetRegion)) {
            query.put("AssetRegion", request.assetRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPort)) {
            query.put("DstPort", request.dstPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProperty)) {
            query.put("IpProperty", request.ipProperty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleResult)) {
            query.put("RuleResult", request.ruleResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkTrafficTopRatio"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkTrafficTopRatioResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络流量TOP环比</p>
     * 
     * @param request DescribeNetworkTrafficTopRatioRequest
     * @return DescribeNetworkTrafficTopRatioResponse
     */
    public DescribeNetworkTrafficTopRatioResponse describeNetworkTrafficTopRatio(DescribeNetworkTrafficTopRatioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkTrafficTopRatioWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取公网IP通过的源状态</p>
     * 
     * @param request DescribeOpenIpAccessSrcStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpenIpAccessSrcStatResponse
     */
    public DescribeOpenIpAccessSrcStatResponse describeOpenIpAccessSrcStatWithOptions(DescribeOpenIpAccessSrcStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIp)) {
            query.put("DstIp", request.dstIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpenIpAccessSrcStat"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpenIpAccessSrcStatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取公网IP通过的源状态</p>
     * 
     * @param request DescribeOpenIpAccessSrcStatRequest
     * @return DescribeOpenIpAccessSrcStatResponse
     */
    public DescribeOpenIpAccessSrcStatResponse describeOpenIpAccessSrcStat(DescribeOpenIpAccessSrcStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpenIpAccessSrcStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联资产列表</p>
     * 
     * @param request DescribeOutgoingAssetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingAssetListResponse
     */
    public DescribeOutgoingAssetListResponse describeOutgoingAssetListWithOptions(DescribeOutgoingAssetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetsRegion)) {
            query.put("AssetsRegion", request.assetsRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayName)) {
            query.put("NatGatewayName", request.natGatewayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            query.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityRisk)) {
            query.put("SecurityRisk", request.securityRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingAssetList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingAssetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联资产列表</p>
     * 
     * @param request DescribeOutgoingAssetListRequest
     * @return DescribeOutgoingAssetListResponse
     */
    public DescribeOutgoingAssetListResponse describeOutgoingAssetList(DescribeOutgoingAssetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingAssetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的</p>
     * 
     * @param request DescribeOutgoingDestinationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDestinationResponse
     */
    public DescribeOutgoingDestinationResponse describeOutgoingDestinationWithOptions(DescribeOutgoingDestinationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclCoverage)) {
            query.put("AclCoverage", request.aclCoverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAITraffic)) {
            query.put("IsAITraffic", request.isAITraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            query.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securitySuggest)) {
            query.put("SecuritySuggest", request.securitySuggest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDestination"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDestinationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的</p>
     * 
     * @param request DescribeOutgoingDestinationRequest
     * @return DescribeOutgoingDestinationResponse
     */
    public DescribeOutgoingDestinationResponse describeOutgoingDestination(DescribeOutgoingDestinationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDestinationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的分类</p>
     * 
     * @param request DescribeOutgoingDestinationCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDestinationCategoryResponse
     */
    public DescribeOutgoingDestinationCategoryResponse describeOutgoingDestinationCategoryWithOptions(DescribeOutgoingDestinationCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstType)) {
            query.put("DstType", request.dstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeId)) {
            query.put("TypeId", request.typeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDestinationCategory"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDestinationCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的分类</p>
     * 
     * @param request DescribeOutgoingDestinationCategoryRequest
     * @return DescribeOutgoingDestinationCategoryResponse
     */
    public DescribeOutgoingDestinationCategoryResponse describeOutgoingDestinationCategory(DescribeOutgoingDestinationCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDestinationCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get details of outgoing destination IPs</p>
     * 
     * @param request DescribeOutgoingDestinationIPRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDestinationIPResponse
     */
    public DescribeOutgoingDestinationIPResponse describeOutgoingDestinationIPWithOptions(DescribeOutgoingDestinationIPRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            query.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdNew)) {
            query.put("TagIdNew", request.tagIdNew);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDestinationIP"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDestinationIPResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get details of outgoing destination IPs</p>
     * 
     * @param request DescribeOutgoingDestinationIPRequest
     * @return DescribeOutgoingDestinationIPResponse
     */
    public DescribeOutgoingDestinationIPResponse describeOutgoingDestinationIP(DescribeOutgoingDestinationIPRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDestinationIPWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的IP详情</p>
     * 
     * @param request DescribeOutgoingDestinationIPDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDestinationIPDetailResponse
     */
    public DescribeOutgoingDestinationIPDetailResponse describeOutgoingDestinationIPDetailWithOptions(DescribeOutgoingDestinationIPDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclCoverage)) {
            query.put("AclCoverage", request.aclCoverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            query.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDestinationIPDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDestinationIPDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联目的IP详情</p>
     * 
     * @param request DescribeOutgoingDestinationIPDetailRequest
     * @return DescribeOutgoingDestinationIPDetailResponse
     */
    public DescribeOutgoingDestinationIPDetailResponse describeOutgoingDestinationIPDetail(DescribeOutgoingDestinationIPDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDestinationIPDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the domain names in outbound connections.</p>
     * 
     * @param request DescribeOutgoingDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDomainResponse
     */
    public DescribeOutgoingDomainResponse describeOutgoingDomainWithOptions(DescribeOutgoingDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAITraffic)) {
            query.put("IsAITraffic", request.isAITraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagIdNew)) {
            query.put("TagIdNew", request.tagIdNew);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDomain"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the domain names in outbound connections.</p>
     * 
     * @param request DescribeOutgoingDomainRequest
     * @return DescribeOutgoingDomainResponse
     */
    public DescribeOutgoingDomainResponse describeOutgoingDomain(DescribeOutgoingDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联域名详情</p>
     * 
     * @param request DescribeOutgoingDomainDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingDomainDetailResponse
     */
    public DescribeOutgoingDomainDetailResponse describeOutgoingDomainDetailWithOptions(DescribeOutgoingDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclCoverage)) {
            query.put("AclCoverage", request.aclCoverage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPType)) {
            query.put("IPType", request.IPType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIP)) {
            query.put("PrivateIP", request.privateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingDomainDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingDomainDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联域名详情</p>
     * 
     * @param request DescribeOutgoingDomainDetailRequest
     * @return DescribeOutgoingDomainDetailResponse
     */
    public DescribeOutgoingDomainDetailResponse describeOutgoingDomainDetail(DescribeOutgoingDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联风险域名与IP数</p>
     * 
     * @param request DescribeOutgoingRiskDomainAndIpCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingRiskDomainAndIpCountResponse
     */
    public DescribeOutgoingRiskDomainAndIpCountResponse describeOutgoingRiskDomainAndIpCountWithOptions(DescribeOutgoingRiskDomainAndIpCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingRiskDomainAndIpCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingRiskDomainAndIpCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联风险域名与IP数</p>
     * 
     * @param request DescribeOutgoingRiskDomainAndIpCountRequest
     * @return DescribeOutgoingRiskDomainAndIpCountResponse
     */
    public DescribeOutgoingRiskDomainAndIpCountResponse describeOutgoingRiskDomainAndIpCount(DescribeOutgoingRiskDomainAndIpCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingRiskDomainAndIpCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联风险趋势图</p>
     * 
     * @param request DescribeOutgoingRiskTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingRiskTrendResponse
     */
    public DescribeOutgoingRiskTrendResponse describeOutgoingRiskTrendWithOptions(DescribeOutgoingRiskTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingRiskTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingRiskTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联风险趋势图</p>
     * 
     * @param request DescribeOutgoingRiskTrendRequest
     * @return DescribeOutgoingRiskTrendResponse
     */
    public DescribeOutgoingRiskTrendResponse describeOutgoingRiskTrend(DescribeOutgoingRiskTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingRiskTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联统计</p>
     * 
     * @param request DescribeOutgoingStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingStatisticResponse
     */
    public DescribeOutgoingStatisticResponse describeOutgoingStatisticWithOptions(DescribeOutgoingStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联统计</p>
     * 
     * @param request DescribeOutgoingStatisticRequest
     * @return DescribeOutgoingStatisticResponse
     */
    public DescribeOutgoingStatisticResponse describeOutgoingStatistic(DescribeOutgoingStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联标签</p>
     * 
     * @param request DescribeOutgoingTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutgoingTagResponse
     */
    public DescribeOutgoingTagResponse describeOutgoingTagWithOptions(DescribeOutgoingTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstType)) {
            query.put("DstType", request.dstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutgoingTag"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutgoingTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外联标签</p>
     * 
     * @param request DescribeOutgoingTagRequest
     * @return DescribeOutgoingTagResponse
     */
    public DescribeOutgoingTagResponse describeOutgoingTag(DescribeOutgoingTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutgoingTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档</p>
     * 
     * @deprecated OpenAPI DescribePageDocuments is deprecated
     * 
     * @param request DescribePageDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePageDocumentsResponse
     */
    @Deprecated
    // Deprecated
    public DescribePageDocumentsResponse describePageDocumentsWithOptions(DescribePageDocumentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageName)) {
            query.put("PageName", request.pageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tabName)) {
            query.put("TabName", request.tabName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePageDocuments"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePageDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档</p>
     * 
     * @deprecated OpenAPI DescribePageDocuments is deprecated
     * 
     * @param request DescribePageDocumentsRequest
     * @return DescribePageDocumentsResponse
     */
    @Deprecated
    // Deprecated
    public DescribePageDocumentsResponse describePageDocuments(DescribePageDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePageDocumentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribePolicyAdvancedConfig operation to query whether the strict mode is enabled for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the strict mode is enabled for an access control policy.</p>
     * 
     * @param request DescribePolicyAdvancedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyAdvancedConfigResponse
     */
    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfigWithOptions(DescribePolicyAdvancedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyAdvancedConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyAdvancedConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribePolicyAdvancedConfig operation to query whether the strict mode is enabled for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the strict mode is enabled for an access control policy.</p>
     * 
     * @param request DescribePolicyAdvancedConfigRequest
     * @return DescribePolicyAdvancedConfigResponse
     */
    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyAdvancedConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of the access control policies that match specific query conditions.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies.</p>
     * 
     * @param request DescribePolicyPriorUsedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolicyPriorUsedResponse
     */
    public DescribePolicyPriorUsedResponse describePolicyPriorUsedWithOptions(DescribePolicyPriorUsedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyPriorUsed"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyPriorUsedResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of the access control policies that match specific query conditions.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies.</p>
     * 
     * @param request DescribePolicyPriorUsedRequest
     * @return DescribePolicyPriorUsedResponse
     */
    public DescribePolicyPriorUsedResponse describePolicyPriorUsed(DescribePolicyPriorUsedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolicyPriorUsedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>按量付费是否开启过防护</p>
     * 
     * @param request DescribePostpayEnabledProtectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayEnabledProtectionResponse
     */
    public DescribePostpayEnabledProtectionResponse describePostpayEnabledProtectionWithOptions(DescribePostpayEnabledProtectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayEnabledProtection"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayEnabledProtectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>按量付费是否开启过防护</p>
     * 
     * @param request DescribePostpayEnabledProtectionRequest
     * @return DescribePostpayEnabledProtectionResponse
     */
    public DescribePostpayEnabledProtectionResponse describePostpayEnabledProtection(DescribePostpayEnabledProtectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayEnabledProtectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you use Cloud Firewall that uses the pay-as-you-go billing method, you can call this operation to query traffic details accurate to the granularity of specific resource instances. If you use Cloud Firewall that uses the subscription billing method, you can call this operation to query the overall traffic details.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of traffic billed based on the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayTrafficDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayTrafficDetailResponse
     */
    public DescribePostpayTrafficDetailResponse describePostpayTrafficDetailWithOptions(DescribePostpayTrafficDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchItem)) {
            query.put("SearchItem", request.searchItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficType)) {
            query.put("TrafficType", request.trafficType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayTrafficDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayTrafficDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you use Cloud Firewall that uses the pay-as-you-go billing method, you can call this operation to query traffic details accurate to the granularity of specific resource instances. If you use Cloud Firewall that uses the subscription billing method, you can call this operation to query the overall traffic details.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of traffic billed based on the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayTrafficDetailRequest
     * @return DescribePostpayTrafficDetailResponse
     */
    public DescribePostpayTrafficDetailResponse describePostpayTrafficDetail(DescribePostpayTrafficDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayTrafficDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query statistics of the current Cloud Firewall from the date of purchase.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total volume of traffic that is billed based on the pay-as-you-go billing method, including all firewalls within the current account.</p>
     * 
     * @param request DescribePostpayTrafficTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayTrafficTotalResponse
     */
    public DescribePostpayTrafficTotalResponse describePostpayTrafficTotalWithOptions(DescribePostpayTrafficTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayTrafficTotal"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayTrafficTotalResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query statistics of the current Cloud Firewall from the date of purchase.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total volume of traffic that is billed based on the pay-as-you-go billing method, including all firewalls within the current account.</p>
     * 
     * @param request DescribePostpayTrafficTotalRequest
     * @return DescribePostpayTrafficTotalResponse
     */
    public DescribePostpayTrafficTotalResponse describePostpayTrafficTotal(DescribePostpayTrafficTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayTrafficTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Internet Firewall feature in Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserInternetStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayUserInternetStatusResponse
     */
    public DescribePostpayUserInternetStatusResponse describePostpayUserInternetStatusWithOptions(DescribePostpayUserInternetStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayUserInternetStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayUserInternetStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the Internet Firewall feature in Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserInternetStatusRequest
     * @return DescribePostpayUserInternetStatusResponse
     */
    public DescribePostpayUserInternetStatusResponse describePostpayUserInternetStatus(DescribePostpayUserInternetStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayUserInternetStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the NAT Firewall feature in Cloud Firewall that use the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserNatStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayUserNatStatusResponse
     */
    public DescribePostpayUserNatStatusResponse describePostpayUserNatStatusWithOptions(DescribePostpayUserNatStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayUserNatStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayUserNatStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the NAT Firewall feature in Cloud Firewall that use the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserNatStatusRequest
     * @return DescribePostpayUserNatStatusResponse
     */
    public DescribePostpayUserNatStatusResponse describePostpayUserNatStatus(DescribePostpayUserNatStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayUserNatStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the virtual private cloud (VPC) Firewall feature in Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserVpcStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePostpayUserVpcStatusResponse
     */
    public DescribePostpayUserVpcStatusResponse describePostpayUserVpcStatusWithOptions(DescribePostpayUserVpcStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePostpayUserVpcStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePostpayUserVpcStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the virtual private cloud (VPC) Firewall feature in Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request DescribePostpayUserVpcStatusRequest
     * @return DescribePostpayUserVpcStatusResponse
     */
    public DescribePostpayUserVpcStatusResponse describePostpayUserVpcStatus(DescribePostpayUserVpcStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePostpayUserVpcStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries prefix lists.</p>
     * 
     * @param request DescribePrefixListsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrefixListsResponse
     */
    public DescribePrefixListsResponse describePrefixListsWithOptions(DescribePrefixListsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrefixLists"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrefixListsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries prefix lists.</p>
     * 
     * @param request DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    public DescribePrefixListsResponse describePrefixLists(DescribePrefixListsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrefixListsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS域名列表</p>
     * 
     * @param request DescribePrivateDnsDomainNameListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrivateDnsDomainNameListResponse
     */
    public DescribePrivateDnsDomainNameListResponse describePrivateDnsDomainNameListWithOptions(DescribePrivateDnsDomainNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrivateDnsDomainNameList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrivateDnsDomainNameListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS域名列表</p>
     * 
     * @param request DescribePrivateDnsDomainNameListRequest
     * @return DescribePrivateDnsDomainNameListResponse
     */
    public DescribePrivateDnsDomainNameListResponse describePrivateDnsDomainNameList(DescribePrivateDnsDomainNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrivateDnsDomainNameListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS终端节点详情</p>
     * 
     * @param request DescribePrivateDnsEndpointDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrivateDnsEndpointDetailResponse
     */
    public DescribePrivateDnsEndpointDetailResponse describePrivateDnsEndpointDetailWithOptions(DescribePrivateDnsEndpointDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrivateDnsEndpointDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrivateDnsEndpointDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS终端节点详情</p>
     * 
     * @param request DescribePrivateDnsEndpointDetailRequest
     * @return DescribePrivateDnsEndpointDetailResponse
     */
    public DescribePrivateDnsEndpointDetailResponse describePrivateDnsEndpointDetail(DescribePrivateDnsEndpointDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrivateDnsEndpointDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS终端节点列表</p>
     * 
     * @param request DescribePrivateDnsEndpointListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrivateDnsEndpointListResponse
     */
    public DescribePrivateDnsEndpointListResponse describePrivateDnsEndpointListWithOptions(DescribePrivateDnsEndpointListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrivateDnsEndpointList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrivateDnsEndpointListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询私网DNS终端节点列表</p>
     * 
     * @param request DescribePrivateDnsEndpointListRequest
     * @return DescribePrivateDnsEndpointListResponse
     */
    public DescribePrivateDnsEndpointListResponse describePrivateDnsEndpointList(DescribePrivateDnsEndpointListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrivateDnsEndpointListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询私有DNS的统计信息</p>
     * 
     * @param request DescribePrivateDnsStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrivateDnsStatisticsResponse
     */
    public DescribePrivateDnsStatisticsResponse describePrivateDnsStatisticsWithOptions(DescribePrivateDnsStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNameCreatedEndTime)) {
            query.put("DomainNameCreatedEndTime", request.domainNameCreatedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameCreatedStartTime)) {
            query.put("DomainNameCreatedStartTime", request.domainNameCreatedStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrivateDnsStatistics"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrivateDnsStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询私有DNS的统计信息</p>
     * 
     * @param request DescribePrivateDnsStatisticsRequest
     * @return DescribePrivateDnsStatisticsResponse
     */
    public DescribePrivateDnsStatisticsResponse describePrivateDnsStatistics(DescribePrivateDnsStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrivateDnsStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取地域信息</p>
     * 
     * @param request DescribeRegionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionInfoResponse
     */
    public DescribeRegionInfoResponse describeRegionInfoWithOptions(DescribeRegionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegionInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取地域信息</p>
     * 
     * @param request DescribeRegionInfoRequest
     * @return DescribeRegionInfoResponse
     */
    public DescribeRegionInfoResponse describeRegionInfo(DescribeRegionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产类型默认引流</p>
     * 
     * @param request DescribeResourceTypeAutoEnableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceTypeAutoEnableResponse
     */
    public DescribeResourceTypeAutoEnableResponse describeResourceTypeAutoEnableWithOptions(DescribeResourceTypeAutoEnableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceTypeAutoEnable"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceTypeAutoEnableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询资产类型默认引流</p>
     * 
     * @param request DescribeResourceTypeAutoEnableRequest
     * @return DescribeResourceTypeAutoEnableResponse
     */
    public DescribeResourceTypeAutoEnableResponse describeResourceTypeAutoEnable(DescribeResourceTypeAutoEnableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypeAutoEnableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeRiskEventGroup operation to query and download the details of intrusion events. We recommend that you query the details of 5 to 10 intrusion events at a time. If you do not need to query the geographical information about IP addresses, you can set the NoLocation parameter to true to prevent query timeout.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of intrusion events.</p>
     * 
     * @param request DescribeRiskEventGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventGroupResponse
     */
    public DescribeRiskEventGroupResponse describeRiskEventGroupWithOptions(DescribeRiskEventGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackApp)) {
            query.put("AttackApp", request.attackApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackAppCategory)) {
            query.put("AttackAppCategory", request.attackAppCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstNetworkInstanceId)) {
            query.put("DstNetworkInstanceId", request.dstNetworkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOnlyPrivateAssoc)) {
            query.put("IsOnlyPrivateAssoc", request.isOnlyPrivateAssoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noLocation)) {
            query.put("NoLocation", request.noLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleResult)) {
            query.put("RuleResult", request.ruleResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSource)) {
            query.put("RuleSource", request.ruleSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcNetworkInstanceId)) {
            query.put("SrcNetworkInstanceId", request.srcNetworkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulLevel)) {
            query.put("VulLevel", request.vulLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventGroup"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeRiskEventGroup operation to query and download the details of intrusion events. We recommend that you query the details of 5 to 10 intrusion events at a time. If you do not need to query the geographical information about IP addresses, you can set the NoLocation parameter to true to prevent query timeout.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of intrusion events.</p>
     * 
     * @param request DescribeRiskEventGroupRequest
     * @return DescribeRiskEventGroupResponse
     */
    public DescribeRiskEventGroupResponse describeRiskEventGroup(DescribeRiskEventGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attack payloads of intrusion events.</p>
     * 
     * @param request DescribeRiskEventPayloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventPayloadResponse
     */
    public DescribeRiskEventPayloadResponse describeRiskEventPayloadWithOptions(DescribeRiskEventPayloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstVpcId)) {
            query.put("DstVpcId", request.dstVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIP)) {
            query.put("PublicIP", request.publicIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcId)) {
            query.put("SrcVpcId", request.srcVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.UUID)) {
            query.put("UUID", request.UUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventPayload"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventPayloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the attack payloads of intrusion events.</p>
     * 
     * @param request DescribeRiskEventPayloadRequest
     * @return DescribeRiskEventPayloadResponse
     */
    public DescribeRiskEventPayloadResponse describeRiskEventPayload(DescribeRiskEventPayloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventPayloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险事件统计</p>
     * 
     * @param request DescribeRiskEventStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventStatisticResponse
     */
    public DescribeRiskEventStatisticResponse describeRiskEventStatisticWithOptions(DescribeRiskEventStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackApp)) {
            query.put("AttackApp", request.attackApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险事件统计</p>
     * 
     * @param request DescribeRiskEventStatisticRequest
     * @return DescribeRiskEventStatisticResponse
     */
    public DescribeRiskEventStatisticResponse describeRiskEventStatistic(DescribeRiskEventStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件攻击APP</p>
     * 
     * @param request DescribeRiskEventTopAttackAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventTopAttackAppResponse
     */
    public DescribeRiskEventTopAttackAppResponse describeRiskEventTopAttackAppWithOptions(DescribeRiskEventTopAttackAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackApp)) {
            query.put("AttackApp", request.attackApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventTopAttackApp"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventTopAttackAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件攻击APP</p>
     * 
     * @param request DescribeRiskEventTopAttackAppRequest
     * @return DescribeRiskEventTopAttackAppResponse
     */
    public DescribeRiskEventTopAttackAppResponse describeRiskEventTopAttackApp(DescribeRiskEventTopAttackAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventTopAttackAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件资产</p>
     * 
     * @param request DescribeRiskEventTopAttackAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventTopAttackAssetResponse
     */
    public DescribeRiskEventTopAttackAssetResponse describeRiskEventTopAttackAssetWithOptions(DescribeRiskEventTopAttackAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackApp)) {
            query.put("AttackApp", request.attackApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventTopAttackAsset"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventTopAttackAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件资产</p>
     * 
     * @param request DescribeRiskEventTopAttackAssetRequest
     * @return DescribeRiskEventTopAttackAssetResponse
     */
    public DescribeRiskEventTopAttackAssetResponse describeRiskEventTopAttackAsset(DescribeRiskEventTopAttackAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventTopAttackAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件类型</p>
     * 
     * @param request DescribeRiskEventTopAttackTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskEventTopAttackTypeResponse
     */
    public DescribeRiskEventTopAttackTypeResponse describeRiskEventTopAttackTypeWithOptions(DescribeRiskEventTopAttackTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventTopAttackType"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventTopAttackTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Top风险事件类型</p>
     * 
     * @param request DescribeRiskEventTopAttackTypeRequest
     * @return DescribeRiskEventTopAttackTypeResponse
     */
    public DescribeRiskEventTopAttackTypeResponse describeRiskEventTopAttackType(DescribeRiskEventTopAttackTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskEventTopAttackTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险安全组详情</p>
     * 
     * @deprecated OpenAPI DescribeRiskSecurityGroupDetail is deprecated
     * 
     * @param request DescribeRiskSecurityGroupDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskSecurityGroupDetailResponse
     */
    @Deprecated
    // Deprecated
    public DescribeRiskSecurityGroupDetailResponse describeRiskSecurityGroupDetailWithOptions(DescribeRiskSecurityGroupDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleUuid)) {
            query.put("RuleUuid", request.ruleUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskSecurityGroupDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskSecurityGroupDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取风险安全组详情</p>
     * 
     * @deprecated OpenAPI DescribeRiskSecurityGroupDetail is deprecated
     * 
     * @param request DescribeRiskSecurityGroupDetailRequest
     * @return DescribeRiskSecurityGroupDetailResponse
     */
    @Deprecated
    // Deprecated
    public DescribeRiskSecurityGroupDetailResponse describeRiskSecurityGroupDetail(DescribeRiskSecurityGroupDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskSecurityGroupDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露的敏感数据事件列表</p>
     * 
     * @param request DescribeSdlEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSdlEventDetailResponse
     */
    public DescribeSdlEventDetailResponse describeSdlEventDetailWithOptions(DescribeSdlEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIp)) {
            query.put("DstIp", request.dstIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSdlEventDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSdlEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露的敏感数据事件列表</p>
     * 
     * @param request DescribeSdlEventDetailRequest
     * @return DescribeSdlEventDetailResponse
     */
    public DescribeSdlEventDetailResponse describeSdlEventDetail(DescribeSdlEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdlEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件列表</p>
     * 
     * @param request DescribeSdlEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSdlEventListResponse
     */
    public DescribeSdlEventListResponse describeSdlEventListWithOptions(DescribeSdlEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIp)) {
            query.put("DstIp", request.dstIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyAiEvt)) {
            query.put("OnlyAiEvt", request.onlyAiEvt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveLevel)) {
            query.put("SensitiveLevel", request.sensitiveLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSdlEventList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSdlEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件列表</p>
     * 
     * @param request DescribeSdlEventListRequest
     * @return DescribeSdlEventListResponse
     */
    public DescribeSdlEventListResponse describeSdlEventList(DescribeSdlEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdlEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露的敏感数据列表</p>
     * 
     * @param request DescribeSdlEventSdListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSdlEventSdListResponse
     */
    public DescribeSdlEventSdListResponse describeSdlEventSdListWithOptions(DescribeSdlEventSdListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIp)) {
            query.put("DstIp", request.dstIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSdlEventSdList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSdlEventSdListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露的敏感数据列表</p>
     * 
     * @param request DescribeSdlEventSdListRequest
     * @return DescribeSdlEventSdListResponse
     */
    public DescribeSdlEventSdListResponse describeSdlEventSdList(DescribeSdlEventSdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdlEventSdListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件统计数据</p>
     * 
     * @param request DescribeSdlEventStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSdlEventStatisticResponse
     */
    public DescribeSdlEventStatisticResponse describeSdlEventStatisticWithOptions(DescribeSdlEventStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSdlEventStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSdlEventStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件统计数据</p>
     * 
     * @param request DescribeSdlEventStatisticRequest
     * @return DescribeSdlEventStatisticResponse
     */
    public DescribeSdlEventStatisticResponse describeSdlEventStatistic(DescribeSdlEventStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdlEventStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件类型分布/资产TOP/目的TOP</p>
     * 
     * @param request DescribeSdlStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSdlStatisticResponse
     */
    public DescribeSdlStatisticResponse describeSdlStatisticWithOptions(DescribeSdlStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSdlStatistic"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSdlStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据泄露事件类型分布/资产TOP/目的TOP</p>
     * 
     * @param request DescribeSdlStatisticRequest
     * @return DescribeSdlStatisticResponse
     */
    public DescribeSdlStatisticResponse describeSdlStatistic(DescribeSdlStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSdlStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全模式</p>
     * 
     * @param request DescribeSecurityModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityModeResponse
     */
    public DescribeSecurityModeResponse describeSecurityModeWithOptions(DescribeSecurityModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityMode"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全模式</p>
     * 
     * @param request DescribeSecurityModeRequest
     * @return DescribeSecurityModeResponse
     */
    public DescribeSecurityModeResponse describeSecurityMode(DescribeSecurityModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取正向代理</p>
     * 
     * @deprecated OpenAPI DescribeSecurityProxy is deprecated, please use Cloudfw::2017-12-07::DescribeNatFirewallList instead.
     * 
     * @param request DescribeSecurityProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityProxyResponse
     */
    @Deprecated
    // Deprecated
    public DescribeSecurityProxyResponse describeSecurityProxyWithOptions(DescribeSecurityProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyName)) {
            query.put("ProxyName", request.proxyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityProxy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityProxyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取正向代理</p>
     * 
     * @deprecated OpenAPI DescribeSecurityProxy is deprecated, please use Cloudfw::2017-12-07::DescribeNatFirewallList instead.
     * 
     * @param request DescribeSecurityProxyRequest
     * @return DescribeSecurityProxyResponse
     */
    @Deprecated
    // Deprecated
    public DescribeSecurityProxyResponse describeSecurityProxy(DescribeSecurityProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityProxyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取正向代理资源</p>
     * 
     * @param request DescribeSecurityProxyResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityProxyResourcesResponse
     */
    public DescribeSecurityProxyResourcesResponse describeSecurityProxyResourcesWithOptions(DescribeSecurityProxyResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityProxyResources"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityProxyResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取正向代理资源</p>
     * 
     * @param request DescribeSecurityProxyResourcesRequest
     * @return DescribeSecurityProxyResourcesResponse
     */
    public DescribeSecurityProxyResourcesResponse describeSecurityProxyResources(DescribeSecurityProxyResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityProxyResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取敏感数据类别开关</p>
     * 
     * @param request DescribeSensitiveSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSensitiveSwitchResponse
     */
    public DescribeSensitiveSwitchResponse describeSensitiveSwitchWithOptions(DescribeSensitiveSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategory)) {
            query.put("ParentCategory", request.parentCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveCategory)) {
            query.put("SensitiveCategory", request.sensitiveCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveLevel)) {
            query.put("SensitiveLevel", request.sensitiveLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchStatus)) {
            query.put("SwitchStatus", request.switchStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSensitiveSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSensitiveSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取敏感数据类别开关</p>
     * 
     * @param request DescribeSensitiveSwitchRequest
     * @return DescribeSensitiveSwitchResponse
     */
    public DescribeSensitiveSwitchResponse describeSensitiveSwitch(DescribeSensitiveSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSensitiveSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about signature library versions.</p>
     * 
     * @param request DescribeSignatureLibVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSignatureLibVersionResponse
     */
    public DescribeSignatureLibVersionResponse describeSignatureLibVersionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSignatureLibVersion"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSignatureLibVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about signature library versions.</p>
     * @return DescribeSignatureLibVersionResponse
     */
    public DescribeSignatureLibVersionResponse describeSignatureLibVersion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSignatureLibVersionWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户SLR授权信息</p>
     * 
     * @param request DescribeSlrGrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlrGrantResponse
     */
    public DescribeSlrGrantResponse describeSlrGrantWithOptions(DescribeSlrGrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlrGrant"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlrGrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户SLR授权信息</p>
     * 
     * @param request DescribeSlrGrantRequest
     * @return DescribeSlrGrantResponse
     */
    public DescribeSlrGrantResponse describeSlrGrant(DescribeSlrGrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlrGrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取SLS开启状态</p>
     * 
     * @param request DescribeSlsAnalyzeOpenStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlsAnalyzeOpenStatusResponse
     */
    public DescribeSlsAnalyzeOpenStatusResponse describeSlsAnalyzeOpenStatusWithOptions(DescribeSlsAnalyzeOpenStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlsAnalyzeOpenStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlsAnalyzeOpenStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取SLS开启状态</p>
     * 
     * @param request DescribeSlsAnalyzeOpenStatusRequest
     * @return DescribeSlsAnalyzeOpenStatusResponse
     */
    public DescribeSlsAnalyzeOpenStatusResponse describeSlsAnalyzeOpenStatus(DescribeSlsAnalyzeOpenStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlsAnalyzeOpenStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询威胁情报配置的信息</p>
     * 
     * @param request DescribeThreatIntelligenceSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeThreatIntelligenceSwitchResponse
     */
    public DescribeThreatIntelligenceSwitchResponse describeThreatIntelligenceSwitchWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeThreatIntelligenceSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeThreatIntelligenceSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询威胁情报配置的信息</p>
     * @return DescribeThreatIntelligenceSwitchResponse
     */
    public DescribeThreatIntelligenceSwitchResponse describeThreatIntelligenceSwitch() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeThreatIntelligenceSwitchWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the transit routers that are associated with a virtual private cloud (VPC) firewall created for a transit router.</p>
     * 
     * @param tmpReq DescribeTrFirewallPolicyBackUpAssociationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrFirewallPolicyBackUpAssociationListResponse
     */
    public DescribeTrFirewallPolicyBackUpAssociationListResponse describeTrFirewallPolicyBackUpAssociationListWithOptions(DescribeTrFirewallPolicyBackUpAssociationListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest request = new DescribeTrFirewallPolicyBackUpAssociationListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.candidateList)) {
            request.candidateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.candidateList, "CandidateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.candidateListShrink)) {
            query.put("CandidateList", request.candidateListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicyId)) {
            query.put("TrFirewallRoutePolicyId", request.trFirewallRoutePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrFirewallPolicyBackUpAssociationList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrFirewallPolicyBackUpAssociationListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the transit routers that are associated with a virtual private cloud (VPC) firewall created for a transit router.</p>
     * 
     * @param request DescribeTrFirewallPolicyBackUpAssociationListRequest
     * @return DescribeTrFirewallPolicyBackUpAssociationListResponse
     */
    public DescribeTrFirewallPolicyBackUpAssociationListResponse describeTrFirewallPolicyBackUpAssociationList(DescribeTrFirewallPolicyBackUpAssociationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrFirewallPolicyBackUpAssociationListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routing policies of a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request DescribeTrFirewallV2RoutePolicyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrFirewallV2RoutePolicyListResponse
     */
    public DescribeTrFirewallV2RoutePolicyListResponse describeTrFirewallV2RoutePolicyListWithOptions(DescribeTrFirewallV2RoutePolicyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrFirewallV2RoutePolicyList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrFirewallV2RoutePolicyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the routing policies of a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request DescribeTrFirewallV2RoutePolicyListRequest
     * @return DescribeTrFirewallV2RoutePolicyListResponse
     */
    public DescribeTrFirewallV2RoutePolicyListResponse describeTrFirewallV2RoutePolicyList(DescribeTrFirewallV2RoutePolicyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrFirewallV2RoutePolicyListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the virtual private cloud (VPC) firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2DetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrFirewallsV2DetailResponse
     */
    public DescribeTrFirewallsV2DetailResponse describeTrFirewallsV2DetailWithOptions(DescribeTrFirewallsV2DetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrFirewallsV2Detail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrFirewallsV2DetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the virtual private cloud (VPC) firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2DetailRequest
     * @return DescribeTrFirewallsV2DetailResponse
     */
    public DescribeTrFirewallsV2DetailResponse describeTrFirewallsV2Detail(DescribeTrFirewallsV2DetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrFirewallsV2DetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private cloud (VPC) firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2ListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrFirewallsV2ListResponse
     */
    public DescribeTrFirewallsV2ListResponse describeTrFirewallsV2ListWithOptions(DescribeTrFirewallsV2ListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallName)) {
            query.put("FirewallName", request.firewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitchStatus)) {
            query.put("FirewallSwitchStatus", request.firewallSwitchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMode)) {
            query.put("RouteMode", request.routeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrFirewallsV2List"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrFirewallsV2ListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the virtual private cloud (VPC) firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2ListRequest
     * @return DescribeTrFirewallsV2ListResponse
     */
    public DescribeTrFirewallsV2ListResponse describeTrFirewallsV2List(DescribeTrFirewallsV2ListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrFirewallsV2ListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route tables of the VPC firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2RouteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrFirewallsV2RouteListResponse
     */
    public DescribeTrFirewallsV2RouteListResponse describeTrFirewallsV2RouteListWithOptions(DescribeTrFirewallsV2RouteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicyId)) {
            query.put("TrFirewallRoutePolicyId", request.trFirewallRoutePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrFirewallsV2RouteList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrFirewallsV2RouteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route tables of the VPC firewalls that are created for transit routers.</p>
     * 
     * @param request DescribeTrFirewallsV2RouteListRequest
     * @return DescribeTrFirewallsV2RouteListResponse
     */
    public DescribeTrFirewallsV2RouteListResponse describeTrFirewallsV2RouteList(DescribeTrFirewallsV2RouteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrFirewallsV2RouteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志</p>
     * 
     * @param request DescribeTrafficLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTrafficLogResponse
     */
    public DescribeTrafficLogResponse describeTrafficLogWithOptions(DescribeTrafficLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclPreRuleId)) {
            query.put("AclPreRuleId", request.aclPreRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclPreState)) {
            query.put("AclPreState", request.aclPreState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDpiState)) {
            query.put("AppDpiState", request.appDpiState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetRegion)) {
            query.put("AssetRegion", request.assetRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainUrl)) {
            query.put("DomainUrl", request.domainUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPort)) {
            query.put("DstPort", request.dstPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstVpcId)) {
            query.put("DstVpcId", request.dstVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstVpcRegionNo)) {
            query.put("DstVpcRegionNo", request.dstVpcRegionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowType)) {
            query.put("FlowType", request.flowType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natFirewallId)) {
            query.put("NatFirewallId", request.natFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleResult)) {
            query.put("RuleResult", request.ruleResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSource)) {
            query.put("RuleSource", request.ruleSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCode)) {
            query.put("SourceCode", request.sourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPort)) {
            query.put("SrcPort", request.srcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPrivateIP)) {
            query.put("SrcPrivateIP", request.srcPrivateIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcId)) {
            query.put("SrcVpcId", request.srcVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcRegionNo)) {
            query.put("SrcVpcRegionNo", request.srcVpcRegionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsScopeId)) {
            query.put("TlsScopeId", request.tlsScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulLevel)) {
            query.put("VulLevel", request.vulLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrafficLog"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrafficLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询日志</p>
     * 
     * @param request DescribeTrafficLogRequest
     * @return DescribeTrafficLogResponse
     */
    public DescribeTrafficLogResponse describeTrafficLog(DescribeTrafficLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrafficLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取TR交换机资源列表</p>
     * 
     * @param request DescribeTransitRouterResourcesListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransitRouterResourcesListResponse
     */
    public DescribeTransitRouterResourcesListResponse describeTransitRouterResourcesListWithOptions(DescribeTransitRouterResourcesListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransitRouterResourcesList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransitRouterResourcesListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取TR交换机资源列表</p>
     * 
     * @param request DescribeTransitRouterResourcesListRequest
     * @return DescribeTransitRouterResourcesListResponse
     */
    public DescribeTransitRouterResourcesListResponse describeTransitRouterResourcesList(DescribeTransitRouterResourcesListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransitRouterResourcesListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取未保护的端口趋势</p>
     * 
     * @param request DescribeUnprotectedPortTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnprotectedPortTrendResponse
     */
    public DescribeUnprotectedPortTrendResponse describeUnprotectedPortTrendWithOptions(DescribeUnprotectedPortTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUnprotectedPortTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnprotectedPortTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取未保护的端口趋势</p>
     * 
     * @param request DescribeUnprotectedPortTrendRequest
     * @return DescribeUnprotectedPortTrendResponse
     */
    public DescribeUnprotectedPortTrendResponse describeUnprotectedPortTrend(DescribeUnprotectedPortTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnprotectedPortTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取未保护漏洞趋势</p>
     * 
     * @param request DescribeUnprotectedVulnTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnprotectedVulnTrendResponse
     */
    public DescribeUnprotectedVulnTrendResponse describeUnprotectedVulnTrendWithOptions(DescribeUnprotectedVulnTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUnprotectedVulnTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnprotectedVulnTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取未保护漏洞趋势</p>
     * 
     * @param request DescribeUnprotectedVulnTrendRequest
     * @return DescribeUnprotectedVulnTrendResponse
     */
    public DescribeUnprotectedVulnTrendResponse describeUnprotectedVulnTrend(DescribeUnprotectedVulnTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnprotectedVulnTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户告警配置</p>
     * 
     * @param request DescribeUserAlarmConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAlarmConfigResponse
     */
    public DescribeUserAlarmConfigResponse describeUserAlarmConfigWithOptions(DescribeUserAlarmConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAlarmConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAlarmConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户告警配置</p>
     * 
     * @param request DescribeUserAlarmConfigRequest
     * @return DescribeUserAlarmConfigResponse
     */
    public DescribeUserAlarmConfigResponse describeUserAlarmConfig(DescribeUserAlarmConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAlarmConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the traffic of a specified asset that belongs to your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI DescribeUserAssetIPTrafficInfo is deprecated
     * 
     * @param request DescribeUserAssetIPTrafficInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserAssetIPTrafficInfoResponse
     */
    @Deprecated
    // Deprecated
    public DescribeUserAssetIPTrafficInfoResponse describeUserAssetIPTrafficInfoWithOptions(DescribeUserAssetIPTrafficInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserAssetIPTrafficInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserAssetIPTrafficInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the traffic of a specified asset that belongs to your Alibaba Cloud account.</p>
     * 
     * @deprecated OpenAPI DescribeUserAssetIPTrafficInfo is deprecated
     * 
     * @param request DescribeUserAssetIPTrafficInfoRequest
     * @return DescribeUserAssetIPTrafficInfoResponse
     */
    @Deprecated
    // Deprecated
    public DescribeUserAssetIPTrafficInfoResponse describeUserAssetIPTrafficInfo(DescribeUserAssetIPTrafficInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserAssetIPTrafficInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the edition information about Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the edition information about Cloud Firewall.</p>
     * 
     * @param request DescribeUserBuyVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserBuyVersionResponse
     */
    public DescribeUserBuyVersionResponse describeUserBuyVersionWithOptions(DescribeUserBuyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBuyVersion"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBuyVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the edition information about Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the edition information about Cloud Firewall.</p>
     * 
     * @param request DescribeUserBuyVersionRequest
     * @return DescribeUserBuyVersionResponse
     */
    public DescribeUserBuyVersionResponse describeUserBuyVersion(DescribeUserBuyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBuyVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户IPS白名单</p>
     * 
     * @param request DescribeUserIPSWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserIPSWhitelistResponse
     */
    public DescribeUserIPSWhitelistResponse describeUserIPSWhitelistWithOptions(DescribeUserIPSWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserIPSWhitelist"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserIPSWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户IPS白名单</p>
     * 
     * @param request DescribeUserIPSWhitelistRequest
     * @return DescribeUserIPSWhitelistResponse
     */
    public DescribeUserIPSWhitelistResponse describeUserIPSWhitelist(DescribeUserIPSWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserIPSWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>VPC防火墙IP配置列表</p>
     * 
     * @param request DescribeVfwIPSConfigListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVfwIPSConfigListResponse
     */
    public DescribeVfwIPSConfigListResponse describeVfwIPSConfigListWithOptions(DescribeVfwIPSConfigListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVfwIPSConfigList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVfwIPSConfigListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>VPC防火墙IP配置列表</p>
     * 
     * @param request DescribeVfwIPSConfigListRequest
     * @return DescribeVfwIPSConfigListResponse
     */
    public DescribeVfwIPSConfigListResponse describeVfwIPSConfigList(DescribeVfwIPSConfigListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVfwIPSConfigListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙通过详情</p>
     * 
     * @param request DescribeVpcFirewallAccessDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallAccessDetailResponse
     */
    public DescribeVpcFirewallAccessDetailResponse describeVpcFirewallAccessDetailWithOptions(DescribeVpcFirewallAccessDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetIP)) {
            query.put("AssetIP", request.assetIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPProtocol)) {
            query.put("IPProtocol", request.IPProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerAssetIP)) {
            query.put("PeerAssetIP", request.peerAssetIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerAssetInstanceId)) {
            query.put("PeerAssetInstanceId", request.peerAssetInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerAssetInstanceName)) {
            query.put("PeerAssetInstanceName", request.peerAssetInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcId)) {
            query.put("PeerVpcId", request.peerVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallAccessDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallAccessDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙通过详情</p>
     * 
     * @param request DescribeVpcFirewallAccessDetailRequest
     * @return DescribeVpcFirewallAccessDetailResponse
     */
    public DescribeVpcFirewallAccessDetailResponse describeVpcFirewallAccessDetail(DescribeVpcFirewallAccessDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallAccessDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallAclGroupList operation to query the information about all policy groups of access control policies that are created for VPC firewalls.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all policy groups of access control policies that are created for virtual private cloud (VPC) firewalls.</p>
     * 
     * @param request DescribeVpcFirewallAclGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallAclGroupListResponse
     */
    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupListWithOptions(DescribeVpcFirewallAclGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallConfigureStatus)) {
            query.put("FirewallConfigureStatus", request.firewallConfigureStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallAclGroupList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallAclGroupListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallAclGroupList operation to query the information about all policy groups of access control policies that are created for VPC firewalls.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about all policy groups of access control policies that are created for virtual private cloud (VPC) firewalls.</p>
     * 
     * @param request DescribeVpcFirewallAclGroupListRequest
     * @return DescribeVpcFirewallAclGroupListResponse
     */
    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallAclGroupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙资产列表</p>
     * 
     * @param request DescribeVpcFirewallAssetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallAssetListResponse
     */
    public DescribeVpcFirewallAssetListResponse describeVpcFirewallAssetListWithOptions(DescribeVpcFirewallAssetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetIP)) {
            query.put("AssetIP", request.assetIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceName)) {
            query.put("EcsInstanceName", request.ecsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPProtocol)) {
            query.put("IPProtocol", request.IPProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAITraffic)) {
            query.put("IsAITraffic", request.isAITraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcId)) {
            query.put("PeerVpcId", request.peerVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallAssetList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallAssetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙资产列表</p>
     * 
     * @param request DescribeVpcFirewallAssetListRequest
     * @return DescribeVpcFirewallAssetListResponse
     */
    public DescribeVpcFirewallAssetListResponse describeVpcFirewallAssetList(DescribeVpcFirewallAssetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallAssetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC防火墙资产地域</p>
     * 
     * @param request DescribeVpcFirewallAssetRegionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallAssetRegionListResponse
     */
    public DescribeVpcFirewallAssetRegionListResponse describeVpcFirewallAssetRegionListWithOptions(DescribeVpcFirewallAssetRegionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallAssetRegionList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallAssetRegionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC防火墙资产地域</p>
     * 
     * @param request DescribeVpcFirewallAssetRegionListRequest
     * @return DescribeVpcFirewallAssetRegionListResponse
     */
    public DescribeVpcFirewallAssetRegionListResponse describeVpcFirewallAssetRegionList(DescribeVpcFirewallAssetRegionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallAssetRegionListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenDetail operation to query the details about a VPC firewall. The VPC firewall protects access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a virtual private cloud (VPC) firewall. The VPC firewall protects access traffic between a VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeVpcFirewallCenDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallCenDetailResponse
     */
    public DescribeVpcFirewallCenDetailResponse describeVpcFirewallCenDetailWithOptions(DescribeVpcFirewallCenDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceId)) {
            query.put("NetworkInstanceId", request.networkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallCenDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallCenDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenDetail operation to query the details about a VPC firewall. The VPC firewall protects access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a virtual private cloud (VPC) firewall. The VPC firewall protects access traffic between a VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeVpcFirewallCenDetailRequest
     * @return DescribeVpcFirewallCenDetailResponse
     */
    public DescribeVpcFirewallCenDetailResponse describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallCenDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenList operation to query VPC firewalls. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual private cloud (VPC) firewalls. Each VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeVpcFirewallCenListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallCenListResponse
     */
    public DescribeVpcFirewallCenListResponse describeVpcFirewallCenListWithOptions(DescribeVpcFirewallCenListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitchStatus)) {
            query.put("FirewallSwitchStatus", request.firewallSwitchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceId)) {
            query.put("NetworkInstanceId", request.networkInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMode)) {
            query.put("RouteMode", request.routeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterType)) {
            query.put("TransitRouterType", request.transitRouterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallCenList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallCenListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallCenList operation to query VPC firewalls. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries virtual private cloud (VPC) firewalls. Each VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request DescribeVpcFirewallCenListRequest
     * @return DescribeVpcFirewallCenListResponse
     */
    public DescribeVpcFirewallCenListResponse describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallCenListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC的CEN列表</p>
     * 
     * @param request DescribeVpcFirewallCenSummaryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallCenSummaryListResponse
     */
    public DescribeVpcFirewallCenSummaryListResponse describeVpcFirewallCenSummaryListWithOptions(DescribeVpcFirewallCenSummaryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterType)) {
            query.put("TransitRouterType", request.transitRouterType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallCenSummaryList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallCenSummaryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC的CEN列表</p>
     * 
     * @param request DescribeVpcFirewallCenSummaryListRequest
     * @return DescribeVpcFirewallCenSummaryListResponse
     */
    public DescribeVpcFirewallCenSummaryListResponse describeVpcFirewallCenSummaryList(DescribeVpcFirewallCenSummaryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallCenSummaryListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallControlPolicy operation to query the information about all access control policies that are created for a specified VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the access control policies for a specified virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallControlPolicyResponse
     */
    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicyWithOptions(DescribeVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallControlPolicy operation to query the information about all access control policies that are created for a specified VPC firewall. Different access control policies are used when a VPC firewall is used to protect traffic between two VPCs that are connected by using a Cloud Enterprise Network (CEN) instance or an Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the access control policies for a specified virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallControlPolicyRequest
     * @return DescribeVpcFirewallControlPolicyResponse
     */
    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDefaultIPSConfig operation to query the intrusion prevention configurations of a VPC firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the intrusion prevention configurations of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallDefaultIPSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallDefaultIPSConfigResponse
     */
    public DescribeVpcFirewallDefaultIPSConfigResponse describeVpcFirewallDefaultIPSConfigWithOptions(DescribeVpcFirewallDefaultIPSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDefaultIPSConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDefaultIPSConfig operation to query the intrusion prevention configurations of a VPC firewall.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the intrusion prevention configurations of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallDefaultIPSConfigRequest
     * @return DescribeVpcFirewallDefaultIPSConfigResponse
     */
    public DescribeVpcFirewallDefaultIPSConfigResponse describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallDefaultIPSConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDetail operation to query the details about a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.<br>Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallconfigure">CreateVpcFirewallConfigure</a> operation.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a virtual private cloud (VPC) firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request DescribeVpcFirewallDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallDetailResponse
     */
    public DescribeVpcFirewallDetailResponse describeVpcFirewallDetailWithOptions(DescribeVpcFirewallDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVpcId)) {
            query.put("LocalVpcId", request.localVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcId)) {
            query.put("PeerVpcId", request.peerVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallDetail operation to query the details about a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.<br>Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://www.alibabacloud.com/help/en/cloud-firewall/latest/createvpcfirewallconfigure">CreateVpcFirewallConfigure</a> operation.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about a virtual private cloud (VPC) firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request DescribeVpcFirewallDetailRequest
     * @return DescribeVpcFirewallDetailResponse
     */
    public DescribeVpcFirewallDetailResponse describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的域名信息</p>
     * 
     * @param request DescribeVpcFirewallDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallDomainListResponse
     */
    public DescribeVpcFirewallDomainListResponse describeVpcFirewallDomainListWithOptions(DescribeVpcFirewallDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAITraffic)) {
            query.put("IsAITraffic", request.isAITraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcId)) {
            query.put("SrcVpcId", request.srcVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDomainList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDomainListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的域名信息</p>
     * 
     * @param request DescribeVpcFirewallDomainListRequest
     * @return DescribeVpcFirewallDomainListResponse
     */
    public DescribeVpcFirewallDomainListResponse describeVpcFirewallDomainList(DescribeVpcFirewallDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的域名信息</p>
     * 
     * @param request DescribeVpcFirewallDomainRelationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallDomainRelationListResponse
     */
    public DescribeVpcFirewallDomainRelationListResponse describeVpcFirewallDomainRelationListWithOptions(DescribeVpcFirewallDomainRelationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainList)) {
            query.put("DomainList", request.domainList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstIP)) {
            query.put("DstIP", request.dstIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstVpcId)) {
            query.put("DstVpcId", request.dstVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIP)) {
            query.put("SrcIP", request.srcIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcVpcId)) {
            query.put("SrcVpcId", request.srcVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDomainRelationList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDomainRelationListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的域名信息</p>
     * 
     * @param request DescribeVpcFirewallDomainRelationListRequest
     * @return DescribeVpcFirewallDomainRelationListResponse
     */
    public DescribeVpcFirewallDomainRelationListResponse describeVpcFirewallDomainRelationList(DescribeVpcFirewallDomainRelationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallDomainRelationListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-vpc防火墙拦截趋势</p>
     * 
     * @param request DescribeVpcFirewallDropTrafficTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallDropTrafficTrendResponse
     */
    public DescribeVpcFirewallDropTrafficTrendResponse describeVpcFirewallDropTrafficTrendWithOptions(DescribeVpcFirewallDropTrafficTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDropTrafficTrend"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDropTrafficTrendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>概览页-vpc防火墙拦截趋势</p>
     * 
     * @param request DescribeVpcFirewallDropTrafficTrendRequest
     * @return DescribeVpcFirewallDropTrafficTrendResponse
     */
    public DescribeVpcFirewallDropTrafficTrendResponse describeVpcFirewallDropTrafficTrend(DescribeVpcFirewallDropTrafficTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallDropTrafficTrendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IPS whitelist of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallIPSWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallIPSWhitelistResponse
     */
    public DescribeVpcFirewallIPSWhitelistResponse describeVpcFirewallIPSWhitelistWithOptions(DescribeVpcFirewallIPSWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallIPSWhitelist"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallIPSWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IPS whitelist of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request DescribeVpcFirewallIPSWhitelistRequest
     * @return DescribeVpcFirewallIPSWhitelistResponse
     */
    public DescribeVpcFirewallIPSWhitelistResponse describeVpcFirewallIPSWhitelist(DescribeVpcFirewallIPSWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallIPSWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about virtual private cloud (VPC) firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request DescribeVpcFirewallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallListResponse
     */
    public DescribeVpcFirewallListResponse describeVpcFirewallListWithOptions(DescribeVpcFirewallListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectSubType)) {
            query.put("ConnectSubType", request.connectSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitchStatus)) {
            query.put("FirewallSwitchStatus", request.firewallSwitchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerUid)) {
            query.put("PeerUid", request.peerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the DescribeVpcFirewallList operation to query the details about VPC firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details about virtual private cloud (VPC) firewalls by page. Each VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request DescribeVpcFirewallListRequest
     * @return DescribeVpcFirewallListResponse
     */
    public DescribeVpcFirewallListResponse describeVpcFirewallList(DescribeVpcFirewallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙手动交换机列表</p>
     * 
     * @param request DescribeVpcFirewallManualVSwitchListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallManualVSwitchListResponse
     */
    public DescribeVpcFirewallManualVSwitchListResponse describeVpcFirewallManualVSwitchListWithOptions(DescribeVpcFirewallManualVSwitchListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallManualVSwitchList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallManualVSwitchListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取防火墙手动交换机列表</p>
     * 
     * @param request DescribeVpcFirewallManualVSwitchListRequest
     * @return DescribeVpcFirewallManualVSwitchListResponse
     */
    public DescribeVpcFirewallManualVSwitchListResponse describeVpcFirewallManualVSwitchList(DescribeVpcFirewallManualVSwitchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallManualVSwitchListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of access control policies that are created for a VPC firewall in a specific policy group.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies that are created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request DescribeVpcFirewallPolicyPriorUsedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallPolicyPriorUsedResponse
     */
    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsedWithOptions(DescribeVpcFirewallPolicyPriorUsedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallPolicyPriorUsed"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallPolicyPriorUsedResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the priority range of access control policies that are created for a VPC firewall in a specific policy group.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the priority range of access control policies that are created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request DescribeVpcFirewallPolicyPriorUsedRequest
     * @return DescribeVpcFirewallPolicyPriorUsedResponse
     */
    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallPolicyPriorUsedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙预检查详情</p>
     * 
     * @param request DescribeVpcFirewallPrecheckDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallPrecheckDetailResponse
     */
    public DescribeVpcFirewallPrecheckDetailResponse describeVpcFirewallPrecheckDetailWithOptions(DescribeVpcFirewallPrecheckDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInstanceType)) {
            query.put("NetworkInstanceType", request.networkInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallPrecheckDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallPrecheckDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙预检查详情</p>
     * 
     * @param request DescribeVpcFirewallPrecheckDetailRequest
     * @return DescribeVpcFirewallPrecheckDetailResponse
     */
    public DescribeVpcFirewallPrecheckDetailResponse describeVpcFirewallPrecheckDetail(DescribeVpcFirewallPrecheckDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallPrecheckDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙总结信息</p>
     * 
     * @param request DescribeVpcFirewallSummaryInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallSummaryInfoResponse
     */
    public DescribeVpcFirewallSummaryInfoResponse describeVpcFirewallSummaryInfoWithOptions(DescribeVpcFirewallSummaryInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallSummaryInfo"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallSummaryInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取VPC防火墙总结信息</p>
     * 
     * @param request DescribeVpcFirewallSummaryInfoRequest
     * @return DescribeVpcFirewallSummaryInfoResponse
     */
    public DescribeVpcFirewallSummaryInfoResponse describeVpcFirewallSummaryInfo(DescribeVpcFirewallSummaryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallSummaryInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的资产信息</p>
     * 
     * @param request DescribeVpcFirewallTrafficAssetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallTrafficAssetListResponse
     */
    public DescribeVpcFirewallTrafficAssetListResponse describeVpcFirewallTrafficAssetListWithOptions(DescribeVpcFirewallTrafficAssetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            query.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAITraffic)) {
            query.put("IsAITraffic", request.isAITraffic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallTrafficAssetList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallTrafficAssetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC互访的资产信息</p>
     * 
     * @param request DescribeVpcFirewallTrafficAssetListRequest
     * @return DescribeVpcFirewallTrafficAssetListResponse
     */
    public DescribeVpcFirewallTrafficAssetListResponse describeVpcFirewallTrafficAssetList(DescribeVpcFirewallTrafficAssetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallTrafficAssetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC防火墙资源可用区</p>
     * 
     * @param request DescribeVpcFirewallZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcFirewallZoneResponse
     */
    public DescribeVpcFirewallZoneResponse describeVpcFirewallZoneWithOptions(DescribeVpcFirewallZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transitRouterId)) {
            query.put("TransitRouterId", request.transitRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallZone"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询VPC防火墙资源可用区</p>
     * 
     * @param request DescribeVpcFirewallZoneRequest
     * @return DescribeVpcFirewallZoneResponse
     */
    public DescribeVpcFirewallZoneResponse describeVpcFirewallZone(DescribeVpcFirewallZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcFirewallZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virtual private clouds (VPCs).</p>
     * 
     * @param request DescribeVpcListLiteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcListLiteResponse
     */
    public DescribeVpcListLiteResponse describeVpcListLiteWithOptions(DescribeVpcListLiteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcName)) {
            query.put("VpcName", request.vpcName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcListLite"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcListLiteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virtual private clouds (VPCs).</p>
     * 
     * @param request DescribeVpcListLiteRequest
     * @return DescribeVpcListLiteResponse
     */
    public DescribeVpcListLiteResponse describeVpcListLite(DescribeVpcListLiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcListLiteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virtual private cloud (VPC) zones.</p>
     * 
     * @param request DescribeVpcZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVpcZoneResponse
     */
    public DescribeVpcZoneResponse describeVpcZoneWithOptions(DescribeVpcZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            query.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcZone"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries virtual private cloud (VPC) zones.</p>
     * 
     * @param request DescribeVpcZoneRequest
     * @return DescribeVpcZoneResponse
     */
    public DescribeVpcZoneResponse describeVpcZone(DescribeVpcZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVpcZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the vulnerabilities that are supported by Cloud Firewall.</p>
     * 
     * @param request DescribeVulnerabilityProtectedListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVulnerabilityProtectedListResponse
     */
    public DescribeVulnerabilityProtectedListResponse describeVulnerabilityProtectedListWithOptions(DescribeVulnerabilityProtectedListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackType)) {
            query.put("AttackType", request.attackType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyVersion)) {
            query.put("BuyVersion", request.buyVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTag)) {
            query.put("RuleTag", request.ruleTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            query.put("SortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulnCveName)) {
            query.put("VulnCveName", request.vulnCveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulnLevel)) {
            query.put("VulnLevel", request.vulnLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulnResource)) {
            query.put("VulnResource", request.vulnResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulnStatus)) {
            query.put("VulnStatus", request.vulnStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vulnType)) {
            query.put("VulnType", request.vulnType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVulnerabilityProtectedList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVulnerabilityProtectedListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the vulnerabilities that are supported by Cloud Firewall.</p>
     * 
     * @param request DescribeVulnerabilityProtectedListRequest
     * @return DescribeVulnerabilityProtectedListResponse
     */
    public DescribeVulnerabilityProtectedListResponse describeVulnerabilityProtectedList(DescribeVulnerabilityProtectedListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVulnerabilityProtectedListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭资产数据泄漏保护</p>
     * 
     * @param request DisableSdlProtectedAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSdlProtectedAssetResponse
     */
    public DisableSdlProtectedAssetResponse disableSdlProtectedAssetWithOptions(DisableSdlProtectedAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSdlProtectedAsset"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSdlProtectedAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭资产数据泄漏保护</p>
     * 
     * @param request DisableSdlProtectedAssetRequest
     * @return DisableSdlProtectedAssetResponse
     */
    public DisableSdlProtectedAssetResponse disableSdlProtectedAsset(DisableSdlProtectedAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSdlProtectedAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启资产数据泄露保护</p>
     * 
     * @param request EnableSdlProtectedAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSdlProtectedAssetResponse
     */
    public EnableSdlProtectedAssetResponse enableSdlProtectedAssetWithOptions(EnableSdlProtectedAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipList)) {
            query.put("IpList", request.ipList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSdlProtectedAsset"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSdlProtectedAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启资产数据泄露保护</p>
     * 
     * @param request EnableSdlProtectedAssetRequest
     * @return EnableSdlProtectedAssetResponse
     */
    public EnableSdlProtectedAssetResponse enableSdlProtectedAsset(EnableSdlProtectedAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSdlProtectedAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载TLS证书</p>
     * 
     * @param request GetTlsInspectCertificateDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTlsInspectCertificateDownloadUrlResponse
     */
    public GetTlsInspectCertificateDownloadUrlResponse getTlsInspectCertificateDownloadUrlWithOptions(GetTlsInspectCertificateDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertId)) {
            query.put("CaCertId", request.caCertId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTlsInspectCertificateDownloadUrl"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTlsInspectCertificateDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下载TLS证书</p>
     * 
     * @param request GetTlsInspectCertificateDownloadUrlRequest
     * @return GetTlsInspectCertificateDownloadUrlResponse
     */
    public GetTlsInspectCertificateDownloadUrlResponse getTlsInspectCertificateDownloadUrl(GetTlsInspectCertificateDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTlsInspectCertificateDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询TLS检查证书</p>
     * 
     * @param request ListTlsInspectCACertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTlsInspectCACertificatesResponse
     */
    public ListTlsInspectCACertificatesResponse listTlsInspectCACertificatesWithOptions(ListTlsInspectCACertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caCertId)) {
            query.put("CaCertId", request.caCertId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTlsInspectCACertificates"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTlsInspectCACertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询TLS检查证书</p>
     * 
     * @param request ListTlsInspectCACertificatesRequest
     * @return ListTlsInspectCACertificatesResponse
     */
    public ListTlsInspectCACertificatesResponse listTlsInspectCACertificates(ListTlsInspectCACertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTlsInspectCACertificatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyAddressBook operation to modify the address book that is configured for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the address book that is specified in an access control policy.</p>
     * 
     * @param request ModifyAddressBookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAddressBookResponse
     */
    public ModifyAddressBookResponse modifyAddressBookWithOptions(ModifyAddressBookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ackLabels)) {
            query.put("AckLabels", request.ackLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ackNamespaces)) {
            query.put("AckNamespaces", request.ackNamespaces);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressList)) {
            query.put("AddressList", request.addressList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoAddTagEcs)) {
            query.put("AutoAddTagEcs", request.autoAddTagEcs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUuid)) {
            query.put("GroupUuid", request.groupUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("TagList", request.tagList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRelation)) {
            query.put("TagRelation", request.tagRelation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAddressBookResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyAddressBook operation to modify the address book that is configured for access control.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the address book that is specified in an access control policy.</p>
     * 
     * @param request ModifyAddressBookRequest
     * @return ModifyAddressBookResponse
     */
    public ModifyAddressBookResponse modifyAddressBook(ModifyAddressBookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAddressBookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户版本信息</p>
     * 
     * @param request ModifyCfwInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCfwInstanceResponse
     */
    public ModifyCfwInstanceResponse modifyCfwInstanceWithOptions(ModifyCfwInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateList)) {
            query.put("UpdateList", request.updateList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCfwInstance"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCfwInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新用户版本信息</p>
     * 
     * @param request ModifyCfwInstanceRequest
     * @return ModifyCfwInstanceResponse
     */
    public ModifyCfwInstanceResponse modifyCfwInstance(ModifyCfwInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCfwInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an access control policy. The policy allows Cloud Firewall to allow, deny, or monitor the traffic that passes through Cloud Firewall.</p>
     * <h2><a href="#qps"></a>Limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy.</p>
     * 
     * @param request ModifyControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyControlPolicyResponse
     */
    public ModifyControlPolicyResponse modifyControlPolicyWithOptions(ModifyControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the configurations of an access control policy. The policy allows Cloud Firewall to allow, deny, or monitor the traffic that passes through Cloud Firewall.</p>
     * <h2><a href="#qps"></a>Limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy.</p>
     * 
     * @param request ModifyControlPolicyRequest
     * @return ModifyControlPolicyResponse
     */
    public ModifyControlPolicyResponse modifyControlPolicy(ModifyControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the priority of an IPv4 access control policy for the Internet firewall. An IPv4 access control policy refers to a policy whose source IP address and destination IP address are IPv4 addresses.</p>
     * 
     * @deprecated OpenAPI ModifyControlPolicyPosition is deprecated, please use Cloudfw::2017-12-07::ModifyControlPolicyPriority instead.
     * 
     * @param request ModifyControlPolicyPositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyControlPolicyPositionResponse
     */
    @Deprecated
    // Deprecated
    public ModifyControlPolicyPositionResponse modifyControlPolicyPositionWithOptions(ModifyControlPolicyPositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldOrder)) {
            query.put("OldOrder", request.oldOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlPolicyPosition"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlPolicyPositionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an IPv4 access control policy for the Internet firewall. No API operations are provided for you to modify the priority of an IPv6 access control policy for the Internet firewall.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the priority of an IPv4 access control policy for the Internet firewall. An IPv4 access control policy refers to a policy whose source IP address and destination IP address are IPv4 addresses.</p>
     * 
     * @deprecated OpenAPI ModifyControlPolicyPosition is deprecated, please use Cloudfw::2017-12-07::ModifyControlPolicyPriority instead.
     * 
     * @param request ModifyControlPolicyPositionRequest
     * @return ModifyControlPolicyPositionResponse
     */
    @Deprecated
    // Deprecated
    public ModifyControlPolicyPositionResponse modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyControlPolicyPositionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy.</p>
     * 
     * @param request ModifyControlPolicyPriorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyControlPolicyPriorityResponse
     */
    public ModifyControlPolicyPriorityResponse modifyControlPolicyPriorityWithOptions(ModifyControlPolicyPriorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlPolicyPriority"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlPolicyPriorityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy.</p>
     * 
     * @param request ModifyControlPolicyPriorityRequest
     * @return ModifyControlPolicyPriorityResponse
     */
    public ModifyControlPolicyPriorityResponse modifyControlPolicyPriority(ModifyControlPolicyPriorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyControlPolicyPriorityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the default configuration of the intrusion prevention system (IPS).</p>
     * 
     * @param request ModifyDefaultIPSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefaultIPSConfigResponse
     */
    public ModifyDefaultIPSConfigResponse modifyDefaultIPSConfigWithOptions(ModifyDefaultIPSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basicRules)) {
            query.put("BasicRules", request.basicRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ctiRules)) {
            query.put("CtiRules", request.ctiRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSdl)) {
            query.put("MaxSdl", request.maxSdl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchRules)) {
            query.put("PatchRules", request.patchRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleClass)) {
            query.put("RuleClass", request.ruleClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            query.put("RunMode", request.runMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefaultIPSConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the default configuration of the intrusion prevention system (IPS).</p>
     * 
     * @param request ModifyDefaultIPSConfigRequest
     * @return ModifyDefaultIPSConfigResponse
     */
    public ModifyDefaultIPSConfigResponse modifyDefaultIPSConfig(ModifyDefaultIPSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefaultIPSConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改DNS防火墙规则</p>
     * 
     * @param request ModifyDnsFirewallPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDnsFirewallPolicyResponse
     */
    public ModifyDnsFirewallPolicyResponse modifyDnsFirewallPolicyWithOptions(ModifyDnsFirewallPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDnsFirewallPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDnsFirewallPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改DNS防火墙规则</p>
     * 
     * @param request ModifyDnsFirewallPolicyRequest
     * @return ModifyDnsFirewallPolicyResponse
     */
    public ModifyDnsFirewallPolicyResponse modifyDnsFirewallPolicy(ModifyDnsFirewallPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDnsFirewallPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of a routing policy.</p>
     * 
     * @param request ModifyFirewallV2RoutePolicySwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFirewallV2RoutePolicySwitchResponse
     */
    public ModifyFirewallV2RoutePolicySwitchResponse modifyFirewallV2RoutePolicySwitchWithOptions(ModifyFirewallV2RoutePolicySwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldRecover)) {
            query.put("ShouldRecover", request.shouldRecover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicyId)) {
            query.put("TrFirewallRoutePolicyId", request.trFirewallRoutePolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicySwitchStatus)) {
            query.put("TrFirewallRoutePolicySwitchStatus", request.trFirewallRoutePolicySwitchStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFirewallV2RoutePolicySwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFirewallV2RoutePolicySwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of a routing policy.</p>
     * 
     * @param request ModifyFirewallV2RoutePolicySwitchRequest
     * @return ModifyFirewallV2RoutePolicySwitchResponse
     */
    public ModifyFirewallV2RoutePolicySwitchResponse modifyFirewallV2RoutePolicySwitch(ModifyFirewallV2RoutePolicySwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFirewallV2RoutePolicySwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyInstanceMemberAttributes operation to update the information about members in Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second for each account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about members in Cloud Firewall.</p>
     * 
     * @param request ModifyInstanceMemberAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceMemberAttributesResponse
     */
    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributesWithOptions(ModifyInstanceMemberAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceMemberAttributes"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceMemberAttributesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyInstanceMemberAttributes operation to update the information about members in Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second for each account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about members in Cloud Firewall.</p>
     * 
     * @param request ModifyInstanceMemberAttributesRequest
     * @return ModifyInstanceMemberAttributesResponse
     */
    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceMemberAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改IPS规则</p>
     * 
     * @param request ModifyIpsRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIpsRulesResponse
     */
    public ModifyIpsRulesResponse modifyIpsRulesWithOptions(ModifyIpsRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAction)) {
            query.put("RuleAction", request.ruleAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpsRules"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpsRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改IPS规则</p>
     * 
     * @param request ModifyIpsRulesRequest
     * @return ModifyIpsRulesResponse
     */
    public ModifyIpsRulesResponse modifyIpsRules(ModifyIpsRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpsRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改IPS规则为默认</p>
     * 
     * @param request ModifyIpsRulesToDefaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyIpsRulesToDefaultResponse
     */
    public ModifyIpsRulesToDefaultResponse modifyIpsRulesToDefaultWithOptions(ModifyIpsRulesToDefaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attackApp)) {
            query.put("AttackApp", request.attackApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallType)) {
            query.put("FirewallType", request.firewallType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyIpsRulesToDefault"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyIpsRulesToDefaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改IPS规则为默认</p>
     * 
     * @param request ModifyIpsRulesToDefaultRequest
     * @return ModifyIpsRulesToDefaultResponse
     */
    public ModifyIpsRulesToDefaultResponse modifyIpsRulesToDefault(ModifyIpsRulesToDefaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyIpsRulesToDefaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the configurations of an access control policy. The policy is used to allow, deny, or monitor traffic that reaches a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request ModifyNatFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNatFirewallControlPolicyResponse
     */
    public ModifyNatFirewallControlPolicyResponse modifyNatFirewallControlPolicyWithOptions(ModifyNatFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNatFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNatFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the configurations of an access control policy. The policy is used to allow, deny, or monitor traffic that reaches a NAT firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request ModifyNatFirewallControlPolicyRequest
     * @return ModifyNatFirewallControlPolicyResponse
     */
    public ModifyNatFirewallControlPolicyResponse modifyNatFirewallControlPolicy(ModifyNatFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNatFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request ModifyNatFirewallControlPolicyPositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNatFirewallControlPolicyPositionResponse
     */
    public ModifyNatFirewallControlPolicyPositionResponse modifyNatFirewallControlPolicyPositionWithOptions(ModifyNatFirewallControlPolicyPositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNatFirewallControlPolicyPosition"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNatFirewallControlPolicyPositionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy that is created for a NAT firewall.</p>
     * 
     * @param request ModifyNatFirewallControlPolicyPositionRequest
     * @return ModifyNatFirewallControlPolicyPositionResponse
     */
    public ModifyNatFirewallControlPolicyPositionResponse modifyNatFirewallControlPolicyPosition(ModifyNatFirewallControlPolicyPositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNatFirewallControlPolicyPositionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about an operation on an object group.</p>
     * 
     * @param request ModifyObjectGroupOperationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyObjectGroupOperationResponse
     */
    public ModifyObjectGroupOperationResponse modifyObjectGroupOperationWithOptions(ModifyObjectGroupOperationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectList)) {
            query.put("ObjectList", request.objectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectOperation)) {
            query.put("ObjectOperation", request.objectOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyObjectGroupOperation"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyObjectGroupOperationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about an operation on an object group.</p>
     * 
     * @param request ModifyObjectGroupOperationRequest
     * @return ModifyObjectGroupOperationResponse
     */
    public ModifyObjectGroupOperationResponse modifyObjectGroupOperation(ModifyObjectGroupOperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyObjectGroupOperationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyPolicyAdvancedConfig operation to enable or disable the strict mode for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the strict mode for an access control policy.</p>
     * 
     * @param request ModifyPolicyAdvancedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPolicyAdvancedConfigResponse
     */
    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfigWithOptions(ModifyPolicyAdvancedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eips)) {
            query.put("Eips", request.eips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSwitch)) {
            query.put("InternetSwitch", request.internetSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyAdvancedConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyAdvancedConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyPolicyAdvancedConfig operation to enable or disable the strict mode for an access control policy.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the strict mode for an access control policy.</p>
     * 
     * @param request ModifyPolicyAdvancedConfigRequest
     * @return ModifyPolicyAdvancedConfigResponse
     */
    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolicyAdvancedConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改私网DNS终端节点</p>
     * 
     * @param request ModifyPrivateDnsEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrivateDnsEndpointResponse
     */
    public ModifyPrivateDnsEndpointResponse modifyPrivateDnsEndpointWithOptions(ModifyPrivateDnsEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceId)) {
            query.put("AccessInstanceId", request.accessInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessInstanceName)) {
            query.put("AccessInstanceName", request.accessInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryDns)) {
            query.put("PrimaryDns", request.primaryDns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateDnsType)) {
            query.put("PrivateDnsType", request.privateDnsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyDns)) {
            query.put("StandbyDns", request.standbyDns);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrivateDnsEndpoint"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrivateDnsEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改私网DNS终端节点</p>
     * 
     * @param request ModifyPrivateDnsEndpointRequest
     * @return ModifyPrivateDnsEndpointResponse
     */
    public ModifyPrivateDnsEndpointResponse modifyPrivateDnsEndpoint(ModifyPrivateDnsEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrivateDnsEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启资产类型默认引流</p>
     * 
     * @param request ModifyResourceTypeAutoEnableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyResourceTypeAutoEnableResponse
     */
    public ModifyResourceTypeAutoEnableResponse modifyResourceTypeAutoEnableWithOptions(ModifyResourceTypeAutoEnableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeAutoEnable)) {
            query.put("ResourceTypeAutoEnable", request.resourceTypeAutoEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyResourceTypeAutoEnable"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyResourceTypeAutoEnableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启资产类型默认引流</p>
     * 
     * @param request ModifyResourceTypeAutoEnableRequest
     * @return ModifyResourceTypeAutoEnableResponse
     */
    public ModifyResourceTypeAutoEnableResponse modifyResourceTypeAutoEnable(ModifyResourceTypeAutoEnableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyResourceTypeAutoEnableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改敏感数据开关</p>
     * 
     * @param request ModifySensitiveSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySensitiveSwitchResponse
     */
    public ModifySensitiveSwitchResponse modifySensitiveSwitchWithOptions(ModifySensitiveSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveCategory)) {
            query.put("SensitiveCategory", request.sensitiveCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchStatus)) {
            query.put("SwitchStatus", request.switchStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySensitiveSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySensitiveSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改敏感数据开关</p>
     * 
     * @param request ModifySensitiveSwitchRequest
     * @return ModifySensitiveSwitchResponse
     */
    public ModifySensitiveSwitchResponse modifySensitiveSwitch(ModifySensitiveSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySensitiveSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改SLS投递</p>
     * 
     * @param request ModifySlsDispatchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySlsDispatchStatusResponse
     */
    public ModifySlsDispatchStatusResponse modifySlsDispatchStatusWithOptions(ModifySlsDispatchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dispatchValue)) {
            query.put("DispatchValue", request.dispatchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterKeys)) {
            query.put("FilterKeys", request.filterKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRegionId)) {
            query.put("NewRegionId", request.newRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySlsDispatchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySlsDispatchStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改SLS投递</p>
     * 
     * @param request ModifySlsDispatchStatusRequest
     * @return ModifySlsDispatchStatusResponse
     */
    public ModifySlsDispatchStatusResponse modifySlsDispatchStatus(ModifySlsDispatchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySlsDispatchStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改威胁情报配置的信息</p>
     * 
     * @param request ModifyThreatIntelligenceSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyThreatIntelligenceSwitchResponse
     */
    public ModifyThreatIntelligenceSwitchResponse modifyThreatIntelligenceSwitchWithOptions(ModifyThreatIntelligenceSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryList)) {
            query.put("CategoryList", request.categoryList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyThreatIntelligenceSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyThreatIntelligenceSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改威胁情报配置的信息</p>
     * 
     * @param request ModifyThreatIntelligenceSwitchRequest
     * @return ModifyThreatIntelligenceSwitchResponse
     */
    public ModifyThreatIntelligenceSwitchResponse modifyThreatIntelligenceSwitch(ModifyThreatIntelligenceSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyThreatIntelligenceSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request ModifyTrFirewallV2ConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTrFirewallV2ConfigurationResponse
     */
    public ModifyTrFirewallV2ConfigurationResponse modifyTrFirewallV2ConfigurationWithOptions(ModifyTrFirewallV2ConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallName)) {
            query.put("FirewallName", request.firewallName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrFirewallV2Configuration"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrFirewallV2ConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a virtual private cloud (VPC) firewall that is created for a transit router.</p>
     * 
     * @param request ModifyTrFirewallV2ConfigurationRequest
     * @return ModifyTrFirewallV2ConfigurationResponse
     */
    public ModifyTrFirewallV2ConfigurationResponse modifyTrFirewallV2Configuration(ModifyTrFirewallV2ConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrFirewallV2ConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the effective scope of the routing policy created for the VPC firewall for a transit router.</p>
     * 
     * @param tmpReq ModifyTrFirewallV2RoutePolicyScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTrFirewallV2RoutePolicyScopeResponse
     */
    public ModifyTrFirewallV2RoutePolicyScopeResponse modifyTrFirewallV2RoutePolicyScopeWithOptions(ModifyTrFirewallV2RoutePolicyScopeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTrFirewallV2RoutePolicyScopeShrinkRequest request = new ModifyTrFirewallV2RoutePolicyScopeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destCandidateList)) {
            request.destCandidateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destCandidateList, "DestCandidateList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.srcCandidateList)) {
            request.srcCandidateListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.srcCandidateList, "SrcCandidateList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCandidateListShrink)) {
            query.put("DestCandidateList", request.destCandidateListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firewallId)) {
            query.put("FirewallId", request.firewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldRecover)) {
            query.put("ShouldRecover", request.shouldRecover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCandidateListShrink)) {
            query.put("SrcCandidateList", request.srcCandidateListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trFirewallRoutePolicyId)) {
            query.put("TrFirewallRoutePolicyId", request.trFirewallRoutePolicyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrFirewallV2RoutePolicyScope"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTrFirewallV2RoutePolicyScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the effective scope of the routing policy created for the VPC firewall for a transit router.</p>
     * 
     * @param request ModifyTrFirewallV2RoutePolicyScopeRequest
     * @return ModifyTrFirewallV2RoutePolicyScopeResponse
     */
    public ModifyTrFirewallV2RoutePolicyScopeResponse modifyTrFirewallV2RoutePolicyScope(ModifyTrFirewallV2RoutePolicyScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTrFirewallV2RoutePolicyScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户告警配置</p>
     * 
     * @param request ModifyUserAlarmConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserAlarmConfigResponse
     */
    public ModifyUserAlarmConfigResponse modifyUserAlarmConfigWithOptions(ModifyUserAlarmConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmConfig)) {
            query.put("AlarmConfig", request.alarmConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmLang)) {
            query.put("AlarmLang", request.alarmLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactConfig)) {
            query.put("ContactConfig", request.contactConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfig)) {
            query.put("NotifyConfig", request.notifyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDefaultContact)) {
            query.put("UseDefaultContact", request.useDefaultContact);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserAlarmConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserAlarmConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户告警配置</p>
     * 
     * @param request ModifyUserAlarmConfigRequest
     * @return ModifyUserAlarmConfigResponse
     */
    public ModifyUserAlarmConfigResponse modifyUserAlarmConfig(ModifyUserAlarmConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserAlarmConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户IPS白名单</p>
     * 
     * @param request ModifyUserIPSWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserIPSWhitelistResponse
     */
    public ModifyUserIPSWhitelistResponse modifyUserIPSWhitelistWithOptions(ModifyUserIPSWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listValue)) {
            query.put("ListValue", request.listValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteType)) {
            query.put("WhiteType", request.whiteType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserIPSWhitelist"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserIPSWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户IPS白名单</p>
     * 
     * @param request ModifyUserIPSWhitelistRequest
     * @return ModifyUserIPSWhitelistResponse
     */
    public ModifyUserIPSWhitelistResponse modifyUserIPSWhitelist(ModifyUserIPSWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserIPSWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户日志存储时间</p>
     * 
     * @param request ModifyUserSlsLogStorageTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserSlsLogStorageTimeResponse
     */
    public ModifyUserSlsLogStorageTimeResponse modifyUserSlsLogStorageTimeWithOptions(ModifyUserSlsLogStorageTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageTime)) {
            query.put("StorageTime", request.storageTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserSlsLogStorageTime"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserSlsLogStorageTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改用户日志存储时间</p>
     * 
     * @param request ModifyUserSlsLogStorageTimeRequest
     * @return ModifyUserSlsLogStorageTimeResponse
     */
    public ModifyUserSlsLogStorageTimeResponse modifyUserSlsLogStorageTime(ModifyUserSlsLogStorageTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserSlsLogStorageTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改VPC防火墙ACL引擎模式</p>
     * 
     * @param request ModifyVpcFirewallAclEngineModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallAclEngineModeResponse
     */
    public ModifyVpcFirewallAclEngineModeResponse modifyVpcFirewallAclEngineModeWithOptions(ModifyVpcFirewallAclEngineModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictMode)) {
            query.put("StrictMode", request.strictMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallAclEngineMode"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallAclEngineModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改VPC防火墙ACL引擎模式</p>
     * 
     * @param request ModifyVpcFirewallAclEngineModeRequest
     * @return ModifyVpcFirewallAclEngineModeResponse
     */
    public ModifyVpcFirewallAclEngineModeResponse modifyVpcFirewallAclEngineMode(ModifyVpcFirewallAclEngineModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallAclEngineModeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenConfigure operation to modify the configurations of a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyVpcFirewallCenConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallCenConfigureResponse
     */
    public ModifyVpcFirewallCenConfigureResponse modifyVpcFirewallCenConfigureWithOptions(ModifyVpcFirewallCenConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallCenConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenConfigure operation to modify the configurations of a VPC firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyVpcFirewallCenConfigureRequest
     * @return ModifyVpcFirewallCenConfigureResponse
     */
    public ModifyVpcFirewallCenConfigureResponse modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenSwitchStatus operation to enable or disable a VPC firewall. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. After you enable the VPC firewall, the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. After you disable the VPC firewall, the VPC firewall no longer protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance.
     * Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyVpcFirewallCenSwitchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallCenSwitchStatusResponse
     */
    public ModifyVpcFirewallCenSwitchStatusResponse modifyVpcFirewallCenSwitchStatusWithOptions(ModifyVpcFirewallCenSwitchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitch)) {
            query.put("FirewallSwitch", request.firewallSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallCenSwitchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallCenSwitchStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallCenSwitchStatus operation to enable or disable a VPC firewall. A VPC firewall protects mutual access traffic between a specified VPC and a network instance that is attached to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance. After you enable the VPC firewall, the VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance. After you disable the VPC firewall, the VPC firewall no longer protects mutual access traffic between a VPC and a specified network instance that is attached to a CEN instance.
     * Before you call this operation, make sure that you have created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/345772.html">CreateVpcFirewallCenConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a virtual private cloud (VPC) firewall. The VPC firewall protects mutual access traffic between a VPC and a specified network instance that is attached to a Cloud Enterprise Network (CEN) instance.</p>
     * 
     * @param request ModifyVpcFirewallCenSwitchStatusRequest
     * @return ModifyVpcFirewallCenSwitchStatusResponse
     */
    public ModifyVpcFirewallCenSwitchStatusResponse modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallCenSwitchStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallConfigure operation to modify the configurations of a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a virtual private cloud (VPC) firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request ModifyVpcFirewallConfigureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallConfigureResponse
     */
    public ModifyVpcFirewallConfigureResponse modifyVpcFirewallConfigureWithOptions(ModifyVpcFirewallConfigureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localVpcCidrTableList)) {
            query.put("LocalVpcCidrTableList", request.localVpcCidrTableList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerVpcCidrTableList)) {
            query.put("PeerVpcCidrTableList", request.peerVpcCidrTableList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallName)) {
            query.put("VpcFirewallName", request.vpcFirewallName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallConfigureResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallConfigure operation to modify the configurations of a VPC firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit. Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a virtual private cloud (VPC) firewall. The VPC firewall controls traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request ModifyVpcFirewallConfigureRequest
     * @return ModifyVpcFirewallConfigureResponse
     */
    public ModifyVpcFirewallConfigureResponse modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallConfigureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallControlPolicy operation to modify the configurations of an access control policy that is created for a VPC firewall in a specified policy group. Different access control policies are used for the VPC firewalls that are used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewalls that are used to protect each Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy that is created for a virtual private cloud (VPC) firewall in a specified policy group.</p>
     * 
     * @param request ModifyVpcFirewallControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallControlPolicyResponse
     */
    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicyWithOptions(ModifyVpcFirewallControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclAction)) {
            query.put("AclAction", request.aclAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationNameList)) {
            query.put("ApplicationNameList", request.applicationNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPort)) {
            query.put("DestPort", request.destPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortGroup)) {
            query.put("DestPortGroup", request.destPortGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destPortType)) {
            query.put("DestPortType", request.destPortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainResolveType)) {
            query.put("DomainResolveType", request.domainResolveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proto)) {
            query.put("Proto", request.proto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.release)) {
            query.put("Release", request.release);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatDays)) {
            query.put("RepeatDays", request.repeatDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatEndTime)) {
            query.put("RepeatEndTime", request.repeatEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatStartTime)) {
            query.put("RepeatStartTime", request.repeatStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repeatType)) {
            query.put("RepeatType", request.repeatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallControlPolicy operation to modify the configurations of an access control policy that is created for a VPC firewall in a specified policy group. Different access control policies are used for the VPC firewalls that are used to protect each Cloud Enterprise Network (CEN) instance and the VPC firewalls that are used to protect each Express Connect circuit.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an access control policy that is created for a virtual private cloud (VPC) firewall in a specified policy group.</p>
     * 
     * @param request ModifyVpcFirewallControlPolicyRequest
     * @return ModifyVpcFirewallControlPolicyResponse
     */
    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an access control policy that is created for a VPC firewall in a specific policy group.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy that is created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request ModifyVpcFirewallControlPolicyPositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallControlPolicyPositionResponse
     */
    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPositionWithOptions(ModifyVpcFirewallControlPolicyPositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOrder)) {
            query.put("NewOrder", request.newOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldOrder)) {
            query.put("OldOrder", request.oldOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallControlPolicyPosition"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallControlPolicyPositionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use this operation to modify the priority of an access control policy that is created for a VPC firewall in a specific policy group.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the priority of an access control policy that is created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request ModifyVpcFirewallControlPolicyPositionRequest
     * @return ModifyVpcFirewallControlPolicyPositionResponse
     */
    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyPositionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the intrusion prevention configurations of a VPC firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the intrusion prevention configurations of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request ModifyVpcFirewallDefaultIPSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallDefaultIPSConfigResponse
     */
    public ModifyVpcFirewallDefaultIPSConfigResponse modifyVpcFirewallDefaultIPSConfigWithOptions(ModifyVpcFirewallDefaultIPSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.basicRules)) {
            query.put("BasicRules", request.basicRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAllPatch)) {
            query.put("EnableAllPatch", request.enableAllPatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleClass)) {
            query.put("RuleClass", request.ruleClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMode)) {
            query.put("RunMode", request.runMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallDefaultIPSConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the intrusion prevention configurations of a VPC firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the intrusion prevention configurations of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request ModifyVpcFirewallDefaultIPSConfigRequest
     * @return ModifyVpcFirewallDefaultIPSConfigResponse
     */
    public ModifyVpcFirewallDefaultIPSConfigResponse modifyVpcFirewallDefaultIPSConfig(ModifyVpcFirewallDefaultIPSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallDefaultIPSConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IPS whitelist of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request ModifyVpcFirewallIPSWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallIPSWhitelistResponse
     */
    public ModifyVpcFirewallIPSWhitelistResponse modifyVpcFirewallIPSWhitelistWithOptions(ModifyVpcFirewallIPSWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listType)) {
            query.put("ListType", request.listType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listValue)) {
            query.put("ListValue", request.listValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteType)) {
            query.put("WhiteType", request.whiteType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallIPSWhitelist"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallIPSWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the IPS whitelist of a virtual private cloud (VPC) firewall.</p>
     * 
     * @param request ModifyVpcFirewallIPSWhitelistRequest
     * @return ModifyVpcFirewallIPSWhitelistResponse
     */
    public ModifyVpcFirewallIPSWhitelistResponse modifyVpcFirewallIPSWhitelist(ModifyVpcFirewallIPSWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallIPSWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallSwitchStatus operation to enable or disable a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit. After you enable the VPC firewall, the VPC firewall protects access traffic between two VPCs that are connected by using an Express Connect circuit. After you disable the VPC firewall, the VPC firewall no longer protects access traffic between two VPCs that are connected by using an Express Connect circuit.
     * Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a virtual private cloud (VPC) firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request ModifyVpcFirewallSwitchStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVpcFirewallSwitchStatusResponse
     */
    public ModifyVpcFirewallSwitchStatusResponse modifyVpcFirewallSwitchStatusWithOptions(ModifyVpcFirewallSwitchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.firewallSwitch)) {
            query.put("FirewallSwitch", request.firewallSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcFirewallId)) {
            query.put("VpcFirewallId", request.vpcFirewallId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallSwitchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallSwitchStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ModifyVpcFirewallSwitchStatus operation to enable or disable a VPC firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit. After you enable the VPC firewall, the VPC firewall protects access traffic between two VPCs that are connected by using an Express Connect circuit. After you disable the VPC firewall, the VPC firewall no longer protects access traffic between two VPCs that are connected by using an Express Connect circuit.
     * Before you call the operation, make sure that you created a VPC firewall by calling the <a href="https://help.aliyun.com/document_detail/342893.html">CreateVpcFirewallConfigure</a> operation.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a virtual private cloud (VPC) firewall. The VPC firewall protects traffic between two VPCs that are connected by using an Express Connect circuit.</p>
     * 
     * @param request ModifyVpcFirewallSwitchStatusRequest
     * @return ModifyVpcFirewallSwitchStatusResponse
     */
    public ModifyVpcFirewallSwitchStatusResponse modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVpcFirewallSwitchStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableAllFwSwitch operation to turn off all firewall switches.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Turns off all firewall switches.</p>
     * 
     * @param request PutDisableAllFwSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDisableAllFwSwitchResponse
     */
    public PutDisableAllFwSwitchResponse putDisableAllFwSwitchWithOptions(PutDisableAllFwSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDisableAllFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDisableAllFwSwitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableAllFwSwitch operation to turn off all firewall switches.</p>
     * <h2><a href="#qps-"></a>QPS limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Turns off all firewall switches.</p>
     * 
     * @param request PutDisableAllFwSwitchRequest
     * @return PutDisableAllFwSwitchResponse
     */
    public PutDisableAllFwSwitchResponse putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDisableAllFwSwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableFwSwitch operation to disable a firewall for specific assets. After you disable the firewall, traffic does not pass through Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disable a firewall for specific assets.</p>
     * 
     * @param request PutDisableFwSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutDisableFwSwitchResponse
     */
    public PutDisableFwSwitchResponse putDisableFwSwitchWithOptions(PutDisableFwSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipaddrList)) {
            query.put("IpaddrList", request.ipaddrList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionList)) {
            query.put("RegionList", request.regionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeList)) {
            query.put("ResourceTypeList", request.resourceTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDisableFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDisableFwSwitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutDisableFwSwitch operation to disable a firewall for specific assets. After you disable the firewall, traffic does not pass through Cloud Firewall.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disable a firewall for specific assets.</p>
     * 
     * @param request PutDisableFwSwitchRequest
     * @return PutDisableFwSwitchResponse
     */
    public PutDisableFwSwitchResponse putDisableFwSwitch(PutDisableFwSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putDisableFwSwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutEnableAllFwSwitch operation to enable a firewall for all public IP addresses within your Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a firewall for all public IP addresses within your Alibaba Cloud account.</p>
     * 
     * @param request PutEnableAllFwSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutEnableAllFwSwitchResponse
     */
    public PutEnableAllFwSwitchResponse putEnableAllFwSwitchWithOptions(PutEnableAllFwSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnableAllFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnableAllFwSwitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the PutEnableAllFwSwitch operation to enable a firewall for all public IP addresses within your Alibaba Cloud account.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a firewall for all public IP addresses within your Alibaba Cloud account.</p>
     * 
     * @param request PutEnableAllFwSwitchRequest
     * @return PutEnableAllFwSwitchResponse
     */
    public PutEnableAllFwSwitchResponse putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEnableAllFwSwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable a firewall. After you enable a firewall, traffic passes through Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables firewalls for specific assets.</p>
     * 
     * @param request PutEnableFwSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutEnableFwSwitchResponse
     */
    public PutEnableFwSwitchResponse putEnableFwSwitchWithOptions(PutEnableFwSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipaddrList)) {
            query.put("IpaddrList", request.ipaddrList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionList)) {
            query.put("RegionList", request.regionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeList)) {
            query.put("ResourceTypeList", request.resourceTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnableFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnableFwSwitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable a firewall. After you enable a firewall, traffic passes through Cloud Firewall.</p>
     * <h2><a href="#qps-"></a>Limits</h2>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables firewalls for specific assets.</p>
     * 
     * @param request PutEnableFwSwitchRequest
     * @return PutEnableFwSwitchResponse
     */
    public PutEnableFwSwitchResponse putEnableFwSwitch(PutEnableFwSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEnableFwSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放已过期的实例</p>
     * 
     * @param request ReleaseExpiredInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseExpiredInstanceResponse
     */
    public ReleaseExpiredInstanceResponse releaseExpiredInstanceWithOptions(ReleaseExpiredInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseExpiredInstance"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseExpiredInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放已过期的实例</p>
     * 
     * @param request ReleaseExpiredInstanceRequest
     * @return ReleaseExpiredInstanceResponse
     */
    public ReleaseExpiredInstanceResponse releaseExpiredInstance(ReleaseExpiredInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseExpiredInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request ReleasePostInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleasePostInstanceResponse
     */
    public ReleasePostInstanceResponse releasePostInstanceWithOptions(ReleasePostInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePostInstance"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePostInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request ReleasePostInstanceRequest
     * @return ReleasePostInstanceResponse
     */
    public ReleasePostInstanceResponse releasePostInstance(ReleasePostInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePostInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the number of NAT firewall hits.</p>
     * 
     * @param request ResetNatFirewallRuleHitCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetNatFirewallRuleHitCountResponse
     */
    public ResetNatFirewallRuleHitCountResponse resetNatFirewallRuleHitCountWithOptions(ResetNatFirewallRuleHitCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetNatFirewallRuleHitCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetNatFirewallRuleHitCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the number of NAT firewall hits.</p>
     * 
     * @param request ResetNatFirewallRuleHitCountRequest
     * @return ResetNatFirewallRuleHitCountResponse
     */
    public ResetNatFirewallRuleHitCountResponse resetNatFirewallRuleHitCount(ResetNatFirewallRuleHitCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetNatFirewallRuleHitCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置规则命中数</p>
     * 
     * @param request ResetRuleHitCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetRuleHitCountResponse
     */
    public ResetRuleHitCountResponse resetRuleHitCountWithOptions(ResetRuleHitCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetRuleHitCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetRuleHitCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置规则命中数</p>
     * 
     * @param request ResetRuleHitCountRequest
     * @return ResetRuleHitCountResponse
     */
    public ResetRuleHitCountResponse resetRuleHitCount(ResetRuleHitCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetRuleHitCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the ResetVpcFirewallRuleHitCount operation to clear the count on hits of an access control policy that is created for a VPC firewall in a specific policy group.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears the count on hits of an access control policy that is created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request ResetVpcFirewallRuleHitCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetVpcFirewallRuleHitCountResponse
     */
    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCountWithOptions(ResetVpcFirewallRuleHitCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aclUuid)) {
            query.put("AclUuid", request.aclUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetVpcFirewallRuleHitCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetVpcFirewallRuleHitCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the ResetVpcFirewallRuleHitCount operation to clear the count on hits of an access control policy that is created for a VPC firewall in a specific policy group.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears the count on hits of an access control policy that is created for a virtual private cloud (VPC) firewall in a specific policy group.</p>
     * 
     * @param request ResetVpcFirewallRuleHitCountRequest
     * @return ResetVpcFirewallRuleHitCountResponse
     */
    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetVpcFirewallRuleHitCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables a NAT firewall.</p>
     * 
     * @param request SwitchSecurityProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchSecurityProxyResponse
     */
    public SwitchSecurityProxyResponse switchSecurityProxyWithOptions(SwitchSecurityProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._switch)) {
            query.put("Switch", request._switch);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSecurityProxy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSecurityProxyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables a NAT firewall.</p>
     * 
     * @param request SwitchSecurityProxyRequest
     * @return SwitchSecurityProxyResponse
     */
    public SwitchSecurityProxyResponse switchSecurityProxy(SwitchSecurityProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSecurityProxyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改AI流量分析开启状态</p>
     * 
     * @param request UpdateAITrafficAnalysisStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAITrafficAnalysisStatusResponse
     */
    public UpdateAITrafficAnalysisStatusResponse updateAITrafficAnalysisStatusWithOptions(UpdateAITrafficAnalysisStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAITrafficAnalysisStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAITrafficAnalysisStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改AI流量分析开启状态</p>
     * 
     * @param request UpdateAITrafficAnalysisStatusRequest
     * @return UpdateAITrafficAnalysisStatusResponse
     */
    public UpdateAITrafficAnalysisStatusResponse updateAITrafficAnalysisStatus(UpdateAITrafficAnalysisStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAITrafficAnalysisStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改ACK集群连接器</p>
     * 
     * @param request UpdateAckClusterConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAckClusterConnectorResponse
     */
    public UpdateAckClusterConnectorResponse updateAckClusterConnectorWithOptions(UpdateAckClusterConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorName)) {
            query.put("ConnectorName", request.connectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAckClusterConnector"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAckClusterConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改ACK集群连接器</p>
     * 
     * @param request UpdateAckClusterConnectorRequest
     * @return UpdateAckClusterConnectorResponse
     */
    public UpdateAckClusterConnectorResponse updateAckClusterConnector(UpdateAckClusterConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAckClusterConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改ACL检查状态</p>
     * 
     * @param request UpdateAclCheckDetailStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAclCheckDetailStatusResponse
     */
    public UpdateAclCheckDetailStatusResponse updateAclCheckDetailStatusWithOptions(UpdateAclCheckDetailStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
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
            new TeaPair("action", "UpdateAclCheckDetailStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAclCheckDetailStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改ACL检查状态</p>
     * 
     * @param request UpdateAclCheckDetailStatusRequest
     * @return UpdateAclCheckDetailStatusResponse
     */
    public UpdateAclCheckDetailStatusResponse updateAclCheckDetailStatus(UpdateAclCheckDetailStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAclCheckDetailStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the NAT firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserInternetStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePostpayUserInternetStatusResponse
     */
    public UpdatePostpayUserInternetStatusResponse updatePostpayUserInternetStatusWithOptions(UpdatePostpayUserInternetStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePostpayUserInternetStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePostpayUserInternetStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the NAT firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserInternetStatusRequest
     * @return UpdatePostpayUserInternetStatusResponse
     */
    public UpdatePostpayUserInternetStatusResponse updatePostpayUserInternetStatus(UpdatePostpayUserInternetStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePostpayUserInternetStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the NAT Firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserNatStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePostpayUserNatStatusResponse
     */
    public UpdatePostpayUserNatStatusResponse updatePostpayUserNatStatusWithOptions(UpdatePostpayUserNatStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePostpayUserNatStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePostpayUserNatStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the NAT Firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserNatStatusRequest
     * @return UpdatePostpayUserNatStatusResponse
     */
    public UpdatePostpayUserNatStatusResponse updatePostpayUserNatStatus(UpdatePostpayUserNatStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePostpayUserNatStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the virtual private cloud (VPC) Firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserVpcStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePostpayUserVpcStatusResponse
     */
    public UpdatePostpayUserVpcStatusResponse updatePostpayUserVpcStatusWithOptions(UpdatePostpayUserVpcStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operate)) {
            query.put("Operate", request.operate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePostpayUserVpcStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePostpayUserVpcStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the status of the virtual private cloud (VPC) Firewall feature for Cloud Firewall that uses the pay-as-you-go billing method.</p>
     * 
     * @param request UpdatePostpayUserVpcStatusRequest
     * @return UpdatePostpayUserVpcStatusResponse
     */
    public UpdatePostpayUserVpcStatusResponse updatePostpayUserVpcStatus(UpdatePostpayUserVpcStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePostpayUserVpcStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新安全正向代理</p>
     * 
     * @param request UpdateSecurityProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityProxyResponse
     */
    public UpdateSecurityProxyResponse updateSecurityProxyWithOptions(UpdateSecurityProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyName)) {
            query.put("ProxyName", request.proxyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictMode)) {
            query.put("StrictMode", request.strictMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecurityProxy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityProxyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新安全正向代理</p>
     * 
     * @param request UpdateSecurityProxyRequest
     * @return UpdateSecurityProxyResponse
     */
    public UpdateSecurityProxyResponse updateSecurityProxy(UpdateSecurityProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityProxyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>使用ACL备份</p>
     * 
     * @param request UseAclBackupDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UseAclBackupDataResponse
     */
    public UseAclBackupDataResponse useAclBackupDataWithOptions(UseAclBackupDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backUpTime)) {
            query.put("BackUpTime", request.backUpTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UseAclBackupData"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UseAclBackupDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>使用ACL备份</p>
     * 
     * @param request UseAclBackupDataRequest
     * @return UseAclBackupDataResponse
     */
    public UseAclBackupDataResponse useAclBackupData(UseAclBackupDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.useAclBackupDataWithOptions(request, runtime);
    }
}
