// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class UpdateBizChainRequest extends TeaModel {
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static UpdateBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizChainRequest self = new UpdateBizChainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizChainRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UpdateBizChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBizChainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
