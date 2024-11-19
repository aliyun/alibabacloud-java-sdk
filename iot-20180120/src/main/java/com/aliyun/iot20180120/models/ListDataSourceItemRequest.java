// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDataSourceItemRequest extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/432676.html">ListParserDataSource</a> operation to obtain the IDs of all data sources of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-0pp1n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>thing</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    public static ListDataSourceItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceItemRequest self = new ListDataSourceItemRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceItemRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public ListDataSourceItemRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListDataSourceItemRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDataSourceItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceItemRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

}
