// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordRequest extends TeaModel {
    /**
     * <p>The characters that are not included in the password to be generated.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>` Valid characters: 0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ! \\"#$%&\\"()*+,-. /:;<=>? @[\\] your_project_id} ~  `.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("ExcludeCharacters")
    public String excludeCharacters;

    /**
     * <p>Specifies whether to exclude lowercase letters.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ExcludeLowercase")
    public String excludeLowercase;

    /**
     * <p>Specifies whether to exclude digits.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ExcludeNumbers")
    public String excludeNumbers;

    /**
     * <p>Specifies whether to exclude special characters.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ExcludePunctuation")
    public String excludePunctuation;

    /**
     * <p>Specifies whether to exclude uppercase letters.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("ExcludeUppercase")
    public String excludeUppercase;

    /**
     * <p>The number of bytes that the password to be generated contains.</p>
     * <br>
     * <p>Valid values: 8 to 128.</p>
     * <br>
     * <p>Default value: 32</p>
     */
    @NameInMap("PasswordLength")
    public String passwordLength;

    /**
     * <p>Specifies whether to include all the preceding character types.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
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
