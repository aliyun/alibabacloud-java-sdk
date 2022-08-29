// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetPrivateDataDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetPrivateDataDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPrivateDataDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateDataDetailResponseBody self = new GetPrivateDataDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrivateDataDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPrivateDataDetailResponseBody setData(GetPrivateDataDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrivateDataDetailResponseBodyData getData() {
        return this.data;
    }

    public GetPrivateDataDetailResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPrivateDataDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrivateDataDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrivateDataDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPrivateDataDetailResponseBodyDataColumnDtos extends TeaModel {
        @NameInMap("Col")
        public String col;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsPrimaryKey")
        public Integer isPrimaryKey;

        @NameInMap("IsPt")
        public Integer isPt;

        @NameInMap("Selected")
        public Integer selected;

        @NameInMap("Sn")
        public Integer sn;

        @NameInMap("SqlType")
        public Integer sqlType;

        public static GetPrivateDataDetailResponseBodyDataColumnDtos build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateDataDetailResponseBodyDataColumnDtos self = new GetPrivateDataDetailResponseBodyDataColumnDtos();
            return TeaModel.build(map, self);
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setCol(String col) {
            this.col = col;
            return this;
        }
        public String getCol() {
            return this.col;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setIsPrimaryKey(Integer isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Integer getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setIsPt(Integer isPt) {
            this.isPt = isPt;
            return this;
        }
        public Integer getIsPt() {
            return this.isPt;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setSelected(Integer selected) {
            this.selected = selected;
            return this;
        }
        public Integer getSelected() {
            return this.selected;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setSn(Integer sn) {
            this.sn = sn;
            return this;
        }
        public Integer getSn() {
            return this.sn;
        }

        public GetPrivateDataDetailResponseBodyDataColumnDtos setSqlType(Integer sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public Integer getSqlType() {
            return this.sqlType;
        }

    }

    public static class GetPrivateDataDetailResponseBodyDataTableDto extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CsccTableId")
        public Long csccTableId;

        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceTypeId")
        public Integer dataSourceTypeId;

        @NameInMap("DataSourceTypeName")
        public String dataSourceTypeName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastSyncTime")
        public String lastSyncTime;

        @NameInMap("LsccTableId")
        public Long lsccTableId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("Prj")
        public String prj;

        @NameInMap("ScheduleType")
        public Integer scheduleType;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("SrcType")
        public Integer srcType;

        @NameInMap("Tab")
        public String tab;

        public static GetPrivateDataDetailResponseBodyDataTableDto build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateDataDetailResponseBodyDataTableDto self = new GetPrivateDataDetailResponseBodyDataTableDto();
            return TeaModel.build(map, self);
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setCsccTableId(Long csccTableId) {
            this.csccTableId = csccTableId;
            return this;
        }
        public Long getCsccTableId() {
            return this.csccTableId;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setDataSourceTypeId(Integer dataSourceTypeId) {
            this.dataSourceTypeId = dataSourceTypeId;
            return this;
        }
        public Integer getDataSourceTypeId() {
            return this.dataSourceTypeId;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setDataSourceTypeName(String dataSourceTypeName) {
            this.dataSourceTypeName = dataSourceTypeName;
            return this;
        }
        public String getDataSourceTypeName() {
            return this.dataSourceTypeName;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }
        public String getLastSyncTime() {
            return this.lastSyncTime;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setLsccTableId(Long lsccTableId) {
            this.lsccTableId = lsccTableId;
            return this;
        }
        public Long getLsccTableId() {
            return this.lsccTableId;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setPrj(String prj) {
            this.prj = prj;
            return this;
        }
        public String getPrj() {
            return this.prj;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public GetPrivateDataDetailResponseBodyDataTableDto setTab(String tab) {
            this.tab = tab;
            return this;
        }
        public String getTab() {
            return this.tab;
        }

    }

    public static class GetPrivateDataDetailResponseBodyData extends TeaModel {
        @NameInMap("ColumnDtos")
        public java.util.List<GetPrivateDataDetailResponseBodyDataColumnDtos> columnDtos;

        @NameInMap("IsSync")
        public Boolean isSync;

        @NameInMap("LastSyncUserId")
        public Long lastSyncUserId;

        @NameInMap("LastSyncUserName")
        public String lastSyncUserName;

        @NameInMap("TableDto")
        public GetPrivateDataDetailResponseBodyDataTableDto tableDto;

        public static GetPrivateDataDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateDataDetailResponseBodyData self = new GetPrivateDataDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrivateDataDetailResponseBodyData setColumnDtos(java.util.List<GetPrivateDataDetailResponseBodyDataColumnDtos> columnDtos) {
            this.columnDtos = columnDtos;
            return this;
        }
        public java.util.List<GetPrivateDataDetailResponseBodyDataColumnDtos> getColumnDtos() {
            return this.columnDtos;
        }

        public GetPrivateDataDetailResponseBodyData setIsSync(Boolean isSync) {
            this.isSync = isSync;
            return this;
        }
        public Boolean getIsSync() {
            return this.isSync;
        }

        public GetPrivateDataDetailResponseBodyData setLastSyncUserId(Long lastSyncUserId) {
            this.lastSyncUserId = lastSyncUserId;
            return this;
        }
        public Long getLastSyncUserId() {
            return this.lastSyncUserId;
        }

        public GetPrivateDataDetailResponseBodyData setLastSyncUserName(String lastSyncUserName) {
            this.lastSyncUserName = lastSyncUserName;
            return this;
        }
        public String getLastSyncUserName() {
            return this.lastSyncUserName;
        }

        public GetPrivateDataDetailResponseBodyData setTableDto(GetPrivateDataDetailResponseBodyDataTableDto tableDto) {
            this.tableDto = tableDto;
            return this;
        }
        public GetPrivateDataDetailResponseBodyDataTableDto getTableDto() {
            return this.tableDto;
        }

    }

}
