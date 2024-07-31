// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMetaDBRequest extends TeaModel {
    /**
     * <p>The ID of the E-MapReduce (EMR) cluster. You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Set the value to emr.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListMetaDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDBRequest self = new ListMetaDBRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaDBRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListMetaDBRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListMetaDBRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMetaDBRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaDBRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
