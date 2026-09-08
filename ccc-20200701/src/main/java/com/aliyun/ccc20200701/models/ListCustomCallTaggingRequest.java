// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCustomCallTaggingRequest extends TeaModel {
    /**
     * <p>Filter by a list of number tag names. This parameter is optional and defaults to empty, which means no filtering is applied. The format is a JSON array string, where each array element is a number tag name.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TagA&quot;]</p>
     */
    @NameInMap("CallTagNameList")
    public String callTagNameList;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Perform fuzzy matching based on number or description. This parameter is optional and defaults to empty. An empty value indicates no filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>1312121****</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListCustomCallTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomCallTaggingRequest self = new ListCustomCallTaggingRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomCallTaggingRequest setCallTagNameList(String callTagNameList) {
        this.callTagNameList = callTagNameList;
        return this;
    }
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    public ListCustomCallTaggingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCustomCallTaggingRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomCallTaggingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomCallTaggingRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
