// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTaskVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("ramPolicyExportTaskVersions")
    public java.util.List<ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions> ramPolicyExportTaskVersions;

    /**
     * <strong>example:</strong>
     * <p>E2D0E863-1651-5E58-823F-B451C8C24615</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListRamPolicyExportTaskVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTaskVersionsResponseBody self = new ListRamPolicyExportTaskVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTaskVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRamPolicyExportTaskVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRamPolicyExportTaskVersionsResponseBody setRamPolicyExportTaskVersions(java.util.List<ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions> ramPolicyExportTaskVersions) {
        this.ramPolicyExportTaskVersions = ramPolicyExportTaskVersions;
        return this;
    }
    public java.util.List<ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions> getRamPolicyExportTaskVersions() {
        return this.ramPolicyExportTaskVersions;
    }

    public ListRamPolicyExportTaskVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRamPolicyExportTaskVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-04T02:11:29Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("exportVersion")
        public String exportVersion;

        /**
         * <strong>example:</strong>
         * <p>mod-51da8a8a36c166</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>rpe-437ffe0252e48f9286a</p>
         */
        @NameInMap("ramPolicyExportTaskId")
        public String ramPolicyExportTaskId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        public static ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions build(java.util.Map<String, ?> map) throws Exception {
            ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions self = new ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions();
            return TeaModel.build(map, self);
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setExportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }
        public String getExportVersion() {
            return this.exportVersion;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setRamPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        public ListRamPolicyExportTaskVersionsResponseBodyRamPolicyExportTaskVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
