// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveSnapshotNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSnapshotNotifyConfigResponseBody self = new DescribeLiveSnapshotNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSnapshotNotifyConfigResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveSnapshotNotifyConfigResponseBody setNotifyAuthKey(String notifyAuthKey) {
        this.notifyAuthKey = notifyAuthKey;
        return this;
    }
    public String getNotifyAuthKey() {
        return this.notifyAuthKey;
    }

    public DescribeLiveSnapshotNotifyConfigResponseBody setNotifyReqAuth(String notifyReqAuth) {
        this.notifyReqAuth = notifyReqAuth;
        return this;
    }
    public String getNotifyReqAuth() {
        return this.notifyReqAuth;
    }

    public DescribeLiveSnapshotNotifyConfigResponseBody setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public DescribeLiveSnapshotNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
