// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveSnapshotNotifyConfigResponseBody extends TeaModel {
    /**
     * <p>The main streaming domain.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.yourdomain***.com">www.yourdomain***.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The callback authentication key.</p>
     * 
     * <strong>example:</strong>
     * <p>yourkey</p>
     */
    @NameInMap("NotifyAuthKey")
    public String notifyAuthKey;

    /**
     * <p>Indicates whether callback authentication is enabled. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: Callback authentication is enabled.</li>
     * <li><strong>no</strong>: Callback authentication is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("NotifyReqAuth")
    public String notifyReqAuth;

    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://callback.yourdomain***.com">http://callback.yourdomain***.com</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5056369B-D337-499E-B8B7-B761BD37B08A</p>
     */
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
