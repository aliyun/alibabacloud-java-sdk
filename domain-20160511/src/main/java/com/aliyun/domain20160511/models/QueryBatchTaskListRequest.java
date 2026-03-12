// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryBatchTaskListRequest extends TeaModel {
    @NameInMap("BeginCreateTime")
    public String beginCreateTime;

    @NameInMap("EndCreateTime")
    public String endCreateTime;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryBatchTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchTaskListRequest self = new QueryBatchTaskListRequest();
        return TeaModel.build(map, self);
    }

    public QueryBatchTaskListRequest setBeginCreateTime(String beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
        return this;
    }
    public String getBeginCreateTime() {
        return this.beginCreateTime;
    }

    public QueryBatchTaskListRequest setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }
    public String getEndCreateTime() {
        return this.endCreateTime;
    }

    public QueryBatchTaskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryBatchTaskListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryBatchTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBatchTaskListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
