// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsSignResponseBody extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("SignName")
    public String signName;

    public static DescribeSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsSignResponseBody self = new DescribeSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmsSignResponseBody setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeSmsSignResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmsSignResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeSmsSignResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeSmsSignResponseBody setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
