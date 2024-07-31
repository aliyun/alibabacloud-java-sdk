// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesResponseBody extends TeaModel {
    /**
     * <p>The query results for compute engines that are returned on multiple pages.</p>
     */
    @NameInMap("Data")
    public ListCalcEnginesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The ID of the workspace with which the compute engine is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("BindingProjectId")
        public Integer bindingProjectId;

        /**
         * <p>The name of the workspace with which the compute engine is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("BindingProjectName")
        public String bindingProjectName;

        /**
         * <p>The type of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS</p>
         */
        @NameInMap("CalcEngineType")
        public String calcEngineType;

        /**
         * <p>The region where the DataWorks workspace with which the compute engine is associated resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("DwRegion")
        public String dwRegion;

        /**
         * <p>The compute engine ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("EngineId")
        public Integer engineId;

        /**
         * <p>The details of the compute engine.</p>
         * <ul>
         * <li><p>ODPS</p>
         * <pre><code>{
         *   &quot;pubEndpoint&quot;: &quot;service.cn.maxcompute.aliyun.com/api&quot;,
         *   &quot;endpoint&quot;: &quot;service.cn.maxcompute.aliyun-inc.com/api&quot;,
         *   &quot;initProperties&quot;: &quot; 
         *   {\\&quot;odpsTypeMode\\&quot;:\\&quot;STANDARD\\&quot;,\\&quot;openPai\\&quot;:false,\\&quot;openPaiGpu\\&quot;:false}&quot;,
         *   &quot;resourceGroupType&quot;: &quot;ODPS&quot;,
         *   &quot;resourceGroupId&quot;: &quot;361826516****&quot;,
         *   &quot;vpcEndpoint&quot;: &quot;service.cn.maxcompute.aliyun-inc.com/api&quot;,
         *   &quot;projectName&quot;: &quot;onefall_test_zjk&quot;,
         *   &quot;taskSameAsOwner&quot;: &quot;true&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>EMR</p>
         * <pre><code>{
         *   &quot;emrClusterId&quot;: &quot;C-xxx&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;emrClusterId\\&quot;:\\&quot;C-xxx\\&quot;,\\&quot;emrAccessMode\\&quot;:\\&quot;simple\\&quot;,\\&quot;emrResourceQueueName\\&quot;:\\&quot;default\\&quot;,\\&quot;emrProjectId\\&quot;:\\&quot;FP-xxx\\&quot;}&quot;,
         *   &quot;endpoint&quot;: &quot;emr.aliyuncs.com&quot;,
         *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
         *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;projectName&quot;: &quot;xx-xxxx&quot;,
         *   &quot;emrProjectId&quot;: &quot;FP-xxxx&quot;,
         *   &quot;taskSameAsOwner&quot;: &quot;false&quot;
         * }   
         * </code></pre>
         * </li>
         * <li><p>BLINK</p>
         * <pre><code>{
         *   &quot;bayesProjectId&quot;: &quot;xxxx&quot;,
         *   &quot;bayesProjectName&quot;: &quot;xc_blxxixxxnk_1&quot;,
         *   &quot;cluster&quot;: &quot;xxxssxsx&quot;,
         *   &quot;endpoint&quot;: &quot;https://stream.console.aliyun.com&quot;,
         *   &quot;engineType&quot;: &quot;BLINK&quot;,
         *   &quot;name&quot;: &quot;xsxsxxxxx&quot;,
         *   &quot;projectName&quot;: &quot;xc_blxxxsxink_1&quot;,
         *   &quot;queue&quot;: &quot;root.xc_blxsxxxxxxink_1&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;cluster\\&quot;:\\&quot;xxxxxx\\&quot;,\\&quot;bayesProjectName\\&quot;:\\&quot;xc_blxxixxxnk_1\\&quot;,\\&quot;bayesProjectId\\&quot;:\\&quot;ssxxxsa\\&quot;,\\&quot;name\\&quot;:\\&quot;sxsxsxxx\\&quot;,\\&quot;queue\\&quot;:\\&quot;root.sxxsxxsx\\&quot;}&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * <li><p>HOLO</p>
         * <pre><code>{
         *   &quot;endpoint&quot;: &quot;hgprecn-cn-xsxssxsx-cn-shanghai-internal.hologres.aliyuncs.com:80&quot;,
         *   &quot;engineType&quot;: &quot;ODPS&quot;,
         *   &quot;odpsEndpoint&quot;: &quot;hgprecn-cn-xsxssxxs-cn-shanghai-internal.hologres.aliyuncs.com:80&quot;,
         *   &quot;odpsProjectName&quot;: &quot;xsxssxsxsx&quot;,
         *   &quot;projectName&quot;: &quot;xsxssxsxsx&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;pubEndpoint\\&quot;:\\&quot;hgprecn-cn-xsxssxsxs-cn-shanghai.hologres.aliyuncs.com:80\\&quot;,\\&quot;commonBuyInstanceId\\&quot;:\\&quot;hgprecn-cn-xsxsxsxs\\&quot;,\\&quot;project\\&quot;:\\&quot;holo_upxsxgrade1\\&quot;,\\&quot;common_buy_instance_id\\&quot;:\\&quot;hgprecn-cn-xsxsxs\\&quot;,\\&quot;endpoint\\&quot;:\\&quot;hgprecn-cn-xsxxsxs-cn-shanghai-internal.hologres.aliyuncs.com:80\\&quot;,\\&quot;port\\&quot;:\\&quot;80\\&quot;,\\&quot;host\\&quot;:\\&quot;hgprecn-cn-xsxsxsxs-cn-shanghai-internal.hologres.aliyuncs.com\\&quot;,\\&quot;vpcEndpoint\\&quot;:\\&quot;hgprecn-cn-xsxsxsxs-cn-shanghai-vpc.hologres.aliyuncs.com:80\\&quot;,\\&quot;authType\\&quot;:2,\\&quot;region\\&quot;:\\&quot;cn-shanghai\\&quot;}&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * <li><p>MaxGraph</p>
         * <pre><code>{
         *   &quot;endpoint&quot;: &quot;http://pre-graphcompute.aliyuncs.com&quot;,
         *   &quot;engineType&quot;: &quot;ODPS&quot;,
         *   &quot;odpsEndpoint&quot;: &quot;http://pre-graphcompute.aliyuncs.com&quot;,
         *   &quot;odpsProjectName&quot;: &quot;xsxsxsxs&quot;,
         *   &quot;projectName&quot;: &quot;xsxsxsxs&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * <li><p>HYBRIDDB_FOR_POSTGRESQL</p>
         * <pre><code>{
         *   &quot;endpoint&quot;: &quot;hybriddb_for_postgresql_mo12121ck_endpoint&quot;,
         *   &quot;engineType&quot;: &quot;ODPS&quot;,
         *   &quot;odpsEndpoint&quot;: &quot;hybriddb_for_postgresql_m121212ock_endpoint&quot;,
         *   &quot;odpsProjectName&quot;: &quot;sxasaxsaxaxas&quot;,
         *   &quot;projectName&quot;: &quot;sxasaxsaxaxas&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;connectionString\\&quot;:\\&quot;gp-xsxsxsxxs.gpdb.rds.aliyuncs.com\\&quot;,\\&quot;database\\&quot;:\\&quot;xsxsxxsxs\\&quot;,\\&quot;password\\&quot;:\\&quot;xxxxxxx\\&quot;,\\&quot;instanceId\\&quot;:\\&quot;gp-cdcdacdacda\\&quot;,\\&quot;port\\&quot;:\\&quot;3432\\&quot;,\\&quot;ownerId\\&quot;:\\&quot;12121212\\&quot;,\\&quot;username\\&quot;:\\&quot;sdasaddsa\\&quot;}&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * <li><p>ADB_MYSQL</p>
         * <pre><code>{
         *   &quot;endpoint&quot;: &quot;adb_mysql_mock_endpoint&quot;,
         *   &quot;engineType&quot;: &quot;ODPS&quot;,
         *   &quot;odpsEndpoint&quot;: &quot;adb_mysql_mock_endpoint&quot;,
         *   &quot;odpsProjectName&quot;: &quot;am-xsaxaxa&quot;,
         *   &quot;projectName&quot;: &quot;am-xsxsaxa&quot;,
         *   &quot;resourceGroupType&quot;: &quot;DW&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;connectionString\\&quot;:\\&quot;am-xsaxsa.ads.aliyuncs.com:3306\\&quot;,\\&quot;database\\&quot;:\\&quot;xsaxsaxa\\&quot;,\\&quot;password\\&quot;:\\&quot;xsaxsaxassxsa\\&quot;,\\&quot;instanceId\\&quot;:\\&quot;am-xsaxsasx\\&quot;,\\&quot;username\\&quot;:\\&quot;xsaxsadsd\\&quot;}&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * <li><p>HADOOP_CDH</p>
         * <pre><code>{
         *   &quot;bindingBaseId&quot;: &quot;xsaxsaxs&quot;,
         *   &quot;endpoint&quot;: &quot;xsaaaaa&quot;,
         *   &quot;engineType&quot;: &quot;ODPS&quot;,
         *   &quot;odpsEndpoint&quot;: &quot;axsxaxssxs&quot;,
         *   &quot;odpsProjectName&quot;: &quot;ssxxax&quot;,
         *   &quot;projectName&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;resourceGroupId&quot;: 45208xxxxxx,
         *   &quot;resourceGroupType&quot;: &quot;GATEWAY&quot;,
         *   &quot;specs&quot;: &quot;{\\&quot;cluster\\&quot;:{\\&quot;hive\\&quot;:{\\&quot;hiveServer2Url\\&quot;:\\&quot;jdbc:hive2://xxxxxxer-1-cn-shanghai-pre-kerberos-1:10000\\&quot;,\\&quot;hiveMetastore\\&quot;:\\&quot;thrift://xxxxxxxr-1-cn-shanghai-pre-kerberos-1:9083\\&quot;,\\&quot;version\\&quot;:\\&quot;2.1.1\\&quot;},\\&quot;configFiles\\&quot;:{\\&quot;coreSite\\&quot;:\\&quot;4534574xxxxxx\\&quot;,\\&quot;hdfsSite\\&quot;:\\&quot;453457919xxxxxxx\\&quot;,\\&quot;mapredSite\\&quot;:\\&quot;45345750xxxxxx\\&quot;,\\&quot;yarnSite\\&quot;:\\&quot;4534575xxxxx\\&quot;,\\&quot;krb5Conf\\&quot;:\\&quot;4534576xxxxx1\\&quot;,\\&quot;hiveSite\\&quot;:\\&quot;453457xxxxx20\\&quot;},\\&quot;spark\\&quot;:{\\&quot;version\\&quot;:\\&quot;2.4.0\\&quot;},\\&quot;cdh\\&quot;:{\\&quot;version\\&quot;:\\&quot;6.3.2\\&quot;},\\&quot;hdfs\\&quot;:{\\&quot;version\\&quot;:\\&quot;3.0.0\\&quot;},\\&quot;impala\\&quot;:{\\&quot;impalaUrl\\&quot;:\\&quot;jdbc:impala://cdh-xsxssxxsx-1-cn-shanghai-pre-kerberos-1:21050\\&quot;,\\&quot;version\\&quot;:\\&quot;3.2.0\\&quot;},\\&quot;yarn\\&quot;:{\\&quot;YarnUrl\\&quot;:\\&quot;http://cdh-xsxsxsxsxs-1-cn-shanghai-pre-kerberos-1:8032\\&quot;,\\&quot;webUrl\\&quot;:\\&quot;http://cdh-xsxsxssxxssx-1-cn-shanghai-pre-kerberos-1:8088\\&quot;,\\&quot;version\\&quot;:\\&quot;3.0.0\\&quot;},\\&quot;presto\\&quot;:{\\&quot;prestoUrl\\&quot;:\\&quot;jdbc:presto://cdh-xssxsxxsxsxs-1-cn-shanghai-pre-kerberos-1:8080/hive/default\\&quot;,\\&quot;version\\&quot;:\\&quot;0.244.1\\&quot;}},\\&quot;instanceId\\&quot;:161sdads733,\\&quot;authDetail\\&quot;:{\\&quot;principal\\&quot;:\\&quot;hive@HADOOP.COM\\&quot;,\\&quot;keytabFileId\\&quot;:\\&quot;45345815xsxsxs3\\&quot;,\\&quot;type\\&quot;:\\&quot;kerberos\\&quot;,\\&quot;username\\&quot;:\\&quot;xsxsxsxsa@HADOOP.COM\\&quot;},\\&quot;resGroupStatus\\&quot;:\\&quot;\\&quot;,\\&quot;hadoopAuthType\\&quot;:\\&quot;kerberos\\&quot;,\\&quot;clusterIdentifier\\&quot;:\\&quot;xssxsxsxsx\\&quot;,\\&quot;clusterId\\&quot;:xsxsx,\\&quot;resGroupId\\&quot;:4520870619xsxssxxs,\\&quot;accessMode\\&quot;:\\&quot;security\\&quot;,\\&quot;authType\\&quot;:2}&quot;,
         *   &quot;taskSameAsOwner&quot;: false
         * }
         * </code></pre>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pubEndpoint&quot;:&quot;<a href="http://service.cn.maxcompute.aliyun.com/api%22,%22endpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22resourceGroupType%22:%22ODPS%22,%22resourceGroupId%22:%22361826516****%22,%22vpcEndpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22projectName%22:%22onefall_test_zjk%22,%22taskSameAsOwner%22:%22true%22%7D">http://service.cn.maxcompute.aliyun.com/api&quot;,&quot;endpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;resourceGroupType&quot;:&quot;ODPS&quot;,&quot;resourceGroupId&quot;:&quot;361826516****&quot;,&quot;vpcEndpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;projectName&quot;:&quot;onefall_test_zjk&quot;,&quot;taskSameAsOwner&quot;:&quot;true&quot;}</a></p>
         */
        @NameInMap("EngineInfo")
        public java.util.Map<String, ?> engineInfo;

        /**
         * <p>The environment in which the compute engine is used. Valid values:</p>
         * <ul>
         * <li><strong>DEV</strong></li>
         * <li><strong>PRD</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRD</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the compute engine was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Oct 10, 2019 3:42:44 PM</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Indicates whether the compute engine is the default engine of the current type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The display name of the compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region where the compute engine resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The identity that is used to access the compute engine. Valid values:</p>
         * <ul>
         * <li><strong>USER</strong>: the current user</li>
         * <li><strong>PROJECT</strong>: the workspace executor</li>
         * <li><strong>SUBACCOUNT</strong>: a RAM user</li>
         * <li><strong>STS_ROLE</strong>: the Security Token Service (STS) role</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROJECT</p>
         */
        @NameInMap("TaskAuthType")
        public String taskAuthType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
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
         * <p>The compute engines.</p>
         */
        @NameInMap("CalcEngines")
        public java.util.List<ListCalcEnginesResponseBodyDataCalcEngines> calcEngines;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of compute engine instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
