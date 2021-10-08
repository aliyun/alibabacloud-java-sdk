// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseResultRequest extends TeaModel {
    @NameInMap("CheckId")
    public String checkId;

    public static DescribeDiagnoseResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseResultRequest self = new DescribeDiagnoseResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseResultRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

}
