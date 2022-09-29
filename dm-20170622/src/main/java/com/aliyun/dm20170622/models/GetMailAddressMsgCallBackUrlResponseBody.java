// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetMailAddressMsgCallBackUrlResponseBody extends TeaModel {
    @NameInMap("NotifyUrl")
    public Integer notifyUrl;

    @NameInMap("NotifyUrlStatus")
    public Integer notifyUrlStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMailAddressMsgCallBackUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMailAddressMsgCallBackUrlResponseBody self = new GetMailAddressMsgCallBackUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMailAddressMsgCallBackUrlResponseBody setNotifyUrl(Integer notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public Integer getNotifyUrl() {
        return this.notifyUrl;
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

}
