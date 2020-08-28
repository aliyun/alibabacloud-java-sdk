// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("DsRecord")
    @Validation(required = true)
    public String dsRecord;

    @NameInMap("Digest")
    @Validation(required = true)
    public String digest;

    @NameInMap("DigestType")
    @Validation(required = true)
    public String digestType;

    @NameInMap("Algorithm")
    @Validation(required = true)
    public String algorithm;

    @NameInMap("PublicKey")
    @Validation(required = true)
    public String publicKey;

    @NameInMap("KeyTag")
    @Validation(required = true)
    public String keyTag;

    @NameInMap("Flags")
    @Validation(required = true)
    public String flags;

    public static DescribeDomainDnssecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoResponse self = new DescribeDomainDnssecInfoResponse();
        return TeaModel.build(map, self);
    }

}
