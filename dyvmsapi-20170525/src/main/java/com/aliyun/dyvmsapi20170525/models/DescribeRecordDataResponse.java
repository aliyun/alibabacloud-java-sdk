// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class DescribeRecordDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("OssLink")
    @Validation(required = true)
    public String ossLink;

    @NameInMap("Acid")
    @Validation(required = true)
    public String acid;

    @NameInMap("AgentId")
    @Validation(required = true)
    public String agentId;

    public static DescribeRecordDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataResponse self = new DescribeRecordDataResponse();
        return TeaModel.build(map, self);
    }

}
