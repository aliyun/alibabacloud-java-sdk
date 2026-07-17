// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109;

import com.aliyun.tea.*;
import com.aliyun.alidns20150109.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("public", "alidns.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alidns", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>The end IP address of an IP address segment must be greater than or equal to its start IP address.
     * The IP address ranges of segments cannot overlap across any custom lines for the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a custom line for a domain name.</p>
     * 
     * @param request AddCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomLineResponse
     */
    public AddCustomLineResponse addCustomLineWithOptions(AddCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipSegment)) {
            query.put("IpSegment", request.ipSegment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineName)) {
            query.put("LineName", request.lineName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomLine"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomLineResponse());
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of an IP address segment must be greater than or equal to its start IP address.
     * The IP address ranges of segments cannot overlap across any custom lines for the domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a custom line for a domain name.</p>
     * 
     * @param request AddCustomLineRequest
     * @return AddCustomLineResponse
     */
    public AddCustomLineResponse addCustomLine(AddCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a domain name to the DNS authoritative proxy service.</p>
     * 
     * @param request AddDnsCacheDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnsCacheDomainResponse
     */
    public AddDnsCacheDomainResponse addDnsCacheDomainWithOptions(AddDnsCacheDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheTtlMax)) {
            query.put("CacheTtlMax", request.cacheTtlMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheTtlMin)) {
            query.put("CacheTtlMin", request.cacheTtlMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDnsServer)) {
            query.put("SourceDnsServer", request.sourceDnsServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEdns)) {
            query.put("SourceEdns", request.sourceEdns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProtocol)) {
            query.put("SourceProtocol", request.sourceProtocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDnsCacheDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnsCacheDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a domain name to the DNS authoritative proxy service.</p>
     * 
     * @param request AddDnsCacheDomainRequest
     * @return AddDnsCacheDomainResponse
     */
    public AddDnsCacheDomainResponse addDnsCacheDomain(AddDnsCacheDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnsCacheDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an access strategy.</p>
     * 
     * @param request AddDnsGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnsGtmAccessStrategyResponse
     */
    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategyWithOptions(AddDnsGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPool)) {
            query.put("DefaultAddrPool", request.defaultAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPoolType)) {
            query.put("DefaultAddrPoolType", request.defaultAddrPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLatencyOptimization)) {
            query.put("DefaultLatencyOptimization", request.defaultLatencyOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLbaStrategy)) {
            query.put("DefaultLbaStrategy", request.defaultLbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMaxReturnAddrNum)) {
            query.put("DefaultMaxReturnAddrNum", request.defaultMaxReturnAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMinAvailableAddrNum)) {
            query.put("DefaultMinAvailableAddrNum", request.defaultMinAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPool)) {
            query.put("FailoverAddrPool", request.failoverAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPoolType)) {
            query.put("FailoverAddrPoolType", request.failoverAddrPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverLatencyOptimization)) {
            query.put("FailoverLatencyOptimization", request.failoverLatencyOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverLbaStrategy)) {
            query.put("FailoverLbaStrategy", request.failoverLbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverMaxReturnAddrNum)) {
            query.put("FailoverMaxReturnAddrNum", request.failoverMaxReturnAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverMinAvailableAddrNum)) {
            query.put("FailoverMinAvailableAddrNum", request.failoverMinAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyMode)) {
            query.put("StrategyMode", request.strategyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDnsGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnsGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an access strategy.</p>
     * 
     * @param request AddDnsGtmAccessStrategyRequest
     * @return AddDnsGtmAccessStrategyResponse
     */
    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an address pool.</p>
     * 
     * @param request AddDnsGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnsGtmAddressPoolResponse
     */
    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPoolWithOptions(AddDnsGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addr)) {
            query.put("Addr", request.addr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lbaStrategy)) {
            query.put("LbaStrategy", request.lbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorStatus)) {
            query.put("MonitorStatus", request.monitorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
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
            new TeaPair("action", "AddDnsGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnsGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an address pool.</p>
     * 
     * @param request AddDnsGtmAddressPoolRequest
     * @return AddDnsGtmAddressPoolResponse
     */
    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnsGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a health check.</p>
     * 
     * @param request AddDnsGtmMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDnsGtmMonitorResponse
     */
    public AddDnsGtmMonitorResponse addDnsGtmMonitorWithOptions(AddDnsGtmMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDnsGtmMonitor"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDnsGtmMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a health check.</p>
     * 
     * @param request AddDnsGtmMonitorRequest
     * @return AddDnsGtmMonitorResponse
     */
    public AddDnsGtmMonitorResponse addDnsGtmMonitor(AddDnsGtmMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDnsGtmMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/67788.html">Domain name validity</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/doc-detail/67788.htm">Domain name validity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name.</p>
     * 
     * @param request AddDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainResponse
     */
    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/67788.html">Domain name validity</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/doc-detail/67788.htm">Domain name validity</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a domain name.</p>
     * 
     * @param request AddDomainRequest
     * @return AddDomainResponse
     */
    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a backup for a domain based on the specified domain name and backup cycle.</p>
     * 
     * @param request AddDomainBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainBackupResponse
     */
    public AddDomainBackupResponse addDomainBackupWithOptions(AddDomainBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomainBackup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainBackupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a backup for a domain based on the specified domain name and backup cycle.</p>
     * 
     * @param request AddDomainBackupRequest
     * @return AddDomainBackupResponse
     */
    public AddDomainBackupResponse addDomainBackup(AddDomainBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainBackupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a domain name group.</p>
     * 
     * @param request AddDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainGroupResponse
     */
    public AddDomainGroupResponse addDomainGroupWithOptions(AddDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomainGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a domain name group.</p>
     * 
     * @param request AddDomainGroupRequest
     * @return AddDomainGroupResponse
     */
    public AddDomainGroupResponse addDomainGroup(AddDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a DNS record.</p>
     * 
     * @param request AddDomainRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDomainRecordResponse
     */
    public AddDomainRecordResponse addDomainRecordWithOptions(AddDomainRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RR)) {
            query.put("RR", request.RR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TTL)) {
            query.put("TTL", request.TTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDomainRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDomainRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a DNS record.</p>
     * 
     * @param request AddDomainRecordRequest
     * @return AddDomainRecordResponse
     */
    public AddDomainRecordResponse addDomainRecord(AddDomainRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDomainRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access strategy based on the specified parameters.</p>
     * 
     * @param request AddGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGtmAccessStrategyResponse
     */
    public AddGtmAccessStrategyResponse addGtmAccessStrategyWithOptions(AddGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLines)) {
            query.put("AccessLines", request.accessLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPoolId)) {
            query.put("DefaultAddrPoolId", request.defaultAddrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPoolId)) {
            query.put("FailoverAddrPoolId", request.failoverAddrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access strategy based on the specified parameters.</p>
     * 
     * @param request AddGtmAccessStrategyRequest
     * @return AddGtmAccessStrategyResponse
     */
    public AddGtmAccessStrategyResponse addGtmAccessStrategy(AddGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an address pool.</p>
     * 
     * @param request AddGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGtmAddressPoolResponse
     */
    public AddGtmAddressPoolResponse addGtmAddressPoolWithOptions(AddGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addr)) {
            query.put("Addr", request.addr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAvailableAddrNum)) {
            query.put("MinAvailableAddrNum", request.minAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorStatus)) {
            query.put("MonitorStatus", request.monitorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
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
            new TeaPair("action", "AddGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an address pool.</p>
     * 
     * @param request AddGtmAddressPoolRequest
     * @return AddGtmAddressPoolResponse
     */
    public AddGtmAddressPoolResponse addGtmAddressPool(AddGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a health check.</p>
     * 
     * @param request AddGtmMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGtmMonitorResponse
     */
    public AddGtmMonitorResponse addGtmMonitorWithOptions(AddGtmMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGtmMonitor"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGtmMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a health check.</p>
     * 
     * @param request AddGtmMonitorRequest
     * @return AddGtmMonitorResponse
     */
    public AddGtmMonitorResponse addGtmMonitor(AddGtmMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGtmMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a disaster recovery plan.</p>
     * 
     * @param request AddGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGtmRecoveryPlanResponse
     */
    public AddGtmRecoveryPlanResponse addGtmRecoveryPlanWithOptions(AddGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faultAddrPool)) {
            query.put("FaultAddrPool", request.faultAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "AddGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a disaster recovery plan.</p>
     * 
     * @param request AddGtmRecoveryPlanRequest
     * @return AddGtmRecoveryPlanResponse
     */
    public AddGtmRecoveryPlanResponse addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify a domain name (DomainName), page number (PageNumber), and page size (PageSize) to retrieve the list of DNS records for that domain name.</li>
     * <li>To find DNS records that contain a specific keyword, you can specify the keyword for the host record (RRKeyWord), record type (TypeKeyWord), or record value (ValueKeyWord).</li>
     * <li>By default, the list of DNS records is sorted from newest to oldest.</li>
     * <li>You can specify a domain group ID (GroupId). The \<code>All Domains\\</code> group includes all domain names. The \<code>Default Group\\</code> includes domain names that are not assigned to a group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an authoritative record for recursive resolution.</p>
     * 
     * @param request AddRecursionRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecursionRecordResponse
     */
    public AddRecursionRecordResponse addRecursionRecordWithOptions(AddRecursionRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecursionRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecursionRecordResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify a domain name (DomainName), page number (PageNumber), and page size (PageSize) to retrieve the list of DNS records for that domain name.</li>
     * <li>To find DNS records that contain a specific keyword, you can specify the keyword for the host record (RRKeyWord), record type (TypeKeyWord), or record value (ValueKeyWord).</li>
     * <li>By default, the list of DNS records is sorted from newest to oldest.</li>
     * <li>You can specify a domain group ID (GroupId). The \<code>All Domains\\</code> group includes all domain names. The \<code>Default Group\\</code> includes domain names that are not assigned to a group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an authoritative record for recursive resolution.</p>
     * 
     * @param request AddRecursionRecordRequest
     * @return AddRecursionRecordResponse
     */
    public AddRecursionRecordResponse addRecursionRecord(AddRecursionRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecursionRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP range must be greater than or equal to the start IP address.
     * The IP address ranges of all IP ranges in all custom lines for a domain name cannot overlap.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a built-in authoritative domain name zone for recursive resolution.</p>
     * 
     * @param request AddRecursionZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecursionZoneResponse
     */
    public AddRecursionZoneResponse addRecursionZoneWithOptions(AddRecursionZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPattern)) {
            query.put("ProxyPattern", request.proxyPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecursionZone"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecursionZoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP range must be greater than or equal to the start IP address.
     * The IP address ranges of all IP ranges in all custom lines for a domain name cannot overlap.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a built-in authoritative domain name zone for recursive resolution.</p>
     * 
     * @param request AddRecursionZoneRequest
     * @return AddRecursionZoneResponse
     */
    public AddRecursionZoneResponse addRecursionZone(AddRecursionZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecursionZoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API adds the serverHold property to a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the serverHold status to a specified domain name.</p>
     * 
     * @param request AddRspDomainServerHoldStatusForGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRspDomainServerHoldStatusForGatewayResponse
     */
    public AddRspDomainServerHoldStatusForGatewayResponse addRspDomainServerHoldStatusForGatewayWithOptions(AddRspDomainServerHoldStatusForGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusMsg)) {
            query.put("StatusMsg", request.statusMsg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRspDomainServerHoldStatusForGateway"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRspDomainServerHoldStatusForGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API adds the serverHold property to a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the serverHold status to a specified domain name.</p>
     * 
     * @param request AddRspDomainServerHoldStatusForGatewayRequest
     * @return AddRspDomainServerHoldStatusForGatewayResponse
     */
    public AddRspDomainServerHoldStatusForGatewayResponse addRspDomainServerHoldStatusForGateway(AddRspDomainServerHoldStatusForGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRspDomainServerHoldStatusForGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Adds the serverHold status for a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the serverHold status for a specified domain name.</p>
     * 
     * @param request AddRspDomainServerHoldStatusForGatewayOteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRspDomainServerHoldStatusForGatewayOteResponse
     */
    public AddRspDomainServerHoldStatusForGatewayOteResponse addRspDomainServerHoldStatusForGatewayOteWithOptions(AddRspDomainServerHoldStatusForGatewayOteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusMsg)) {
            query.put("StatusMsg", request.statusMsg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRspDomainServerHoldStatusForGatewayOte"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRspDomainServerHoldStatusForGatewayOteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Adds the serverHold status for a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds the serverHold status for a specified domain name.</p>
     * 
     * @param request AddRspDomainServerHoldStatusForGatewayOteRequest
     * @return AddRspDomainServerHoldStatusForGatewayOteResponse
     */
    public AddRspDomainServerHoldStatusForGatewayOteResponse addRspDomainServerHoldStatusForGatewayOte(AddRspDomainServerHoldStatusForGatewayOteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRspDomainServerHoldStatusForGatewayOteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An instance is considered a new instance if its ID starts with \&quot;dns-\&quot;. New instances support multiple domain names. You can call this operation to bind domain names directly to the instance. An error occurs if the number of domain names exceeds the instance\&quot;s limit.
     * An instance is considered a legacy instance if its ID does not start with \&quot;dns-\&quot;. Legacy instances support only one domain name. If you call this operation on a legacy instance that already has a domain name, the existing domain name is replaced.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds paid domain names in Alibaba Cloud DNS to an instance ID.</p>
     * 
     * @param request BindInstanceDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindInstanceDomainsResponse
     */
    public BindInstanceDomainsResponse bindInstanceDomainsWithOptions(BindInstanceDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindInstanceDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindInstanceDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>An instance is considered a new instance if its ID starts with \&quot;dns-\&quot;. New instances support multiple domain names. You can call this operation to bind domain names directly to the instance. An error occurs if the number of domain names exceeds the instance\&quot;s limit.
     * An instance is considered a legacy instance if its ID does not start with \&quot;dns-\&quot;. Legacy instances support only one domain name. If you call this operation on a legacy instance that already has a domain name, the existing domain name is replaced.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds paid domain names in Alibaba Cloud DNS to an instance ID.</p>
     * 
     * @param request BindInstanceDomainsRequest
     * @return BindInstanceDomainsResponse
     */
    public BindInstanceDomainsResponse bindInstanceDomains(BindInstanceDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindInstanceDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a domain name group (GroupId). The All Domains group contains all domain names, while the Default group contains domain names that are not assigned to any group.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a domain name to a new group.</p>
     * 
     * @param request ChangeDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDomainGroupResponse
     */
    public ChangeDomainGroupResponse changeDomainGroupWithOptions(ChangeDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDomainGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDomainGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can specify the ID of a domain name group (GroupId). The All Domains group contains all domain names, while the Default group contains domain names that are not assigned to any group.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves a domain name to a new group.</p>
     * 
     * @param request ChangeDomainGroupRequest
     * @return ChangeDomainGroupResponse
     */
    public ChangeDomainGroupResponse changeDomainGroup(ChangeDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>You can call this operation to change the domain name that is attached to a Cloud DNS product. To detach a domain name, call this operation and leave the NewDomain parameter empty.</strong></li>
     * <li><strong>This operation applies to instances of earlier versions. If you use a new edition, such as Personal Edition, Enterprise Standard Edition, or Enterprise Ultimate Edition, call the BindInstanceDomains operation instead.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the domain name that is attached to a Cloud DNS product.</p>
     * 
     * @param request ChangeDomainOfDnsProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDomainOfDnsProductResponse
     */
    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProductWithOptions(ChangeDomainOfDnsProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDomain)) {
            query.put("NewDomain", request.newDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDomainOfDnsProduct"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDomainOfDnsProductResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>You can call this operation to change the domain name that is attached to a Cloud DNS product. To detach a domain name, call this operation and leave the NewDomain parameter empty.</strong></li>
     * <li><strong>This operation applies to instances of earlier versions. If you use a new edition, such as Personal Edition, Enterprise Standard Edition, or Enterprise Ultimate Edition, call the BindInstanceDomains operation instead.</strong></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the domain name that is attached to a Cloud DNS product.</p>
     * 
     * @param request ChangeDomainOfDnsProductRequest
     * @return ChangeDomainOfDnsProductResponse
     */
    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeDomainOfDnsProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a Global Traffic Manager (GTM) configuration.</p>
     * 
     * @param request CopyGtmConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyGtmConfigResponse
     */
    public CopyGtmConfigResponse copyGtmConfigWithOptions(CopyGtmConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.copyType)) {
            query.put("CopyType", request.copyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyGtmConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyGtmConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a Global Traffic Manager (GTM) configuration.</p>
     * 
     * @param request CopyGtmConfigRequest
     * @return CopyGtmConfigResponse
     */
    public CopyGtmConfigResponse copyGtmConfig(CopyGtmConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyGtmConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an agent.</p>
     * 
     * @param tmpReq CreateAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAtiAgentRegisterInfoResponse
     */
    public CreateAtiAgentRegisterInfoResponse createAtiAgentRegisterInfoWithOptions(CreateAtiAgentRegisterInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAtiAgentRegisterInfoShrinkRequest request = new CreateAtiAgentRegisterInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endpoints)) {
            request.endpointsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endpoints, "Endpoints", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentDescription)) {
            query.put("AgentDescription", request.agentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentDisplayName)) {
            query.put("AgentDisplayName", request.agentDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentHost)) {
            query.put("AgentHost", request.agentHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointsShrink)) {
            query.put("Endpoints", request.endpointsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an agent.</p>
     * 
     * @param request CreateAtiAgentRegisterInfoRequest
     * @return CreateAtiAgentRegisterInfoResponse
     */
    public CreateAtiAgentRegisterInfoResponse createAtiAgentRegisterInfo(CreateAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an agent - Step 2: Generates a DNS record for domain ownership verification.</p>
     * 
     * @param request CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAtiAgentRegisterInfoAcmeChallengeRecordResponse
     */
    public CreateAtiAgentRegisterInfoAcmeChallengeRecordResponse createAtiAgentRegisterInfoAcmeChallengeRecordWithOptions(CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAtiAgentRegisterInfoAcmeChallengeRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAtiAgentRegisterInfoAcmeChallengeRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers an agent - Step 2: Generates a DNS record for domain ownership verification.</p>
     * 
     * @param request CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest
     * @return CreateAtiAgentRegisterInfoAcmeChallengeRecordResponse
     */
    public CreateAtiAgentRegisterInfoAcmeChallengeRecordResponse createAtiAgentRegisterInfoAcmeChallengeRecord(CreateAtiAgentRegisterInfoAcmeChallengeRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAtiAgentRegisterInfoAcmeChallengeRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a real-name registrant.</p>
     * 
     * @param request CreateAtiRegistrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAtiRegistrantResponse
     */
    public CreateAtiRegistrantResponse createAtiRegistrantWithOptions(CreateAtiRegistrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cc)) {
            query.put("Cc", request.cc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentCode)) {
            query.put("DocumentCode", request.documentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentImage)) {
            query.put("DocumentImage", request.documentImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            query.put("DocumentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.street)) {
            query.put("Street", request.street);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAtiRegistrant"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAtiRegistrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a real-name registrant.</p>
     * 
     * @param request CreateAtiRegistrantRequest
     * @return CreateAtiRegistrantResponse
     */
    public CreateAtiRegistrantResponse createAtiRegistrant(CreateAtiRegistrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAtiRegistrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an address in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param tmpReq CreateCloudGtmAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudGtmAddressResponse
     */
    public CreateCloudGtmAddressResponse createCloudGtmAddressWithOptions(CreateCloudGtmAddressRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCloudGtmAddressShrinkRequest request = new CreateCloudGtmAddressShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthTasks)) {
            request.healthTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthTasks, "HealthTasks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeInfo)) {
            query.put("AttributeInfo", request.attributeInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableMode)) {
            query.put("AvailableMode", request.availableMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthJudgement)) {
            query.put("HealthJudgement", request.healthJudgement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthTasksShrink)) {
            query.put("HealthTasks", request.healthTasksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manualAvailableStatus)) {
            query.put("ManualAvailableStatus", request.manualAvailableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudGtmAddress"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudGtmAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an address in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request CreateCloudGtmAddressRequest
     * @return CreateCloudGtmAddressResponse
     */
    public CreateCloudGtmAddressResponse createCloudGtmAddress(CreateCloudGtmAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudGtmAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an address pool based on the specified parameters.</p>
     * 
     * @param request CreateCloudGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudGtmAddressPoolResponse
     */
    public CreateCloudGtmAddressPoolResponse createCloudGtmAddressPoolWithOptions(CreateCloudGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolName)) {
            query.put("AddressPoolName", request.addressPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolType)) {
            query.put("AddressPoolType", request.addressPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthJudgement)) {
            query.put("HealthJudgement", request.healthJudgement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an address pool based on the specified parameters.</p>
     * 
     * @param request CreateCloudGtmAddressPoolRequest
     * @return CreateCloudGtmAddressPoolResponse
     */
    public CreateCloudGtmAddressPoolResponse createCloudGtmAddressPool(CreateCloudGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a configuration for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request CreateCloudGtmInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudGtmInstanceConfigResponse
     */
    public CreateCloudGtmInstanceConfigResponse createCloudGtmInstanceConfigWithOptions(CreateCloudGtmInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleHostname)) {
            query.put("ScheduleHostname", request.scheduleHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleRrType)) {
            query.put("ScheduleRrType", request.scheduleRrType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleZoneMode)) {
            query.put("ScheduleZoneMode", request.scheduleZoneMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleZoneName)) {
            query.put("ScheduleZoneName", request.scheduleZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudGtmInstanceConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudGtmInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a configuration for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request CreateCloudGtmInstanceConfigRequest
     * @return CreateCloudGtmInstanceConfigResponse
     */
    public CreateCloudGtmInstanceConfigResponse createCloudGtmInstanceConfig(CreateCloudGtmInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudGtmInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a health check template in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param tmpReq CreateCloudGtmMonitorTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudGtmMonitorTemplateResponse
     */
    public CreateCloudGtmMonitorTemplateResponse createCloudGtmMonitorTemplateWithOptions(CreateCloudGtmMonitorTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCloudGtmMonitorTemplateShrinkRequest request = new CreateCloudGtmMonitorTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ispCityNodes)) {
            request.ispCityNodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ispCityNodes, "IspCityNodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            query.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failureRate)) {
            query.put("FailureRate", request.failureRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNodesShrink)) {
            query.put("IspCityNodes", request.ispCityNodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudGtmMonitorTemplate"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudGtmMonitorTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a health check template in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request CreateCloudGtmMonitorTemplateRequest
     * @return CreateCloudGtmMonitorTemplateResponse
     */
    public CreateCloudGtmMonitorTemplateResponse createCloudGtmMonitorTemplate(CreateCloudGtmMonitorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudGtmMonitorTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a public DNS AccessKey.</p>
     * 
     * @param request CreatePdnsAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdnsAppKeyResponse
     */
    public CreatePdnsAppKeyResponse createPdnsAppKeyWithOptions(CreatePdnsAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdnsAppKey"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdnsAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a public DNS AccessKey.</p>
     * 
     * @param request CreatePdnsAppKeyRequest
     * @return CreatePdnsAppKeyResponse
     */
    public CreatePdnsAppKeyResponse createPdnsAppKey(CreatePdnsAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPdnsAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Public DNS UDP IP Address Segment</p>
     * 
     * @param request CreatePdnsUdpIpSegmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePdnsUdpIpSegmentResponse
     */
    public CreatePdnsUdpIpSegmentResponse createPdnsUdpIpSegmentWithOptions(CreatePdnsUdpIpSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipToken)) {
            query.put("IpToken", request.ipToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePdnsUdpIpSegment"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePdnsUdpIpSegmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Public DNS UDP IP Address Segment</p>
     * 
     * @param request CreatePdnsUdpIpSegmentRequest
     * @return CreatePdnsUdpIpSegmentResponse
     */
    public CreatePdnsUdpIpSegmentResponse createPdnsUdpIpSegment(CreatePdnsUdpIpSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPdnsUdpIpSegmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Agent registration information.</p>
     * 
     * @param request DeleteAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAtiAgentRegisterInfoResponse
     */
    public DeleteAtiAgentRegisterInfoResponse deleteAtiAgentRegisterInfoWithOptions(DeleteAtiAgentRegisterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Agent registration information.</p>
     * 
     * @param request DeleteAtiAgentRegisterInfoRequest
     * @return DeleteAtiAgentRegisterInfoResponse
     */
    public DeleteAtiAgentRegisterInfoResponse deleteAtiAgentRegisterInfo(DeleteAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a verified registrant.</p>
     * 
     * @param request DeleteAtiRegistrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAtiRegistrantResponse
     */
    public DeleteAtiRegistrantResponse deleteAtiRegistrantWithOptions(DeleteAtiRegistrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAtiRegistrant"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAtiRegistrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a verified registrant.</p>
     * 
     * @param request DeleteAtiRegistrantRequest
     * @return DeleteAtiRegistrantResponse
     */
    public DeleteAtiRegistrantResponse deleteAtiRegistrant(DeleteAtiRegistrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAtiRegistrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address.</p>
     * 
     * @param request DeleteCloudGtmAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudGtmAddressResponse
     */
    public DeleteCloudGtmAddressResponse deleteCloudGtmAddressWithOptions(DeleteCloudGtmAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudGtmAddress"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudGtmAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address.</p>
     * 
     * @param request DeleteCloudGtmAddressRequest
     * @return DeleteCloudGtmAddressResponse
     */
    public DeleteCloudGtmAddressResponse deleteCloudGtmAddress(DeleteCloudGtmAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudGtmAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool.</p>
     * 
     * @param request DeleteCloudGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudGtmAddressPoolResponse
     */
    public DeleteCloudGtmAddressPoolResponse deleteCloudGtmAddressPoolWithOptions(DeleteCloudGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool.</p>
     * 
     * @param request DeleteCloudGtmAddressPoolRequest
     * @return DeleteCloudGtmAddressPoolResponse
     */
    public DeleteCloudGtmAddressPoolResponse deleteCloudGtmAddressPool(DeleteCloudGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access domain name from the configuration of a Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * @param request DeleteCloudGtmInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudGtmInstanceConfigResponse
     */
    public DeleteCloudGtmInstanceConfigResponse deleteCloudGtmInstanceConfigWithOptions(DeleteCloudGtmInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudGtmInstanceConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudGtmInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access domain name from the configuration of a Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * @param request DeleteCloudGtmInstanceConfigRequest
     * @return DeleteCloudGtmInstanceConfigResponse
     */
    public DeleteCloudGtmInstanceConfigResponse deleteCloudGtmInstanceConfig(DeleteCloudGtmInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudGtmInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a health check template.</p>
     * 
     * @param request DeleteCloudGtmMonitorTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudGtmMonitorTemplateResponse
     */
    public DeleteCloudGtmMonitorTemplateResponse deleteCloudGtmMonitorTemplateWithOptions(DeleteCloudGtmMonitorTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudGtmMonitorTemplate"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudGtmMonitorTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a health check template.</p>
     * 
     * @param request DeleteCloudGtmMonitorTemplateRequest
     * @return DeleteCloudGtmMonitorTemplateResponse
     */
    public DeleteCloudGtmMonitorTemplateResponse deleteCloudGtmMonitorTemplate(DeleteCloudGtmMonitorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudGtmMonitorTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a batch of custom lines by specifying their unique IDs.</p>
     * 
     * @param request DeleteCustomLinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomLinesResponse
     */
    public DeleteCustomLinesResponse deleteCustomLinesWithOptions(DeleteCustomLinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineIds)) {
            query.put("LineIds", request.lineIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomLines"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a batch of custom lines by specifying their unique IDs.</p>
     * 
     * @param request DeleteCustomLinesRequest
     * @return DeleteCustomLinesResponse
     */
    public DeleteCustomLinesResponse deleteCustomLines(DeleteCustomLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomLinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified domain name from the authoritative DNS proxy.</p>
     * 
     * @param request DeleteDnsCacheDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDnsCacheDomainResponse
     */
    public DeleteDnsCacheDomainResponse deleteDnsCacheDomainWithOptions(DeleteDnsCacheDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDnsCacheDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDnsCacheDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified domain name from the authoritative DNS proxy.</p>
     * 
     * @param request DeleteDnsCacheDomainRequest
     * @return DeleteDnsCacheDomainResponse
     */
    public DeleteDnsCacheDomainResponse deleteDnsCacheDomain(DeleteDnsCacheDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDnsCacheDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access policy by its ID.</p>
     * 
     * @param request DeleteDnsGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDnsGtmAccessStrategyResponse
     */
    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategyWithOptions(DeleteDnsGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDnsGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDnsGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access policy by its ID.</p>
     * 
     * @param request DeleteDnsGtmAccessStrategyRequest
     * @return DeleteDnsGtmAccessStrategyResponse
     */
    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool by its ID.</p>
     * 
     * @param request DeleteDnsGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDnsGtmAddressPoolResponse
     */
    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPoolWithOptions(DeleteDnsGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDnsGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDnsGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool by its ID.</p>
     * 
     * @param request DeleteDnsGtmAddressPoolRequest
     * @return DeleteDnsGtmAddressPoolResponse
     */
    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDnsGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified domain name.</p>
     * 
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified domain name.</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The default group cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a domain name group and moves its domain names to the default group.</p>
     * 
     * @param request DeleteDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainGroupResponse
     */
    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The default group cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a domain name group and moves its domain names to the default group.</p>
     * 
     * @param request DeleteDomainGroupRequest
     * @return DeleteDomainGroupResponse
     */
    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DNS record based on the specified request parameters.</p>
     * 
     * @param request DeleteDomainRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainRecordResponse
     */
    public DeleteDomainRecordResponse deleteDomainRecordWithOptions(DeleteDomainRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a DNS record based on the specified request parameters.</p>
     * 
     * @param request DeleteDomainRecordRequest
     * @return DeleteDomainRecordResponse
     */
    public DeleteDomainRecordResponse deleteDomainRecord(DeleteDomainRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access policy.</p>
     * 
     * @param request DeleteGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGtmAccessStrategyResponse
     */
    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategyWithOptions(DeleteGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an access policy.</p>
     * 
     * @param request DeleteGtmAccessStrategyRequest
     * @return DeleteGtmAccessStrategyResponse
     */
    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool.</p>
     * 
     * @param request DeleteGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGtmAddressPoolResponse
     */
    public DeleteGtmAddressPoolResponse deleteGtmAddressPoolWithOptions(DeleteGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an address pool.</p>
     * 
     * @param request DeleteGtmAddressPoolRequest
     * @return DeleteGtmAddressPoolResponse
     */
    public DeleteGtmAddressPoolResponse deleteGtmAddressPool(DeleteGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a disaster recovery plan.</p>
     * 
     * @param request DeleteGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGtmRecoveryPlanResponse
     */
    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlanWithOptions(DeleteGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a disaster recovery plan.</p>
     * 
     * @param request DeleteGtmRecoveryPlanRequest
     * @return DeleteGtmRecoveryPlanResponse
     */
    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a built-in authoritative DNS record used for recursive resolution.</p>
     * 
     * @param request DeleteRecursionRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecursionRecordResponse
     */
    public DeleteRecursionRecordResponse deleteRecursionRecordWithOptions(DeleteRecursionRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecursionRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecursionRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a built-in authoritative DNS record used for recursive resolution.</p>
     * 
     * @param request DeleteRecursionRecordRequest
     * @return DeleteRecursionRecordResponse
     */
    public DeleteRecursionRecordResponse deleteRecursionRecord(DeleteRecursionRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecursionRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a zone contains locked DNS records, this operation does not delete them.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a built-in authoritative zone used for recursive resolution.</p>
     * 
     * @param request DeleteRecursionZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecursionZoneResponse
     */
    public DeleteRecursionZoneResponse deleteRecursionZoneWithOptions(DeleteRecursionZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecursionZone"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecursionZoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>If a zone contains locked DNS records, this operation does not delete them.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a built-in authoritative zone used for recursive resolution.</p>
     * 
     * @param request DeleteRecursionZoneRequest
     * @return DeleteRecursionZoneResponse
     */
    public DeleteRecursionZoneResponse deleteRecursionZone(DeleteRecursionZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecursionZoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Locked DNS records will not be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the DNS records for a specified host record.</p>
     * 
     * @param request DeleteSubDomainRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubDomainRecordsResponse
     */
    public DeleteSubDomainRecordsResponse deleteSubDomainRecordsWithOptions(DeleteSubDomainRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RR)) {
            query.put("RR", request.RR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubDomainRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubDomainRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Locked DNS records will not be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the DNS records for a specified host record.</p>
     * 
     * @param request DeleteSubDomainRecordsRequest
     * @return DeleteSubDomainRecordsResponse
     */
    public DeleteSubDomainRecordsResponse deleteSubDomainRecords(DeleteSubDomainRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubDomainRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Agent registration.</p>
     * 
     * @param request DescribeAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAtiAgentRegisterInfoResponse
     */
    public DescribeAtiAgentRegisterInfoResponse describeAtiAgentRegisterInfoWithOptions(DescribeAtiAgentRegisterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Agent registration.</p>
     * 
     * @param request DescribeAtiAgentRegisterInfoRequest
     * @return DescribeAtiAgentRegisterInfoResponse
     */
    public DescribeAtiAgentRegisterInfoResponse describeAtiAgentRegisterInfo(DescribeAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为sdk查询agent信息功能</p>
     * 
     * @param request DescribeAtiAgentRegisterInfoMarketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAtiAgentRegisterInfoMarketResponse
     */
    public DescribeAtiAgentRegisterInfoMarketResponse describeAtiAgentRegisterInfoMarketWithOptions(DescribeAtiAgentRegisterInfoMarketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentHost)) {
            query.put("AgentHost", request.agentHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
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
            new TeaPair("action", "DescribeAtiAgentRegisterInfoMarket"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAtiAgentRegisterInfoMarketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为sdk查询agent信息功能</p>
     * 
     * @param request DescribeAtiAgentRegisterInfoMarketRequest
     * @return DescribeAtiAgentRegisterInfoMarketResponse
     */
    public DescribeAtiAgentRegisterInfoMarketResponse describeAtiAgentRegisterInfoMarket(DescribeAtiAgentRegisterInfoMarketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAtiAgentRegisterInfoMarketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert settings.</p>
     * 
     * @param request DescribeAtiAlertSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAtiAlertSettingsResponse
     */
    public DescribeAtiAlertSettingsResponse describeAtiAlertSettingsWithOptions(DescribeAtiAlertSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAtiAlertSettings"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAtiAlertSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert settings.</p>
     * 
     * @param request DescribeAtiAlertSettingsRequest
     * @return DescribeAtiAlertSettingsResponse
     */
    public DescribeAtiAlertSettingsResponse describeAtiAlertSettings(DescribeAtiAlertSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAtiAlertSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a certificate.</p>
     * 
     * @param request DescribeAtiCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAtiCertificateResponse
     */
    public DescribeAtiCertificateResponse describeAtiCertificateWithOptions(DescribeAtiCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentCertificateId)) {
            query.put("AgentCertificateId", request.agentCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAtiCertificate"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAtiCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a certificate.</p>
     * 
     * @param request DescribeAtiCertificateRequest
     * @return DescribeAtiCertificateResponse
     */
    public DescribeAtiCertificateResponse describeAtiCertificate(DescribeAtiCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAtiCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a real-name verified registrant.</p>
     * 
     * @param request DescribeAtiRegistrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAtiRegistrantResponse
     */
    public DescribeAtiRegistrantResponse describeAtiRegistrantWithOptions(DescribeAtiRegistrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAtiRegistrant"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAtiRegistrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a real-name verified registrant.</p>
     * 
     * @param request DescribeAtiRegistrantRequest
     * @return DescribeAtiRegistrantResponse
     */
    public DescribeAtiRegistrantResponse describeAtiRegistrant(DescribeAtiRegistrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAtiRegistrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution results of a batch operation task using a task ID. If you do not specify a task ID, the results of the most recent batch task are returned.</p>
     * 
     * @param request DescribeBatchResultCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBatchResultCountResponse
     */
    public DescribeBatchResultCountResponse describeBatchResultCountWithOptions(DescribeBatchResultCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchType)) {
            query.put("BatchType", request.batchType);
        }

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
            new TeaPair("action", "DescribeBatchResultCount"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBatchResultCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution results of a batch operation task using a task ID. If you do not specify a task ID, the results of the most recent batch task are returned.</p>
     * 
     * @param request DescribeBatchResultCountRequest
     * @return DescribeBatchResultCountResponse
     */
    public DescribeBatchResultCountResponse describeBatchResultCount(DescribeBatchResultCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBatchResultCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisite: You can call this operation after the batch task is complete.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a batch processing result.</p>
     * 
     * @param request DescribeBatchResultDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBatchResultDetailResponse
     */
    public DescribeBatchResultDetailResponse describeBatchResultDetailWithOptions(DescribeBatchResultDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchType)) {
            query.put("BatchType", request.batchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBatchResultDetail"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBatchResultDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisite: You can call this operation after the batch task is complete.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a batch processing result.</p>
     * 
     * @param request DescribeBatchResultDetailRequest
     * @return DescribeBatchResultDetailResponse
     */
    public DescribeBatchResultDetailResponse describeBatchResultDetail(DescribeBatchResultDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBatchResultDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of an address based on the specified input parameters.</p>
     * 
     * @param request DescribeCloudGtmAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmAddressResponse
     */
    public DescribeCloudGtmAddressResponse describeCloudGtmAddressWithOptions(DescribeCloudGtmAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmAddress"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of an address based on the specified input parameters.</p>
     * 
     * @param request DescribeCloudGtmAddressRequest
     * @return DescribeCloudGtmAddressResponse
     */
    public DescribeCloudGtmAddressResponse describeCloudGtmAddress(DescribeCloudGtmAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a specified address pool.</p>
     * 
     * @param request DescribeCloudGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmAddressPoolResponse
     */
    public DescribeCloudGtmAddressPoolResponse describeCloudGtmAddressPoolWithOptions(DescribeCloudGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a specified address pool.</p>
     * 
     * @param request DescribeCloudGtmAddressPoolRequest
     * @return DescribeCloudGtmAddressPoolResponse
     */
    public DescribeCloudGtmAddressPoolResponse describeCloudGtmAddressPool(DescribeCloudGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about the instances that reference an address pool.</p>
     * 
     * @param request DescribeCloudGtmAddressPoolReferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmAddressPoolReferenceResponse
     */
    public DescribeCloudGtmAddressPoolReferenceResponse describeCloudGtmAddressPoolReferenceWithOptions(DescribeCloudGtmAddressPoolReferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmAddressPoolReference"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmAddressPoolReferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about the instances that reference an address pool.</p>
     * 
     * @param request DescribeCloudGtmAddressPoolReferenceRequest
     * @return DescribeCloudGtmAddressPoolReferenceResponse
     */
    public DescribeCloudGtmAddressPoolReferenceResponse describeCloudGtmAddressPoolReference(DescribeCloudGtmAddressPoolReferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmAddressPoolReferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the address pools and Global Traffic Manager (GTM) 3.0 instances that reference a specified address.</p>
     * 
     * @param request DescribeCloudGtmAddressReferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmAddressReferenceResponse
     */
    public DescribeCloudGtmAddressReferenceResponse describeCloudGtmAddressReferenceWithOptions(DescribeCloudGtmAddressReferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmAddressReference"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmAddressReferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the address pools and Global Traffic Manager (GTM) 3.0 instances that reference a specified address.</p>
     * 
     * @param request DescribeCloudGtmAddressReferenceRequest
     * @return DescribeCloudGtmAddressReferenceResponse
     */
    public DescribeCloudGtmAddressReferenceResponse describeCloudGtmAddressReference(DescribeCloudGtmAddressReferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmAddressReferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global alert configuration for Global Traffic Manager (GTM).</p>
     * 
     * @param request DescribeCloudGtmGlobalAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmGlobalAlertResponse
     */
    public DescribeCloudGtmGlobalAlertResponse describeCloudGtmGlobalAlertWithOptions(DescribeCloudGtmGlobalAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmGlobalAlert"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmGlobalAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global alert configuration for Global Traffic Manager (GTM).</p>
     * 
     * @param request DescribeCloudGtmGlobalAlertRequest
     * @return DescribeCloudGtmGlobalAlertResponse
     */
    public DescribeCloudGtmGlobalAlertResponse describeCloudGtmGlobalAlert(DescribeCloudGtmGlobalAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmGlobalAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert configuration for an instance.</p>
     * 
     * @param request DescribeCloudGtmInstanceConfigAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmInstanceConfigAlertResponse
     */
    public DescribeCloudGtmInstanceConfigAlertResponse describeCloudGtmInstanceConfigAlertWithOptions(DescribeCloudGtmInstanceConfigAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmInstanceConfigAlert"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmInstanceConfigAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert configuration for an instance.</p>
     * 
     * @param request DescribeCloudGtmInstanceConfigAlertRequest
     * @return DescribeCloudGtmInstanceConfigAlertResponse
     */
    public DescribeCloudGtmInstanceConfigAlertResponse describeCloudGtmInstanceConfigAlert(DescribeCloudGtmInstanceConfigAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmInstanceConfigAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the full configuration of a GTM 3.0 access domain name, including alert settings, address pools, and address details.</p>
     * 
     * @param request DescribeCloudGtmInstanceConfigFullInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmInstanceConfigFullInfoResponse
     */
    public DescribeCloudGtmInstanceConfigFullInfoResponse describeCloudGtmInstanceConfigFullInfoWithOptions(DescribeCloudGtmInstanceConfigFullInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmInstanceConfigFullInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmInstanceConfigFullInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the full configuration of a GTM 3.0 access domain name, including alert settings, address pools, and address details.</p>
     * 
     * @param request DescribeCloudGtmInstanceConfigFullInfoRequest
     * @return DescribeCloudGtmInstanceConfigFullInfoResponse
     */
    public DescribeCloudGtmInstanceConfigFullInfoResponse describeCloudGtmInstanceConfigFullInfo(DescribeCloudGtmInstanceConfigFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmInstanceConfigFullInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a specified health check template.</p>
     * 
     * @param request DescribeCloudGtmMonitorTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmMonitorTemplateResponse
     */
    public DescribeCloudGtmMonitorTemplateResponse describeCloudGtmMonitorTemplateWithOptions(DescribeCloudGtmMonitorTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmMonitorTemplate"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmMonitorTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a specified health check template.</p>
     * 
     * @param request DescribeCloudGtmMonitorTemplateRequest
     * @return DescribeCloudGtmMonitorTemplateResponse
     */
    public DescribeCloudGtmMonitorTemplateResponse describeCloudGtmMonitorTemplate(DescribeCloudGtmMonitorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmMonitorTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCloudGtmSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmSummaryResponse
     */
    public DescribeCloudGtmSummaryResponse describeCloudGtmSummaryWithOptions(DescribeCloudGtmSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmSummaryResponse());
    }

    /**
     * @param request DescribeCloudGtmSummaryRequest
     * @return DescribeCloudGtmSummaryResponse
     */
    public DescribeCloudGtmSummaryResponse describeCloudGtmSummary(DescribeCloudGtmSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the system lines supported by Global Traffic Manager (GTM).</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudGtmSystemLinesResponse
     */
    public DescribeCloudGtmSystemLinesResponse describeCloudGtmSystemLinesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudGtmSystemLines"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudGtmSystemLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the system lines supported by Global Traffic Manager (GTM).</p>
     * @return DescribeCloudGtmSystemLinesResponse
     */
    public DescribeCloudGtmSystemLinesResponse describeCloudGtmSystemLines() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudGtmSystemLinesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a custom line by its unique ID.</p>
     * 
     * @param request DescribeCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomLineResponse
     */
    public DescribeCustomLineResponse describeCustomLineWithOptions(DescribeCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            query.put("LineId", request.lineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomLine"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a custom line by its unique ID.</p>
     * 
     * @param request DescribeCustomLineRequest
     * @return DescribeCustomLineResponse
     */
    public DescribeCustomLineResponse describeCustomLine(DescribeCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom lines for a domain name.</p>
     * 
     * @param request DescribeCustomLinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomLinesResponse
     */
    public DescribeCustomLinesResponse describeCustomLinesWithOptions(DescribeCustomLinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeCustomLines"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the custom lines for a domain name.</p>
     * 
     * @param request DescribeCustomLinesRequest
     * @return DescribeCustomLinesResponse
     */
    public DescribeCustomLinesResponse describeCustomLines(DescribeCustomLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomLinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of subdomains that have weight configurations based on the specified parameters.</p>
     * 
     * @param request DescribeDNSSLBSubDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDNSSLBSubDomainsResponse
     */
    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomainsWithOptions(DescribeDNSSLBSubDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDNSSLBSubDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDNSSLBSubDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of subdomains that have weight configurations based on the specified parameters.</p>
     * 
     * @param request DescribeDNSSLBSubDomainsRequest
     * @return DescribeDNSSLBSubDomainsResponse
     */
    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomains(DescribeDNSSLBSubDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDNSSLBSubDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries authoritative proxy domain names based on the specified parameters.</p>
     * 
     * @param request DescribeDnsCacheDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsCacheDomainsResponse
     */
    public DescribeDnsCacheDomainsResponse describeDnsCacheDomainsWithOptions(DescribeDnsCacheDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeDnsCacheDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsCacheDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries authoritative proxy domain names based on the specified parameters.</p>
     * 
     * @param request DescribeDnsCacheDomainsRequest
     * @return DescribeDnsCacheDomainsResponse
     */
    public DescribeDnsCacheDomainsResponse describeDnsCacheDomains(DescribeDnsCacheDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsCacheDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access strategies for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAccessStrategiesResponse
     */
    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategiesWithOptions(DescribeDnsGtmAccessStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyMode)) {
            query.put("StrategyMode", request.strategyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAccessStrategies"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAccessStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access strategies for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategiesRequest
     * @return DescribeDnsGtmAccessStrategiesResponse
     */
    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategies(DescribeDnsGtmAccessStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAccessStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified access strategy.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAccessStrategyResponse
     */
    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategyWithOptions(DescribeDnsGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified access strategy.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategyRequest
     * @return DescribeDnsGtmAccessStrategyResponse
     */
    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategy(DescribeDnsGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the available configurations for an access policy based on an instance ID.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategyAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAccessStrategyAvailableConfigResponse
     */
    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfigWithOptions(DescribeDnsGtmAccessStrategyAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyMode)) {
            query.put("StrategyMode", request.strategyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAccessStrategyAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAccessStrategyAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the available configurations for an access policy based on an instance ID.</p>
     * 
     * @param request DescribeDnsGtmAccessStrategyAvailableConfigRequest
     * @return DescribeDnsGtmAccessStrategyAvailableConfigResponse
     */
    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfig(DescribeDnsGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region where an address is located.</p>
     * 
     * @param request DescribeDnsGtmAddrAttributeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAddrAttributeInfoResponse
     */
    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfoWithOptions(DescribeDnsGtmAddrAttributeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrs)) {
            query.put("Addrs", request.addrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAddrAttributeInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAddrAttributeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the region where an address is located.</p>
     * 
     * @param request DescribeDnsGtmAddrAttributeInfoRequest
     * @return DescribeDnsGtmAddrAttributeInfoResponse
     */
    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfo(DescribeDnsGtmAddrAttributeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAddrAttributeInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for an address pool in a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmAddressPoolAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAddressPoolAvailableConfigResponse
     */
    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfigWithOptions(DescribeDnsGtmAddressPoolAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAddressPoolAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAddressPoolAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for an address pool in a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmAddressPoolAvailableConfigRequest
     * @return DescribeDnsGtmAddressPoolAvailableConfigResponse
     */
    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfig(DescribeDnsGtmAddressPoolAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAddressPoolAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available alert contact groups.</p>
     * 
     * @param request DescribeDnsGtmAvailableAlertGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmAvailableAlertGroupResponse
     */
    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroupWithOptions(DescribeDnsGtmAvailableAlertGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmAvailableAlertGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmAvailableAlertGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available alert contact groups.</p>
     * 
     * @param request DescribeDnsGtmAvailableAlertGroupRequest
     * @return DescribeDnsGtmAvailableAlertGroupResponse
     */
    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroup(DescribeDnsGtmAvailableAlertGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance based on the specified instance ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstanceResponse
     */
    public DescribeDnsGtmInstanceResponse describeDnsGtmInstanceWithOptions(DescribeDnsGtmInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmInstance"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an instance based on the specified instance ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceRequest
     * @return DescribeDnsGtmInstanceResponse
     */
    public DescribeDnsGtmInstanceResponse describeDnsGtmInstance(DescribeDnsGtmInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an address pool by its ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstanceAddressPoolResponse
     */
    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPoolWithOptions(DescribeDnsGtmInstanceAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmInstanceAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstanceAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an address pool by its ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceAddressPoolRequest
     * @return DescribeDnsGtmInstanceAddressPoolResponse
     */
    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPool(DescribeDnsGtmInstanceAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the address pools of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmInstanceAddressPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstanceAddressPoolsResponse
     */
    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPoolsWithOptions(DescribeDnsGtmInstanceAddressPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeDnsGtmInstanceAddressPools"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstanceAddressPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the address pools of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeDnsGtmInstanceAddressPoolsRequest
     * @return DescribeDnsGtmInstanceAddressPoolsResponse
     */
    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPools(DescribeDnsGtmInstanceAddressPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the status of an instance based on its ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstanceStatusResponse
     */
    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatusWithOptions(DescribeDnsGtmInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmInstanceStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstanceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the status of an instance based on its ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceStatusRequest
     * @return DescribeDnsGtmInstanceStatusResponse
     */
    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatus(DescribeDnsGtmInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the system-assigned CNAME based on the specified instance ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceSystemCnameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstanceSystemCnameResponse
     */
    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCnameWithOptions(DescribeDnsGtmInstanceSystemCnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmInstanceSystemCname"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstanceSystemCnameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the system-assigned CNAME based on the specified instance ID.</p>
     * 
     * @param request DescribeDnsGtmInstanceSystemCnameRequest
     * @return DescribeDnsGtmInstanceSystemCnameResponse
     */
    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCname(DescribeDnsGtmInstanceSystemCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request DescribeDnsGtmInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmInstancesResponse
     */
    public DescribeDnsGtmInstancesResponse describeDnsGtmInstancesWithOptions(DescribeDnsGtmInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request DescribeDnsGtmInstancesRequest
     * @return DescribeDnsGtmInstancesResponse
     */
    public DescribeDnsGtmInstancesResponse describeDnsGtmInstances(DescribeDnsGtmInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for an instance.</p>
     * 
     * @param request DescribeDnsGtmLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmLogsResponse
     */
    public DescribeDnsGtmLogsResponse describeDnsGtmLogsWithOptions(DescribeDnsGtmLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for an instance.</p>
     * 
     * @param request DescribeDnsGtmLogsRequest
     * @return DescribeDnsGtmLogsResponse
     */
    public DescribeDnsGtmLogsResponse describeDnsGtmLogs(DescribeDnsGtmLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for DNS health checks.</p>
     * 
     * @param request DescribeDnsGtmMonitorAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmMonitorAvailableConfigResponse
     */
    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfigWithOptions(DescribeDnsGtmMonitorAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmMonitorAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmMonitorAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for DNS health checks.</p>
     * 
     * @param request DescribeDnsGtmMonitorAvailableConfigRequest
     * @return DescribeDnsGtmMonitorAvailableConfigResponse
     */
    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfig(DescribeDnsGtmMonitorAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check configuration for an address pool.</p>
     * 
     * @param request DescribeDnsGtmMonitorConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsGtmMonitorConfigResponse
     */
    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfigWithOptions(DescribeDnsGtmMonitorConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsGtmMonitorConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsGtmMonitorConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check configuration for an address pool.</p>
     * 
     * @param request DescribeDnsGtmMonitorConfigRequest
     * @return DescribeDnsGtmMonitorConfigResponse
     */
    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfig(DescribeDnsGtmMonitorConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsGtmMonitorConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a paid Alibaba Cloud DNS instance by its instance ID.</p>
     * 
     * @param request DescribeDnsProductInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsProductInstanceResponse
     */
    public DescribeDnsProductInstanceResponse describeDnsProductInstanceWithOptions(DescribeDnsProductInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsProductInstance"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsProductInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a paid Alibaba Cloud DNS instance by its instance ID.</p>
     * 
     * @param request DescribeDnsProductInstanceRequest
     * @return DescribeDnsProductInstanceResponse
     */
    public DescribeDnsProductInstanceResponse describeDnsProductInstance(DescribeDnsProductInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsProductInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p><strong>If the response does not contain a domain name, the Alibaba Cloud DNS instance is not associated with any domain names.</strong></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of paid DNS product instances that match the specified parameters.</p>
     * 
     * @param request DescribeDnsProductInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDnsProductInstancesResponse
     */
    public DescribeDnsProductInstancesResponse describeDnsProductInstancesWithOptions(DescribeDnsProductInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDnsProductInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDnsProductInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p><strong>If the response does not contain a domain name, the Alibaba Cloud DNS instance is not associated with any domain names.</strong></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of paid DNS product instances that match the specified parameters.</p>
     * 
     * @param request DescribeDnsProductInstancesRequest
     * @return DescribeDnsProductInstancesResponse
     */
    public DescribeDnsProductInstancesResponse describeDnsProductInstances(DescribeDnsProductInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDnsProductInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an overview of request statistics for a DNS over HTTPS (DoH) account.</p>
     * 
     * @param request DescribeDohAccountStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohAccountStatisticsResponse
     */
    public DescribeDohAccountStatisticsResponse describeDohAccountStatisticsWithOptions(DescribeDohAccountStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohAccountStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohAccountStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an overview of request statistics for a DNS over HTTPS (DoH) account.</p>
     * 
     * @param request DescribeDohAccountStatisticsRequest
     * @return DescribeDohAccountStatisticsResponse
     */
    public DescribeDohAccountStatisticsResponse describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohAccountStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an overview of statistics for DNS over HTTPS (DoH) requests for a domain name.</p>
     * 
     * @param request DescribeDohDomainStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohDomainStatisticsResponse
     */
    public DescribeDohDomainStatisticsResponse describeDohDomainStatisticsWithOptions(DescribeDohDomainStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohDomainStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohDomainStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an overview of statistics for DNS over HTTPS (DoH) requests for a domain name.</p>
     * 
     * @param request DescribeDohDomainStatisticsRequest
     * @return DescribeDohDomainStatisticsResponse
     */
    public DescribeDohDomainStatisticsResponse describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohDomainStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries request statistics for DNS over HTTPS (DoH) domain names.</p>
     * 
     * @param request DescribeDohDomainStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohDomainStatisticsSummaryResponse
     */
    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummaryWithOptions(DescribeDohDomainStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohDomainStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohDomainStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries request statistics for DNS over HTTPS (DoH) domain names.</p>
     * 
     * @param request DescribeDohDomainStatisticsSummaryRequest
     * @return DescribeDohDomainStatisticsSummaryResponse
     */
    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohDomainStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries for statistics on DNS over HTTPS (DoH) requests for a subdomain.</p>
     * 
     * @param request DescribeDohSubDomainStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohSubDomainStatisticsResponse
     */
    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatisticsWithOptions(DescribeDohSubDomainStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohSubDomainStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohSubDomainStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries for statistics on DNS over HTTPS (DoH) requests for a subdomain.</p>
     * 
     * @param request DescribeDohSubDomainStatisticsRequest
     * @return DescribeDohSubDomainStatisticsResponse
     */
    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohSubDomainStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a summary of request statistics for subdomains using DNS over HTTPS (DoH).</p>
     * 
     * @param request DescribeDohSubDomainStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohSubDomainStatisticsSummaryResponse
     */
    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummaryWithOptions(DescribeDohSubDomainStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohSubDomainStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohSubDomainStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a summary of request statistics for subdomains using DNS over HTTPS (DoH).</p>
     * 
     * @param request DescribeDohSubDomainStatisticsSummaryRequest
     * @return DescribeDohSubDomainStatisticsSummaryResponse
     */
    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohSubDomainStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information of a DNS over HTTPS (DoH) user.</p>
     * 
     * @param request DescribeDohUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDohUserInfoResponse
     */
    public DescribeDohUserInfoResponse describeDohUserInfoWithOptions(DescribeDohUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDohUserInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDohUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information of a DNS over HTTPS (DoH) user.</p>
     * 
     * @param request DescribeDohUserInfoRequest
     * @return DescribeDohUserInfoResponse
     */
    public DescribeDohUserInfoResponse describeDohUserInfo(DescribeDohUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDohUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Domain Name System Security Extensions (DNSSEC) information for a specified domain name.</p>
     * 
     * @param request DescribeDomainDnssecInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainDnssecInfoResponse
     */
    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfoWithOptions(DescribeDomainDnssecInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainDnssecInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainDnssecInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Domain Name System Security Extensions (DNSSEC) information for a specified domain name.</p>
     * 
     * @param request DescribeDomainDnssecInfoRequest
     * @return DescribeDomainDnssecInfoResponse
     */
    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainDnssecInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries domain name groups.</p>
     * 
     * @param request DescribeDomainGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainGroupsResponse
     */
    public DescribeDomainGroupsResponse describeDomainGroupsWithOptions(DescribeDomainGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeDomainGroups"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries domain name groups.</p>
     * 
     * @param request DescribeDomainGroupsRequest
     * @return DescribeDomainGroupsResponse
     */
    public DescribeDomainGroupsResponse describeDomainGroups(DescribeDomainGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the domain name is bound to an instance of Alibaba Cloud DNS Ultimate Edition. For more information about line enumeration, see the RecordLines response parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a specified domain name.</p>
     * 
     * @param request DescribeDomainInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainInfoResponse
     */
    public DescribeDomainInfoResponse describeDomainInfoWithOptions(DescribeDomainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needDetailAttributes)) {
            query.put("NeedDetailAttributes", request.needDetailAttributes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the domain name is bound to an instance of Alibaba Cloud DNS Ultimate Edition. For more information about line enumeration, see the RecordLines response parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a specified domain name.</p>
     * 
     * @param request DescribeDomainInfoRequest
     * @return DescribeDomainInfoResponse
     */
    public DescribeDomainInfoResponse describeDomainInfo(DescribeDomainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for a domain name based on the specified parameters.</p>
     * 
     * @param request DescribeDomainLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainLogsResponse
     */
    public DescribeDomainLogsResponse describeDomainLogsWithOptions(DescribeDomainLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for a domain name based on the specified parameters.</p>
     * 
     * @param request DescribeDomainLogsRequest
     * @return DescribeDomainLogsResponse
     */
    public DescribeDomainLogsResponse describeDomainLogs(DescribeDomainLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation directly queries the authoritative server of the domain name registry to retrieve the DNS server names for the domain name. An error may be returned if the domain name is inactive. For example, if the domain name has a serverHold or clientHold status, or has not passed identity verification.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the current list of name servers for a domain name and determines whether the servers are managed by Alibaba Cloud DNS.</p>
     * 
     * @param request DescribeDomainNsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainNsResponse
     */
    public DescribeDomainNsResponse describeDomainNsWithOptions(DescribeDomainNsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainNs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainNsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation directly queries the authoritative server of the domain name registry to retrieve the DNS server names for the domain name. An error may be returned if the domain name is inactive. For example, if the domain name has a serverHold or clientHold status, or has not passed identity verification.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the current list of name servers for a domain name and determines whether the servers are managed by Alibaba Cloud DNS.</p>
     * 
     * @param request DescribeDomainNsRequest
     * @return DescribeDomainNsResponse
     */
    public DescribeDomainNsResponse describeDomainNs(DescribeDomainNsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainNsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a DNS record by its ID.</p>
     * 
     * @param request DescribeDomainRecordInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRecordInfoResponse
     */
    public DescribeDomainRecordInfoResponse describeDomainRecordInfoWithOptions(DescribeDomainRecordInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRecordInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRecordInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a DNS record by its ID.</p>
     * 
     * @param request DescribeDomainRecordInfoRequest
     * @return DescribeDomainRecordInfoResponse
     */
    public DescribeDomainRecordInfoResponse describeDomainRecordInfo(DescribeDomainRecordInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRecordInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify the domain name (DomainName), page number (PageNumber), and page size (PageSize) to retrieve a list of DNS records.</li>
     * <li>You can specify a keyword for the host record (RRKeyWord), record type (TypeKeyWord), or record value (ValueKeyWord) to query DNS records that contain the keyword.</li>
     * <li>By default, DNS records are sorted in descending order by the time they were added.</li>
     * <li>You can specify a domain group ID (GroupId) to query the DNS records in a specific group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the DNS records for a specified root domain based on the input parameters.</p>
     * 
     * @param request DescribeDomainRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainRecordsResponse
     */
    public DescribeDomainRecordsResponse describeDomainRecordsWithOptions(DescribeDomainRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RRKeyWord)) {
            query.put("RRKeyWord", request.RRKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeKeyWord)) {
            query.put("TypeKeyWord", request.typeKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueKeyWord)) {
            query.put("ValueKeyWord", request.valueKeyWord);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify the domain name (DomainName), page number (PageNumber), and page size (PageSize) to retrieve a list of DNS records.</li>
     * <li>You can specify a keyword for the host record (RRKeyWord), record type (TypeKeyWord), or record value (ValueKeyWord) to query DNS records that contain the keyword.</li>
     * <li>By default, DNS records are sorted in descending order by the time they were added.</li>
     * <li>You can specify a domain group ID (GroupId) to query the DNS records in a specific group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the DNS records for a specified root domain based on the input parameters.</p>
     * 
     * @param request DescribeDomainRecordsRequest
     * @return DescribeDomainRecordsResponse
     */
    public DescribeDomainRecordsResponse describeDomainRecords(DescribeDomainRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request volumes for all paid domain names in your account.</p>
     * 
     * @param request DescribeDomainResolveStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainResolveStatisticsSummaryResponse
     */
    public DescribeDomainResolveStatisticsSummaryResponse describeDomainResolveStatisticsSummaryWithOptions(DescribeDomainResolveStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainResolveStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResolveStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request volumes for all paid domain names in your account.</p>
     * 
     * @param request DescribeDomainResolveStatisticsSummaryRequest
     * @return DescribeDomainResolveStatisticsSummaryResponse
     */
    public DescribeDomainResolveStatisticsSummaryResponse describeDomainResolveStatisticsSummary(DescribeDomainResolveStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainResolveStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is collected hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of real-time requests for a specified primary domain name.</p>
     * 
     * @param request DescribeDomainStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainStatisticsResponse
     */
    public DescribeDomainStatisticsResponse describeDomainStatisticsWithOptions(DescribeDomainStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is collected hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of real-time requests for a specified primary domain name.</p>
     * 
     * @param request DescribeDomainStatisticsRequest
     * @return DescribeDomainStatisticsResponse
     */
    public DescribeDomainStatisticsResponse describeDomainStatistics(DescribeDomainStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of requests for all paid domain names in your account.</p>
     * 
     * @param request DescribeDomainStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainStatisticsSummaryResponse
     */
    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummaryWithOptions(DescribeDomainStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of requests for all paid domain names in your account.</p>
     * 
     * @param request DescribeDomainStatisticsSummaryRequest
     * @return DescribeDomainStatisticsSummaryResponse
     */
    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can specify a page number (PageNumber) and page size (PageSize) to retrieve a paginated list of domain names.</li>
     * <li>You can specify a keyword (KeyWord) to query for domain names that contain the specified keyword.</li>
     * <li>By default, domain names are sorted in descending order of their creation time.</li>
     * <li>You can specify a domain name group ID (GroupId) to query for domain names in a specific group. This lets you retrieve all domain names or only the domain names that are not assigned to a group.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of domain names based on specified parameters.</p>
     * 
     * @param request DescribeDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.starmark)) {
            query.put("Starmark", request.starmark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You can specify a page number (PageNumber) and page size (PageSize) to retrieve a paginated list of domain names.</li>
     * <li>You can specify a keyword (KeyWord) to query for domain names that contain the specified keyword.</li>
     * <li>By default, domain names are sorted in descending order of their creation time.</li>
     * <li>You can specify a domain name group ID (GroupId) to query for domain names in a specific group. This lets you retrieve all domain names or only the domain names that are not assigned to a group.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of domain names based on specified parameters.</p>
     * 
     * @param request DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access policies for an instance.</p>
     * 
     * @param request DescribeGtmAccessStrategiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmAccessStrategiesResponse
     */
    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategiesWithOptions(DescribeGtmAccessStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeGtmAccessStrategies"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmAccessStrategiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access policies for an instance.</p>
     * 
     * @param request DescribeGtmAccessStrategiesRequest
     * @return DescribeGtmAccessStrategiesResponse
     */
    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategies(DescribeGtmAccessStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmAccessStrategiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access policy based on the policy ID.</p>
     * 
     * @param request DescribeGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmAccessStrategyResponse
     */
    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategyWithOptions(DescribeGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an access policy based on the policy ID.</p>
     * 
     * @param request DescribeGtmAccessStrategyRequest
     * @return DescribeGtmAccessStrategyResponse
     */
    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategy(DescribeGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for an access policy.</p>
     * 
     * @param request DescribeGtmAccessStrategyAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmAccessStrategyAvailableConfigResponse
     */
    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfigWithOptions(DescribeGtmAccessStrategyAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmAccessStrategyAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmAccessStrategyAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available configurations for an access policy.</p>
     * 
     * @param request DescribeGtmAccessStrategyAvailableConfigRequest
     * @return DescribeGtmAccessStrategyAvailableConfigResponse
     */
    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfig(DescribeGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available alert contact groups for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmAvailableAlertGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmAvailableAlertGroupResponse
     */
    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroupWithOptions(DescribeGtmAvailableAlertGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmAvailableAlertGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmAvailableAlertGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of available alert contact groups for a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmAvailableAlertGroupRequest
     * @return DescribeGtmAvailableAlertGroupResponse
     */
    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroup(DescribeGtmAvailableAlertGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstanceResponse
     */
    public DescribeGtmInstanceResponse describeGtmInstanceWithOptions(DescribeGtmInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needDetailAttributes)) {
            query.put("NeedDetailAttributes", request.needDetailAttributes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmInstance"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmInstanceRequest
     * @return DescribeGtmInstanceResponse
     */
    public DescribeGtmInstanceResponse describeGtmInstance(DescribeGtmInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the details of an address pool.</p>
     * 
     * @param request DescribeGtmInstanceAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstanceAddressPoolResponse
     */
    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPoolWithOptions(DescribeGtmInstanceAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmInstanceAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstanceAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the details of an address pool.</p>
     * 
     * @param request DescribeGtmInstanceAddressPoolRequest
     * @return DescribeGtmInstanceAddressPoolResponse
     */
    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPool(DescribeGtmInstanceAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the address pools of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmInstanceAddressPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstanceAddressPoolsResponse
     */
    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPoolsWithOptions(DescribeGtmInstanceAddressPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeGtmInstanceAddressPools"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstanceAddressPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the address pools of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request DescribeGtmInstanceAddressPoolsRequest
     * @return DescribeGtmInstanceAddressPoolsResponse
     */
    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPools(DescribeGtmInstanceAddressPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current status of an instance.</p>
     * 
     * @param request DescribeGtmInstanceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstanceStatusResponse
     */
    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatusWithOptions(DescribeGtmInstanceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmInstanceStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstanceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the current status of an instance.</p>
     * 
     * @param request DescribeGtmInstanceStatusRequest
     * @return DescribeGtmInstanceStatusResponse
     */
    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatus(DescribeGtmInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstanceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the system-assigned CNAME domain name.</p>
     * 
     * @param request DescribeGtmInstanceSystemCnameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstanceSystemCnameResponse
     */
    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCnameWithOptions(DescribeGtmInstanceSystemCnameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmInstanceSystemCname"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstanceSystemCnameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the system-assigned CNAME domain name.</p>
     * 
     * @param request DescribeGtmInstanceSystemCnameRequest
     * @return DescribeGtmInstanceSystemCnameResponse
     */
    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCname(DescribeGtmInstanceSystemCnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Global Traffic Manager (GTM) instances.</p>
     * 
     * @param request DescribeGtmInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmInstancesResponse
     */
    public DescribeGtmInstancesResponse describeGtmInstancesWithOptions(DescribeGtmInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needDetailAttributes)) {
            query.put("NeedDetailAttributes", request.needDetailAttributes);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Global Traffic Manager (GTM) instances.</p>
     * 
     * @param request DescribeGtmInstancesRequest
     * @return DescribeGtmInstancesResponse
     */
    public DescribeGtmInstancesResponse describeGtmInstances(DescribeGtmInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of logs.</p>
     * 
     * @param request DescribeGtmLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmLogsResponse
     */
    public DescribeGtmLogsResponse describeGtmLogsWithOptions(DescribeGtmLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of logs.</p>
     * 
     * @param request DescribeGtmLogsRequest
     * @return DescribeGtmLogsResponse
     */
    public DescribeGtmLogsResponse describeGtmLogs(DescribeGtmLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available configurations for health checks.</p>
     * 
     * @param request DescribeGtmMonitorAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmMonitorAvailableConfigResponse
     */
    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfigWithOptions(DescribeGtmMonitorAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmMonitorAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmMonitorAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available configurations for health checks.</p>
     * 
     * @param request DescribeGtmMonitorAvailableConfigRequest
     * @return DescribeGtmMonitorAvailableConfigResponse
     */
    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfig(DescribeGtmMonitorAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the health check configuration for an address pool.</p>
     * 
     * @param request DescribeGtmMonitorConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmMonitorConfigResponse
     */
    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfigWithOptions(DescribeGtmMonitorConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmMonitorConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmMonitorConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the health check configuration for an address pool.</p>
     * 
     * @param request DescribeGtmMonitorConfigRequest
     * @return DescribeGtmMonitorConfigResponse
     */
    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfig(DescribeGtmMonitorConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmMonitorConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a disaster recovery plan.</p>
     * 
     * @param request DescribeGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmRecoveryPlanResponse
     */
    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlanWithOptions(DescribeGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a disaster recovery plan.</p>
     * 
     * @param request DescribeGtmRecoveryPlanRequest
     * @return DescribeGtmRecoveryPlanResponse
     */
    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlan(DescribeGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the available configurations for a disaster recovery plan.</p>
     * 
     * @param request DescribeGtmRecoveryPlanAvailableConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmRecoveryPlanAvailableConfigResponse
     */
    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfigWithOptions(DescribeGtmRecoveryPlanAvailableConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGtmRecoveryPlanAvailableConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmRecoveryPlanAvailableConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes the available configurations for a disaster recovery plan.</p>
     * 
     * @param request DescribeGtmRecoveryPlanAvailableConfigRequest
     * @return DescribeGtmRecoveryPlanAvailableConfigResponse
     */
    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfig(DescribeGtmRecoveryPlanAvailableConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmRecoveryPlanAvailableConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of disaster recovery plans.</p>
     * 
     * @param request DescribeGtmRecoveryPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGtmRecoveryPlansResponse
     */
    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlansWithOptions(DescribeGtmRecoveryPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeGtmRecoveryPlans"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGtmRecoveryPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of disaster recovery plans.</p>
     * 
     * @param request DescribeGtmRecoveryPlansRequest
     * @return DescribeGtmRecoveryPlansResponse
     */
    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlans(DescribeGtmRecoveryPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGtmRecoveryPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of domain names that are attached to an instance.</p>
     * 
     * @param request DescribeInstanceDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDomainsResponse
     */
    public DescribeInstanceDomainsResponse describeInstanceDomainsWithOptions(DescribeInstanceDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainKeywords)) {
            query.put("DomainKeywords", request.domainKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribeInstanceDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of domain names that are attached to an instance.</p>
     * 
     * @param request DescribeInstanceDomainsRequest
     * @return DescribeInstanceDomainsResponse
     */
    public DescribeInstanceDomainsResponse describeInstanceDomains(DescribeInstanceDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDomainsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is aggregated hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a global overview of statistics for public authoritative DNS.</p>
     * 
     * @param request DescribeInterAuthStatisticsGlobalOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInterAuthStatisticsGlobalOverviewResponse
     */
    public DescribeInterAuthStatisticsGlobalOverviewResponse describeInterAuthStatisticsGlobalOverviewWithOptions(DescribeInterAuthStatisticsGlobalOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overviewPeriod)) {
            query.put("OverviewPeriod", request.overviewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterAuthStatisticsGlobalOverview"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterAuthStatisticsGlobalOverviewResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is aggregated hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a global overview of statistics for public authoritative DNS.</p>
     * 
     * @param request DescribeInterAuthStatisticsGlobalOverviewRequest
     * @return DescribeInterAuthStatisticsGlobalOverviewResponse
     */
    public DescribeInterAuthStatisticsGlobalOverviewResponse describeInterAuthStatisticsGlobalOverview(DescribeInterAuthStatisticsGlobalOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInterAuthStatisticsGlobalOverviewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data statistics are aggregated hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Historical statistics for public authoritative DNS resolution</p>
     * 
     * @param request DescribeInterAuthStatisticsHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInterAuthStatisticsHistoryResponse
     */
    public DescribeInterAuthStatisticsHistoryResponse describeInterAuthStatisticsHistoryWithOptions(DescribeInterAuthStatisticsHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rcode)) {
            query.put("Rcode", request.rcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticalType)) {
            query.put("StatisticalType", request.statisticalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterAuthStatisticsHistory"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterAuthStatisticsHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data statistics are aggregated hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Historical statistics for public authoritative DNS resolution</p>
     * 
     * @param request DescribeInterAuthStatisticsHistoryRequest
     * @return DescribeInterAuthStatisticsHistoryResponse
     */
    public DescribeInterAuthStatisticsHistoryResponse describeInterAuthStatisticsHistory(DescribeInterAuthStatisticsHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInterAuthStatisticsHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is aggregated by hour.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary list of public authoritative parse statistics.</p>
     * 
     * @param request DescribeInterAuthStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInterAuthStatisticsSummaryResponse
     */
    public DescribeInterAuthStatisticsSummaryResponse describeInterAuthStatisticsSummaryWithOptions(DescribeInterAuthStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.growType)) {
            query.put("GrowType", request.growType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rcode)) {
            query.put("Rcode", request.rcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statisticalType)) {
            query.put("StatisticalType", request.statisticalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterAuthStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterAuthStatisticsSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is aggregated by hour.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary list of public authoritative parse statistics.</p>
     * 
     * @param request DescribeInterAuthStatisticsSummaryRequest
     * @return DescribeInterAuthStatisticsSummaryResponse
     */
    public DescribeInterAuthStatisticsSummaryResponse describeInterAuthStatisticsSummary(DescribeInterAuthStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInterAuthStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a zone-level overview of statistics for public authoritative DNS.</p>
     * 
     * @param request DescribeInterAuthStatisticsZoneOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInterAuthStatisticsZoneOverviewResponse
     */
    public DescribeInterAuthStatisticsZoneOverviewResponse describeInterAuthStatisticsZoneOverviewWithOptions(DescribeInterAuthStatisticsZoneOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.overviewPeriod)) {
            query.put("OverviewPeriod", request.overviewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverRegion)) {
            query.put("ServerRegion", request.serverRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInterAuthStatisticsZoneOverview"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInterAuthStatisticsZoneOverviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a zone-level overview of statistics for public authoritative DNS.</p>
     * 
     * @param request DescribeInterAuthStatisticsZoneOverviewRequest
     * @return DescribeInterAuthStatisticsZoneOverviewResponse
     */
    public DescribeInterAuthStatisticsZoneOverviewResponse describeInterAuthStatisticsZoneOverview(DescribeInterAuthStatisticsZoneOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInterAuthStatisticsZoneOverviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query parsing logs</p>
     * 
     * @param request DescribeInternetDnsLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInternetDnsLogsResponse
     */
    public DescribeInternetDnsLogsResponse describeInternetDnsLogsWithOptions(DescribeInternetDnsLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preciseSort)) {
            query.put("PreciseSort", request.preciseSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursionProtocolType)) {
            query.put("RecursionProtocolType", request.recursionProtocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInternetDnsLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInternetDnsLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query parsing logs</p>
     * 
     * @param request DescribeInternetDnsLogsRequest
     * @return DescribeInternetDnsLogsResponse
     */
    public DescribeInternetDnsLogsResponse describeInternetDnsLogs(DescribeInternetDnsLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInternetDnsLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cache refresh instances.</p>
     * 
     * @param request DescribeIspFlushCacheInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIspFlushCacheInstancesResponse
     */
    public DescribeIspFlushCacheInstancesResponse describeIspFlushCacheInstancesWithOptions(DescribeIspFlushCacheInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIspFlushCacheInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIspFlushCacheInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cache refresh instances.</p>
     * 
     * @param request DescribeIspFlushCacheInstancesRequest
     * @return DescribeIspFlushCacheInstancesResponse
     */
    public DescribeIspFlushCacheInstancesResponse describeIspFlushCacheInstances(DescribeIspFlushCacheInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIspFlushCacheInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the remaining number of cache refresh operations available.</p>
     * 
     * @param request DescribeIspFlushCacheRemainQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIspFlushCacheRemainQuotaResponse
     */
    public DescribeIspFlushCacheRemainQuotaResponse describeIspFlushCacheRemainQuotaWithOptions(DescribeIspFlushCacheRemainQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIspFlushCacheRemainQuota"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIspFlushCacheRemainQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the remaining number of cache refresh operations available.</p>
     * 
     * @param request DescribeIspFlushCacheRemainQuotaRequest
     * @return DescribeIspFlushCacheRemainQuotaResponse
     */
    public DescribeIspFlushCacheRemainQuotaResponse describeIspFlushCacheRemainQuota(DescribeIspFlushCacheRemainQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIspFlushCacheRemainQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a cache flush task.</p>
     * 
     * @param request DescribeIspFlushCacheTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIspFlushCacheTaskResponse
     */
    public DescribeIspFlushCacheTaskResponse describeIspFlushCacheTaskWithOptions(DescribeIspFlushCacheTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeIspFlushCacheTask"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIspFlushCacheTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a cache flush task.</p>
     * 
     * @param request DescribeIspFlushCacheTaskRequest
     * @return DescribeIspFlushCacheTaskResponse
     */
    public DescribeIspFlushCacheTaskResponse describeIspFlushCacheTask(DescribeIspFlushCacheTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIspFlushCacheTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cache refresh tasks.</p>
     * 
     * @param request DescribeIspFlushCacheTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIspFlushCacheTasksResponse
     */
    public DescribeIspFlushCacheTasksResponse describeIspFlushCacheTasksWithOptions(DescribeIspFlushCacheTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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
            new TeaPair("action", "DescribeIspFlushCacheTasks"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIspFlushCacheTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cache refresh tasks.</p>
     * 
     * @param request DescribeIspFlushCacheTasksRequest
     * @return DescribeIspFlushCacheTasksResponse
     */
    public DescribeIspFlushCacheTasksResponse describeIspFlushCacheTasks(DescribeIspFlushCacheTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIspFlushCacheTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the overview of Public DNS user data.</p>
     * 
     * @param request DescribePdnsAccountSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsAccountSummaryResponse
     */
    public DescribePdnsAccountSummaryResponse describePdnsAccountSummaryWithOptions(DescribePdnsAccountSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsAccountSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsAccountSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the overview of Public DNS user data.</p>
     * 
     * @param request DescribePdnsAccountSummaryRequest
     * @return DescribePdnsAccountSummaryResponse
     */
    public DescribePdnsAccountSummaryResponse describePdnsAccountSummary(DescribePdnsAccountSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsAccountSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a public DNS AppKey</p>
     * 
     * @param request DescribePdnsAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsAppKeyResponse
     */
    public DescribePdnsAppKeyResponse describePdnsAppKeyWithOptions(DescribePdnsAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKeyId)) {
            query.put("AppKeyId", request.appKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsAppKey"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a public DNS AppKey</p>
     * 
     * @param request DescribePdnsAppKeyRequest
     * @return DescribePdnsAppKeyResponse
     */
    public DescribePdnsAppKeyResponse describePdnsAppKey(DescribePdnsAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of AppKeys of Public DNS</p>
     * 
     * @param request DescribePdnsAppKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsAppKeysResponse
     */
    public DescribePdnsAppKeysResponse describePdnsAppKeysWithOptions(DescribePdnsAppKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsAppKeys"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsAppKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of AppKeys of Public DNS</p>
     * 
     * @param request DescribePdnsAppKeysRequest
     * @return DescribePdnsAppKeysResponse
     */
    public DescribePdnsAppKeysResponse describePdnsAppKeys(DescribePdnsAppKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsAppKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation log list of Public DNS.</p>
     * 
     * @param request DescribePdnsOperateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsOperateLogsResponse
     */
    public DescribePdnsOperateLogsResponse describePdnsOperateLogsWithOptions(DescribePdnsOperateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsOperateLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsOperateLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation log list of Public DNS.</p>
     * 
     * @param request DescribePdnsOperateLogsRequest
     * @return DescribePdnsOperateLogsResponse
     */
    public DescribePdnsOperateLogsResponse describePdnsOperateLogs(DescribePdnsOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsOperateLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request statistics for Public DNS.</p>
     * 
     * @param request DescribePdnsRequestStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsRequestStatisticResponse
     */
    public DescribePdnsRequestStatisticResponse describePdnsRequestStatisticWithOptions(DescribePdnsRequestStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsRequestStatistic"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsRequestStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request statistics for Public DNS.</p>
     * 
     * @param request DescribePdnsRequestStatisticRequest
     * @return DescribePdnsRequestStatisticResponse
     */
    public DescribePdnsRequestStatisticResponse describePdnsRequestStatistic(DescribePdnsRequestStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsRequestStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request statistics for a specified subdomain.</p>
     * 
     * @param request DescribePdnsRequestStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsRequestStatisticsResponse
     */
    public DescribePdnsRequestStatisticsResponse describePdnsRequestStatisticsWithOptions(DescribePdnsRequestStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsRequestStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsRequestStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the request statistics for a specified subdomain.</p>
     * 
     * @param request DescribePdnsRequestStatisticsRequest
     * @return DescribePdnsRequestStatisticsResponse
     */
    public DescribePdnsRequestStatisticsResponse describePdnsRequestStatistics(DescribePdnsRequestStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsRequestStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Public DNS threat logs.</p>
     * 
     * @param request DescribePdnsThreatLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsThreatLogsResponse
     */
    public DescribePdnsThreatLogsResponse describePdnsThreatLogsWithOptions(DescribePdnsThreatLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            query.put("ThreatLevel", request.threatLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatSourceIp)) {
            query.put("ThreatSourceIp", request.threatSourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatType)) {
            query.put("ThreatType", request.threatType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsThreatLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsThreatLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Public DNS threat logs.</p>
     * 
     * @param request DescribePdnsThreatLogsRequest
     * @return DescribePdnsThreatLogsResponse
     */
    public DescribePdnsThreatLogsResponse describePdnsThreatLogs(DescribePdnsThreatLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsThreatLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves Public DNS threat statistics.</p>
     * 
     * @param request DescribePdnsThreatStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsThreatStatisticResponse
     */
    public DescribePdnsThreatStatisticResponse describePdnsThreatStatisticWithOptions(DescribePdnsThreatStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatSourceIp)) {
            query.put("ThreatSourceIp", request.threatSourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsThreatStatistic"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsThreatStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves Public DNS threat statistics.</p>
     * 
     * @param request DescribePdnsThreatStatisticRequest
     * @return DescribePdnsThreatStatisticResponse
     */
    public DescribePdnsThreatStatisticResponse describePdnsThreatStatistic(DescribePdnsThreatStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsThreatStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the public DNS threat statistics list.</p>
     * 
     * @param request DescribePdnsThreatStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsThreatStatisticsResponse
     */
    public DescribePdnsThreatStatisticsResponse describePdnsThreatStatisticsWithOptions(DescribePdnsThreatStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatLevel)) {
            query.put("ThreatLevel", request.threatLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatSourceIp)) {
            query.put("ThreatSourceIp", request.threatSourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threatType)) {
            query.put("ThreatType", request.threatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsThreatStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsThreatStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the public DNS threat statistics list.</p>
     * 
     * @param request DescribePdnsThreatStatisticsRequest
     * @return DescribePdnsThreatStatisticsResponse
     */
    public DescribePdnsThreatStatisticsResponse describePdnsThreatStatistics(DescribePdnsThreatStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsThreatStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of Public DNS UDP IP address ranges.</p>
     * 
     * @param request DescribePdnsUdpIpSegmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsUdpIpSegmentsResponse
     */
    public DescribePdnsUdpIpSegmentsResponse describePdnsUdpIpSegmentsWithOptions(DescribePdnsUdpIpSegmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("action", "DescribePdnsUdpIpSegments"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsUdpIpSegmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of Public DNS UDP IP address ranges.</p>
     * 
     * @param request DescribePdnsUdpIpSegmentsRequest
     * @return DescribePdnsUdpIpSegmentsResponse
     */
    public DescribePdnsUdpIpSegmentsResponse describePdnsUdpIpSegments(DescribePdnsUdpIpSegmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsUdpIpSegmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves user information for Public DNS.</p>
     * 
     * @param request DescribePdnsUserInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePdnsUserInfoResponse
     */
    public DescribePdnsUserInfoResponse describePdnsUserInfoWithOptions(DescribePdnsUserInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePdnsUserInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePdnsUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves user information for Public DNS.</p>
     * 
     * @param request DescribePdnsUserInfoRequest
     * @return DescribePdnsUserInfoResponse
     */
    public DescribePdnsUserInfoResponse describePdnsUserInfo(DescribePdnsUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePdnsUserInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for the DNS records of a domain name.</p>
     * 
     * @param request DescribeRecordLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordLogsResponse
     */
    public DescribeRecordLogsResponse describeRecordLogsWithOptions(DescribeRecordLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("endDate", request.endDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs for the DNS records of a domain name.</p>
     * 
     * @param request DescribeRecordLogsRequest
     * @return DescribeRecordLogsResponse
     */
    public DescribeRecordLogsResponse describeRecordLogs(DescribeRecordLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the request volume for all subdomains of a specified domain name.</p>
     * 
     * @param request DescribeRecordResolveStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordResolveStatisticsSummaryResponse
     */
    public DescribeRecordResolveStatisticsSummaryResponse describeRecordResolveStatisticsSummaryWithOptions(DescribeRecordResolveStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordResolveStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordResolveStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the request volume for all subdomains of a specified domain name.</p>
     * 
     * @param request DescribeRecordResolveStatisticsSummaryRequest
     * @return DescribeRecordResolveStatisticsSummaryResponse
     */
    public DescribeRecordResolveStatisticsSummaryResponse describeRecordResolveStatisticsSummary(DescribeRecordResolveStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordResolveStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is collected hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time data about DNS requests for a specified subdomain.</p>
     * 
     * @param request DescribeRecordStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordStatisticsResponse
     */
    public DescribeRecordStatisticsResponse describeRecordStatisticsWithOptions(DescribeRecordStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordStatistics"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is collected hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries real-time data about DNS requests for a specified subdomain.</p>
     * 
     * @param request DescribeRecordStatisticsRequest
     * @return DescribeRecordStatisticsResponse
     */
    public DescribeRecordStatisticsResponse describeRecordStatistics(DescribeRecordStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the request volume for all subdomains of a specified domain name.</p>
     * 
     * @param request DescribeRecordStatisticsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordStatisticsSummaryResponse
     */
    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummaryWithOptions(DescribeRecordStatisticsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainType)) {
            query.put("DomainType", request.domainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMode)) {
            query.put("SearchMode", request.searchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordStatisticsSummary"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordStatisticsSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics on the request volume for all subdomains of a specified domain name.</p>
     * 
     * @param request DescribeRecordStatisticsSummaryRequest
     * @return DescribeRecordStatisticsSummaryResponse
     */
    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordStatisticsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describes a built-in authoritative DNS record used for recursive resolution.</p>
     * 
     * @param request DescribeRecursionRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecursionRecordResponse
     */
    public DescribeRecursionRecordResponse describeRecursionRecordWithOptions(DescribeRecursionRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecursionRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecursionRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describes a built-in authoritative DNS record used for recursive resolution.</p>
     * 
     * @param request DescribeRecursionRecordRequest
     * @return DescribeRecursionRecordResponse
     */
    public DescribeRecursionRecordResponse describeRecursionRecord(DescribeRecursionRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecursionRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is measured hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an authoritative zone for recursive resolution.</p>
     * 
     * @param request DescribeRecursionZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecursionZoneResponse
     */
    public DescribeRecursionZoneResponse describeRecursionZoneWithOptions(DescribeRecursionZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecursionZone"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecursionZoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Real-time data is measured hourly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an authoritative zone for recursive resolution.</p>
     * 
     * @param request DescribeRecursionZoneRequest
     * @return DescribeRecursionZoneResponse
     */
    public DescribeRecursionZoneResponse describeRecursionZone(DescribeRecursionZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecursionZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all DNS records for a specific subdomain based on the specified parameters.</p>
     * 
     * @param request DescribeSubDomainRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubDomainRecordsResponse
     */
    public DescribeSubDomainRecordsResponse describeSubDomainRecordsWithOptions(DescribeSubDomainRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubDomainRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubDomainRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all DNS records for a specific subdomain based on the specified parameters.</p>
     * 
     * @param request DescribeSubDomainRecordsRequest
     * @return DescribeSubDomainRecordsResponse
     */
    public DescribeSubDomainRecordsResponse describeSubDomainRecords(DescribeSubDomainRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubDomainRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lines supported by Cloud DNS.</p>
     * 
     * @param request DescribeSupportLinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupportLinesResponse
     */
    public DescribeSupportLinesResponse describeSupportLinesWithOptions(DescribeSupportLinesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportLines"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportLinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lines supported by Cloud DNS.</p>
     * 
     * @param request DescribeSupportLinesRequest
     * @return DescribeSupportLinesResponse
     */
    public DescribeSupportLinesResponse describeSupportLines(DescribeSupportLinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportLinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries existing tags.</p>
     * 
     * @param request DescribeTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries existing tags.</p>
     * 
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names transferred between accounts based on the specified input parameters.</p>
     * 
     * @param request DescribeTransferDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransferDomainsResponse
     */
    public DescribeTransferDomainsResponse describeTransferDomainsWithOptions(DescribeTransferDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUserId)) {
            query.put("FromUserId", request.fromUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferType)) {
            query.put("TransferType", request.transferType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransferDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransferDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain names transferred between accounts based on the specified input parameters.</p>
     * 
     * @param request DescribeTransferDomainsRequest
     * @return DescribeTransferDomainsResponse
     */
    public DescribeTransferDomainsResponse describeTransferDomains(DescribeTransferDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransferDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a disaster recovery plan.</p>
     * 
     * @param request ExecuteGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteGtmRecoveryPlanResponse
     */
    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlanWithOptions(ExecuteGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a disaster recovery plan.</p>
     * 
     * @param request ExecuteGtmRecoveryPlanRequest
     * @return ExecuteGtmRecoveryPlanResponse
     */
    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about primary and subdomain name levels, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/39803.html?spm=a2c4g.2357293.0.0.211f41ffUR1cPb">Domain name levels</a>. For example, if you enter <code>www.abc.com</code>, the output is abc.com.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/faq-detail/39803.htm">Domain name levels</a>. For example, if you enter <code>www.abc.com</code>, the output is abc.com.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the primary domain name from a specified domain name.</p>
     * 
     * @param request GetMainDomainNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMainDomainNameResponse
     */
    public GetMainDomainNameResponse getMainDomainNameWithOptions(GetMainDomainNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputString)) {
            query.put("InputString", request.inputString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMainDomainName"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMainDomainNameResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information about primary and subdomain name levels, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/39803.html?spm=a2c4g.2357293.0.0.211f41ffUR1cPb">Domain name levels</a>. For example, if you enter <code>www.abc.com</code>, the output is abc.com.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/faq-detail/39803.htm">Domain name levels</a>. For example, if you enter <code>www.abc.com</code>, the output is abc.com.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the primary domain name from a specified domain name.</p>
     * 
     * @param request GetMainDomainNameRequest
     * @return GetMainDomainNameResponse
     */
    public GetMainDomainNameResponse getMainDomainName(GetMainDomainNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMainDomainNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a TXT record for domain and subdomain verification. This operation supports batch retrieval.</p>
     * 
     * @param request GetTxtRecordForVerifyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTxtRecordForVerifyResponse
     */
    public GetTxtRecordForVerifyResponse getTxtRecordForVerifyWithOptions(GetTxtRecordForVerifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTxtRecordForVerify"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTxtRecordForVerifyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a TXT record for domain and subdomain verification. This operation supports batch retrieval.</p>
     * 
     * @param request GetTxtRecordForVerifyRequest
     * @return GetTxtRecordForVerifyResponse
     */
    public GetTxtRecordForVerifyResponse getTxtRecordForVerify(GetTxtRecordForVerifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTxtRecordForVerifyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Agent registration information.</p>
     * 
     * @param request ListAtiAgentRegisterInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAtiAgentRegisterInfosResponse
     */
    public ListAtiAgentRegisterInfosResponse listAtiAgentRegisterInfosWithOptions(ListAtiAgentRegisterInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentDisplayName)) {
            query.put("AgentDisplayName", request.agentDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentHost)) {
            query.put("AgentHost", request.agentHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAtiAgentRegisterInfos"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAtiAgentRegisterInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Agent registration information.</p>
     * 
     * @param request ListAtiAgentRegisterInfosRequest
     * @return ListAtiAgentRegisterInfosResponse
     */
    public ListAtiAgentRegisterInfosResponse listAtiAgentRegisterInfos(ListAtiAgentRegisterInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAtiAgentRegisterInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of real-name registered contacts.</p>
     * 
     * @param request ListAtiChangeLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAtiChangeLogsResponse
     */
    public ListAtiChangeLogsResponse listAtiChangeLogsWithOptions(ListAtiChangeLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorAccount)) {
            query.put("OperatorAccount", request.operatorAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAtiChangeLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAtiChangeLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of real-name registered contacts.</p>
     * 
     * @param request ListAtiChangeLogsRequest
     * @return ListAtiChangeLogsResponse
     */
    public ListAtiChangeLogsResponse listAtiChangeLogs(ListAtiChangeLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAtiChangeLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实名注册人列表</p>
     * 
     * @param request ListAtiRegistrantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAtiRegistrantsResponse
     */
    public ListAtiRegistrantsResponse listAtiRegistrantsWithOptions(ListAtiRegistrantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAtiRegistrants"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAtiRegistrantsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实名注册人列表</p>
     * 
     * @param request ListAtiRegistrantsRequest
     * @return ListAtiRegistrantsResponse
     */
    public ListAtiRegistrantsResponse listAtiRegistrants(ListAtiRegistrantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAtiRegistrantsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of address pools in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request ListCloudGtmAddressPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmAddressPoolsResponse
     */
    public ListCloudGtmAddressPoolsResponse listCloudGtmAddressPoolsWithOptions(ListCloudGtmAddressPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolName)) {
            query.put("AddressPoolName", request.addressPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolType)) {
            query.put("AddressPoolType", request.addressPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmAddressPools"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmAddressPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of address pools in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request ListCloudGtmAddressPoolsRequest
     * @return ListCloudGtmAddressPoolsResponse
     */
    public ListCloudGtmAddressPoolsResponse listCloudGtmAddressPools(ListCloudGtmAddressPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmAddressPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of addresses based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmAddressesResponse
     */
    public ListCloudGtmAddressesResponse listCloudGtmAddressesWithOptions(ListCloudGtmAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorTemplateId)) {
            query.put("MonitorTemplateId", request.monitorTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmAddresses"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of addresses based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmAddressesRequest
     * @return ListCloudGtmAddressesResponse
     */
    public ListCloudGtmAddressesResponse listCloudGtmAddresses(ListCloudGtmAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of alert logs.</p>
     * 
     * @param request ListCloudGtmAlertLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmAlertLogsResponse
     */
    public ListCloudGtmAlertLogsResponse listCloudGtmAlertLogsWithOptions(ListCloudGtmAlertLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            query.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimestamp)) {
            query.put("StartTimestamp", request.startTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmAlertLogs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmAlertLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of alert logs.</p>
     * 
     * @param request ListCloudGtmAlertLogsRequest
     * @return ListCloudGtmAlertLogsResponse
     */
    public ListCloudGtmAlertLogsResponse listCloudGtmAlertLogs(ListCloudGtmAlertLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmAlertLogsWithOptions(request, runtime);
    }

    /**
     * @param request ListCloudGtmAvailableAlertGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmAvailableAlertGroupsResponse
     */
    public ListCloudGtmAvailableAlertGroupsResponse listCloudGtmAvailableAlertGroupsWithOptions(ListCloudGtmAvailableAlertGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmAvailableAlertGroups"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmAvailableAlertGroupsResponse());
    }

    /**
     * @param request ListCloudGtmAvailableAlertGroupsRequest
     * @return ListCloudGtmAvailableAlertGroupsResponse
     */
    public ListCloudGtmAvailableAlertGroupsResponse listCloudGtmAvailableAlertGroups(ListCloudGtmAvailableAlertGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmAvailableAlertGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of instance configurations that contain access domain names and address pool information.</p>
     * 
     * @param request ListCloudGtmInstanceConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmInstanceConfigsResponse
     */
    public ListCloudGtmInstanceConfigsResponse listCloudGtmInstanceConfigsWithOptions(ListCloudGtmInstanceConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleDomainName)) {
            query.put("ScheduleDomainName", request.scheduleDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleZoneName)) {
            query.put("ScheduleZoneName", request.scheduleZoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmInstanceConfigs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmInstanceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of instance configurations that contain access domain names and address pool information.</p>
     * 
     * @param request ListCloudGtmInstanceConfigsRequest
     * @return ListCloudGtmInstanceConfigsResponse
     */
    public ListCloudGtmInstanceConfigsResponse listCloudGtmInstanceConfigs(ListCloudGtmInstanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmInstanceConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of GTM 3.0 instances based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmInstancesResponse
     */
    public ListCloudGtmInstancesResponse listCloudGtmInstancesWithOptions(ListCloudGtmInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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
            new TeaPair("action", "ListCloudGtmInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of GTM 3.0 instances based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmInstancesRequest
     * @return ListCloudGtmInstancesResponse
     */
    public ListCloudGtmInstancesResponse listCloudGtmInstances(ListCloudGtmInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the health check monitoring nodes based on the specified input parameters.</p>
     * 
     * @param request ListCloudGtmMonitorNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmMonitorNodesResponse
     */
    public ListCloudGtmMonitorNodesResponse listCloudGtmMonitorNodesWithOptions(ListCloudGtmMonitorNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDisabledNodes)) {
            query.put("ShowDisabledNodes", request.showDisabledNodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmMonitorNodes"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmMonitorNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the health check monitoring nodes based on the specified input parameters.</p>
     * 
     * @param request ListCloudGtmMonitorNodesRequest
     * @return ListCloudGtmMonitorNodesResponse
     */
    public ListCloudGtmMonitorNodesResponse listCloudGtmMonitorNodes(ListCloudGtmMonitorNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmMonitorNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health check templates based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmMonitorTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudGtmMonitorTemplatesResponse
     */
    public ListCloudGtmMonitorTemplatesResponse listCloudGtmMonitorTemplatesWithOptions(ListCloudGtmMonitorTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudGtmMonitorTemplates"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudGtmMonitorTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries health check templates based on the specified parameters.</p>
     * 
     * @param request ListCloudGtmMonitorTemplatesRequest
     * @return ListCloudGtmMonitorTemplatesResponse
     */
    public ListCloudGtmMonitorTemplatesResponse listCloudGtmMonitorTemplates(ListCloudGtmMonitorTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudGtmMonitorTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the built-in authoritative records for recursive resolution.</p>
     * 
     * @param request ListRecursionRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecursionRecordsResponse
     */
    public ListRecursionRecordsResponse listRecursionRecordsWithOptions(ListRecursionRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecursionRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecursionRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the built-in authoritative records for recursive resolution.</p>
     * 
     * @param request ListRecursionRecordsRequest
     * @return ListRecursionRecordsResponse
     */
    public ListRecursionRecordsResponse listRecursionRecords(ListRecursionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecursionRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least ResourceId.N or Tag.N (Tag.N.Key and Tag.N.Value) in your request to identify the resources to retrieve.</li>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you specify only Tag.N.Key, all tag values associated with the tag key are returned. An error is returned if you specify only Tag.N.Value.</li>
     * <li>If you specify both Tag.N and ResourceId.N to filter resources, only the resources that are specified by ResourceId.N and match all the specified key-value pairs are returned.</li>
     * <li>If you specify multiple tag key-value pairs, the resources that match all of them are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones that are used for recursive resolution of built-in authoritative domain names.</p>
     * 
     * @param request ListRecursionZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecursionZonesResponse
     */
    public ListRecursionZonesResponse listRecursionZonesWithOptions(ListRecursionZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecursionZones"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecursionZonesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least ResourceId.N or Tag.N (Tag.N.Key and Tag.N.Value) in your request to identify the resources to retrieve.</li>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you specify only Tag.N.Key, all tag values associated with the tag key are returned. An error is returned if you specify only Tag.N.Value.</li>
     * <li>If you specify both Tag.N and ResourceId.N to filter resources, only the resources that are specified by ResourceId.N and match all the specified key-value pairs are returned.</li>
     * <li>If you specify multiple tag key-value pairs, the resources that match all of them are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the zones that are used for recursive resolution of built-in authoritative domain names.</p>
     * 
     * @param request ListRecursionZonesRequest
     * @return ListRecursionZonesResponse
     */
    public ListRecursionZonesResponse listRecursionZones(ListRecursionZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecursionZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To specify the objects to retrieve, your request must contain at least one of the following parameters: <code>ResourceId.N</code> or <code>Tag.N</code> (which consists of Tag.N.Key and Tag.N.Value).</li>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you specify only Tag.N.Key, all tag values associated with that tag key are returned. An error occurs if you specify only Tag.N.Value.</li>
     * <li>If you specify both Tag.N and ResourceId.N to filter resources, only the resources that are specified by ResourceId.N and match all the specified tag key-value pairs are returned.</li>
     * <li>If you specify multiple tag key-value pairs, only the resources that have all the specified key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resources by tag.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

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
            new TeaPair("version", "2015-01-09"),
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
     * <ul>
     * <li>To specify the objects to retrieve, your request must contain at least one of the following parameters: <code>ResourceId.N</code> or <code>Tag.N</code> (which consists of Tag.N.Key and Tag.N.Value).</li>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you specify only Tag.N.Key, all tag values associated with that tag key are returned. An error occurs if you specify only Tag.N.Value.</li>
     * <li>If you specify both Tag.N and ResourceId.N to filter resources, only the resources that are specified by ResourceId.N and match all the specified tag key-value pairs are returned.</li>
     * <li>If you specify multiple tag key-value pairs, only the resources that have all the specified key-value pairs are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries resources by tag.</p>
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
     * <p>After the operation is successful, the DNS servers are changed to Alibaba Cloud DNS servers. The names of these new servers end with hichina.com.</p>
     * <blockquote>
     * <p><strong>Prerequisite: This operation applies to domain names that are registered with Alibaba Cloud and currently use third-party DNS servers.</strong></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the DNS servers for a domain name from a third-party provider to Alibaba Cloud DNS.</p>
     * 
     * @param request ModifyHichinaDomainDNSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHichinaDomainDNSResponse
     */
    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNSWithOptions(ModifyHichinaDomainDNSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHichinaDomainDNS"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHichinaDomainDNSResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the operation is successful, the DNS servers are changed to Alibaba Cloud DNS servers. The names of these new servers end with hichina.com.</p>
     * <blockquote>
     * <p><strong>Prerequisite: This operation applies to domain names that are registered with Alibaba Cloud and currently use third-party DNS servers.</strong></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Changes the DNS servers for a domain name from a third-party provider to Alibaba Cloud DNS.</p>
     * 
     * @param request ModifyHichinaDomainDNSRequest
     * @return ModifyHichinaDomainDNSResponse
     */
    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHichinaDomainDNSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a domain name to a different resource group.</p>
     * 
     * @param request MoveDomainResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveDomainResourceGroupResponse
     */
    public MoveDomainResourceGroupResponse moveDomainResourceGroupWithOptions(MoveDomainResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveDomainResourceGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveDomainResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a domain name to a different resource group.</p>
     * 
     * @param request MoveDomainResourceGroupRequest
     * @return MoveDomainResourceGroupResponse
     */
    public MoveDomainResourceGroupResponse moveDomainResourceGroup(MoveDomainResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveDomainResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a Global Traffic Manager (GTM) instance to a new resource group.</p>
     * 
     * @param request MoveGtmResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveGtmResourceGroupResponse
     */
    public MoveGtmResourceGroupResponse moveGtmResourceGroupWithOptions(MoveGtmResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveGtmResourceGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveGtmResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a Global Traffic Manager (GTM) instance to a new resource group.</p>
     * 
     * @param request MoveGtmResourceGroupRequest
     * @return MoveGtmResourceGroupResponse
     */
    public MoveGtmResourceGroupResponse moveGtmResourceGroup(MoveGtmResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveGtmResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use this operation for batch DNS tasks that do not require immediate execution.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds or deletes domain names and DNS records in batches.</p>
     * 
     * @param request OperateBatchDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateBatchDomainResponse
     */
    public OperateBatchDomainResponse operateBatchDomainWithOptions(OperateBatchDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainRecordInfo)) {
            query.put("DomainRecordInfo", request.domainRecordInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateBatchDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateBatchDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use this operation for batch DNS tasks that do not require immediate execution.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds or deletes domain names and DNS records in batches.</p>
     * 
     * @param request OperateBatchDomainRequest
     * @return OperateBatchDomainResponse
     */
    public OperateBatchDomainResponse operateBatchDomain(OperateBatchDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateBatchDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pause Public DNS Service</p>
     * 
     * @param request PausePdnsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PausePdnsServiceResponse
     */
    public PausePdnsServiceResponse pausePdnsServiceWithOptions(PausePdnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PausePdnsService"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PausePdnsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pause Public DNS Service</p>
     * 
     * @param request PausePdnsServiceRequest
     * @return PausePdnsServiceResponse
     */
    public PausePdnsServiceResponse pausePdnsService(PausePdnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pausePdnsServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Previews a disaster recovery plan.</p>
     * 
     * @param request PreviewGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewGtmRecoveryPlanResponse
     */
    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlanWithOptions(PreviewGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Previews a disaster recovery plan.</p>
     * 
     * @param request PreviewGtmRecoveryPlanRequest
     * @return PreviewGtmRecoveryPlanResponse
     */
    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Public DNS AppKey</p>
     * 
     * @param request RemovePdnsAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePdnsAppKeyResponse
     */
    public RemovePdnsAppKeyResponse removePdnsAppKeyWithOptions(RemovePdnsAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKeyId)) {
            query.put("AppKeyId", request.appKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePdnsAppKey"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePdnsAppKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Public DNS AppKey</p>
     * 
     * @param request RemovePdnsAppKeyRequest
     * @return RemovePdnsAppKeyResponse
     */
    public RemovePdnsAppKeyResponse removePdnsAppKey(RemovePdnsAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePdnsAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove Public DNS UDP IP Segment</p>
     * 
     * @param request RemovePdnsUdpIpSegmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePdnsUdpIpSegmentResponse
     */
    public RemovePdnsUdpIpSegmentResponse removePdnsUdpIpSegmentWithOptions(RemovePdnsUdpIpSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePdnsUdpIpSegment"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePdnsUdpIpSegmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove Public DNS UDP IP Segment</p>
     * 
     * @param request RemovePdnsUdpIpSegmentRequest
     * @return RemovePdnsUdpIpSegmentResponse
     */
    public RemovePdnsUdpIpSegmentResponse removePdnsUdpIpSegment(RemovePdnsUdpIpSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePdnsUdpIpSegmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation removes the serverHold status of a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the serverHold status of a specified domain name.</p>
     * 
     * @param request RemoveRspDomainServerHoldStatusForGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRspDomainServerHoldStatusForGatewayResponse
     */
    public RemoveRspDomainServerHoldStatusForGatewayResponse removeRspDomainServerHoldStatusForGatewayWithOptions(RemoveRspDomainServerHoldStatusForGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusMsg)) {
            query.put("StatusMsg", request.statusMsg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRspDomainServerHoldStatusForGateway"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRspDomainServerHoldStatusForGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation removes the serverHold status of a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the serverHold status of a specified domain name.</p>
     * 
     * @param request RemoveRspDomainServerHoldStatusForGatewayRequest
     * @return RemoveRspDomainServerHoldStatusForGatewayResponse
     */
    public RemoveRspDomainServerHoldStatusForGatewayResponse removeRspDomainServerHoldStatusForGateway(RemoveRspDomainServerHoldStatusForGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRspDomainServerHoldStatusForGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation removes the serverHold status for a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the serverHold status for a specified domain name.</p>
     * 
     * @param request RemoveRspDomainServerHoldStatusForGatewayOteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRspDomainServerHoldStatusForGatewayOteResponse
     */
    public RemoveRspDomainServerHoldStatusForGatewayOteResponse removeRspDomainServerHoldStatusForGatewayOteWithOptions(RemoveRspDomainServerHoldStatusForGatewayOteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusMsg)) {
            query.put("StatusMsg", request.statusMsg);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRspDomainServerHoldStatusForGatewayOte"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRspDomainServerHoldStatusForGatewayOteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation removes the serverHold status for a specified domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes the serverHold status for a specified domain name.</p>
     * 
     * @param request RemoveRspDomainServerHoldStatusForGatewayOteRequest
     * @return RemoveRspDomainServerHoldStatusForGatewayOteResponse
     */
    public RemoveRspDomainServerHoldStatusForGatewayOteResponse removeRspDomainServerHoldStatusForGatewayOte(RemoveRspDomainServerHoldStatusForGatewayOteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRspDomainServerHoldStatusForGatewayOteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Replaces the addresses in a specified address pool.</p>
     * 
     * @param tmpReq ReplaceCloudGtmAddressPoolAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceCloudGtmAddressPoolAddressResponse
     */
    public ReplaceCloudGtmAddressPoolAddressResponse replaceCloudGtmAddressPoolAddressWithOptions(ReplaceCloudGtmAddressPoolAddressRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplaceCloudGtmAddressPoolAddressShrinkRequest request = new ReplaceCloudGtmAddressPoolAddressShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addresses)) {
            request.addressesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addresses, "Addresses", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressesShrink)) {
            query.put("Addresses", request.addressesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceCloudGtmAddressPoolAddress"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceCloudGtmAddressPoolAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Replaces the addresses in a specified address pool.</p>
     * 
     * @param request ReplaceCloudGtmAddressPoolAddressRequest
     * @return ReplaceCloudGtmAddressPoolAddressResponse
     */
    public ReplaceCloudGtmAddressPoolAddressResponse replaceCloudGtmAddressPoolAddress(ReplaceCloudGtmAddressPoolAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceCloudGtmAddressPoolAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Replaces the address pools associated with an instance.</p>
     * 
     * @param tmpReq ReplaceCloudGtmInstanceConfigAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceCloudGtmInstanceConfigAddressPoolResponse
     */
    public ReplaceCloudGtmInstanceConfigAddressPoolResponse replaceCloudGtmInstanceConfigAddressPoolWithOptions(ReplaceCloudGtmInstanceConfigAddressPoolRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest request = new ReplaceCloudGtmInstanceConfigAddressPoolShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addressPools)) {
            request.addressPoolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addressPools, "AddressPools", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolsShrink)) {
            query.put("AddressPools", request.addressPoolsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceCloudGtmInstanceConfigAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceCloudGtmInstanceConfigAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Replaces the address pools associated with an instance.</p>
     * 
     * @param request ReplaceCloudGtmInstanceConfigAddressPoolRequest
     * @return ReplaceCloudGtmInstanceConfigAddressPoolResponse
     */
    public ReplaceCloudGtmInstanceConfigAddressPoolResponse replaceCloudGtmInstanceConfigAddressPool(ReplaceCloudGtmInstanceConfigAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceCloudGtmInstanceConfigAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resume Public DNS Service</p>
     * 
     * @param request ResumePdnsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumePdnsServiceResponse
     */
    public ResumePdnsServiceResponse resumePdnsServiceWithOptions(ResumePdnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumePdnsService"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumePdnsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resume Public DNS Service</p>
     * 
     * @param request ResumePdnsServiceRequest
     * @return ResumePdnsServiceResponse
     */
    public ResumePdnsServiceResponse resumePdnsService(ResumePdnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumePdnsServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you can retrieve a domain name, you must verify it using a TXT record. Use this operation in conjunction with the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/145533.html">Generate a TXT record</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/alibaba-cloud-dns/latest/generating-a-txt-record">Generate a TXT record</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a domain name.</p>
     * 
     * @param request RetrieveDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveDomainResponse
     */
    public RetrieveDomainResponse retrieveDomainWithOptions(RetrieveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetrieveDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you can retrieve a domain name, you must verify it using a TXT record. Use this operation in conjunction with the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/145533.html">Generate a TXT record</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/alibaba-cloud-dns/latest/generating-a-txt-record">Generate a TXT record</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a domain name.</p>
     * 
     * @param request RetrieveDomainRequest
     * @return RetrieveDomainResponse
     */
    public RetrieveDomainResponse retrieveDomain(RetrieveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retrieveDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the registration information of an Agent.</p>
     * 
     * @param request RevokeAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeAtiAgentRegisterInfoResponse
     */
    public RevokeAtiAgentRegisterInfoResponse revokeAtiAgentRegisterInfoWithOptions(RevokeAtiAgentRegisterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonCode)) {
            query.put("ReasonCode", request.reasonCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the registration information of an Agent.</p>
     * 
     * @param request RevokeAtiAgentRegisterInfoRequest
     * @return RevokeAtiAgentRegisterInfoResponse
     */
    public RevokeAtiAgentRegisterInfoResponse revokeAtiAgentRegisterInfo(RevokeAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a real-name registrant.</p>
     * 
     * @param request RevokeAtiRegistrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeAtiRegistrantResponse
     */
    public RevokeAtiRegistrantResponse revokeAtiRegistrantWithOptions(RevokeAtiRegistrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeAtiRegistrant"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeAtiRegistrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a real-name registrant.</p>
     * 
     * @param request RevokeAtiRegistrantRequest
     * @return RevokeAtiRegistrantResponse
     */
    public RevokeAtiRegistrantResponse revokeAtiRegistrant(RevokeAtiRegistrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeAtiRegistrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a disaster recovery plan.</p>
     * 
     * @param request RollbackGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackGtmRecoveryPlanResponse
     */
    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlanWithOptions(RollbackGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a disaster recovery plan.</p>
     * 
     * @param request RollbackGtmRecoveryPlanRequest
     * @return RollbackGtmRecoveryPlanResponse
     */
    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for agents in the Agent Marketplace.</p>
     * 
     * @param request SearchAtiAgentRegisterInfoMarketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAtiAgentRegisterInfoMarketResponse
     */
    public SearchAtiAgentRegisterInfoMarketResponse searchAtiAgentRegisterInfoMarketWithOptions(SearchAtiAgentRegisterInfoMarketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trustLevel)) {
            query.put("TrustLevel", request.trustLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAtiAgentRegisterInfoMarket"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAtiAgentRegisterInfoMarketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for agents in the Agent Marketplace.</p>
     * 
     * @param request SearchAtiAgentRegisterInfoMarketRequest
     * @return SearchAtiAgentRegisterInfoMarketResponse
     */
    public SearchAtiAgentRegisterInfoMarketResponse searchAtiAgentRegisterInfoMarket(SearchAtiAgentRegisterInfoMarketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAtiAgentRegisterInfoMarketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for address pools by name, remarks, or other criteria.</p>
     * 
     * @param request SearchCloudGtmAddressPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCloudGtmAddressPoolsResponse
     */
    public SearchCloudGtmAddressPoolsResponse searchCloudGtmAddressPoolsWithOptions(SearchCloudGtmAddressPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolName)) {
            query.put("AddressPoolName", request.addressPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolType)) {
            query.put("AddressPoolType", request.addressPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableStatus)) {
            query.put("AvailableStatus", request.availableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCloudGtmAddressPools"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCloudGtmAddressPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for address pools by name, remarks, or other criteria.</p>
     * 
     * @param request SearchCloudGtmAddressPoolsRequest
     * @return SearchCloudGtmAddressPoolsResponse
     */
    public SearchCloudGtmAddressPoolsResponse searchCloudGtmAddressPools(SearchCloudGtmAddressPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCloudGtmAddressPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for addresses based on criteria such as address name, remarks, referenced health check template, or address ID.</p>
     * 
     * @param request SearchCloudGtmAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCloudGtmAddressesResponse
     */
    public SearchCloudGtmAddressesResponse searchCloudGtmAddressesWithOptions(SearchCloudGtmAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableStatus)) {
            query.put("AvailableStatus", request.availableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorTemplateName)) {
            query.put("MonitorTemplateName", request.monitorTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSearchCondition)) {
            query.put("NameSearchCondition", request.nameSearchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarkSearchCondition)) {
            query.put("RemarkSearchCondition", request.remarkSearchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            query.put("Remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCloudGtmAddresses"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCloudGtmAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for addresses based on criteria such as address name, remarks, referenced health check template, or address ID.</p>
     * 
     * @param request SearchCloudGtmAddressesRequest
     * @return SearchCloudGtmAddressesResponse
     */
    public SearchCloudGtmAddressesResponse searchCloudGtmAddresses(SearchCloudGtmAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCloudGtmAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves instance configurations that match the specified parameters.</p>
     * 
     * @param request SearchCloudGtmInstanceConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCloudGtmInstanceConfigsResponse
     */
    public SearchCloudGtmInstanceConfigsResponse searchCloudGtmInstanceConfigsWithOptions(SearchCloudGtmInstanceConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableStatus)) {
            query.put("AvailableStatus", request.availableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthStatus)) {
            query.put("HealthStatus", request.healthStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleDomainName)) {
            query.put("ScheduleDomainName", request.scheduleDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleZoneName)) {
            query.put("ScheduleZoneName", request.scheduleZoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCloudGtmInstanceConfigs"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCloudGtmInstanceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves instance configurations that match the specified parameters.</p>
     * 
     * @param request SearchCloudGtmInstanceConfigsRequest
     * @return SearchCloudGtmInstanceConfigsResponse
     */
    public SearchCloudGtmInstanceConfigsResponse searchCloudGtmInstanceConfigs(SearchCloudGtmInstanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCloudGtmInstanceConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation searches for instances based on specified parameters.</p>
     * 
     * @param request SearchCloudGtmInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCloudGtmInstancesResponse
     */
    public SearchCloudGtmInstancesResponse searchCloudGtmInstancesWithOptions(SearchCloudGtmInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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
            new TeaPair("action", "SearchCloudGtmInstances"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCloudGtmInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This operation searches for instances based on specified parameters.</p>
     * 
     * @param request SearchCloudGtmInstancesRequest
     * @return SearchCloudGtmInstancesResponse
     */
    public SearchCloudGtmInstancesResponse searchCloudGtmInstances(SearchCloudGtmInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCloudGtmInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for health check templates.</p>
     * 
     * @param request SearchCloudGtmMonitorTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCloudGtmMonitorTemplatesResponse
     */
    public SearchCloudGtmMonitorTemplatesResponse searchCloudGtmMonitorTemplatesWithOptions(SearchCloudGtmMonitorTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipVersion)) {
            query.put("IpVersion", request.ipVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchCloudGtmMonitorTemplates"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCloudGtmMonitorTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for health check templates.</p>
     * 
     * @param request SearchCloudGtmMonitorTemplatesRequest
     * @return SearchCloudGtmMonitorTemplatesResponse
     */
    public SearchCloudGtmMonitorTemplatesResponse searchCloudGtmMonitorTemplates(SearchCloudGtmMonitorTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchCloudGtmMonitorTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for built-in authoritative DNS records used for recursive resolution.</p>
     * 
     * @param request SearchRecursionRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchRecursionRecordsResponse
     */
    public SearchRecursionRecordsResponse searchRecursionRecordsWithOptions(SearchRecursionRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchRecursionRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchRecursionRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for built-in authoritative DNS records used for recursive resolution.</p>
     * 
     * @param request SearchRecursionRecordsRequest
     * @return SearchRecursionRecordsResponse
     */
    public SearchRecursionRecordsResponse searchRecursionRecords(SearchRecursionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchRecursionRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To retrieve resources, you must specify at least <code>ResourceId.N</code> or <code>Tag.N</code> (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>) in the request.</li>
     * <li><code>Tag.N</code> is a resource tag that consists of a key-value pair. If you specify only <code>Tag.N.Key</code>, all tag values associated with that key are returned. If you specify only <code>Tag.N.Value</code>, an error is returned.</li>
     * <li>If you specify both <code>Tag.N</code> and <code>ResourceId.N</code>, the operation returns only the resources that are identified by <code>ResourceId.N</code> and match all the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, only resources that match all of them are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for zones of built-in authoritative domain names used for recursive resolution.</p>
     * 
     * @param tmpReq SearchRecursionZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchRecursionZonesResponse
     */
    public SearchRecursionZonesResponse searchRecursionZonesWithOptions(SearchRecursionZonesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchRecursionZonesShrinkRequest request = new SearchRecursionZonesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.effectiveScopes)) {
            request.effectiveScopesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.effectiveScopes, "EffectiveScopes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveScopesShrink)) {
            query.put("EffectiveScopes", request.effectiveScopesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneName)) {
            query.put("ZoneName", request.zoneName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchRecursionZones"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchRecursionZonesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To retrieve resources, you must specify at least <code>ResourceId.N</code> or <code>Tag.N</code> (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>) in the request.</li>
     * <li><code>Tag.N</code> is a resource tag that consists of a key-value pair. If you specify only <code>Tag.N.Key</code>, all tag values associated with that key are returned. If you specify only <code>Tag.N.Value</code>, an error is returned.</li>
     * <li>If you specify both <code>Tag.N</code> and <code>ResourceId.N</code>, the operation returns only the resources that are identified by <code>ResourceId.N</code> and match all the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, only resources that match all of them are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Searches for zones of built-in authoritative domain names used for recursive resolution.</p>
     * 
     * @param request SearchRecursionZonesRequest
     * @return SearchRecursionZonesResponse
     */
    public SearchRecursionZonesResponse searchRecursionZones(SearchRecursionZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchRecursionZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the network traffic analysis feature for a Global Traffic Manager (GTM) instance. After this feature is enabled, you can view resolution logs and statistical reports for the domain name. You can also use the intelligent alerting feature based on abnormal metrics, such as resolution success rate and sudden changes in queries per second (QPS). This improves the observability and operations and maintenance (O&amp;M) efficiency of the GTM instance.</p>
     * 
     * @param request SetCloudGtmInstanceConfigLogSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCloudGtmInstanceConfigLogSwitchResponse
     */
    public SetCloudGtmInstanceConfigLogSwitchResponse setCloudGtmInstanceConfigLogSwitchWithOptions(SetCloudGtmInstanceConfigLogSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCloudGtmInstanceConfigLogSwitch"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCloudGtmInstanceConfigLogSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the network traffic analysis feature for a Global Traffic Manager (GTM) instance. After this feature is enabled, you can view resolution logs and statistical reports for the domain name. You can also use the intelligent alerting feature based on abnormal metrics, such as resolution success rate and sudden changes in queries per second (QPS). This improves the observability and operations and maintenance (O&amp;M) efficiency of the GTM instance.</p>
     * 
     * @param request SetCloudGtmInstanceConfigLogSwitchRequest
     * @return SetCloudGtmInstanceConfigLogSwitchResponse
     */
    public SetCloudGtmInstanceConfigLogSwitchResponse setCloudGtmInstanceConfigLogSwitch(SetCloudGtmInstanceConfigLogSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCloudGtmInstanceConfigLogSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the weight configuration.</p>
     * 
     * @param request SetDNSSLBStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDNSSLBStatusResponse
     */
    public SetDNSSLBStatusResponse setDNSSLBStatusWithOptions(SetDNSSLBStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.open)) {
            query.put("Open", request.open);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDNSSLBStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDNSSLBStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the weight configuration.</p>
     * 
     * @param request SetDNSSLBStatusRequest
     * @return SetDNSSLBStatusResponse
     */
    public SetDNSSLBStatusResponse setDNSSLBStatus(SetDNSSLBStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDNSSLBStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the access mode for an access policy.</p>
     * 
     * @param request SetDnsGtmAccessModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDnsGtmAccessModeResponse
     */
    public SetDnsGtmAccessModeResponse setDnsGtmAccessModeWithOptions(SetDnsGtmAccessModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDnsGtmAccessMode"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDnsGtmAccessModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the access mode for an access policy.</p>
     * 
     * @param request SetDnsGtmAccessModeRequest
     * @return SetDnsGtmAccessModeResponse
     */
    public SetDnsGtmAccessModeResponse setDnsGtmAccessMode(SetDnsGtmAccessModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDnsGtmAccessModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the health check status for an address pool.</p>
     * 
     * @param request SetDnsGtmMonitorStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDnsGtmMonitorStatusResponse
     */
    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatusWithOptions(SetDnsGtmMonitorStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDnsGtmMonitorStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDnsGtmMonitorStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the health check status for an address pool.</p>
     * 
     * @param request SetDnsGtmMonitorStatusRequest
     * @return SetDnsGtmMonitorStatusResponse
     */
    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatus(SetDnsGtmMonitorStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDnsGtmMonitorStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables Domain Name System Security Extensions (DNSSEC) for a domain name. This feature is available only to users of paid Alibaba Cloud DNS.</p>
     * 
     * @param request SetDomainDnssecStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainDnssecStatusResponse
     */
    public SetDomainDnssecStatusResponse setDomainDnssecStatusWithOptions(SetDomainDnssecStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainDnssecStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainDnssecStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables Domain Name System Security Extensions (DNSSEC) for a domain name. This feature is available only to users of paid Alibaba Cloud DNS.</p>
     * 
     * @param request SetDomainDnssecStatusRequest
     * @return SetDomainDnssecStatusResponse
     */
    public SetDomainDnssecStatusResponse setDomainDnssecStatus(SetDomainDnssecStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainDnssecStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a DNS record.</p>
     * 
     * @param request SetDomainRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDomainRecordStatusResponse
     */
    public SetDomainRecordStatusResponse setDomainRecordStatusWithOptions(SetDomainRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomainRecordStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainRecordStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the status of a DNS record.</p>
     * 
     * @param request SetDomainRecordStatusRequest
     * @return SetDomainRecordStatusResponse
     */
    public SetDomainRecordStatusResponse setDomainRecordStatus(SetDomainRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDomainRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the address pool switchover policy based on the request parameters.</p>
     * 
     * @param request SetGtmAccessModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetGtmAccessModeResponse
     */
    public SetGtmAccessModeResponse setGtmAccessModeWithOptions(SetGtmAccessModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGtmAccessMode"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGtmAccessModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the address pool switchover policy based on the request parameters.</p>
     * 
     * @param request SetGtmAccessModeRequest
     * @return SetGtmAccessModeResponse
     */
    public SetGtmAccessModeResponse setGtmAccessMode(SetGtmAccessModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGtmAccessModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the health check status of an address pool.</p>
     * 
     * @param request SetGtmMonitorStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetGtmMonitorStatusResponse
     */
    public SetGtmMonitorStatusResponse setGtmMonitorStatusWithOptions(SetGtmMonitorStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetGtmMonitorStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetGtmMonitorStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the health check status of an address pool.</p>
     * 
     * @param request SetGtmMonitorStatusRequest
     * @return SetGtmMonitorStatusResponse
     */
    public SetGtmMonitorStatusResponse setGtmMonitorStatus(SetGtmMonitorStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGtmMonitorStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits Agent registration information.</p>
     * 
     * @param request SubmitAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAtiAgentRegisterInfoResponse
     */
    public SubmitAtiAgentRegisterInfoResponse submitAtiAgentRegisterInfoWithOptions(SubmitAtiAgentRegisterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityCsr)) {
            query.put("IdentityCsr", request.identityCsr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertPem)) {
            query.put("ServerCertPem", request.serverCertPem);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits Agent registration information.</p>
     * 
     * @param request SubmitAtiAgentRegisterInfoRequest
     * @return SubmitAtiAgentRegisterInfoResponse
     */
    public SubmitAtiAgentRegisterInfoResponse submitAtiAgentRegisterInfo(SubmitAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a cache refresh task.</p>
     * 
     * @param request SubmitIspFlushCacheTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitIspFlushCacheTaskResponse
     */
    public SubmitIspFlushCacheTaskResponse submitIspFlushCacheTaskWithOptions(SubmitIspFlushCacheTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitIspFlushCacheTask"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitIspFlushCacheTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a cache refresh task.</p>
     * 
     * @param request SubmitIspFlushCacheTaskRequest
     * @return SubmitIspFlushCacheTaskResponse
     */
    public SubmitIspFlushCacheTaskResponse submitIspFlushCacheTask(SubmitIspFlushCacheTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitIspFlushCacheTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Switches the access strategy mode of an instance.</p>
     * 
     * @param request SwitchDnsGtmInstanceStrategyModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchDnsGtmInstanceStrategyModeResponse
     */
    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyModeWithOptions(SwitchDnsGtmInstanceStrategyModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyMode)) {
            query.put("StrategyMode", request.strategyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchDnsGtmInstanceStrategyMode"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchDnsGtmInstanceStrategyModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Switches the access strategy mode of an instance.</p>
     * 
     * @param request SwitchDnsGtmInstanceStrategyModeRequest
     * @return SwitchDnsGtmInstanceStrategyModeResponse
     */
    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyMode(SwitchDnsGtmInstanceStrategyModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDnsGtmInstanceStrategyModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies tags for resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("version", "2015-01-09"),
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
     * <p>Adds or modifies tags for resources.</p>
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
     * <p>Batch transfers DNS permissions for multiple domain names to a specified execution account.</p>
     * 
     * @param request TransferDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferDomainResponse
     */
    public TransferDomainResponse transferDomainWithOptions(TransferDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch transfers DNS permissions for multiple domain names to a specified execution account.</p>
     * 
     * @param request TransferDomainRequest
     * @return TransferDomainResponse
     */
    public TransferDomainResponse transferDomain(TransferDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An instance with an ID that starts with \<code>dns-\\</code> is a new version instance. New version instances support attaching multiple domain names. You can call an API operation to attach domain names directly to an instance. An error is returned if the number of domain names exceeds the instance limit.
     * An instance with an ID that does not start with \<code>dns-\\</code> is a legacy instance. Legacy instances support only one domain name. Therefore, if you call this operation for an instance that already has a domain name attached, the domain name is replaced.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches domain names from a paid Alibaba Cloud DNS instance.</p>
     * 
     * @param request UnbindInstanceDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindInstanceDomainsResponse
     */
    public UnbindInstanceDomainsResponse unbindInstanceDomainsWithOptions(UnbindInstanceDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindInstanceDomains"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindInstanceDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>An instance with an ID that starts with \<code>dns-\\</code> is a new version instance. New version instances support attaching multiple domain names. You can call an API operation to attach domain names directly to an instance. An error is returned if the number of domain names exceeds the instance limit.
     * An instance with an ID that does not start with \<code>dns-\\</code> is a legacy instance. Legacy instances support only one domain name. Therefore, if you call this operation for an instance that already has a domain name attached, the domain name is replaced.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches domain names from a paid Alibaba Cloud DNS instance.</p>
     * 
     * @param request UnbindInstanceDomainsRequest
     * @return UnbindInstanceDomainsResponse
     */
    public UnbindInstanceDomainsResponse unbindInstanceDomains(UnbindInstanceDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindInstanceDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
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
            new TeaPair("version", "2015-01-09"),
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
     * <p>Removes tags from resources.</p>
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
     * <p>Modify AppKey State</p>
     * 
     * @param request UpdateAppKeyStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppKeyStateResponse
     */
    public UpdateAppKeyStateResponse updateAppKeyStateWithOptions(UpdateAppKeyStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKeyId)) {
            query.put("AppKeyId", request.appKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppKeyState"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppKeyStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify AppKey State</p>
     * 
     * @param request UpdateAppKeyStateRequest
     * @return UpdateAppKeyStateResponse
     */
    public UpdateAppKeyStateResponse updateAppKeyState(UpdateAppKeyStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppKeyStateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the registration information of an Agent.</p>
     * 
     * @param tmpReq UpdateAtiAgentRegisterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAtiAgentRegisterInfoResponse
     */
    public UpdateAtiAgentRegisterInfoResponse updateAtiAgentRegisterInfoWithOptions(UpdateAtiAgentRegisterInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAtiAgentRegisterInfoShrinkRequest request = new UpdateAtiAgentRegisterInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.endpoints)) {
            request.endpointsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.endpoints, "Endpoints", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentDescription)) {
            query.put("AgentDescription", request.agentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentDisplayName)) {
            query.put("AgentDisplayName", request.agentDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentHost)) {
            query.put("AgentHost", request.agentHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointsShrink)) {
            query.put("Endpoints", request.endpointsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAtiAgentRegisterInfo"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAtiAgentRegisterInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the registration information of an Agent.</p>
     * 
     * @param request UpdateAtiAgentRegisterInfoRequest
     * @return UpdateAtiAgentRegisterInfoResponse
     */
    public UpdateAtiAgentRegisterInfoResponse updateAtiAgentRegisterInfo(UpdateAtiAgentRegisterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAtiAgentRegisterInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新告警设置</p>
     * 
     * @param request UpdateAtiAlertSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAtiAlertSettingsResponse
     */
    public UpdateAtiAlertSettingsResponse updateAtiAlertSettingsWithOptions(UpdateAtiAlertSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGroup)) {
            query.put("AlertGroup", request.alertGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAtiAlertSettings"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAtiAlertSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新告警设置</p>
     * 
     * @param request UpdateAtiAlertSettingsRequest
     * @return UpdateAtiAlertSettingsResponse
     */
    public UpdateAtiAlertSettingsResponse updateAtiAlertSettings(UpdateAtiAlertSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAtiAlertSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a registrant profile.</p>
     * 
     * @param request UpdateAtiRegistrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAtiRegistrantResponse
     */
    public UpdateAtiRegistrantResponse updateAtiRegistrantWithOptions(UpdateAtiRegistrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cc)) {
            query.put("Cc", request.cc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentCode)) {
            query.put("DocumentCode", request.documentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentImage)) {
            query.put("DocumentImage", request.documentImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentType)) {
            query.put("DocumentType", request.documentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrantId)) {
            query.put("RegistrantId", request.registrantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.street)) {
            query.put("Street", request.street);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAtiRegistrant"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAtiRegistrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a registrant profile.</p>
     * 
     * @param request UpdateAtiRegistrantRequest
     * @return UpdateAtiRegistrantResponse
     */
    public UpdateAtiRegistrantResponse updateAtiRegistrant(UpdateAtiRegistrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAtiRegistrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic configuration of a specified address, such as the address name, type, and value.</p>
     * 
     * @param tmpReq UpdateCloudGtmAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressResponse
     */
    public UpdateCloudGtmAddressResponse updateCloudGtmAddressWithOptions(UpdateCloudGtmAddressRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudGtmAddressShrinkRequest request = new UpdateCloudGtmAddressShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthTasks)) {
            request.healthTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthTasks, "HealthTasks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeInfo)) {
            query.put("AttributeInfo", request.attributeInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthJudgement)) {
            query.put("HealthJudgement", request.healthJudgement);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthTasksShrink)) {
            query.put("HealthTasks", request.healthTasksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddress"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic configuration of a specified address, such as the address name, type, and value.</p>
     * 
     * @param request UpdateCloudGtmAddressRequest
     * @return UpdateCloudGtmAddressResponse
     */
    public UpdateCloudGtmAddressResponse updateCloudGtmAddress(UpdateCloudGtmAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The service status of an address is <strong>active</strong> if the address is <strong>enabled</strong> and its health check status is <strong>Normal</strong>.</li>
     * <li>The service status of an address is <strong>unavailable</strong> if the address is <strong>disabled</strong> or its health check status is <strong>abnormal</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enabled status of an address.</p>
     * 
     * @param request UpdateCloudGtmAddressEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressEnableStatusResponse
     */
    public UpdateCloudGtmAddressEnableStatusResponse updateCloudGtmAddressEnableStatusWithOptions(UpdateCloudGtmAddressEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressEnableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressEnableStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The service status of an address is <strong>active</strong> if the address is <strong>enabled</strong> and its health check status is <strong>Normal</strong>.</li>
     * <li>The service status of an address is <strong>unavailable</strong> if the address is <strong>disabled</strong> or its health check status is <strong>abnormal</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enabled status of an address.</p>
     * 
     * @param request UpdateCloudGtmAddressEnableStatusRequest
     * @return UpdateCloudGtmAddressEnableStatusResponse
     */
    public UpdateCloudGtmAddressEnableStatusResponse updateCloudGtmAddressEnableStatus(UpdateCloudGtmAddressEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressEnableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the failover method for an address based on the specified parameters.</p>
     * 
     * @param request UpdateCloudGtmAddressManualAvailableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressManualAvailableStatusResponse
     */
    public UpdateCloudGtmAddressManualAvailableStatusResponse updateCloudGtmAddressManualAvailableStatusWithOptions(UpdateCloudGtmAddressManualAvailableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availableMode)) {
            query.put("AvailableMode", request.availableMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manualAvailableStatus)) {
            query.put("ManualAvailableStatus", request.manualAvailableStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressManualAvailableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressManualAvailableStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the failover method for an address based on the specified parameters.</p>
     * 
     * @param request UpdateCloudGtmAddressManualAvailableStatusRequest
     * @return UpdateCloudGtmAddressManualAvailableStatusResponse
     */
    public UpdateCloudGtmAddressManualAvailableStatusResponse updateCloudGtmAddressManualAvailableStatus(UpdateCloudGtmAddressManualAvailableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressManualAvailableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic configuration of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolBasicConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressPoolBasicConfigResponse
     */
    public UpdateCloudGtmAddressPoolBasicConfigResponse updateCloudGtmAddressPoolBasicConfigWithOptions(UpdateCloudGtmAddressPoolBasicConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolName)) {
            query.put("AddressPoolName", request.addressPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthJudgement)) {
            query.put("HealthJudgement", request.healthJudgement);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressPoolBasicConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressPoolBasicConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the basic configuration of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolBasicConfigRequest
     * @return UpdateCloudGtmAddressPoolBasicConfigResponse
     */
    public UpdateCloudGtmAddressPoolBasicConfigResponse updateCloudGtmAddressPoolBasicConfig(UpdateCloudGtmAddressPoolBasicConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressPoolBasicConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>An address pool is considered <strong>active</strong> if it is <strong>enabled</strong> and its health check status is <strong>Normal</strong>.</li>
     * <li>An address pool is considered <strong>unavailable</strong> if it is <strong>disabled</strong> or its health check status is <strong>abnormal</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enabled status of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressPoolEnableStatusResponse
     */
    public UpdateCloudGtmAddressPoolEnableStatusResponse updateCloudGtmAddressPoolEnableStatusWithOptions(UpdateCloudGtmAddressPoolEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressPoolEnableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressPoolEnableStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>An address pool is considered <strong>active</strong> if it is <strong>enabled</strong> and its health check status is <strong>Normal</strong>.</li>
     * <li>An address pool is considered <strong>unavailable</strong> if it is <strong>disabled</strong> or its health check status is <strong>abnormal</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enabled status of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolEnableStatusRequest
     * @return UpdateCloudGtmAddressPoolEnableStatusResponse
     */
    public UpdateCloudGtmAddressPoolEnableStatusResponse updateCloudGtmAddressPoolEnableStatus(UpdateCloudGtmAddressPoolEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressPoolEnableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the load balancing policy of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolLbStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressPoolLbStrategyResponse
     */
    public UpdateCloudGtmAddressPoolLbStrategyResponse updateCloudGtmAddressPoolLbStrategyWithOptions(UpdateCloudGtmAddressPoolLbStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressLbStrategy)) {
            query.put("AddressLbStrategy", request.addressLbStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceLbStrategyMode)) {
            query.put("SequenceLbStrategyMode", request.sequenceLbStrategyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressPoolLbStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressPoolLbStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the load balancing policy of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolLbStrategyRequest
     * @return UpdateCloudGtmAddressPoolLbStrategyResponse
     */
    public UpdateCloudGtmAddressPoolLbStrategyResponse updateCloudGtmAddressPoolLbStrategy(UpdateCloudGtmAddressPoolLbStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressPoolLbStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressPoolRemarkResponse
     */
    public UpdateCloudGtmAddressPoolRemarkResponse updateCloudGtmAddressPoolRemarkWithOptions(UpdateCloudGtmAddressPoolRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolId)) {
            query.put("AddressPoolId", request.addressPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressPoolRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressPoolRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks of an address pool.</p>
     * 
     * @param request UpdateCloudGtmAddressPoolRemarkRequest
     * @return UpdateCloudGtmAddressPoolRemarkResponse
     */
    public UpdateCloudGtmAddressPoolRemarkResponse updateCloudGtmAddressPoolRemark(UpdateCloudGtmAddressPoolRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressPoolRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for an address in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request UpdateCloudGtmAddressRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmAddressRemarkResponse
     */
    public UpdateCloudGtmAddressRemarkResponse updateCloudGtmAddressRemarkWithOptions(UpdateCloudGtmAddressRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmAddressRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmAddressRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for an address in Global Traffic Manager (GTM) 3.0.</p>
     * 
     * @param request UpdateCloudGtmAddressRemarkRequest
     * @return UpdateCloudGtmAddressRemarkResponse
     */
    public UpdateCloudGtmAddressRemarkResponse updateCloudGtmAddressRemark(UpdateCloudGtmAddressRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmAddressRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新全局流量管理告警设置</p>
     * 
     * @param tmpReq UpdateCloudGtmGlobalAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmGlobalAlertResponse
     */
    public UpdateCloudGtmGlobalAlertResponse updateCloudGtmGlobalAlertWithOptions(UpdateCloudGtmGlobalAlertRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudGtmGlobalAlertShrinkRequest request = new UpdateCloudGtmGlobalAlertShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertConfig)) {
            request.alertConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertConfig, "AlertConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertGroup)) {
            request.alertGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertGroup, "AlertGroup", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigShrink)) {
            query.put("AlertConfig", request.alertConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGroupShrink)) {
            query.put("AlertGroup", request.alertGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmGlobalAlert"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmGlobalAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新全局流量管理告警设置</p>
     * 
     * @param request UpdateCloudGtmGlobalAlertRequest
     * @return UpdateCloudGtmGlobalAlertResponse
     */
    public UpdateCloudGtmGlobalAlertResponse updateCloudGtmGlobalAlert(UpdateCloudGtmGlobalAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmGlobalAlertWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateCloudGtmInstanceConfigAlertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceConfigAlertResponse
     */
    public UpdateCloudGtmInstanceConfigAlertResponse updateCloudGtmInstanceConfigAlertWithOptions(UpdateCloudGtmInstanceConfigAlertRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudGtmInstanceConfigAlertShrinkRequest request = new UpdateCloudGtmInstanceConfigAlertShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertConfig)) {
            request.alertConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertConfig, "AlertConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertGroup)) {
            request.alertGroupShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertGroup, "AlertGroup", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigShrink)) {
            query.put("AlertConfig", request.alertConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGroupShrink)) {
            query.put("AlertGroup", request.alertGroupShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertMode)) {
            query.put("AlertMode", request.alertMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceConfigAlert"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceConfigAlertResponse());
    }

    /**
     * @param request UpdateCloudGtmInstanceConfigAlertRequest
     * @return UpdateCloudGtmInstanceConfigAlertResponse
     */
    public UpdateCloudGtmInstanceConfigAlertResponse updateCloudGtmInstanceConfigAlert(UpdateCloudGtmInstanceConfigAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceConfigAlertWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the global TTL configuration of a Global Traffic Manager (GTM) 3.0 instance based on the specified parameters.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigBasicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceConfigBasicResponse
     */
    public UpdateCloudGtmInstanceConfigBasicResponse updateCloudGtmInstanceConfigBasicWithOptions(UpdateCloudGtmInstanceConfigBasicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleHostname)) {
            query.put("ScheduleHostname", request.scheduleHostname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleZoneName)) {
            query.put("ScheduleZoneName", request.scheduleZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceConfigBasic"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceConfigBasicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the global TTL configuration of a Global Traffic Manager (GTM) 3.0 instance based on the specified parameters.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigBasicRequest
     * @return UpdateCloudGtmInstanceConfigBasicResponse
     */
    public UpdateCloudGtmInstanceConfigBasicResponse updateCloudGtmInstanceConfigBasic(UpdateCloudGtmInstanceConfigBasicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceConfigBasicWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If a domain name is <strong>enabled</strong> and its health status is <strong>Normal</strong>, the service associated with the access domain name is <strong>active</strong>.</li>
     * <li>If a domain name is <strong>disabled</strong> or its health status is <strong>abnormal</strong>, the service associated with the access domain name is <strong>unavailable</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enablement status of an instance configuration based on the input parameters.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceConfigEnableStatusResponse
     */
    public UpdateCloudGtmInstanceConfigEnableStatusResponse updateCloudGtmInstanceConfigEnableStatusWithOptions(UpdateCloudGtmInstanceConfigEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceConfigEnableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceConfigEnableStatusResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If a domain name is <strong>enabled</strong> and its health status is <strong>Normal</strong>, the service associated with the access domain name is <strong>active</strong>.</li>
     * <li>If a domain name is <strong>disabled</strong> or its health status is <strong>abnormal</strong>, the service associated with the access domain name is <strong>unavailable</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the enablement status of an instance configuration based on the input parameters.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigEnableStatusRequest
     * @return UpdateCloudGtmInstanceConfigEnableStatusResponse
     */
    public UpdateCloudGtmInstanceConfigEnableStatusResponse updateCloudGtmInstanceConfigEnableStatus(UpdateCloudGtmInstanceConfigEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceConfigEnableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the load balancing policy for an instance configuration.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigLbStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceConfigLbStrategyResponse
     */
    public UpdateCloudGtmInstanceConfigLbStrategyResponse updateCloudGtmInstanceConfigLbStrategyWithOptions(UpdateCloudGtmInstanceConfigLbStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressPoolLbStrategy)) {
            query.put("AddressPoolLbStrategy", request.addressPoolLbStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequenceLbStrategyMode)) {
            query.put("SequenceLbStrategyMode", request.sequenceLbStrategyMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceConfigLbStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceConfigLbStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the load balancing policy for an instance configuration.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigLbStrategyRequest
     * @return UpdateCloudGtmInstanceConfigLbStrategyResponse
     */
    public UpdateCloudGtmInstanceConfigLbStrategyResponse updateCloudGtmInstanceConfigLbStrategy(UpdateCloudGtmInstanceConfigLbStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceConfigLbStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for an instance configuration.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceConfigRemarkResponse
     */
    public UpdateCloudGtmInstanceConfigRemarkResponse updateCloudGtmInstanceConfigRemarkWithOptions(UpdateCloudGtmInstanceConfigRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceConfigRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceConfigRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for an instance configuration.</p>
     * 
     * @param request UpdateCloudGtmInstanceConfigRemarkRequest
     * @return UpdateCloudGtmInstanceConfigRemarkResponse
     */
    public UpdateCloudGtmInstanceConfigRemarkResponse updateCloudGtmInstanceConfigRemark(UpdateCloudGtmInstanceConfigRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceConfigRemarkWithOptions(request, runtime);
    }

    /**
     * @param request UpdateCloudGtmInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmInstanceNameResponse
     */
    public UpdateCloudGtmInstanceNameResponse updateCloudGtmInstanceNameWithOptions(UpdateCloudGtmInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmInstanceName"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmInstanceNameResponse());
    }

    /**
     * @param request UpdateCloudGtmInstanceNameRequest
     * @return UpdateCloudGtmInstanceNameResponse
     */
    public UpdateCloudGtmInstanceNameResponse updateCloudGtmInstanceName(UpdateCloudGtmInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a health check template.</p>
     * 
     * @param tmpReq UpdateCloudGtmMonitorTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmMonitorTemplateResponse
     */
    public UpdateCloudGtmMonitorTemplateResponse updateCloudGtmMonitorTemplateWithOptions(UpdateCloudGtmMonitorTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudGtmMonitorTemplateShrinkRequest request = new UpdateCloudGtmMonitorTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ispCityNodes)) {
            request.ispCityNodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ispCityNodes, "IspCityNodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            query.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failureRate)) {
            query.put("FailureRate", request.failureRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNodesShrink)) {
            query.put("IspCityNodes", request.ispCityNodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmMonitorTemplate"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmMonitorTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a health check template.</p>
     * 
     * @param request UpdateCloudGtmMonitorTemplateRequest
     * @return UpdateCloudGtmMonitorTemplateResponse
     */
    public UpdateCloudGtmMonitorTemplateResponse updateCloudGtmMonitorTemplate(UpdateCloudGtmMonitorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmMonitorTemplateWithOptions(request, runtime);
    }

    /**
     * @param request UpdateCloudGtmMonitorTemplateRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudGtmMonitorTemplateRemarkResponse
     */
    public UpdateCloudGtmMonitorTemplateRemarkResponse updateCloudGtmMonitorTemplateRemarkWithOptions(UpdateCloudGtmMonitorTemplateRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudGtmMonitorTemplateRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudGtmMonitorTemplateRemarkResponse());
    }

    /**
     * @param request UpdateCloudGtmMonitorTemplateRemarkRequest
     * @return UpdateCloudGtmMonitorTemplateRemarkResponse
     */
    public UpdateCloudGtmMonitorTemplateRemarkResponse updateCloudGtmMonitorTemplateRemark(UpdateCloudGtmMonitorTemplateRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudGtmMonitorTemplateRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For each IP range, the value of EndIp must be greater than or equal to the value of StartIp.
     * The IP ranges of IP ranges cannot overlap across all custom lines for a domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a custom line specified by its unique ID.</p>
     * 
     * @param request UpdateCustomLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLineWithOptions(UpdateCustomLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipSegment)) {
            query.put("IpSegment", request.ipSegment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineId)) {
            query.put("LineId", request.lineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lineName)) {
            query.put("LineName", request.lineName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomLine"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomLineResponse());
    }

    /**
     * <b>description</b> :
     * <p>For each IP range, the value of EndIp must be greater than or equal to the value of StartIp.
     * The IP ranges of IP ranges cannot overlap across all custom lines for a domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a custom line specified by its unique ID.</p>
     * 
     * @param request UpdateCustomLineRequest
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the weight of a DNS record based on the specified parameters.</p>
     * 
     * @param request UpdateDNSSLBWeightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDNSSLBWeightResponse
     */
    public UpdateDNSSLBWeightResponse updateDNSSLBWeightWithOptions(UpdateDNSSLBWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDNSSLBWeight"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDNSSLBWeightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the weight of a DNS record based on the specified parameters.</p>
     * 
     * @param request UpdateDNSSLBWeightRequest
     * @return UpdateDNSSLBWeightResponse
     */
    public UpdateDNSSLBWeightResponse updateDNSSLBWeight(UpdateDNSSLBWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDNSSLBWeightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a DNS authoritative proxy domain.</p>
     * 
     * @param request UpdateDnsCacheDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsCacheDomainResponse
     */
    public UpdateDnsCacheDomainResponse updateDnsCacheDomainWithOptions(UpdateDnsCacheDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheTtlMax)) {
            query.put("CacheTtlMax", request.cacheTtlMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cacheTtlMin)) {
            query.put("CacheTtlMin", request.cacheTtlMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDnsServer)) {
            query.put("SourceDnsServer", request.sourceDnsServer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEdns)) {
            query.put("SourceEdns", request.sourceEdns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceProtocol)) {
            query.put("SourceProtocol", request.sourceProtocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsCacheDomain"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsCacheDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a DNS authoritative proxy domain.</p>
     * 
     * @param request UpdateDnsCacheDomainRequest
     * @return UpdateDnsCacheDomainResponse
     */
    public UpdateDnsCacheDomainResponse updateDnsCacheDomain(UpdateDnsCacheDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsCacheDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remark for a domain name in the DNS cache.</p>
     * 
     * @param request UpdateDnsCacheDomainRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsCacheDomainRemarkResponse
     */
    public UpdateDnsCacheDomainRemarkResponse updateDnsCacheDomainRemarkWithOptions(UpdateDnsCacheDomainRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsCacheDomainRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsCacheDomainRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remark for a domain name in the DNS cache.</p>
     * 
     * @param request UpdateDnsCacheDomainRemarkRequest
     * @return UpdateDnsCacheDomainRemarkResponse
     */
    public UpdateDnsCacheDomainRemarkResponse updateDnsCacheDomainRemark(UpdateDnsCacheDomainRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsCacheDomainRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an existing access policy.</p>
     * 
     * @param request UpdateDnsGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsGtmAccessStrategyResponse
     */
    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategyWithOptions(UpdateDnsGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessMode)) {
            query.put("AccessMode", request.accessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPool)) {
            query.put("DefaultAddrPool", request.defaultAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPoolType)) {
            query.put("DefaultAddrPoolType", request.defaultAddrPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLatencyOptimization)) {
            query.put("DefaultLatencyOptimization", request.defaultLatencyOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLbaStrategy)) {
            query.put("DefaultLbaStrategy", request.defaultLbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMaxReturnAddrNum)) {
            query.put("DefaultMaxReturnAddrNum", request.defaultMaxReturnAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMinAvailableAddrNum)) {
            query.put("DefaultMinAvailableAddrNum", request.defaultMinAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPool)) {
            query.put("FailoverAddrPool", request.failoverAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPoolType)) {
            query.put("FailoverAddrPoolType", request.failoverAddrPoolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverLatencyOptimization)) {
            query.put("FailoverLatencyOptimization", request.failoverLatencyOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverLbaStrategy)) {
            query.put("FailoverLbaStrategy", request.failoverLbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverMaxReturnAddrNum)) {
            query.put("FailoverMaxReturnAddrNum", request.failoverMaxReturnAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverMinAvailableAddrNum)) {
            query.put("FailoverMinAvailableAddrNum", request.failoverMinAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an existing access policy.</p>
     * 
     * @param request UpdateDnsGtmAccessStrategyRequest
     * @return UpdateDnsGtmAccessStrategyResponse
     */
    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an address pool.</p>
     * 
     * @param request UpdateDnsGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsGtmAddressPoolResponse
     */
    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPoolWithOptions(UpdateDnsGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addr)) {
            query.put("Addr", request.addr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lbaStrategy)) {
            query.put("LbaStrategy", request.lbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an address pool.</p>
     * 
     * @param request UpdateDnsGtmAddressPoolRequest
     * @return UpdateDnsGtmAddressPoolResponse
     */
    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request UpdateDnsGtmInstanceGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsGtmInstanceGlobalConfigResponse
     */
    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfigWithOptions(UpdateDnsGtmInstanceGlobalConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertGroup)) {
            query.put("AlertGroup", request.alertGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameType)) {
            query.put("CnameType", request.cnameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceUpdate)) {
            query.put("ForceUpdate", request.forceUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicCnameMode)) {
            query.put("PublicCnameMode", request.publicCnameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicRr)) {
            query.put("PublicRr", request.publicRr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicUserDomainName)) {
            query.put("PublicUserDomainName", request.publicUserDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicZoneName)) {
            query.put("PublicZoneName", request.publicZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsGtmInstanceGlobalConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsGtmInstanceGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request UpdateDnsGtmInstanceGlobalConfigRequest
     * @return UpdateDnsGtmInstanceGlobalConfigResponse
     */
    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a health check configuration.</p>
     * 
     * @param request UpdateDnsGtmMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDnsGtmMonitorResponse
     */
    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitorWithOptions(UpdateDnsGtmMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDnsGtmMonitor"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDnsGtmMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a health check configuration.</p>
     * 
     * @param request UpdateDnsGtmMonitorRequest
     * @return UpdateDnsGtmMonitorResponse
     */
    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDnsGtmMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation modifies the name of an existing domain name group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a domain name group.</p>
     * 
     * @param request UpdateDomainGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainGroupResponse
     */
    public UpdateDomainGroupResponse updateDomainGroupWithOptions(UpdateDomainGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainGroup"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation modifies the name of an existing domain name group.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a domain name group.</p>
     * 
     * @param request UpdateDomainGroupRequest
     * @return UpdateDomainGroupResponse
     */
    public UpdateDomainGroupResponse updateDomainGroup(UpdateDomainGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a DNS record based on the specified parameters.</p>
     * 
     * @param request UpdateDomainRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainRecordResponse
     */
    public UpdateDomainRecordResponse updateDomainRecordWithOptions(UpdateDomainRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("Line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RR)) {
            query.put("RR", request.RR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TTL)) {
            query.put("TTL", request.TTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a DNS record based on the specified parameters.</p>
     * 
     * @param request UpdateDomainRecordRequest
     * @return UpdateDomainRecordResponse
     */
    public UpdateDomainRecordResponse updateDomainRecord(UpdateDomainRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks of a DNS record.</p>
     * 
     * @param request UpdateDomainRecordRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainRecordRemarkResponse
     */
    public UpdateDomainRecordRemarkResponse updateDomainRecordRemarkWithOptions(UpdateDomainRecordRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userClientIp)) {
            query.put("UserClientIp", request.userClientIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainRecordRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainRecordRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks of a DNS record.</p>
     * 
     * @param request UpdateDomainRecordRemarkRequest
     * @return UpdateDomainRecordRemarkResponse
     */
    public UpdateDomainRecordRemarkResponse updateDomainRecordRemark(UpdateDomainRecordRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainRecordRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for a domain name.</p>
     * 
     * @param request UpdateDomainRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainRemarkResponse
     */
    public UpdateDomainRemarkResponse updateDomainRemarkWithOptions(UpdateDomainRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for a domain name.</p>
     * 
     * @param request UpdateDomainRemarkRequest
     * @return UpdateDomainRemarkResponse
     */
    public UpdateDomainRemarkResponse updateDomainRemark(UpdateDomainRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an access policy.</p>
     * 
     * @param request UpdateGtmAccessStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGtmAccessStrategyResponse
     */
    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategyWithOptions(UpdateGtmAccessStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessLines)) {
            query.put("AccessLines", request.accessLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultAddrPoolId)) {
            query.put("DefaultAddrPoolId", request.defaultAddrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.failoverAddrPoolId)) {
            query.put("FailoverAddrPoolId", request.failoverAddrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyId)) {
            query.put("StrategyId", request.strategyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyName)) {
            query.put("StrategyName", request.strategyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGtmAccessStrategy"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGtmAccessStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an access policy.</p>
     * 
     * @param request UpdateGtmAccessStrategyRequest
     * @return UpdateGtmAccessStrategyResponse
     */
    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategy(UpdateGtmAccessStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGtmAccessStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an address pool.</p>
     * 
     * @param request UpdateGtmAddressPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGtmAddressPoolResponse
     */
    public UpdateGtmAddressPoolResponse updateGtmAddressPoolWithOptions(UpdateGtmAddressPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addr)) {
            query.put("Addr", request.addr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addrPoolId)) {
            query.put("AddrPoolId", request.addrPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minAvailableAddrNum)) {
            query.put("MinAvailableAddrNum", request.minAvailableAddrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGtmAddressPool"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGtmAddressPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an address pool.</p>
     * 
     * @param request UpdateGtmAddressPoolRequest
     * @return UpdateGtmAddressPoolResponse
     */
    public UpdateGtmAddressPoolResponse updateGtmAddressPool(UpdateGtmAddressPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGtmAddressPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the global configuration of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request UpdateGtmInstanceGlobalConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGtmInstanceGlobalConfigResponse
     */
    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfigWithOptions(UpdateGtmInstanceGlobalConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertGroup)) {
            query.put("AlertGroup", request.alertGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameCustomDomainName)) {
            query.put("CnameCustomDomainName", request.cnameCustomDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameMode)) {
            query.put("CnameMode", request.cnameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lbaStrategy)) {
            query.put("LbaStrategy", request.lbaStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDomainName)) {
            query.put("UserDomainName", request.userDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGtmInstanceGlobalConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGtmInstanceGlobalConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the global configuration of a Global Traffic Manager (GTM) instance.</p>
     * 
     * @param request UpdateGtmInstanceGlobalConfigRequest
     * @return UpdateGtmInstanceGlobalConfigResponse
     */
    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfig(UpdateGtmInstanceGlobalConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a health check configuration.</p>
     * 
     * @param request UpdateGtmMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGtmMonitorResponse
     */
    public UpdateGtmMonitorResponse updateGtmMonitorWithOptions(UpdateGtmMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCityNode)) {
            query.put("IspCityNode", request.ispCityNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorConfigId)) {
            query.put("MonitorConfigId", request.monitorConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorExtendInfo)) {
            query.put("MonitorExtendInfo", request.monitorExtendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            query.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGtmMonitor"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGtmMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a health check configuration.</p>
     * 
     * @param request UpdateGtmMonitorRequest
     * @return UpdateGtmMonitorResponse
     */
    public UpdateGtmMonitorResponse updateGtmMonitor(UpdateGtmMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGtmMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a disaster recovery plan.</p>
     * 
     * @param request UpdateGtmRecoveryPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGtmRecoveryPlanResponse
     */
    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlanWithOptions(UpdateGtmRecoveryPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.faultAddrPool)) {
            query.put("FaultAddrPool", request.faultAddrPool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPlanId)) {
            query.put("RecoveryPlanId", request.recoveryPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGtmRecoveryPlan"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGtmRecoveryPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a disaster recovery plan.</p>
     * 
     * @param request UpdateGtmRecoveryPlanRequest
     * @return UpdateGtmRecoveryPlanResponse
     */
    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlan(UpdateGtmRecoveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGtmRecoveryPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cache refresh plan.</p>
     * 
     * @param request UpdateIspFlushCacheInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIspFlushCacheInstanceConfigResponse
     */
    public UpdateIspFlushCacheInstanceConfigResponse updateIspFlushCacheInstanceConfigWithOptions(UpdateIspFlushCacheInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIspFlushCacheInstanceConfig"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIspFlushCacheInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a cache refresh plan.</p>
     * 
     * @param request UpdateIspFlushCacheInstanceConfigRequest
     * @return UpdateIspFlushCacheInstanceConfigResponse
     */
    public UpdateIspFlushCacheInstanceConfigResponse updateIspFlushCacheInstanceConfig(UpdateIspFlushCacheInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIspFlushCacheInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a DNS record is locked, it cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a built-in authoritative record for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionRecordResponse
     */
    public UpdateRecursionRecordResponse updateRecursionRecordWithOptions(UpdateRecursionRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            query.put("Ttl", request.ttl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>If a DNS record is locked, it cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a built-in authoritative record for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordRequest
     * @return UpdateRecursionRecordResponse
     */
    public UpdateRecursionRecordResponse updateRecursionRecord(UpdateRecursionRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the enable status of a recursion record.</p>
     * 
     * @param request UpdateRecursionRecordEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionRecordEnableStatusResponse
     */
    public UpdateRecursionRecordEnableStatusResponse updateRecursionRecordEnableStatusWithOptions(UpdateRecursionRecordEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionRecordEnableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionRecordEnableStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the enable status of a recursion record.</p>
     * 
     * @param request UpdateRecursionRecordEnableStatusRequest
     * @return UpdateRecursionRecordEnableStatusResponse
     */
    public UpdateRecursionRecordEnableStatusResponse updateRecursionRecordEnableStatus(UpdateRecursionRecordEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionRecordEnableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for a built-in authoritative record in HTTPDNS.</p>
     * 
     * @param request UpdateRecursionRecordRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionRecordRemarkResponse
     */
    public UpdateRecursionRecordRemarkResponse updateRecursionRecordRemarkWithOptions(UpdateRecursionRecordRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionRecordRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionRecordRemarkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the remarks for a built-in authoritative record in HTTPDNS.</p>
     * 
     * @param request UpdateRecursionRecordRemarkRequest
     * @return UpdateRecursionRecordRemarkResponse
     */
    public UpdateRecursionRecordRemarkResponse updateRecursionRecordRemark(UpdateRecursionRecordRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionRecordRemarkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the weight of a DNS record for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordWeightRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionRecordWeightResponse
     */
    public UpdateRecursionRecordWeightResponse updateRecursionRecordWeightWithOptions(UpdateRecursionRecordWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionRecordWeight"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionRecordWeightResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the weight of a DNS record for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordWeightRequest
     * @return UpdateRecursionRecordWeightResponse
     */
    public UpdateRecursionRecordWeightResponse updateRecursionRecordWeight(UpdateRecursionRecordWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionRecordWeightWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the enabled status of the weight algorithm for a DNS record used for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordWeightEnableStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionRecordWeightEnableStatusResponse
     */
    public UpdateRecursionRecordWeightEnableStatusResponse updateRecursionRecordWeightEnableStatusWithOptions(UpdateRecursionRecordWeightEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStatus)) {
            query.put("EnableStatus", request.enableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestSource)) {
            query.put("RequestSource", request.requestSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionRecordWeightEnableStatus"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionRecordWeightEnableStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the enabled status of the weight algorithm for a DNS record used for recursive resolution.</p>
     * 
     * @param request UpdateRecursionRecordWeightEnableStatusRequest
     * @return UpdateRecursionRecordWeightEnableStatusResponse
     */
    public UpdateRecursionRecordWeightEnableStatusResponse updateRecursionRecordWeightEnableStatus(UpdateRecursionRecordWeightEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionRecordWeightEnableStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the effective scope of a built-in authoritative domain name zone in HTTPDNS.</p>
     * 
     * @param tmpReq UpdateRecursionZoneEffectiveScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionZoneEffectiveScopeResponse
     */
    public UpdateRecursionZoneEffectiveScopeResponse updateRecursionZoneEffectiveScopeWithOptions(UpdateRecursionZoneEffectiveScopeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRecursionZoneEffectiveScopeShrinkRequest request = new UpdateRecursionZoneEffectiveScopeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.effectiveScopes)) {
            request.effectiveScopesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.effectiveScopes, "EffectiveScopes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveScopesShrink)) {
            query.put("EffectiveScopes", request.effectiveScopesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionZoneEffectiveScope"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionZoneEffectiveScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the effective scope of a built-in authoritative domain name zone in HTTPDNS.</p>
     * 
     * @param request UpdateRecursionZoneEffectiveScopeRequest
     * @return UpdateRecursionZoneEffectiveScopeResponse
     */
    public UpdateRecursionZoneEffectiveScopeResponse updateRecursionZoneEffectiveScope(UpdateRecursionZoneEffectiveScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionZoneEffectiveScopeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP segment must be greater than or equal to the start IP address.
     * The IP address ranges of all IP segments for the domain name cannot overlap across custom lines.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the recursive proxy mode for a zone.</p>
     * 
     * @param request UpdateRecursionZoneProxyPatternRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionZoneProxyPatternResponse
     */
    public UpdateRecursionZoneProxyPatternResponse updateRecursionZoneProxyPatternWithOptions(UpdateRecursionZoneProxyPatternRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyPattern)) {
            query.put("ProxyPattern", request.proxyPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionZoneProxyPattern"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionZoneProxyPatternResponse());
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP segment must be greater than or equal to the start IP address.
     * The IP address ranges of all IP segments for the domain name cannot overlap across custom lines.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the recursive proxy mode for a zone.</p>
     * 
     * @param request UpdateRecursionZoneProxyPatternRequest
     * @return UpdateRecursionZoneProxyPatternResponse
     */
    public UpdateRecursionZoneProxyPatternResponse updateRecursionZoneProxyPattern(UpdateRecursionZoneProxyPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionZoneProxyPatternWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP segment must be greater than or equal to the start IP address.
     * For a domain name, the IP address ranges of all IP segments in all custom lines cannot overlap.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the remarks for a built-in authoritative domain name zone used for recursive resolution.</p>
     * 
     * @param request UpdateRecursionZoneRemarkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecursionZoneRemarkResponse
     */
    public UpdateRecursionZoneRemarkResponse updateRecursionZoneRemarkWithOptions(UpdateRecursionZoneRemarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecursionZoneRemark"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecursionZoneRemarkResponse());
    }

    /**
     * <b>description</b> :
     * <p>The end IP address of each IP segment must be greater than or equal to the start IP address.
     * For a domain name, the IP address ranges of all IP segments in all custom lines cannot overlap.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the remarks for a built-in authoritative domain name zone used for recursive resolution.</p>
     * 
     * @param request UpdateRecursionZoneRemarkRequest
     * @return UpdateRecursionZoneRemarkResponse
     */
    public UpdateRecursionZoneRemarkResponse updateRecursionZoneRemark(UpdateRecursionZoneRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecursionZoneRemarkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates the server-side status of a domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the server-side status of a domain name.</p>
     * 
     * @param request UpdateRspDomainServerProhibitStatusForGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRspDomainServerProhibitStatusForGatewayResponse
     */
    public UpdateRspDomainServerProhibitStatusForGatewayResponse updateRspDomainServerProhibitStatusForGatewayWithOptions(UpdateRspDomainServerProhibitStatusForGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addStatusList)) {
            query.put("AddStatusList", request.addStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteStatusList)) {
            query.put("DeleteStatusList", request.deleteStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRspDomainServerProhibitStatusForGateway"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRspDomainServerProhibitStatusForGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates the server-side status of a domain name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the server-side status of a domain name.</p>
     * 
     * @param request UpdateRspDomainServerProhibitStatusForGatewayRequest
     * @return UpdateRspDomainServerProhibitStatusForGatewayResponse
     */
    public UpdateRspDomainServerProhibitStatusForGatewayResponse updateRspDomainServerProhibitStatusForGateway(UpdateRspDomainServerProhibitStatusForGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRspDomainServerProhibitStatusForGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation updates the server-side status of a domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the server-side status of a domain name.</p>
     * 
     * @param request UpdateRspDomainServerProhibitStatusForGatewayOteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRspDomainServerProhibitStatusForGatewayOteResponse
     */
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponse updateRspDomainServerProhibitStatusForGatewayOteWithOptions(UpdateRspDomainServerProhibitStatusForGatewayOteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addStatusList)) {
            query.put("AddStatusList", request.addStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteStatusList)) {
            query.put("DeleteStatusList", request.deleteStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRspDomainServerProhibitStatusForGatewayOte"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRspDomainServerProhibitStatusForGatewayOteResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation updates the server-side status of a domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the server-side status of a domain name.</p>
     * 
     * @param request UpdateRspDomainServerProhibitStatusForGatewayOteRequest
     * @return UpdateRspDomainServerProhibitStatusForGatewayOteResponse
     */
    public UpdateRspDomainServerProhibitStatusForGatewayOteResponse updateRspDomainServerProhibitStatusForGatewayOte(UpdateRspDomainServerProhibitStatusForGatewayOteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRspDomainServerProhibitStatusForGatewayOteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an instance hostname can be added.</p>
     * 
     * @param request ValidateDnsGtmCnameRrCanUseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateDnsGtmCnameRrCanUseResponse
     */
    public ValidateDnsGtmCnameRrCanUseResponse validateDnsGtmCnameRrCanUseWithOptions(ValidateDnsGtmCnameRrCanUseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cnameMode)) {
            query.put("CnameMode", request.cnameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameRr)) {
            query.put("CnameRr", request.cnameRr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameType)) {
            query.put("CnameType", request.cnameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cnameZone)) {
            query.put("CnameZone", request.cnameZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateDnsGtmCnameRrCanUse"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateDnsGtmCnameRrCanUseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an instance hostname can be added.</p>
     * 
     * @param request ValidateDnsGtmCnameRrCanUseRequest
     * @return ValidateDnsGtmCnameRrCanUseResponse
     */
    public ValidateDnsGtmCnameRrCanUseResponse validateDnsGtmCnameRrCanUse(ValidateDnsGtmCnameRrCanUseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateDnsGtmCnameRrCanUseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates a UDP IP address segment for Public DNS.</p>
     * 
     * @param request ValidatePdnsUdpIpSegmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidatePdnsUdpIpSegmentResponse
     */
    public ValidatePdnsUdpIpSegmentResponse validatePdnsUdpIpSegmentWithOptions(ValidatePdnsUdpIpSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipToken)) {
            query.put("IpToken", request.ipToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidatePdnsUdpIpSegment"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidatePdnsUdpIpSegmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates a UDP IP address segment for Public DNS.</p>
     * 
     * @param request ValidatePdnsUdpIpSegmentRequest
     * @return ValidatePdnsUdpIpSegmentResponse
     */
    public ValidatePdnsUdpIpSegmentResponse validatePdnsUdpIpSegment(ValidatePdnsUdpIpSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validatePdnsUdpIpSegmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies DNS records.</p>
     * 
     * @param request VerifyAtiAgentDnsRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyAtiAgentDnsRecordsResponse
     */
    public VerifyAtiAgentDnsRecordsResponse verifyAtiAgentDnsRecordsWithOptions(VerifyAtiAgentDnsRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAtiAgentDnsRecords"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAtiAgentDnsRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies DNS records.</p>
     * 
     * @param request VerifyAtiAgentDnsRecordsRequest
     * @return VerifyAtiAgentDnsRecordsResponse
     */
    public VerifyAtiAgentDnsRecordsResponse verifyAtiAgentDnsRecords(VerifyAtiAgentDnsRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyAtiAgentDnsRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发 ACME 预检</p>
     * 
     * @param request VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse
     */
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse verifyAtiAgentRegisterInfoAcmeChallengeRecordWithOptions(VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentRegisterInfoId)) {
            query.put("AgentRegisterInfoId", request.agentRegisterInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyAtiAgentRegisterInfoAcmeChallengeRecord"),
            new TeaPair("version", "2015-01-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>触发 ACME 预检</p>
     * 
     * @param request VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest
     * @return VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse
     */
    public VerifyAtiAgentRegisterInfoAcmeChallengeRecordResponse verifyAtiAgentRegisterInfoAcmeChallengeRecord(VerifyAtiAgentRegisterInfoAcmeChallengeRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyAtiAgentRegisterInfoAcmeChallengeRecordWithOptions(request, runtime);
    }
}
