// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109;

import com.aliyun.tea.*;
import com.aliyun.alidns20150109.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
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

    public AddCustomLineResponse addCustomLineWithOptions(AddCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCustomLine", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddCustomLineResponse());
    }

    public AddCustomLineResponse addCustomLine(AddCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCustomLineWithOptions(request, runtime);
    }

    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategyWithOptions(AddDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDnsGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDnsGtmAccessStrategyResponse());
    }

    public AddDnsGtmAccessStrategyResponse addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPoolWithOptions(AddDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDnsGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDnsGtmAddressPoolResponse());
    }

    public AddDnsGtmAddressPoolResponse addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public AddDnsGtmMonitorResponse addDnsGtmMonitorWithOptions(AddDnsGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDnsGtmMonitor", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDnsGtmMonitorResponse());
    }

    public AddDnsGtmMonitorResponse addDnsGtmMonitor(AddDnsGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDnsGtmMonitorWithOptions(request, runtime);
    }

    public AddDomainResponse addDomainWithOptions(AddDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDomain", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDomainResponse());
    }

    public AddDomainResponse addDomain(AddDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainWithOptions(request, runtime);
    }

    public AddDomainBackupResponse addDomainBackupWithOptions(AddDomainBackupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDomainBackup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDomainBackupResponse());
    }

    public AddDomainBackupResponse addDomainBackup(AddDomainBackupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainBackupWithOptions(request, runtime);
    }

    public AddDomainGroupResponse addDomainGroupWithOptions(AddDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDomainGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDomainGroupResponse());
    }

    public AddDomainGroupResponse addDomainGroup(AddDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainGroupWithOptions(request, runtime);
    }

    public AddDomainRecordResponse addDomainRecordWithOptions(AddDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDomainRecord", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddDomainRecordResponse());
    }

    public AddDomainRecordResponse addDomainRecord(AddDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDomainRecordWithOptions(request, runtime);
    }

    public AddGtmAccessStrategyResponse addGtmAccessStrategyWithOptions(AddGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddGtmAccessStrategyResponse());
    }

    public AddGtmAccessStrategyResponse addGtmAccessStrategy(AddGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmAccessStrategyWithOptions(request, runtime);
    }

    public AddGtmAddressPoolResponse addGtmAddressPoolWithOptions(AddGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddGtmAddressPoolResponse());
    }

    public AddGtmAddressPoolResponse addGtmAddressPool(AddGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmAddressPoolWithOptions(request, runtime);
    }

    public AddGtmMonitorResponse addGtmMonitorWithOptions(AddGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGtmMonitor", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddGtmMonitorResponse());
    }

    public AddGtmMonitorResponse addGtmMonitor(AddGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmMonitorWithOptions(request, runtime);
    }

    public AddGtmRecoveryPlanResponse addGtmRecoveryPlanWithOptions(AddGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new AddGtmRecoveryPlanResponse());
    }

    public AddGtmRecoveryPlanResponse addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGtmRecoveryPlanWithOptions(request, runtime);
    }

    public BindInstanceDomainsResponse bindInstanceDomainsWithOptions(BindInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindInstanceDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new BindInstanceDomainsResponse());
    }

    public BindInstanceDomainsResponse bindInstanceDomains(BindInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindInstanceDomainsWithOptions(request, runtime);
    }

    public ChangeDomainGroupResponse changeDomainGroupWithOptions(ChangeDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeDomainGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeDomainGroupResponse());
    }

    public ChangeDomainGroupResponse changeDomainGroup(ChangeDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeDomainGroupWithOptions(request, runtime);
    }

    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProductWithOptions(ChangeDomainOfDnsProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeDomainOfDnsProduct", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeDomainOfDnsProductResponse());
    }

    public ChangeDomainOfDnsProductResponse changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeDomainOfDnsProductWithOptions(request, runtime);
    }

    public CopyGtmConfigResponse copyGtmConfigWithOptions(CopyGtmConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyGtmConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new CopyGtmConfigResponse());
    }

    public CopyGtmConfigResponse copyGtmConfig(CopyGtmConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyGtmConfigWithOptions(request, runtime);
    }

    public DeleteCustomLinesResponse deleteCustomLinesWithOptions(DeleteCustomLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomLines", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomLinesResponse());
    }

    public DeleteCustomLinesResponse deleteCustomLines(DeleteCustomLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomLinesWithOptions(request, runtime);
    }

    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategyWithOptions(DeleteDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDnsGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDnsGtmAccessStrategyResponse());
    }

    public DeleteDnsGtmAccessStrategyResponse deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPoolWithOptions(DeleteDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDnsGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDnsGtmAddressPoolResponse());
    }

    public DeleteDnsGtmAddressPoolResponse deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeleteDomainGroupResponse deleteDomainGroupWithOptions(DeleteDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomainGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainGroupResponse());
    }

    public DeleteDomainGroupResponse deleteDomainGroup(DeleteDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainGroupWithOptions(request, runtime);
    }

    public DeleteDomainRecordResponse deleteDomainRecordWithOptions(DeleteDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomainRecord", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainRecordResponse());
    }

    public DeleteDomainRecordResponse deleteDomainRecord(DeleteDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainRecordWithOptions(request, runtime);
    }

    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategyWithOptions(DeleteGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGtmAccessStrategyResponse());
    }

    public DeleteGtmAccessStrategyResponse deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmAccessStrategyWithOptions(request, runtime);
    }

    public DeleteGtmAddressPoolResponse deleteGtmAddressPoolWithOptions(DeleteGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGtmAddressPoolResponse());
    }

    public DeleteGtmAddressPoolResponse deleteGtmAddressPool(DeleteGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmAddressPoolWithOptions(request, runtime);
    }

    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlanWithOptions(DeleteGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGtmRecoveryPlanResponse());
    }

    public DeleteGtmRecoveryPlanResponse deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGtmRecoveryPlanWithOptions(request, runtime);
    }

    public DeleteSubDomainRecordsResponse deleteSubDomainRecordsWithOptions(DeleteSubDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubDomainRecords", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubDomainRecordsResponse());
    }

    public DeleteSubDomainRecordsResponse deleteSubDomainRecords(DeleteSubDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubDomainRecordsWithOptions(request, runtime);
    }

    public DescribeBatchResultCountResponse describeBatchResultCountWithOptions(DescribeBatchResultCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBatchResultCount", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBatchResultCountResponse());
    }

    public DescribeBatchResultCountResponse describeBatchResultCount(DescribeBatchResultCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBatchResultCountWithOptions(request, runtime);
    }

    public DescribeBatchResultDetailResponse describeBatchResultDetailWithOptions(DescribeBatchResultDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBatchResultDetail", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBatchResultDetailResponse());
    }

    public DescribeBatchResultDetailResponse describeBatchResultDetail(DescribeBatchResultDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBatchResultDetailWithOptions(request, runtime);
    }

    public DescribeCustomLineResponse describeCustomLineWithOptions(DescribeCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomLine", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomLineResponse());
    }

    public DescribeCustomLineResponse describeCustomLine(DescribeCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLineWithOptions(request, runtime);
    }

    public DescribeCustomLinesResponse describeCustomLinesWithOptions(DescribeCustomLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomLines", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomLinesResponse());
    }

    public DescribeCustomLinesResponse describeCustomLines(DescribeCustomLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomLinesWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategiesWithOptions(DescribeDnsGtmAccessStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAccessStrategies", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAccessStrategiesResponse());
    }

    public DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategies(DescribeDnsGtmAccessStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategiesWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategyWithOptions(DescribeDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAccessStrategyResponse());
    }

    public DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategy(DescribeDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfigWithOptions(DescribeDnsGtmAccessStrategyAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAccessStrategyAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAccessStrategyAvailableConfigResponse());
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfig(DescribeDnsGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfoWithOptions(DescribeDnsGtmAddrAttributeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAddrAttributeInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAddrAttributeInfoResponse());
    }

    public DescribeDnsGtmAddrAttributeInfoResponse describeDnsGtmAddrAttributeInfo(DescribeDnsGtmAddrAttributeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAddrAttributeInfoWithOptions(request, runtime);
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfigWithOptions(DescribeDnsGtmAddressPoolAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAddressPoolAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAddressPoolAvailableConfigResponse());
    }

    public DescribeDnsGtmAddressPoolAvailableConfigResponse describeDnsGtmAddressPoolAvailableConfig(DescribeDnsGtmAddressPoolAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAddressPoolAvailableConfigWithOptions(request, runtime);
    }

    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroupWithOptions(DescribeDnsGtmAvailableAlertGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmAvailableAlertGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmAvailableAlertGroupResponse());
    }

    public DescribeDnsGtmAvailableAlertGroupResponse describeDnsGtmAvailableAlertGroup(DescribeDnsGtmAvailableAlertGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceResponse describeDnsGtmInstanceWithOptions(DescribeDnsGtmInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstance", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstanceResponse());
    }

    public DescribeDnsGtmInstanceResponse describeDnsGtmInstance(DescribeDnsGtmInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPoolWithOptions(DescribeDnsGtmInstanceAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstanceAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstanceAddressPoolResponse());
    }

    public DescribeDnsGtmInstanceAddressPoolResponse describeDnsGtmInstanceAddressPool(DescribeDnsGtmInstanceAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPoolsWithOptions(DescribeDnsGtmInstanceAddressPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstanceAddressPools", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstanceAddressPoolsResponse());
    }

    public DescribeDnsGtmInstanceAddressPoolsResponse describeDnsGtmInstanceAddressPools(DescribeDnsGtmInstanceAddressPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstancesResponse describeDnsGtmInstancesWithOptions(DescribeDnsGtmInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstances", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstancesResponse());
    }

    public DescribeDnsGtmInstancesResponse describeDnsGtmInstances(DescribeDnsGtmInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstancesWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatusWithOptions(DescribeDnsGtmInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstanceStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstanceStatusResponse());
    }

    public DescribeDnsGtmInstanceStatusResponse describeDnsGtmInstanceStatus(DescribeDnsGtmInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceStatusWithOptions(request, runtime);
    }

    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCnameWithOptions(DescribeDnsGtmInstanceSystemCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmInstanceSystemCname", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmInstanceSystemCnameResponse());
    }

    public DescribeDnsGtmInstanceSystemCnameResponse describeDnsGtmInstanceSystemCname(DescribeDnsGtmInstanceSystemCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    public DescribeDnsGtmLogsResponse describeDnsGtmLogsWithOptions(DescribeDnsGtmLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmLogs", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmLogsResponse());
    }

    public DescribeDnsGtmLogsResponse describeDnsGtmLogs(DescribeDnsGtmLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmLogsWithOptions(request, runtime);
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfigWithOptions(DescribeDnsGtmMonitorAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmMonitorAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmMonitorAvailableConfigResponse());
    }

    public DescribeDnsGtmMonitorAvailableConfigResponse describeDnsGtmMonitorAvailableConfig(DescribeDnsGtmMonitorAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfigWithOptions(DescribeDnsGtmMonitorConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsGtmMonitorConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsGtmMonitorConfigResponse());
    }

    public DescribeDnsGtmMonitorConfigResponse describeDnsGtmMonitorConfig(DescribeDnsGtmMonitorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsGtmMonitorConfigWithOptions(request, runtime);
    }

    public DescribeDnsProductInstanceResponse describeDnsProductInstanceWithOptions(DescribeDnsProductInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsProductInstance", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsProductInstanceResponse());
    }

    public DescribeDnsProductInstanceResponse describeDnsProductInstance(DescribeDnsProductInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsProductInstanceWithOptions(request, runtime);
    }

    public DescribeDnsProductInstancesResponse describeDnsProductInstancesWithOptions(DescribeDnsProductInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDnsProductInstances", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDnsProductInstancesResponse());
    }

    public DescribeDnsProductInstancesResponse describeDnsProductInstances(DescribeDnsProductInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDnsProductInstancesWithOptions(request, runtime);
    }

    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomainsWithOptions(DescribeDNSSLBSubDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDNSSLBSubDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDNSSLBSubDomainsResponse());
    }

    public DescribeDNSSLBSubDomainsResponse describeDNSSLBSubDomains(DescribeDNSSLBSubDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDNSSLBSubDomainsWithOptions(request, runtime);
    }

    public DescribeDohAccountStatisticsResponse describeDohAccountStatisticsWithOptions(DescribeDohAccountStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohAccountStatistics", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohAccountStatisticsResponse());
    }

    public DescribeDohAccountStatisticsResponse describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohAccountStatisticsWithOptions(request, runtime);
    }

    public DescribeDohDomainStatisticsResponse describeDohDomainStatisticsWithOptions(DescribeDohDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohDomainStatistics", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohDomainStatisticsResponse());
    }

    public DescribeDohDomainStatisticsResponse describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummaryWithOptions(DescribeDohDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohDomainStatisticsSummary", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohDomainStatisticsSummaryResponse());
    }

    public DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatisticsWithOptions(DescribeDohSubDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohSubDomainStatistics", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohSubDomainStatisticsResponse());
    }

    public DescribeDohSubDomainStatisticsResponse describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohSubDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummaryWithOptions(DescribeDohSubDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohSubDomainStatisticsSummary", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohSubDomainStatisticsSummaryResponse());
    }

    public DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohSubDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeDohUserInfoResponse describeDohUserInfoWithOptions(DescribeDohUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDohUserInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDohUserInfoResponse());
    }

    public DescribeDohUserInfoResponse describeDohUserInfo(DescribeDohUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDohUserInfoWithOptions(request, runtime);
    }

    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfoWithOptions(DescribeDomainDnssecInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainDnssecInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainDnssecInfoResponse());
    }

    public DescribeDomainDnssecInfoResponse describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainDnssecInfoWithOptions(request, runtime);
    }

    public DescribeDomainGroupsResponse describeDomainGroupsWithOptions(DescribeDomainGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainGroups", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainGroupsResponse());
    }

    public DescribeDomainGroupsResponse describeDomainGroups(DescribeDomainGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainGroupsWithOptions(request, runtime);
    }

    public DescribeDomainInfoResponse describeDomainInfoWithOptions(DescribeDomainInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainInfoResponse());
    }

    public DescribeDomainInfoResponse describeDomainInfo(DescribeDomainInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainInfoWithOptions(request, runtime);
    }

    public DescribeDomainLogsResponse describeDomainLogsWithOptions(DescribeDomainLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainLogs", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainLogsResponse());
    }

    public DescribeDomainLogsResponse describeDomainLogs(DescribeDomainLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainLogsWithOptions(request, runtime);
    }

    public DescribeDomainNsResponse describeDomainNsWithOptions(DescribeDomainNsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainNs", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainNsResponse());
    }

    public DescribeDomainNsResponse describeDomainNs(DescribeDomainNsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainNsWithOptions(request, runtime);
    }

    public DescribeDomainRecordInfoResponse describeDomainRecordInfoWithOptions(DescribeDomainRecordInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRecordInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRecordInfoResponse());
    }

    public DescribeDomainRecordInfoResponse describeDomainRecordInfo(DescribeDomainRecordInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRecordInfoWithOptions(request, runtime);
    }

    public DescribeDomainRecordsResponse describeDomainRecordsWithOptions(DescribeDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainRecords", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainRecordsResponse());
    }

    public DescribeDomainRecordsResponse describeDomainRecords(DescribeDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainRecordsWithOptions(request, runtime);
    }

    public DescribeDomainsResponse describeDomainsWithOptions(DescribeDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainsResponse());
    }

    public DescribeDomainsResponse describeDomains(DescribeDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainsWithOptions(request, runtime);
    }

    public DescribeDomainStatisticsResponse describeDomainStatisticsWithOptions(DescribeDomainStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainStatistics", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainStatisticsResponse());
    }

    public DescribeDomainStatisticsResponse describeDomainStatistics(DescribeDomainStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatisticsWithOptions(request, runtime);
    }

    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummaryWithOptions(DescribeDomainStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainStatisticsSummary", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainStatisticsSummaryResponse());
    }

    public DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategiesWithOptions(DescribeGtmAccessStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmAccessStrategies", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmAccessStrategiesResponse());
    }

    public DescribeGtmAccessStrategiesResponse describeGtmAccessStrategies(DescribeGtmAccessStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategiesWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategyWithOptions(DescribeGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmAccessStrategyResponse());
    }

    public DescribeGtmAccessStrategyResponse describeGtmAccessStrategy(DescribeGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategyWithOptions(request, runtime);
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfigWithOptions(DescribeGtmAccessStrategyAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmAccessStrategyAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmAccessStrategyAvailableConfigResponse());
    }

    public DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfig(DescribeGtmAccessStrategyAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAccessStrategyAvailableConfigWithOptions(request, runtime);
    }

    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroupWithOptions(DescribeGtmAvailableAlertGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmAvailableAlertGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmAvailableAlertGroupResponse());
    }

    public DescribeGtmAvailableAlertGroupResponse describeGtmAvailableAlertGroup(DescribeGtmAvailableAlertGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmAvailableAlertGroupWithOptions(request, runtime);
    }

    public DescribeGtmInstanceResponse describeGtmInstanceWithOptions(DescribeGtmInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstance", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstanceResponse());
    }

    public DescribeGtmInstanceResponse describeGtmInstance(DescribeGtmInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceWithOptions(request, runtime);
    }

    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPoolWithOptions(DescribeGtmInstanceAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstanceAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstanceAddressPoolResponse());
    }

    public DescribeGtmInstanceAddressPoolResponse describeGtmInstanceAddressPool(DescribeGtmInstanceAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceAddressPoolWithOptions(request, runtime);
    }

    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPoolsWithOptions(DescribeGtmInstanceAddressPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstanceAddressPools", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstanceAddressPoolsResponse());
    }

    public DescribeGtmInstanceAddressPoolsResponse describeGtmInstanceAddressPools(DescribeGtmInstanceAddressPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceAddressPoolsWithOptions(request, runtime);
    }

    public DescribeGtmInstancesResponse describeGtmInstancesWithOptions(DescribeGtmInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstances", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstancesResponse());
    }

    public DescribeGtmInstancesResponse describeGtmInstances(DescribeGtmInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstancesWithOptions(request, runtime);
    }

    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatusWithOptions(DescribeGtmInstanceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstanceStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstanceStatusResponse());
    }

    public DescribeGtmInstanceStatusResponse describeGtmInstanceStatus(DescribeGtmInstanceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceStatusWithOptions(request, runtime);
    }

    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCnameWithOptions(DescribeGtmInstanceSystemCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmInstanceSystemCname", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmInstanceSystemCnameResponse());
    }

    public DescribeGtmInstanceSystemCnameResponse describeGtmInstanceSystemCname(DescribeGtmInstanceSystemCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmInstanceSystemCnameWithOptions(request, runtime);
    }

    public DescribeGtmLogsResponse describeGtmLogsWithOptions(DescribeGtmLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmLogs", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmLogsResponse());
    }

    public DescribeGtmLogsResponse describeGtmLogs(DescribeGtmLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmLogsWithOptions(request, runtime);
    }

    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfigWithOptions(DescribeGtmMonitorAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmMonitorAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmMonitorAvailableConfigResponse());
    }

    public DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfig(DescribeGtmMonitorAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmMonitorAvailableConfigWithOptions(request, runtime);
    }

    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfigWithOptions(DescribeGtmMonitorConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmMonitorConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmMonitorConfigResponse());
    }

    public DescribeGtmMonitorConfigResponse describeGtmMonitorConfig(DescribeGtmMonitorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmMonitorConfigWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlanWithOptions(DescribeGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmRecoveryPlanResponse());
    }

    public DescribeGtmRecoveryPlanResponse describeGtmRecoveryPlan(DescribeGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlanWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfigWithOptions(DescribeGtmRecoveryPlanAvailableConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmRecoveryPlanAvailableConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmRecoveryPlanAvailableConfigResponse());
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse describeGtmRecoveryPlanAvailableConfig(DescribeGtmRecoveryPlanAvailableConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlanAvailableConfigWithOptions(request, runtime);
    }

    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlansWithOptions(DescribeGtmRecoveryPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGtmRecoveryPlans", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGtmRecoveryPlansResponse());
    }

    public DescribeGtmRecoveryPlansResponse describeGtmRecoveryPlans(DescribeGtmRecoveryPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGtmRecoveryPlansWithOptions(request, runtime);
    }

    public DescribeInstanceDomainsResponse describeInstanceDomainsWithOptions(DescribeInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceDomainsResponse());
    }

    public DescribeInstanceDomainsResponse describeInstanceDomains(DescribeInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceDomainsWithOptions(request, runtime);
    }

    public DescribeRecordLogsResponse describeRecordLogsWithOptions(DescribeRecordLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordLogs", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordLogsResponse());
    }

    public DescribeRecordLogsResponse describeRecordLogs(DescribeRecordLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordLogsWithOptions(request, runtime);
    }

    public DescribeRecordStatisticsResponse describeRecordStatisticsWithOptions(DescribeRecordStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordStatistics", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordStatisticsResponse());
    }

    public DescribeRecordStatisticsResponse describeRecordStatistics(DescribeRecordStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordStatisticsWithOptions(request, runtime);
    }

    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummaryWithOptions(DescribeRecordStatisticsSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordStatisticsSummary", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordStatisticsSummaryResponse());
    }

    public DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordStatisticsSummaryWithOptions(request, runtime);
    }

    public DescribeSubDomainRecordsResponse describeSubDomainRecordsWithOptions(DescribeSubDomainRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSubDomainRecords", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSubDomainRecordsResponse());
    }

    public DescribeSubDomainRecordsResponse describeSubDomainRecords(DescribeSubDomainRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSubDomainRecordsWithOptions(request, runtime);
    }

    public DescribeSupportLinesResponse describeSupportLinesWithOptions(DescribeSupportLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSupportLines", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSupportLinesResponse());
    }

    public DescribeSupportLinesResponse describeSupportLines(DescribeSupportLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSupportLinesWithOptions(request, runtime);
    }

    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTags", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagsResponse());
    }

    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    public DescribeTransferDomainsResponse describeTransferDomainsWithOptions(DescribeTransferDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTransferDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTransferDomainsResponse());
    }

    public DescribeTransferDomainsResponse describeTransferDomains(DescribeTransferDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTransferDomainsWithOptions(request, runtime);
    }

    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlanWithOptions(ExecuteGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteGtmRecoveryPlanResponse());
    }

    public ExecuteGtmRecoveryPlanResponse executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeGtmRecoveryPlanWithOptions(request, runtime);
    }

    public GetMainDomainNameResponse getMainDomainNameWithOptions(GetMainDomainNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMainDomainName", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetMainDomainNameResponse());
    }

    public GetMainDomainNameResponse getMainDomainName(GetMainDomainNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMainDomainNameWithOptions(request, runtime);
    }

    public GetTxtRecordForVerifyResponse getTxtRecordForVerifyWithOptions(GetTxtRecordForVerifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTxtRecordForVerify", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new GetTxtRecordForVerifyResponse());
    }

    public GetTxtRecordForVerifyResponse getTxtRecordForVerify(GetTxtRecordForVerifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTxtRecordForVerifyWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNSWithOptions(ModifyHichinaDomainDNSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHichinaDomainDNS", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHichinaDomainDNSResponse());
    }

    public ModifyHichinaDomainDNSResponse modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHichinaDomainDNSWithOptions(request, runtime);
    }

    public MoveDomainResourceGroupResponse moveDomainResourceGroupWithOptions(MoveDomainResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveDomainResourceGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new MoveDomainResourceGroupResponse());
    }

    public MoveDomainResourceGroupResponse moveDomainResourceGroup(MoveDomainResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveDomainResourceGroupWithOptions(request, runtime);
    }

    public MoveGtmResourceGroupResponse moveGtmResourceGroupWithOptions(MoveGtmResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveGtmResourceGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new MoveGtmResourceGroupResponse());
    }

    public MoveGtmResourceGroupResponse moveGtmResourceGroup(MoveGtmResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveGtmResourceGroupWithOptions(request, runtime);
    }

    public OperateBatchDomainResponse operateBatchDomainWithOptions(OperateBatchDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateBatchDomain", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new OperateBatchDomainResponse());
    }

    public OperateBatchDomainResponse operateBatchDomain(OperateBatchDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateBatchDomainWithOptions(request, runtime);
    }

    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlanWithOptions(PreviewGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PreviewGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new PreviewGtmRecoveryPlanResponse());
    }

    public PreviewGtmRecoveryPlanResponse previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.previewGtmRecoveryPlanWithOptions(request, runtime);
    }

    public RetrieveDomainResponse retrieveDomainWithOptions(RetrieveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetrieveDomain", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new RetrieveDomainResponse());
    }

    public RetrieveDomainResponse retrieveDomain(RetrieveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retrieveDomainWithOptions(request, runtime);
    }

    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlanWithOptions(RollbackGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackGtmRecoveryPlanResponse());
    }

    public RollbackGtmRecoveryPlanResponse rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackGtmRecoveryPlanWithOptions(request, runtime);
    }

    public SetDnsGtmAccessModeResponse setDnsGtmAccessModeWithOptions(SetDnsGtmAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDnsGtmAccessMode", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDnsGtmAccessModeResponse());
    }

    public SetDnsGtmAccessModeResponse setDnsGtmAccessMode(SetDnsGtmAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDnsGtmAccessModeWithOptions(request, runtime);
    }

    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatusWithOptions(SetDnsGtmMonitorStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDnsGtmMonitorStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDnsGtmMonitorStatusResponse());
    }

    public SetDnsGtmMonitorStatusResponse setDnsGtmMonitorStatus(SetDnsGtmMonitorStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDnsGtmMonitorStatusWithOptions(request, runtime);
    }

    public SetDNSSLBStatusResponse setDNSSLBStatusWithOptions(SetDNSSLBStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDNSSLBStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDNSSLBStatusResponse());
    }

    public SetDNSSLBStatusResponse setDNSSLBStatus(SetDNSSLBStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDNSSLBStatusWithOptions(request, runtime);
    }

    public SetDomainDnssecStatusResponse setDomainDnssecStatusWithOptions(SetDomainDnssecStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainDnssecStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainDnssecStatusResponse());
    }

    public SetDomainDnssecStatusResponse setDomainDnssecStatus(SetDomainDnssecStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainDnssecStatusWithOptions(request, runtime);
    }

    public SetDomainRecordStatusResponse setDomainRecordStatusWithOptions(SetDomainRecordStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDomainRecordStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetDomainRecordStatusResponse());
    }

    public SetDomainRecordStatusResponse setDomainRecordStatus(SetDomainRecordStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainRecordStatusWithOptions(request, runtime);
    }

    public SetGtmAccessModeResponse setGtmAccessModeWithOptions(SetGtmAccessModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGtmAccessMode", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetGtmAccessModeResponse());
    }

    public SetGtmAccessModeResponse setGtmAccessMode(SetGtmAccessModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGtmAccessModeWithOptions(request, runtime);
    }

    public SetGtmMonitorStatusResponse setGtmMonitorStatusWithOptions(SetGtmMonitorStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGtmMonitorStatus", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SetGtmMonitorStatusResponse());
    }

    public SetGtmMonitorStatusResponse setGtmMonitorStatus(SetGtmMonitorStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGtmMonitorStatusWithOptions(request, runtime);
    }

    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyModeWithOptions(SwitchDnsGtmInstanceStrategyModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchDnsGtmInstanceStrategyMode", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchDnsGtmInstanceStrategyModeResponse());
    }

    public SwitchDnsGtmInstanceStrategyModeResponse switchDnsGtmInstanceStrategyMode(SwitchDnsGtmInstanceStrategyModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchDnsGtmInstanceStrategyModeWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public TransferDomainResponse transferDomainWithOptions(TransferDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferDomain", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new TransferDomainResponse());
    }

    public TransferDomainResponse transferDomain(TransferDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferDomainWithOptions(request, runtime);
    }

    public UnbindInstanceDomainsResponse unbindInstanceDomainsWithOptions(UnbindInstanceDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindInstanceDomains", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindInstanceDomainsResponse());
    }

    public UnbindInstanceDomainsResponse unbindInstanceDomains(UnbindInstanceDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindInstanceDomainsWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateCustomLineResponse updateCustomLineWithOptions(UpdateCustomLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCustomLine", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCustomLineResponse());
    }

    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomLineWithOptions(request, runtime);
    }

    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategyWithOptions(UpdateDnsGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDnsGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDnsGtmAccessStrategyResponse());
    }

    public UpdateDnsGtmAccessStrategyResponse updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmAccessStrategyWithOptions(request, runtime);
    }

    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPoolWithOptions(UpdateDnsGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDnsGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDnsGtmAddressPoolResponse());
    }

    public UpdateDnsGtmAddressPoolResponse updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmAddressPoolWithOptions(request, runtime);
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfigWithOptions(UpdateDnsGtmInstanceGlobalConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDnsGtmInstanceGlobalConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDnsGtmInstanceGlobalConfigResponse());
    }

    public UpdateDnsGtmInstanceGlobalConfigResponse updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitorWithOptions(UpdateDnsGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDnsGtmMonitor", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDnsGtmMonitorResponse());
    }

    public UpdateDnsGtmMonitorResponse updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDnsGtmMonitorWithOptions(request, runtime);
    }

    public UpdateDNSSLBWeightResponse updateDNSSLBWeightWithOptions(UpdateDNSSLBWeightRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDNSSLBWeight", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDNSSLBWeightResponse());
    }

    public UpdateDNSSLBWeightResponse updateDNSSLBWeight(UpdateDNSSLBWeightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDNSSLBWeightWithOptions(request, runtime);
    }

    public UpdateDomainGroupResponse updateDomainGroupWithOptions(UpdateDomainGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainGroup", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainGroupResponse());
    }

    public UpdateDomainGroupResponse updateDomainGroup(UpdateDomainGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainGroupWithOptions(request, runtime);
    }

    public UpdateDomainRecordResponse updateDomainRecordWithOptions(UpdateDomainRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainRecord", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainRecordResponse());
    }

    public UpdateDomainRecordResponse updateDomainRecord(UpdateDomainRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRecordWithOptions(request, runtime);
    }

    public UpdateDomainRecordRemarkResponse updateDomainRecordRemarkWithOptions(UpdateDomainRecordRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainRecordRemark", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainRecordRemarkResponse());
    }

    public UpdateDomainRecordRemarkResponse updateDomainRecordRemark(UpdateDomainRecordRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRecordRemarkWithOptions(request, runtime);
    }

    public UpdateDomainRemarkResponse updateDomainRemarkWithOptions(UpdateDomainRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDomainRemark", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDomainRemarkResponse());
    }

    public UpdateDomainRemarkResponse updateDomainRemark(UpdateDomainRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDomainRemarkWithOptions(request, runtime);
    }

    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategyWithOptions(UpdateGtmAccessStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGtmAccessStrategy", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGtmAccessStrategyResponse());
    }

    public UpdateGtmAccessStrategyResponse updateGtmAccessStrategy(UpdateGtmAccessStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmAccessStrategyWithOptions(request, runtime);
    }

    public UpdateGtmAddressPoolResponse updateGtmAddressPoolWithOptions(UpdateGtmAddressPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGtmAddressPool", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGtmAddressPoolResponse());
    }

    public UpdateGtmAddressPoolResponse updateGtmAddressPool(UpdateGtmAddressPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmAddressPoolWithOptions(request, runtime);
    }

    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfigWithOptions(UpdateGtmInstanceGlobalConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGtmInstanceGlobalConfig", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGtmInstanceGlobalConfigResponse());
    }

    public UpdateGtmInstanceGlobalConfigResponse updateGtmInstanceGlobalConfig(UpdateGtmInstanceGlobalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmInstanceGlobalConfigWithOptions(request, runtime);
    }

    public UpdateGtmMonitorResponse updateGtmMonitorWithOptions(UpdateGtmMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGtmMonitor", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGtmMonitorResponse());
    }

    public UpdateGtmMonitorResponse updateGtmMonitor(UpdateGtmMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmMonitorWithOptions(request, runtime);
    }

    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlanWithOptions(UpdateGtmRecoveryPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGtmRecoveryPlan", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGtmRecoveryPlanResponse());
    }

    public UpdateGtmRecoveryPlanResponse updateGtmRecoveryPlan(UpdateGtmRecoveryPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGtmRecoveryPlanWithOptions(request, runtime);
    }

    public ValidateDnsGtmAttributeInfoResponse validateDnsGtmAttributeInfoWithOptions(ValidateDnsGtmAttributeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateDnsGtmAttributeInfo", "2015-01-09", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateDnsGtmAttributeInfoResponse());
    }

    public ValidateDnsGtmAttributeInfoResponse validateDnsGtmAttributeInfo(ValidateDnsGtmAttributeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateDnsGtmAttributeInfoWithOptions(request, runtime);
    }
}
