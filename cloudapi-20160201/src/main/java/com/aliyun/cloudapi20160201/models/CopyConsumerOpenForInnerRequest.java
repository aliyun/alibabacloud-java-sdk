// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CopyConsumerOpenForInnerRequest extends TeaModel {
    @NameInMap("CopyList")
    public String copyList;

    public static CopyConsumerOpenForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyConsumerOpenForInnerRequest self = new CopyConsumerOpenForInnerRequest();
        return TeaModel.build(map, self);
    }

    public CopyConsumerOpenForInnerRequest setCopyList(String copyList) {
        this.copyList = copyList;
        return this;
    }
    public String getCopyList() {
        return this.copyList;
    }

}
