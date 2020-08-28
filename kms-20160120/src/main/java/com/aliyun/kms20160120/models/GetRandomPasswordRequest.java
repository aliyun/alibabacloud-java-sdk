// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordRequest extends TeaModel {
    @NameInMap("PasswordLength")
    public String passwordLength;

    @NameInMap("ExcludeCharacters")
    public String excludeCharacters;

    @NameInMap("ExcludeLowercase")
    public String excludeLowercase;

    @NameInMap("ExcludeUppercase")
    public String excludeUppercase;

    @NameInMap("ExcludeNumbers")
    public String excludeNumbers;

    @NameInMap("ExcludePunctuation")
    public String excludePunctuation;

    @NameInMap("RequireEachIncludedType")
    public String requireEachIncludedType;

    public static GetRandomPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordRequest self = new GetRandomPasswordRequest();
        return TeaModel.build(map, self);
    }

}
