// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetProjectRequest extends TeaModel {
    /**
     * <p>The project name. For information about how to obtain the project name, see <a href="https://help.aliyun.com/document_detail/478153.html">创建项目</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Specifies whether to collect file statistics. Default value: false, which indicates that file statistics are not collected.</p>
     * <ul>
     * <li><p>File statistics are collected. The FileCount and TotalFileSize values in the returned Project struct are valid.</p>
     * </li>
     * <li><p>File statistics are not collected. The FileCount and TotalFileSize values in the returned Project struct may be inaccurate or both may be 0.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: Only files in datasets created before December 20, 2025 can be counted..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithStatistics")
    public Boolean withStatistics;

    public static GetProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectRequest self = new GetProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectRequest setWithStatistics(Boolean withStatistics) {
        this.withStatistics = withStatistics;
        return this;
    }
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

}
