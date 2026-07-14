// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ValidateEmailRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the graylist. Default value: false. The result is asynchronously notified through EventBridge.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckGraylist")
    public Boolean checkGraylist;

    /**
     * <p>The email address to validate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@yyy.com">xxx@yyy.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The probe type. Valid values:</p>
     * <ul>
     * <li>FULL: Enables all detection capabilities, including SMTP probing. Because SMTP probing involves remote connections, the overall latency is high. This value is suitable for scenarios that are not sensitive to response time. Each detection consumes 1 address validation quota.</li>
     * <li>BASIC_ONLY: Enables all detection capabilities except SMTP probing, with low latency. This value is suitable for scenarios that are sensitive to response time, such as real-time validation during registration to check whether an email address is a disposable mailbox or an MX-forwarded abnormal address, to prevent batch registration by the cyber underground economy chain. Each detection consumes 1/3 of an address validation quota.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("ProbeType")
    public String probeType;

    /**
     * <p>The timeout period. Default value: 60 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static ValidateEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateEmailRequest self = new ValidateEmailRequest();
        return TeaModel.build(map, self);
    }

    public ValidateEmailRequest setCheckGraylist(Boolean checkGraylist) {
        this.checkGraylist = checkGraylist;
        return this;
    }
    public Boolean getCheckGraylist() {
        return this.checkGraylist;
    }

    public ValidateEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ValidateEmailRequest setProbeType(String probeType) {
        this.probeType = probeType;
        return this;
    }
    public String getProbeType() {
        return this.probeType;
    }

    public ValidateEmailRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
