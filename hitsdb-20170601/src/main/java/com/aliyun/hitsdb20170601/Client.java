// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601;

import com.aliyun.tea.*;
import com.aliyun.hitsdb20170601.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-west-1", "hitsdb.aliyuncs.com"),
            new TeaPair("us-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-chengdu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-fujian", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "hitsdb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "hitsdb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "hitsdb.aliyuncs.com"),
            new TeaPair("me-east-1", "hitsdb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "hitsdb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hitsdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateHiTSDBInstanceResponse createHiTSDBInstanceWithOptions(CreateHiTSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHiTSDBInstance", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHiTSDBInstanceResponse());
    }

    public CreateHiTSDBInstanceResponse createHiTSDBInstance(CreateHiTSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHiTSDBInstanceWithOptions(request, runtime);
    }

    public DeleteHiTSDBInstanceResponse deleteHiTSDBInstanceWithOptions(DeleteHiTSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHiTSDBInstance", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHiTSDBInstanceResponse());
    }

    public DeleteHiTSDBInstanceResponse deleteHiTSDBInstance(DeleteHiTSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHiTSDBInstanceWithOptions(request, runtime);
    }

    public DescribeHiTSDBInstanceResponse describeHiTSDBInstanceWithOptions(DescribeHiTSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHiTSDBInstance", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHiTSDBInstanceResponse());
    }

    public DescribeHiTSDBInstanceResponse describeHiTSDBInstance(DescribeHiTSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHiTSDBInstanceWithOptions(request, runtime);
    }

    public DescribeHiTSDBInstanceListResponse describeHiTSDBInstanceListWithOptions(DescribeHiTSDBInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHiTSDBInstanceList", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHiTSDBInstanceListResponse());
    }

    public DescribeHiTSDBInstanceListResponse describeHiTSDBInstanceList(DescribeHiTSDBInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHiTSDBInstanceListWithOptions(request, runtime);
    }

    public DescribeHiTSDBInstanceSecurityIpListResponse describeHiTSDBInstanceSecurityIpListWithOptions(DescribeHiTSDBInstanceSecurityIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHiTSDBInstanceSecurityIpList", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHiTSDBInstanceSecurityIpListResponse());
    }

    public DescribeHiTSDBInstanceSecurityIpListResponse describeHiTSDBInstanceSecurityIpList(DescribeHiTSDBInstanceSecurityIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHiTSDBInstanceSecurityIpListWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeZones", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeZonesResponse());
    }

    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    public ModifyHiTSDBInstanceClassResponse modifyHiTSDBInstanceClassWithOptions(ModifyHiTSDBInstanceClassRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHiTSDBInstanceClass", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHiTSDBInstanceClassResponse());
    }

    public ModifyHiTSDBInstanceClassResponse modifyHiTSDBInstanceClass(ModifyHiTSDBInstanceClassRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHiTSDBInstanceClassWithOptions(request, runtime);
    }

    public ModifyHiTSDBInstanceSecurityIpListResponse modifyHiTSDBInstanceSecurityIpListWithOptions(ModifyHiTSDBInstanceSecurityIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHiTSDBInstanceSecurityIpList", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHiTSDBInstanceSecurityIpListResponse());
    }

    public ModifyHiTSDBInstanceSecurityIpListResponse modifyHiTSDBInstanceSecurityIpList(ModifyHiTSDBInstanceSecurityIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHiTSDBInstanceSecurityIpListWithOptions(request, runtime);
    }

    public RenameHiTSDBInstanceAliasResponse renameHiTSDBInstanceAliasWithOptions(RenameHiTSDBInstanceAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameHiTSDBInstanceAlias", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenameHiTSDBInstanceAliasResponse());
    }

    public RenameHiTSDBInstanceAliasResponse renameHiTSDBInstanceAlias(RenameHiTSDBInstanceAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameHiTSDBInstanceAliasWithOptions(request, runtime);
    }

    public RenewTSDBInstanceResponse renewTSDBInstanceWithOptions(RenewTSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewTSDBInstance", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new RenewTSDBInstanceResponse());
    }

    public RenewTSDBInstanceResponse renewTSDBInstance(RenewTSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewTSDBInstanceWithOptions(request, runtime);
    }

    public RestartHiTSDBInstanceResponse restartHiTSDBInstanceWithOptions(RestartHiTSDBInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartHiTSDBInstance", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new RestartHiTSDBInstanceResponse());
    }

    public RestartHiTSDBInstanceResponse restartHiTSDBInstance(RestartHiTSDBInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartHiTSDBInstanceWithOptions(request, runtime);
    }

    public SwitchHiTSDBInstancePublicNetResponse switchHiTSDBInstancePublicNetWithOptions(SwitchHiTSDBInstancePublicNetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SwitchHiTSDBInstancePublicNet", "2017-06-01", "HTTPS", "POST", "AK", "json", req, runtime), new SwitchHiTSDBInstancePublicNetResponse());
    }

    public SwitchHiTSDBInstancePublicNetResponse switchHiTSDBInstancePublicNet(SwitchHiTSDBInstancePublicNetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.switchHiTSDBInstancePublicNetWithOptions(request, runtime);
    }
}
