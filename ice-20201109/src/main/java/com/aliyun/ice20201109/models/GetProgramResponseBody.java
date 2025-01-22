// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetProgramResponseBody extends TeaModel {
    @NameInMap("Program")
    public ChannelAssemblyProgram program;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProgramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProgramResponseBody self = new GetProgramResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProgramResponseBody setProgram(ChannelAssemblyProgram program) {
        this.program = program;
        return this;
    }
    public ChannelAssemblyProgram getProgram() {
        return this.program;
    }

    public GetProgramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
