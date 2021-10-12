// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620;

import com.aliyun.tea.*;
import com.aliyun.gpdb20190620.models.*;
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
            new TeaPair("cn-beijing", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "gpdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-west-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-east-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-qingdao", "gpdb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "gpdb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gpdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeDBInstanceForDmsResponse describeDBInstanceForDmsWithOptions(DescribeDBInstanceForDmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceForDms", "2019-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceForDmsResponse());
    }

    public DescribeDBInstanceForDmsResponse describeDBInstanceForDms(DescribeDBInstanceForDmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceForDmsWithOptions(request, runtime);
    }

    public DescribeDBInstanceSecurityIpsResponse describeDBInstanceSecurityIpsWithOptions(DescribeDBInstanceSecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstanceSecurityIps", "2019-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstanceSecurityIpsResponse());
    }

    public DescribeDBInstanceSecurityIpsResponse describeDBInstanceSecurityIps(DescribeDBInstanceSecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstanceSecurityIpsWithOptions(request, runtime);
    }

    public DescribeDBInstancesForDmsResponse describeDBInstancesForDmsWithOptions(DescribeDBInstancesForDmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDBInstancesForDms", "2019-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDBInstancesForDmsResponse());
    }

    public DescribeDBInstancesForDmsResponse describeDBInstancesForDms(DescribeDBInstancesForDmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDBInstancesForDmsWithOptions(request, runtime);
    }

    public ModifyDBInstanceSecurityIpsResponse modifyDBInstanceSecurityIpsWithOptions(ModifyDBInstanceSecurityIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDBInstanceSecurityIps", "2019-06-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDBInstanceSecurityIpsResponse());
    }

    public ModifyDBInstanceSecurityIpsResponse modifyDBInstanceSecurityIps(ModifyDBInstanceSecurityIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDBInstanceSecurityIpsWithOptions(request, runtime);
    }
}
