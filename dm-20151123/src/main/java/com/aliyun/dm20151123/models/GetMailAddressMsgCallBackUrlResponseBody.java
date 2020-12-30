// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetMailAddressMsgCallBackUrlResponseBody extends TeaModel {
    @NameInMap("NotifyUrlStatus")
    public Integer notifyUrlStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NotifyUrl")
    public Integer notifyUrl;

    public static GetMailAddressMsgCallBackUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMailAddressMsgCallBackUrlResponseBody self = new GetMailAddressMsgCallBackUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMailAddressMsgCallBackUrlResponseBody setNotifyUrlStatus(Integer notifyUrlStatus) {
        this.notifyUrlStatus = notifyUrlStatus;
        return this;
    }
    public Integer getNotifyUrlStatus() {
        return this.notifyUrlStatus;
    }

    public GetMailAddressMsgCallBackUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMailAddressMsgCallBackUrlResponseBody setNotifyUrl(Integer notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public Integer getNotifyUrl() {
        return this.notifyUrl;
    }

}
