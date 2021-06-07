// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308;

import com.aliyun.tea.*;
import com.aliyun.eds_user20210308.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eds-user", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateUsersResponse createUsersWithOptions(CreateUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUsersResponse());
    }

    public CreateUsersResponse createUsers(CreateUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUsersWithOptions(request, runtime);
    }

    public DescribeMfaDevicesResponse describeMfaDevicesWithOptions(DescribeMfaDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMfaDevices", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMfaDevicesResponse());
    }

    public DescribeMfaDevicesResponse describeMfaDevices(DescribeMfaDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMfaDevicesWithOptions(request, runtime);
    }

    public DescribeUsersResponse describeUsersWithOptions(DescribeUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUsersResponse());
    }

    public DescribeUsersResponse describeUsers(DescribeUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUsersWithOptions(request, runtime);
    }

    public GetUsersCountResponse getUsersCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUsersCount", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetUsersCountResponse());
    }

    public GetUsersCountResponse getUsersCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUsersCountWithOptions(runtime);
    }

    public ImportUsersResponse importUsersWithOptions(ImportUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new ImportUsersResponse());
    }

    public ImportUsersResponse importUsers(ImportUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importUsersWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public LockMfaDeviceResponse lockMfaDeviceWithOptions(LockMfaDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockMfaDevice", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new LockMfaDeviceResponse());
    }

    public LockMfaDeviceResponse lockMfaDevice(LockMfaDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockMfaDeviceWithOptions(request, runtime);
    }

    public LockUsersResponse lockUsersWithOptions(LockUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new LockUsersResponse());
    }

    public LockUsersResponse lockUsers(LockUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockUsersWithOptions(request, runtime);
    }

    public RemoveMfaDeviceResponse removeMfaDeviceWithOptions(RemoveMfaDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveMfaDevice", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveMfaDeviceResponse());
    }

    public RemoveMfaDeviceResponse removeMfaDevice(RemoveMfaDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMfaDeviceWithOptions(request, runtime);
    }

    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersResponse());
    }

    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetUserPassword", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new ResetUserPasswordResponse());
    }

    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    public UnlockMfaDeviceResponse unlockMfaDeviceWithOptions(UnlockMfaDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockMfaDevice", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockMfaDeviceResponse());
    }

    public UnlockMfaDeviceResponse unlockMfaDevice(UnlockMfaDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockMfaDeviceWithOptions(request, runtime);
    }

    public UnlockUsersResponse unlockUsersWithOptions(UnlockUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockUsers", "2021-03-08", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockUsersResponse());
    }

    public UnlockUsersResponse unlockUsers(UnlockUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockUsersWithOptions(request, runtime);
    }
}
