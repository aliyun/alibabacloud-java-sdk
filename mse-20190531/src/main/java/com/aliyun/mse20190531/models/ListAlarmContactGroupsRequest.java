// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmContactGroupsRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAlarmContactGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmContactGroupsRequest self = new ListAlarmContactGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmContactGroupsRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public ListAlarmContactGroupsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAlarmContactGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
