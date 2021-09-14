// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenResponseBody extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("Share")
    public String share;

    public static CreateScreenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenResponseBody self = new CreateScreenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScreenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateScreenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScreenResponseBody setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public CreateScreenResponseBody setShare(String share) {
        this.share = share;
        return this;
    }
    public String getShare() {
        return this.share;
    }

}
