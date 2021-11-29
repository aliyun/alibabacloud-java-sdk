// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupDetailResponseBody extends TeaModel {
    @NameInMap("BizName")
    public String bizName;

    @NameInMap("ConfigGroupId")
    public String configGroupId;

    @NameInMap("ConfigGroupName")
    public String configGroupName;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static DescribeConfigGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupDetailResponseBody self = new DescribeConfigGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupDetailResponseBody setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public DescribeConfigGroupDetailResponseBody setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeConfigGroupDetailResponseBody setConfigGroupName(String configGroupName) {
        this.configGroupName = configGroupName;
        return this;
    }
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    public DescribeConfigGroupDetailResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeConfigGroupDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeConfigGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigGroupDetailResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
