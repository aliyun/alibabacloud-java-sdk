// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateAtiRegistrantRequest extends TeaModel {
    /**
     * <p>The country.</p>
     * 
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>The city.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The document number of the registrant. Maximum length: 50 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>11011239900307663x</p>
     */
    @NameInMap("DocumentCode")
    public String documentCode;

    /**
     * <p>The document image of the registrant (Base64-encoded). The original file size must be between 50 KB and 3 MB.</p>
     * 
     * <strong>example:</strong>
     * <p>证件图片</p>
     */
    @NameInMap("DocumentImage")
    public String documentImage;

    /**
     * <p>The document type of the registrant. For more information, see the appendix on document types.</p>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("DocumentType")
    public String documentType;

    /**
     * <p>The email address. Maximum length: 300 characters.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The name of the registrant. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>张xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phone number of the registrant. Maximum length: 128 characters. If the country is China, the area code of a non-mobile phone number must match the city.</p>
     * 
     * <strong>example:</strong>
     * <p>13112345678</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The ID of the registrant profile.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    /**
     * <p>The state or province.</p>
     * 
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The street.</p>
     * 
     * <strong>example:</strong>
     * <p>xx区xx街道</p>
     */
    @NameInMap("Street")
    public String street;

    public static UpdateAtiRegistrantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAtiRegistrantRequest self = new UpdateAtiRegistrantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAtiRegistrantRequest setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public UpdateAtiRegistrantRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdateAtiRegistrantRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAtiRegistrantRequest setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
        return this;
    }
    public String getDocumentCode() {
        return this.documentCode;
    }

    public UpdateAtiRegistrantRequest setDocumentImage(String documentImage) {
        this.documentImage = documentImage;
        return this;
    }
    public String getDocumentImage() {
        return this.documentImage;
    }

    public UpdateAtiRegistrantRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public UpdateAtiRegistrantRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateAtiRegistrantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAtiRegistrantRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateAtiRegistrantRequest setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

    public UpdateAtiRegistrantRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateAtiRegistrantRequest setStreet(String street) {
        this.street = street;
        return this;
    }
    public String getStreet() {
        return this.street;
    }

}
