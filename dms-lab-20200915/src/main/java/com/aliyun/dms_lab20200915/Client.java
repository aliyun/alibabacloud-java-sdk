// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915;

import com.aliyun.tea.*;
import com.aliyun.dms_lab20200915.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dms-lab", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDatabases", "HTTPS", "POST", "2020-09-15", "AK", null, TeaModel.buildMap(request), runtime), new ListDatabasesResponse());
    }

    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDatabase", "HTTPS", "POST", "2020-09-15", "AK", null, TeaModel.buildMap(request), runtime), new GetDatabaseResponse());
    }

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    public InitDatabaseResponse initDatabaseWithOptions(InitDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitDatabase", "HTTPS", "POST", "2020-09-15", "AK", null, TeaModel.buildMap(request), runtime), new InitDatabaseResponse());
    }

    public InitDatabaseResponse initDatabase(InitDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initDatabaseWithOptions(request, runtime);
    }

    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTaskStatus", "HTTPS", "POST", "2020-09-15", "AK", null, TeaModel.buildMap(request), runtime), new GetTaskStatusResponse());
    }

    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    public ReleaseDatabaseResponse releaseDatabaseWithOptions(ReleaseDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseDatabase", "HTTPS", "POST", "2020-09-15", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseDatabaseResponse());
    }

    public ReleaseDatabaseResponse releaseDatabase(ReleaseDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseDatabaseWithOptions(request, runtime);
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
