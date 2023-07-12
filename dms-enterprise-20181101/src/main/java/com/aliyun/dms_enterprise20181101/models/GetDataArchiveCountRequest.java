// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveCountRequest extends TeaModel {
    @NameInMap("OrderResultType")
    public String orderResultType;

    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("SearchDateType")
    public String searchDateType;

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
