// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public String expireTime;

    @NameInMap("ExpireTimestamp")
    @Validation(required = true)
    public Long expireTimestamp;

    @NameInMap("Cname")
    @Validation(required = true)
    public String cname;

    @NameInMap("UserDomainName")
    @Validation(required = true)
    public String userDomainName;

    @NameInMap("Ttl")
    @Validation(required = true)
    public Integer ttl;

    @NameInMap("LbaStrategy")
    @Validation(required = true)
    public String lbaStrategy;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("AlertGroup")
    @Validation(required = true)
    public String alertGroup;

    @NameInMap("CnameMode")
    @Validation(required = true)
    public String cnameMode;

    @NameInMap("AccessStrategyNum")
    @Validation(required = true)
    public Integer accessStrategyNum;

    @NameInMap("AddressPoolNum")
    @Validation(required = true)
    public Integer addressPoolNum;

    public static DescribeGtmInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceResponse self = new DescribeGtmInstanceResponse();
        return TeaModel.build(map, self);
    }

}
