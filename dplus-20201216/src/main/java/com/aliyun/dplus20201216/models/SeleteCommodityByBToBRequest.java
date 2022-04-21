// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class SeleteCommodityByBToBRequest extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("Query")
    public String query;

    @NameInMap("Start")
    public Integer start;

    public static SeleteCommodityByBToBRequest build(java.util.Map<String, ?> map) throws Exception {
        SeleteCommodityByBToBRequest self = new SeleteCommodityByBToBRequest();
        return TeaModel.build(map, self);
    }

    public SeleteCommodityByBToBRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public SeleteCommodityByBToBRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SeleteCommodityByBToBRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SeleteCommodityByBToBRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
