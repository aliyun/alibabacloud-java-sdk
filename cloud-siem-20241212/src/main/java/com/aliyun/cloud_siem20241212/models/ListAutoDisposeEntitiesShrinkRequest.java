// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListAutoDisposeEntitiesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of automated disposal records.</p>
     */
    @NameInMap("AutoDisposeRecordIds")
    public String autoDisposeRecordIdsShrink;

    /**
     * <p>The page number. The value must be 1 or greater.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. You can obtain this token from the response to a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The unique identifier of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>b2491e39-ddf2-478a-8c07-*****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListAutoDisposeEntitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoDisposeEntitiesShrinkRequest self = new ListAutoDisposeEntitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoDisposeEntitiesShrinkRequest setAutoDisposeRecordIdsShrink(String autoDisposeRecordIdsShrink) {
        this.autoDisposeRecordIdsShrink = autoDisposeRecordIdsShrink;
        return this;
    }
    public String getAutoDisposeRecordIdsShrink() {
        return this.autoDisposeRecordIdsShrink;
    }

    public ListAutoDisposeEntitiesShrinkRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListAutoDisposeEntitiesShrinkRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListAutoDisposeEntitiesShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAutoDisposeEntitiesShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoDisposeEntitiesShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoDisposeEntitiesShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAutoDisposeEntitiesShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
