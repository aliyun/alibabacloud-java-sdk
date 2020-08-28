// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsRequest self = new DescribeInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

}
