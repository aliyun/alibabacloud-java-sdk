// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserByNameRequest extends TeaModel {
    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Make sure that this parameter is consistent with the <strong>IsolationId</strong> set when you call the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add a user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The username. The name can contain Chinese characters, uppercase and lowercase letters, digits, underscores (_), and hyphens (-), and can be up to 64 characters in length.</p>
     * <p>Fuzzy match is supported. If this parameter is not specified, all records are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>Tony</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the page to return. Minimum value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50. Minimum value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The custom user parameters.</p>
     * <p>Exact match is supported, but fuzzy match is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    public static QueryFaceUserByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserByNameRequest self = new QueryFaceUserByNameRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserByNameRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceUserByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryFaceUserByNameRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryFaceUserByNameRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaceUserByNameRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
