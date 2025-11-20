// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListSandboxesRequest extends TeaModel {
    /**
     * <p>当前页码，从1开始计数</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>dnLkmeaJc9vHgbzREh2l0J4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>按模板名称过滤</p>
     * 
     * <strong>example:</strong>
     * <p>templateName</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>TASK</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static ListSandboxesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxesRequest self = new ListSandboxesRequest();
        return TeaModel.build(map, self);
    }

    public ListSandboxesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListSandboxesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListSandboxesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
