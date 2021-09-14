// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenDatasourceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Datasources")
    public GetScreenDatasourceConfigResponseBodyDatasources datasources;

    public static GetScreenDatasourceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScreenDatasourceConfigResponseBody self = new GetScreenDatasourceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScreenDatasourceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScreenDatasourceConfigResponseBody setDatasources(GetScreenDatasourceConfigResponseBodyDatasources datasources) {
        this.datasources = datasources;
        return this;
    }
    public GetScreenDatasourceConfigResponseBodyDatasources getDatasources() {
        return this.datasources;
    }

    public static class GetScreenDatasourceConfigResponseBodyDatasourcesDatasource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DataConfig")
        public String dataConfig;

        @NameInMap("ApiName")
        public String apiName;

        public static GetScreenDatasourceConfigResponseBodyDatasourcesDatasource build(java.util.Map<String, ?> map) throws Exception {
            GetScreenDatasourceConfigResponseBodyDatasourcesDatasource self = new GetScreenDatasourceConfigResponseBodyDatasourcesDatasource();
            return TeaModel.build(map, self);
        }

        public GetScreenDatasourceConfigResponseBodyDatasourcesDatasource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetScreenDatasourceConfigResponseBodyDatasourcesDatasource setDataConfig(String dataConfig) {
            this.dataConfig = dataConfig;
            return this;
        }
        public String getDataConfig() {
            return this.dataConfig;
        }

        public GetScreenDatasourceConfigResponseBodyDatasourcesDatasource setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

    }

    public static class GetScreenDatasourceConfigResponseBodyDatasources extends TeaModel {
        @NameInMap("Datasource")
        public java.util.List<GetScreenDatasourceConfigResponseBodyDatasourcesDatasource> datasource;

        public static GetScreenDatasourceConfigResponseBodyDatasources build(java.util.Map<String, ?> map) throws Exception {
            GetScreenDatasourceConfigResponseBodyDatasources self = new GetScreenDatasourceConfigResponseBodyDatasources();
            return TeaModel.build(map, self);
        }

        public GetScreenDatasourceConfigResponseBodyDatasources setDatasource(java.util.List<GetScreenDatasourceConfigResponseBodyDatasourcesDatasource> datasource) {
            this.datasource = datasource;
            return this;
        }
        public java.util.List<GetScreenDatasourceConfigResponseBodyDatasourcesDatasource> getDatasource() {
            return this.datasource;
        }

    }

}
