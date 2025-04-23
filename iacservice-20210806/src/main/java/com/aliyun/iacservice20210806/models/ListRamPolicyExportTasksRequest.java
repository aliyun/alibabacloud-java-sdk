// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListRamPolicyExportTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>mod-43143bd9145a5258</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    @NameInMap("moduleVersion")
    public String moduleVersion;

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

    public static ListRamPolicyExportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRamPolicyExportTasksRequest self = new ListRamPolicyExportTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListRamPolicyExportTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListRamPolicyExportTasksRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListRamPolicyExportTasksRequest setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public ListRamPolicyExportTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRamPolicyExportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
