// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaProfilingResultUdfPageResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListMetaProfilingResultUdfPageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>The parameter is invalid or missing.</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListMetaProfilingResultUdfPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetaProfilingResultUdfPageResponseBody self = new ListMetaProfilingResultUdfPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetaProfilingResultUdfPageResponseBody setData(java.util.List<ListMetaProfilingResultUdfPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMetaProfilingResultUdfPageResponseBodyData> getData() {
        return this.data;
    }

    public ListMetaProfilingResultUdfPageResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListMetaProfilingResultUdfPageResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListMetaProfilingResultUdfPageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListMetaProfilingResultUdfPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaProfilingResultUdfPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMetaProfilingResultUdfPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMetaProfilingResultUdfPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>catalog_hive_prod</p>
         */
        @NameInMap("catalogName")
        public String catalogName;

        /**
         * <strong>example:</strong>
         * <p>com.example.udf.ParseJson</p>
         */
        @NameInMap("className")
        public String className;

        /**
         * <strong>example:</strong>
         * <p>ods</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("dsType")
        public String dsType;

        /**
         * <strong>example:</strong>
         * <p>解析 JSON 字符串的 UDF</p>
         */
        @NameInMap("funcComment")
        public String funcComment;

        /**
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("funcCrtTime")
        public String funcCrtTime;

        /**
         * <strong>example:</strong>
         * <p>6001</p>
         */
        @NameInMap("funcId")
        public String funcId;

        /**
         * <strong>example:</strong>
         * <p>2024-07-20 17:52:57</p>
         */
        @NameInMap("funcModTime")
        public String funcModTime;

        /**
         * <strong>example:</strong>
         * <p>udf_parse_json</p>
         */
        @NameInMap("funcName")
        public String funcName;

        /**
         * <strong>example:</strong>
         * <p>UDF</p>
         */
        @NameInMap("funcType")
        public String funcType;

        /**
         * <strong>example:</strong>
         * <p>7001</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("migrationStatus")
        public String migrationStatus;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>oss://lhm-bucket/udf/parse-json.jar</p>
         */
        @NameInMap("resourceLocation")
        public String resourceLocation;

        /**
         * <strong>example:</strong>
         * <p>JAR</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>1009318965420000</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListMetaProfilingResultUdfPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMetaProfilingResultUdfPageResponseBodyData self = new ListMetaProfilingResultUdfPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncComment(String funcComment) {
            this.funcComment = funcComment;
            return this;
        }
        public String getFuncComment() {
            return this.funcComment;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncCrtTime(String funcCrtTime) {
            this.funcCrtTime = funcCrtTime;
            return this;
        }
        public String getFuncCrtTime() {
            return this.funcCrtTime;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncId(String funcId) {
            this.funcId = funcId;
            return this;
        }
        public String getFuncId() {
            return this.funcId;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncModTime(String funcModTime) {
            this.funcModTime = funcModTime;
            return this;
        }
        public String getFuncModTime() {
            return this.funcModTime;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncName(String funcName) {
            this.funcName = funcName;
            return this;
        }
        public String getFuncName() {
            return this.funcName;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setFuncType(String funcType) {
            this.funcType = funcType;
            return this;
        }
        public String getFuncType() {
            return this.funcType;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setResourceLocation(String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }
        public String getResourceLocation() {
            return this.resourceLocation;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListMetaProfilingResultUdfPageResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
