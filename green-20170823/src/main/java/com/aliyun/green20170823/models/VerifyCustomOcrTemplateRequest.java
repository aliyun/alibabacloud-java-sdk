// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class VerifyCustomOcrTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("TestImgUrl")
    public String testImgUrl;

    public static VerifyCustomOcrTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCustomOcrTemplateRequest self = new VerifyCustomOcrTemplateRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCustomOcrTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public VerifyCustomOcrTemplateRequest setTestImgUrl(String testImgUrl) {
        this.testImgUrl = testImgUrl;
        return this;
    }
    public String getTestImgUrl() {
        return this.testImgUrl;
    }

}
