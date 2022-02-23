// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateIntlAliyunAccountRequest extends TeaModel {
    @NameInMap("NationalityCode")
    public String nationalityCode;

    public static CreateIntlAliyunAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntlAliyunAccountRequest self = new CreateIntlAliyunAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntlAliyunAccountRequest setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
        return this;
    }
    public String getNationalityCode() {
        return this.nationalityCode;
    }

}
