// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ChangeDomainDkimRecordResponseBody extends TeaModel {
    @NameInMap("Changed")
    public Boolean changed;

    @NameInMap("DkimPublicKey")
    public String dkimPublicKey;

    @NameInMap("DkimRsaLength")
    public Integer dkimRsaLength;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("RequestId")
    public String requestId;

    public static ChangeDomainDkimRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDomainDkimRecordResponseBody self = new ChangeDomainDkimRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDomainDkimRecordResponseBody setChanged(Boolean changed) {
        this.changed = changed;
        return this;
    }
    public Boolean getChanged() {
        return this.changed;
    }

    public ChangeDomainDkimRecordResponseBody setDkimPublicKey(String dkimPublicKey) {
        this.dkimPublicKey = dkimPublicKey;
        return this;
    }
    public String getDkimPublicKey() {
        return this.dkimPublicKey;
    }

    public ChangeDomainDkimRecordResponseBody setDkimRsaLength(Integer dkimRsaLength) {
        this.dkimRsaLength = dkimRsaLength;
        return this;
    }
    public Integer getDkimRsaLength() {
        return this.dkimRsaLength;
    }

    public ChangeDomainDkimRecordResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ChangeDomainDkimRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
