// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DescribePolicyRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    @NameInMap("BizType")
    public String bizType;

    public static DescribePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyRequest self = new DescribePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DescribePolicyRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
