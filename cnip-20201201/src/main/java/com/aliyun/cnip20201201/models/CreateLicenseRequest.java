// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateLicenseRequest extends TeaModel {
    // expire time
    @NameInMap("effectiveYear")
    public Long effectiveYear;

    public static CreateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLicenseRequest self = new CreateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLicenseRequest setEffectiveYear(Long effectiveYear) {
        this.effectiveYear = effectiveYear;
        return this;
    }
    public Long getEffectiveYear() {
        return this.effectiveYear;
    }

}
