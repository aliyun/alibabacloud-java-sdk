// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceEngineListResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The list of engines that can run on the specified instance.</p>
     */
    @NameInMap("EngineList")
    public java.util.List<GetLindormInstanceEngineListResponseBodyEngineList> engineList;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp1nq34mv3smk****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B496BA0E-520C-59FC-BA04-196D8F3B07EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLindormInstanceEngineListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceEngineListResponseBody self = new GetLindormInstanceEngineListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceEngineListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The method by which the connection information can be used to access LindormTable. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The default value. This value can be ignored.</li>
         * <li><strong>1</strong>: The connection information can be used to access LindormTable by using ApsaraDB for HBase API for Java.</li>
         * <li><strong>2</strong>: The connection information can be used to access LindormTable by using ApsaraDB for HBase API for a non-Java language.</li>
         * <li><strong>3</strong>: The connection information can be used to access LindormTable by using the LindormTable endpoint for CQL.</li>
         * <li><strong>4</strong>: The connection information can be used to access LindormTable by using the LindormTable endpoint for SQL.</li>
         * <li><strong>5</strong>: The connection information can be used to access Lindorm by using the LindormTable endpoint for Amazon S3.</li>
         * <li><strong>6</strong>: The connection information can be used to access Lindorm by using the LindormTable endpoint for MySQL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccessType")
        public Integer accessType;

        /**
         * <p>The endpoint that is used to connect to the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1nq34mv3smk****-proxy-lindorm.lindorm.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Internet</li>
         * <li><strong>2</strong>: virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number used to connect to the engine.</p>
         * 
         * <strong>example:</strong>
         * <p>30020</p>
         */
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
        /**
         * <p>The type of engine that can run on the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: LindormTable.</li>
         * <li><strong>tsdb</strong>: LindormTSDB.</li>
         * <li><strong>solr</strong>: LindormSearch.</li>
         * <li><strong>store</strong>: LindormDFS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The list of connection information about the engine.</p>
         */
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
