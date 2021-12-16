// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigGroupDetailResponseBody extends TeaModel {
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

    public static DescribeDcdnConfigGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigGroupDetailResponseBody self = new DescribeDcdnConfigGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigGroupDetailResponseBody setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setConfigGroupName(String configGroupName) {
        this.configGroupName = configGroupName;
        return this;
    }
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnConfigGroupDetailResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
