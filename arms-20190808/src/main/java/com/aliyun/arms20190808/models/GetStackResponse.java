// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackInfo")
    @Validation(required = true)
    public java.util.List<GetStackResponseStackInfo> stackInfo;

    public static GetStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponse self = new GetStackResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStackResponseStackInfoExtInfo extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Info")
        @Validation(required = true)
        public String info;

        public static GetStackResponseStackInfoExtInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseStackInfoExtInfo self = new GetStackResponseStackInfoExtInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class GetStackResponseStackInfo extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("RpcId")
        @Validation(required = true)
        public String rpcId;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("Api")
        @Validation(required = true)
        public String api;

        @NameInMap("Exception")
        @Validation(required = true)
        public String exception;

        @NameInMap("Line")
        @Validation(required = true)
        public String line;

        @NameInMap("ExtInfo")
        @Validation(required = true)
        public java.util.List<GetStackResponseStackInfoExtInfo> extInfo;

        public static GetStackResponseStackInfo build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseStackInfo self = new GetStackResponseStackInfo();
            return TeaModel.build(map, self);
        }

    }

}
