// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateAtiRegistrantRequest extends TeaModel {
    /**
     * <p>The country or region of the registrant. Specify a 2-character country or region code in compliance with GB/T 2659.1-2022.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("Cc")
    public String cc;

    /**
     * <p>The city of the registrant. The value cannot exceed 255 characters in length. If the country is China, the value must comply with GB/T 2260-2007.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The document number of the registrant. The value cannot exceed 50 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110123456789122341</p>
     */
    @NameInMap("DocumentCode")
    public String documentCode;

    /**
     * <p>The document image of the registrant in Base64 encoding. The original file size must be between 50 KB and 3 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>证件图片</p>
     */
    @NameInMap("DocumentImage")
    public String documentImage;

    /**
     * <p>The document type of the registrant.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>SFZ</td>
     * <td>ID card</td>
     * </tr>
     * <tr>
     * <td>HZ</td>
     * <td>Passport</td>
     * </tr>
     * <tr>
     * <td>ORG</td>
     * <td>Organization code certificate</td>
     * </tr>
     * <tr>
     * <td>YYZZ</td>
     * <td>Business license</td>
     * </tr>
     * <tr>
     * <td>BDDM</td>
     * <td>Military unit code</td>
     * </tr>
     * <tr>
     * <td>CHNSHXYD</td>
     * <td>Unified Social Credit Code certificate of the People\&quot;s Republic of China</td>
     * </tr>
     * <tr>
     * <td>GAJMTX</td>
     * <td>Mainland Travel Permit for Hong Kong and Macao Residents</td>
     * </tr>
     * <tr>
     * <td>GAJZZ</td>
     * <td>Residence Permit for Hong Kong and Macao Residents</td>
     * </tr>
     * <tr>
     * <td>GATLYCZD</td>
     * <td>Registration certificate for permanent representative offices of tourism departments in Hong Kong, Macao, and Taiwan</td>
     * </tr>
     * <tr>
     * <td>GAXWZNDJ</td>
     * <td>Registration certificate for permanent mainland journalist stations of Hong Kong and Macao news agencies</td>
     * </tr>
     * <tr>
     * <td>GZJGZY</td>
     * <td>Notary office practice certificate</td>
     * </tr>
     * <tr>
     * <td>JDDWFW</td>
     * <td>Military unit paid service license</td>
     * </tr>
     * <tr>
     * <td>JGZ</td>
     * <td>Military officer certificate</td>
     * </tr>
     * <tr>
     * <td>JJHFR</td>
     * <td>Foundation legal person registration certificate</td>
     * </tr>
     * <tr>
     * <td>LSZY</td>
     * <td>Law firm practice license</td>
     * </tr>
     * <tr>
     * <td>MBFQY</td>
     * <td>Private non-enterprise unit registration certificate</td>
     * </tr>
     * <tr>
     * <td>MBXXBX</td>
     * <td>Private school operating license</td>
     * </tr>
     * <tr>
     * <td>NCJTJJZZ</td>
     * <td>Rural collective economic organization registration certificate</td>
     * </tr>
     * <tr>
     * <td>QTTYDM</td>
     * <td>Other - Unified Social Credit Code</td>
     * </tr>
     * <tr>
     * <td>SFJD</td>
     * <td>Judicial appraisal license</td>
     * </tr>
     * <tr>
     * <td>SHTTFR</td>
     * <td>Social organization legal person registration certificate</td>
     * </tr>
     * <tr>
     * <td>SHFWJG</td>
     * <td>Social service institution registration certificate</td>
     * </tr>
     * <tr>
     * <td>SYDWFR</td>
     * <td>Public institution legal person certificate</td>
     * </tr>
     * <tr>
     * <td>TYDM</td>
     * <td>Unified Social Credit Code certificate</td>
     * </tr>
     * <tr>
     * <td>YLJGZY</td>
     * <td>Medical institution practice license</td>
     * </tr>
     * <tr>
     * <td>ZCWYHDJZ</td>
     * <td>Arbitration commission registration certificate</td>
     * </tr>
     * <tr>
     * <td>ZJCS</td>
     * <td>Religious activity venue registration certificate</td>
     * </tr>
     * <tr>
     * <td>BJWSXX</td>
     * <td>Beijing operating license for schools for children of foreign embassy staff</td>
     * </tr>
     * <tr>
     * <td>JWJG</td>
     * <td>Overseas institution certificate</td>
     * </tr>
     * <tr>
     * <td>JWFZFDBJ</td>
     * <td>Overseas non-governmental organization representative office registration certificate</td>
     * </tr>
     * <tr>
     * <td>WGCZJG</td>
     * <td>Foreign enterprise permanent representative office registration certificate</td>
     * </tr>
     * <tr>
     * <td>WGZHWH</td>
     * <td>Foreign cultural center registration certificate in China</td>
     * </tr>
     * <tr>
     * <td>WGZHXWJG</td>
     * <td>Foreign news agency certificate in China</td>
     * </tr>
     * <tr>
     * <td>WJLSFZ</td>
     * <td>Foreigner permanent residence ID card</td>
     * </tr>
     * <tr>
     * <td>WLCZJG</td>
     * <td>Approval registration certificate for permanent representative offices of foreign government tourism departments</td>
     * </tr>
     * <tr>
     * <td>QT</td>
     * <td>Other</td>
     * </tr>
     * </tbody></table>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("DocumentType")
    public String documentType;

    /**
     * <p>The email address. The value cannot exceed 300 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The name of the registrant. The value cannot exceed 255 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phone number of the registrant. The value cannot exceed 128 characters in length. If the country is China and the number is not a mobile phone number, the area code must match the city.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13112345678</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The province of the registrant. The value cannot exceed 255 characters in length. If the country is China, the value must comply with GB/T 2260-2007.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The address of the registrant. The value cannot exceed 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>xx区xx街道</p>
     */
    @NameInMap("Street")
    public String street;

    public static CreateAtiRegistrantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAtiRegistrantRequest self = new CreateAtiRegistrantRequest();
        return TeaModel.build(map, self);
    }

    public CreateAtiRegistrantRequest setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public CreateAtiRegistrantRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateAtiRegistrantRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAtiRegistrantRequest setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
        return this;
    }
    public String getDocumentCode() {
        return this.documentCode;
    }

    public CreateAtiRegistrantRequest setDocumentImage(String documentImage) {
        this.documentImage = documentImage;
        return this;
    }
    public String getDocumentImage() {
        return this.documentImage;
    }

    public CreateAtiRegistrantRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public CreateAtiRegistrantRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateAtiRegistrantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAtiRegistrantRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateAtiRegistrantRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateAtiRegistrantRequest setStreet(String street) {
        this.street = street;
        return this;
    }
    public String getStreet() {
        return this.street;
    }

}
