// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeL4EventsSelectiveRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("EsnAppId")
    public String esnAppId;

    @NameInMap("EsnBizId")
    public String esnBizId;

    @NameInMap("GroupId")
    public String groupId;

    public static DescribeL4EventsSelectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeL4EventsSelectiveRequest self = new DescribeL4EventsSelectiveRequest();
        return TeaModel.build(map, self);
    }

    public DescribeL4EventsSelectiveRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeL4EventsSelectiveRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeL4EventsSelectiveRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeL4EventsSelectiveRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeL4EventsSelectiveRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeL4EventsSelectiveRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeL4EventsSelectiveRequest setEsnAppId(String esnAppId) {
        this.esnAppId = esnAppId;
        return this;
    }
    public String getEsnAppId() {
        return this.esnAppId;
    }

    public DescribeL4EventsSelectiveRequest setEsnBizId(String esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public String getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeL4EventsSelectiveRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
