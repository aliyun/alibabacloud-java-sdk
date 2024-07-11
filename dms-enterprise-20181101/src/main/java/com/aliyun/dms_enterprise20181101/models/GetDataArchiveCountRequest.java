// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveCountRequest extends TeaModel {
    /**
     * <p>The type of the identity. Default value: AS_ADMIN.</p>
     * 
     * <strong>example:</strong>
     * <p>AS_ADMIN</p>
     */
    @NameInMap("OrderResultType")
    public String orderResultType;

    /**
     * <p>The plugin type. Default value: DATA_ARCHIVE.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_ARCHIVE</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The time when the ticket is modified or created. The statistics of data archiving tickets are calculated based on the creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_TIME</p>
     */
    @NameInMap("SearchDateType")
    public String searchDateType;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataArchiveCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveCountRequest self = new GetDataArchiveCountRequest();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveCountRequest setOrderResultType(String orderResultType) {
        this.orderResultType = orderResultType;
        return this;
    }
    public String getOrderResultType() {
        return this.orderResultType;
    }

    public GetDataArchiveCountRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public GetDataArchiveCountRequest setSearchDateType(String searchDateType) {
        this.searchDateType = searchDateType;
        return this;
    }
    public String getSearchDateType() {
        return this.searchDateType;
    }

    public GetDataArchiveCountRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
