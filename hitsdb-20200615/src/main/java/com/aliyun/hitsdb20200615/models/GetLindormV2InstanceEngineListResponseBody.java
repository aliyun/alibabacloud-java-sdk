// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceEngineListResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("EngineList")
    public java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineList> engineList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLindormV2InstanceEngineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceEngineListResponseBody self = new GetLindormV2InstanceEngineListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceEngineListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormV2InstanceEngineListResponseBody setEngineList(java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormV2InstanceEngineListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormV2InstanceEngineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList extends TeaModel {
        @NameInMap("AccessType")
        public Integer accessType;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public Integer port;

        public static GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList self = new GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList setAccessType(Integer accessType) {
            this.accessType = accessType;
            return this;
        }
        public Integer getAccessType() {
            return this.accessType;
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class GetLindormV2InstanceEngineListResponseBodyEngineList extends TeaModel {
        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("NetInfoList")
        public java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList> netInfoList;

        public static GetLindormV2InstanceEngineListResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormV2InstanceEngineListResponseBodyEngineList self = new GetLindormV2InstanceEngineListResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetLindormV2InstanceEngineListResponseBodyEngineList setNetInfoList(java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList> netInfoList) {
            this.netInfoList = netInfoList;
            return this;
        }
        public java.util.List<GetLindormV2InstanceEngineListResponseBodyEngineListNetInfoList> getNetInfoList() {
            return this.netInfoList;
        }

    }

}
