// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceEngineListResponseBody extends TeaModel {
    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceEngineListResponseBodyEngineList> engineList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLindormInstanceEngineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceEngineListResponseBody self = new GetLindormInstanceEngineListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceEngineListResponseBody setEngineList(java.util.List<GetLindormInstanceEngineListResponseBodyEngineList> engineList) {
        this.engineList = engineList;
        return this;
    }
    public java.util.List<GetLindormInstanceEngineListResponseBodyEngineList> getEngineList() {
        return this.engineList;
    }

    public GetLindormInstanceEngineListResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLindormInstanceEngineListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLindormInstanceEngineListResponseBodyEngineListNetInfoList extends TeaModel {
        @NameInMap("AccessType")
        public Integer accessType;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public Integer port;

        public static GetLindormInstanceEngineListResponseBodyEngineListNetInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceEngineListResponseBodyEngineListNetInfoList self = new GetLindormInstanceEngineListResponseBodyEngineListNetInfoList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceEngineListResponseBodyEngineListNetInfoList setAccessType(Integer accessType) {
            this.accessType = accessType;
            return this;
        }
        public Integer getAccessType() {
            return this.accessType;
        }

        public GetLindormInstanceEngineListResponseBodyEngineListNetInfoList setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public GetLindormInstanceEngineListResponseBodyEngineListNetInfoList setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public GetLindormInstanceEngineListResponseBodyEngineListNetInfoList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class GetLindormInstanceEngineListResponseBodyEngineList extends TeaModel {
        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("NetInfoList")
        public java.util.List<GetLindormInstanceEngineListResponseBodyEngineListNetInfoList> netInfoList;

        public static GetLindormInstanceEngineListResponseBodyEngineList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceEngineListResponseBodyEngineList self = new GetLindormInstanceEngineListResponseBodyEngineList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceEngineListResponseBodyEngineList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetLindormInstanceEngineListResponseBodyEngineList setNetInfoList(java.util.List<GetLindormInstanceEngineListResponseBodyEngineListNetInfoList> netInfoList) {
            this.netInfoList = netInfoList;
            return this;
        }
        public java.util.List<GetLindormInstanceEngineListResponseBodyEngineListNetInfoList> getNetInfoList() {
            return this.netInfoList;
        }

    }

}
