// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRetcodeShareUrlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01FF8DD9-A09C-47A1-895A-B6E321******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The logon-free URL of the application.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://arms-daily.console.aliyun.com:8080/shareapi/retcode.json?login_arms_t3h_token=XXXxxx&action=RetcodeAction&eventSubmitDoGetData=1">http://arms-daily.console.aliyun.com:8080/shareapi/retcode.json?login_arms_t3h_token=XXXxxx&amp;action=RetcodeAction&amp;eventSubmitDoGetData=1</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetRetcodeShareUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRetcodeShareUrlResponseBody self = new GetRetcodeShareUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRetcodeShareUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRetcodeShareUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
