// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class SeleteCommodityRequest extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("Query")
    public String query;

    @NameInMap("Start")
    public Integer start;

    public static SeleteCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        SeleteCommodityRequest self = new SeleteCommodityRequest();
        return TeaModel.build(map, self);
    }

    public SeleteCommodityRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SeleteCommodityRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SeleteCommodityRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SeleteCommodityRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
