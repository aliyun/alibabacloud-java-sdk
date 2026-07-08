// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class HistoryThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>The authorization code. You can obtain it from the following sources:</p>
     * <ul>
     * <li><p>On the <a href="https://dytns.console.aliyun.com/analysis/square">Tag Plaza</a> page in the Phone Number Intelligence console, select the <strong>three-element ID verification</strong> tag and submit an application. You will receive an authorization code after the application is approved.</p>
     * </li>
     * <li><p>On the <a href="https://dytns.console.aliyun.com/analysis/apply">My Applications</a> page in the Phone Number Intelligence console, find the authorization ID for your approved <strong>three-element ID verification</strong> service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The carrier to query. By default, the system queries the number\&quot;s carrier of record. Specify this parameter to route the query to a specific carrier.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>CMCC</code>: China Mobile</p>
     * </li>
     * <li><p><code>CUCC</code>: China Unicom</p>
     * </li>
     * <li><p><code>CTCC</code>: China Telecom</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Due to number portability, a ported number\&quot;s historical carrier may be unknown. Use this parameter to explicitly query a specific carrier. If omitted, the query defaults to the number\&quot;s current carrier of record.</p>
     * <p><strong>Important</strong> Specifying China Broadcasting Network is not supported and results in an HTTP 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CMCC</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The ID number to verify.</p>
     * <ul>
     * <li>If <code>Mask</code> is set to <code>NORMAL</code>, the value of this parameter is in plaintext.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>The phone number to query.</p>
     * <ul>
     * <li>If <code>Mask</code> is set to <code>NORMAL</code>, this parameter must be an 11-digit mobile phone number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method. Valid value:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The phone number is not encrypted.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The name to verify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The historical point in time to verify, in <code>yyyyMMddHHmmss</code> format. If the specific time of day is unknown, set the <code>HHmmss</code> portion to <code>000000</code>. For example, <code>20230615000000</code> verifies ownership as of June 15, 2023.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("VerificationTime")
    public String verificationTime;

    public static HistoryThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        HistoryThreeElementsVerificationRequest self = new HistoryThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public HistoryThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public HistoryThreeElementsVerificationRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public HistoryThreeElementsVerificationRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public HistoryThreeElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public HistoryThreeElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public HistoryThreeElementsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HistoryThreeElementsVerificationRequest setVerificationTime(String verificationTime) {
        this.verificationTime = verificationTime;
        return this;
    }
    public String getVerificationTime() {
        return this.verificationTime;
    }

}
