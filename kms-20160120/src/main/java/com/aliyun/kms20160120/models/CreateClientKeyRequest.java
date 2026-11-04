// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyRequest extends TeaModel {
    /**
     * <p>The name of the attached application access point (AAP).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aap_test</p>
     */
    @NameInMap("AapName")
    public String aapName;

    /**
     * <p>The end time of the validity period of the ClientKey.</p>
     * <p>The time is specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify NotAfter, the default value is the creation time of the ClientKey plus 5 years.</li>
     * <li>If you specify NotAfter, you must also specify NotBefore.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2028-08-31T17:14:33Z</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The start time of the validity period of the ClientKey.</p>
     * <p>The time is specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>If you do not specify NotBefore, the default value is the creation time of the ClientKey.</li>
     * <li>If you specify NotBefore, you must also specify NotAfter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-08-31T17:14:33Z</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The passphrase of the ClientKey.</p>
     * <p>The passphrase must be 8 to 64 characters in length and can contain digits, uppercase and lowercase letters, and special characters such as <code>~!@#$%^&amp;*?_-</code>. It must contain at least two of these character types.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bcfefe15-46f0****</p>
     */
    @NameInMap("Password")
    public String password;

    public static CreateClientKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientKeyRequest self = new CreateClientKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientKeyRequest setAapName(String aapName) {
        this.aapName = aapName;
        return this;
    }
    public String getAapName() {
        return this.aapName;
    }

    public CreateClientKeyRequest setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public CreateClientKeyRequest setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public CreateClientKeyRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
