// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("CommandName")
    public String commandName;

    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("Timed")
    public Boolean timed;

    @NameInMap("InvokeStatus")
    public String invokeStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsRequest self = new DescribeInvocationsRequest();
        return TeaModel.build(map, self);
    }

}
