// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeTaskBriefInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("Lang")
    public String lang;

    public static DescribeTaskBriefInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskBriefInfoRequest self = new DescribeTaskBriefInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTaskBriefInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTaskBriefInfoRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public DescribeTaskBriefInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
