// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to <strong>CreateClientKey</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aap_test</p>
     */
    @NameInMap("AapName")
    public String aapName;

    /**
     * <p>The encryption password of the client key.</p>
     * <p>The password must be 8 to 64 characters in length and must contain at least two of the following types: digits, letters, and special characters. Special characters include <code>~ ! @ # $ % ^ &amp; * ? _ -</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2028-08-31T17:14:33Z</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The end of the validity period of the client key.</p>
     * <p>Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If you do not configure NotAfter, the default value is the time when the client key was created plus five years.</li>
     * <li>If you configure NotAfter, you must configure NotBefore.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2023-08-31T17:14:33Z</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The name of the AAP.</p>
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
