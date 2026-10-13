// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetMetaProfilingResultDbOverviewResponseBody extends TeaModel {
    /**
     * <p>The data source-level metadata profiling overview object. For more information about each field, see the descriptions of the sub-fields.</p>
     */
    @NameInMap("data")
    public GetMetaProfilingResultDbOverviewResponseBodyData data;

    /**
     * <p>The error code. It is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. It is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues related to this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. If the call fails, troubleshoot the issue based on the errCode and errMessage parameters.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMetaProfilingResultDbOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaProfilingResultDbOverviewResponseBody self = new GetMetaProfilingResultDbOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaProfilingResultDbOverviewResponseBody setData(GetMetaProfilingResultDbOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaProfilingResultDbOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetMetaProfilingResultDbOverviewResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetMetaProfilingResultDbOverviewResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetMetaProfilingResultDbOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaProfilingResultDbOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaProfilingResultDbOverviewResponseBodyData extends TeaModel {
        /**
         * <p>The number of catalogs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("catalogCount")
        public Integer catalogCount;

        /**
         * <p>The component ID, which is the primary key identifier of the data source component.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("componentId")
        public Long componentId;

        /**
         * <p>The identifier of the data source component type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("componentType")
        public Integer componentType;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        @NameInMap("dsName")
        public String dsName;

        /**
         * <p>The version of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.0</p>
         */
        @NameInMap("dsVersion")
        public String dsVersion;

        /**
         * <p>The number of external tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("etTableCount")
        public Integer etTableCount;

        /**
         * <p>The number of functions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("funcCount")
        public Integer funcCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16T10:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-19 22:00:02</p>
         */
        @NameInMap("lastModified")
        public String lastModified;

        /**
         * <p>The number of non-partitioned tables.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("noPtTableCount")
        public Integer noPtTableCount;

        /**
         * <p>The number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("partitionCount")
        public Integer partitionCount;

        /**
         * <p>The number of partitioned tables.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ptTableCount")
        public Integer ptTableCount;

        /**
         * <p>The number of data rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("recordCount")
        public Long recordCount;

        /**
         * <p>The number of schemas.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("schemaCount")
        public Integer schemaCount;

        /**
         * <p>The data storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("storageSize")
        public String storageSize;

        /**
         * <p>The number of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("tableCount")
        public Integer tableCount;

        /**
         * <p>The number of transactional tables.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("transactionalCount")
        public Integer transactionalCount;

        /**
         * <p>The number of views.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("viewCount")
        public Integer viewCount;

        public static GetMetaProfilingResultDbOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaProfilingResultDbOverviewResponseBodyData self = new GetMetaProfilingResultDbOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setCatalogCount(Integer catalogCount) {
            this.catalogCount = catalogCount;
            return this;
        }
        public Integer getCatalogCount() {
            return this.catalogCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setComponentId(Long componentId) {
            this.componentId = componentId;
            return this;
        }
        public Long getComponentId() {
            return this.componentId;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setComponentType(Integer componentType) {
            this.componentType = componentType;
            return this;
        }
        public Integer getComponentType() {
            return this.componentType;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setDsName(String dsName) {
            this.dsName = dsName;
            return this;
        }
        public String getDsName() {
            return this.dsName;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setDsVersion(String dsVersion) {
            this.dsVersion = dsVersion;
            return this;
        }
        public String getDsVersion() {
            return this.dsVersion;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setEtTableCount(Integer etTableCount) {
            this.etTableCount = etTableCount;
            return this;
        }
        public Integer getEtTableCount() {
            return this.etTableCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setFuncCount(Integer funcCount) {
            this.funcCount = funcCount;
            return this;
        }
        public Integer getFuncCount() {
            return this.funcCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setNoPtTableCount(Integer noPtTableCount) {
            this.noPtTableCount = noPtTableCount;
            return this;
        }
        public Integer getNoPtTableCount() {
            return this.noPtTableCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setPartitionCount(Integer partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setPtTableCount(Integer ptTableCount) {
            this.ptTableCount = ptTableCount;
            return this;
        }
        public Integer getPtTableCount() {
            return this.ptTableCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setSchemaCount(Integer schemaCount) {
            this.schemaCount = schemaCount;
            return this;
        }
        public Integer getSchemaCount() {
            return this.schemaCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setTableCount(Integer tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Integer getTableCount() {
            return this.tableCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setTransactionalCount(Integer transactionalCount) {
            this.transactionalCount = transactionalCount;
            return this;
        }
        public Integer getTransactionalCount() {
            return this.transactionalCount;
        }

        public GetMetaProfilingResultDbOverviewResponseBodyData setViewCount(Integer viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Integer getViewCount() {
            return this.viewCount;
        }

    }

}
