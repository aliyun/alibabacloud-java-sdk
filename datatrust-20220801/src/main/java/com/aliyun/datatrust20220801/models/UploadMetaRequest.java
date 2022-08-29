// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class UploadMetaRequest extends TeaModel {
    @NameInMap("LsccTableDesc")
    public String lsccTableDesc;

    @NameInMap("LsccTableId")
    public Long lsccTableId;

    @NameInMap("LsccTableName")
    public String lsccTableName;

    @NameInMap("SourceTargetList")
    public java.util.List<UploadMetaRequestSourceTargetList> sourceTargetList;

    public static UploadMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMetaRequest self = new UploadMetaRequest();
        return TeaModel.build(map, self);
    }

    public UploadMetaRequest setLsccTableDesc(String lsccTableDesc) {
        this.lsccTableDesc = lsccTableDesc;
        return this;
    }
    public String getLsccTableDesc() {
        return this.lsccTableDesc;
    }

    public UploadMetaRequest setLsccTableId(Long lsccTableId) {
        this.lsccTableId = lsccTableId;
        return this;
    }
    public Long getLsccTableId() {
        return this.lsccTableId;
    }

    public UploadMetaRequest setLsccTableName(String lsccTableName) {
        this.lsccTableName = lsccTableName;
        return this;
    }
    public String getLsccTableName() {
        return this.lsccTableName;
    }

    public UploadMetaRequest setSourceTargetList(java.util.List<UploadMetaRequestSourceTargetList> sourceTargetList) {
        this.sourceTargetList = sourceTargetList;
        return this;
    }
    public java.util.List<UploadMetaRequestSourceTargetList> getSourceTargetList() {
        return this.sourceTargetList;
    }

    public static class UploadMetaRequestSourceTargetList extends TeaModel {
        @NameInMap("ColumnDataType")
        public String columnDataType;

        @NameInMap("ColumnDesc")
        public String columnDesc;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnSn")
        public Integer columnSn;

        @NameInMap("IsPrimaryKey")
        public Integer isPrimaryKey;

        @NameInMap("IsPt")
        public Integer isPt;

        public static UploadMetaRequestSourceTargetList build(java.util.Map<String, ?> map) throws Exception {
            UploadMetaRequestSourceTargetList self = new UploadMetaRequestSourceTargetList();
            return TeaModel.build(map, self);
        }

        public UploadMetaRequestSourceTargetList setColumnDataType(String columnDataType) {
            this.columnDataType = columnDataType;
            return this;
        }
        public String getColumnDataType() {
            return this.columnDataType;
        }

        public UploadMetaRequestSourceTargetList setColumnDesc(String columnDesc) {
            this.columnDesc = columnDesc;
            return this;
        }
        public String getColumnDesc() {
            return this.columnDesc;
        }

        public UploadMetaRequestSourceTargetList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public UploadMetaRequestSourceTargetList setColumnSn(Integer columnSn) {
            this.columnSn = columnSn;
            return this;
        }
        public Integer getColumnSn() {
            return this.columnSn;
        }

        public UploadMetaRequestSourceTargetList setIsPrimaryKey(Integer isPrimaryKey) {
            this.isPrimaryKey = isPrimaryKey;
            return this;
        }
        public Integer getIsPrimaryKey() {
            return this.isPrimaryKey;
        }

        public UploadMetaRequestSourceTargetList setIsPt(Integer isPt) {
            this.isPt = isPt;
            return this;
        }
        public Integer getIsPt() {
            return this.isPt;
        }

    }

}
