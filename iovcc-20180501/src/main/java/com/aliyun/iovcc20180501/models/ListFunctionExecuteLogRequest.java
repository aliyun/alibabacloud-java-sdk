// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionExecuteLogRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("FileId")
    public Long fileId;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Env")
    public Integer env;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListFunctionExecuteLogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionExecuteLogRequest self = new ListFunctionExecuteLogRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionExecuteLogRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFunctionExecuteLogRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public ListFunctionExecuteLogRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ListFunctionExecuteLogRequest setEnv(Integer env) {
        this.env = env;
        return this;
    }
    public Integer getEnv() {
        return this.env;
    }

    public ListFunctionExecuteLogRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListFunctionExecuteLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
