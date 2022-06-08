// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordRequest extends TeaModel {
    @NameInMap("ExcludeCharacters")
    public String excludeCharacters;

    @NameInMap("ExcludeLowercase")
    public String excludeLowercase;

    @NameInMap("ExcludeNumbers")
    public String excludeNumbers;

    @NameInMap("ExcludePunctuation")
    public String excludePunctuation;

    @NameInMap("ExcludeUppercase")
    public String excludeUppercase;

    @NameInMap("PasswordLength")
    public String passwordLength;

    @NameInMap("RequireEachIncludedType")
    public String requireEachIncludedType;

    public static GetRandomPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordRequest self = new GetRandomPasswordRequest();
        return TeaModel.build(map, self);
    }

    public GetRandomPasswordRequest setExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
        return this;
    }
    public String getExcludeCharacters() {
        return this.excludeCharacters;
    }

    public GetRandomPasswordRequest setExcludeLowercase(String excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
        return this;
    }
    public String getExcludeLowercase() {
        return this.excludeLowercase;
    }

    public GetRandomPasswordRequest setExcludeNumbers(String excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
        return this;
    }
    public String getExcludeNumbers() {
        return this.excludeNumbers;
    }

    public GetRandomPasswordRequest setExcludePunctuation(String excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
        return this;
    }
    public String getExcludePunctuation() {
        return this.excludePunctuation;
    }

    public GetRandomPasswordRequest setExcludeUppercase(String excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
        return this;
    }
    public String getExcludeUppercase() {
        return this.excludeUppercase;
    }

    public GetRandomPasswordRequest setPasswordLength(String passwordLength) {
        this.passwordLength = passwordLength;
        return this;
    }
    public String getPasswordLength() {
        return this.passwordLength;
    }

    public GetRandomPasswordRequest setRequireEachIncludedType(String requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
        return this;
    }
    public String getRequireEachIncludedType() {
        return this.requireEachIncludedType;
    }

}
