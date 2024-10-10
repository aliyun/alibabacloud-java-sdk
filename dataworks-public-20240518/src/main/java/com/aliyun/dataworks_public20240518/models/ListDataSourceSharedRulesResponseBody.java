// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourceSharedRulesResponseBody extends TeaModel {
    @NameInMap("DataSourceSharedRules")
    public java.util.List<ListDataSourceSharedRulesResponseBodyDataSourceSharedRules> dataSourceSharedRules;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>1724379762000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>targetProject.datasource</p>
         */
        @NameInMap("SharedDataSourceName")
        public String sharedDataSourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SharedUser")
        public String sharedUser;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SourceProjectId")
        public Long sourceProjectId;

        /**
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
