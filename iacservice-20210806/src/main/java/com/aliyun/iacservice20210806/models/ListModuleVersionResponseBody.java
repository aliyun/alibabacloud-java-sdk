// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModuleVersionResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>792171BB-1A68-5148-8B9B-C7C728E1E98B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    @NameInMap("versions")
    public java.util.List<ListModuleVersionResponseBodyVersions> versions;

    public static ListModuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModuleVersionResponseBody self = new ListModuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModuleVersionResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModuleVersionResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModuleVersionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListModuleVersionResponseBody setVersions(java.util.List<ListModuleVersionResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListModuleVersionResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListModuleVersionResponseBodyVersions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-05-13T02:21:49Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>mod-55f1739d9050fffed3ec3a2c4a5e5</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        public static ListModuleVersionResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListModuleVersionResponseBodyVersions self = new ListModuleVersionResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListModuleVersionResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModuleVersionResponseBodyVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModuleVersionResponseBodyVersions setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModuleVersionResponseBodyVersions setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListModuleVersionResponseBodyVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModuleVersionResponseBodyVersions setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

    }

}
