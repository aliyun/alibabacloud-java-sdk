// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDevObjectDependencyResponseBody extends TeaModel {
    /**
     * <p>Error code. OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Dependency list.</p>
     */
    @NameInMap("DevObjectDependencyList")
    public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyList> devObjectDependencyList;

    /**
     * <p>HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDevObjectDependencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDevObjectDependencyResponseBody self = new GetDevObjectDependencyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDevObjectDependencyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDevObjectDependencyResponseBody setDevObjectDependencyList(java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyList> devObjectDependencyList) {
        this.devObjectDependencyList = devObjectDependencyList;
        return this;
    }
    public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyList> getDevObjectDependencyList() {
        return this.devObjectDependencyList;
    }

    public GetDevObjectDependencyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDevObjectDependencyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDevObjectDependencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDevObjectDependencyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod extends TeaModel {
        /**
         * <p>Period offset. This parameter is required when the dependency period type is LAST_N_PERIOD.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodOffset")
        public Integer periodOffset;

        /**
         * <p>Dependency period type.</p>
         * <ul>
         * <li>CURRENT_PERIOD</li>
         * <li>LAST_PERIOD</li>
         * <li>LAST_N_PERIOD</li>
         * <li>LAST_24_HOUR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CURRENT_PERIOD</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        public static GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod self = new GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod();
            return TeaModel.build(map, self);
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod setPeriodOffset(Integer periodOffset) {
            this.periodOffset = periodOffset;
            return this;
        }
        public Integer getPeriodOffset() {
            return this.periodOffset;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

    }

    public static class GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList extends TeaModel {
        /**
         * <p>Default value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxtest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Parameter key.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Key")
        public String key;

        public static GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList build(java.util.Map<String, ?> map) throws Exception {
            GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList self = new GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList();
            return TeaModel.build(map, self);
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList extends TeaModel {
        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Node name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList build(java.util.Map<String, ?> map) throws Exception {
            GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList self = new GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList();
            return TeaModel.build(map, self);
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDevObjectDependencyResponseBodyDevObjectDependencyList extends TeaModel {
        /**
         * <p>Indicates whether the task is automatically parsed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoParse")
        public Boolean autoParse;

        /**
         * <p>Business type.</p>
         * <ul>
         * <li>SCRIPT: Script</li>
         * <li>LOGICAL_TABLE: Logical table</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCRIPT</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>Business unit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13111</p>
         */
        @NameInMap("BizUnitId")
        public String bizUnitId;

        /**
         * <p>Business unit name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        /**
         * <p>Cron expression for the scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Indicates whether a custom cron expression is used for the scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomCronExpression")
        public Boolean customCronExpression;

        /**
         * <p>Dependency fields.</p>
         */
        @NameInMap("DependFieldList")
        public java.util.List<String> dependFieldList;

        /**
         * <p>Dependency period configuration.</p>
         */
        @NameInMap("DependencyPeriod")
        public GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod dependencyPeriod;

        /**
         * <p>Dependency strategy.</p>
         * <ul>
         * <li>ALL</li>
         * <li>FIRST</li>
         * <li>LAST</li>
         * <li>NEAR</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DependencyStrategy")
        public String dependencyStrategy;

        /**
         * <p>Indicates whether the node is a dimension table intermediate node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DimMidNode")
        public Boolean dimMidNode;

        /**
         * <p>Effect fields.</p>
         */
        @NameInMap("EffectFieldList")
        public java.util.List<String> effectFieldList;

        /**
         * <p>Additional business information.</p>
         * 
         * <strong>example:</strong>
         * <p>所有字段信息/hasProd/hasDev等信息</p>
         */
        @NameInMap("ExternalBizInfo")
        public String externalBizInfo;

        /**
         * <p>Indicates whether the dependency is manually added.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ManuallyAdd")
        public Boolean manuallyAdd;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_13211</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Node name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>Node output name.</p>
         * 
         * <strong>example:</strong>
         * <p>n_xx</p>
         */
        @NameInMap("NodeOutputName")
        public String nodeOutputName;

        /**
         * <p>Output table information.</p>
         * 
         * <strong>example:</strong>
         * <p>t_xx</p>
         */
        @NameInMap("NodeOutputTableName")
        public String nodeOutputTableName;

        /**
         * <p>Node type.</p>
         * <ul>
         * <li>DATA_PROCESS: Code task</li>
         * <li>BBOX_LOGIC_TABLE_NODE: Black box logical table node</li>
         * <li>ONE_ID_LABEL: ID label node</li>
         * <li>ONE_ID_RULE: ID rule node</li>
         * <li>PIPELINE_NODE: Pipeline node</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>Cross-node output parameters.</p>
         */
        @NameInMap("OutputContextParamList")
        public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList> outputContextParamList;

        /**
         * <p>Node owners.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList> ownerList;

        /**
         * <p>Dependency period difference.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodDiff")
        public Integer periodDiff;

        /**
         * <p>Project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123131</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Project name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Schedule type.</p>
         * <ul>
         * <li>MINUTELY: Minute</li>
         * <li>HOURLY: Hour</li>
         * <li>DAILY: Day</li>
         * <li>WEEKLY: Week</li>
         * <li>MONTHLY: Month</li>
         * <li>YEARLY: Year</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Indicates whether the node has a self-dependency.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SelfDepend")
        public Boolean selfDepend;

        /**
         * <p>Sub-business type.</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL, etc.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("SubBizType")
        public String subBizType;

        /**
         * <p>Indicates whether the configuration is valid.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Valid")
        public Boolean valid;

        public static GetDevObjectDependencyResponseBodyDevObjectDependencyList build(java.util.Map<String, ?> map) throws Exception {
            GetDevObjectDependencyResponseBodyDevObjectDependencyList self = new GetDevObjectDependencyResponseBodyDevObjectDependencyList();
            return TeaModel.build(map, self);
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setAutoParse(Boolean autoParse) {
            this.autoParse = autoParse;
            return this;
        }
        public Boolean getAutoParse() {
            return this.autoParse;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setBizUnitId(String bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setCustomCronExpression(Boolean customCronExpression) {
            this.customCronExpression = customCronExpression;
            return this;
        }
        public Boolean getCustomCronExpression() {
            return this.customCronExpression;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setDependFieldList(java.util.List<String> dependFieldList) {
            this.dependFieldList = dependFieldList;
            return this;
        }
        public java.util.List<String> getDependFieldList() {
            return this.dependFieldList;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setDependencyPeriod(GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod dependencyPeriod) {
            this.dependencyPeriod = dependencyPeriod;
            return this;
        }
        public GetDevObjectDependencyResponseBodyDevObjectDependencyListDependencyPeriod getDependencyPeriod() {
            return this.dependencyPeriod;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setDependencyStrategy(String dependencyStrategy) {
            this.dependencyStrategy = dependencyStrategy;
            return this;
        }
        public String getDependencyStrategy() {
            return this.dependencyStrategy;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setDimMidNode(Boolean dimMidNode) {
            this.dimMidNode = dimMidNode;
            return this;
        }
        public Boolean getDimMidNode() {
            return this.dimMidNode;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setEffectFieldList(java.util.List<String> effectFieldList) {
            this.effectFieldList = effectFieldList;
            return this;
        }
        public java.util.List<String> getEffectFieldList() {
            return this.effectFieldList;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setExternalBizInfo(String externalBizInfo) {
            this.externalBizInfo = externalBizInfo;
            return this;
        }
        public String getExternalBizInfo() {
            return this.externalBizInfo;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setManuallyAdd(Boolean manuallyAdd) {
            this.manuallyAdd = manuallyAdd;
            return this;
        }
        public Boolean getManuallyAdd() {
            return this.manuallyAdd;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setNodeOutputName(String nodeOutputName) {
            this.nodeOutputName = nodeOutputName;
            return this;
        }
        public String getNodeOutputName() {
            return this.nodeOutputName;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setNodeOutputTableName(String nodeOutputTableName) {
            this.nodeOutputTableName = nodeOutputTableName;
            return this;
        }
        public String getNodeOutputTableName() {
            return this.nodeOutputTableName;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setOutputContextParamList(java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList> outputContextParamList) {
            this.outputContextParamList = outputContextParamList;
            return this;
        }
        public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOutputContextParamList> getOutputContextParamList() {
            return this.outputContextParamList;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setOwnerList(java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<GetDevObjectDependencyResponseBodyDevObjectDependencyListOwnerList> getOwnerList() {
            return this.ownerList;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setPeriodDiff(Integer periodDiff) {
            this.periodDiff = periodDiff;
            return this;
        }
        public Integer getPeriodDiff() {
            return this.periodDiff;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setSelfDepend(Boolean selfDepend) {
            this.selfDepend = selfDepend;
            return this;
        }
        public Boolean getSelfDepend() {
            return this.selfDepend;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setSubBizType(String subBizType) {
            this.subBizType = subBizType;
            return this;
        }
        public String getSubBizType() {
            return this.subBizType;
        }

        public GetDevObjectDependencyResponseBodyDevObjectDependencyList setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
