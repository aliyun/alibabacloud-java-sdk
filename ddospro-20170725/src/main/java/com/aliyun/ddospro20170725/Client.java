// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725;

import com.aliyun.tea.*;
import com.aliyun.ddospro20170725.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ddospro", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConfigSwitchPriorityResponse configSwitchPriorityWithOptions(ConfigSwitchPriorityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigSwitchPriority", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigSwitchPriorityResponse());
    }

    public ConfigSwitchPriorityResponse configSwitchPriority(ConfigSwitchPriorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configSwitchPriorityWithOptions(request, runtime);
    }

    public CreateCcCustomedRuleResponse createCcCustomedRuleWithOptions(CreateCcCustomedRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCcCustomedRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCcCustomedRuleResponse());
    }

    public CreateCcCustomedRuleResponse createCcCustomedRule(CreateCcCustomedRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCcCustomedRuleWithOptions(request, runtime);
    }

    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomain", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainResponse());
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    public CreatePortRuleResponse createPortRuleWithOptions(CreatePortRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePortRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePortRuleResponse());
    }

    public CreatePortRuleResponse createPortRule(CreatePortRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPortRuleWithOptions(request, runtime);
    }

    public CreateTransmitLineResponse createTransmitLineWithOptions(CreateTransmitLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTransmitLine", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTransmitLineResponse());
    }

    public CreateTransmitLineResponse createTransmitLine(CreateTransmitLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransmitLineWithOptions(request, runtime);
    }

    public DeleteCcCustomedRuleResponse deleteCcCustomedRuleWithOptions(DeleteCcCustomedRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCcCustomedRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCcCustomedRuleResponse());
    }

    public DeleteCcCustomedRuleResponse deleteCcCustomedRule(DeleteCcCustomedRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCcCustomedRuleWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public DeletePortRuleResponse deletePortRuleWithOptions(DeletePortRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePortRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePortRuleResponse());
    }

    public DeletePortRuleResponse deletePortRule(DeletePortRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePortRuleWithOptions(request, runtime);
    }

    public DeleteTransmitLineResponse deleteTransmitLineWithOptions(DeleteTransmitLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTransmitLine", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTransmitLineResponse());
    }

    public DeleteTransmitLineResponse deleteTransmitLine(DeleteTransmitLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTransmitLineWithOptions(request, runtime);
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidrWithOptions(DescribeBackSourceCidrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackSourceCidr", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackSourceCidrResponse());
    }

    public DescribeBackSourceCidrResponse describeBackSourceCidr(DescribeBackSourceCidrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackSourceCidrWithOptions(request, runtime);
    }

    public DescribeBizFlowResponse describeBizFlowWithOptions(DescribeBizFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBizFlow", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBizFlowResponse());
    }

    public DescribeBizFlowResponse describeBizFlow(DescribeBizFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBizFlowWithOptions(request, runtime);
    }

    public DescribeCcEventsResponse describeCcEventsWithOptions(DescribeCcEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcEvents", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcEventsResponse());
    }

    public DescribeCcEventsResponse describeCcEvents(DescribeCcEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcEventsWithOptions(request, runtime);
    }

    public DescribeCnameAutoStatusResponse describeCnameAutoStatusWithOptions(DescribeCnameAutoStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCnameAutoStatus", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCnameAutoStatusResponse());
    }

    public DescribeCnameAutoStatusResponse describeCnameAutoStatus(DescribeCnameAutoStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCnameAutoStatusWithOptions(request, runtime);
    }

    public DescribeDdosAttackEventsResponse describeDdosAttackEventsWithOptions(DescribeDdosAttackEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosAttackEvents", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosAttackEventsResponse());
    }

    public DescribeDdosAttackEventsResponse describeDdosAttackEvents(DescribeDdosAttackEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosAttackEventsWithOptions(request, runtime);
    }

    public DescribeDdosAttackEventSourceIpsResponse describeDdosAttackEventSourceIpsWithOptions(DescribeDdosAttackEventSourceIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosAttackEventSourceIps", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosAttackEventSourceIpsResponse());
    }

    public DescribeDdosAttackEventSourceIpsResponse describeDdosAttackEventSourceIps(DescribeDdosAttackEventSourceIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosAttackEventSourceIpsWithOptions(request, runtime);
    }

    public DescribeDdosAttackTypeChartResponse describeDdosAttackTypeChartWithOptions(DescribeDdosAttackTypeChartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosAttackTypeChart", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosAttackTypeChartResponse());
    }

    public DescribeDdosAttackTypeChartResponse describeDdosAttackTypeChart(DescribeDdosAttackTypeChartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosAttackTypeChartWithOptions(request, runtime);
    }

    public DescribeDdosFlowProportionDiagramResponse describeDdosFlowProportionDiagramWithOptions(DescribeDdosFlowProportionDiagramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosFlowProportionDiagram", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosFlowProportionDiagramResponse());
    }

    public DescribeDdosFlowProportionDiagramResponse describeDdosFlowProportionDiagram(DescribeDdosFlowProportionDiagramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosFlowProportionDiagramWithOptions(request, runtime);
    }

    public DescribeDdosIpConfigResponse describeDdosIpConfigWithOptions(DescribeDdosIpConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosIpConfig", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosIpConfigResponse());
    }

    public DescribeDdosIpConfigResponse describeDdosIpConfig(DescribeDdosIpConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosIpConfigWithOptions(request, runtime);
    }

    public DescribeDdosPeakFlowResponse describeDdosPeakFlowWithOptions(DescribeDdosPeakFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDdosPeakFlow", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDdosPeakFlowResponse());
    }

    public DescribeDdosPeakFlowResponse describeDdosPeakFlow(DescribeDdosPeakFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDdosPeakFlowWithOptions(request, runtime);
    }

    public DescribeDomainConfigPageResponse describeDomainConfigPageWithOptions(DescribeDomainConfigPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainConfigPage", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainConfigPageResponse());
    }

    public DescribeDomainConfigPageResponse describeDomainConfigPage(DescribeDomainConfigPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainConfigPageWithOptions(request, runtime);
    }

    public DescribeDomainSecurityConfigResponse describeDomainSecurityConfigWithOptions(DescribeDomainSecurityConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainSecurityConfig", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainSecurityConfigResponse());
    }

    public DescribeDomainSecurityConfigResponse describeDomainSecurityConfig(DescribeDomainSecurityConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainSecurityConfigWithOptions(request, runtime);
    }

    public DescribeHealthCheckConfigResponse describeHealthCheckConfigWithOptions(DescribeHealthCheckConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHealthCheckConfig", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHealthCheckConfigResponse());
    }

    public DescribeHealthCheckConfigResponse describeHealthCheckConfig(DescribeHealthCheckConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHealthCheckConfigWithOptions(request, runtime);
    }

    public DescribeInstancePageResponse describeInstancePageWithOptions(DescribeInstancePageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstancePage", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancePageResponse());
    }

    public DescribeInstancePageResponse describeInstancePage(DescribeInstancePageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancePageWithOptions(request, runtime);
    }

    public DescribePortRulePageResponse describePortRulePageWithOptions(DescribePortRulePageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePortRulePage", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePortRulePageResponse());
    }

    public DescribePortRulePageResponse describePortRulePage(DescribePortRulePageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePortRulePageWithOptions(request, runtime);
    }

    public ListCcCustomedRuleResponse listCcCustomedRuleWithOptions(ListCcCustomedRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCcCustomedRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListCcCustomedRuleResponse());
    }

    public ListCcCustomedRuleResponse listCcCustomedRule(ListCcCustomedRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCcCustomedRuleWithOptions(request, runtime);
    }

    public ModifyCcCustomStatusResponse modifyCcCustomStatusWithOptions(ModifyCcCustomStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCcCustomStatus", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCcCustomStatusResponse());
    }

    public ModifyCcCustomStatusResponse modifyCcCustomStatus(ModifyCcCustomStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCcCustomStatusWithOptions(request, runtime);
    }

    public ModifyCcStatusResponse modifyCcStatusWithOptions(ModifyCcStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCcStatus", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCcStatusResponse());
    }

    public ModifyCcStatusResponse modifyCcStatus(ModifyCcStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCcStatusWithOptions(request, runtime);
    }

    public ModifyCcTemplateResponse modifyCcTemplateWithOptions(ModifyCcTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCcTemplate", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCcTemplateResponse());
    }

    public ModifyCcTemplateResponse modifyCcTemplate(ModifyCcTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCcTemplateWithOptions(request, runtime);
    }

    public ModifyDDoSProtectConfigResponse modifyDDoSProtectConfigWithOptions(ModifyDDoSProtectConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDDoSProtectConfig", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDDoSProtectConfigResponse());
    }

    public ModifyDDoSProtectConfigResponse modifyDDoSProtectConfig(ModifyDDoSProtectConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDDoSProtectConfigWithOptions(request, runtime);
    }

    public ModifyDomainBlackWhiteListResponse modifyDomainBlackWhiteListWithOptions(ModifyDomainBlackWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomainBlackWhiteList", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDomainBlackWhiteListResponse());
    }

    public ModifyDomainBlackWhiteListResponse modifyDomainBlackWhiteList(ModifyDomainBlackWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainBlackWhiteListWithOptions(request, runtime);
    }

    public ModifyDomainProxyResponse modifyDomainProxyWithOptions(ModifyDomainProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDomainProxy", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDomainProxyResponse());
    }

    public ModifyDomainProxyResponse modifyDomainProxy(ModifyDomainProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDomainProxyWithOptions(request, runtime);
    }

    public ModifyElasticBandwidthResponse modifyElasticBandwidthWithOptions(ModifyElasticBandwidthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyElasticBandwidth", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyElasticBandwidthResponse());
    }

    public ModifyElasticBandwidthResponse modifyElasticBandwidth(ModifyElasticBandwidthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyElasticBandwidthWithOptions(request, runtime);
    }

    public ModifyHealthCheckConfigResponse modifyHealthCheckConfigWithOptions(ModifyHealthCheckConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHealthCheckConfig", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHealthCheckConfigResponse());
    }

    public ModifyHealthCheckConfigResponse modifyHealthCheckConfig(ModifyHealthCheckConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHealthCheckConfigWithOptions(request, runtime);
    }

    public ModifyIpCnameStatusResponse modifyIpCnameStatusWithOptions(ModifyIpCnameStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpCnameStatus", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpCnameStatusResponse());
    }

    public ModifyIpCnameStatusResponse modifyIpCnameStatus(ModifyIpCnameStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpCnameStatusWithOptions(request, runtime);
    }

    public ModifyPersistenceTimeOutResponse modifyPersistenceTimeOutWithOptions(ModifyPersistenceTimeOutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPersistenceTimeOut", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPersistenceTimeOutResponse());
    }

    public ModifyPersistenceTimeOutResponse modifyPersistenceTimeOut(ModifyPersistenceTimeOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPersistenceTimeOutWithOptions(request, runtime);
    }

    public ModifyRealServersResponse modifyRealServersWithOptions(ModifyRealServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRealServers", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRealServersResponse());
    }

    public ModifyRealServersResponse modifyRealServers(ModifyRealServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRealServersWithOptions(request, runtime);
    }

    public ModifyTransmitLineResponse modifyTransmitLineWithOptions(ModifyTransmitLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTransmitLine", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTransmitLineResponse());
    }

    public ModifyTransmitLineResponse modifyTransmitLine(ModifyTransmitLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTransmitLineWithOptions(request, runtime);
    }

    public UpdateCcCustomedRuleResponse updateCcCustomedRuleWithOptions(UpdateCcCustomedRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcCustomedRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcCustomedRuleResponse());
    }

    public UpdateCcCustomedRuleResponse updateCcCustomedRule(UpdateCcCustomedRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcCustomedRuleWithOptions(request, runtime);
    }

    public UpdatePortRuleResponse updatePortRuleWithOptions(UpdatePortRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePortRule", "2017-07-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePortRuleResponse());
    }

    public UpdatePortRuleResponse updatePortRule(UpdatePortRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePortRuleWithOptions(request, runtime);
    }
}
