// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateAgAccountRequest extends TeaModel {
    @NameInMap("LoginEmail")
    @Validation(required = true)
    public String loginEmail;

    @NameInMap("AccountAttr")
    public String accountAttr;

    @NameInMap("EnterpriseName")
    public String enterpriseName;

    @NameInMap("FirstName")
    public String firstName;

    @NameInMap("LastName")
    public String lastName;

    @NameInMap("NationCode")
    public String nationCode;

    @NameInMap("ProvinceName")
    public String provinceName;

    @NameInMap("CityName")
    public String cityName;

    @NameInMap("Postcode")
    public String postcode;

    public static CreateAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgAccountRequest self = new CreateAgAccountRequest();
        return TeaModel.build(map, self);
    }

}
