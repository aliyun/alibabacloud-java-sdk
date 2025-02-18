// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourceSharedRulesResponseBody extends TeaModel {
    /**
     * <p>The sharing rules of the data source.</p>
     */
    @NameInMap("DataSourceSharedRules")
    public java.util.List<ListDataSourceSharedRulesResponseBodyDataSourceSharedRules> dataSourceSharedRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataSourceSharedRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSharedRulesResponseBody self = new ListDataSourceSharedRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSharedRulesResponseBody setDataSourceSharedRules(java.util.List<ListDataSourceSharedRulesResponseBodyDataSourceSharedRules> dataSourceSharedRules) {
        this.dataSourceSharedRules = dataSourceSharedRules;
        return this;
    }
    public java.util.List<ListDataSourceSharedRulesResponseBodyDataSourceSharedRules> getDataSourceSharedRules() {
        return this.dataSourceSharedRules;
    }

    public ListDataSourceSharedRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataSourceSharedRulesResponseBodyDataSourceSharedRules extends TeaModel {
        /**
         * <p>The time when the rule was created. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1724379762000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who creates the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The data source ID. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>The environment to which the target data source belongs. The values are as follows:</p>
         * <ul>
         * <li>Dev: the development environment.</li>
         * <li>Prod: the production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data source in the destination workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>targetProject.datasource</p>
         */
        @NameInMap("SharedDataSourceName")
        public String sharedDataSourceName;

        /**
         * <p>The user in the workspace to which the data source is shared. If the data source is shared to the entire workspace, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SharedUser")
        public String sharedUser;

        /**
         * <p>The ID of the workspace with which the data source is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceProjectId")
        public Long sourceProjectId;

        /**
         * <p>The ID of the workspace to which the data source is shared.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TargetProjectId")
        public Long targetProjectId;

        public static ListDataSourceSharedRulesResponseBodyDataSourceSharedRules build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceSharedRulesResponseBodyDataSourceSharedRules self = new ListDataSourceSharedRulesResponseBodyDataSourceSharedRules();
            return TeaModel.build(map, self);
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setSharedDataSourceName(String sharedDataSourceName) {
            this.sharedDataSourceName = sharedDataSourceName;
            return this;
        }
        public String getSharedDataSourceName() {
            return this.sharedDataSourceName;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setSharedUser(String sharedUser) {
            this.sharedUser = sharedUser;
            return this;
        }
        public String getSharedUser() {
            return this.sharedUser;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setSourceProjectId(Long sourceProjectId) {
            this.sourceProjectId = sourceProjectId;
            return this;
        }
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        public ListDataSourceSharedRulesResponseBodyDataSourceSharedRules setTargetProjectId(Long targetProjectId) {
            this.targetProjectId = targetProjectId;
            return this;
        }
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

    }

}
