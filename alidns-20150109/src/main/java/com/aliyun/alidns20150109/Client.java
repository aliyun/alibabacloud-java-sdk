// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109;

import com.aliyun.tea.*;
import com.aliyun.alidns20150109.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "alidns.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dns.aliyuncs.com"),
            new TeaPair("ap-south-1", "alidns.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "alidns.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "alidns.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "alidns.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "alidns.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "alidns.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dns.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dns.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dns.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-chengdu", "alidns.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dns.aliyuncs.com"),
            new TeaPair("cn-fujian", "dns.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "alidns.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "alidns.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dns.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dns.aliyuncs.com"),
            new TeaPair("cn-hongkong", "alidns.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dns.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "alidns.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dns.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "alidns.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dns.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dns.aliyuncs.com"),
            new TeaPair("cn-shanghai", "alidns.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "alidns.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dns.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dns.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "alidns.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "alidns.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dns.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dns.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dns.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dns.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dns.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "dns.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dns.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "alidns.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dns.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dns.aliyuncs.com"),
            new TeaPair("eu-central-1", "alidns.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "alidns.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dns.aliyuncs.com"),
            new TeaPair("me-east-1", "alidns.me-east-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dns.aliyuncs.com"),
            new TeaPair("us-east-1", "alidns.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "alidns.us-west-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("alidns", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeDnsCacheDomainsResponse describeDnsCacheDomainsWithOptions(DescribeDnsCacheDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsCacheDomains", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeDnsCacheDomainsResponse());
    }

    public DescribeDnsCacheDomainsResponse describeDnsCacheDomains(DescribeDnsCacheDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsCacheDomainsWithOptions(request, runtime);
    }

    public UpdateDnsCacheDomainRemarkResponse updateDnsCacheDomainRemarkWithOptions(UpdateDnsCacheDomainRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsCacheDomainRemark", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateDnsCacheDomainRemarkResponse());
    }

    public UpdateDnsCacheDomainRemarkResponse updateDnsCacheDomainRemark(UpdateDnsCacheDomainRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsCacheDomainRemarkWithOptions(request, runtime);
    }

    public UpdateDnsCacheDomainResponse updateDnsCacheDomainWithOptions(UpdateDnsCacheDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsCacheDomain", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateDnsCacheDomainResponse());
    }

    public UpdateDnsCacheDomainResponse updateDnsCacheDomain(UpdateDnsCacheDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsCacheDomainWithOptions(request, runtime);
    }

    public DeleteDnsCacheDomainResponse deleteDnsCacheDomainWithOptions(DeleteDnsCacheDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDnsCacheDomain", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteDnsCacheDomainResponse());
    }

    public DeleteDnsCacheDomainResponse deleteDnsCacheDomain(DeleteDnsCacheDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnsCacheDomainWithOptions(request, runtime);
    }

    public AddDnsCacheDomainResponse addDnsCacheDomainWithOptions(AddDnsCacheDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDnsCacheDomain", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new AddDnsCacheDomainResponse());
    }

    public AddDnsCacheDomainResponse addDnsCacheDomain(AddDnsCacheDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsCacheDomainWithOptions(request, runtime);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfigWithOptions(DescribeDnsGtmMonitorAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmMonitorAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmMonitorAvailableConfigResponse());
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfig(DescribeDnsGtmMonitorAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitorWithOptions(UpdateDnsGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsGtmMonitor", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDnsGtmMonitorResponse());
    }

    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmMonitorWithOptions(request, runtime);
    }

    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPoolWithOptions(DeleteDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDnsGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDnsGtmAddressPoolResponse());
    }

    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatusWithOptions(SetDnsGtmMonitorStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDnsGtmMonitorStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetDnsGtmMonitorStatusResponse());
    }

    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatus(SetDnsGtmMonitorStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDnsGtmMonitorStatusWithOptions(request, runtime);
    }

    public AddDnsGtmMonitorResponse addDnsGtmMonitorWithOptions(AddDnsGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDnsGtmMonitor", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddDnsGtmMonitorResponse());
    }

    public AddDnsGtmMonitorResponse addDnsGtmMonitor(AddDnsGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmMonitorWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstancesResponse describeDnsGtmInstancesWithOptions(DescribeDnsGtmInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstances", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstancesResponse());
    }

    public DescribeDnsGtmInstancesResponse describeDnsGtmInstances(DescribeDnsGtmInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstancesWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceResponse describeDnsGtmInstanceWithOptions(DescribeDnsGtmInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstance", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstanceResponse());
    }

    public DescribeDnsGtmInstanceResponse describeDnsGtmInstance(DescribeDnsGtmInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategyWithOptions(DescribeDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAccessStrategyResponse());
    }

    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategy(DescribeDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfoWithOptions(DescribeDnsGtmAddrAttributeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAddrAttributeInfo", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAddrAttributeInfoResponse());
    }

    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfo(DescribeDnsGtmAddrAttributeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAddrAttributeInfoWithOptions(request, runtime);
    }

    public DescribeDnsGtmLogsResponse describeDnsGtmLogsWithOptions(DescribeDnsGtmLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmLogs", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmLogsResponse());
    }

    public DescribeDnsGtmLogsResponse describeDnsGtmLogs(DescribeDnsGtmLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmLogsWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfigWithOptions(DescribeDnsGtmAccessStrategyAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAccessStrategyAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAccessStrategyAvailableConfigResponse());
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfig(DescribeDnsGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPoolWithOptions(DescribeDnsGtmInstanceAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstanceAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstanceAddressPoolResponse());
    }

    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPool(DescribeDnsGtmInstanceAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfigWithOptions(DescribeDnsGtmAddressPoolAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAddressPoolAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAddressPoolAvailableConfigResponse());
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfig(DescribeDnsGtmAddressPoolAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAddressPoolAvailableConfigWithOptions(request, runtime);
    }

    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPoolWithOptions(UpdateDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDnsGtmAddressPoolResponse());
    }

    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfigWithOptions(UpdateDnsGtmInstanceGlobalConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsGtmInstanceGlobalConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDnsGtmInstanceGlobalConfigResponse());
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    public SetDnsGtmAccessModeResponse setDnsGtmAccessModeWithOptions(SetDnsGtmAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDnsGtmAccessMode", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetDnsGtmAccessModeResponse());
    }

    public SetDnsGtmAccessModeResponse setDnsGtmAccessMode(SetDnsGtmAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDnsGtmAccessModeWithOptions(request, runtime);
    }

    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategyWithOptions(DeleteDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDnsGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDnsGtmAccessStrategyResponse());
    }

    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyModeWithOptions(SwitchDnsGtmInstanceStrategyModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchDnsGtmInstanceStrategyMode", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SwitchDnsGtmInstanceStrategyModeResponse());
    }

    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyMode(SwitchDnsGtmInstanceStrategyModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDnsGtmInstanceStrategyModeWithOptions(request, runtime);
    }

    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroupWithOptions(DescribeDnsGtmAvailableAlertGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAvailableAlertGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAvailableAlertGroupResponse());
    }

    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroup(DescribeDnsGtmAvailableAlertGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategyWithOptions(AddDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDnsGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddDnsGtmAccessStrategyResponse());
    }

    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategiesWithOptions(DescribeDnsGtmAccessStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmAccessStrategies", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmAccessStrategiesResponse());
    }

    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategies(DescribeDnsGtmAccessStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategiesWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPoolsWithOptions(DescribeDnsGtmInstanceAddressPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstanceAddressPools", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstanceAddressPoolsResponse());
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPools(DescribeDnsGtmInstanceAddressPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPoolWithOptions(AddDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDnsGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddDnsGtmAddressPoolResponse());
    }

    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfigWithOptions(DescribeDnsGtmMonitorConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmMonitorConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmMonitorConfigResponse());
    }

    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfig(DescribeDnsGtmMonitorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmMonitorConfigWithOptions(request, runtime);
    }

    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategyWithOptions(UpdateDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDnsGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDnsGtmAccessStrategyResponse());
    }

    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCnameWithOptions(DescribeDnsGtmInstanceSystemCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstanceSystemCname", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstanceSystemCnameResponse());
    }

    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCname(DescribeDnsGtmInstanceSystemCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatusWithOptions(DescribeDnsGtmInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsGtmInstanceStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsGtmInstanceStatusResponse());
    }

    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatus(DescribeDnsGtmInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceStatusWithOptions(request, runtime);
    }

    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummaryWithOptions(DescribeDohDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohDomainStatisticsSummary", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohDomainStatisticsSummaryResponse());
    }

    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeDohAccountStatisticsResponse describeDohAccountStatisticsWithOptions(DescribeDohAccountStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohAccountStatistics", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohAccountStatisticsResponse());
    }

    public DescribeDohAccountStatisticsResponse describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohAccountStatisticsWithOptions(request, runtime);
    }

    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatisticsWithOptions(DescribeDohSubDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohSubDomainStatistics", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohSubDomainStatisticsResponse());
    }

    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohSubDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummaryWithOptions(DescribeDohSubDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohSubDomainStatisticsSummary", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohSubDomainStatisticsSummaryResponse());
    }

    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohSubDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeDohDomainStatisticsResponse describeDohDomainStatisticsWithOptions(DescribeDohDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohDomainStatistics", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohDomainStatisticsResponse());
    }

    public DescribeDohDomainStatisticsResponse describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeDohUserInfoResponse describeDohUserInfoWithOptions(DescribeDohUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDohUserInfo", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDohUserInfoResponse());
    }

    public DescribeDohUserInfoResponse describeDohUserInfo(DescribeDohUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohUserInfoWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTags", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public CopyGtmConfigResponse copyGtmConfigWithOptions(CopyGtmConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyGtmConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new CopyGtmConfigResponse());
    }

    public CopyGtmConfigResponse copyGtmConfig(CopyGtmConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyGtmConfigWithOptions(request, runtime);
    }

    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfoWithOptions(DescribeDomainDnssecInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainDnssecInfo", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainDnssecInfoResponse());
    }

    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainDnssecInfoWithOptions(request, runtime);
    }

    public SetDomainDnssecStatusResponse setDomainDnssecStatusWithOptions(SetDomainDnssecStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDomainDnssecStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetDomainDnssecStatusResponse());
    }

    public SetDomainDnssecStatusResponse setDomainDnssecStatus(SetDomainDnssecStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainDnssecStatusWithOptions(request, runtime);
    }

    public TransferDomainResponse transferDomainWithOptions(TransferDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TransferDomain", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new TransferDomainResponse());
    }

    public TransferDomainResponse transferDomain(TransferDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferDomainWithOptions(request, runtime);
    }

    public DescribeTransferDomainsResponse describeTransferDomainsWithOptions(DescribeTransferDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTransferDomains", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTransferDomainsResponse());
    }

    public DescribeTransferDomainsResponse describeTransferDomains(DescribeTransferDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTransferDomainsWithOptions(request, runtime);
    }

    public AddDomainBackupResponse addDomainBackupWithOptions(AddDomainBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDomainBackup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddDomainBackupResponse());
    }

    public AddDomainBackupResponse addDomainBackup(AddDomainBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainBackupWithOptions(request, runtime);
    }

    public RetrieveDomainResponse retrieveDomainWithOptions(RetrieveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RetrieveDomain", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new RetrieveDomainResponse());
    }

    public RetrieveDomainResponse retrieveDomain(RetrieveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retrieveDomainWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlanWithOptions(DescribeGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmRecoveryPlanResponse());
    }

    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlan(DescribeGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlanWithOptions(request, runtime);
    }

    public AddGtmRecoveryPlanResponse addGtmRecoveryPlanWithOptions(AddGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddGtmRecoveryPlanResponse());
    }

    public AddGtmRecoveryPlanResponse addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmRecoveryPlanWithOptions(request, runtime);
    }

    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlanWithOptions(UpdateGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGtmRecoveryPlanResponse());
    }

    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlan(UpdateGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmRecoveryPlanWithOptions(request, runtime);
    }

    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlanWithOptions(DeleteGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGtmRecoveryPlanResponse());
    }

    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmRecoveryPlanWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlansWithOptions(DescribeGtmRecoveryPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmRecoveryPlans", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmRecoveryPlansResponse());
    }

    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlans(DescribeGtmRecoveryPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlansWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfigWithOptions(DescribeGtmRecoveryPlanAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmRecoveryPlanAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmRecoveryPlanAvailableConfigResponse());
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfig(DescribeGtmRecoveryPlanAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlanAvailableConfigWithOptions(request, runtime);
    }

    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlanWithOptions(ExecuteGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExecuteGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new ExecuteGtmRecoveryPlanResponse());
    }

    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeGtmRecoveryPlanWithOptions(request, runtime);
    }

    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlanWithOptions(RollbackGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RollbackGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new RollbackGtmRecoveryPlanResponse());
    }

    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackGtmRecoveryPlanWithOptions(request, runtime);
    }

    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlanWithOptions(PreviewGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreviewGtmRecoveryPlan", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new PreviewGtmRecoveryPlanResponse());
    }

    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.previewGtmRecoveryPlanWithOptions(request, runtime);
    }

    public GetTxtRecordForVerifyResponse getTxtRecordForVerifyWithOptions(GetTxtRecordForVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTxtRecordForVerify", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new GetTxtRecordForVerifyResponse());
    }

    public GetTxtRecordForVerifyResponse getTxtRecordForVerify(GetTxtRecordForVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTxtRecordForVerifyWithOptions(request, runtime);
    }

    public DescribeDomainStatisticsResponse describeDomainStatisticsWithOptions(DescribeDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainStatistics", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainStatisticsResponse());
    }

    public DescribeDomainStatisticsResponse describeDomainStatistics(DescribeDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeRecordStatisticsResponse describeRecordStatisticsWithOptions(DescribeRecordStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecordStatistics", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordStatisticsResponse());
    }

    public DescribeRecordStatisticsResponse describeRecordStatistics(DescribeRecordStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordStatisticsWithOptions(request, runtime);
    }

    public MoveDomainResourceGroupResponse moveDomainResourceGroupWithOptions(MoveDomainResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MoveDomainResourceGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new MoveDomainResourceGroupResponse());
    }

    public MoveDomainResourceGroupResponse moveDomainResourceGroup(MoveDomainResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveDomainResourceGroupWithOptions(request, runtime);
    }

    public MoveGtmResourceGroupResponse moveGtmResourceGroupWithOptions(MoveGtmResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MoveGtmResourceGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new MoveGtmResourceGroupResponse());
    }

    public MoveGtmResourceGroupResponse moveGtmResourceGroup(MoveGtmResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveGtmResourceGroupWithOptions(request, runtime);
    }

    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCnameWithOptions(DescribeGtmInstanceSystemCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstanceSystemCname", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstanceSystemCnameResponse());
    }

    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCname(DescribeGtmInstanceSystemCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    public DescribeInstanceDomainsResponse describeInstanceDomainsWithOptions(DescribeInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceDomains", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceDomainsResponse());
    }

    public DescribeInstanceDomainsResponse describeInstanceDomains(DescribeInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceDomainsWithOptions(request, runtime);
    }

    public BindInstanceDomainsResponse bindInstanceDomainsWithOptions(BindInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindInstanceDomains", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new BindInstanceDomainsResponse());
    }

    public BindInstanceDomainsResponse bindInstanceDomains(BindInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindInstanceDomainsWithOptions(request, runtime);
    }

    public UnbindInstanceDomainsResponse unbindInstanceDomainsWithOptions(UnbindInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindInstanceDomains", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UnbindInstanceDomainsResponse());
    }

    public UnbindInstanceDomainsResponse unbindInstanceDomains(UnbindInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindInstanceDomainsWithOptions(request, runtime);
    }

    public UpdateCustomLineResponse updateCustomLineWithOptions(UpdateCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateCustomLine", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateCustomLineResponse());
    }

    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomLineWithOptions(request, runtime);
    }

    public AddCustomLineResponse addCustomLineWithOptions(AddCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddCustomLine", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddCustomLineResponse());
    }

    public AddCustomLineResponse addCustomLine(AddCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCustomLineWithOptions(request, runtime);
    }

    public DeleteCustomLinesResponse deleteCustomLinesWithOptions(DeleteCustomLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCustomLines", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCustomLinesResponse());
    }

    public DeleteCustomLinesResponse deleteCustomLines(DeleteCustomLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomLinesWithOptions(request, runtime);
    }

    public DescribeCustomLineResponse describeCustomLineWithOptions(DescribeCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomLine", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomLineResponse());
    }

    public DescribeCustomLineResponse describeCustomLine(DescribeCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLineWithOptions(request, runtime);
    }

    public DescribeCustomLinesResponse describeCustomLinesWithOptions(DescribeCustomLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomLines", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomLinesResponse());
    }

    public DescribeCustomLinesResponse describeCustomLines(DescribeCustomLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLinesWithOptions(request, runtime);
    }

    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummaryWithOptions(DescribeDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainStatisticsSummary", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainStatisticsSummaryResponse());
    }

    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummaryWithOptions(DescribeRecordStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecordStatisticsSummary", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordStatisticsSummaryResponse());
    }

    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordStatisticsSummaryWithOptions(request, runtime);
    }

    public OperateBatchDomainResponse operateBatchDomainWithOptions(OperateBatchDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OperateBatchDomain", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new OperateBatchDomainResponse());
    }

    public OperateBatchDomainResponse operateBatchDomain(OperateBatchDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateBatchDomainWithOptions(request, runtime);
    }

    public DescribeBatchResultDetailResponse describeBatchResultDetailWithOptions(DescribeBatchResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBatchResultDetail", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBatchResultDetailResponse());
    }

    public DescribeBatchResultDetailResponse describeBatchResultDetail(DescribeBatchResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBatchResultDetailWithOptions(request, runtime);
    }

    public DescribeBatchResultCountResponse describeBatchResultCountWithOptions(DescribeBatchResultCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBatchResultCount", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBatchResultCountResponse());
    }

    public DescribeBatchResultCountResponse describeBatchResultCount(DescribeBatchResultCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBatchResultCountWithOptions(request, runtime);
    }

    public SetGtmAccessModeResponse setGtmAccessModeWithOptions(SetGtmAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetGtmAccessMode", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetGtmAccessModeResponse());
    }

    public SetGtmAccessModeResponse setGtmAccessMode(SetGtmAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGtmAccessModeWithOptions(request, runtime);
    }

    public SetGtmMonitorStatusResponse setGtmMonitorStatusWithOptions(SetGtmMonitorStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetGtmMonitorStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetGtmMonitorStatusResponse());
    }

    public SetGtmMonitorStatusResponse setGtmMonitorStatus(SetGtmMonitorStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGtmMonitorStatusWithOptions(request, runtime);
    }

    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfigWithOptions(UpdateGtmInstanceGlobalConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGtmInstanceGlobalConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGtmInstanceGlobalConfigResponse());
    }

    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfig(UpdateGtmInstanceGlobalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    public DescribeGtmLogsResponse describeGtmLogsWithOptions(DescribeGtmLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmLogs", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmLogsResponse());
    }

    public DescribeGtmLogsResponse describeGtmLogs(DescribeGtmLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmLogsWithOptions(request, runtime);
    }

    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategyWithOptions(DeleteGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGtmAccessStrategyResponse());
    }

    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmAccessStrategyWithOptions(request, runtime);
    }

    public AddGtmMonitorResponse addGtmMonitorWithOptions(AddGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGtmMonitor", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddGtmMonitorResponse());
    }

    public AddGtmMonitorResponse addGtmMonitor(AddGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmMonitorWithOptions(request, runtime);
    }

    public AddGtmAddressPoolResponse addGtmAddressPoolWithOptions(AddGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddGtmAddressPoolResponse());
    }

    public AddGtmAddressPoolResponse addGtmAddressPool(AddGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmAddressPoolWithOptions(request, runtime);
    }

    public AddGtmAccessStrategyResponse addGtmAccessStrategyWithOptions(AddGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddGtmAccessStrategyResponse());
    }

    public AddGtmAccessStrategyResponse addGtmAccessStrategy(AddGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeGtmInstancesResponse describeGtmInstancesWithOptions(DescribeGtmInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstances", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstancesResponse());
    }

    public DescribeGtmInstancesResponse describeGtmInstances(DescribeGtmInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstancesWithOptions(request, runtime);
    }

    public DeleteGtmAddressPoolResponse deleteGtmAddressPoolWithOptions(DeleteGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGtmAddressPoolResponse());
    }

    public DeleteGtmAddressPoolResponse deleteGtmAddressPool(DeleteGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmAddressPoolWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategiesWithOptions(DescribeGtmAccessStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmAccessStrategies", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmAccessStrategiesResponse());
    }

    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategies(DescribeGtmAccessStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategiesWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategyWithOptions(DescribeGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmAccessStrategyResponse());
    }

    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategy(DescribeGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfigWithOptions(DescribeGtmAccessStrategyAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmAccessStrategyAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmAccessStrategyAvailableConfigResponse());
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfig(DescribeGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroupWithOptions(DescribeGtmAvailableAlertGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmAvailableAlertGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmAvailableAlertGroupResponse());
    }

    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroup(DescribeGtmAvailableAlertGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    public DescribeGtmInstanceResponse describeGtmInstanceWithOptions(DescribeGtmInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstance", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstanceResponse());
    }

    public DescribeGtmInstanceResponse describeGtmInstance(DescribeGtmInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceWithOptions(request, runtime);
    }

    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPoolWithOptions(DescribeGtmInstanceAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstanceAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstanceAddressPoolResponse());
    }

    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPool(DescribeGtmInstanceAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPoolsWithOptions(DescribeGtmInstanceAddressPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstanceAddressPools", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstanceAddressPoolsResponse());
    }

    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPools(DescribeGtmInstanceAddressPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatusWithOptions(DescribeGtmInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmInstanceStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmInstanceStatusResponse());
    }

    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatus(DescribeGtmInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceStatusWithOptions(request, runtime);
    }

    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfigWithOptions(DescribeGtmMonitorAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmMonitorAvailableConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmMonitorAvailableConfigResponse());
    }

    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfig(DescribeGtmMonitorAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfigWithOptions(DescribeGtmMonitorConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGtmMonitorConfig", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGtmMonitorConfigResponse());
    }

    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfig(DescribeGtmMonitorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmMonitorConfigWithOptions(request, runtime);
    }

    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategyWithOptions(UpdateGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGtmAccessStrategy", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGtmAccessStrategyResponse());
    }

    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategy(UpdateGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmAccessStrategyWithOptions(request, runtime);
    }

    public UpdateGtmAddressPoolResponse updateGtmAddressPoolWithOptions(UpdateGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGtmAddressPool", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGtmAddressPoolResponse());
    }

    public UpdateGtmAddressPoolResponse updateGtmAddressPool(UpdateGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmAddressPoolWithOptions(request, runtime);
    }

    public UpdateGtmMonitorResponse updateGtmMonitorWithOptions(UpdateGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGtmMonitor", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGtmMonitorResponse());
    }

    public UpdateGtmMonitorResponse updateGtmMonitor(UpdateGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmMonitorWithOptions(request, runtime);
    }

    public UpdateDomainRemarkResponse updateDomainRemarkWithOptions(UpdateDomainRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDomainRemark", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDomainRemarkResponse());
    }

    public UpdateDomainRemarkResponse updateDomainRemark(UpdateDomainRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRemarkWithOptions(request, runtime);
    }

    public UpdateDomainRecordRemarkResponse updateDomainRecordRemarkWithOptions(UpdateDomainRecordRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDomainRecordRemark", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDomainRecordRemarkResponse());
    }

    public UpdateDomainRecordRemarkResponse updateDomainRecordRemark(UpdateDomainRecordRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRecordRemarkWithOptions(request, runtime);
    }

    public DescribeSupportLinesResponse describeSupportLinesWithOptions(DescribeSupportLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSupportLines", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSupportLinesResponse());
    }

    public DescribeSupportLinesResponse describeSupportLines(DescribeSupportLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSupportLinesWithOptions(request, runtime);
    }

    public DescribeDomainNsResponse describeDomainNsWithOptions(DescribeDomainNsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainNs", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainNsResponse());
    }

    public DescribeDomainNsResponse describeDomainNs(DescribeDomainNsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNsWithOptions(request, runtime);
    }

    public DescribeDnsProductInstanceResponse describeDnsProductInstanceWithOptions(DescribeDnsProductInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsProductInstance", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsProductInstanceResponse());
    }

    public DescribeDnsProductInstanceResponse describeDnsProductInstance(DescribeDnsProductInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsProductInstanceWithOptions(request, runtime);
    }

    public UpdateDomainRecordResponse updateDomainRecordWithOptions(UpdateDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDomainRecord", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new UpdateDomainRecordResponse());
    }

    public UpdateDomainRecordResponse updateDomainRecord(UpdateDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRecordWithOptions(request, runtime);
    }

    public UpdateDomainGroupResponse updateDomainGroupWithOptions(UpdateDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDomainGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDomainGroupResponse());
    }

    public UpdateDomainGroupResponse updateDomainGroup(UpdateDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainGroupWithOptions(request, runtime);
    }

    public UpdateDNSSLBWeightResponse updateDNSSLBWeightWithOptions(UpdateDNSSLBWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDNSSLBWeight", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDNSSLBWeightResponse());
    }

    public UpdateDNSSLBWeightResponse updateDNSSLBWeight(UpdateDNSSLBWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDNSSLBWeightWithOptions(request, runtime);
    }

    public SetDomainRecordStatusResponse setDomainRecordStatusWithOptions(SetDomainRecordStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDomainRecordStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetDomainRecordStatusResponse());
    }

    public SetDomainRecordStatusResponse setDomainRecordStatus(SetDomainRecordStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainRecordStatusWithOptions(request, runtime);
    }

    public SetDNSSLBStatusResponse setDNSSLBStatusWithOptions(SetDNSSLBStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDNSSLBStatus", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new SetDNSSLBStatusResponse());
    }

    public SetDNSSLBStatusResponse setDNSSLBStatus(SetDNSSLBStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDNSSLBStatusWithOptions(request, runtime);
    }

    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNSWithOptions(ModifyHichinaDomainDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHichinaDomainDNS", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHichinaDomainDNSResponse());
    }

    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHichinaDomainDNSWithOptions(request, runtime);
    }

    public GetMainDomainNameResponse getMainDomainNameWithOptions(GetMainDomainNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMainDomainName", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new GetMainDomainNameResponse());
    }

    public GetMainDomainNameResponse getMainDomainName(GetMainDomainNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMainDomainNameWithOptions(request, runtime);
    }

    public DescribeSubDomainRecordsResponse describeSubDomainRecordsWithOptions(DescribeSubDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSubDomainRecords", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSubDomainRecordsResponse());
    }

    public DescribeSubDomainRecordsResponse describeSubDomainRecords(DescribeSubDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubDomainRecordsWithOptions(request, runtime);
    }

    public DescribeRecordLogsResponse describeRecordLogsWithOptions(DescribeRecordLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecordLogs", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordLogsResponse());
    }

    public DescribeRecordLogsResponse describeRecordLogs(DescribeRecordLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordLogsWithOptions(request, runtime);
    }

    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomains", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeDomainsResponse());
    }

    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    public DescribeDomainRecordsResponse describeDomainRecordsWithOptions(DescribeDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainRecords", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeDomainRecordsResponse());
    }

    public DescribeDomainRecordsResponse describeDomainRecords(DescribeDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRecordsWithOptions(request, runtime);
    }

    public DescribeDomainRecordInfoResponse describeDomainRecordInfoWithOptions(DescribeDomainRecordInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainRecordInfo", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeDomainRecordInfoResponse());
    }

    public DescribeDomainRecordInfoResponse describeDomainRecordInfo(DescribeDomainRecordInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRecordInfoWithOptions(request, runtime);
    }

    public DescribeDomainLogsResponse describeDomainLogsWithOptions(DescribeDomainLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainLogs", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainLogsResponse());
    }

    public DescribeDomainLogsResponse describeDomainLogs(DescribeDomainLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainLogsWithOptions(request, runtime);
    }

    public DescribeDomainInfoResponse describeDomainInfoWithOptions(DescribeDomainInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainInfo", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainInfoResponse());
    }

    public DescribeDomainInfoResponse describeDomainInfo(DescribeDomainInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainInfoWithOptions(request, runtime);
    }

    public DescribeDomainGroupsResponse describeDomainGroupsWithOptions(DescribeDomainGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDomainGroups", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDomainGroupsResponse());
    }

    public DescribeDomainGroupsResponse describeDomainGroups(DescribeDomainGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainGroupsWithOptions(request, runtime);
    }

    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomainsWithOptions(DescribeDNSSLBSubDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDNSSLBSubDomains", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDNSSLBSubDomainsResponse());
    }

    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomains(DescribeDNSSLBSubDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDNSSLBSubDomainsWithOptions(request, runtime);
    }

    public DescribeDnsProductInstancesResponse describeDnsProductInstancesWithOptions(DescribeDnsProductInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDnsProductInstances", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDnsProductInstancesResponse());
    }

    public DescribeDnsProductInstancesResponse describeDnsProductInstances(DescribeDnsProductInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsProductInstancesWithOptions(request, runtime);
    }

    public DeleteSubDomainRecordsResponse deleteSubDomainRecordsWithOptions(DeleteSubDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSubDomainRecords", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSubDomainRecordsResponse());
    }

    public DeleteSubDomainRecordsResponse deleteSubDomainRecords(DeleteSubDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubDomainRecordsWithOptions(request, runtime);
    }

    public DeleteDomainRecordResponse deleteDomainRecordWithOptions(DeleteDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDomainRecord", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteDomainRecordResponse());
    }

    public DeleteDomainRecordResponse deleteDomainRecord(DeleteDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainRecordWithOptions(request, runtime);
    }

    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDomainGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDomainGroupResponse());
    }

    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDomain", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProductWithOptions(ChangeDomainOfDnsProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeDomainOfDnsProduct", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new ChangeDomainOfDnsProductResponse());
    }

    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeDomainOfDnsProductWithOptions(request, runtime);
    }

    public ChangeDomainGroupResponse changeDomainGroupWithOptions(ChangeDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeDomainGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new ChangeDomainGroupResponse());
    }

    public ChangeDomainGroupResponse changeDomainGroup(ChangeDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeDomainGroupWithOptions(request, runtime);
    }

    public AddDomainRecordResponse addDomainRecordWithOptions(AddDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDomainRecord", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new AddDomainRecordResponse());
    }

    public AddDomainRecordResponse addDomainRecord(AddDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainRecordWithOptions(request, runtime);
    }

    public AddDomainGroupResponse addDomainGroupWithOptions(AddDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDomainGroup", "HTTPS", "POST", "2015-01-09", "AK", null, TeaModel.buildMap(request), runtime), new AddDomainGroupResponse());
    }

    public AddDomainGroupResponse addDomainGroup(AddDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainGroupWithOptions(request, runtime);
    }

    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddDomain", "HTTPS", "POST", "2015-01-09", "AK,BearerToken", null, TeaModel.buildMap(request), runtime), new AddDomainResponse());
    }

    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
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
