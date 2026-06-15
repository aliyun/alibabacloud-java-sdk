// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ValidateEmailRequest extends TeaModel {
    /**
     * <p>Specifies whether to check the graylist. The default value is false. The result is sent through an asynchronous notification message from EventBridge.</p>
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
     * <p>The timeout period. The default value is 60 seconds.</p>
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

    public ValidateEmailRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
