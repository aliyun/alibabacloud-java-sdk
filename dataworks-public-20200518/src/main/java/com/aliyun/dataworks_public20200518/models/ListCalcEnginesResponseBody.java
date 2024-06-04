// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponseBody extends TeaModel {
    /**
     * <p>The query results for compute engine instances that are returned on multiple pages.</p>
     */
    @NameInMap("Data")
    public ListCalcEnginesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCalcEnginesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesResponseBody self = new ListCalcEnginesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalcEnginesResponseBody setData(ListCalcEnginesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCalcEnginesResponseBodyData getData() {
        return this.data;
    }

    public ListCalcEnginesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCalcEnginesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalcEnginesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCalcEnginesResponseBodyDataCalcEngines extends TeaModel {
        /**
         * <p>The ID of the workspace with which the compute engine instance is associated.</p>
         */
        @NameInMap("BindingProjectId")
        public Integer bindingProjectId;

        /**
         * <p>The name of the workspace with which the compute engine instance is associated.</p>
         */
        @NameInMap("BindingProjectName")
        public String bindingProjectName;

        /**
         * <p>The type of the compute engine instance. Valid values: `ODPS`, `EMR`, `BLINK`, `HOLO`, `MaxGraph`, `HYBRIDDB_FOR_POSTGRESQL`, `ADB_MYSQL`, and `HADOOP_CDH`.</p>
         */
        @NameInMap("CalcEngineType")
        public String calcEngineType;

        /**
         * <p>The region ID of the DataWorks workspace with which the compute engine instance is associated.</p>
         */
        @NameInMap("DwRegion")
        public String dwRegion;

        /**
         * <p>The ID of the compute engine instance.</p>
         */
        @NameInMap("EngineId")
        public Integer engineId;

        /**
         * <p>The details of the compute engine instance.</p>
         * <br>
         * <p>*   ODPS</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "pubEndpoint": "service.cn.maxcompute.aliyun.com/api",</p>
         * <p>      "endpoint": "service.cn.maxcompute.aliyun-inc.com/api",</p>
         * <p>      "resourceGroupType": "ODPS",</p>
         * <p>      "resourceGroupId": "361826516****",</p>
         * <p>      "vpcEndpoint": "service.cn.maxcompute.aliyun-inc.com/api",</p>
         * <p>      "projectName": "onefall_test_zjk",</p>
         * <p>      "taskSameAsOwner": "true"</p>
         * <p>    }</p>
         * <br>
         * <p>*   EMR</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "emrClusterId": "C-xxx",</p>
         * <p>      "specs": "{\\"emrClusterId\\":\\"C-xxx\\",\\"emrAccessMode\\":\\"simple\\",\\"emrResourceQueueName\\":\\"default\\",\\"emrProjectId\\":\\"FP-xxx\\"}",</p>
         * <p>      "endpoint": "emr.aliyuncs.com",</p>
         * <p>      "emrResourceQueueName": "default",</p>
         * <p>      "emrAccessMode": "simple",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "projectName": "xx-xxxx",</p>
         * <p>      "emrProjectId": "FP-xxxx",</p>
         * <p>      "taskSameAsOwner": "false"</p>
         * <p>    }       </p>
         * <br>
         * <p>*   BLINK</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "bayesProjectId": "xxxx",</p>
         * <p>      "bayesProjectName": "xc_blxxixxxnk_1",</p>
         * <p>      "cluster": "xxxssxsx",</p>
         * <p>      "endpoint": "https://stream.console.aliyun.com",</p>
         * <p>      "engineType": "BLINK",</p>
         * <p>      "name": "xsxsxxxxx",</p>
         * <p>      "projectName": "xc_blxxxsxink_1",</p>
         * <p>      "queue": "root.xc_blxsxxxxxxink_1",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "specs": "{\\"cluster\\":\\"xxxxxx\\",\\"bayesProjectName\\":\\"xc_blxxixxxnk_1\\",\\"bayesProjectId\\":\\"ssxxxsa\\",\\"name\\":\\"sxsxsxxx\\",\\"queue\\":\\"root.sxxsxxsx\\"}",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         * <br>
         * <p>*   HOLO</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "endpoint": "hgprecn-cn-xsxssxsx-cn-shanghai-internal.hologres.aliyuncs.com:80",</p>
         * <p>      "engineType": "ODPS",</p>
         * <p>      "odpsEndpoint": "hgprecn-cn-xsxssxxs-cn-shanghai-internal.hologres.aliyuncs.com:80",</p>
         * <p>      "odpsProjectName": "xsxssxsxsx",</p>
         * <p>      "projectName": "xsxssxsxsx",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "specs": "{\\"pubEndpoint\\":\\"hgprecn-cn-xsxssxsxs-cn-shanghai.hologres.aliyuncs.com:80\\",\\"commonBuyInstanceId\\":\\"hgprecn-cn-xsxsxsxs\\",\\"project\\":\\"holo_upxsxgrade1\\",\\"common_buy_instance_id\\":\\"hgprecn-cn-xsxsxs\\",\\"endpoint\\":\\"hgprecn-cn-xsxxsxs-cn-shanghai-internal.hologres.aliyuncs.com:80\\",\\"port\\":\\"80\\",\\"host\\":\\"hgprecn-cn-xsxsxsxs-cn-shanghai-internal.hologres.aliyuncs.com\\",\\"vpcEndpoint\\":\\"hgprecn-cn-xsxsxsxs-cn-shanghai-vpc.hologres.aliyuncs.com:80\\",\\"authType\\":2,\\"region\\":\\"cn-shanghai\\"}",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         * <br>
         * <p>*   MaxGraph</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "endpoint": "http://pre-graphcompute.aliyuncs.com",</p>
         * <p>      "engineType": "ODPS",</p>
         * <p>      "odpsEndpoint": "http://pre-graphcompute.aliyuncs.com",</p>
         * <p>      "odpsProjectName": "xsxsxsxs",</p>
         * <p>      "projectName": "xsxsxsxs",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         * <br>
         * <p>*   HYBRIDDB_FOR_POSTGRESQL</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "endpoint": "hybriddb_for_postgresql_mo12121ck_endpoint",</p>
         * <p>      "engineType": "ODPS",</p>
         * <p>      "odpsEndpoint": "hybriddb_for_postgresql_m121212ock_endpoint",</p>
         * <p>      "odpsProjectName": "sxasaxsaxaxas",</p>
         * <p>      "projectName": "sxasaxsaxaxas",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "specs": "{\\"connectionString\\":\\"gp-xsxsxsxxs.gpdb.rds.aliyuncs.com\\",\\"database\\":\\"xsxsxxsxs\\",\\"password\\":\\"xxxxxxx\\",\\"instanceId\\":\\"gp-cdcdacdacda\\",\\"port\\":\\"3432\\",\\"ownerId\\":\\"12121212\\",\\"username\\":\\"sdasaddsa\\"}",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         * <br>
         * <p>*   ADB_MYSQL</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "endpoint": "adb_mysql_mock_endpoint",</p>
         * <p>      "engineType": "ODPS",</p>
         * <p>      "odpsEndpoint": "adb_mysql_mock_endpoint",</p>
         * <p>      "odpsProjectName": "am-xsaxaxa",</p>
         * <p>      "projectName": "am-xsxsaxa",</p>
         * <p>      "resourceGroupType": "DW",</p>
         * <p>      "specs": "{\\"connectionString\\":\\"am-xsaxsa.ads.aliyuncs.com:3306\\",\\"database\\":\\"xsaxsaxa\\",\\"password\\":\\"xsaxsaxassxsa\\",\\"instanceId\\":\\"am-xsaxsasx\\",\\"username\\":\\"xsaxsadsd\\"}",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         * <br>
         * <p>*   HADOOP_CDH</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    {</p>
         * <p>      "bindingBaseId": "xsaxsaxs",</p>
         * <p>      "endpoint": "xsaaaaa",</p>
         * <p>      "engineType": "ODPS",</p>
         * <p>      "odpsEndpoint": "axsxaxssxs",</p>
         * <p>      "odpsProjectName": "ssxxax",</p>
         * <p>      "projectName": "xsaxsaxsa",</p>
         * <p>      "resourceGroupId": 45208xxxxxx,</p>
         * <p>      "resourceGroupType": "GATEWAY",</p>
         * <p>      "specs": "{\\"cluster\\":{\\"hive\\":{\\"hiveServer2Url\\":\\"jdbc:hive2://xxxxxxer-1-cn-shanghai-pre-kerberos-1:10000\\",\\"hiveMetastore\\":\\"thrift://xxxxxxxr-1-cn-shanghai-pre-kerberos-1:9083\\",\\"version\\":\\"2.1.1\\"},\\"configFiles\\":{\\"coreSite\\":\\"4534574xxxxxx\\",\\"hdfsSite\\":\\"453457919xxxxxxx\\",\\"mapredSite\\":\\"45345750xxxxxx\\",\\"yarnSite\\":\\"4534575xxxxx\\",\\"krb5Conf\\":\\"4534576xxxxx1\\",\\"hiveSite\\":\\"453457xxxxx20\\"},\\"spark\\":{\\"version\\":\\"2.4.0\\"},\\"cdh\\":{\\"version\\":\\"6.3.2\\"},\\"hdfs\\":{\\"version\\":\\"3.0.0\\"},\\"impala\\":{\\"impalaUrl\\":\\"jdbc:impala://cdh-xsxssxxsx-1-cn-shanghai-pre-kerberos-1:21050\\",\\"version\\":\\"3.2.0\\"},\\"yarn\\":{\\"YarnUrl\\":\\"http://cdh-xsxsxsxsxs-1-cn-shanghai-pre-kerberos-1:8032\\",\\"webUrl\\":\\"http://cdh-xsxsxssxxssx-1-cn-shanghai-pre-kerberos-1:8088\\",\\"version\\":\\"3.0.0\\"},\\"presto\\":{\\"prestoUrl\\":\\"jdbc:presto://cdh-xssxsxxsxsxs-1-cn-shanghai-pre-kerberos-1:8080/hive/default\\",\\"version\\":\\"0.244.1\\"}},\\"instanceId\\":161sdads733,\\"authDetail\\":{\\"principal\\":\\"hive@HADOOP. COM\\",\\"keytabFileId\\":\\"45345815xsxsxs3\\",\\"type\\":\\"kerberos\\",\\"username\\":\\"xsxsxsxsa@HADOOP. COM\\"},\\"resGroupStatus\\":\\"\\",\\"hadoopAuthType\\":\\"kerberos\\",\\"clusterIdentifier\\":\\"xssxsxsxsx\\",\\"clusterId\\":xsxsx,\\"resGroupId\\":4520870619xsxssxxs,\\"accessMode\\":\\"security\\",\\"authType\\":2}",</p>
         * <p>      "taskSameAsOwner": false</p>
         * <p>    }</p>
         */
        @NameInMap("EngineInfo")
        public java.util.Map<String, ?> engineInfo;

        /**
         * <p>The environment in which the compute engine instance runs. Valid values:</p>
         * <br>
         * <p>*   DEV: development environment</p>
         * <p>*   PRD: production environment</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the compute engine instance was created. This value is a timestamp.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Indicates whether the compute engine instance is the default instance of the current compute engine type.</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The display name of the compute engine instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region in which the compute engine instance resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The identity that is used to access the compute engine instance. Valid values:</p>
         * <br>
         * <p>*   USER: current user</p>
         * <p>*   PROJECT: workspace executor</p>
         * <p>*   SUBACCOUNT: RAM user</p>
         * <p>*   STS_ROLE: Security Token Service (STS) role</p>
         */
        @NameInMap("TaskAuthType")
        public String taskAuthType;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListCalcEnginesResponseBodyDataCalcEngines build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseBodyDataCalcEngines self = new ListCalcEnginesResponseBodyDataCalcEngines();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setBindingProjectId(Integer bindingProjectId) {
            this.bindingProjectId = bindingProjectId;
            return this;
        }
        public Integer getBindingProjectId() {
            return this.bindingProjectId;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setBindingProjectName(String bindingProjectName) {
            this.bindingProjectName = bindingProjectName;
            return this;
        }
        public String getBindingProjectName() {
            return this.bindingProjectName;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setCalcEngineType(String calcEngineType) {
            this.calcEngineType = calcEngineType;
            return this;
        }
        public String getCalcEngineType() {
            return this.calcEngineType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setDwRegion(String dwRegion) {
            this.dwRegion = dwRegion;
            return this;
        }
        public String getDwRegion() {
            return this.dwRegion;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEngineId(Integer engineId) {
            this.engineId = engineId;
            return this;
        }
        public Integer getEngineId() {
            return this.engineId;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEngineInfo(java.util.Map<String, ?> engineInfo) {
            this.engineInfo = engineInfo;
            return this;
        }
        public java.util.Map<String, ?> getEngineInfo() {
            return this.engineInfo;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setTaskAuthType(String taskAuthType) {
            this.taskAuthType = taskAuthType;
            return this;
        }
        public String getTaskAuthType() {
            return this.taskAuthType;
        }

        public ListCalcEnginesResponseBodyDataCalcEngines setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListCalcEnginesResponseBodyData extends TeaModel {
        /**
         * <p>The compute engine instances.</p>
         */
        @NameInMap("CalcEngines")
        public java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> calcEngines;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compute engine instances.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCalcEnginesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCalcEnginesResponseBodyData self = new ListCalcEnginesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCalcEnginesResponseBodyData setCalcEngines(java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> calcEngines) {
            this.calcEngines = calcEngines;
            return this;
        }
        public java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> getCalcEngines() {
            return this.calcEngines;
        }

        public ListCalcEnginesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCalcEnginesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCalcEnginesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
