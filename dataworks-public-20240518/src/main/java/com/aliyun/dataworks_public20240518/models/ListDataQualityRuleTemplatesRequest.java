// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityRuleTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("CreationSource")
    public String creationSource;

    @NameInMap("DirectoryPath")
    public String directoryPath;

    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListDataQualityRuleTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityRuleTemplatesRequest self = new ListDataQualityRuleTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityRuleTemplatesRequest setCreationSource(String creationSource) {
        this.creationSource = creationSource;
        return this;
    }
    public String getCreationSource() {
        return this.creationSource;
    }

    public ListDataQualityRuleTemplatesRequest setDirectoryPath(String directoryPath) {
        this.directoryPath = directoryPath;
        return this;
    }
    public String getDirectoryPath() {
        return this.directoryPath;
    }

    public ListDataQualityRuleTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataQualityRuleTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityRuleTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityRuleTemplatesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
