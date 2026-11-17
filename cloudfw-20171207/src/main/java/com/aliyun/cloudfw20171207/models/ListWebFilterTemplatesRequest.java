// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ListWebFilterTemplatesRequest extends TeaModel {
    /**
     * <p>The description of the web filtering template. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>URL access control</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the web filtering template. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Web filtering template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The status of the web filtering template. Exact match is supported. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong>: Enabled.</li>
     * <li><strong>Disable</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enable</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of the web filtering templates for batch exact matching. You can specify up to 100 template IDs.</p>
     */
    @NameInMap("WebFilterTemplateIds")
    public java.util.List<String> webFilterTemplateIds;

    public static ListWebFilterTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWebFilterTemplatesRequest self = new ListWebFilterTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListWebFilterTemplatesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListWebFilterTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWebFilterTemplatesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListWebFilterTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListWebFilterTemplatesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListWebFilterTemplatesRequest setWebFilterTemplateIds(java.util.List<String> webFilterTemplateIds) {
        this.webFilterTemplateIds = webFilterTemplateIds;
        return this;
    }
    public java.util.List<String> getWebFilterTemplateIds() {
        return this.webFilterTemplateIds;
    }

}
