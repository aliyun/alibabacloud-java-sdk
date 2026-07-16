// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskEncryptionByDefaultStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether account-level default encryption is enabled for block storage.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Not enabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypted")
    public Boolean encrypted;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiskEncryptionByDefaultStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskEncryptionByDefaultStatusResponseBody self = new DescribeDiskEncryptionByDefaultStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiskEncryptionByDefaultStatusResponseBody setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public DescribeDiskEncryptionByDefaultStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
