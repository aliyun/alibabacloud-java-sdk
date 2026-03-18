// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourcesRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. If you leave this parameter empty, all data sources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. If you leave this parameter empty, all data sources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The type of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>BIGQUERY</p>
     */
    @NameInMap("type")
    public String type;

    public static ListMmsDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDataSourcesRequest self = new ListMmsDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsDataSourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsDataSourcesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsDataSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsDataSourcesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListMmsDataSourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
