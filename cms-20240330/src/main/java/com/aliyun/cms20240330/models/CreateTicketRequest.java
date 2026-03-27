// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <ul>
     * <li>Access token expiration time (in seconds), which is the expiration time for the user to access the page interface. The default value is 86400 seconds (one day), and the range of values is from 0 to 86400 seconds (one day).</li>
     * <li>The access token expiration time is the minimum value between <code>accessTokenExpirationTime</code> and <code>expirationTime</code>.</li>
     * <li>If called through STS, the access token expiration time (i.e., the time during which the user can access the page interface) is the minimum value among <code>accessTokenExpirationTime</code>, <code>expirationTime</code>, and the STS expiration time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("accessTokenExpirationTime")
    public Long accessTokenExpirationTime;

    /**
     * <ul>
     * <li>Expiration time (in seconds), which is the expiration time for the embedded page URL. The default value is 86400 seconds (one day), and the range of values is from 0 to 2592000 seconds (30 days).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setAccessTokenExpirationTime(Long accessTokenExpirationTime) {
        this.accessTokenExpirationTime = accessTokenExpirationTime;
        return this;
    }
    public Long getAccessTokenExpirationTime() {
        return this.accessTokenExpirationTime;
    }

    public CreateTicketRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

}
