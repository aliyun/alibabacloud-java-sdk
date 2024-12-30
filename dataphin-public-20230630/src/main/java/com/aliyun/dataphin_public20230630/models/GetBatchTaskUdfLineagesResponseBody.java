// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTaskUdfLineagesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBatchTaskUdfLineagesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBatchTaskUdfLineagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTaskUdfLineagesResponseBody self = new GetBatchTaskUdfLineagesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTaskUdfLineagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTaskUdfLineagesResponseBody setData(GetBatchTaskUdfLineagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchTaskUdfLineagesResponseBodyData getData() {
        return this.data;
    }

    public GetBatchTaskUdfLineagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTaskUdfLineagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTaskUdfLineagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTaskUdfLineagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>c011</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>c011</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PartitionKey")
        public Boolean partitionKey;

        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        public static GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList self = new GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setPartitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Boolean getPartitionKey() {
            return this.partitionKey;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>103111231</p>
         */
        @NameInMap("BizUnitId")
        public String bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        @NameInMap("ColumnList")
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList> columnList;

        /**
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("FullTable")
        public Boolean fullTable;

        /**
         * <strong>example:</strong>
         * <p>Guid_101121</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>20112101</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>prj_test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>dim</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList self = new GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setBizUnitId(String bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setColumnList(java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageListColumnList> getColumnList() {
            return this.columnList;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setFullTable(Boolean fullTable) {
            this.fullTable = fullTable;
            return this;
        }
        public Boolean getFullTable() {
            return this.fullTable;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>c011</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>c011</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("PartitionKey")
        public Boolean partitionKey;

        @NameInMap("PrimaryKey")
        public Boolean primaryKey;

        public static GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList self = new GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setPartitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Boolean getPartitionKey() {
            return this.partitionKey;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

    }

    public static class GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>103111231</p>
         */
        @NameInMap("BizUnitId")
        public String bizUnitId;

        /**
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("BizUnitName")
        public String bizUnitName;

        @NameInMap("ColumnList")
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList> columnList;

        /**
         * <strong>example:</strong>
         * <p>test xx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("FullTable")
        public Boolean fullTable;

        /**
         * <strong>example:</strong>
         * <p>Guid_101121</p>
         */
        @NameInMap("Guid")
        public String guid;

        /**
         * <strong>example:</strong>
         * <p>t_input</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>20112101</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>131211211</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>prj_test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>dim</p>
         */
        @NameInMap("SubType")
        public String subType;

        public static GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList self = new GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setBizUnitId(String bizUnitId) {
            this.bizUnitId = bizUnitId;
            return this;
        }
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setBizUnitName(String bizUnitName) {
            this.bizUnitName = bizUnitName;
            return this;
        }
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setColumnList(java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageListColumnList> getColumnList() {
            return this.columnList;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setFullTable(Boolean fullTable) {
            this.fullTable = fullTable;
            return this;
        }
        public Boolean getFullTable() {
            return this.fullTable;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setGuid(String guid) {
            this.guid = guid;
            return this;
        }
        public String getGuid() {
            return this.guid;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

    }

    public static class GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList extends TeaModel {
        @NameInMap("InputLineageList")
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList> inputLineageList;

        @NameInMap("OutputLineageList")
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList> outputLineageList;

        public static GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList self = new GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList setInputLineageList(java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList> inputLineageList) {
            this.inputLineageList = inputLineageList;
            return this;
        }
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListInputLineageList> getInputLineageList() {
            return this.inputLineageList;
        }

        public GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList setOutputLineageList(java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList> outputLineageList) {
            this.outputLineageList = outputLineageList;
            return this;
        }
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupListOutputLineageList> getOutputLineageList() {
            return this.outputLineageList;
        }

    }

    public static class GetBatchTaskUdfLineagesResponseBodyData extends TeaModel {
        @NameInMap("LineageGroupList")
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList> lineageGroupList;

        public static GetBatchTaskUdfLineagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTaskUdfLineagesResponseBodyData self = new GetBatchTaskUdfLineagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchTaskUdfLineagesResponseBodyData setLineageGroupList(java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList> lineageGroupList) {
            this.lineageGroupList = lineageGroupList;
            return this;
        }
        public java.util.List<GetBatchTaskUdfLineagesResponseBodyDataLineageGroupList> getLineageGroupList() {
            return this.lineageGroupList;
        }

    }

}
